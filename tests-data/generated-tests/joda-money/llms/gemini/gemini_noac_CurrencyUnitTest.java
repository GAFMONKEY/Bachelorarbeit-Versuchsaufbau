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
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Test class for CurrencyUnit.
 * Focuses on high coverage, edge cases, and behavior verification.
 */
public class gemini_noac_CurrencyUnitTest {

    // --- Added later so global state is properly reset for MoneyTests
    @After
    public void tearDown() {
        CurrencyUnit.setup();
    }
    // --

    // --- Static Factory Methods & Cache ---

    @Test
    public void test_of_String_valid() {
        CurrencyUnit test = CurrencyUnit.of("USD");
        assertEquals("USD", test.getCode());
        assertEquals(840, test.getNumericCode());
        assertEquals(2, test.getDecimalPlaces());
    }

    @Test(expected = IllegalCurrencyException.class)
    public void test_of_String_unknown() {
        CurrencyUnit.of("XYZ");
    }

    @Test(expected = NullPointerException.class)
    public void test_of_String_null() {
        CurrencyUnit.of((String) null);
    }

    @Test
    public void test_of_Currency() {
        Currency cur = Currency.getInstance("EUR");
        CurrencyUnit test = CurrencyUnit.of(cur);
        assertEquals("EUR", test.getCode());
    }

    @Test(expected = NullPointerException.class)
    public void test_of_Currency_null() {
        CurrencyUnit.of((Currency) null);
    }

    @Test
    public void test_ofNumericCode_int() {
        CurrencyUnit test = CurrencyUnit.ofNumericCode(840);
        assertEquals("USD", test.getCode());
    }

    @Test(expected = IllegalCurrencyException.class)
    public void test_ofNumericCode_int_unknown() {
        CurrencyUnit.ofNumericCode(998);
    }

    @Test
    public void test_ofNumericCode_String_variousLengths() {
        // Test single digit padding logic
        CurrencyUnit.registerCurrency("XXX", 1, 2, true); // Error:
        assertEquals("XXX", CurrencyUnit.ofNumericCode("1").getCode());

        // Test double digit padding logic
        CurrencyUnit.registerCurrency("XCX", 10, 2, true); // Error:
        assertEquals("XCX", CurrencyUnit.ofNumericCode("10").getCode());

        // Test triple digit
        assertEquals("USD", CurrencyUnit.ofNumericCode("840").getCode());
    }

    @Test(expected = IllegalCurrencyException.class)
    public void test_ofNumericCode_String_invalidLength() {
        CurrencyUnit.ofNumericCode("1234");
    }

    @Test(expected = NullPointerException.class)
    public void test_ofNumericCode_String_null() {
        CurrencyUnit.ofNumericCode((String) null);
    }

    @Test
    public void test_of_Locale() {
        CurrencyUnit test = CurrencyUnit.of(Locale.US);
        assertEquals("USD", test.getCode());
    }

    @Test(expected = IllegalCurrencyException.class)
    public void test_of_Locale_unknown() {
        CurrencyUnit.of(new Locale("xx", "YY"));
    }

    @Test
    public void test_ofCountry_valid() {
        CurrencyUnit test = CurrencyUnit.ofCountry("GB");
        assertEquals("GBP", test.getCode());
    }

    // --- Registration Logic ---

