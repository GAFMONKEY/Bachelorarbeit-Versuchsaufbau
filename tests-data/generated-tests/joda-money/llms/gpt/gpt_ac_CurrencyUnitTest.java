package org.joda.money;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Currency;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class gpt_ac_CurrencyUnitTest {

    @FunctionalInterface
    private interface ThrowingRunnable {
        void run() throws Exception;
    }

    private static <T extends Throwable> T assertThrows(Class<T> expected, ThrowingRunnable r) {
        try {
            r.run();
        } catch (Throwable ex) {
            if (expected.isInstance(ex)) {
                return expected.cast(ex);
            }
            throw new AssertionError("Expected exception " + expected.getName() + " but got " + ex.getClass().getName(), ex);
        }
        throw new AssertionError("Expected exception " + expected.getName() + " but nothing was thrown");
    }

    private static Throwable assertThrowsOneOf(List<Class<? extends Throwable>> expected, ThrowingRunnable r) {
        try {
            r.run();
        } catch (Throwable ex) {
            for (Class<? extends Throwable> type : expected) {
                if (type.isInstance(ex)) {
                    return ex;
                }
            }
            throw new AssertionError("Expected one of " + expected + " but got " + ex.getClass().getName(), ex);
        }
        throw new AssertionError("Expected exception but nothing was thrown");
    }

    // ---------------- AC-1 Currency Unit Lookup (String code) ----------------

    @Test
    public void of_withValidCodes_returnsCurrencyAndCodeMatches() {
        for (String code : Arrays.asList("USD", "EUR", "JPY", "GBP", "CHF", "AUD", "CAD")) {
            CurrencyUnit unit = CurrencyUnit.of(code);
            Assert.assertNotNull(unit);
            Assert.assertEquals(code, unit.getCode());
            Assert.assertEquals(code, unit.toString());
            // Same lookup returns same cached instance (map-backed)
            Assert.assertSame(unit, CurrencyUnit.of(code));
        }
    }

    @Test
    public void of_withInvalidCodes_throwsIllegalCurrencyException() {
        for (String code : Arrays.asList("XX", "us", "usd", "123", "")) {
            IllegalCurrencyException ex = assertThrows(IllegalCurrencyException.class, () -> CurrencyUnit.of(code));
            Assert.assertTrue(ex.getMessage().contains("Unknown currency"));
        }
    }

    @Test
    public void of_withNull_throwsException() {
        // MoneyUtils.checkNotNull may throw IllegalArgumentException (or similar) depending on implementation.
        assertThrowsOneOf(
                Arrays.asList(IllegalCurrencyException.class, IllegalArgumentException.class, NullPointerException.class),
                () -> CurrencyUnit.of((String) null)
        );
    }

    @Test
    public void ofCurrency_withValidCurrency_returnsMatchingUnit() {
        Currency jdkUsd = Currency.getInstance("USD");
        CurrencyUnit unit = CurrencyUnit.of(jdkUsd);
        Assert.assertEquals("USD", unit.getCode());
        Assert.assertEquals(CurrencyUnit.of("USD"), unit);
    }

    @Test
    public void ofCurrency_withNull_throwsException() {
        assertThrowsOneOf(
                Arrays.asList(IllegalCurrencyException.class, IllegalArgumentException.class, NullPointerException.class),
                () -> CurrencyUnit.of((Currency) null)
        );
    }

    // ---------------- AC-2 Currency Locale Lookup ----------------

    @Test
    public void ofLocale_withKnownLocales_returnsExpectedCurrency() {
        Assert.assertEquals("USD", CurrencyUnit.of(Locale.US).getCode());
        Assert.assertEquals("GBP", CurrencyUnit.of(new Locale("en", "GB")).getCode());
        Assert.assertEquals("JPY", CurrencyUnit.of(Locale.JAPAN).getCode());
    }

    @Test
    public void ofLocale_withEmptyCountry_throwsIllegalCurrencyException() {
        Locale empty = new Locale("", "");
        IllegalCurrencyException ex = assertThrows(IllegalCurrencyException.class, () -> CurrencyUnit.of(empty));
        Assert.assertTrue(ex.getMessage().contains("No currency found for locale"));
    }

    @Test
    public void ofLocale_withNull_throwsException() {
        assertThrowsOneOf(
                Arrays.asList(IllegalCurrencyException.class, IllegalArgumentException.class, NullPointerException.class),
                () -> CurrencyUnit.of((Locale) null)
        );
    }

    // ---------------- AC-3 Currency Locale Lookup (Country Code) ----------------

    @Test
    public void ofCountry_withKnownCountries_returnsExpectedCurrency() {
        Assert.assertEquals("USD", CurrencyUnit.ofCountry("US").getCode());
        Assert.assertEquals("GBP", CurrencyUnit.ofCountry("GB").getCode());
        Assert.assertEquals("CAD", CurrencyUnit.ofCountry("CA").getCode());
        Assert.assertEquals("CHF", CurrencyUnit.ofCountry("CH").getCode());
    }

    @Test
    public void ofCountry_withUnknownOrInvalidCountries_throwsIllegalCurrencyException() {
        for (String cc : Arrays.asList("ZZ", "USA", "12", "")) {
            IllegalCurrencyException ex = assertThrows(IllegalCurrencyException.class, () -> CurrencyUnit.ofCountry(cc));
            Assert.assertTrue(ex.getMessage().contains("No currency found for country"));
        }
    }

    @Test
    public void ofCountry_withNull_throwsException() {
        assertThrowsOneOf(
                Arrays.asList(IllegalCurrencyException.class, IllegalArgumentException.class, NullPointerException.class),
                () -> CurrencyUnit.ofCountry(null)
        );
    }

    // ---------------- AC-4 Currency Unit Numeric Lookup ----------------

    @Test
    public void ofNumericCode_withInt_returnsExpectedCurrency() {
        Assert.assertEquals("USD", CurrencyUnit.ofNumericCode(840).getCode());
        Assert.assertEquals("JPY", CurrencyUnit.ofNumericCode(392).getCode());

        // Duplicate example: should be deterministic
        Assert.assertEquals(CurrencyUnit.ofNumericCode(840), CurrencyUnit.ofNumericCode(840));
    }

    @Test
    public void ofNumericCode_withIntInvalid_throwsIllegalCurrencyException() {
        assertThrows(IllegalCurrencyException.class, () -> CurrencyUnit.ofNumericCode(-1));
        assertThrows(IllegalCurrencyException.class, () -> CurrencyUnit.ofNumericCode(9999));
    }

    @Test
    public void ofNumericCode_withString_returnsExpectedCurrency() {
        Assert.assertEquals("USD", CurrencyUnit.ofNumericCode("840").getCode());
        Assert.assertEquals("JPY", CurrencyUnit.ofNumericCode("392").getCode());

        // Duplicate example
        Assert.assertEquals(CurrencyUnit.ofNumericCode("840"), CurrencyUnit.ofNumericCode("840"));
    }

    @Test
    public void ofNumericCode_withStringCoversAllLengthBranches_andInvalidsThrow() {
        // length 1 branch
        assertThrows(IllegalCurrencyException.class, () -> CurrencyUnit.ofNumericCode("0"));
        // length 2 branch (leading zero)
        // assertThrows(IllegalCurrencyException.class, () -> CurrencyUnit.ofNumericCode("08")); // FAILING: Wrong assumption by LLM
        // length 3 branch but non-digits still parsed -> should not be found
        assertThrows(IllegalCurrencyException.class, () -> CurrencyUnit.ofNumericCode("ABC"));
        // default branch (length 0 / 4)
        assertThrows(IllegalCurrencyException.class, () -> CurrencyUnit.ofNumericCode(""));
        assertThrows(IllegalCurrencyException.class, () -> CurrencyUnit.ofNumericCode("9999"));
        // negative-ish string: goes through length 2 parsing
        assertThrows(IllegalCurrencyException.class, () -> CurrencyUnit.ofNumericCode("-1"));
    }

    @Test
    public void ofNumericCode_withStringNull_throwsException() {
        assertThrowsOneOf(
                Arrays.asList(IllegalCurrencyException.class, IllegalArgumentException.class, NullPointerException.class),
                () -> CurrencyUnit.ofNumericCode((String) null)
        );
    }

    // ---------------- AC-5 Dynamic Currency Registration ----------------

    @Test
    public void registerCurrency_withValidCustomCurrency_succeedsAndCanLookup() {
        CurrencyUnit brb = CurrencyUnit.registerCurrency("BRB", -1, 8, Collections.<String>emptyList()); // FAILING: Changed BTC to BRB
        Assert.assertNotNull(brb);
        Assert.assertEquals("BRB", brb.getCode());
        Assert.assertEquals(-1, brb.getNumericCode());
        Assert.assertEquals("", brb.getNumeric3Code());
        Assert.assertEquals(8, brb.getDecimalPlaces());
        Assert.assertFalse(brb.isPseudoCurrency());

        // Lookup by code returns same registered instance
        Assert.assertSame(brb, CurrencyUnit.of("BRB"));

        // Numeric lookup should fail since numeric code -1 is not registered in numeric map
        assertThrows(IllegalCurrencyException.class, () -> CurrencyUnit.ofNumericCode(-1));

        // Symbol falls back to code for non-JDK currencies
        Assert.assertEquals("BRB", brb.getSymbol());
        Assert.assertEquals("BRB", brb.getSymbol(Locale.US));
    }

    @Test
    public void registerCurrency_withInvalidCodeFormat_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> CurrencyUnit.registerCurrency("BitCoin", -1, 8, Collections.<String>emptyList()));

        // length == 3 but invalid characters / case
        assertThrows(IllegalArgumentException.class,
                () -> CurrencyUnit.registerCurrency("BtC", -1, 8, Collections.<String>emptyList()));
    }

    @Test
    public void registerCurrency_withDuplicateCurrencyWithoutForce_throwsIllegalArgumentException() {
        CurrencyUnit usd = CurrencyUnit.of("USD");
        assertThrows(IllegalArgumentException.class,
                () -> CurrencyUnit.registerCurrency("USD", usd.getNumericCode(), usd.getDecimalPlaces(), Collections.<String>emptyList(), false));
    }

    @Test
    public void registerCurrency_withAlreadyRegisteredCountryWithoutForce_throwsIllegalArgumentException() {
        // Use an existing country to trigger the country mapping conflict branch.
        assertThrows(IllegalArgumentException.class,
                () -> CurrencyUnit.registerCurrency("TST", -1, 2, Arrays.asList("US"), false));
    }

    @Test
    public void registerCurrency_withInvalidRangesOrNulls_throwsIllegalArgumentExceptionOrSimilar() {
        assertThrowsOneOf(
                Arrays.asList(IllegalArgumentException.class, NullPointerException.class),
                () -> CurrencyUnit.registerCurrency(null, -1, 2, Collections.<String>emptyList(), false)
        );

        assertThrows(IllegalArgumentException.class,
                () -> CurrencyUnit.registerCurrency("AAA", -2, 2, Collections.<String>emptyList(), false));
        assertThrows(IllegalArgumentException.class,
                () -> CurrencyUnit.registerCurrency("AAA", 1000, 2, Collections.<String>emptyList(), false));

        assertThrows(IllegalArgumentException.class,
                () -> CurrencyUnit.registerCurrency("AAA", -1, -2, Collections.<String>emptyList(), false));
        assertThrows(IllegalArgumentException.class,
                () -> CurrencyUnit.registerCurrency("AAA", -1, 31, Collections.<String>emptyList(), false));

        assertThrowsOneOf(
                Arrays.asList(IllegalArgumentException.class, NullPointerException.class),
                () -> CurrencyUnit.registerCurrency("AAA", -1, 2, (List<String>) null, false)
        );
    }

    @Test
    public void registerCurrency_forceTrue_replacesExistingCurrencyAndUpdatesProperties_andRestores() {
        CurrencyUnit original = CurrencyUnit.of("USD");
        int originalNumeric = original.getNumericCode();
        int originalDecimals = original.getDecimalPlaces();
        List<String> originalCountries = new ArrayList<>(original.getCountryCodes());

        // Ensure we have at least one country code to validate country mapping updates
        Assert.assertTrue("Expected USD to have at least one country mapping", originalCountries.size() > 0);

        int newDecimals = (originalDecimals == 30 ? 29 : originalDecimals + 1);
        try {
            CurrencyUnit replaced = CurrencyUnit.registerCurrency("USD", originalNumeric, newDecimals, originalCountries, true);

            Assert.assertNotNull(replaced);
            Assert.assertEquals("USD", replaced.getCode());
            Assert.assertEquals(originalNumeric, replaced.getNumericCode());
            Assert.assertEquals(newDecimals, replaced.getDecimalPlaces());
            Assert.assertFalse(replaced.isPseudoCurrency());

            CurrencyUnit lookedUp = CurrencyUnit.of("USD");
            Assert.assertSame(replaced, lookedUp);
            Assert.assertNotSame(original, lookedUp);

            // Country mappings provided should now resolve to the replaced instance
            for (String cc : originalCountries) {
                Assert.assertSame("Expected country mapping updated for " + cc, replaced, CurrencyUnit.ofCountry(cc));
            }
        } finally {
            // Restore back to original properties for test isolation (not same instance, but same behavior).
            CurrencyUnit.registerCurrency("USD", originalNumeric, originalDecimals, originalCountries, true);
            Assert.assertEquals(originalDecimals, CurrencyUnit.of("USD").getDecimalPlaces());
        }
    }

    // ---------------- AC-6 Dynamic Country Registration ----------------

    @Test
    public void registerCountry_registersMappingAndLookupByCountryReturnsCurrency() {
        CurrencyUnit usd = CurrencyUnit.of("USD");
        CurrencyUnit eur = CurrencyUnit.of("EUR");

        CurrencyUnit.registerCountry("XX", usd);
        Assert.assertSame(usd, CurrencyUnit.ofCountry("XX"));

        CurrencyUnit.registerCountry("YY", eur);
        Assert.assertSame(eur, CurrencyUnit.ofCountry("YY"));

        // Overwrite behavior (ConcurrentMap#put): last write wins
        CurrencyUnit.registerCountry("XX", eur);
        Assert.assertSame(eur, CurrencyUnit.ofCountry("XX"));
    }

    @Test
    public void registerCountry_withNullKeyOrValue_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> CurrencyUnit.registerCountry(null, CurrencyUnit.of("USD")));
        assertThrows(NullPointerException.class, () -> CurrencyUnit.registerCountry("ZZ", null));
    }

    // ---------------- AC-7 Currency Object Comparison ----------------

    @Test
    public void compareTo_comparesAlphabetically() {
        Assert.assertTrue(CurrencyUnit.of("AUD").compareTo(CurrencyUnit.of("CAD")) < 0);
        Assert.assertEquals(0, CurrencyUnit.of("USD").compareTo(CurrencyUnit.of("USD")));
        Assert.assertTrue(CurrencyUnit.of("USD").compareTo(CurrencyUnit.of("EUR")) > 0);
    }

    @Test(expected = NullPointerException.class)
    public void compareTo_withNull_throwsNullPointerException() {
        CurrencyUnit.of("USD").compareTo(null);
    }

    // ---------------- Additional coverage-focused tests ----------------

    @Test
    public void getNumeric3Code_formatsCorrectly_forNegativeOneTwoThreeDigits() {
        CurrencyUnit pseudo = new CurrencyUnit("PSU", (short) -1, (short) 2);
        Assert.assertEquals("", pseudo.getNumeric3Code());

        CurrencyUnit oneDigit = new CurrencyUnit("ONE", (short) 5, (short) 2);
        Assert.assertEquals("005", oneDigit.getNumeric3Code());

        CurrencyUnit twoDigits = new CurrencyUnit("TWO", (short) 12, (short) 2);
        Assert.assertEquals("012", twoDigits.getNumeric3Code());

        CurrencyUnit threeDigits = new CurrencyUnit("THR", (short) 840, (short) 2);
        Assert.assertEquals("840", threeDigits.getNumeric3Code());
    }

    @Test
    public void decimalPlaces_andPseudoCurrency_behavior() {
        CurrencyUnit pseudo = new CurrencyUnit("PSX", (short) 998, (short) -1);
        Assert.assertTrue(pseudo.isPseudoCurrency());
        Assert.assertEquals(0, pseudo.getDecimalPlaces());

        CurrencyUnit normal = new CurrencyUnit("NOR", (short) 997, (short) 0);
        Assert.assertFalse(normal.isPseudoCurrency());
        Assert.assertEquals(0, normal.getDecimalPlaces());
    }

    @Test
    public void getSymbol_handlesXXXAndUnknownCurrencyGracefully() {
        // Unknown to Java currency: should fall back to code via catch branch
        CurrencyUnit unknown = new CurrencyUnit("ZZZ", (short) -1, (short) 2);
        Assert.assertEquals("ZZZ", unknown.getSymbol());
        Assert.assertEquals("ZZZ", unknown.getSymbol(Locale.JAPAN));

        // XXX special-case: returns code directly
        try {
            CurrencyUnit xxx = CurrencyUnit.of("XXX");
            Assert.assertEquals("XXX", xxx.getSymbol());
            Assert.assertEquals("XXX", xxx.getSymbol(Locale.UK));
        } catch (IllegalCurrencyException ignoreIfNotProvided) {
            // Some providers may not register XXX; in that case we've still covered the catch branch above.
        }
    }

    @Test
    public void getSymbol_withNullLocale_throwsException() {
        CurrencyUnit usd = CurrencyUnit.of("USD");
        assertThrowsOneOf(
                Arrays.asList(IllegalArgumentException.class, NullPointerException.class, IllegalCurrencyException.class),
                () -> usd.getSymbol((Locale) null)
        );
    }

    @Test
    public void getCountryCodes_returnsSetContainingExpectedCountryForUsd() {
        CurrencyUnit usd = CurrencyUnit.of("USD");
        Set<String> countries = usd.getCountryCodes();
        Assert.assertNotNull(countries);
        Assert.assertTrue("Expected USD to be mapped for US", countries.contains("US"));
    }

    @Test
    public void equalsHashCode_contractBasedOnCodeOnly() {
        CurrencyUnit a = new CurrencyUnit("AAA", (short) 1, (short) 2);
        CurrencyUnit b = new CurrencyUnit("AAA", (short) 999, (short) -1);
        CurrencyUnit c = new CurrencyUnit("AAB", (short) 1, (short) 2);

        Assert.assertTrue(a.equals(a)); // same instance
        Assert.assertTrue(a.equals(b)); // same code
        Assert.assertEquals(a.hashCode(), b.hashCode());
        Assert.assertFalse(a.equals(c));
        Assert.assertFalse(a.equals("AAA"));
        Assert.assertFalse(a.equals(null));
    }

    @Test
    public void registeredCurrenciesAndCountries_returnListsAndContainKnownEntries() {
        List<CurrencyUnit> currencies = CurrencyUnit.registeredCurrencies();
        Assert.assertNotNull(currencies);
        Assert.assertTrue(currencies.size() > 0);
        Assert.assertTrue(currencies.contains(CurrencyUnit.of("USD")));

        List<String> countries = CurrencyUnit.registeredCountries();
        Assert.assertNotNull(countries);
        Assert.assertTrue(countries.contains("US"));
    }

    @Test
    public void toCurrency_forStandardCurrency_returnsJdkCurrency() {
        CurrencyUnit usd = CurrencyUnit.of("USD");
        Currency jdk = usd.toCurrency();
        Assert.assertNotNull(jdk);
        Assert.assertEquals("USD", jdk.getCurrencyCode());
    }
}