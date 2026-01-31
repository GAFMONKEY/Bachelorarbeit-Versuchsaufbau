package org.joda.money;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test class for Money.
 * Note: Assumes CurrencyUnit and BigMoney behave as per Joda-Money specification.
 */
public class gemini_noac_MoneyTest {

    private static final CurrencyUnit GBP = CurrencyUnit.GBP;
    private static final CurrencyUnit USD = CurrencyUnit.USD;
    private static final CurrencyUnit JPY = CurrencyUnit.JPY; // 0 decimal places

    private Money moneyGBP10;
    private Money moneyGBP20;

    @Before
    public void setUp() {
        moneyGBP10 = Money.of(GBP, BigDecimal.valueOf(10));
        moneyGBP20 = Money.of(GBP, BigDecimal.valueOf(20));
    }

    //-----------------------------------------------------------------------
    // Factories
    //-----------------------------------------------------------------------
    @Test
    public void test_of_CurrencyBigDecimal() {
        Money test = Money.of(GBP, new BigDecimal("10.00"));
        assertEquals(GBP, test.getCurrencyUnit());
        assertEquals(new BigDecimal("10.00"), test.getAmount());
    }

    @Test(expected = ArithmeticException.class)
    public void test_of_CurrencyBigDecimal_tooManyDecimalPlaces() {
        Money.of(GBP, new BigDecimal("10.001"));
    }

    @Test(expected = NullPointerException.class)
    public void test_of_CurrencyBigDecimal_nullCurrency() {
        Money.of((CurrencyUnit) null, new BigDecimal("10.00"));
    }

    @Test(expected = NullPointerException.class)
    public void test_of_CurrencyBigDecimal_nullAmount() {
        Money.of(GBP, (BigDecimal) null);
    }

    @Test
    public void test_of_CurrencyBigDecimalRounding() {
        Money test = Money.of(GBP, new BigDecimal("10.001"), RoundingMode.DOWN);
        assertEquals(new BigDecimal("10.00"), test.getAmount());
    }

    @Test
    public void test_of_CurrencyDouble() {
        Money test = Money.of(GBP, 10.0);
        assertEquals(new BigDecimal("10.00"), test.getAmount());
    }

    @Test
    public void test_ofMajor() {
        Money test = Money.ofMajor(GBP, 10);
        assertEquals(new BigDecimal("10.00"), test.getAmount());
    }

    @Test
    public void test_ofMinor() {
        Money test = Money.ofMinor(GBP, 1050);
        assertEquals(new BigDecimal("10.50"), test.getAmount());
    }

    @Test
    public void test_zero() {
        Money test = Money.zero(GBP);
        assertEquals(BigDecimal.ZERO.setScale(2), test.getAmount());
    }

    @Test
    public void test_of_BigMoneyProvider() {
        BigMoney big = BigMoney.of(GBP, new BigDecimal("10.00"));
        Money test = Money.of(big);
        assertEquals(big, test.toBigMoney());
    }

    @Test(expected = ArithmeticException.class)
    public void test_of_BigMoneyProvider_invalidScale() {
        BigMoney big = BigMoney.of(GBP, new BigDecimal("10.001"));
        Money.of(big);
    }

