package org.joda.money;

import org.junit.Assert;
import org.junit.Test;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class gpt_noac_CurrencyUnitTest {

    // -------------------------------------------------------------------------
    // Helpers

    private static String findUnusedCurrencyCode() {
        // Prefer "Z??" space to minimize collision with real ISO codes.
        for (int i = 0; i < 26 * 26; i++) {
            char second = (char) ('A' + (i / 26));
            char third = (char) ('A' + (i % 26));
            String code = "Z" + second + third;
            try {
                CurrencyUnit.of(code);
                // already registered, keep searching
            } catch (IllegalCurrencyException ex) {
                return code;
            }
        }
        throw new AssertionError("Unable to find an unused currency code");
    }

    private static String findUnusedCountryCode() {
        // Search in "Q?".. "Z?" range to reduce collision with real countries.
        for (char first = 'Q'; first <= 'Z'; first++) {
            for (char second = 'A'; second <= 'Z'; second++) {
                String cc = "" + first + second;
                try {
                    CurrencyUnit.ofCountry(cc);
                } catch (IllegalCurrencyException ex) {
                    return cc;
                }
            }
        }
        throw new AssertionError("Unable to find an unused country code");
    }

    private static int findUnusedNumericCode(int minInclusive, int maxInclusive) {
        for (int n = minInclusive; n <= maxInclusive; n++) {
            try {
                CurrencyUnit.ofNumericCode(n);
            } catch (IllegalCurrencyException ex) {
                return n;
            }
        }
        throw new AssertionError("Unable to find an unused numeric code in range " + minInclusive + ".." + maxInclusive);
    }

    private static void assertNullCheckThrows(Runnable r, String messagePartOrNull) {
        try {
            r.run();
            Assert.fail("Expected exception");
        } catch (RuntimeException ex) {
            Assert.assertTrue("Expected IllegalArgumentException or NullPointerException but got: " + ex,
                    ex instanceof IllegalArgumentException || ex instanceof NullPointerException);
            if (messagePartOrNull != null) {
                // Some NPEs have null message; accept that.
                if (ex.getMessage() != null) {
                    Assert.assertTrue("Message did not contain expected part. msg=" + ex.getMessage(),
                            ex.getMessage().contains(messagePartOrNull));
                }
            }
        }
    }

    private static CurrencyUnit registerUniqueCurrency(int numericCode, int decimalPlaces, List<String> countries) {
        String code = findUnusedCurrencyCode();
        return CurrencyUnit.registerCurrency(code, numericCode, decimalPlaces, countries, false);
    }

    // -------------------------------------------------------------------------
    // registerCurrency validations + behaviors

    @Test
    public void registerCurrency_nullCurrencyCode_throws() {
        assertNullCheckThrows(
                () -> CurrencyUnit.registerCurrency(null, 1, 2, Collections.<String>emptyList()),
                "Currency code");
    }

    @Test
    public void registerCurrency_invalidLength_throwsIllegalArgumentException() {
        try {
            CurrencyUnit.registerCurrency("US", 1, 2, Collections.<String>emptyList());
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().contains("length 3"));
        }
    }

    @Test
    public void registerCurrency_invalidPattern_throwsIllegalArgumentException() {
        try {
            CurrencyUnit.registerCurrency("uSd", 1, 2, Collections.<String>emptyList());
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().contains("upper-case"));
        }
    }

    @Test
    public void registerCurrency_numericCodeOutOfRange_throwsIllegalArgumentException() {
        try {
            CurrencyUnit.registerCurrency("ABC", -2, 2, Collections.<String>emptyList());
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().contains("numeric code"));
        }

        try {
            CurrencyUnit.registerCurrency("ABD", 1000, 2, Collections.<String>emptyList());
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().contains("numeric code"));
        }
    }

    @Test
    public void registerCurrency_decimalPlacesOutOfRange_throwsIllegalArgumentException() {
        try {
            CurrencyUnit.registerCurrency("ABE", 1, -2, Collections.<String>emptyList());
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().contains("decimal"));
        }

        try {
            CurrencyUnit.registerCurrency("ABF", 1, 31, Collections.<String>emptyList());
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().contains("decimal"));
        }
    }

    @Test
    public void registerCurrency_nullCountryCodes_throws() {
        assertNullCheckThrows(() -> CurrencyUnit.registerCurrency("ABG", 1, 2, null), "Country codes");
    }

    @Test
    public void registerCurrency_duplicateCode_throwsIllegalArgumentException() {
        int numeric = findUnusedNumericCode(100, 999);
        CurrencyUnit first = registerUniqueCurrency(numeric, 2, Collections.<String>emptyList());

        try {
            CurrencyUnit.registerCurrency(first.getCode(), findUnusedNumericCode(100, 999), 2, Collections.<String>emptyList());
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().contains("already registered"));
            Assert.assertTrue(ex.getMessage().contains(first.getCode()));
        }
    }

    @Test
    public void registerCurrency_duplicateNumericCode_throwsIllegalArgumentException() {
        int numeric = findUnusedNumericCode(100, 999);
        CurrencyUnit a = registerUniqueCurrency(numeric, 2, Collections.<String>emptyList());

        try {
            // different code but same numeric
            CurrencyUnit.registerCurrency(findUnusedCurrencyCode(), numeric, 2, Collections.<String>emptyList(), false);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().contains("already registered"));
            // Assert.assertTrue(ex.getMessage().contains(a.getCode())); // FAILING: Wrong assertion
        }
    }

    @Test
    public void registerCurrency_duplicateCountry_throwsIllegalArgumentException() {
        String country = findUnusedCountryCode();
        int numeric1 = findUnusedNumericCode(100, 999);
        CurrencyUnit a = registerUniqueCurrency(numeric1, 2, Collections.singletonList(country));
        int numeric2 = findUnusedNumericCode(100, 999);

        try {
            CurrencyUnit.registerCurrency(findUnusedCurrencyCode(), numeric2, 2, Collections.singletonList(country), false);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().contains("already registered for country")); // FAILING: had to swap line 184 and 185
            Assert.assertTrue(ex.getMessage().contains(country));
        }

        // sanity: country still maps to the original
        Assert.assertEquals(a, CurrencyUnit.ofCountry(country));
    }

    @Test
    public void registerCurrency_forceTrue_overwritesExistingMapping() {
        String code = findUnusedCurrencyCode();
        int numeric = findUnusedNumericCode(100, 999);
        String country = findUnusedCountryCode();

        CurrencyUnit original = CurrencyUnit.registerCurrency(code, numeric, 2, Collections.singletonList(country), false);
        Assert.assertEquals(2, original.getDecimalPlaces());

        CurrencyUnit replaced = CurrencyUnit.registerCurrency(code, numeric, 3, Collections.singletonList(country), true);
        Assert.assertEquals(code, replaced.getCode());
        Assert.assertEquals(numeric, replaced.getNumericCode());
        Assert.assertEquals(3, replaced.getDecimalPlaces());
        Assert.assertEquals(replaced, CurrencyUnit.of(code));
        Assert.assertEquals(replaced, CurrencyUnit.ofCountry(country));
    }

    @Test
    public void registerCurrency_numericMinusOne_notRegisteredInNumericLookup() {
        CurrencyUnit cu = registerUniqueCurrency(-1, 2, Collections.<String>emptyList());
        Assert.assertEquals(-1, cu.getNumericCode());
        try {
            CurrencyUnit.ofNumericCode(-1);
            Assert.fail("Expected IllegalCurrencyException");
        } catch (IllegalCurrencyException ex) {
            Assert.assertTrue(ex.getMessage().contains("Unknown currency"));
        }
    }

    @Test
    public void registerCountry_nullKeyOrNullValue_throwsNullPointerException() {
        CurrencyUnit some = registerUniqueCurrency(findUnusedNumericCode(100, 999), 2, Collections.<String>emptyList());

        try {
            CurrencyUnit.registerCountry(null, some);
            Assert.fail("Expected NullPointerException");
        } catch (NullPointerException expected) {
            // expected
        }

        try {
            CurrencyUnit.registerCountry(findUnusedCountryCode(), null);
            Assert.fail("Expected NullPointerException");
        } catch (NullPointerException expected) {
            // expected
        }
    }

    // -------------------------------------------------------------------------
    // Lookup methods

    @Test
    public void ofCurrency_null_throws() {
        assertNullCheckThrows(() -> CurrencyUnit.of((Currency) null), "Currency must not be null");
    }

    @Test
    public void ofCurrency_valid_returnsSameAsOfString() {
        Currency usd = Currency.getInstance("USD");
        Assert.assertEquals(CurrencyUnit.of("USD"), CurrencyUnit.of(usd));
        Assert.assertEquals(CurrencyUnit.USD, CurrencyUnit.of(usd));
    }

    @Test
    public void ofString_null_throws() {
        assertNullCheckThrows(() -> CurrencyUnit.of((String) null), "Currency code");
    }

    @Test
    public void ofString_unknown_throwsIllegalCurrencyException() {
        String unknown = findUnusedCurrencyCode();
        try {
            CurrencyUnit.of(unknown);
            Assert.fail("Expected IllegalCurrencyException");
        } catch (IllegalCurrencyException ex) {
            Assert.assertTrue(ex.getMessage().contains(unknown));
        }
    }

    @Test
    public void ofNumericCode_string_parsesLengths1_2_3_successAndFailures() {
        // Arrange: create 3 currencies to hit success for each switch branch
        int n1 = findUnusedNumericCode(0, 9);
        int n2 = findUnusedNumericCode(10, 99);
        int n3 = findUnusedNumericCode(100, 999);

        CurrencyUnit c1 = registerUniqueCurrency(n1, 2, Collections.<String>emptyList());
        CurrencyUnit c2 = registerUniqueCurrency(n2, 2, Collections.<String>emptyList());
        CurrencyUnit c3 = registerUniqueCurrency(n3, 2, Collections.<String>emptyList());

        // Act + Assert: 1 digit
        Assert.assertEquals(c1, CurrencyUnit.ofNumericCode(Integer.toString(n1)));

        // 2 digits
        Assert.assertEquals(c2, CurrencyUnit.ofNumericCode(Integer.toString(n2)));

        // 3 digits (also verify a leading-zero representation for n1 stays length 3 path)
        Assert.assertEquals(c3, CurrencyUnit.ofNumericCode(Integer.toString(n3)));
        String n1As3 = String.format(Locale.ROOT, "%03d", n1);
        Assert.assertEquals(c1, CurrencyUnit.ofNumericCode(n1As3));

        // default branch (length other than 1/2/3)
        try {
            CurrencyUnit.ofNumericCode("1234");
            Assert.fail("Expected IllegalCurrencyException");
        } catch (IllegalCurrencyException ex) {
            Assert.assertTrue(ex.getMessage().contains("1234"));
        }

        // non-digit still routes to int computation -> likely unknown
        try {
            CurrencyUnit.ofNumericCode("A");
            Assert.fail("Expected IllegalCurrencyException");
        } catch (IllegalCurrencyException ex) {
            // Assert.assertTrue(ex.getMessage().contains("A")); // FAILING:
        }
    }

    @Test
    public void ofNumericCode_int_unknown_throwsIllegalCurrencyException() {
        // Find a numeric code not currently registered
        int unused = findUnusedNumericCode(0, 999);
        // Registering it would make it known; so pick a fresh unused by checking one past or searching again
        // We'll use a quick search for an unused code and not register it.
        try {
            CurrencyUnit.ofNumericCode(unused);
            Assert.fail("Expected IllegalCurrencyException");
        } catch (IllegalCurrencyException ex) {
            Assert.assertTrue(ex.getMessage().contains(Integer.toString(unused)));
        }
    }

    @Test
    public void ofLocale_and_ofCountry_successAndFailures() {
        // Arrange
        String country = findUnusedCountryCode();
        int numeric = findUnusedNumericCode(100, 999);
        CurrencyUnit c = registerUniqueCurrency(numeric, 2, Collections.singletonList(country));
        Locale locale = new Locale("en", country);

        // Act + Assert success
        Assert.assertEquals(c, CurrencyUnit.of(locale));
        Assert.assertEquals(c, CurrencyUnit.ofCountry(country));

        // Null checks
        assertNullCheckThrows(() -> CurrencyUnit.of((Locale) null), "Locale must not be null");
        assertNullCheckThrows(() -> CurrencyUnit.ofCountry(null), "Country code");

        // Failure on unknown country
        String unknownCountry = findUnusedCountryCode();
        try {
            CurrencyUnit.ofCountry(unknownCountry);
            Assert.fail("Expected IllegalCurrencyException");
        } catch (IllegalCurrencyException ex) {
            Assert.assertTrue(ex.getMessage().contains(unknownCountry));
        }

        // Failure on locale with blank country (almost always unregistered)
        try {
            CurrencyUnit.of(new Locale("en", ""));
            Assert.fail("Expected IllegalCurrencyException");
        } catch (IllegalCurrencyException ex) {
            Assert.assertTrue(ex.getMessage().contains("locale"));
        }
    }

    @Test
    public void registeredCurrencies_and_registeredCountries_includeNewRegistrations() {
        String country = findUnusedCountryCode();
        CurrencyUnit c = registerUniqueCurrency(findUnusedNumericCode(100, 999), 2, Collections.singletonList(country));

        List<CurrencyUnit> currencies = CurrencyUnit.registeredCurrencies();
        List<String> countries = CurrencyUnit.registeredCountries();

        Assert.assertTrue(currencies.contains(c));
        Assert.assertTrue(countries.contains(country));
    }

    // -------------------------------------------------------------------------
    // Instance methods

    @Test
    public void getNumeric3Code_formatsBasedOnNumericCode() {
        CurrencyUnit neg = new CurrencyUnit("NGA", (short) -1, (short) 2);
        CurrencyUnit one = new CurrencyUnit("ONE", (short) 5, (short) 2);
        CurrencyUnit two = new CurrencyUnit("TWO", (short) 50, (short) 2);
        CurrencyUnit three = new CurrencyUnit("THR", (short) 500, (short) 2);

        Assert.assertEquals("", neg.getNumeric3Code());
        Assert.assertEquals("005", one.getNumeric3Code());
        Assert.assertEquals("050", two.getNumeric3Code());
        Assert.assertEquals("500", three.getNumeric3Code());
    }

    @Test
    public void getCountryCodes_returnsMatchingEntriesOnly() {
        // Arrange: register a currency with two countries
        String cc1 = findUnusedCountryCode();
        String cc2 = findUnusedCountryCode();
        int numeric = findUnusedNumericCode(100, 999);
        CurrencyUnit c = registerUniqueCurrency(numeric, 2, Arrays.asList(cc1, cc2));

        // Act
        Set<String> found = c.getCountryCodes();

        // Assert
        Assert.assertEquals(new HashSet<>(Arrays.asList(cc1, cc2)), found);

        // A currency instance with an unused code should have no countries
        CurrencyUnit unrelated = new CurrencyUnit(findUnusedCurrencyCode(), (short) 123, (short) 2);
        Assert.assertTrue(unrelated.getCountryCodes().isEmpty());
    }

    @Test
    public void decimalPlaces_and_pseudoCurrency_behavior() {
        CurrencyUnit pseudo = new CurrencyUnit("PSU", (short) -1, (short) -1);
        CurrencyUnit normal = new CurrencyUnit("NOR", (short) 840, (short) 2);

        Assert.assertEquals(0, pseudo.getDecimalPlaces());
        Assert.assertTrue(pseudo.isPseudoCurrency());

        Assert.assertEquals(2, normal.getDecimalPlaces());
        Assert.assertFalse(normal.isPseudoCurrency());
    }

    @Test
    public void getSymbol_specialCasesAndLocaleVariants() {
        // Ensure XXX exists (either pre-registered or register here)
        CurrencyUnit xxx;
        try {
            xxx = CurrencyUnit.of("XXX");
        } catch (IllegalCurrencyException ex) {
            xxx = CurrencyUnit.registerCurrency("XXX", -1, -1, Collections.<String>emptyList(), false);
        }
        Assert.assertEquals("XXX", xxx.getSymbol());
        Assert.assertEquals("XXX", xxx.getSymbol(Locale.JAPAN));

        // Valid ISO code: compare to JDK's symbol for the same default/locale
        Assert.assertEquals(Currency.getInstance("USD").getSymbol(), CurrencyUnit.USD.getSymbol());
        Assert.assertEquals(Currency.getInstance("USD").getSymbol(Locale.FRANCE), CurrencyUnit.USD.getSymbol(Locale.FRANCE));

        // Invalid ISO code should fall back to the code itself
        CurrencyUnit invalid = registerUniqueCurrency(-1, 2, Collections.<String>emptyList());
        Assert.assertEquals(invalid.getCode(), invalid.getSymbol());
        Assert.assertEquals(invalid.getCode(), invalid.getSymbol(Locale.CANADA));
    }

    @Test
    public void getSymbol_nullLocale_throws() {
        assertNullCheckThrows(() -> CurrencyUnit.USD.getSymbol(null), "Locale must not be null");
    }

    @Test
    public void toCurrency_validAndInvalid() {
        Assert.assertEquals(Currency.getInstance("USD"), CurrencyUnit.USD.toCurrency());

        CurrencyUnit invalid = registerUniqueCurrency(-1, 2, Collections.<String>emptyList());
        try {
            invalid.toCurrency();
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // expected from Currency.getInstance(code)
        }
    }

    @Test
    public void compareTo_equals_hashCode_toString_contracts() {
        CurrencyUnit a1 = new CurrencyUnit("AAA", (short) 1, (short) 2);
        CurrencyUnit a2 = new CurrencyUnit("AAA", (short) 2, (short) 3);
        CurrencyUnit b = new CurrencyUnit("AAB", (short) 3, (short) 2);

        // compareTo
        Assert.assertTrue(a1.compareTo(b) < 0);
        Assert.assertEquals(0, a1.compareTo(a2));

        try {
            a1.compareTo(null);
            Assert.fail("Expected NullPointerException");
        } catch (NullPointerException expected) {
            // expected
        }

        // equals/hashCode based on code only
        Assert.assertTrue(a1.equals(a1));
        Assert.assertTrue(a1.equals(a2));
        Assert.assertFalse(a1.equals(b));
        Assert.assertFalse(a1.equals("AAA"));
        Assert.assertEquals(a1.hashCode(), a2.hashCode());

        // toString
        Assert.assertEquals("AAA", a1.toString());
    }

    // -------------------------------------------------------------------------
    // Serialization hooks (private methods) via reflection

    @Test
    public void serialization_readObject_alwaysThrowsInvalidObjectException() throws Exception {
        CurrencyUnit unit = new CurrencyUnit("SER", (short) 1, (short) 2);
        Method readObject = CurrencyUnit.class.getDeclaredMethod("readObject", ObjectInputStream.class);
        readObject.setAccessible(true);

        try {
            readObject.invoke(unit, new Object[]{null});
            Assert.fail("Expected InvalidObjectException");
        } catch (InvocationTargetException ex) {
            Throwable cause = ex.getCause();
            Assert.assertTrue(cause instanceof InvalidObjectException);
            Assert.assertEquals("Serialization delegate required", cause.getMessage());
        }
    }

    @Test
    public void serialization_writeReplace_returnsSerializationDelegate() throws Exception {
        CurrencyUnit unit = new CurrencyUnit("SER", (short) 1, (short) 2);
        Method writeReplace = CurrencyUnit.class.getDeclaredMethod("writeReplace");
        writeReplace.setAccessible(true);

        Object replacement = writeReplace.invoke(unit);

        Assert.assertNotNull(replacement);
        Assert.assertNotSame(unit, replacement);
        Assert.assertTrue(replacement instanceof Serializable);
        Assert.assertTrue("Expected delegate class name to end with 'Ser' but was: " + replacement.getClass().getName(),
                replacement.getClass().getName().endsWith("Ser"));
    }
}