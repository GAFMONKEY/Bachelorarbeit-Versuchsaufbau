package org.joda.money;

import org.evosuite.shaded.org.mockito.internal.matchers.Null;
import org.junit.Test;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class gpt_ac_MoneyTest {

    private static CurrencyUnit ccy(String code) {
        return CurrencyUnit.of(code);
    }

    private static BigDecimal bd(String val) {
        return new BigDecimal(val);
    }

    private static void assertMoney(String expectedToString, Money actual) {
        assertNotNull(actual);
        assertEquals(expectedToString, actual.toString());
    }

    private interface ThrowingRunnable {
        void run() throws Exception;
    }

    private static <T extends Throwable> T assertThrows(Class<T> expected, ThrowingRunnable r) {
        try {
            r.run();
        } catch (Throwable t) {
            if (t instanceof InvocationTargetException) {
                t = ((InvocationTargetException) t).getTargetException();
            }
            if (expected.isInstance(t)) {
                return expected.cast(t);
            }
            fail("Expected " + expected.getName() + " but got " + t.getClass().getName() + ": " + t.getMessage());
        }
        fail("Expected " + expected.getName() + " but no exception was thrown");
        return null;
    }

    @Test
    public void ac1_immutability_withAmount_plus_minus_returnNewInstanceAndDoNotMutateInputs() {
        Money original = Money.of(ccy("USD"), bd("10.00"));
        Money operand = Money.of(ccy("USD"), bd("2.50"));

        Money changedAmount = original.withAmount(bd("12.50"));
        Money plus = original.plus(operand);
        Money minus = original.minus(operand);

        // new instances
        assertNotSame(original, changedAmount);
        assertNotSame(original, plus);
        assertNotSame(original, minus);

        // updated state
        assertMoney("USD 12.50", changedAmount);
        assertMoney("USD 12.50", plus);
        assertMoney("USD 7.50", minus);

        // original + operand unchanged
        assertMoney("USD 10.00", original);
        assertMoney("USD 2.50", operand);
    }

    @Test
    public void immutability_noOpOperationsMayReturnSameInstance_referenceEqualityOptimizationsCovered() {
        Money m = Money.of(ccy("USD"), bd("10.00"));

        Money plusZero = m.plus(BigDecimal.ZERO);
        assertSame("plus(0) should be optimized to same instance", m, plusZero);

        Money absNonNegative = m.abs();
        assertSame("abs() on non-negative should return same instance", m, absNonNegative);

        Money negatedZero = Money.zero(ccy("USD")).negated();
        // assertSame("negated() on zero should be optimized to same instance", Money.zero(ccy("USD")), Money.zero(ccy("USD"))); // FAILING: Bad LLM assumption
        assertMoney("USD 0.00", negatedZero);
    }

    @Test
    public void ac2_moneyOf_withoutRounding_validAndInvalidScales() {
        Money usd1050 = Money.of(ccy("USD"), bd("10.50"));
        assertMoney("USD 10.50", usd1050);
        assertEquals(2, usd1050.getScale());
        assertEquals(bd("10.50"), usd1050.getAmount());

        assertThrows(ArithmeticException.class, () -> Money.of(ccy("USD"), bd("10.555")));
        assertThrows(ArithmeticException.class, () -> Money.of(ccy("JPY"), bd("100.5")));
    }

    @Test
    public void ac2_moneyOf_withRoundingMode_appliesRoundingToCurrencyScale() {
        Money usdDown = Money.of(ccy("USD"), bd("10.555"), RoundingMode.DOWN);
        assertMoney("USD 10.55", usdDown);
        assertEquals(bd("10.55"), usdDown.getAmount());

        Money jpyHalfEven = Money.of(ccy("JPY"), bd("101.5"), RoundingMode.HALF_EVEN);
        assertMoney("JPY 102", jpyHalfEven);
        assertEquals(0, jpyHalfEven.getScale());
        assertEquals(bd("102"), jpyHalfEven.getAmount());

        assertThrows(NullPointerException.class, () -> Money.of(null, bd("1.00"), RoundingMode.UNNECESSARY));
        assertThrows(NullPointerException.class, () -> Money.of(ccy("USD"), null, RoundingMode.UNNECESSARY));
        assertThrows(NullPointerException.class, () -> Money.of(ccy("USD"), bd("1.00"), null));
    }

    @Test
    public void ac3_ofMajor_createsCurrencyScaleAmounts() {
        Money usd20 = Money.ofMajor(ccy("USD"), 20);
        assertMoney("USD 20.00", usd20);
        assertEquals(2, usd20.getScale());
        assertEquals(bd("20.00"), usd20.getAmount());

        Money eur0 = Money.ofMajor(ccy("EUR"), 0);
        assertMoney("EUR 0.00", eur0);
        assertEquals(2, eur0.getScale());

        Money jpy100 = Money.ofMajor(ccy("JPY"), 100);
        assertMoney("JPY 100", jpy100);
        assertEquals(0, jpy100.getScale());
        assertEquals(bd("100"), jpy100.getAmount());
    }

    @Test
    public void ac3_ofMinor_createsFromMinorUnits() {
        Money usd2595 = Money.ofMinor(ccy("USD"), 2595);
        assertMoney("USD 25.95", usd2595);
        assertEquals(2, usd2595.getScale());
        assertEquals(bd("25.95"), usd2595.getAmount());

        Money usd100 = Money.ofMinor(ccy("USD"), 100);
        assertMoney("USD 1.00", usd100);
        assertEquals(bd("1.00"), usd100.getAmount());

        Money usd5 = Money.ofMinor(ccy("USD"), 5);
        assertMoney("USD 0.05", usd5);
        assertEquals(bd("0.05"), usd5.getAmount());

        Money jpy123 = Money.ofMinor(ccy("JPY"), 123);
        assertMoney("JPY 123", jpy123);
        assertEquals(0, jpy123.getScale());
        assertEquals(bd("123"), jpy123.getAmount());
    }

    @Test
    public void ac4_zero_hasCorrectScaleAndStringRepresentation() {
        Money usd0 = Money.zero(ccy("USD"));
        assertMoney("USD 0.00", usd0);
        assertEquals(2, usd0.getScale());
        assertEquals(bd("0.00"), usd0.getAmount());

        Money eur0 = Money.zero(ccy("EUR"));
        assertMoney("EUR 0.00", eur0);
        assertEquals(2, eur0.getScale());

        Money jpy0 = Money.zero(ccy("JPY"));
        assertMoney("JPY 0", jpy0);
        assertEquals(0, jpy0.getScale());
        assertEquals(bd("0"), jpy0.getAmount());

        Money bhd0 = Money.zero(ccy("BHD"));
        assertMoney("BHD 0.000", bhd0);
        assertEquals(3, bhd0.getScale());
        assertEquals(bd("0.000"), bhd0.getAmount());

        assertThrows(NullPointerException.class, () -> Money.zero(null));
    }

    @Test
    public void ac5_total_varargs_sumsAndValidates() {
        Money total = Money.total(Money.parse("USD 10"), Money.parse("USD 20.50"));
        assertMoney("USD 30.50", total);

        assertThrows(NullPointerException.class, () -> Money.total(Money.parse("USD 10"), Money.parse("USD 20.50"), null));
        assertThrows(IllegalArgumentException.class, () -> Money.total(new Money[0]));

        // null array itself: accept either NPE/IAE depending on MoneyUtils implementation, but must throw
        assertThrows(RuntimeException.class, () -> Money.total((Money[]) null));
    }

    @Test
    public void ac5_total_iterable_sumsAndValidates() {
        Money total = Money.total(Arrays.asList(Money.parse("USD 10"), Money.parse("USD 20.50")));
        assertMoney("USD 30.50", total);

        assertThrows(NullPointerException.class, () -> Money.total((Iterable<Money>) null)); // FAILING: LLM assumed wrong exception type
        assertThrows(IllegalArgumentException.class, () -> Money.total(Collections.<Money>emptyList()));
        assertThrows(NullPointerException.class, () -> Money.total(Arrays.asList(Money.parse("USD 10"), null)));
    }

    @Test
    public void ac5_total_withCurrency_behavesPerAcceptance() {
        Money total = Money.total(ccy("USD"), Arrays.asList(Money.parse("USD 10"), Money.parse("USD 20.50")));
        assertMoney("USD 30.50", total);

        // Money nullIterableTotal = Money.total(ccy("USD"), (Iterable<Money>) null); FAILING: Wrong assumption by LLM
        // assertMoney("USD 0.00", nullIterableTotal);

        assertThrows(CurrencyMismatchException.class, () ->
                Money.total(ccy("USD"), Arrays.asList(Money.parse("USD 10"), Money.parse("EUR 5"))));

        assertThrows(CurrencyMismatchException.class, () ->
                Money.total(ccy("USD"), Arrays.asList(Money.parse("EUR 5"))));
    }

    @Test
    public void ac6_parse_validFormats() {
        assertEquals(Money.of(ccy("USD"), bd("25.95")), Money.parse("USD 25.95"));
        assertEquals(Money.of(ccy("EUR"), bd("10.00")), Money.parse("EUR 10"));
        assertEquals(Money.of(ccy("USD"), bd("25.95")), Money.parse("USD25.95"));
        assertEquals(Money.of(ccy("GBP"), bd("100.50")), Money.parse("GBP   100.50"));
        assertEquals(Money.of(ccy("USD"), bd("0.99")), Money.parse("USD .99"));
        assertEquals(Money.of(ccy("USD"), bd("0.99")), Money.parse("USD +.99"));
        assertEquals(Money.of(ccy("USD"), bd("-0.99")), Money.parse("USD -.99"));
        assertEquals(Money.of(ccy("USD"), bd("25.95")), Money.parse("USD +25.95"));
        assertEquals(Money.of(ccy("USD"), bd("-25.95")), Money.parse("USD -25.95"));
        assertEquals(Money.of(ccy("JPY"), bd("100")), Money.parse("JPY 100"));
    }

    @Test
    public void ac6_parse_invalidFormats() {
        assertThrows(IllegalArgumentException.class, () -> Money.parse("USD"));
        assertThrows(IllegalArgumentException.class, () -> Money.parse("25.95 USD"));
        assertThrows(IllegalArgumentException.class, () -> Money.parse("GBX 25.95"));
        assertThrows(IllegalArgumentException.class, () -> Money.parse("USD 25.95.1"));
        assertThrows(IllegalArgumentException.class, () -> Money.parse(""));
        assertThrows(NullPointerException.class, () -> Money.parse(null));
    }

    @Test
    public void ac7_unitExtraction_major_minor_minorPart() {
        Money eur235 = Money.of(ccy("EUR"), bd("2.35"));
        assertEquals(bd("2"), eur235.getAmountMajor());
        assertEquals(2L, eur235.getAmountMajorLong());
        assertEquals(2, eur235.getAmountMajorInt());
        assertEquals(bd("235"), eur235.getAmountMinor());
        assertEquals(235L, eur235.getAmountMinorLong());
        assertEquals(235, eur235.getAmountMinorInt());
        assertEquals(35, eur235.getMinorPart());

        Money bhdNeg = Money.of(ccy("BHD"), bd("-1.345"));
        assertEquals(bd("-1"), bhdNeg.getAmountMajor());
        assertEquals(bd("-1345"), bhdNeg.getAmountMinor());
        assertEquals(-1345L, bhdNeg.getAmountMinorLong());
        assertEquals(-1345, bhdNeg.getAmountMinorInt());
        assertEquals(345, Money.of(ccy("BHD"), bd("1.345")).getMinorPart());

        Money eurNeg235 = Money.of(ccy("EUR"), bd("-2.35"));
        assertEquals(-35, eurNeg235.getMinorPart());

        Money jpy100 = Money.of(ccy("JPY"), bd("100"));
        assertEquals(bd("100"), jpy100.getAmountMinor());
        assertEquals(0, jpy100.getMinorPart());
    }

    @Test
    public void ac8_predicates_positive_negative_zero() {
        Money zero = Money.of(ccy("USD"), bd("0.00"));
        assertTrue(zero.isZero());
        assertFalse(zero.isPositive());
        assertTrue(zero.isPositiveOrZero());
        assertFalse(zero.isNegative());
        assertTrue(zero.isNegativeOrZero());

        Money pos = Money.of(ccy("USD"), bd("10.00"));
        assertFalse(pos.isZero());
        assertTrue(pos.isPositive());
        assertTrue(pos.isPositiveOrZero());
        assertFalse(pos.isNegative());
        assertFalse(pos.isNegativeOrZero());

        Money neg = Money.of(ccy("USD"), bd("-5.00"));
        assertFalse(neg.isZero());
        assertFalse(neg.isPositive());
        assertFalse(neg.isPositiveOrZero());
        assertTrue(neg.isNegative());
        assertTrue(neg.isNegativeOrZero());
    }

    @Test
    public void ac9_withCurrencyUnit_changesCurrencyAndRoundsIfNeeded() {
        Money usd1050 = Money.parse("USD 10.50");
        Money eur1050 = usd1050.withCurrencyUnit(ccy("EUR"));
        assertMoney("EUR 10.50", eur1050);
        assertMoney("USD 10.50", usd1050);
        assertNotSame(usd1050, eur1050);

        Money jpy100 = Money.parse("JPY 100");
        Money usd100 = jpy100.withCurrencyUnit(ccy("USD"));
        assertMoney("USD 100.00", usd100);
        assertEquals(2, usd100.getScale());

        Money usd1055 = Money.parse("USD 10.55");
        assertThrows(ArithmeticException.class, () -> usd1055.withCurrencyUnit(ccy("JPY")));
        assertMoney("JPY 11", usd1055.withCurrencyUnit(ccy("JPY"), RoundingMode.HALF_UP));
        assertMoney("JPY 10", usd1055.withCurrencyUnit(ccy("JPY"), RoundingMode.DOWN));
    }

    @Test
    public void ac10_withAmount_replacesAmountWithOptionalRounding() {
        Money startUsd = Money.parse("USD 1.00");
        Money replaced = startUsd.withAmount(bd("50.00"));
        assertMoney("USD 50.00", replaced);
        assertMoney("USD 1.00", startUsd);
        assertNotSame(startUsd, replaced);

        Money startJpy = Money.parse("JPY 1");
        assertMoney("JPY 500", startJpy.withAmount(bd("500")));

        assertThrows(ArithmeticException.class, () -> startUsd.withAmount(bd("10.123")));
        assertMoney("USD 10.13", startUsd.withAmount(bd("10.125"), RoundingMode.HALF_UP));
        assertMoney("USD 10.12", startUsd.withAmount(bd("10.129"), RoundingMode.DOWN));
        assertMoney("JPY 101", startJpy.withAmount(bd("100.6"), RoundingMode.HALF_UP));
    }

    @Test
    public void ac11_arithmetics_plus_minus_major_minor_andCurrencyMismatch() {
        Money usd1000 = Money.parse("USD 10.00");
        assertMoney("USD 12.50", usd1000.plus(bd("2.50")));
        assertMoney("USD 10.01", usd1000.plus(bd("0.005"), RoundingMode.UP));
        assertMoney("USD 10.00", usd1000.plus(bd("0.005"), RoundingMode.DOWN));
        assertThrows(ArithmeticException.class, () -> usd1000.plus(bd("0.005")));

        assertMoney("USD 15.00", usd1000.plus(Money.parse("USD 5")));
        assertMoney("USD 13.00", usd1000.plus(Arrays.asList(Money.parse("USD 1"), Money.parse("USD 2"))));
        assertThrows(CurrencyMismatchException.class, () -> usd1000.plus(Arrays.asList(Money.parse("USD 1"), Money.parse("EUR 2"))));

        assertMoney("USD 8.00", usd1000.minus(Money.parse("USD 2.00")));
        assertMoney("USD 7.00", usd1000.minus(Arrays.asList(Money.parse("USD 1"), Money.parse("USD 2"))));
        assertThrows(CurrencyMismatchException.class, () -> usd1000.minus(Arrays.asList(Money.parse("USD 1"), Money.parse("EUR 2"))));

        assertMoney("USD 7.50", usd1000.minus(bd("2.50")));
        assertMoney("USD 10.00", usd1000.minus(bd("0.005"), RoundingMode.UP));
        assertMoney("USD 9.99", usd1000.minus(bd("0.005"), RoundingMode.DOWN));
        assertThrows(ArithmeticException.class, () -> usd1000.minus(bd("0.005")));

        Money usd1050 = Money.parse("USD 10.50");
        assertMoney("USD 12.50", usd1050.plusMajor(2));
        assertMoney("USD 10.95", usd1050.plusMinor(45));
        assertMoney("USD 8.50", usd1050.minusMajor(2));
        assertMoney("USD 10.05", usd1050.minusMinor(45));
    }

    @Test
    public void ac12_multiplication_and_division() {
        Money usd1000 = Money.parse("USD 10.00");
        assertMoney("USD 20.00", usd1000.multipliedBy(2L));
        assertMoney("USD -10.00", Money.parse("USD -5.00").multipliedBy(2L));

        assertMoney("USD 25.00", usd1000.multipliedBy(bd("2.5"), RoundingMode.UNNECESSARY));
        assertMoney("USD 25.55", usd1000.multipliedBy(bd("2.555"), RoundingMode.HALF_UP));
        assertThrows(ArithmeticException.class, () -> usd1000.multipliedBy(bd("2.5555"), RoundingMode.UNNECESSARY)); // FAILING: LLM used bad logic

        assertMoney("USD 5.00", usd1000.dividedBy(2L, RoundingMode.UNNECESSARY));
        assertMoney("USD 2.50", usd1000.dividedBy(4L, RoundingMode.UNNECESSARY));
        assertMoney("USD 3.33", usd1000.dividedBy(3L, RoundingMode.HALF_UP));
        assertMoney("USD 3.33", usd1000.dividedBy(3L, RoundingMode.DOWN));
        assertThrows(ArithmeticException.class, () -> usd1000.dividedBy(3L, RoundingMode.UNNECESSARY));
        assertThrows(ArithmeticException.class, () -> usd1000.dividedBy(0L, RoundingMode.HALF_UP));
        assertThrows(ArithmeticException.class, () -> usd1000.dividedBy(0.0d, RoundingMode.HALF_UP));
    }

    @Test
    public void ac13_abs_and_negated() {
        assertMoney("USD -10.00", Money.parse("USD 10.00").negated());
        assertMoney("USD 10.00", Money.parse("USD -10.00").negated());
        assertMoney("USD 0.00", Money.parse("USD 0.00").negated());
        assertMoney("JPY -100", Money.parse("JPY 100").negated());

        assertMoney("USD 10.00", Money.parse("USD 10.00").abs());
        Money neg = Money.parse("USD -10.00");
        Money abs = neg.abs();
        assertMoney("USD 10.00", abs);
        assertNotSame("abs() on negative should create a new instance via negated()", neg, abs);

        assertMoney("JPY 100", Money.parse("JPY -100").abs());
    }

    @Test
    public void ac14_rounding_money_keepsCurrencyScaleAndDoesNotMutateOriginal() {
        Money original = Money.parse("EUR 45.23");
        assertEquals(2, original.getScale());

        Money downMinus1 = original.rounded(-1, RoundingMode.DOWN);
        assertMoney("EUR 40.00", downMinus1);
        assertEquals(2, downMinus1.getScale());

        Money upMinus1 = original.rounded(-1, RoundingMode.UP);
        assertMoney("EUR 50.00", upMinus1);

        assertMoney("EUR 45.00", original.rounded(0, RoundingMode.DOWN));
        assertMoney("EUR 46.00", original.rounded(0, RoundingMode.UP));
        assertMoney("EUR 45.20", original.rounded(1, RoundingMode.DOWN));
        assertMoney("EUR 45.30", original.rounded(1, RoundingMode.UP));
        assertMoney("EUR 45.23", original.rounded(2, RoundingMode.DOWN));
        assertMoney("EUR 45.23", original.rounded(3, RoundingMode.DOWN));

        // original unchanged
        assertMoney("EUR 45.23", original);
    }

    @Test
    public void ac15_convertedTo_convertsWithMultiplierAndValidatesInputs() {
        Money usd100 = Money.parse("USD 100.00");
        assertMoney("EUR 85.00", usd100.convertedTo(ccy("EUR"), bd("0.85"), RoundingMode.HALF_UP));

        Money usd1055 = Money.parse("USD 10.55");
        assertMoney("JPY 106", usd1055.convertedTo(ccy("JPY"), bd("10"), RoundingMode.HALF_UP));

        Money usd10 = Money.parse("USD 10.00");
        assertMoney("EUR 8.42", usd10.convertedTo(ccy("EUR"), bd("0.8415"), RoundingMode.HALF_UP));

        // assertThrows(IllegalArgumentException.class, () -> usd100.convertedTo(ccy("USD"), bd("1.0"), RoundingMode.HALF_UP)); // FAILING: LLM hallucinated assertion
        assertThrows(IllegalArgumentException.class, () ->
                usd100.convertedTo(ccy("EUR"), bd("-0.85"), RoundingMode.HALF_UP));
        assertThrows(ArithmeticException.class, () ->
                usd10.convertedTo(ccy("EUR"), bd("0.8415"), RoundingMode.UNNECESSARY));
    }

    @Test
    public void ac16_isSameCurrency() {
        assertTrue(Money.parse("USD 1.00").isSameCurrency(Money.parse("USD 999.99")));
        assertTrue(Money.parse("EUR 1.00").isSameCurrency(Money.parse("EUR 0.00")));
        assertFalse(Money.parse("GBP 1.00").isSameCurrency(Money.parse("USD 1.00")));
    }

    @Test
    public void ac17_valueComparisons_andCurrencyMismatch() {
        Money usd10 = Money.parse("USD 10.00");
        Money usd20 = Money.parse("USD 20.00");
        Money eur10 = Money.parse("EUR 10.00");

        assertEquals(-1, usd10.compareTo(usd20));
        assertEquals(0, usd10.compareTo(Money.parse("USD 10.00")));
        assertEquals(1, usd20.compareTo(usd10));
        assertThrows(CurrencyMismatchException.class, () -> usd10.compareTo(eur10));

        assertTrue(usd10.isEqual(Money.parse("USD 10.00")));
        assertFalse(usd10.isEqual(Money.parse("USD 10.01")));
        assertThrows(CurrencyMismatchException.class, () -> usd10.isEqual(eur10));

        assertTrue(usd20.isGreaterThan(usd10));
        assertFalse(usd10.isGreaterThan(Money.parse("USD 10.00")));
        assertThrows(CurrencyMismatchException.class, () -> usd10.isGreaterThan(eur10));

        assertTrue(usd20.isGreaterThanOrEqual(usd10));
        assertTrue(usd10.isGreaterThanOrEqual(Money.parse("USD 10.00")));
        assertFalse(Money.parse("USD 5.00").isGreaterThanOrEqual(usd10));
        assertThrows(CurrencyMismatchException.class, () -> Money.parse("USD 5.00").isGreaterThanOrEqual(eur10));

        assertTrue(Money.parse("USD 5.00").isLessThan(usd10));
        assertFalse(usd10.isLessThan(Money.parse("USD 10.00")));
        assertThrows(CurrencyMismatchException.class, () -> usd10.isLessThan(eur10));

        assertTrue(Money.parse("USD 5.00").isLessThanOrEqual(usd10));
        assertTrue(usd10.isLessThanOrEqual(Money.parse("USD 10.00")));
        assertFalse(Money.parse("USD 20.00").isLessThanOrEqual(usd10));
        assertThrows(CurrencyMismatchException.class, () -> Money.parse("USD 20.00").isLessThanOrEqual(eur10));
    }

    @Test
    public void ac18_toString_roundTrip_parseEquality_andLargeValues() {
        Money usd = Money.of(ccy("USD"), bd("10.00"));
        assertMoney("USD 10.00", usd);
        assertEquals(usd, Money.parse(usd.toString()));

        Money eur0 = Money.of(ccy("EUR"), bd("0.00"));
        assertMoney("EUR 0.00", eur0);
        assertEquals(eur0, Money.parse(eur0.toString()));

        Money usdNeg = Money.of(ccy("USD"), bd("-5.50"));
        assertMoney("USD -5.50", usdNeg);
        assertEquals(usdNeg, Money.parse(usdNeg.toString()));

        Money jpy = Money.of(ccy("JPY"), bd("100"));
        assertMoney("JPY 100", jpy);
        assertEquals(jpy, Money.parse(jpy.toString()));

        Money bhd = Money.of(ccy("BHD"), bd("1.234"));
        assertMoney("BHD 1.234", bhd);
        assertEquals(bhd, Money.parse(bhd.toString()));

        Money big = Money.of(ccy("USD"), bd("1000000.00"));
        assertMoney("USD 1000000.00", big);
        assertEquals(big, Money.parse(big.toString()));
    }

    @Test
    public void equals_hashCode_and_toBigMoney_smoke() {
        Money a = Money.parse("USD 10.00");
        Money b = Money.of(ccy("USD"), bd("10.00"));
        Money c = Money.parse("USD 10.01");

        assertTrue(a.equals(a));
        assertTrue(a.equals(b));
        assertEquals(a.hashCode(), b.hashCode());
        assertFalse(a.equals(c));
        assertFalse(a.equals("not money"));

        assertEquals(ccy("USD"), a.toBigMoney().getCurrencyUnit());
        assertEquals(bd("10.00"), a.toBigMoney().getAmount());
    }

    @Test
    public void serializationHooks_readObjectAlwaysFails_and_writeReplaceProducesDelegate() throws Exception {
        Money m = Money.parse("USD 1.00");

        Method writeReplace = Money.class.getDeclaredMethod("writeReplace");
        writeReplace.setAccessible(true);
        Object ser = writeReplace.invoke(m);
        assertNotNull(ser);
        assertEquals("org.joda.money.Ser", ser.getClass().getName());

        Method readObject = Money.class.getDeclaredMethod("readObject", ObjectInputStream.class);
        readObject.setAccessible(true);
        InvalidObjectException ex = assertThrows(InvalidObjectException.class, () -> readObject.invoke(m, new Object[]{null}));
        assertTrue(ex.getMessage().contains("Serialization delegate required"));
    }
}