    //-----------------------------------------------------------------------
    // Total
    //-----------------------------------------------------------------------
    @Test
    public void test_total_Array() {
        Money test = Money.total(moneyGBP10, moneyGBP20);
        assertEquals(Money.of(GBP, 30), test);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_total_Array_empty() {
        Money.total(new Money[0]);
    }

    @Test(expected = NullPointerException.class)
    public void test_total_Array_nullEntry() {
        Money.total(moneyGBP10, null);
    }

    @Test
    public void test_total_Iterable() {
        List<Money> list = Arrays.asList(moneyGBP10, moneyGBP20);
        assertEquals(Money.of(GBP, 30), Money.total(list));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_total_Iterable_empty() {
        Money.total(new ArrayList<Money>());
    }

    @Test
    public void test_total_Currency_Array() {
        assertEquals(Money.of(GBP, 10), Money.total(GBP, moneyGBP10));
        assertEquals(Money.zero(USD), Money.total(USD));
    }

    //-----------------------------------------------------------------------
    // Parse
    //-----------------------------------------------------------------------
    @Test
    public void test_parse() {
        Money test = Money.parse("GBP 10.00");
        assertEquals(moneyGBP10, test);
    }

    //-----------------------------------------------------------------------
    // Basic Methods
    //-----------------------------------------------------------------------
    @Test
    public void test_getters() {
        Money test = Money.ofMinor(GBP, 1234); // 12.34
        assertEquals(GBP, test.getCurrencyUnit());
        assertEquals(2, test.getScale());
        assertEquals(new BigDecimal("12.34"), test.getAmount());
        assertEquals(new BigDecimal("12"), test.getAmountMajor());
        assertEquals(12L, test.getAmountMajorLong());
        assertEquals(12, test.getAmountMajorInt());
        assertEquals(new BigDecimal("1234"), test.getAmountMinor());
        assertEquals(1234L, test.getAmountMinorLong());
        assertEquals(1234, test.getAmountMinorInt());
        assertEquals(34, test.getMinorPart());
    }

    @Test
    public void test_booleanChecks() {
        Money pos = Money.of(GBP, 1);
        Money zero = Money.zero(GBP);
        Money neg = Money.of(GBP, -1);

        assertTrue(pos.isPositive());
        assertTrue(pos.isPositiveOrZero());
        assertFalse(pos.isNegative());
        assertFalse(pos.isZero());

        assertTrue(zero.isZero());
        assertTrue(zero.isPositiveOrZero());
        assertTrue(zero.isNegativeOrZero());

        assertTrue(neg.isNegative());
        assertTrue(neg.isNegativeOrZero());
        assertFalse(neg.isPositive());
    }

    //-----------------------------------------------------------------------
    // Operations
    //-----------------------------------------------------------------------
    @Test
    public void test_withCurrencyUnit() {
        Money test = moneyGBP10.withCurrencyUnit(USD, RoundingMode.UNNECESSARY);
        assertEquals(USD, test.getCurrencyUnit());
        assertEquals(moneyGBP10.getAmount(), test.getAmount());
    }

    @Test
    public void test_plus_Money() {
        Money test = moneyGBP10.plus(moneyGBP10);
        assertEquals(moneyGBP20, test);
    }

    @Test
    public void test_plus_BigDecimal() {
        Money test = moneyGBP10.plus(new BigDecimal("5.00"));
        assertEquals(Money.of(GBP, 15), test);
    }

    @Test
    public void test_plus_double() {
        Money test = moneyGBP10.plus(5.0);
        assertEquals(Money.of(GBP, 15), test);
    }

    @Test
    public void test_minus_Money() {
        Money test = moneyGBP20.minus(moneyGBP10);
        assertEquals(moneyGBP10, test);
    }

    @Test
    public void test_multipliedBy() {
        Money test = moneyGBP10.multipliedBy(2);
        assertEquals(moneyGBP20, test);

        Money testDec = moneyGBP10.multipliedBy(new BigDecimal("1.5"), RoundingMode.UNNECESSARY);
        assertEquals(Money.of(GBP, 15), testDec);
    }

    @Test
    public void test_dividedBy() {
        Money test = moneyGBP20.dividedBy(2, RoundingMode.UNNECESSARY);
        assertEquals(moneyGBP10, test);
    }

    @Test
    public void test_negated() {
        Money test = moneyGBP10.negated();
        assertEquals(new BigDecimal("-10.00"), test.getAmount());
    }

    @Test
    public void test_abs() {
        assertEquals(moneyGBP10, moneyGBP10.negated().abs());
        assertEquals(moneyGBP10, moneyGBP10.abs());
    }

    @Test
    public void test_rounded() {
        Money test = Money.of(GBP, new BigDecimal("10.55"));
        assertEquals(Money.of(GBP, 11), test.rounded(0, RoundingMode.HALF_UP));
    }

    @Test
    public void test_withAmount_noChange() {
        Money test = moneyGBP10.withAmount(new BigDecimal("10.00"));
        assertSame(moneyGBP10, test); // ADDED: Initial problem with incorrect import
    }

    //-----------------------------------------------------------------------
    // Comparison
    //-----------------------------------------------------------------------
    @Test
    public void test_comparisons() {
        assertTrue(moneyGBP20.isGreaterThan(moneyGBP10));
        assertTrue(moneyGBP10.isLessThan(moneyGBP20));
        assertTrue(moneyGBP10.isEqual(Money.of(GBP, 10)));
        assertEquals(1, moneyGBP20.compareTo(moneyGBP10));
        assertEquals(0, moneyGBP10.compareTo(moneyGBP10));
        assertEquals(-1, moneyGBP10.compareTo(moneyGBP20));
    }

    @Test
    public void test_isSameCurrency() {
        assertTrue(moneyGBP10.isSameCurrency(moneyGBP20));
        assertFalse(moneyGBP10.isSameCurrency(Money.of(USD, 10)));
    }

    //-----------------------------------------------------------------------
    // Equals/HashCode/ToString
    //-----------------------------------------------------------------------
    @Test
    public void test_equals() {
        assertTrue(moneyGBP10.equals(moneyGBP10));
        assertTrue(moneyGBP10.equals(Money.of(GBP, 10)));
        assertFalse(moneyGBP10.equals(moneyGBP20));
        assertFalse(moneyGBP10.equals(Money.of(USD, 10)));
        assertFalse(moneyGBP10.equals("Not AMoney"));
        assertFalse(moneyGBP10.equals(null));
    }

    @Test
    public void test_hashCode() {
        assertEquals(moneyGBP10.hashCode(), Money.of(GBP, 10).hashCode());
    }

    @Test
    public void test_toString() {
        assertEquals("GBP 10.00", moneyGBP10.toString());
    }
}