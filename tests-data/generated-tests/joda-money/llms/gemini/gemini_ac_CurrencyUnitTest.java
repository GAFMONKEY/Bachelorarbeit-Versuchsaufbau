package org.joda.money;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.Currency;
import java.util.List;
import java.util.Locale;

import org.junit.After;
import org.junit.Test;

/**
 * JUnit 4 tests for CurrencyUnit, covering AC-1 through AC-7.
 */
public class gemini_ac_CurrencyUnitTest {

    // --- Added later so global state is properly reset for MoneyTests
    @After
    public void tearDown() {
        CurrencyUnit.setup();
    }
    // --

    // --- AC-1: Currency Unit Lookup by String Code ---

    @Test
    public void test_of_String_validCodes() {
        String[] codes = {"USD", "EUR", "JPY", "GBP", "CHF", "AUD", "CAD"};
        for (String code : codes) {
            CurrencyUnit cu = CurrencyUnit.of(code);
            assertEquals("Code should match input", code, cu.getCode());
            assertEquals("ToString should match code", code, cu.toString());
        }
    }

    @Test(expected = IllegalCurrencyException.class)
    public void test_of_String_invalidLength_tooShort() {
        CurrencyUnit.of("XX");
    }

    @Test(expected = IllegalCurrencyException.class)
    public void test_of_String_invalidCase_lower() {
        CurrencyUnit.of("usd");
    }

    @Test(expected = IllegalCurrencyException.class)
    public void test_of_String_invalidCase_mixed() {
        CurrencyUnit.of("Usd");
    }

    @Test(expected = IllegalCurrencyException.class)
    public void test_of_String_numeric() {
        CurrencyUnit.of("123");
    }

    @Test(expected = IllegalCurrencyException.class)
    public void test_of_String_empty() {
        CurrencyUnit.of("");
    }

    @Test(expected = NullPointerException.class)
    public void test_of_String_null() {
        CurrencyUnit.of((String) null);
    }

    @Test
    public void test_of_Currency_JDK() {
        Currency jdkCurrency = Currency.getInstance("USD");
        CurrencyUnit cu = CurrencyUnit.of(jdkCurrency);
        assertEquals("USD", cu.getCode());
    }

    // --- AC-2: Currency Locale Lookup ---

    @Test
    public void test_of_Locale_valid() {
        assertEquals(CurrencyUnit.USD, CurrencyUnit.of(Locale.US));
        assertEquals(CurrencyUnit.GBP, CurrencyUnit.of(Locale.UK));
        assertEquals(CurrencyUnit.JPY, CurrencyUnit.of(Locale.JAPAN));
    }

    @Test(expected = IllegalCurrencyException.class)
    public void test_of_Locale_unknown() {
        CurrencyUnit.of(new Locale("AASFASDFGD", "XYZ")); // FAILING
    }

    @Test(expected = NullPointerException.class)
    public void test_of_Locale_null() {
        CurrencyUnit.of((Locale) null);
    }

    // --- AC-3: Currency Country Code Lookup ---

    @Test
    public void test_ofCountry_valid() {
        assertEquals(CurrencyUnit.USD, CurrencyUnit.ofCountry("US"));
        assertEquals(CurrencyUnit.GBP, CurrencyUnit.ofCountry("GB"));
        assertEquals(CurrencyUnit.CAD, CurrencyUnit.ofCountry("CA"));
    }

    @Test(expected = IllegalCurrencyException.class)
    public void test_ofCountry_unknown() {
        CurrencyUnit.ofCountry("ZZ");
    }

    @Test(expected = IllegalCurrencyException.class)
    public void test_ofCountry_invalidLength() {
        CurrencyUnit.ofCountry("USA");
    }

    @Test(expected = NullPointerException.class)
    public void test_ofCountry_null() {
        CurrencyUnit.ofCountry(null);
    }

    // --- AC-4: Currency Unit Numeric Lookup ---

