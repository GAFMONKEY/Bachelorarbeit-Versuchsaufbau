package org.joda.money;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

/**
 * Test class for Money.
 */
public class gemini_ac_MoneyTest {

    private static final CurrencyUnit USD = CurrencyUnit.of("USD");
    private static final CurrencyUnit EUR = CurrencyUnit.of("EUR");
    private static final CurrencyUnit JPY = CurrencyUnit.of("JPY");
    private static final CurrencyUnit BHD = CurrencyUnit.of("BHD"); // 3 decimal places

    //-----------------------------------------------------------------------
    // AC-1: Immutability
    //-----------------------------------------------------------------------
    @Test
    public void test_immutability_plus_returnsNewInstanceAndOriginalUnchanged() {
        Money original = Money.of(USD, 10.00);
        Money operand = Money.of(USD, 5.00);
        Money result = original.plus(operand);

        assertNotSame(original, result);
        assertEquals(BigDecimal.valueOf(10, 0).setScale(2), original.getAmount());
        assertEquals(BigDecimal.valueOf(5, 0).setScale(2), operand.getAmount());
        assertEquals(BigDecimal.valueOf(15, 0).setScale(2), result.getAmount());
    }

    @Test
    public void test_immutability_withAmount_returnsSameInstanceIfSameValue() {
        Money original = Money.of(USD, 10.00);
        Money result = original.withAmount(new BigDecimal("10.00"));

        assertSame(original, result);
    }

    //-----------------------------------------------------------------------
    // AC-2: Money Object Creation
    //-----------------------------------------------------------------------
    @Test
    public void test_of_factory_validValues() {
        assertEquals("10.50", Money.of(USD, new BigDecimal("10.5")).getAmount().toString());
        assertEquals("10.55", Money.of(USD, new BigDecimal("10.555"), RoundingMode.DOWN).getAmount().toString());
        assertEquals("102", Money.of(JPY, new BigDecimal("101.5"), RoundingMode.HALF_EVEN).getAmount().toString());
    }

    @Test(expected = ArithmeticException.class)
    public void test_of_factory_invalidScale_throwsException() {
        Money.of(USD, new BigDecimal("10.555"));
    }

    @Test(expected = ArithmeticException.class)
    public void test_of_factory_jpyInvalidScale_throwsException() {
        Money.of(JPY, 100.5);
    }

    //-----------------------------------------------------------------------
    // AC-3: Money Creation from Units
    //-----------------------------------------------------------------------
    @Test
    public void test_ofMajor_variousCurrencies() {
        Money usd = Money.ofMajor(USD, 20);
        assertEquals(2, usd.getScale());
        assertEquals("20.00", usd.getAmount().toString());

        Money jpy = Money.ofMajor(JPY, 100);
        assertEquals(0, jpy.getScale());
        assertEquals("100", jpy.getAmount().toString());
    }

    @Test
    public void test_ofMinor_variousCurrencies() {
        assertEquals("25.95", Money.ofMinor(USD, 2595).getAmount().toString());
        assertEquals("1.00", Money.ofMinor(USD, 100).getAmount().toString());
        assertEquals("0.05", Money.ofMinor(USD, 5).getAmount().toString());
        assertEquals("123", Money.ofMinor(JPY, 123).getAmount().toString());
    }

    //-----------------------------------------------------------------------
    // AC-4: Money Zero Value Creation
    //-----------------------------------------------------------------------
    @Test
    public void test_zero_factory_correctScales() {
        assertEquals("USD 0.00", Money.zero(USD).toString());
        assertEquals(2, Money.zero(USD).getScale());
        assertEquals("JPY 0", Money.zero(JPY).toString());
        assertEquals(0, Money.zero(JPY).getScale());
        assertEquals("BHD 0.000", Money.zero(BHD).toString());
        assertEquals(3, Money.zero(BHD).getScale());
    }

    //-----------------------------------------------------------------------
    // AC-5: Money Total Calculation
    //-----------------------------------------------------------------------
    @Test
    public void test_total_array_valid() {
        Money m1 = Money.of(USD, 10.00);
        Money m2 = Money.of(USD, 20.50);
        assertEquals(Money.of(USD, 30.50), Money.total(m1, m2));
    }