    @Test
    public void test_registerCurrency_new() {
        CurrencyUnit.registerCurrency("TST", 991, 2, Arrays.asList("TS"), false);
        CurrencyUnit test = CurrencyUnit.of("TST");
        assertEquals("TST", test.getCode());
        assertEquals(991, test.getNumericCode());
        assertEquals(2, test.getDecimalPlaces());
        assertEquals("TST", CurrencyUnit.ofCountry("TS").getCode());
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_registerCurrency_duplicateCode() {
        CurrencyUnit.registerCurrency("USD", 840, 2, false);
    }

    @Test
    public void test_registerCurrency_force() {
        CurrencyUnit.registerCurrency("USD", 840, 3, true);
        CurrencyUnit test = CurrencyUnit.of("USD");
        assertEquals(3, test.getDecimalPlaces());
        // Restore original
        CurrencyUnit.registerCurrency("USD", 840, 2, true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_registerCurrency_invalidCode_length() {
        CurrencyUnit.registerCurrency("US", 840, 2, false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_registerCurrency_invalidCode_notUpper() {
        CurrencyUnit.registerCurrency("usd", 840, 2, false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_registerCurrency_invalidNumericCode_low() {
        CurrencyUnit.registerCurrency("ABC", -2, 2, false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_registerCurrency_invalidNumericCode_high() {
        CurrencyUnit.registerCurrency("ABC", 1000, 2, false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_registerCurrency_invalidDecimalPlaces_low() {
        CurrencyUnit.registerCurrency("ABC", 123, -2, false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_registerCurrency_invalidDecimalPlaces_high() {
        CurrencyUnit.registerCurrency("ABC", 123, 31, false);
    }

    @Test
    public void test_registerCurrency_pseudo() {
        // Register a pseudo currency (decimal places -1)
        CurrencyUnit.registerCurrency("PSD", 992, -1, false);
        CurrencyUnit test = CurrencyUnit.of("PSD");
        assertTrue(test.isPseudoCurrency());
        assertEquals(0, test.getDecimalPlaces());
    }

    // --- Instance Methods ---

    @Test
    public void test_getNumeric3Code() {
        assertEquals("840", CurrencyUnit.of("USD").getNumeric3Code());

        CurrencyUnit.registerCurrency("CCC", 1, 2, true); // ERROR:
        assertEquals("001", CurrencyUnit.of("CCC").getNumeric3Code());

        CurrencyUnit.registerCurrency("CCT", 10, 2, true); // ERROR:
        assertEquals("010", CurrencyUnit.of("CCT").getNumeric3Code());

        CurrencyUnit.registerCurrency("NEG", -1, 2, true);
        assertEquals("", CurrencyUnit.of("NEG").getNumeric3Code());
    }

    @Test
    public void test_getCountryCodes() {
        CurrencyUnit.registerCurrency("CTY", 993, 2, Arrays.asList("AA", "BB"), true);
        Set<String> countries = CurrencyUnit.of("CTY").getCountryCodes();
        assertTrue(countries.contains("AA"));
        assertTrue(countries.contains("BB"));
        assertEquals(2, countries.size());
    }

    @Test
    public void test_getSymbol_standard() {
        // Note: Actual symbol depends on JVM locale data, but USD usually $
        assertNotNull(CurrencyUnit.of("USD").getSymbol());
    }

    @Test
    public void test_getSymbol_XXX() {
        // Special case in code
        CurrencyUnit.registerCurrency("XXX", 999, 0, true);
        assertEquals("XXX", CurrencyUnit.of("XXX").getSymbol());
    }

    @Test
    public void test_getSymbol_Locale() {
        assertNotNull(CurrencyUnit.of("USD").getSymbol(Locale.US));
    }

    @Test
    public void test_toCurrency() {
        Currency cur = CurrencyUnit.of("USD").toCurrency();
        assertEquals("USD", cur.getCurrencyCode());
    }

    // --- Standard Object Methods ---

    @Test
    public void test_compareTo() {
        assertTrue(CurrencyUnit.of("AUD").compareTo(CurrencyUnit.of("USD")) < 0);
        assertTrue(CurrencyUnit.of("USD").compareTo(CurrencyUnit.of("AUD")) > 0);
        assertEquals(0, CurrencyUnit.of("USD").compareTo(CurrencyUnit.of("USD")));
    }

    @Test
    public void test_equals_hashCode() {
        CurrencyUnit usd1 = CurrencyUnit.of("USD");
        CurrencyUnit usd2 = CurrencyUnit.of("USD");
        CurrencyUnit eur = CurrencyUnit.of("EUR");

        assertTrue(usd1.equals(usd1));
        assertTrue(usd1.equals(usd2));
        assertFalse(usd1.equals(eur));
        assertFalse(usd1.equals("USD"));
        assertFalse(usd1.equals(null));

        assertEquals(usd1.hashCode(), usd2.hashCode());
    }

    @Test
    public void test_toString() {
        assertEquals("USD", CurrencyUnit.of("USD").toString());
    }

    // --- Collections ---

    @Test
    public void test_registeredCurrencies() {
        List<CurrencyUnit> list = CurrencyUnit.registeredCurrencies();
        assertTrue(list.contains(CurrencyUnit.USD));
        assertTrue(list.contains(CurrencyUnit.EUR));
    }

    @Test
    public void test_registeredCountries() {
        List<String> list = CurrencyUnit.registeredCountries();
        assertTrue(list.contains("US"));
        assertTrue(list.contains("GB"));
    }
}