    @Test
    public void test_ofNumericCode_int_valid() {
        assertEquals(CurrencyUnit.USD, CurrencyUnit.ofNumericCode(840));
        assertEquals(CurrencyUnit.JPY, CurrencyUnit.ofNumericCode(392));
    }

    @Test(expected = IllegalCurrencyException.class)
    public void test_ofNumericCode_int_invalid() {
        CurrencyUnit.ofNumericCode(9999);
    }

    @Test(expected = IllegalCurrencyException.class)
    public void test_ofNumericCode_int_negative() {
        CurrencyUnit.ofNumericCode(-1);
    }

    @Test
    public void test_ofNumericCode_String_valid() {
        assertEquals(CurrencyUnit.USD, CurrencyUnit.ofNumericCode("840"));
        assertEquals(CurrencyUnit.JPY, CurrencyUnit.ofNumericCode("392"));
        // Test padding scenarios via the internal logic (1 and 2 chars)
        // Note: 8 is usually a numeric code for specific older/custom currencies if registered
        CurrencyUnit.registerCurrency("TST", 8, 2, true); // ERROR
        assertEquals("TST", CurrencyUnit.ofNumericCode("8").getCode());
        assertEquals("TST", CurrencyUnit.ofNumericCode("08").getCode());
        assertEquals("TST", CurrencyUnit.ofNumericCode("008").getCode());
    }

    @Test(expected = IllegalCurrencyException.class)
    public void test_ofNumericCode_String_invalid() {
        CurrencyUnit.ofNumericCode("ABC");
    }

    @Test(expected = IllegalCurrencyException.class)
    public void test_ofNumericCode_String_outOfBounds() {
        CurrencyUnit.ofNumericCode("9999");
    }

    @Test(expected = NullPointerException.class)
    public void test_ofNumericCode_String_null() {
        CurrencyUnit.ofNumericCode((String) null);
    }

    // --- AC-5: Dynamic Currency Registration ---

