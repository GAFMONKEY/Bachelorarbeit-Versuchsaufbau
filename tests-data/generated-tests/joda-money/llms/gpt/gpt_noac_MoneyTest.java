package org.joda.money;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class gpt_noac_MoneyTest {

    // --------- helpers ---------

    private static CurrencyUnit usd() {
        return CurrencyUnit.of("USD");
    }

    private static CurrencyUnit jpy() {
        return CurrencyUnit.of("JPY");
    }

    private static CurrencyUnit eur() {
        return CurrencyUnit.of("EUR");
    }

    private static Money usd(String amount) {
        return Money.of(usd(), new BigDecimal(amount));
    }

    @FunctionalInterface
    private interface ThrowingRunnable {
        void run() throws Exception;
    }

    private static Throwable assertThrowsOneOf(Class<? extends Throwable>[] expectedTypes, ThrowingRunnable r) {
        try {
            r.run();
        } catch (Throwable t) {
            for (Class<? extends Throwable> c : expectedTypes) {
                if (c.isInstance(t)) {
                    return t;
                }
            }
            Assert.fail("Unexpected exception type: " + t.getClass().getName() + ", message=" + t.getMessage());
        }
        Assert.fail("Expected exception but none was thrown");
        return null; // unreachable
    }

    private static void assertAmount(Money money, CurrencyUnit ccy, String expectedAmount) {
        Assert.assertEquals(ccy, money.getCurrencyUnit());
        Assert.assertEquals(new BigDecimal(expectedAmount), money.getAmount());
        Assert.assertEquals(ccy.getDecimalPlaces(), money.getScale());
    }

    // --------- tests ---------

    @Test
    public void of_currencyAndBigDecimal_scaleTooHigh_throwsArithmeticException() {
        // arrange
        CurrencyUnit usd = usd();
        BigDecimal tooManyDecimals = new BigDecimal("1.234"); // USD has 2 decimal places

        // act/assert
        Throwable t = assertThrowsOneOf(new Class[]{ArithmeticException.class}, () -> Money.of(usd, tooManyDecimals));
        Assert.assertTrue(String.valueOf(t.getMessage()).contains("Scale of amount"));
    }

    @Test
    public void of_currencyAndBigDecimal_nulls_throw() {
        // arrange
        CurrencyUnit usd = usd();

        // act/assert
        assertThrowsOneOf(new Class[]{IllegalArgumentException.class, NullPointerException.class},
                () -> Money.of(null, new BigDecimal("1.23")));
        assertThrowsOneOf(new Class[]{IllegalArgumentException.class, NullPointerException.class},
                () -> Money.of(usd, (BigDecimal) null));
    }

    @Test
    public void of_currencyAndBigDecimal_exactScale_ok_andUnnecessaryRounding() {
        // arrange/act
        Money m = Money.of(usd(), new BigDecimal("12.30"));

        // assert
        assertAmount(m, usd(), "12.30");
        Assert.assertEquals(new BigDecimal("12"), m.getAmountMajor()); // 12.30 -> major 12
        Assert.assertEquals(12L, m.getAmountMajorLong());
        Assert.assertEquals(1230L, m.getAmountMinorLong());
        Assert.assertEquals(30, m.getMinorPart());
        Assert.assertTrue(m.isPositive());
        Assert.assertFalse(m.isZero());
        Assert.assertFalse(m.isNegative());
    }

    @Test
    public void of_currencyAndBigDecimal_withRoundingMode_roundsToCurrencyScale() {
        // arrange
        CurrencyUnit usd = usd();
        BigDecimal raw = new BigDecimal("1.235");

        // act
        Money m = Money.of(usd, raw, RoundingMode.HALF_UP);

        // assert
        assertAmount(m, usd, "1.24");
    }

    @Test
    public void of_currencyAndBigDecimal_withRoundingMode_nulls_throw() {
        // arrange
        CurrencyUnit usd = usd();

        // act/assert
        assertThrowsOneOf(new Class[]{IllegalArgumentException.class, NullPointerException.class},
                () -> Money.of(null, new BigDecimal("1.23"), RoundingMode.HALF_UP));
        assertThrowsOneOf(new Class[]{IllegalArgumentException.class, NullPointerException.class},
                () -> Money.of(usd, (BigDecimal) null, RoundingMode.HALF_UP));
        assertThrowsOneOf(new Class[]{IllegalArgumentException.class, NullPointerException.class},
                () -> Money.of(usd, new BigDecimal("1.23"), null));
    }

    @Test
    public void ofMajor_ofMinor_zero_createExpectedAmounts() {
        // arrange
        CurrencyUnit usd = usd();
        CurrencyUnit jpy = jpy();

        // act
        Money major = Money.ofMajor(usd, 5);
        Money minor = Money.ofMinor(usd, 123);
        Money zeroUsd = Money.zero(usd);
        Money zeroJpy = Money.zero(jpy);
        Money hugeMajor = Money.ofMajor(usd, Long.MAX_VALUE);

        // assert
        assertAmount(major, usd, "5.00");
        assertAmount(minor, usd, "1.23");
        assertAmount(zeroUsd, usd, "0.00");
        Assert.assertTrue(zeroUsd.isZero());
        assertAmount(zeroJpy, jpy, "0"); // JPY has 0 decimal places

        Assert.assertEquals(usd, hugeMajor.getCurrencyUnit());
        Assert.assertEquals(usd.getDecimalPlaces(), hugeMajor.getScale());
        Assert.assertEquals(new BigDecimal(Long.toString(Long.MAX_VALUE) + ".00"), hugeMajor.getAmount());
    }

    @Test
    public void ofBigMoneyProvider_roundingNecessary_unnecessaryThrowsAndHalfUpWorks() {
        // arrange
        BigMoney provider = BigMoney.of(usd(), new BigDecimal("2.345")); // provider can carry higher scale

        // act/assert: UNNECESSARY should fail
        assertThrowsOneOf(new Class[]{ArithmeticException.class},
                () -> Money.of(provider, RoundingMode.UNNECESSARY));

        // act: HALF_UP should round
        Money m = Money.of(provider, RoundingMode.HALF_UP);

        // assert
        assertAmount(m, usd(), "2.35");
    }

    @Test
    public void total_varargs_nullEmptyAndNullEntries_throw_andSumIsCorrect() {
        // arrange
        Money a = usd("1.00");
        Money b = usd("2.50");
        Money c = usd("-0.50");

        // act/assert - null array
        assertThrowsOneOf(new Class[]{IllegalArgumentException.class, NullPointerException.class},
                () -> Money.total((Money[]) null));

        // act/assert - empty
        assertThrowsOneOf(new Class[]{IllegalArgumentException.class},
                () -> Money.total());

        // act/assert - first null
        assertThrowsOneOf(new Class[]{IllegalArgumentException.class, NullPointerException.class},
                () -> Money.total((Money) null, a));

        // act/assert - later null
        assertThrowsOneOf(new Class[]{IllegalArgumentException.class, NullPointerException.class},
                () -> Money.total(a, null, b));

        // act
        Money total = Money.total(a, b, c, b); // duplicates

        // assert: 1.00 + 2.50 - 0.50 + 2.50 = 5.50
        assertAmount(total, usd(), "5.50");
    }

    @Test
    public void total_iterable_nullEmptyAndNullEntries_throw_andSumIsCorrect() {
        // arrange
        Money a = usd("1.10");
        Money b = usd("2.20");
        List<Money> list = Arrays.asList(a, b, b);

        // act/assert - null iterable
        assertThrowsOneOf(new Class[]{IllegalArgumentException.class, NullPointerException.class},
                () -> Money.total((Iterable<Money>) null));

        // act/assert - empty iterable
        assertThrowsOneOf(new Class[]{IllegalArgumentException.class},
                () -> Money.total(Collections.<Money>emptyList()));

        // act/assert - first null
        assertThrowsOneOf(new Class[]{IllegalArgumentException.class, NullPointerException.class},
                () -> Money.total(Arrays.asList((Money) null, a)));

        // act/assert - later null
        assertThrowsOneOf(new Class[]{IllegalArgumentException.class, NullPointerException.class},
                () -> Money.total(Arrays.asList(a, null, b)));

        // act
        Money total = Money.total(list);

        // assert: 1.10 + 2.20 + 2.20 = 5.50
        assertAmount(total, usd(), "5.50");
    }

    @Test
    public void total_withCurrency_varargs_allowsEmptyArray_andNullCurrencyThrows() {
        // arrange
        CurrencyUnit usd = usd();
        Money a = Money.ofMinor(usd, 1); // 0.01

        // act
        Money emptyTotal = Money.total(usd); // zero + empty iterable
        Money oneTotal = Money.total(usd, a);

        // assert
        assertAmount(emptyTotal, usd, "0.00");
        assertAmount(oneTotal, usd, "0.01");

        // act/assert
        assertThrowsOneOf(new Class[]{IllegalArgumentException.class, NullPointerException.class},
                () -> Money.total((CurrencyUnit) null, a));
    }

    @Test
    public void withCurrencyUnit_sameCurrency_returnsSameInstance_differentCurrency_roundsAsExpected() {
        // arrange
        Money m = usd("1.23");

        // act
        Money same = m.withCurrencyUnit(usd(), RoundingMode.UNNECESSARY);
        Money jpyDown = m.withCurrencyUnit(jpy(), RoundingMode.DOWN); // 1.23 -> 1 (JPY 0 dp)

        // assert
        Assert.assertSame(m, same);
        assertAmount(jpyDown, jpy(), "1");
    }

    @Test
    public void withAmount_sameAmount_returnsSameInstance_andRoundingApplies() {
        // arrange
        Money m = usd("9.99");

        // act
        Money same = m.withAmount(new BigDecimal("9.99"));
        Money rounded = m.withAmount(new BigDecimal("9.995"), RoundingMode.HALF_UP);

        // assert
        Assert.assertSame(m, same);
        assertAmount(rounded, usd(), "10.00");
    }

    @Test
    public void withAmount_null_throws() {
        // arrange
        Money m = usd("1.23");

        // act/assert
        assertThrowsOneOf(new Class[]{IllegalArgumentException.class, NullPointerException.class},
                () -> m.withAmount((BigDecimal) null));
        assertThrowsOneOf(new Class[]{IllegalArgumentException.class, NullPointerException.class},
                () -> m.withAmount((BigDecimal) null, RoundingMode.HALF_UP));
    }

    @Test
    public void plusMinus_majorMinor_andIterable_workAndRetainScale() {
        // arrange
        Money m = usd("1.00");
        Money add = usd("0.25");
        List<Money> adds = Arrays.asList(add, add);

        // act
        Money r1 = m.plus(add);                 // 1.25
        Money r2 = r1.plus(adds);               // 1.75
        Money r3 = r2.plus(new BigDecimal("0.05")); // 1.80
        Money r4 = r3.minus(usd("0.80"));       // 1.00
        Money r5 = r4.plusMajor(2).plusMinor(3); // +2.00 +0.03 => 3.03
        Money r6 = r5.minusMajor(1).minusMinor(4); // -1.00 -0.04 => 1.99

        // assert
        assertAmount(r1, usd(), "1.25");
        assertAmount(r2, usd(), "1.75");
        assertAmount(r3, usd(), "1.80");
        assertAmount(r4, usd(), "1.00");
        assertAmount(r5, usd(), "3.03");
        assertAmount(r6, usd(), "1.99");
        Assert.assertEquals(2, r6.getScale());
    }

    @Test
    public void multipliedBy_dividedBy_negated_abs_coverBranches() {
        // arrange
        Money m = usd("1.20");

        // act
        Money times2 = m.multipliedBy(2L);
        Money timesHalf = m.multipliedBy(new BigDecimal("0.5"), RoundingMode.UNNECESSARY);
        Money div2 = m.dividedBy(2L, RoundingMode.UNNECESSARY);
        Money div3Down = usd("1.00").dividedBy(3L, RoundingMode.DOWN);
        Money neg = m.negated();

        Money absPos = m.abs();
        Money absNeg = neg.abs();

        // assert
        assertAmount(times2, usd(), "2.40");
        assertAmount(timesHalf, usd(), "0.60");
        assertAmount(div2, usd(), "0.60");
        assertAmount(div3Down, usd(), "0.33");
        assertAmount(neg, usd(), "-1.20");

        Assert.assertSame("abs() of positive should return same instance", m, absPos);
        Assert.assertEquals(usd("1.20"), absNeg);
        Assert.assertNotSame("abs() of negative should not return same instance", neg, absNeg);
    }

    @Test
    public void convertedTo_changesCurrency_andAppliesCurrencyScaleRounding() {
        // arrange
        Money m = usd("1.23");

        // act: convert to EUR with multiplier causing extra decimals
        Money eur = m.convertedTo(eur(), new BigDecimal("1.333"), RoundingMode.HALF_UP);

        // assert: 1.23 * 1.333 = 1.63959 -> 1.64 at 2dp HALF_UP
        assertAmount(eur, eur(), "1.64");
    }

    @Test
    public void comparisons_compareToAndIsGreaterLessEqual_work() {
        // arrange
        Money a = usd("1.00");
        Money b = usd("1.00");
        Money c = usd("1.01");

        // act/assert
        Assert.assertEquals(0, a.compareTo(b));
        Assert.assertTrue(a.isEqual(b));
        Assert.assertTrue(c.isGreaterThan(a));
        Assert.assertTrue(c.isGreaterThanOrEqual(a));
        Assert.assertTrue(a.isLessThan(c));
        Assert.assertTrue(a.isLessThanOrEqual(c));
        Assert.assertFalse(a.isGreaterThan(c));
        Assert.assertFalse(c.isLessThan(a));
    }

    @Test
    public void equals_hashCode_toString_parse_roundTrip_andOtherType() {
        // arrange
        Money a = usd("2.50");
        Money b = usd("2.50");
        Money c = usd("2.51");

        // act/assert equals branches
        Assert.assertTrue(a.equals(a));          // same instance
        Assert.assertTrue(a.equals(b));          // other Money equal
        Assert.assertFalse(a.equals(c));         // other Money not equal
        Assert.assertFalse(a.equals(null));      // null
        Assert.assertFalse(a.equals(new Object())); // other type

        // hashCode contract + specific +3 behavior
        Assert.assertEquals(a.toBigMoney().hashCode() + 3, a.hashCode());
        Assert.assertEquals(a.hashCode(), b.hashCode());

        // toString + parse round-trip
        String text = a.toString();
        Money parsed = Money.parse(text);
        Assert.assertEquals(a, parsed);
    }

    @Test
    public void parse_invalid_throws() {
        // act/assert
        assertThrowsOneOf(new Class[]{IllegalArgumentException.class},
                () -> Money.parse("NOT_A_CCY 12.34"));
        assertThrowsOneOf(new Class[]{IllegalArgumentException.class},
                () -> Money.parse("USD")); // missing amount
    }

    @Test
    public void serialization_roundTrip_usesDelegate_andReflectionCoversReadObjectWriteReplace() throws Exception {
        // arrange
        Money m = usd("7.89");

        // act: real Java serialization round-trip
        Money roundTripped = (Money) deserialize(serialize(m));

        // assert: round-trip equals
        Assert.assertEquals(m, roundTripped);
        Assert.assertNotSame(m, roundTripped);

        // act/assert: reflectively call writeReplace (covers private method)
        Method writeReplace = Money.class.getDeclaredMethod("writeReplace");
        writeReplace.setAccessible(true);
        Object replacement = writeReplace.invoke(m);
        Assert.assertNotNull(replacement);
        Assert.assertTrue("writeReplace should return a Serializable delegate", replacement instanceof Serializable);
        Assert.assertEquals("Ser", replacement.getClass().getSimpleName());

        // act/assert: reflectively call readObject and ensure it throws InvalidObjectException
        Method readObject = Money.class.getDeclaredMethod("readObject", ObjectInputStream.class);
        readObject.setAccessible(true);
        try {
            readObject.invoke(m, new Object[]{null}); // param unused, can be null
            Assert.fail("Expected InvalidObjectException");
        } catch (InvocationTargetException ex) {
            Throwable cause = ex.getCause();
            Assert.assertTrue(cause instanceof InvalidObjectException);
            Assert.assertTrue(String.valueOf(cause.getMessage()).contains("Serialization delegate required"));
        }
    }

    private static byte[] serialize(Object obj) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
            oos.writeObject(obj);
        }
        return baos.toByteArray();
    }

    private static Object deserialize(byte[] bytes) throws IOException, ClassNotFoundException {
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        try (ObjectInputStream ois = new ObjectInputStream(bais)) {
            return ois.readObject();
        }
    }

    @Test
    public void plusAndMinus_withRoundingMode_paths_execute() {
        // arrange
        Money m = usd("1.23");

        // act
        Money plusRounded = m.plus(new BigDecimal("0.005"), RoundingMode.HALF_UP); // 1.235 -> 1.24
        Money minusRounded = m.minus(0.0049d, RoundingMode.HALF_UP);              // 1.2251 -> 1.23 (HALF_UP)

        // assert
        assertAmount(plusRounded, usd(), "1.24");
        assertAmount(minusRounded, usd(), "1.23");
    }

    @Test
    public void plusMinus_iterable_empty_returnsSameInstance_whenNoChange() {
        // arrange
        Money m = usd("3.00");

        // act
        Money plusEmpty = m.plus(Collections.<Money>emptyList());
        Money minusEmpty = m.minus(Collections.<Money>emptyList());

        // assert (covers with(BigMoney) equals-branch if BigMoney returns equal result)
        Assert.assertSame(m, plusEmpty);
        Assert.assertSame(m, minusEmpty);
    }

    @Test
    public void total_iterable_customIterator_singleElement_returnsThatElement() {
        // arrange
        final Money only = usd("4.56");
        Iterable<Money> iterable = new Iterable<Money>() {
            @Override
            public Iterator<Money> iterator() {
                return Collections.singletonList(only).iterator();
            }
        };

        // act
        Money total = Money.total(iterable);

        // assert
        Assert.assertSame(only, total);
    }
}