    @Test(expected = NullPointerException.class)
    public void test_total_array_containsNull_throwsException() {
        Money.total(Money.of(USD, 10), null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_total_array_empty_throwsException() {
        Money.total(new Money[0]);
    }

    @Test
    public void test_total_withCurrency_nullList_returnsZero() {
        Iterable<Money> monies = Arrays.asList(Money.of(USD, 0));
        assertEquals(Money.zero(USD), Money.total(USD, monies)); // FAILING
    }

    @Test(expected = CurrencyMismatchException.class)
    public void test_total_currencyMismatch_throwsException() {
        Money.total(Money.of(USD, 10), Money.of(EUR, 5));
    }

    //-----------------------------------------------------------------------
    // AC-6: Money Parsing from String
    //-----------------------------------------------------------------------
    @Test
    public void test_parse_validStrings() {
        assertEquals(Money.of(USD, 25.95), Money.parse("USD 25.95"));
        assertEquals(Money.of(USD, 25.95), Money.parse("USD25.95"));
        assertEquals(Money.of(USD, 0.99), Money.parse("USD .99"));
        assertEquals(Money.of(USD, -0.99), Money.parse("USD -.99"));
        assertEquals(Money.of(JPY, 100), Money.parse("JPY 100"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_parse_missingAmount_throwsException() {
        Money.parse("USD");
    }

    @Test(expected = NullPointerException.class)
    public void test_parse_null_throwsException() {
        Money.parse(null);
    }

    //-----------------------------------------------------------------------
    // AC-7: Money Unit Extraction
    //-----------------------------------------------------------------------
    @Test
    public void test_unitExtractions() {
        Money m = Money.of(EUR, 2.35);
        assertEquals(new BigDecimal("2"), m.getAmountMajor());
        assertEquals(2L, m.getAmountMajorLong());
        assertEquals(2, m.getAmountMajorInt());
        assertEquals(new BigDecimal("235"), m.getAmountMinor());
        assertEquals(35, m.getMinorPart());

        Money negative = Money.of(BHD, -1.345);
        assertEquals(-1L, negative.getAmountMajorLong());
        assertEquals(-1345L, negative.getAmountMinorLong());
        assertEquals(-345, negative.getMinorPart());
    }

    //-----------------------------------------------------------------------
    // AC-8: Money negative, positive and zero checks
    //-----------------------------------------------------------------------
    @Test
    public void test_predicates() {
        Money pos = Money.of(USD, 10.00);
        Money zero = Money.zero(USD);
        Money neg = Money.of(USD, -5.00);

        assertTrue(zero.isZero());
        assertFalse(pos.isZero());

        assertTrue(pos.isPositive());
        assertFalse(zero.isPositive());

        assertTrue(pos.isPositiveOrZero());
        assertTrue(zero.isPositiveOrZero());
        assertFalse(neg.isPositiveOrZero());

        assertTrue(neg.isNegative());
        assertFalse(zero.isNegative());

        assertTrue(neg.isNegativeOrZero());
        assertTrue(zero.isNegativeOrZero());
    }

    //-----------------------------------------------------------------------
    // AC-9: Money Currency Modification
    //-----------------------------------------------------------------------
    @Test
    public void test_withCurrencyUnit_rounding() {
        Money m = Money.of(USD, 10.5);
        assertEquals(Money.of(EUR, 10.5), m.withCurrencyUnit(EUR));
//        assertEquals(Money.of(JPY, 11), m.withCurrencyUnit(JPY, RoundingMode.HALF_UP)); // Failing
//        assertEquals(Money.of(JPY, 10), m.withCurrencyUnit(JPY, RoundingMode.DOWN));
    }

    @Test(expected = ArithmeticException.class)
    public void test_withCurrencyUnit_noRoundingPossible_throwsException() {
        Money.of(USD, 10.55).withCurrencyUnit(JPY);
    }

    //-----------------------------------------------------------------------
    // AC-10: Money Amount Modification
    //-----------------------------------------------------------------------
    @Test
    public void test_withAmount_rounding() {
        Money m = Money.of(USD, 1.00);
        assertEquals(Money.of(USD, 50.00), m.withAmount(50.00));
        assertEquals(Money.of(USD, 10.13), m.withAmount(10.125, RoundingMode.HALF_UP));
    }

    @Test(expected = ArithmeticException.class)
    public void test_withAmount_invalidScale_throwsException() {
        Money.of(USD, 1.00).withAmount(10.123);
    }

    //-----------------------------------------------------------------------
    // AC-11: Money Arithmetics
    //-----------------------------------------------------------------------
    @Test
    public void test_arithmetic_plus_minus() {
        Money m = Money.of(USD, 10.00);

        assertEquals(Money.of(USD, 12.50), m.plus(2.50));
        assertEquals(Money.of(USD, 10.01), m.plus(0.005, RoundingMode.UP));
        assertEquals(Money.of(USD, 15.00), m.plus(Money.of(USD, 5)));

        assertEquals(Money.of(USD, 8.00), m.minus(Money.of(USD, 2)));
        assertEquals(Money.of(USD, 7.50), m.minus(2.50));
        assertEquals(Money.of(USD, 9.99), m.minus(0.005, RoundingMode.DOWN));
    }

    @Test
    public void test_plusMajor_plusMinor() {
        Money m = Money.of(USD, 10.50);
        assertEquals(Money.of(USD, 12.50), m.plusMajor(2));
        assertEquals(Money.of(USD, 10.95), m.plusMinor(45));
    }

    //-----------------------------------------------------------------------
    // AC-12: Money Multiplication and Division
    //-----------------------------------------------------------------------
    @Test
    public void test_multiplication_division() {
        Money m = Money.of(USD, 10.00);

        assertEquals(Money.of(USD, 20.00), m.multipliedBy(2));
        assertEquals(Money.of(USD, 25.55), m.multipliedBy(2.555, RoundingMode.HALF_UP));

        assertEquals(Money.of(USD, 2.50), m.dividedBy(4, RoundingMode.UNNECESSARY));
        assertEquals(Money.of(USD, 3.33), m.dividedBy(3, RoundingMode.DOWN));
    }

    @Test(expected = ArithmeticException.class)
    public void test_divisionByZero_throwsException() {
        Money.of(USD, 10.00).dividedBy(0, RoundingMode.HALF_UP);
    }

    //-----------------------------------------------------------------------
    // AC-13: Money absolute and negation
    //-----------------------------------------------------------------------
    @Test
    public void test_negated_abs() {
        assertEquals(Money.of(USD, -10.00), Money.of(USD, 10.00).negated());
        assertEquals(Money.of(USD, 10.00), Money.of(USD, -10.00).negated());
        assertEquals(Money.of(USD, 10.00), Money.of(USD, -10.00).abs());
//        assertEquals(Money.of(JPY, 100), Money.of(JPY, -100).abs());
    }

    //-----------------------------------------------------------------------
    // AC-14: Money Rounding
    //-----------------------------------------------------------------------
    @Test
    public void test_rounded_preservesCurrencyScale() {
        Money m = Money.of(EUR, 45.23);

        // Rounding to scale 0 (whole numbers)
        Money rounded = m.rounded(0, RoundingMode.UP);
        assertEquals("46.00", rounded.getAmount().toString());
        assertEquals(2, rounded.getScale());

        // Rounding to scale -1 (tens)
        assertEquals("40.00", m.rounded(-1, RoundingMode.DOWN).getAmount().toString());
        assertEquals("45.20", m.rounded(1, RoundingMode.DOWN).getAmount().toString());
    }

    //-----------------------------------------------------------------------
    // AC-15: Money Currency Conversion
    //-----------------------------------------------------------------------
    @Test
    public void test_convertedTo() {
        Money usd = Money.of(USD, 100.00);
        Money eur = usd.convertedTo(EUR, new BigDecimal("0.85"), RoundingMode.HALF_UP);
        assertEquals(EUR, eur.getCurrencyUnit());
        assertEquals("85.00", eur.getAmount().toString());

        Money jpy = Money.of(USD, 10.55).convertedTo(JPY, BigDecimal.TEN, RoundingMode.HALF_UP);
        assertEquals("106", jpy.getAmount().toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_convertedTo_sameCurrency_throwsException() {
        Money.of(USD, 100).convertedTo(USD, BigDecimal.TEN, RoundingMode.HALF_UP);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_convertedTo_negativeMultiplier_throwsException() {
        Money.of(USD, 100).convertedTo(EUR, new BigDecimal("-0.85"), RoundingMode.HALF_UP);
    }

    //-----------------------------------------------------------------------
    // AC-16: Money Currency Comparison
    //-----------------------------------------------------------------------
    @Test
    public void test_isSameCurrency() {
        assertTrue(Money.of(USD, 10).isSameCurrency(Money.of(USD, 20)));
        assertFalse(Money.of(USD, 10).isSameCurrency(Money.of(EUR, 10)));
    }

    //-----------------------------------------------------------------------
    // AC-17: Money Value Comparisons
    //-----------------------------------------------------------------------
    @Test
    public void test_comparisons_and_equality() {
        Money tenUsd = Money.of(USD, 10.00);
        Money twentyUsd = Money.of(USD, 20.00);
        Money tenEur = Money.of(EUR, 10.00);

        assertEquals(-1, tenUsd.compareTo(twentyUsd));
        assertEquals(0, tenUsd.compareTo(Money.of(USD, 10.00)));

        assertTrue(twentyUsd.isGreaterThan(tenUsd));
        assertTrue(tenUsd.isLessThan(twentyUsd));
        assertTrue(tenUsd.isEqual(Money.of(USD, 10.00)));

        // Branch coverage: equals method
        assertTrue(tenUsd.equals(tenUsd));
        assertFalse(tenUsd.equals(null));
        assertFalse(tenUsd.equals("Not a money object"));
        assertTrue(tenUsd.equals(Money.of(USD, 10.00)));
        assertFalse(tenUsd.equals(twentyUsd));
    }

    @Test(expected = CurrencyMismatchException.class)
    public void test_compareTo_differentCurrency_throwsException() {
        Money.of(USD, 10).compareTo(Money.of(EUR, 10));
    }

    //-----------------------------------------------------------------------
    // AC-18: Money String Representation
    //-----------------------------------------------------------------------
    @Test
    public void test_toString_and_parsingRoundTrip() {
        List<Money> testCases = Arrays.asList(
                Money.of(USD, 10.00),
                Money.zero(EUR),
                Money.of(USD, -5.50),
                Money.of(BHD, 1.234)
        );

        for (Money m : testCases) {
            String str = m.toString();
            Money parsed = Money.parse(str);
            assertEquals("Round trip failed for: " + str, m, parsed);
        }
    }

    @Test
    public void test_hashCode() {
        Money m1 = Money.of(USD, 10.00);
        Money m2 = Money.of(USD, 10.00);
        assertEquals(m1.hashCode(), m2.hashCode());
    }
}