    @Test
    public void test_registerCurrency_AC5_1_success() {
        CurrencyUnit btc = CurrencyUnit.registerCurrency("JKL", -1, 8, false); // ERROR
        assertEquals("JKL", btc.getCode());
        assertEquals(-1, btc.getNumericCode());
        assertEquals(8, btc.getDecimalPlaces());
        assertFalse(btc.isPseudoCurrency()); // FAILING
        assertEquals(btc, CurrencyUnit.of("JKL"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_registerCurrency_AC5_2_invalidFormat() {
        CurrencyUnit.registerCurrency("BitCoin", 123, 2, false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_registerCurrency_AC5_3_duplicateNoForce() {
        // USD is already registered
        CurrencyUnit.registerCurrency("USD", 840, 2, false);
    }

    @Test
    public void test_registerCurrency_AC5_4_forceReplace() {
        // Registering a variant of USD with different decimal places via force
        CurrencyUnit oldUsd = CurrencyUnit.USD;
        CurrencyUnit newUsd = CurrencyUnit.registerCurrency("USD", 840, 4, true);

        assertEquals(4, newUsd.getDecimalPlaces());
        assertEquals(newUsd, CurrencyUnit.of("USD"));
        // Note: CurrencyUnit.USD constant remains the old instance because it's final static,
        // but the registry (of("USD")) returns the new one.
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_registerCurrency_invalidDecimalPlaces_low() {
        CurrencyUnit.registerCurrency("BAD", 998, -2, false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_registerCurrency_invalidDecimalPlaces_high() {
        CurrencyUnit.registerCurrency("BAD", 998, 31, false);
    }

    // --- AC-6: Dynamic Country Registration ---

    @Test
    public void test_registerCountry_mapping() {
        CurrencyUnit.registerCountry("XX", CurrencyUnit.USD);
        assertEquals(CurrencyUnit.USD, CurrencyUnit.ofCountry("XX"));

        CurrencyUnit.registerCountry("YY", CurrencyUnit.EUR);
        assertEquals(CurrencyUnit.EUR, CurrencyUnit.ofCountry("YY"));

        assertTrue(CurrencyUnit.USD.getCountryCodes().contains("XX"));
    }

    @Test
    public void test_registerCurrency_withCountryList() {
        List<String> countries = Arrays.asList("ZZ", "AA");
        CurrencyUnit cu = CurrencyUnit.registerCurrency("NEW", 777, 2, countries);
        assertEquals(cu, CurrencyUnit.ofCountry("ZZ"));
        assertEquals(cu, CurrencyUnit.ofCountry("AA"));
    }

    // --- AC-7: Currency Object Comparison ---

    @Test
    public void test_compareTo() {
        assertTrue("AUD < CAD", CurrencyUnit.AUD.compareTo(CurrencyUnit.CAD) < 0);
        assertEquals("USD == USD", 0, CurrencyUnit.USD.compareTo(CurrencyUnit.USD));
        assertTrue("USD > EUR", CurrencyUnit.USD.compareTo(CurrencyUnit.EUR) > 0);
    }

    @Test(expected = NullPointerException.class)
    public void test_compareTo_null() {
        CurrencyUnit.USD.compareTo(null);
    }

    @Test
    public void test_equals_hashCode() {
        CurrencyUnit usd1 = CurrencyUnit.of("USD");
        CurrencyUnit usd2 = CurrencyUnit.of("USD");
        CurrencyUnit eur = CurrencyUnit.EUR;

        assertTrue(usd1.equals(usd1));
        assertTrue(usd1.equals(usd2));
        assertFalse(usd1.equals(eur));
        assertFalse(usd1.equals("USD"));
        assertFalse(usd1.equals(null));

        assertEquals(usd1.hashCode(), usd2.hashCode());
    }

    // --- Additional coverage for logic branches ---

    @Test
    public void test_getNumeric3Code() {
        assertEquals("840", CurrencyUnit.USD.getNumeric3Code());
        assertEquals("392", CurrencyUnit.JPY.getNumeric3Code());

        CurrencyUnit cu1 = CurrencyUnit.registerCurrency("CCC", 1, 2, true); // ERROR:
        assertEquals("001", cu1.getNumeric3Code());

        CurrencyUnit cu2 = CurrencyUnit.registerCurrency("XXX", 10, 2, true); // ERROR:
        assertEquals("010", cu2.getNumeric3Code());

        CurrencyUnit cuPseudo = CurrencyUnit.registerCurrency("PSD", -1, 2, true);
        assertEquals("", cuPseudo.getNumeric3Code());
    }

    @Test
    public void test_getSymbol() {
        // Standard currency
        assertNotNull(CurrencyUnit.USD.getSymbol());
        // Custom currency not in JDK
        CurrencyUnit btc = CurrencyUnit.registerCurrency("XBT", 992, 2, true);
        assertEquals("XBT", btc.getSymbol());
        assertEquals("XBT", btc.getSymbol(Locale.US));

        // Special case XXX
        CurrencyUnit xxx = CurrencyUnit.registerCurrency("XXX", 999, 2, true);
        assertEquals("XXX", xxx.getSymbol());
    }

    @Test
    public void test_toCurrency() {
        assertEquals(Currency.getInstance("USD"), CurrencyUnit.USD.toCurrency());
    }

    @Test
    public void test_registeredCurrencies_and_Countries() {
        List<CurrencyUnit> currencies = CurrencyUnit.registeredCurrencies();
        assertTrue(currencies.contains(CurrencyUnit.USD));

        List<String> countries = CurrencyUnit.registeredCountries();
        assertTrue(countries.contains("US"));
    }

    @Test
    public void test_getDecimalPlaces_pseudo() {
        CurrencyUnit pseudo = CurrencyUnit.registerCurrency("PSU", -1, -1, true);
        assertEquals(0, pseudo.getDecimalPlaces());
        assertTrue(pseudo.isPseudoCurrency());
    }
}