import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test501");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.Money money12 = money10.negated();
        org.joda.money.CurrencyUnit currencyUnit14 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money15 = org.joda.money.Money.zero(currencyUnit14);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit14);
        org.joda.money.BigMoney bigMoney18 = org.joda.money.BigMoney.of(currencyUnit14, (double) '#');
        boolean boolean19 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney18);
        org.joda.money.CurrencyUnit currencyUnit20 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money21 = org.joda.money.Money.zero(currencyUnit20);
        org.joda.money.Money money23 = money21.minusMajor((long) ' ');
        boolean boolean24 = bigMoney18.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money23);
        org.joda.money.Money money25 = money23.negated();
        org.joda.money.Money money26 = money10.minus(money25);
        int int27 = money26.getMinorPart();
        org.joda.money.CurrencyUnit currencyUnit29 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money30 = org.joda.money.Money.zero(currencyUnit29);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit29);
        org.joda.money.BigMoney bigMoney33 = org.joda.money.BigMoney.of(currencyUnit29, (double) '#');
        boolean boolean34 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney33);
        org.joda.money.CurrencyUnit currencyUnit35 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money36 = org.joda.money.Money.zero(currencyUnit35);
        org.joda.money.Money money38 = money36.minusMajor((long) ' ');
        boolean boolean39 = bigMoney33.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money38);
        org.joda.money.CurrencyUnit currencyUnit41 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money42 = org.joda.money.Money.zero(currencyUnit41);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit41);
        org.joda.money.BigMoney bigMoney45 = org.joda.money.BigMoney.of(currencyUnit41, (double) '#');
        org.joda.money.Money money46 = money38.withCurrencyUnit(currencyUnit41);
        org.joda.money.CurrencyUnit currencyUnit48 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money49 = org.joda.money.Money.zero(currencyUnit48);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit48);
        org.joda.money.BigMoney bigMoney52 = org.joda.money.BigMoney.of(currencyUnit48, (double) '#');
        boolean boolean53 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney52);
        org.joda.money.CurrencyUnit currencyUnit54 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money55 = org.joda.money.Money.zero(currencyUnit54);
        org.joda.money.Money money57 = money55.minusMajor((long) ' ');
        boolean boolean58 = bigMoney52.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money57);
        org.joda.money.Money money59 = money57.negated();
        org.joda.money.Money money61 = money59.minusMajor(1L);
        org.joda.money.Money money63 = money61.minusMajor(100L);
        int int64 = money38.compareTo((org.joda.money.BigMoneyProvider) money61);
        org.joda.money.Money money66 = money38.withAmount((double) 10);
        boolean boolean67 = money26.isSameCurrency((org.joda.money.BigMoneyProvider) money66);
        java.math.BigDecimal bigDecimal68 = money26.getAmountMinor();
        org.joda.money.BigMoney bigMoney69 = money26.toBigMoney();
        org.joda.money.BigMoney bigMoney71 = bigMoney69.minusMajor((long) 34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money26 and bigMoney69", (money26.compareTo(bigMoney69) == 0) == money26.equals(bigMoney69));
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        org.joda.money.BigMoney bigMoney1 = org.joda.money.BigMoney.parse("EUR -32.00");
        org.joda.money.BigMoney bigMoney3 = bigMoney1.plus((double) 10L);
        boolean boolean4 = org.joda.money.MoneyUtils.isPositive((org.joda.money.BigMoneyProvider) bigMoney3);
        org.joda.money.CurrencyUnit currencyUnit6 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money7 = org.joda.money.Money.zero(currencyUnit6);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit6);
        org.joda.money.BigMoney bigMoney10 = org.joda.money.BigMoney.of(currencyUnit6, (double) '#');
        boolean boolean11 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney10);
        org.joda.money.CurrencyUnit currencyUnit12 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money13 = org.joda.money.Money.zero(currencyUnit12);
        org.joda.money.Money money15 = money13.minusMajor((long) ' ');
        boolean boolean16 = bigMoney10.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money15);
        org.joda.money.Money money17 = money15.negated();
        boolean boolean18 = org.joda.money.MoneyUtils.isPositiveOrZero((org.joda.money.BigMoneyProvider) money15);
        org.joda.money.BigMoney bigMoney19 = money15.toBigMoney();
        boolean boolean20 = bigMoney3.isLessThan((org.joda.money.BigMoneyProvider) bigMoney19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney1 and money15", (bigMoney1.compareTo(money15) == 0) == bigMoney1.equals(money15));
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        java.math.BigDecimal bigDecimal6 = bigMoney5.getAmountMajor();
        org.joda.money.CurrencyUnit currencyUnit8 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money9 = org.joda.money.Money.zero(currencyUnit8);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit8);
        org.joda.money.BigMoney bigMoney12 = org.joda.money.BigMoney.of(currencyUnit8, (double) '#');
        boolean boolean13 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney12);
        org.joda.money.CurrencyUnit currencyUnit14 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money15 = org.joda.money.Money.zero(currencyUnit14);
        org.joda.money.Money money17 = money15.minusMajor((long) ' ');
        boolean boolean18 = bigMoney12.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money17);
        org.joda.money.Money money19 = money17.negated();
        org.joda.money.Money money21 = money19.minusMajor(1L);
        org.joda.money.CurrencyUnit currencyUnit22 = money19.getCurrencyUnit();
        java.util.Currency currency23 = currencyUnit22.toCurrency();
        org.joda.money.BigMoney bigMoney24 = bigMoney5.withCurrencyUnit(currencyUnit22);
        org.joda.money.BigMoney bigMoney26 = bigMoney5.plusMinor(100L);
        java.math.BigDecimal bigDecimal27 = bigMoney5.getAmount();
        org.joda.money.BigMoney bigMoney29 = bigMoney5.withScale(9);
        org.joda.money.CurrencyUnit currencyUnit31 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money32 = org.joda.money.Money.zero(currencyUnit31);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit31);
        org.joda.money.BigMoney bigMoney35 = org.joda.money.BigMoney.of(currencyUnit31, (double) '#');
        boolean boolean36 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney35);
        org.joda.money.CurrencyUnit currencyUnit37 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money38 = org.joda.money.Money.zero(currencyUnit37);
        org.joda.money.Money money40 = money38.minusMajor((long) ' ');
        boolean boolean41 = bigMoney35.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money40);
        int int42 = bigMoney35.getAmountMajorInt();
        org.joda.money.BigMoney bigMoney43 = bigMoney35.negated();
        org.joda.money.CurrencyUnit currencyUnit44 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money45 = org.joda.money.Money.zero(currencyUnit44);
        org.joda.money.Money money47 = money45.minusMajor((long) ' ');
        int int48 = money45.getAmountMajorInt();
        boolean boolean49 = money45.isZero();
        org.joda.money.Money money51 = money45.plusMinor(0L);
        boolean boolean52 = bigMoney43.isSameCurrency((org.joda.money.BigMoneyProvider) money51);
        java.math.BigDecimal bigDecimal53 = money51.getAmountMajor();
        java.math.RoundingMode roundingMode54 = null;
        org.joda.money.BigMoney bigMoney55 = bigMoney29.plusRetainScale(bigDecimal53, roundingMode54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney5 and bigMoney55", (bigMoney5.compareTo(bigMoney55) == 0) == bigMoney5.equals(bigMoney55));
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        java.math.BigDecimal bigDecimal6 = bigMoney5.getAmountMajor();
        org.joda.money.CurrencyUnit currencyUnit8 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money9 = org.joda.money.Money.zero(currencyUnit8);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit8);
        org.joda.money.BigMoney bigMoney12 = org.joda.money.BigMoney.of(currencyUnit8, (double) '#');
        java.math.BigDecimal bigDecimal13 = bigMoney12.getAmountMajor();
        org.joda.money.BigMoney bigMoney14 = bigMoney5.minus(bigDecimal13);
        boolean boolean15 = org.joda.money.MoneyUtils.isZero((org.joda.money.BigMoneyProvider) bigMoney14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money2 and bigMoney14", (money2.compareTo(bigMoney14) == 0) == money2.equals(bigMoney14));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        java.math.BigDecimal bigDecimal6 = bigMoney5.getAmountMajor();
        org.joda.money.CurrencyUnit currencyUnit8 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money9 = org.joda.money.Money.zero(currencyUnit8);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit8);
        org.joda.money.BigMoney bigMoney12 = org.joda.money.BigMoney.of(currencyUnit8, (double) '#');
        boolean boolean13 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney12);
        org.joda.money.CurrencyUnit currencyUnit14 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money15 = org.joda.money.Money.zero(currencyUnit14);
        org.joda.money.Money money17 = money15.minusMajor((long) ' ');
        boolean boolean18 = bigMoney12.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money17);
        org.joda.money.Money money19 = money17.negated();
        org.joda.money.Money money21 = money19.minusMajor(1L);
        org.joda.money.CurrencyUnit currencyUnit22 = money19.getCurrencyUnit();
        java.util.Currency currency23 = currencyUnit22.toCurrency();
        org.joda.money.BigMoney bigMoney24 = bigMoney5.withCurrencyUnit(currencyUnit22);
        org.joda.money.CurrencyUnit currencyUnit26 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money27 = org.joda.money.Money.zero(currencyUnit26);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit26);
        org.joda.money.BigMoney bigMoney30 = org.joda.money.BigMoney.of(currencyUnit26, (double) '#');
        boolean boolean31 = bigMoney30.isPositive();
        org.joda.money.BigMoney bigMoney32 = bigMoney30.toBigMoney();
        boolean boolean33 = bigMoney5.isLessThan((org.joda.money.BigMoneyProvider) bigMoney30);
        org.joda.money.BigMoney bigMoney34 = bigMoney5.withCurrencyScale();
        org.joda.money.BigMoney bigMoney36 = bigMoney5.plus((double) 965);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney5 and bigMoney34", (bigMoney5.compareTo(bigMoney34) == 0) == bigMoney5.equals(bigMoney34));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.joda.money.CurrencyUnit currencyUnit2 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money3 = org.joda.money.Money.zero(currencyUnit2);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit2);
        org.joda.money.BigMoney bigMoney6 = org.joda.money.BigMoney.of(currencyUnit2, (double) '#');
        boolean boolean7 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney6);
        org.joda.money.CurrencyUnit currencyUnit8 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money9 = org.joda.money.Money.zero(currencyUnit8);
        org.joda.money.Money money11 = money9.minusMajor((long) ' ');
        boolean boolean12 = bigMoney6.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money11);
        org.joda.money.Money money13 = money11.negated();
        org.joda.money.Money money15 = money13.minusMajor(1L);
        org.joda.money.CurrencyUnit currencyUnit16 = money13.getCurrencyUnit();
        java.lang.String str17 = currencyUnit16.toString();
        org.joda.money.CurrencyUnit currencyUnit18 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money19 = org.joda.money.Money.zero(currencyUnit18);
        org.joda.money.BigMoney bigMoney21 = org.joda.money.BigMoney.ofMajor(currencyUnit18, (long) 'a');
        java.util.Set<java.lang.String> strSet22 = currencyUnit18.getCountryCodes();
        int int23 = currencyUnit18.getDecimalPlaces();
        org.joda.money.CurrencyMismatchException currencyMismatchException24 = new org.joda.money.CurrencyMismatchException(currencyUnit16, currencyUnit18);
        org.joda.money.CurrencyUnit currencyUnit25 = currencyMismatchException24.getSecondCurrency();
        org.joda.money.CurrencyUnit currencyUnit26 = currencyMismatchException24.getFirstCurrency();
        org.joda.money.CurrencyUnit currencyUnit27 = currencyMismatchException24.getSecondCurrency();
        org.joda.money.format.MoneyFormatException moneyFormatException28 = new org.joda.money.format.MoneyFormatException("MoneyAmountStyle['0','+','-',',','NONE,.','3',false',false]", (java.lang.Throwable) currencyMismatchException24);
        org.joda.money.CurrencyUnit currencyUnit29 = currencyMismatchException24.getSecondCurrency();
        org.joda.money.BigMoney bigMoney31 = org.joda.money.BigMoney.zero(currencyUnit29, 0);
        org.joda.money.BigMoney bigMoney33 = bigMoney31.plus((double) 1L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money3 and bigMoney31", (money3.compareTo(bigMoney31) == 0) == money3.equals(bigMoney31));
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.joda.money.CurrencyUnit currencyUnit0 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean1 = currencyUnit0.isPseudoCurrency();
        java.lang.String str2 = currencyUnit0.getCode();
        org.joda.money.Money money3 = org.joda.money.Money.zero(currencyUnit0);
        org.joda.money.Money money4 = org.joda.money.Money.zero(currencyUnit0);
        org.joda.money.Money money5 = money4.negated();
        org.joda.money.Money money6 = money4.abs();
        org.joda.money.BigMoney bigMoney7 = money6.toBigMoney();
        boolean boolean8 = org.joda.money.MoneyUtils.isPositive((org.joda.money.BigMoneyProvider) money6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money3 and bigMoney7", (money3.compareTo(bigMoney7) == 0) == money3.equals(bigMoney7));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.Money money12 = money10.negated();
        org.joda.money.CurrencyUnit currencyUnit14 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money15 = org.joda.money.Money.zero(currencyUnit14);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit14);
        org.joda.money.BigMoney bigMoney18 = org.joda.money.BigMoney.of(currencyUnit14, (double) '#');
        boolean boolean19 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney18);
        org.joda.money.CurrencyUnit currencyUnit20 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money21 = org.joda.money.Money.zero(currencyUnit20);
        org.joda.money.Money money23 = money21.minusMajor((long) ' ');
        boolean boolean24 = bigMoney18.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money23);
        org.joda.money.Money money25 = money23.negated();
        org.joda.money.Money money26 = money10.minus(money25);
        org.joda.money.CurrencyUnit currencyUnit28 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money29 = org.joda.money.Money.zero(currencyUnit28);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit28);
        org.joda.money.BigMoney bigMoney32 = org.joda.money.BigMoney.of(currencyUnit28, (double) '#');
        boolean boolean33 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney32);
        org.joda.money.CurrencyUnit currencyUnit34 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money35 = org.joda.money.Money.zero(currencyUnit34);
        org.joda.money.Money money37 = money35.minusMajor((long) ' ');
        boolean boolean38 = bigMoney32.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money37);
        int int39 = bigMoney32.getAmountMajorInt();
        boolean boolean40 = money25.isLessThanOrEqual((org.joda.money.BigMoneyProvider) bigMoney32);
        org.joda.money.BigMoney bigMoney42 = bigMoney32.withScale((int) (byte) 0);
        org.joda.money.BigMoney bigMoney44 = bigMoney42.plus((double) ' ');
        org.joda.money.BigMoney bigMoney45 = bigMoney42.abs();
        org.joda.money.Money money46 = bigMoney45.toMoney();
        org.joda.money.BigMoney bigMoney48 = bigMoney45.withAmount((double) 34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney5 and money46", (bigMoney5.compareTo(money46) == 0) == bigMoney5.equals(money46));
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.CurrencyUnit currencyUnit13 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money14 = org.joda.money.Money.zero(currencyUnit13);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit13);
        org.joda.money.BigMoney bigMoney17 = org.joda.money.BigMoney.of(currencyUnit13, (double) '#');
        org.joda.money.Money money18 = money10.withCurrencyUnit(currencyUnit13);
        org.joda.money.CurrencyUnit currencyUnit20 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money21 = org.joda.money.Money.zero(currencyUnit20);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit20);
        org.joda.money.BigMoney bigMoney24 = org.joda.money.BigMoney.of(currencyUnit20, (double) '#');
        boolean boolean25 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney24);
        org.joda.money.CurrencyUnit currencyUnit26 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money27 = org.joda.money.Money.zero(currencyUnit26);
        org.joda.money.Money money29 = money27.minusMajor((long) ' ');
        boolean boolean30 = bigMoney24.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money29);
        org.joda.money.Money money31 = money29.negated();
        org.joda.money.CurrencyUnit currencyUnit33 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money34 = org.joda.money.Money.zero(currencyUnit33);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit33);
        org.joda.money.BigMoney bigMoney37 = org.joda.money.BigMoney.of(currencyUnit33, (double) '#');
        boolean boolean38 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney37);
        org.joda.money.CurrencyUnit currencyUnit39 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money40 = org.joda.money.Money.zero(currencyUnit39);
        org.joda.money.Money money42 = money40.minusMajor((long) ' ');
        boolean boolean43 = bigMoney37.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money42);
        org.joda.money.Money money44 = money42.negated();
        org.joda.money.Money money45 = money29.minus(money44);
        org.joda.money.CurrencyUnit currencyUnit47 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money48 = org.joda.money.Money.zero(currencyUnit47);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit47);
        org.joda.money.BigMoney bigMoney51 = org.joda.money.BigMoney.of(currencyUnit47, (double) '#');
        boolean boolean52 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney51);
        org.joda.money.CurrencyUnit currencyUnit53 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money54 = org.joda.money.Money.zero(currencyUnit53);
        org.joda.money.Money money56 = money54.minusMajor((long) ' ');
        boolean boolean57 = bigMoney51.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money56);
        int int58 = bigMoney51.getAmountMajorInt();
        boolean boolean59 = money44.isLessThanOrEqual((org.joda.money.BigMoneyProvider) bigMoney51);
        java.math.BigDecimal bigDecimal60 = money44.getAmountMajor();
        org.joda.money.Money money61 = org.joda.money.Money.of(currencyUnit13, bigDecimal60);
        int int62 = currencyUnit13.getNumericCode();
        org.joda.money.BigMoney bigMoney64 = org.joda.money.BigMoney.zero(currencyUnit13, (-35));
        java.lang.String str65 = bigMoney64.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money2 and bigMoney64", (money2.compareTo(bigMoney64) == 0) == money2.equals(bigMoney64));
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle0 = org.joda.money.format.MoneyAmountStyle.ASCII_DECIMAL_COMMA_NO_GROUPING;
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle2 = moneyAmountStyle0.withDecimalPointCharacter((java.lang.Character) '4');
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle4 = moneyAmountStyle2.withDecimalPointCharacter((java.lang.Character) ' ');
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle5 = org.joda.money.format.MoneyAmountStyle.ASCII_DECIMAL_COMMA_GROUP3_DOT;
        org.joda.money.format.GroupingStyle groupingStyle6 = org.joda.money.format.GroupingStyle.FULL;
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle7 = moneyAmountStyle5.withGroupingStyle(groupingStyle6);
        boolean boolean8 = moneyAmountStyle2.equals((java.lang.Object) moneyAmountStyle5);
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle10 = moneyAmountStyle5.withGroupingCharacter((java.lang.Character) 'a');
        org.joda.money.CurrencyUnit currencyUnit12 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money13 = org.joda.money.Money.zero(currencyUnit12);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit12);
        org.joda.money.BigMoney bigMoney16 = org.joda.money.BigMoney.of(currencyUnit12, (double) '#');
        boolean boolean17 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney16);
        org.joda.money.CurrencyUnit currencyUnit18 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money19 = org.joda.money.Money.zero(currencyUnit18);
        org.joda.money.Money money21 = money19.minusMajor((long) ' ');
        boolean boolean22 = bigMoney16.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money21);
        org.joda.money.Money money23 = money21.negated();
        org.joda.money.Money money25 = money23.minusMajor(1L);
        org.joda.money.CurrencyUnit currencyUnit26 = money23.getCurrencyUnit();
        boolean boolean27 = moneyAmountStyle10.equals((java.lang.Object) currencyUnit26);
        org.joda.money.CurrencyUnit currencyUnit29 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money30 = org.joda.money.Money.zero(currencyUnit29);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit29);
        org.joda.money.BigMoney bigMoney33 = org.joda.money.BigMoney.of(currencyUnit29, (double) '#');
        boolean boolean34 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney33);
        org.joda.money.CurrencyUnit currencyUnit35 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money36 = org.joda.money.Money.zero(currencyUnit35);
        org.joda.money.Money money38 = money36.minusMajor((long) ' ');
        boolean boolean39 = bigMoney33.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money38);
        org.joda.money.Money money40 = money38.negated();
        org.joda.money.Money money42 = money40.minusMajor(1L);
        org.joda.money.CurrencyUnit currencyUnit43 = money40.getCurrencyUnit();
        java.lang.String str44 = currencyUnit43.toString();
        org.joda.money.CurrencyUnit currencyUnit45 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money46 = org.joda.money.Money.zero(currencyUnit45);
        org.joda.money.BigMoney bigMoney48 = org.joda.money.BigMoney.ofMajor(currencyUnit45, (long) 'a');
        java.util.Set<java.lang.String> strSet49 = currencyUnit45.getCountryCodes();
        int int50 = currencyUnit45.getDecimalPlaces();
        org.joda.money.CurrencyMismatchException currencyMismatchException51 = new org.joda.money.CurrencyMismatchException(currencyUnit43, currencyUnit45);
        org.joda.money.CurrencyUnit currencyUnit52 = currencyMismatchException51.getSecondCurrency();
        java.lang.String str53 = currencyUnit52.getCode();
        org.joda.money.CurrencyMismatchException currencyMismatchException54 = new org.joda.money.CurrencyMismatchException(currencyUnit26, currencyUnit52);
        org.joda.money.BigMoney bigMoney56 = org.joda.money.BigMoney.of(currencyUnit26, 0.0d);
        org.joda.money.BigMoney bigMoney58 = org.joda.money.BigMoney.zero(currencyUnit26, (int) (short) -1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money13 and bigMoney56", (money13.compareTo(bigMoney56) == 0) == money13.equals(bigMoney56));
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.joda.money.CurrencyUnit currencyUnit0 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money1 = org.joda.money.Money.zero(currencyUnit0);
        org.joda.money.CurrencyUnit currencyUnit2 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money3 = org.joda.money.Money.zero(currencyUnit2);
        org.joda.money.Money money5 = money3.minusMajor((long) ' ');
        boolean boolean6 = money1.isSameCurrency((org.joda.money.BigMoneyProvider) money5);
        long long7 = money1.getAmountMinorLong();
        org.joda.money.CurrencyUnit currencyUnit9 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money10 = org.joda.money.Money.zero(currencyUnit9);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit9);
        org.joda.money.BigMoney bigMoney13 = org.joda.money.BigMoney.of(currencyUnit9, (double) '#');
        boolean boolean14 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney13);
        org.joda.money.CurrencyUnit currencyUnit15 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money16 = org.joda.money.Money.zero(currencyUnit15);
        org.joda.money.Money money18 = money16.minusMajor((long) ' ');
        boolean boolean19 = bigMoney13.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money18);
        org.joda.money.Money money20 = money18.negated();
        boolean boolean21 = money20.isPositiveOrZero();
        boolean boolean22 = money20.isPositiveOrZero();
        org.joda.money.Money money24 = money20.plusMajor((long) (short) -1);
        int int25 = money20.getMinorPart();
        org.joda.money.CurrencyUnit currencyUnit26 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean27 = currencyUnit26.isPseudoCurrency();
        java.lang.String str28 = currencyUnit26.getCode();
        org.joda.money.Money money29 = org.joda.money.Money.zero(currencyUnit26);
        org.joda.money.Money money31 = money29.withAmount((double) '+');
        org.joda.money.Money money32 = org.joda.money.MoneyUtils.add(money20, money31);
        org.joda.money.Money money33 = org.joda.money.MoneyUtils.min(money1, money20);
        org.joda.money.BigMoney bigMoney34 = money20.toBigMoney();
        org.joda.money.BigMoney bigMoney36 = bigMoney34.minusMinor((long) 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money20 and bigMoney34", (money20.compareTo(bigMoney34) == 0) == money20.equals(bigMoney34));
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        java.math.BigDecimal bigDecimal6 = bigMoney5.getAmountMajor();
        org.joda.money.BigMoney bigMoney7 = bigMoney5.abs();
        org.joda.money.BigMoney bigMoney8 = bigMoney7.negated();
        org.joda.money.CurrencyUnit currencyUnit10 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money11 = org.joda.money.Money.zero(currencyUnit10);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit10);
        org.joda.money.BigMoney bigMoney14 = org.joda.money.BigMoney.of(currencyUnit10, (double) '#');
        boolean boolean15 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney14);
        org.joda.money.CurrencyUnit currencyUnit16 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money17 = org.joda.money.Money.zero(currencyUnit16);
        org.joda.money.Money money19 = money17.minusMajor((long) ' ');
        boolean boolean20 = bigMoney14.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money19);
        org.joda.money.Money money21 = money19.negated();
        boolean boolean22 = money21.isPositiveOrZero();
        boolean boolean23 = money21.isPositiveOrZero();
        org.joda.money.Money money25 = money21.plusMajor((long) (short) -1);
        org.joda.money.CurrencyUnit currencyUnit27 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money28 = org.joda.money.Money.zero(currencyUnit27);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit27);
        org.joda.money.BigMoney bigMoney31 = org.joda.money.BigMoney.of(currencyUnit27, (double) '#');
        java.math.BigDecimal bigDecimal32 = bigMoney31.getAmountMajor();
        org.joda.money.BigMoney bigMoney33 = bigMoney31.abs();
        org.joda.money.BigMoney bigMoney34 = bigMoney33.negated();
        org.joda.money.BigMoney bigMoney36 = bigMoney33.minusMinor((long) '#');
        org.joda.money.CurrencyUnit currencyUnit38 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money39 = org.joda.money.Money.zero(currencyUnit38);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit38);
        org.joda.money.BigMoney bigMoney42 = org.joda.money.BigMoney.of(currencyUnit38, (double) '#');
        boolean boolean43 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney42);
        org.joda.money.CurrencyUnit currencyUnit44 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money45 = org.joda.money.Money.zero(currencyUnit44);
        org.joda.money.Money money47 = money45.minusMajor((long) ' ');
        boolean boolean48 = bigMoney42.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money47);
        org.joda.money.Money money49 = money47.negated();
        org.joda.money.CurrencyUnit currencyUnit51 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money52 = org.joda.money.Money.zero(currencyUnit51);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit51);
        org.joda.money.BigMoney bigMoney55 = org.joda.money.BigMoney.of(currencyUnit51, (double) '#');
        boolean boolean56 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney55);
        org.joda.money.CurrencyUnit currencyUnit57 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money58 = org.joda.money.Money.zero(currencyUnit57);
        org.joda.money.Money money60 = money58.minusMajor((long) ' ');
        boolean boolean61 = bigMoney55.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money60);
        org.joda.money.Money money62 = money60.negated();
        org.joda.money.Money money63 = money47.minus(money62);
        org.joda.money.Money money65 = money63.minusMinor((long) ' ');
        boolean boolean66 = bigMoney33.isEqual((org.joda.money.BigMoneyProvider) money65);
        org.joda.money.Money money67 = org.joda.money.MoneyUtils.add(money21, money65);
        org.joda.money.Money money69 = money21.plusMajor(0L);
        boolean boolean70 = bigMoney7.isSameCurrency((org.joda.money.BigMoneyProvider) money21);
        org.joda.money.BigMoney bigMoney71 = money21.toBigMoney();
        int int72 = money21.getMinorPart();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money21 and bigMoney71", (money21.compareTo(bigMoney71) == 0) == money21.equals(bigMoney71));
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.Money money12 = money10.negated();
        org.joda.money.CurrencyUnit currencyUnit14 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money15 = org.joda.money.Money.zero(currencyUnit14);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit14);
        org.joda.money.BigMoney bigMoney18 = org.joda.money.BigMoney.of(currencyUnit14, (double) '#');
        boolean boolean19 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney18);
        org.joda.money.CurrencyUnit currencyUnit20 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money21 = org.joda.money.Money.zero(currencyUnit20);
        org.joda.money.Money money23 = money21.minusMajor((long) ' ');
        boolean boolean24 = bigMoney18.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money23);
        org.joda.money.Money money25 = money23.negated();
        org.joda.money.Money money26 = money10.minus(money25);
        org.joda.money.CurrencyUnit currencyUnit28 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money29 = org.joda.money.Money.zero(currencyUnit28);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit28);
        org.joda.money.BigMoney bigMoney32 = org.joda.money.BigMoney.of(currencyUnit28, (double) '#');
        boolean boolean33 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney32);
        org.joda.money.CurrencyUnit currencyUnit34 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money35 = org.joda.money.Money.zero(currencyUnit34);
        org.joda.money.Money money37 = money35.minusMajor((long) ' ');
        boolean boolean38 = bigMoney32.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money37);
        int int39 = bigMoney32.getAmountMajorInt();
        boolean boolean40 = money25.isLessThanOrEqual((org.joda.money.BigMoneyProvider) bigMoney32);
        java.math.BigDecimal bigDecimal41 = money25.getAmountMajor();
        boolean boolean42 = org.joda.money.MoneyUtils.isPositiveOrZero((org.joda.money.BigMoneyProvider) money25);
        org.joda.money.Money money44 = money25.minus((double) ',');
        org.joda.money.CurrencyUnit currencyUnit45 = money44.getCurrencyUnit();
        org.joda.money.Money money47 = org.joda.money.Money.ofMajor(currencyUnit45, (long) (short) 10);
        org.joda.money.BigMoney bigMoney48 = org.joda.money.BigMoney.zero(currencyUnit45);
        long long49 = bigMoney48.getAmountMajorLong();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money2 and bigMoney48", (money2.compareTo(bigMoney48) == 0) == money2.equals(bigMoney48));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) 10L);
        java.lang.String str6 = bigMoney5.toString();
        boolean boolean7 = bigMoney5.isZero();
        org.joda.money.Money money8 = bigMoney5.toMoney();
        boolean boolean9 = org.joda.money.MoneyUtils.isPositiveOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney5 and money8", (bigMoney5.compareTo(money8) == 0) == bigMoney5.equals(money8));
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.Money money12 = money10.negated();
        boolean boolean13 = org.joda.money.MoneyUtils.isPositiveOrZero((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.BigMoney bigMoney14 = money10.toBigMoney();
        org.joda.money.BigMoney bigMoney15 = bigMoney14.abs();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money10 and bigMoney14", (money10.compareTo(bigMoney14) == 0) == money10.equals(bigMoney14));
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.CurrencyUnit currencyUnit13 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money14 = org.joda.money.Money.zero(currencyUnit13);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit13);
        org.joda.money.BigMoney bigMoney17 = org.joda.money.BigMoney.of(currencyUnit13, (double) '#');
        org.joda.money.Money money18 = money10.withCurrencyUnit(currencyUnit13);
        org.joda.money.CurrencyUnit currencyUnit20 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money21 = org.joda.money.Money.zero(currencyUnit20);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit20);
        org.joda.money.BigMoney bigMoney24 = org.joda.money.BigMoney.of(currencyUnit20, (double) '#');
        boolean boolean25 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney24);
        org.joda.money.CurrencyUnit currencyUnit26 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money27 = org.joda.money.Money.zero(currencyUnit26);
        org.joda.money.Money money29 = money27.minusMajor((long) ' ');
        boolean boolean30 = bigMoney24.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money29);
        org.joda.money.Money money31 = money29.negated();
        org.joda.money.Money money33 = money31.minusMajor(1L);
        org.joda.money.Money money35 = money33.minusMajor(100L);
        int int36 = money10.compareTo((org.joda.money.BigMoneyProvider) money33);
        java.math.BigDecimal bigDecimal37 = money10.getAmountMinor();
        org.joda.money.Money money39 = money10.withAmount((double) 1L);
        org.joda.money.CurrencyUnit currencyUnit40 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money41 = org.joda.money.Money.zero(currencyUnit40);
        org.joda.money.BigMoney bigMoney43 = org.joda.money.BigMoney.ofMajor(currencyUnit40, (long) 'a');
        java.util.Set<java.lang.String> strSet44 = currencyUnit40.getCountryCodes();
        org.joda.money.Money money45 = money39.withCurrencyUnit(currencyUnit40);
        org.joda.money.Money money47 = org.joda.money.Money.parse("EUR 35");
        org.joda.money.Money money49 = money47.minusMinor((long) 'a');
        org.joda.money.CurrencyUnit currencyUnit50 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money51 = org.joda.money.Money.zero(currencyUnit50);
        org.joda.money.Money money53 = money51.minusMajor((long) ' ');
        java.math.BigDecimal bigDecimal54 = money51.getAmountMinor();
        org.joda.money.Money money55 = org.joda.money.MoneyUtils.subtract(money49, money51);
        java.math.BigDecimal bigDecimal56 = money49.getAmount();
        org.joda.money.Money money57 = money45.plus(bigDecimal56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney5 and money47", (bigMoney5.compareTo(money47) == 0) == bigMoney5.equals(money47));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        int int7 = bigMoney5.getMinorPart();
        org.joda.money.BigMoney bigMoney9 = bigMoney5.plus((double) (-3500));
        org.joda.money.BigMoney bigMoney11 = bigMoney9.withScale((int) (short) 0);
        org.joda.money.Money money12 = bigMoney11.toMoney();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney9 and bigMoney11", (bigMoney9.compareTo(bigMoney11) == 0) == bigMoney9.equals(bigMoney11));
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        org.joda.money.CurrencyUnit currencyUnit0 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money1 = org.joda.money.Money.zero(currencyUnit0);
        org.joda.money.BigMoney bigMoney3 = org.joda.money.BigMoney.ofMajor(currencyUnit0, (long) 'a');
        java.util.Set<java.lang.String> strSet4 = currencyUnit0.getCountryCodes();
        org.joda.money.Money money6 = org.joda.money.Money.ofMajor(currencyUnit0, (long) '0');
        org.joda.money.Money money8 = money6.plusMajor((long) (byte) 10);
        org.joda.money.Money money10 = org.joda.money.Money.parse("EUR 35");
        boolean boolean11 = money6.isLessThan((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.CurrencyUnit currencyUnit13 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money14 = org.joda.money.Money.zero(currencyUnit13);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit13);
        org.joda.money.BigMoney bigMoney17 = org.joda.money.BigMoney.of(currencyUnit13, (double) '#');
        boolean boolean18 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney17);
        org.joda.money.CurrencyUnit currencyUnit19 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money20 = org.joda.money.Money.zero(currencyUnit19);
        org.joda.money.Money money22 = money20.minusMajor((long) ' ');
        boolean boolean23 = bigMoney17.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money22);
        int int24 = money22.getMinorPart();
        org.joda.money.CurrencyUnit currencyUnit26 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money27 = org.joda.money.Money.zero(currencyUnit26);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit26);
        org.joda.money.BigMoney bigMoney30 = org.joda.money.BigMoney.of(currencyUnit26, (double) '#');
        org.joda.money.BigMoney bigMoney32 = org.joda.money.BigMoney.ofMinor(currencyUnit26, (long) (byte) -1);
        int int33 = bigMoney32.getAmountMinorInt();
        org.joda.money.CurrencyUnit currencyUnit35 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money36 = org.joda.money.Money.zero(currencyUnit35);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit35);
        org.joda.money.BigMoney bigMoney39 = org.joda.money.BigMoney.of(currencyUnit35, (double) '#');
        boolean boolean40 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney39);
        int int41 = bigMoney39.getMinorPart();
        boolean boolean42 = bigMoney39.isPositive();
        org.joda.money.BigMoney bigMoney43 = org.joda.money.MoneyUtils.subtract(bigMoney32, bigMoney39);
        boolean boolean44 = money22.isGreaterThan((org.joda.money.BigMoneyProvider) bigMoney43);
        boolean boolean45 = money10.isGreaterThan((org.joda.money.BigMoneyProvider) bigMoney43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money10 and bigMoney17", (money10.compareTo(bigMoney17) == 0) == money10.equals(bigMoney17));
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.Money money12 = money10.negated();
        org.joda.money.Money money14 = money12.minusMajor(1L);
        org.joda.money.CurrencyUnit currencyUnit15 = money12.getCurrencyUnit();
        java.lang.String str16 = currencyUnit15.toString();
        org.joda.money.CurrencyUnit currencyUnit17 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money18 = org.joda.money.Money.zero(currencyUnit17);
        org.joda.money.BigMoney bigMoney20 = org.joda.money.BigMoney.ofMajor(currencyUnit17, (long) 'a');
        java.util.Set<java.lang.String> strSet21 = currencyUnit17.getCountryCodes();
        int int22 = currencyUnit17.getDecimalPlaces();
        org.joda.money.CurrencyMismatchException currencyMismatchException23 = new org.joda.money.CurrencyMismatchException(currencyUnit15, currencyUnit17);
        org.joda.money.CurrencyUnit currencyUnit24 = currencyMismatchException23.getFirstCurrency();
        org.joda.money.CurrencyUnit currencyUnit25 = currencyMismatchException23.getSecondCurrency();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder26 = new org.joda.money.format.MoneyFormatterBuilder();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder27 = moneyFormatterBuilder26.appendCurrencyNumeric3Code();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder28 = moneyFormatterBuilder26.appendCurrencyCode();
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle29 = org.joda.money.format.MoneyAmountStyle.ASCII_DECIMAL_POINT_GROUP3_SPACE;
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder30 = moneyFormatterBuilder28.appendAmount(moneyAmountStyle29);
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder31 = moneyFormatterBuilder30.appendAmountLocalized();
        boolean boolean32 = currencyUnit25.equals((java.lang.Object) moneyFormatterBuilder30);
        java.lang.String str33 = currencyUnit25.toString();
        org.joda.money.BigMoney bigMoney34 = org.joda.money.BigMoney.zero(currencyUnit25);
        java.lang.String str35 = currencyUnit25.getSymbol();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money2 and bigMoney34", (money2.compareTo(bigMoney34) == 0) == money2.equals(bigMoney34));
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.Money money12 = money10.negated();
        org.joda.money.CurrencyUnit currencyUnit14 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money15 = org.joda.money.Money.zero(currencyUnit14);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit14);
        org.joda.money.BigMoney bigMoney18 = org.joda.money.BigMoney.of(currencyUnit14, (double) '#');
        boolean boolean19 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney18);
        org.joda.money.CurrencyUnit currencyUnit20 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money21 = org.joda.money.Money.zero(currencyUnit20);
        org.joda.money.Money money23 = money21.minusMajor((long) ' ');
        boolean boolean24 = bigMoney18.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money23);
        org.joda.money.Money money25 = money23.negated();
        org.joda.money.Money money26 = money10.minus(money25);
        org.joda.money.CurrencyUnit currencyUnit28 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money29 = org.joda.money.Money.zero(currencyUnit28);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit28);
        org.joda.money.BigMoney bigMoney32 = org.joda.money.BigMoney.of(currencyUnit28, (double) '#');
        boolean boolean33 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney32);
        org.joda.money.CurrencyUnit currencyUnit34 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money35 = org.joda.money.Money.zero(currencyUnit34);
        org.joda.money.Money money37 = money35.minusMajor((long) ' ');
        boolean boolean38 = bigMoney32.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money37);
        int int39 = bigMoney32.getAmountMajorInt();
        boolean boolean40 = money25.isLessThanOrEqual((org.joda.money.BigMoneyProvider) bigMoney32);
        org.joda.money.CurrencyUnit currencyUnit42 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money43 = org.joda.money.Money.zero(currencyUnit42);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit42);
        org.joda.money.BigMoney bigMoney46 = org.joda.money.BigMoney.of(currencyUnit42, (double) '#');
        boolean boolean47 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney46);
        org.joda.money.CurrencyUnit currencyUnit48 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money49 = org.joda.money.Money.zero(currencyUnit48);
        org.joda.money.Money money51 = money49.minusMajor((long) ' ');
        boolean boolean52 = bigMoney46.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money51);
        org.joda.money.Money money54 = money51.multipliedBy((long) (byte) 10);
        boolean boolean55 = bigMoney32.isLessThan((org.joda.money.BigMoneyProvider) money51);
        org.joda.money.BigMoney bigMoney57 = bigMoney32.multipliedBy((long) 10);
        boolean boolean59 = bigMoney57.equals((java.lang.Object) '-');
        org.joda.money.CurrencyUnit currencyUnit60 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money61 = org.joda.money.Money.zero(currencyUnit60);
        org.joda.money.Money money63 = money61.minusMajor((long) ' ');
        java.math.BigDecimal bigDecimal64 = money61.getAmountMinor();
        org.joda.money.BigMoney bigMoney65 = bigMoney57.minus(bigDecimal64);
        org.joda.money.BigMoney bigMoney66 = bigMoney65.withCurrencyScale();
        org.joda.money.CurrencyUnit currencyUnit67 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean68 = currencyUnit67.isPseudoCurrency();
        java.lang.String str69 = currencyUnit67.getCode();
        org.joda.money.Money money70 = org.joda.money.Money.zero(currencyUnit67);
        org.joda.money.CurrencyUnit currencyUnit71 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money72 = org.joda.money.Money.zero(currencyUnit71);
        org.joda.money.Money money74 = money72.minusMajor((long) ' ');
        java.math.BigDecimal bigDecimal75 = money72.getAmountMinor();
        org.joda.money.Money money76 = org.joda.money.Money.of(currencyUnit67, bigDecimal75);
        org.joda.money.Money money78 = org.joda.money.Money.ofMajor(currencyUnit67, 31L);
        java.lang.String str79 = money78.toString();
        boolean boolean80 = bigMoney65.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney65 and bigMoney66", (bigMoney65.compareTo(bigMoney66) == 0) == bigMoney65.equals(bigMoney66));
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        org.joda.money.Money money1 = org.joda.money.Money.parse("EUR 35");
        org.joda.money.Money money3 = money1.minusMinor((long) 'a');
        org.joda.money.CurrencyUnit currencyUnit5 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money6 = org.joda.money.Money.zero(currencyUnit5);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit5);
        org.joda.money.BigMoney bigMoney9 = org.joda.money.BigMoney.of(currencyUnit5, (double) '#');
        org.joda.money.CurrencyUnit currencyUnit11 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money12 = org.joda.money.Money.zero(currencyUnit11);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit11);
        org.joda.money.BigMoney bigMoney15 = org.joda.money.BigMoney.of(currencyUnit11, (double) '#');
        boolean boolean16 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney15);
        org.joda.money.CurrencyUnit currencyUnit17 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money18 = org.joda.money.Money.zero(currencyUnit17);
        org.joda.money.Money money20 = money18.minusMajor((long) ' ');
        boolean boolean21 = bigMoney15.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money20);
        org.joda.money.CurrencyUnit currencyUnit23 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money24 = org.joda.money.Money.zero(currencyUnit23);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit23);
        org.joda.money.BigMoney bigMoney27 = org.joda.money.BigMoney.of(currencyUnit23, (double) '#');
        org.joda.money.Money money28 = money20.withCurrencyUnit(currencyUnit23);
        org.joda.money.CurrencyUnit currencyUnit30 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money31 = org.joda.money.Money.zero(currencyUnit30);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit30);
        org.joda.money.BigMoney bigMoney34 = org.joda.money.BigMoney.of(currencyUnit30, (double) '#');
        boolean boolean35 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney34);
        org.joda.money.CurrencyUnit currencyUnit36 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money37 = org.joda.money.Money.zero(currencyUnit36);
        org.joda.money.Money money39 = money37.minusMajor((long) ' ');
        boolean boolean40 = bigMoney34.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money39);
        org.joda.money.Money money41 = money39.negated();
        org.joda.money.Money money43 = money41.minusMajor(1L);
        org.joda.money.Money money45 = money43.minusMajor(100L);
        int int46 = money20.compareTo((org.joda.money.BigMoneyProvider) money43);
        java.math.BigDecimal bigDecimal47 = money20.getAmountMinor();
        org.joda.money.BigMoney bigMoney48 = bigMoney9.withAmount(bigDecimal47);
        long long49 = bigMoney48.getAmountMinorLong();
        java.lang.String str50 = bigMoney48.toString();
        org.joda.money.BigMoney bigMoney52 = bigMoney48.withScale((int) (short) 0);
        org.joda.money.CurrencyUnit currencyUnit54 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money55 = org.joda.money.Money.zero(currencyUnit54);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit54);
        org.joda.money.BigMoney bigMoney58 = org.joda.money.BigMoney.of(currencyUnit54, (double) '#');
        java.math.BigDecimal bigDecimal59 = bigMoney58.getAmountMajor();
        org.joda.money.BigMoney bigMoney60 = bigMoney58.abs();
        boolean boolean61 = bigMoney60.isNegative();
        long long62 = bigMoney60.getAmountMinorLong();
        org.joda.money.BigMoney bigMoney63 = org.joda.money.MoneyUtils.subtract(bigMoney52, bigMoney60);
        org.joda.money.BigMoney bigMoney65 = bigMoney63.multipliedBy((double) 10);
        long long66 = bigMoney65.getAmountMinorLong();
        boolean boolean67 = money3.isLessThanOrEqual((org.joda.money.BigMoneyProvider) bigMoney65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money1 and bigMoney9", (money1.compareTo(bigMoney9) == 0) == money1.equals(bigMoney9));
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.joda.money.CurrencyUnit currencyUnit0 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean1 = currencyUnit0.isPseudoCurrency();
        boolean boolean2 = currencyUnit0.isPseudoCurrency();
        org.joda.money.BigMoney bigMoney3 = org.joda.money.BigMoney.zero(currencyUnit0);
        org.joda.money.BigMoney bigMoney5 = bigMoney3.multipliedBy((-1L));
        long long6 = bigMoney3.getAmountMajorLong();
        java.math.BigDecimal bigDecimal7 = bigMoney3.getAmount();
        org.joda.money.BigMoney bigMoney8 = bigMoney3.negated();
        org.joda.money.CurrencyUnit currencyUnit9 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean10 = currencyUnit9.isPseudoCurrency();
        boolean boolean11 = currencyUnit9.isPseudoCurrency();
        org.joda.money.BigMoney bigMoney12 = org.joda.money.BigMoney.zero(currencyUnit9);
        org.joda.money.BigMoney bigMoney14 = org.joda.money.BigMoney.of(currencyUnit9, (double) (short) 1);
        java.math.BigDecimal bigDecimal15 = bigMoney14.getAmount();
        org.joda.money.BigMoney bigMoney16 = org.joda.money.MoneyUtils.add(bigMoney8, bigMoney14);
        org.joda.money.BigMoney bigMoney18 = bigMoney14.minusMinor((long) (short) 100);
        int int19 = bigMoney18.getAmountMajorInt();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney3 and bigMoney18", (bigMoney3.compareTo(bigMoney18) == 0) == bigMoney3.equals(bigMoney18));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        org.joda.money.CurrencyUnit currencyUnit0 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean1 = currencyUnit0.isPseudoCurrency();
        java.lang.String str2 = currencyUnit0.getCode();
        org.joda.money.Money money3 = org.joda.money.Money.zero(currencyUnit0);
        org.joda.money.CurrencyUnit currencyUnit4 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money5 = org.joda.money.Money.zero(currencyUnit4);
        org.joda.money.Money money7 = money5.minusMajor((long) ' ');
        java.math.BigDecimal bigDecimal8 = money5.getAmountMinor();
        org.joda.money.Money money9 = org.joda.money.Money.of(currencyUnit0, bigDecimal8);
        org.joda.money.Money money11 = money9.plusMinor((long) (byte) 1);
        boolean boolean12 = org.joda.money.MoneyUtils.isZero((org.joda.money.BigMoneyProvider) money11);
        int int13 = money11.getAmountMajorInt();
        org.joda.money.Money money15 = money11.plusMinor((long) (byte) 1);
        org.joda.money.CurrencyUnit currencyUnit17 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money18 = org.joda.money.Money.zero(currencyUnit17);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit17);
        org.joda.money.BigMoney bigMoney21 = org.joda.money.BigMoney.of(currencyUnit17, (double) '#');
        boolean boolean22 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney21);
        boolean boolean23 = bigMoney21.isCurrencyScale();
        org.joda.money.CurrencyUnit currencyUnit25 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money26 = org.joda.money.Money.zero(currencyUnit25);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit25);
        org.joda.money.BigMoney bigMoney29 = org.joda.money.BigMoney.of(currencyUnit25, (double) 10L);
        java.util.Currency currency30 = currencyUnit25.toCurrency();
        org.joda.money.BigMoney bigMoney31 = bigMoney21.withCurrencyUnit(currencyUnit25);
        org.joda.money.CurrencyUnit currencyUnit32 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money33 = org.joda.money.Money.zero(currencyUnit32);
        org.joda.money.Money money35 = money33.minusMajor((long) ' ');
        java.math.BigDecimal bigDecimal36 = money33.getAmountMinor();
        org.joda.money.BigMoney bigMoney37 = bigMoney31.withAmount(bigDecimal36);
        java.math.RoundingMode roundingMode38 = null;
        org.joda.money.Money money39 = money15.minus(bigDecimal36, roundingMode38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money3 and bigMoney37", (money3.compareTo(bigMoney37) == 0) == money3.equals(bigMoney37));
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.CurrencyUnit currencyUnit13 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money14 = org.joda.money.Money.zero(currencyUnit13);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit13);
        org.joda.money.BigMoney bigMoney17 = org.joda.money.BigMoney.of(currencyUnit13, (double) '#');
        org.joda.money.Money money18 = money10.withCurrencyUnit(currencyUnit13);
        org.joda.money.BigMoney bigMoney20 = org.joda.money.BigMoney.ofMajor(currencyUnit13, (-1L));
        java.lang.String str21 = currencyUnit13.getSymbol();
        int int22 = currencyUnit13.getDecimalPlaces();
        org.joda.money.BigMoney bigMoney24 = org.joda.money.BigMoney.zero(currencyUnit13, (int) ' ');
        java.util.Currency currency25 = currencyUnit13.toCurrency();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money2 and bigMoney24", (money2.compareTo(bigMoney24) == 0) == money2.equals(bigMoney24));
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        int int7 = bigMoney5.getMinorPart();
        org.joda.money.BigMoney bigMoney9 = bigMoney5.plus((double) (-3500));
        org.joda.money.BigMoney bigMoney10 = bigMoney5.withCurrencyScale();
        java.math.BigDecimal bigDecimal11 = bigMoney5.getAmountMinor();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney5 and bigMoney10", (bigMoney5.compareTo(bigMoney10) == 0) == bigMoney5.equals(bigMoney10));
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        java.math.BigDecimal bigDecimal6 = bigMoney5.getAmountMajor();
        org.joda.money.CurrencyUnit currencyUnit8 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money9 = org.joda.money.Money.zero(currencyUnit8);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit8);
        org.joda.money.BigMoney bigMoney12 = org.joda.money.BigMoney.of(currencyUnit8, (double) '#');
        boolean boolean13 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney12);
        org.joda.money.CurrencyUnit currencyUnit14 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money15 = org.joda.money.Money.zero(currencyUnit14);
        org.joda.money.Money money17 = money15.minusMajor((long) ' ');
        boolean boolean18 = bigMoney12.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money17);
        org.joda.money.Money money19 = money17.negated();
        org.joda.money.Money money21 = money19.minusMajor(1L);
        org.joda.money.CurrencyUnit currencyUnit22 = money19.getCurrencyUnit();
        java.util.Currency currency23 = currencyUnit22.toCurrency();
        org.joda.money.BigMoney bigMoney24 = bigMoney5.withCurrencyUnit(currencyUnit22);
        org.joda.money.CurrencyUnit currencyUnit26 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money27 = org.joda.money.Money.zero(currencyUnit26);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit26);
        org.joda.money.BigMoney bigMoney30 = org.joda.money.BigMoney.of(currencyUnit26, (double) '#');
        boolean boolean31 = bigMoney30.isPositive();
        org.joda.money.BigMoney bigMoney32 = bigMoney30.toBigMoney();
        boolean boolean33 = bigMoney5.isLessThan((org.joda.money.BigMoneyProvider) bigMoney30);
        org.joda.money.CurrencyUnit currencyUnit34 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean35 = currencyUnit34.isPseudoCurrency();
        boolean boolean36 = currencyUnit34.isPseudoCurrency();
        org.joda.money.BigMoney bigMoney37 = org.joda.money.BigMoney.zero(currencyUnit34);
        org.joda.money.BigMoney bigMoney39 = bigMoney37.multipliedBy((-1L));
        long long40 = bigMoney37.getAmountMajorLong();
        org.joda.money.BigMoney bigMoney42 = bigMoney37.multipliedBy(3500L);
        org.joda.money.BigMoney bigMoney44 = bigMoney42.multipliedBy((long) 31);
        boolean boolean45 = bigMoney30.isSameCurrency((org.joda.money.BigMoneyProvider) bigMoney42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money2 and bigMoney37", (money2.compareTo(bigMoney37) == 0) == money2.equals(bigMoney37));
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.of("EUR");
        org.joda.money.BigMoney bigMoney3 = org.joda.money.BigMoney.ofMinor(currencyUnit1, (long) '0');
        java.lang.String str4 = currencyUnit1.toString();
        java.lang.String str5 = currencyUnit1.getSymbol();
        boolean boolean6 = currencyUnit1.isPseudoCurrency();
        org.joda.money.Money money8 = org.joda.money.Money.ofMajor(currencyUnit1, (long) 10);
        org.joda.money.CurrencyUnit currencyUnit9 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money10 = org.joda.money.Money.zero(currencyUnit9);
        org.joda.money.Money money12 = money10.minusMajor((long) ' ');
        org.joda.money.Money money14 = money10.plus((double) (byte) 10);
        org.joda.money.CurrencyUnit currencyUnit16 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money17 = org.joda.money.Money.zero(currencyUnit16);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit16);
        org.joda.money.BigMoney bigMoney20 = org.joda.money.BigMoney.of(currencyUnit16, (double) '#');
        java.math.BigDecimal bigDecimal21 = bigMoney20.getAmountMajor();
        org.joda.money.Money money22 = money10.minus(bigDecimal21);
        org.joda.money.Money money23 = org.joda.money.Money.of(currencyUnit1, bigDecimal21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money8 and money14", (money8.compareTo(money14) == 0) == money8.equals(money14));
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.Money money13 = money10.multipliedBy((long) (byte) 10);
        org.joda.money.BigMoney bigMoney14 = org.joda.money.BigMoney.of((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.CurrencyUnit currencyUnit16 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money17 = org.joda.money.Money.zero(currencyUnit16);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit16);
        org.joda.money.BigMoney bigMoney20 = org.joda.money.BigMoney.of(currencyUnit16, (double) '#');
        org.joda.money.CurrencyUnit currencyUnit22 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money23 = org.joda.money.Money.zero(currencyUnit22);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit22);
        org.joda.money.BigMoney bigMoney26 = org.joda.money.BigMoney.of(currencyUnit22, (double) '#');
        boolean boolean27 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney26);
        org.joda.money.CurrencyUnit currencyUnit28 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money29 = org.joda.money.Money.zero(currencyUnit28);
        org.joda.money.Money money31 = money29.minusMajor((long) ' ');
        boolean boolean32 = bigMoney26.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money31);
        org.joda.money.CurrencyUnit currencyUnit34 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money35 = org.joda.money.Money.zero(currencyUnit34);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit34);
        org.joda.money.BigMoney bigMoney38 = org.joda.money.BigMoney.of(currencyUnit34, (double) '#');
        org.joda.money.Money money39 = money31.withCurrencyUnit(currencyUnit34);
        org.joda.money.CurrencyUnit currencyUnit41 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money42 = org.joda.money.Money.zero(currencyUnit41);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit41);
        org.joda.money.BigMoney bigMoney45 = org.joda.money.BigMoney.of(currencyUnit41, (double) '#');
        boolean boolean46 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney45);
        org.joda.money.CurrencyUnit currencyUnit47 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money48 = org.joda.money.Money.zero(currencyUnit47);
        org.joda.money.Money money50 = money48.minusMajor((long) ' ');
        boolean boolean51 = bigMoney45.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money50);
        org.joda.money.Money money52 = money50.negated();
        org.joda.money.Money money54 = money52.minusMajor(1L);
        org.joda.money.Money money56 = money54.minusMajor(100L);
        int int57 = money31.compareTo((org.joda.money.BigMoneyProvider) money54);
        java.math.BigDecimal bigDecimal58 = money31.getAmountMinor();
        org.joda.money.BigMoney bigMoney59 = bigMoney20.withAmount(bigDecimal58);
        long long60 = bigMoney59.getAmountMinorLong();
        java.lang.String str61 = bigMoney59.toString();
        org.joda.money.BigMoney bigMoney63 = bigMoney59.withScale((int) (short) 0);
        org.joda.money.CurrencyUnit currencyUnit65 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money66 = org.joda.money.Money.zero(currencyUnit65);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit65);
        org.joda.money.BigMoney bigMoney69 = org.joda.money.BigMoney.of(currencyUnit65, (double) '#');
        java.math.BigDecimal bigDecimal70 = bigMoney69.getAmountMajor();
        org.joda.money.BigMoney bigMoney71 = bigMoney69.abs();
        boolean boolean72 = bigMoney71.isNegative();
        long long73 = bigMoney71.getAmountMinorLong();
        org.joda.money.BigMoney bigMoney74 = org.joda.money.MoneyUtils.subtract(bigMoney63, bigMoney71);
        org.joda.money.BigMoney bigMoney76 = bigMoney74.multipliedBy((double) 10);
        long long77 = bigMoney76.getAmountMinorLong();
        org.joda.money.BigMoney bigMoney78 = org.joda.money.MoneyUtils.max(bigMoney14, bigMoney76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money10 and bigMoney78", (money10.compareTo(bigMoney78) == 0) == money10.equals(bigMoney78));
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        org.joda.money.CurrencyUnit currencyUnit4 = org.joda.money.CurrencyUnit.registerCurrency("EUR", (int) '#', (int) (short) -1, true);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.zero(currencyUnit4);
        boolean boolean6 = org.joda.money.MoneyUtils.isNegative((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean8 = currencyUnit7.isPseudoCurrency();
        boolean boolean9 = currencyUnit7.isPseudoCurrency();
        org.joda.money.BigMoney bigMoney10 = org.joda.money.BigMoney.zero(currencyUnit7);
        org.joda.money.BigMoney bigMoney12 = bigMoney10.multipliedBy((-1L));
        long long13 = bigMoney10.getAmountMajorLong();
        org.joda.money.BigMoney bigMoney15 = bigMoney10.multipliedBy(3500L);
        org.joda.money.BigMoney bigMoney16 = org.joda.money.MoneyUtils.min(bigMoney5, bigMoney10);
        org.joda.money.BigMoney bigMoney18 = bigMoney5.multipliedBy(0.0d);
        org.joda.money.BigMoney bigMoney20 = bigMoney18.withAmount((double) 965);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney5 and bigMoney18", (bigMoney5.compareTo(bigMoney18) == 0) == bigMoney5.equals(bigMoney18));
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit7);
        org.joda.money.BigMoney bigMoney11 = org.joda.money.BigMoney.of(currencyUnit7, (double) '#');
        boolean boolean12 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney11);
        org.joda.money.CurrencyUnit currencyUnit13 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money14 = org.joda.money.Money.zero(currencyUnit13);
        org.joda.money.Money money16 = money14.minusMajor((long) ' ');
        boolean boolean17 = bigMoney11.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money16);
        org.joda.money.CurrencyUnit currencyUnit19 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money20 = org.joda.money.Money.zero(currencyUnit19);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit19);
        org.joda.money.BigMoney bigMoney23 = org.joda.money.BigMoney.of(currencyUnit19, (double) '#');
        org.joda.money.Money money24 = money16.withCurrencyUnit(currencyUnit19);
        org.joda.money.CurrencyUnit currencyUnit26 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money27 = org.joda.money.Money.zero(currencyUnit26);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit26);
        org.joda.money.BigMoney bigMoney30 = org.joda.money.BigMoney.of(currencyUnit26, (double) '#');
        boolean boolean31 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney30);
        org.joda.money.CurrencyUnit currencyUnit32 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money33 = org.joda.money.Money.zero(currencyUnit32);
        org.joda.money.Money money35 = money33.minusMajor((long) ' ');
        boolean boolean36 = bigMoney30.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money35);
        org.joda.money.Money money37 = money35.negated();
        org.joda.money.Money money39 = money37.minusMajor(1L);
        org.joda.money.Money money41 = money39.minusMajor(100L);
        int int42 = money16.compareTo((org.joda.money.BigMoneyProvider) money39);
        java.math.BigDecimal bigDecimal43 = money16.getAmountMinor();
        org.joda.money.BigMoney bigMoney44 = bigMoney5.withAmount(bigDecimal43);
        org.joda.money.BigMoney bigMoney45 = bigMoney5.negated();
        int int46 = bigMoney5.getAmountMinorInt();
        org.joda.money.BigMoney bigMoney47 = bigMoney5.withCurrencyScale();
        org.joda.money.BigMoney bigMoney49 = bigMoney5.plus((double) 10.0f);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney5 and bigMoney47", (bigMoney5.compareTo(bigMoney47) == 0) == bigMoney5.equals(bigMoney47));
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.Money money12 = money10.negated();
        org.joda.money.CurrencyUnit currencyUnit14 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money15 = org.joda.money.Money.zero(currencyUnit14);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit14);
        org.joda.money.BigMoney bigMoney18 = org.joda.money.BigMoney.of(currencyUnit14, (double) '#');
        boolean boolean19 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney18);
        org.joda.money.CurrencyUnit currencyUnit20 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money21 = org.joda.money.Money.zero(currencyUnit20);
        org.joda.money.Money money23 = money21.minusMajor((long) ' ');
        boolean boolean24 = bigMoney18.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money23);
        org.joda.money.Money money25 = money23.negated();
        org.joda.money.Money money26 = money10.minus(money25);
        org.joda.money.CurrencyUnit currencyUnit28 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money29 = org.joda.money.Money.zero(currencyUnit28);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit28);
        org.joda.money.BigMoney bigMoney32 = org.joda.money.BigMoney.of(currencyUnit28, (double) '#');
        boolean boolean33 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney32);
        org.joda.money.CurrencyUnit currencyUnit34 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money35 = org.joda.money.Money.zero(currencyUnit34);
        org.joda.money.Money money37 = money35.minusMajor((long) ' ');
        boolean boolean38 = bigMoney32.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money37);
        int int39 = bigMoney32.getAmountMajorInt();
        boolean boolean40 = money25.isLessThanOrEqual((org.joda.money.BigMoneyProvider) bigMoney32);
        java.math.BigDecimal bigDecimal41 = money25.getAmountMajor();
        boolean boolean42 = org.joda.money.MoneyUtils.isPositiveOrZero((org.joda.money.BigMoneyProvider) money25);
        org.joda.money.Money money44 = money25.minus((double) ',');
        org.joda.money.CurrencyUnit currencyUnit45 = money44.getCurrencyUnit();
        org.joda.money.Money money47 = org.joda.money.Money.ofMajor(currencyUnit45, (long) (short) 10);
        org.joda.money.BigMoney bigMoney48 = org.joda.money.BigMoney.zero(currencyUnit45);
        org.joda.money.Money money50 = org.joda.money.Money.ofMajor(currencyUnit45, (long) 31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money2 and bigMoney48", (money2.compareTo(bigMoney48) == 0) == money2.equals(bigMoney48));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        java.math.BigDecimal bigDecimal6 = bigMoney5.getAmountMajor();
        org.joda.money.BigMoney bigMoney7 = bigMoney5.abs();
        org.joda.money.CurrencyUnit currencyUnit9 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money10 = org.joda.money.Money.zero(currencyUnit9);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit9);
        org.joda.money.BigMoney bigMoney13 = org.joda.money.BigMoney.of(currencyUnit9, (double) '#');
        boolean boolean14 = bigMoney13.isPositive();
        org.joda.money.BigMoney bigMoney15 = bigMoney13.toBigMoney();
        org.joda.money.BigMoney bigMoney16 = org.joda.money.MoneyUtils.max(bigMoney7, bigMoney13);
        org.joda.money.CurrencyUnit currencyUnit17 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean18 = currencyUnit17.isPseudoCurrency();
        org.joda.money.Money money20 = org.joda.money.Money.ofMajor(currencyUnit17, (-1L));
        int int21 = currencyUnit17.getDecimalPlaces();
        org.joda.money.BigMoney bigMoney22 = bigMoney7.withCurrencyUnit(currencyUnit17);
        org.joda.money.Money money24 = org.joda.money.Money.ofMinor(currencyUnit17, (long) 35);
        org.joda.money.BigMoney bigMoney26 = org.joda.money.BigMoney.ofMinor(currencyUnit17, (long) (byte) 0);
        org.joda.money.CurrencyUnit currencyUnit28 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money29 = org.joda.money.Money.zero(currencyUnit28);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit28);
        org.joda.money.BigMoney bigMoney32 = org.joda.money.BigMoney.of(currencyUnit28, (double) '#');
        boolean boolean33 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney32);
        org.joda.money.CurrencyUnit currencyUnit34 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money35 = org.joda.money.Money.zero(currencyUnit34);
        org.joda.money.Money money37 = money35.minusMajor((long) ' ');
        boolean boolean38 = bigMoney32.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money37);
        org.joda.money.Money money39 = money37.negated();
        org.joda.money.CurrencyUnit currencyUnit41 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money42 = org.joda.money.Money.zero(currencyUnit41);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit41);
        org.joda.money.BigMoney bigMoney45 = org.joda.money.BigMoney.of(currencyUnit41, (double) '#');
        boolean boolean46 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney45);
        org.joda.money.CurrencyUnit currencyUnit47 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money48 = org.joda.money.Money.zero(currencyUnit47);
        org.joda.money.Money money50 = money48.minusMajor((long) ' ');
        boolean boolean51 = bigMoney45.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money50);
        org.joda.money.Money money52 = money50.negated();
        org.joda.money.Money money53 = money37.minus(money52);
        org.joda.money.CurrencyUnit currencyUnit55 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money56 = org.joda.money.Money.zero(currencyUnit55);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit55);
        org.joda.money.BigMoney bigMoney59 = org.joda.money.BigMoney.of(currencyUnit55, (double) '#');
        boolean boolean60 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney59);
        org.joda.money.CurrencyUnit currencyUnit61 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money62 = org.joda.money.Money.zero(currencyUnit61);
        org.joda.money.Money money64 = money62.minusMajor((long) ' ');
        boolean boolean65 = bigMoney59.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money64);
        int int66 = bigMoney59.getAmountMajorInt();
        boolean boolean67 = money52.isLessThanOrEqual((org.joda.money.BigMoneyProvider) bigMoney59);
        org.joda.money.CurrencyUnit currencyUnit69 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money70 = org.joda.money.Money.zero(currencyUnit69);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit69);
        org.joda.money.BigMoney bigMoney73 = org.joda.money.BigMoney.of(currencyUnit69, (double) '#');
        boolean boolean74 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney73);
        org.joda.money.CurrencyUnit currencyUnit75 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money76 = org.joda.money.Money.zero(currencyUnit75);
        org.joda.money.Money money78 = money76.minusMajor((long) ' ');
        boolean boolean79 = bigMoney73.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money78);
        org.joda.money.Money money81 = money78.multipliedBy((long) (byte) 10);
        boolean boolean82 = bigMoney59.isLessThan((org.joda.money.BigMoneyProvider) money78);
        org.joda.money.BigMoney bigMoney84 = bigMoney59.multipliedBy((long) 10);
        org.joda.money.Money money85 = org.joda.money.Money.of((org.joda.money.BigMoneyProvider) bigMoney84);
        boolean boolean86 = bigMoney26.isEqual((org.joda.money.BigMoneyProvider) bigMoney84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money2 and bigMoney26", (money2.compareTo(bigMoney26) == 0) == money2.equals(bigMoney26));
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        java.math.BigDecimal bigDecimal6 = bigMoney5.getAmountMajor();
        org.joda.money.BigMoney bigMoney7 = bigMoney5.abs();
        org.joda.money.CurrencyUnit currencyUnit9 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money10 = org.joda.money.Money.zero(currencyUnit9);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit9);
        org.joda.money.BigMoney bigMoney13 = org.joda.money.BigMoney.of(currencyUnit9, (double) '#');
        boolean boolean14 = bigMoney13.isPositive();
        org.joda.money.BigMoney bigMoney15 = bigMoney13.toBigMoney();
        org.joda.money.BigMoney bigMoney16 = org.joda.money.MoneyUtils.max(bigMoney7, bigMoney13);
        org.joda.money.CurrencyUnit currencyUnit17 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean18 = currencyUnit17.isPseudoCurrency();
        org.joda.money.Money money20 = org.joda.money.Money.ofMajor(currencyUnit17, (-1L));
        int int21 = currencyUnit17.getDecimalPlaces();
        org.joda.money.BigMoney bigMoney22 = bigMoney7.withCurrencyUnit(currencyUnit17);
        org.joda.money.Money money24 = org.joda.money.Money.ofMinor(currencyUnit17, (long) 35);
        java.lang.String str25 = currencyUnit17.toString();
        org.joda.money.CurrencyUnit currencyUnit26 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money27 = org.joda.money.Money.zero(currencyUnit26);
        org.joda.money.Money money29 = money27.minusMajor((long) ' ');
        java.lang.String str30 = money29.toString();
        org.joda.money.Money money32 = money29.minusMajor((long) (short) 1);
        org.joda.money.Money money34 = money29.minusMinor((long) '#');
        org.joda.money.CurrencyUnit currencyUnit36 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money37 = org.joda.money.Money.zero(currencyUnit36);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit36);
        org.joda.money.BigMoney bigMoney40 = org.joda.money.BigMoney.of(currencyUnit36, (double) '#');
        java.math.BigDecimal bigDecimal41 = bigMoney40.getAmountMajor();
        org.joda.money.BigMoney bigMoney42 = bigMoney40.abs();
        org.joda.money.BigMoney bigMoney43 = bigMoney42.negated();
        org.joda.money.BigMoney bigMoney45 = bigMoney42.minusMinor((long) '#');
        org.joda.money.CurrencyUnit currencyUnit47 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money48 = org.joda.money.Money.zero(currencyUnit47);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit47);
        org.joda.money.BigMoney bigMoney51 = org.joda.money.BigMoney.of(currencyUnit47, (double) '#');
        org.joda.money.BigMoney bigMoney53 = org.joda.money.BigMoney.ofMinor(currencyUnit47, (long) (byte) -1);
        boolean boolean54 = bigMoney53.isNegativeOrZero();
        org.joda.money.BigMoney bigMoney55 = bigMoney45.plus((org.joda.money.BigMoneyProvider) bigMoney53);
        long long56 = bigMoney55.getAmountMajorLong();
        org.joda.money.CurrencyUnit currencyUnit58 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money59 = org.joda.money.Money.zero(currencyUnit58);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit58);
        org.joda.money.BigMoney bigMoney62 = org.joda.money.BigMoney.of(currencyUnit58, (double) '#');
        java.math.BigDecimal bigDecimal63 = bigMoney62.getAmountMajor();
        org.joda.money.BigMoney bigMoney64 = bigMoney62.abs();
        org.joda.money.BigMoney bigMoney65 = bigMoney64.negated();
        org.joda.money.BigMoney bigMoney67 = bigMoney64.minusMinor((long) '#');
        org.joda.money.CurrencyUnit currencyUnit68 = bigMoney67.getCurrencyUnit();
        int int69 = bigMoney67.getAmountMinorInt();
        java.math.BigDecimal bigDecimal70 = bigMoney67.getAmountMajor();
        org.joda.money.BigMoney bigMoney71 = bigMoney55.multipliedBy(bigDecimal70);
        org.joda.money.Money money72 = money34.plus(bigDecimal70);
        org.joda.money.Money money73 = org.joda.money.Money.of(currencyUnit17, bigDecimal70);
        java.util.Set<java.lang.String> strSet74 = currencyUnit17.getCountryCodes();
        org.joda.money.BigMoney bigMoney76 = org.joda.money.BigMoney.zero(currencyUnit17, 10);
        java.lang.String str77 = currencyUnit17.getCode();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money2 and bigMoney76", (money2.compareTo(bigMoney76) == 0) == money2.equals(bigMoney76));
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.Money money12 = money10.negated();
        org.joda.money.Money money14 = money12.minusMajor(1L);
        org.joda.money.Money money16 = money14.minusMajor(100L);
        org.joda.money.Money money18 = money16.minusMinor((long) 3);
        org.joda.money.Money money20 = money16.plusMinor((long) '0');
        org.joda.money.CurrencyUnit currencyUnit21 = money16.getCurrencyUnit();
        java.lang.String str22 = currencyUnit21.toString();
        org.joda.money.BigMoney bigMoney23 = org.joda.money.BigMoney.zero(currencyUnit21);
        org.joda.money.BigMoney bigMoney25 = bigMoney23.minusMajor((long) (short) 100);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money2 and bigMoney23", (money2.compareTo(bigMoney23) == 0) == money2.equals(bigMoney23));
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.Money money12 = money10.negated();
        org.joda.money.Money money14 = money12.minusMajor(1L);
        org.joda.money.CurrencyUnit currencyUnit15 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money16 = org.joda.money.Money.zero(currencyUnit15);
        org.joda.money.Money money18 = money16.minusMajor((long) ' ');
        java.math.RoundingMode roundingMode20 = null;
        org.joda.money.Money money21 = money18.dividedBy(1L, roundingMode20);
        boolean boolean22 = money14.isGreaterThan((org.joda.money.BigMoneyProvider) money21);
        org.joda.money.CurrencyUnit currencyUnit23 = org.joda.money.CurrencyUnit.CHF;
        java.lang.String str24 = currencyUnit23.getCode();
        org.joda.money.CurrencyUnit currencyUnit25 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean26 = currencyUnit25.isPseudoCurrency();
        java.lang.String str27 = currencyUnit25.getCode();
        org.joda.money.BigMoney bigMoney30 = org.joda.money.BigMoney.ofScale(currencyUnit25, (long) (short) 10, (int) (byte) 10);
        int int31 = currencyUnit25.getNumericCode();
        org.joda.money.BigMoney bigMoney32 = org.joda.money.BigMoney.zero(currencyUnit25);
        java.util.Set<java.lang.String> strSet33 = currencyUnit25.getCountryCodes();
        org.joda.money.Money money35 = org.joda.money.Money.ofMajor(currencyUnit25, (long) '+');
        boolean boolean36 = currencyUnit23.equals((java.lang.Object) money35);
        org.joda.money.Money money37 = org.joda.money.MoneyUtils.subtract(money21, money35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money2 and bigMoney32", (money2.compareTo(bigMoney32) == 0) == money2.equals(bigMoney32));
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        org.joda.money.CurrencyUnit currencyUnit0 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean1 = currencyUnit0.isPseudoCurrency();
        java.lang.String str2 = currencyUnit0.getCode();
        org.joda.money.Money money3 = org.joda.money.Money.zero(currencyUnit0);
        int int4 = money3.getMinorPart();
        org.joda.money.CurrencyUnit currencyUnit6 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money7 = org.joda.money.Money.zero(currencyUnit6);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit6);
        org.joda.money.BigMoney bigMoney10 = org.joda.money.BigMoney.of(currencyUnit6, (double) '#');
        boolean boolean11 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney10);
        org.joda.money.CurrencyUnit currencyUnit12 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money13 = org.joda.money.Money.zero(currencyUnit12);
        org.joda.money.Money money15 = money13.minusMajor((long) ' ');
        boolean boolean16 = bigMoney10.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money15);
        org.joda.money.Money money17 = money15.negated();
        org.joda.money.Money money19 = money17.minusMajor(1L);
        org.joda.money.CurrencyUnit currencyUnit20 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money21 = org.joda.money.Money.zero(currencyUnit20);
        org.joda.money.Money money23 = money21.minusMajor((long) ' ');
        java.math.RoundingMode roundingMode25 = null;
        org.joda.money.Money money26 = money23.dividedBy(1L, roundingMode25);
        boolean boolean27 = money19.isGreaterThan((org.joda.money.BigMoneyProvider) money26);
        boolean boolean28 = money3.isLessThan((org.joda.money.BigMoneyProvider) money19);
        org.joda.money.CurrencyUnit currencyUnit29 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money30 = org.joda.money.Money.zero(currencyUnit29);
        org.joda.money.Money money32 = money30.minusMajor((long) ' ');
        java.lang.String str33 = money32.toString();
        org.joda.money.Money money35 = money32.minusMajor((long) (short) 1);
        org.joda.money.CurrencyUnit currencyUnit36 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money37 = org.joda.money.Money.zero(currencyUnit36);
        org.joda.money.Money money39 = money37.minusMajor((long) ' ');
        org.joda.money.Money money41 = money37.plus((double) (byte) 10);
        org.joda.money.Money money42 = org.joda.money.MoneyUtils.max(money35, money41);
        org.joda.money.Money money44 = money41.withAmount((double) (-13300L));
        org.joda.money.Money money45 = org.joda.money.MoneyUtils.add(money19, money41);
        org.joda.money.BigMoney bigMoney46 = money41.toBigMoney();
        org.joda.money.CurrencyUnit currencyUnit48 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money49 = org.joda.money.Money.zero(currencyUnit48);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit48);
        org.joda.money.BigMoney bigMoney52 = org.joda.money.BigMoney.of(currencyUnit48, (double) '#');
        boolean boolean53 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney52);
        org.joda.money.CurrencyUnit currencyUnit54 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money55 = org.joda.money.Money.zero(currencyUnit54);
        org.joda.money.Money money57 = money55.minusMajor((long) ' ');
        boolean boolean58 = bigMoney52.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money57);
        int int59 = bigMoney52.getAmountMajorInt();
        java.math.BigDecimal bigDecimal60 = bigMoney52.getAmountMinor();
        boolean boolean61 = bigMoney52.isZero();
        org.joda.money.BigMoney bigMoney62 = org.joda.money.MoneyUtils.subtract(bigMoney46, bigMoney52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money41 and bigMoney46", (money41.compareTo(bigMoney46) == 0) == money41.equals(bigMoney46));
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        org.joda.money.BigMoney bigMoney1 = org.joda.money.BigMoney.parse("EUR -32.00");
        org.joda.money.BigMoney bigMoney3 = bigMoney1.plus((double) 10L);
        org.joda.money.CurrencyUnit currencyUnit5 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money6 = org.joda.money.Money.zero(currencyUnit5);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit5);
        org.joda.money.BigMoney bigMoney9 = org.joda.money.BigMoney.of(currencyUnit5, (double) '#');
        boolean boolean10 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney9);
        org.joda.money.CurrencyUnit currencyUnit11 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money12 = org.joda.money.Money.zero(currencyUnit11);
        org.joda.money.Money money14 = money12.minusMajor((long) ' ');
        boolean boolean15 = bigMoney9.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money14);
        int int16 = bigMoney9.getAmountMajorInt();
        org.joda.money.CurrencyUnit currencyUnit18 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money19 = org.joda.money.Money.zero(currencyUnit18);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit18);
        org.joda.money.BigMoney bigMoney22 = org.joda.money.BigMoney.of(currencyUnit18, (double) '#');
        boolean boolean23 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney22);
        org.joda.money.CurrencyUnit currencyUnit24 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money25 = org.joda.money.Money.zero(currencyUnit24);
        org.joda.money.Money money27 = money25.minusMajor((long) ' ');
        boolean boolean28 = bigMoney22.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money27);
        org.joda.money.CurrencyUnit currencyUnit30 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money31 = org.joda.money.Money.zero(currencyUnit30);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit30);
        org.joda.money.BigMoney bigMoney34 = org.joda.money.BigMoney.of(currencyUnit30, (double) '#');
        org.joda.money.Money money35 = money27.withCurrencyUnit(currencyUnit30);
        org.joda.money.BigMoney bigMoney36 = bigMoney9.plus((org.joda.money.BigMoneyProvider) money27);
        org.joda.money.BigMoney bigMoney38 = bigMoney36.minus((double) (byte) 0);
        boolean boolean39 = bigMoney38.isZero();
        java.math.RoundingMode roundingMode41 = null;
        org.joda.money.BigMoney bigMoney42 = bigMoney38.minusRetainScale((double) (byte) 0, roundingMode41);
        org.joda.money.BigMoney bigMoney44 = bigMoney38.plus((double) (byte) 1);
        org.joda.money.BigMoney bigMoney45 = org.joda.money.MoneyUtils.min(bigMoney3, bigMoney44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney1 and money14", (bigMoney1.compareTo(money14) == 0) == bigMoney1.equals(money14));
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        org.joda.money.CurrencyUnit currencyUnit0 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money1 = org.joda.money.Money.zero(currencyUnit0);
        org.joda.money.Money money3 = money1.minusMajor((long) ' ');
        java.lang.String str4 = money3.toString();
        org.joda.money.Money money6 = money3.minusMajor((long) (short) 1);
        org.joda.money.CurrencyUnit currencyUnit8 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money9 = org.joda.money.Money.zero(currencyUnit8);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit8);
        org.joda.money.BigMoney bigMoney12 = org.joda.money.BigMoney.of(currencyUnit8, (double) '#');
        boolean boolean13 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney12);
        org.joda.money.CurrencyUnit currencyUnit14 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money15 = org.joda.money.Money.zero(currencyUnit14);
        org.joda.money.Money money17 = money15.minusMajor((long) ' ');
        boolean boolean18 = bigMoney12.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money17);
        org.joda.money.CurrencyUnit currencyUnit20 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money21 = org.joda.money.Money.zero(currencyUnit20);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit20);
        org.joda.money.BigMoney bigMoney24 = org.joda.money.BigMoney.of(currencyUnit20, (double) '#');
        org.joda.money.Money money25 = money17.withCurrencyUnit(currencyUnit20);
        org.joda.money.CurrencyUnit currencyUnit27 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money28 = org.joda.money.Money.zero(currencyUnit27);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit27);
        org.joda.money.BigMoney bigMoney31 = org.joda.money.BigMoney.of(currencyUnit27, (double) '#');
        boolean boolean32 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney31);
        org.joda.money.CurrencyUnit currencyUnit33 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money34 = org.joda.money.Money.zero(currencyUnit33);
        org.joda.money.Money money36 = money34.minusMajor((long) ' ');
        boolean boolean37 = bigMoney31.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money36);
        org.joda.money.Money money38 = money36.negated();
        org.joda.money.Money money40 = money38.minusMajor(1L);
        org.joda.money.Money money42 = money40.minusMajor(100L);
        int int43 = money17.compareTo((org.joda.money.BigMoneyProvider) money40);
        java.math.BigDecimal bigDecimal44 = money17.getAmountMinor();
        org.joda.money.Money money46 = money17.withAmount((double) 1L);
        org.joda.money.CurrencyUnit currencyUnit48 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money49 = org.joda.money.Money.zero(currencyUnit48);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit48);
        org.joda.money.BigMoney bigMoney52 = org.joda.money.BigMoney.of(currencyUnit48, (double) '#');
        boolean boolean53 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney52);
        org.joda.money.CurrencyUnit currencyUnit54 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money55 = org.joda.money.Money.zero(currencyUnit54);
        org.joda.money.Money money57 = money55.minusMajor((long) ' ');
        boolean boolean58 = bigMoney52.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money57);
        org.joda.money.Money money59 = money57.negated();
        long long60 = money57.getAmountMajorLong();
        org.joda.money.Money money61 = org.joda.money.MoneyUtils.min(money46, money57);
        boolean boolean62 = org.joda.money.MoneyUtils.isNegative((org.joda.money.BigMoneyProvider) money57);
        boolean boolean63 = money6.isGreaterThanOrEqual((org.joda.money.BigMoneyProvider) money57);
        org.joda.money.CurrencyUnit currencyUnit64 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean65 = currencyUnit64.isPseudoCurrency();
        java.lang.String str66 = currencyUnit64.getCode();
        org.joda.money.Money money67 = org.joda.money.Money.zero(currencyUnit64);
        org.joda.money.CurrencyUnit currencyUnit68 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money69 = org.joda.money.Money.zero(currencyUnit68);
        org.joda.money.Money money71 = money69.minusMajor((long) ' ');
        java.math.BigDecimal bigDecimal72 = money69.getAmountMinor();
        org.joda.money.Money money73 = org.joda.money.Money.of(currencyUnit64, bigDecimal72);
        java.math.BigDecimal bigDecimal74 = money73.getAmountMajor();
        org.joda.money.Money money75 = money6.plus(bigDecimal74);
        org.joda.money.CurrencyUnit currencyUnit76 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean77 = currencyUnit76.isPseudoCurrency();
        boolean boolean78 = currencyUnit76.isPseudoCurrency();
        org.joda.money.BigMoney bigMoney79 = org.joda.money.BigMoney.zero(currencyUnit76);
        java.math.BigDecimal bigDecimal80 = bigMoney79.getAmountMajor();
        long long81 = bigMoney79.getAmountMajorLong();
        java.math.RoundingMode roundingMode83 = null;
        org.joda.money.BigMoney bigMoney84 = bigMoney79.plusRetainScale((double) (byte) 0, roundingMode83);
        org.joda.money.CurrencyUnit currencyUnit85 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean86 = currencyUnit85.isPseudoCurrency();
        boolean boolean87 = currencyUnit85.isPseudoCurrency();
        org.joda.money.BigMoney bigMoney88 = org.joda.money.BigMoney.zero(currencyUnit85);
        org.joda.money.BigMoney bigMoney90 = bigMoney88.multipliedBy((-1L));
        long long91 = bigMoney88.getAmountMajorLong();
        java.math.BigDecimal bigDecimal92 = bigMoney88.getAmount();
        org.joda.money.BigMoney bigMoney93 = bigMoney88.negated();
        org.joda.money.BigMoney bigMoney94 = org.joda.money.MoneyUtils.subtract(bigMoney84, bigMoney88);
        org.joda.money.BigMoney bigMoney96 = bigMoney88.withAmount((double) (byte) 100);
        boolean boolean97 = money6.equals((java.lang.Object) bigMoney96);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money1 and bigMoney79", (money1.compareTo(bigMoney79) == 0) == money1.equals(bigMoney79));
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        org.joda.money.CurrencyUnit currencyUnit0 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean1 = currencyUnit0.isPseudoCurrency();
        java.lang.String str2 = currencyUnit0.getCode();
        org.joda.money.Money money3 = org.joda.money.Money.zero(currencyUnit0);
        org.joda.money.CurrencyUnit currencyUnit4 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money5 = org.joda.money.Money.zero(currencyUnit4);
        org.joda.money.Money money7 = money5.minusMajor((long) ' ');
        java.math.BigDecimal bigDecimal8 = money5.getAmountMinor();
        org.joda.money.Money money9 = org.joda.money.Money.of(currencyUnit0, bigDecimal8);
        org.joda.money.BigMoney bigMoney11 = org.joda.money.BigMoney.ofMajor(currencyUnit0, 3L);
        java.util.Set<java.lang.String> strSet12 = currencyUnit0.getCountryCodes();
        org.joda.money.BigMoney bigMoney14 = org.joda.money.BigMoney.ofMinor(currencyUnit0, 0L);
        java.lang.String str15 = currencyUnit0.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money3 and bigMoney14", (money3.compareTo(bigMoney14) == 0) == money3.equals(bigMoney14));
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        org.joda.money.CurrencyUnit currencyUnit0 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money1 = org.joda.money.Money.zero(currencyUnit0);
        org.joda.money.CurrencyUnit currencyUnit2 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money3 = org.joda.money.Money.zero(currencyUnit2);
        org.joda.money.Money money5 = money3.minusMajor((long) ' ');
        java.math.BigDecimal bigDecimal6 = money3.getAmountMinor();
        org.joda.money.BigMoney bigMoney7 = org.joda.money.BigMoney.of(currencyUnit0, bigDecimal6);
        org.joda.money.Money money9 = org.joda.money.Money.ofMajor(currencyUnit0, 3L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money1 and bigMoney7", (money1.compareTo(bigMoney7) == 0) == money1.equals(bigMoney7));
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        org.joda.money.CurrencyUnit currencyUnit0 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money1 = org.joda.money.Money.zero(currencyUnit0);
        org.joda.money.Money money3 = money1.minusMajor((long) ' ');
        java.math.BigDecimal bigDecimal4 = money1.getAmountMinor();
        java.math.BigDecimal bigDecimal5 = money1.getAmount();
        org.joda.money.Money money6 = money1.negated();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal4 and bigDecimal5", (bigDecimal4.compareTo(bigDecimal5) == 0) == bigDecimal4.equals(bigDecimal5));
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.Money money12 = money10.negated();
        org.joda.money.CurrencyUnit currencyUnit14 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money15 = org.joda.money.Money.zero(currencyUnit14);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit14);
        org.joda.money.BigMoney bigMoney18 = org.joda.money.BigMoney.of(currencyUnit14, (double) '#');
        boolean boolean19 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney18);
        org.joda.money.CurrencyUnit currencyUnit20 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money21 = org.joda.money.Money.zero(currencyUnit20);
        org.joda.money.Money money23 = money21.minusMajor((long) ' ');
        boolean boolean24 = bigMoney18.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money23);
        org.joda.money.Money money25 = money23.negated();
        org.joda.money.Money money26 = money10.minus(money25);
        org.joda.money.CurrencyUnit currencyUnit28 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money29 = org.joda.money.Money.zero(currencyUnit28);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit28);
        org.joda.money.BigMoney bigMoney32 = org.joda.money.BigMoney.of(currencyUnit28, (double) '#');
        boolean boolean33 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney32);
        org.joda.money.CurrencyUnit currencyUnit34 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money35 = org.joda.money.Money.zero(currencyUnit34);
        org.joda.money.Money money37 = money35.minusMajor((long) ' ');
        boolean boolean38 = bigMoney32.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money37);
        int int39 = bigMoney32.getAmountMajorInt();
        boolean boolean40 = money25.isLessThanOrEqual((org.joda.money.BigMoneyProvider) bigMoney32);
        java.math.BigDecimal bigDecimal41 = money25.getAmountMajor();
        boolean boolean42 = org.joda.money.MoneyUtils.isPositiveOrZero((org.joda.money.BigMoneyProvider) money25);
        org.joda.money.Money money44 = money25.minus((double) ',');
        org.joda.money.CurrencyUnit currencyUnit45 = money44.getCurrencyUnit();
        org.joda.money.Money money47 = org.joda.money.Money.ofMajor(currencyUnit45, (long) (short) 10);
        org.joda.money.BigMoney bigMoney48 = org.joda.money.BigMoney.zero(currencyUnit45);
        org.joda.money.Money money49 = bigMoney48.toMoney();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money2 and bigMoney48", (money2.compareTo(bigMoney48) == 0) == money2.equals(bigMoney48));
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        org.joda.money.CurrencyUnit currencyUnit0 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean1 = currencyUnit0.isPseudoCurrency();
        boolean boolean2 = currencyUnit0.isPseudoCurrency();
        org.joda.money.BigMoney bigMoney3 = org.joda.money.BigMoney.zero(currencyUnit0);
        java.math.BigDecimal bigDecimal4 = bigMoney3.getAmountMajor();
        boolean boolean5 = bigMoney3.isZero();
        org.joda.money.BigMoney bigMoney7 = bigMoney3.minus((double) 100L);
        int int8 = bigMoney3.getScale();
        org.joda.money.BigMoney bigMoney9 = bigMoney3.withCurrencyScale();
        boolean boolean10 = bigMoney3.isPositive();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney3 and bigMoney9", (bigMoney3.compareTo(bigMoney9) == 0) == bigMoney3.equals(bigMoney9));
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        org.joda.money.BigMoney bigMoney1 = org.joda.money.BigMoney.parse("EUR -32.00");
        org.joda.money.BigMoney bigMoney3 = bigMoney1.plus((double) 10L);
        boolean boolean4 = bigMoney1.isNegative();
        java.math.RoundingMode roundingMode6 = null;
        org.joda.money.BigMoney bigMoney7 = bigMoney1.minusRetainScale(0.0d, roundingMode6);
        org.joda.money.Money money8 = org.joda.money.Money.of((org.joda.money.BigMoneyProvider) bigMoney7);
        org.joda.money.CurrencyUnit currencyUnit9 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean10 = currencyUnit9.isPseudoCurrency();
        java.lang.String str11 = currencyUnit9.getCode();
        org.joda.money.Money money12 = org.joda.money.Money.zero(currencyUnit9);
        org.joda.money.CurrencyUnit currencyUnit13 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money14 = org.joda.money.Money.zero(currencyUnit13);
        org.joda.money.Money money16 = money14.minusMajor((long) ' ');
        java.math.BigDecimal bigDecimal17 = money14.getAmountMinor();
        org.joda.money.Money money18 = org.joda.money.Money.of(currencyUnit9, bigDecimal17);
        org.joda.money.Money money20 = money18.plusMinor((long) (byte) 1);
        org.joda.money.CurrencyUnit currencyUnit22 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money23 = org.joda.money.Money.zero(currencyUnit22);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit22);
        org.joda.money.BigMoney bigMoney26 = org.joda.money.BigMoney.of(currencyUnit22, (double) '#');
        boolean boolean27 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney26);
        org.joda.money.CurrencyUnit currencyUnit28 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money29 = org.joda.money.Money.zero(currencyUnit28);
        org.joda.money.Money money31 = money29.minusMajor((long) ' ');
        boolean boolean32 = bigMoney26.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money31);
        org.joda.money.CurrencyUnit currencyUnit34 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money35 = org.joda.money.Money.zero(currencyUnit34);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit34);
        org.joda.money.BigMoney bigMoney38 = org.joda.money.BigMoney.of(currencyUnit34, (double) '#');
        org.joda.money.Money money39 = money31.withCurrencyUnit(currencyUnit34);
        org.joda.money.CurrencyUnit currencyUnit41 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money42 = org.joda.money.Money.zero(currencyUnit41);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit41);
        org.joda.money.BigMoney bigMoney45 = org.joda.money.BigMoney.of(currencyUnit41, (double) '#');
        boolean boolean46 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney45);
        org.joda.money.CurrencyUnit currencyUnit47 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money48 = org.joda.money.Money.zero(currencyUnit47);
        org.joda.money.Money money50 = money48.minusMajor((long) ' ');
        boolean boolean51 = bigMoney45.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money50);
        org.joda.money.Money money52 = money50.negated();
        org.joda.money.Money money54 = money52.minusMajor(1L);
        org.joda.money.Money money56 = money54.minusMajor(100L);
        int int57 = money31.compareTo((org.joda.money.BigMoneyProvider) money54);
        java.math.BigDecimal bigDecimal58 = money31.getAmountMinor();
        org.joda.money.Money money60 = money31.withAmount((double) 1L);
        org.joda.money.CurrencyUnit currencyUnit62 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money63 = org.joda.money.Money.zero(currencyUnit62);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit62);
        org.joda.money.BigMoney bigMoney66 = org.joda.money.BigMoney.of(currencyUnit62, (double) '#');
        boolean boolean67 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney66);
        org.joda.money.CurrencyUnit currencyUnit68 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money69 = org.joda.money.Money.zero(currencyUnit68);
        org.joda.money.Money money71 = money69.minusMajor((long) ' ');
        boolean boolean72 = bigMoney66.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money71);
        org.joda.money.Money money73 = money71.negated();
        long long74 = money71.getAmountMajorLong();
        org.joda.money.Money money75 = org.joda.money.MoneyUtils.min(money60, money71);
        int int76 = money20.compareTo((org.joda.money.BigMoneyProvider) money71);
        long long77 = money20.getAmountMajorLong();
        boolean boolean78 = money8.isGreaterThan((org.joda.money.BigMoneyProvider) money20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney1 and money8", (bigMoney1.compareTo(money8) == 0) == bigMoney1.equals(money8));
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.CurrencyUnit currencyUnit13 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money14 = org.joda.money.Money.zero(currencyUnit13);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit13);
        org.joda.money.BigMoney bigMoney17 = org.joda.money.BigMoney.of(currencyUnit13, (double) '#');
        org.joda.money.Money money18 = money10.withCurrencyUnit(currencyUnit13);
        org.joda.money.CurrencyUnit currencyUnit20 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money21 = org.joda.money.Money.zero(currencyUnit20);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit20);
        org.joda.money.BigMoney bigMoney24 = org.joda.money.BigMoney.of(currencyUnit20, (double) '#');
        boolean boolean25 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney24);
        org.joda.money.CurrencyUnit currencyUnit26 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money27 = org.joda.money.Money.zero(currencyUnit26);
        org.joda.money.Money money29 = money27.minusMajor((long) ' ');
        boolean boolean30 = bigMoney24.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money29);
        org.joda.money.Money money31 = money29.negated();
        org.joda.money.Money money33 = money31.minusMajor(1L);
        org.joda.money.Money money35 = money33.minusMajor(100L);
        int int36 = money10.compareTo((org.joda.money.BigMoneyProvider) money33);
        java.math.BigDecimal bigDecimal37 = money10.getAmountMinor();
        org.joda.money.Money money39 = money10.withAmount((double) 1L);
        org.joda.money.Money money40 = org.joda.money.Money.of((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.BigMoney bigMoney41 = money40.toBigMoney();
        boolean boolean42 = money40.isPositiveOrZero();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money10 and bigMoney41", (money10.compareTo(bigMoney41) == 0) == money10.equals(bigMoney41));
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        org.joda.money.CurrencyUnit currencyUnit0 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean1 = currencyUnit0.isPseudoCurrency();
        java.lang.String str2 = currencyUnit0.getCode();
        org.joda.money.Money money3 = org.joda.money.Money.zero(currencyUnit0);
        org.joda.money.Money money4 = org.joda.money.Money.zero(currencyUnit0);
        org.joda.money.Money money5 = money4.negated();
        org.joda.money.Money money6 = money4.abs();
        org.joda.money.BigMoney bigMoney7 = money6.toBigMoney();
        org.joda.money.Money money9 = money6.plusMinor((long) 1000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money3 and bigMoney7", (money3.compareTo(bigMoney7) == 0) == money3.equals(bigMoney7));
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit7);
        org.joda.money.BigMoney bigMoney11 = org.joda.money.BigMoney.of(currencyUnit7, (double) '#');
        boolean boolean12 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney11);
        org.joda.money.CurrencyUnit currencyUnit13 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money14 = org.joda.money.Money.zero(currencyUnit13);
        org.joda.money.Money money16 = money14.minusMajor((long) ' ');
        boolean boolean17 = bigMoney11.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money16);
        org.joda.money.Money money18 = money16.negated();
        org.joda.money.Money money20 = money18.minusMajor(1L);
        org.joda.money.Money money22 = money20.plusMinor((long) 35);
        org.joda.money.CurrencyUnit currencyUnit23 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money24 = org.joda.money.Money.zero(currencyUnit23);
        org.joda.money.Money money26 = money24.minusMajor((long) ' ');
        org.joda.money.Money money27 = org.joda.money.MoneyUtils.min(money22, money26);
        boolean boolean28 = bigMoney5.isLessThan((org.joda.money.BigMoneyProvider) money27);
        org.joda.money.CurrencyUnit currencyUnit30 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money31 = org.joda.money.Money.zero(currencyUnit30);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit30);
        org.joda.money.BigMoney bigMoney34 = org.joda.money.BigMoney.of(currencyUnit30, (double) '#');
        boolean boolean35 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney34);
        org.joda.money.CurrencyUnit currencyUnit36 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money37 = org.joda.money.Money.zero(currencyUnit36);
        org.joda.money.Money money39 = money37.minusMajor((long) ' ');
        boolean boolean40 = bigMoney34.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money39);
        org.joda.money.CurrencyUnit currencyUnit42 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money43 = org.joda.money.Money.zero(currencyUnit42);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit42);
        org.joda.money.BigMoney bigMoney46 = org.joda.money.BigMoney.of(currencyUnit42, (double) '#');
        org.joda.money.Money money47 = money39.withCurrencyUnit(currencyUnit42);
        org.joda.money.CurrencyUnit currencyUnit49 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money50 = org.joda.money.Money.zero(currencyUnit49);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit49);
        org.joda.money.BigMoney bigMoney53 = org.joda.money.BigMoney.of(currencyUnit49, (double) '#');
        java.math.BigDecimal bigDecimal54 = bigMoney53.getAmountMajor();
        org.joda.money.BigMoney bigMoney55 = bigMoney53.abs();
        org.joda.money.BigMoney bigMoney56 = org.joda.money.BigMoney.of((org.joda.money.BigMoneyProvider) bigMoney55);
        org.joda.money.BigMoney bigMoney58 = bigMoney56.minus((double) 'a');
        boolean boolean59 = money39.isSameCurrency((org.joda.money.BigMoneyProvider) bigMoney58);
        boolean boolean60 = bigMoney5.isGreaterThanOrEqual((org.joda.money.BigMoneyProvider) bigMoney58);
        long long61 = bigMoney5.getAmountMajorLong();
        org.joda.money.BigMoney bigMoney63 = org.joda.money.BigMoney.parse("EUR -32.00");
        org.joda.money.BigMoney bigMoney64 = org.joda.money.BigMoney.of((org.joda.money.BigMoneyProvider) bigMoney63);
        org.joda.money.BigMoney bigMoney65 = bigMoney5.minus((org.joda.money.BigMoneyProvider) bigMoney64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money16 and bigMoney64", (money16.compareTo(bigMoney64) == 0) == money16.equals(bigMoney64));
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        org.joda.money.CurrencyUnit currencyUnit0 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean1 = currencyUnit0.isPseudoCurrency();
        boolean boolean2 = currencyUnit0.isPseudoCurrency();
        org.joda.money.CurrencyUnit currencyUnit4 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money5 = org.joda.money.Money.zero(currencyUnit4);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit4);
        org.joda.money.BigMoney bigMoney8 = org.joda.money.BigMoney.of(currencyUnit4, (double) '#');
        java.math.BigDecimal bigDecimal9 = bigMoney8.getAmountMajor();
        org.joda.money.BigMoney bigMoney10 = org.joda.money.BigMoney.of(currencyUnit0, bigDecimal9);
        org.joda.money.CurrencyUnit currencyUnit13 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money14 = org.joda.money.Money.zero(currencyUnit13);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit13);
        org.joda.money.BigMoney bigMoney17 = org.joda.money.BigMoney.of(currencyUnit13, (double) '#');
        java.math.BigDecimal bigDecimal18 = bigMoney17.getAmountMajor();
        org.joda.money.BigMoney bigMoney19 = bigMoney17.abs();
        org.joda.money.BigMoney bigMoney20 = bigMoney19.negated();
        org.joda.money.BigMoney bigMoney22 = bigMoney19.minusMinor((long) '#');
        org.joda.money.CurrencyUnit currencyUnit23 = bigMoney22.getCurrencyUnit();
        org.joda.money.CurrencyUnit.registerCountry("org.joda.money.format.MoneyFormatException: EUR", currencyUnit23);
        org.joda.money.BigMoney bigMoney26 = org.joda.money.BigMoney.zero(currencyUnit23, 965);
        int int27 = currencyUnit0.compareTo(currencyUnit23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money5 and bigMoney26", (money5.compareTo(bigMoney26) == 0) == money5.equals(bigMoney26));
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        org.joda.money.BigMoney bigMoney1 = org.joda.money.BigMoney.parse("EUR -32.00");
        org.joda.money.BigMoney bigMoney3 = bigMoney1.plus((double) 10L);
        boolean boolean4 = org.joda.money.MoneyUtils.isPositive((org.joda.money.BigMoneyProvider) bigMoney3);
        org.joda.money.BigMoney bigMoney5 = bigMoney3.negated();
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit7);
        org.joda.money.BigMoney bigMoney11 = org.joda.money.BigMoney.of(currencyUnit7, (double) '#');
        java.math.BigDecimal bigDecimal12 = bigMoney11.getAmountMajor();
        org.joda.money.BigMoney bigMoney13 = bigMoney11.abs();
        org.joda.money.BigMoney bigMoney14 = bigMoney13.negated();
        org.joda.money.BigMoney bigMoney16 = bigMoney13.minusMinor((long) '#');
        org.joda.money.BigMoney bigMoney17 = bigMoney16.toBigMoney();
        boolean boolean18 = bigMoney3.isSameCurrency((org.joda.money.BigMoneyProvider) bigMoney16);
        java.math.BigDecimal bigDecimal19 = bigMoney16.getAmount();
        org.joda.money.CurrencyUnit currencyUnit21 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money22 = org.joda.money.Money.zero(currencyUnit21);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit21);
        org.joda.money.BigMoney bigMoney25 = org.joda.money.BigMoney.of(currencyUnit21, (double) '#');
        java.math.BigDecimal bigDecimal26 = bigMoney25.getAmountMajor();
        org.joda.money.CurrencyUnit currencyUnit28 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money29 = org.joda.money.Money.zero(currencyUnit28);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit28);
        org.joda.money.BigMoney bigMoney32 = org.joda.money.BigMoney.of(currencyUnit28, (double) '#');
        boolean boolean33 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney32);
        org.joda.money.CurrencyUnit currencyUnit34 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money35 = org.joda.money.Money.zero(currencyUnit34);
        org.joda.money.Money money37 = money35.minusMajor((long) ' ');
        boolean boolean38 = bigMoney32.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money37);
        org.joda.money.Money money39 = money37.negated();
        org.joda.money.Money money41 = money39.minusMajor(1L);
        org.joda.money.CurrencyUnit currencyUnit42 = money39.getCurrencyUnit();
        java.util.Currency currency43 = currencyUnit42.toCurrency();
        org.joda.money.BigMoney bigMoney44 = bigMoney25.withCurrencyUnit(currencyUnit42);
        org.joda.money.BigMoney bigMoney46 = bigMoney25.plusMinor(100L);
        org.joda.money.BigMoney bigMoney48 = bigMoney25.multipliedBy((double) 10);
        org.joda.money.CurrencyUnit currencyUnit50 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money51 = org.joda.money.Money.zero(currencyUnit50);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit50);
        org.joda.money.BigMoney bigMoney54 = org.joda.money.BigMoney.of(currencyUnit50, (double) '#');
        boolean boolean55 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney54);
        org.joda.money.CurrencyUnit currencyUnit56 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money57 = org.joda.money.Money.zero(currencyUnit56);
        org.joda.money.Money money59 = money57.minusMajor((long) ' ');
        boolean boolean60 = bigMoney54.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money59);
        org.joda.money.CurrencyUnit currencyUnit62 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money63 = org.joda.money.Money.zero(currencyUnit62);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit62);
        org.joda.money.BigMoney bigMoney66 = org.joda.money.BigMoney.of(currencyUnit62, (double) '#');
        org.joda.money.Money money67 = money59.withCurrencyUnit(currencyUnit62);
        org.joda.money.BigMoney bigMoney69 = org.joda.money.BigMoney.of(currencyUnit62, (double) ',');
        boolean boolean70 = bigMoney25.isGreaterThan((org.joda.money.BigMoneyProvider) bigMoney69);
        org.joda.money.BigMoney bigMoney72 = bigMoney69.plusMajor((long) (byte) -1);
        org.joda.money.BigMoney bigMoney74 = bigMoney72.minusMinor(32L);
        org.joda.money.BigMoney bigMoney75 = org.joda.money.BigMoney.of((org.joda.money.BigMoneyProvider) bigMoney74);
        org.joda.money.BigMoney bigMoney76 = org.joda.money.MoneyUtils.max(bigMoney16, bigMoney74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney1 and money37", (bigMoney1.compareTo(money37) == 0) == bigMoney1.equals(money37));
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        org.joda.money.BigMoney bigMoney1 = org.joda.money.BigMoney.parse("EUR -32.00");
        org.joda.money.BigMoney bigMoney3 = bigMoney1.plus((double) 10L);
        org.joda.money.BigMoney bigMoney5 = bigMoney3.minusMinor((-32L));
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit7);
        org.joda.money.BigMoney bigMoney11 = org.joda.money.BigMoney.of(currencyUnit7, (double) '#');
        org.joda.money.BigMoney bigMoney13 = org.joda.money.BigMoney.ofMinor(currencyUnit7, (long) (byte) -1);
        int int14 = bigMoney13.getAmountMinorInt();
        org.joda.money.CurrencyUnit currencyUnit16 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money17 = org.joda.money.Money.zero(currencyUnit16);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit16);
        org.joda.money.BigMoney bigMoney20 = org.joda.money.BigMoney.of(currencyUnit16, (double) '#');
        boolean boolean21 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney20);
        int int22 = bigMoney20.getMinorPart();
        boolean boolean23 = bigMoney20.isPositive();
        org.joda.money.BigMoney bigMoney24 = org.joda.money.MoneyUtils.subtract(bigMoney13, bigMoney20);
        boolean boolean25 = bigMoney13.isNegative();
        org.joda.money.BigMoney bigMoney26 = org.joda.money.MoneyUtils.add(bigMoney5, bigMoney13);
        org.joda.money.CurrencyUnit currencyUnit28 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money29 = org.joda.money.Money.zero(currencyUnit28);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit28);
        org.joda.money.Money money32 = org.joda.money.Money.ofMajor(currencyUnit28, (long) (byte) 10);
        org.joda.money.Money money33 = money32.abs();
        org.joda.money.Money money35 = money33.minusMajor(0L);
        org.joda.money.CurrencyUnit currencyUnit36 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money37 = org.joda.money.Money.zero(currencyUnit36);
        org.joda.money.BigMoney bigMoney39 = org.joda.money.BigMoney.ofMajor(currencyUnit36, (long) 'a');
        java.util.Set<java.lang.String> strSet40 = currencyUnit36.getCountryCodes();
        org.joda.money.Money money42 = org.joda.money.Money.ofMajor(currencyUnit36, (long) '0');
        org.joda.money.Money money44 = money42.plusMajor((long) (byte) 10);
        java.math.BigDecimal bigDecimal45 = money44.getAmountMinor();
        org.joda.money.Money money46 = org.joda.money.MoneyUtils.subtract(money35, money44);
        org.joda.money.Money money48 = money46.plusMajor((long) (-1200));
        boolean boolean49 = bigMoney26.isGreaterThan((org.joda.money.BigMoneyProvider) money48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney5 and money32", (bigMoney5.compareTo(money32) == 0) == bigMoney5.equals(money32));
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        org.joda.money.CurrencyUnit currencyUnit4 = org.joda.money.CurrencyUnit.registerCurrency("EUR", (int) '#', (int) (short) -1, true);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.zero(currencyUnit4);
        boolean boolean6 = org.joda.money.MoneyUtils.isNegative((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.BigMoney bigMoney8 = bigMoney5.withScale(35);
        org.joda.money.CurrencyUnit currencyUnit9 = bigMoney5.getCurrencyUnit();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney5 and bigMoney8", (bigMoney5.compareTo(bigMoney8) == 0) == bigMoney5.equals(bigMoney8));
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        java.math.BigDecimal bigDecimal6 = bigMoney5.getAmountMajor();
        org.joda.money.BigMoney bigMoney7 = bigMoney5.abs();
        org.joda.money.CurrencyUnit currencyUnit9 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money10 = org.joda.money.Money.zero(currencyUnit9);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit9);
        org.joda.money.BigMoney bigMoney13 = org.joda.money.BigMoney.of(currencyUnit9, (double) '#');
        boolean boolean14 = bigMoney13.isPositive();
        org.joda.money.BigMoney bigMoney15 = bigMoney13.toBigMoney();
        org.joda.money.BigMoney bigMoney16 = org.joda.money.MoneyUtils.max(bigMoney7, bigMoney13);
        org.joda.money.CurrencyUnit currencyUnit17 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean18 = currencyUnit17.isPseudoCurrency();
        org.joda.money.Money money20 = org.joda.money.Money.ofMajor(currencyUnit17, (-1L));
        int int21 = currencyUnit17.getDecimalPlaces();
        org.joda.money.BigMoney bigMoney22 = bigMoney7.withCurrencyUnit(currencyUnit17);
        org.joda.money.Money money24 = org.joda.money.Money.ofMajor(currencyUnit17, (-1L));
        org.joda.money.CurrencyUnit currencyUnit25 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean26 = currencyUnit25.isPseudoCurrency();
        boolean boolean27 = currencyUnit25.isPseudoCurrency();
        org.joda.money.BigMoney bigMoney28 = org.joda.money.BigMoney.zero(currencyUnit25);
        java.math.BigDecimal bigDecimal29 = bigMoney28.getAmountMajor();
        boolean boolean30 = bigMoney28.isZero();
        java.math.BigDecimal bigDecimal31 = bigMoney28.getAmountMajor();
        org.joda.money.BigMoney bigMoney33 = org.joda.money.BigMoney.ofScale(currencyUnit17, bigDecimal31, (-3300));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money2 and bigMoney28", (money2.compareTo(bigMoney28) == 0) == money2.equals(bigMoney28));
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        int int12 = bigMoney5.getAmountMajorInt();
        org.joda.money.CurrencyUnit currencyUnit14 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money15 = org.joda.money.Money.zero(currencyUnit14);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit14);
        org.joda.money.BigMoney bigMoney18 = org.joda.money.BigMoney.of(currencyUnit14, (double) '#');
        boolean boolean19 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney18);
        org.joda.money.CurrencyUnit currencyUnit20 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money21 = org.joda.money.Money.zero(currencyUnit20);
        org.joda.money.Money money23 = money21.minusMajor((long) ' ');
        boolean boolean24 = bigMoney18.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money23);
        org.joda.money.CurrencyUnit currencyUnit26 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money27 = org.joda.money.Money.zero(currencyUnit26);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit26);
        org.joda.money.BigMoney bigMoney30 = org.joda.money.BigMoney.of(currencyUnit26, (double) '#');
        org.joda.money.Money money31 = money23.withCurrencyUnit(currencyUnit26);
        org.joda.money.BigMoney bigMoney32 = bigMoney5.plus((org.joda.money.BigMoneyProvider) money23);
        long long33 = bigMoney32.getAmountMajorLong();
        org.joda.money.BigMoney bigMoney35 = bigMoney32.minus((double) (byte) 100);
        int int36 = bigMoney32.getAmountMajorInt();
        org.joda.money.CurrencyUnit currencyUnit38 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money39 = org.joda.money.Money.zero(currencyUnit38);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit38);
        org.joda.money.BigMoney bigMoney42 = org.joda.money.BigMoney.of(currencyUnit38, (double) '#');
        boolean boolean43 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney42);
        org.joda.money.CurrencyUnit currencyUnit44 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money45 = org.joda.money.Money.zero(currencyUnit44);
        org.joda.money.Money money47 = money45.minusMajor((long) ' ');
        boolean boolean48 = bigMoney42.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money47);
        int int49 = bigMoney42.getAmountMajorInt();
        org.joda.money.CurrencyUnit currencyUnit51 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money52 = org.joda.money.Money.zero(currencyUnit51);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit51);
        org.joda.money.BigMoney bigMoney55 = org.joda.money.BigMoney.of(currencyUnit51, (double) '#');
        boolean boolean56 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney55);
        org.joda.money.CurrencyUnit currencyUnit57 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money58 = org.joda.money.Money.zero(currencyUnit57);
        org.joda.money.Money money60 = money58.minusMajor((long) ' ');
        boolean boolean61 = bigMoney55.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money60);
        org.joda.money.CurrencyUnit currencyUnit63 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money64 = org.joda.money.Money.zero(currencyUnit63);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit63);
        org.joda.money.BigMoney bigMoney67 = org.joda.money.BigMoney.of(currencyUnit63, (double) '#');
        org.joda.money.Money money68 = money60.withCurrencyUnit(currencyUnit63);
        org.joda.money.BigMoney bigMoney69 = bigMoney42.plus((org.joda.money.BigMoneyProvider) money60);
        org.joda.money.BigMoney bigMoney71 = bigMoney69.minus((double) (byte) 0);
        boolean boolean72 = bigMoney71.isCurrencyScale();
        org.joda.money.BigMoney bigMoney74 = bigMoney71.withAmount((double) 35L);
        org.joda.money.BigMoney bigMoney75 = org.joda.money.MoneyUtils.subtract(bigMoney32, bigMoney74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney5 and bigMoney74", (bigMoney5.compareTo(bigMoney74) == 0) == bigMoney5.equals(bigMoney74));
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        org.joda.money.CurrencyUnit currencyUnit0 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean1 = currencyUnit0.isPseudoCurrency();
        java.lang.String str2 = currencyUnit0.getCode();
        org.joda.money.Money money3 = org.joda.money.Money.zero(currencyUnit0);
        org.joda.money.CurrencyUnit currencyUnit4 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money5 = org.joda.money.Money.zero(currencyUnit4);
        org.joda.money.Money money7 = money5.minusMajor((long) ' ');
        java.math.BigDecimal bigDecimal8 = money5.getAmountMinor();
        org.joda.money.Money money9 = org.joda.money.Money.of(currencyUnit0, bigDecimal8);
        org.joda.money.BigMoney bigMoney10 = org.joda.money.BigMoney.zero(currencyUnit0);
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder11 = new org.joda.money.format.MoneyFormatterBuilder();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder12 = moneyFormatterBuilder11.appendCurrencyNumeric3Code();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder13 = moneyFormatterBuilder11.appendCurrencyCode();
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle14 = org.joda.money.format.MoneyAmountStyle.ASCII_DECIMAL_POINT_GROUP3_SPACE;
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder15 = moneyFormatterBuilder13.appendAmount(moneyAmountStyle14);
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle16 = org.joda.money.format.MoneyAmountStyle.ASCII_DECIMAL_COMMA_NO_GROUPING;
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle18 = moneyAmountStyle16.withDecimalPointCharacter((java.lang.Character) '4');
        boolean boolean19 = moneyAmountStyle18.isAbsValue();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder20 = moneyFormatterBuilder13.appendAmount(moneyAmountStyle18);
        org.joda.money.format.MoneyFormatter moneyFormatter21 = moneyFormatterBuilder20.toFormatter();
        java.util.Locale locale22 = moneyFormatter21.getLocale();
        org.joda.money.CurrencyUnit currencyUnit23 = org.joda.money.CurrencyUnit.of(locale22);
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle24 = org.joda.money.format.MoneyAmountStyle.of(locale22);
        java.lang.String str25 = currencyUnit0.getSymbol(locale22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money3 and bigMoney10", (money3.compareTo(bigMoney10) == 0) == money3.equals(bigMoney10));
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.Money money5 = org.joda.money.Money.ofMajor(currencyUnit1, (long) (byte) 10);
        int int6 = currencyUnit1.getDecimalPlaces();
        org.joda.money.CurrencyUnit currencyUnit8 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money9 = org.joda.money.Money.zero(currencyUnit8);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit8);
        org.joda.money.BigMoney bigMoney12 = org.joda.money.BigMoney.of(currencyUnit8, (double) '#');
        boolean boolean13 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney12);
        org.joda.money.CurrencyUnit currencyUnit14 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money15 = org.joda.money.Money.zero(currencyUnit14);
        org.joda.money.Money money17 = money15.minusMajor((long) ' ');
        boolean boolean18 = bigMoney12.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money17);
        org.joda.money.Money money19 = money17.negated();
        boolean boolean20 = money19.isPositiveOrZero();
        boolean boolean21 = money19.isPositiveOrZero();
        org.joda.money.Money money23 = money19.plusMajor((long) (short) -1);
        org.joda.money.CurrencyUnit currencyUnit25 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money26 = org.joda.money.Money.zero(currencyUnit25);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit25);
        org.joda.money.BigMoney bigMoney29 = org.joda.money.BigMoney.of(currencyUnit25, (double) '#');
        java.math.BigDecimal bigDecimal30 = bigMoney29.getAmountMajor();
        org.joda.money.BigMoney bigMoney31 = bigMoney29.abs();
        org.joda.money.BigMoney bigMoney32 = bigMoney31.negated();
        org.joda.money.BigMoney bigMoney34 = bigMoney31.minusMinor((long) '#');
        org.joda.money.CurrencyUnit currencyUnit36 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money37 = org.joda.money.Money.zero(currencyUnit36);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit36);
        org.joda.money.BigMoney bigMoney40 = org.joda.money.BigMoney.of(currencyUnit36, (double) '#');
        org.joda.money.BigMoney bigMoney42 = org.joda.money.BigMoney.ofMinor(currencyUnit36, (long) (byte) -1);
        boolean boolean43 = bigMoney42.isNegativeOrZero();
        org.joda.money.BigMoney bigMoney44 = bigMoney34.plus((org.joda.money.BigMoneyProvider) bigMoney42);
        long long45 = bigMoney44.getAmountMajorLong();
        org.joda.money.CurrencyUnit currencyUnit47 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money48 = org.joda.money.Money.zero(currencyUnit47);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit47);
        org.joda.money.BigMoney bigMoney51 = org.joda.money.BigMoney.of(currencyUnit47, (double) '#');
        java.math.BigDecimal bigDecimal52 = bigMoney51.getAmountMajor();
        org.joda.money.BigMoney bigMoney53 = bigMoney51.abs();
        org.joda.money.BigMoney bigMoney54 = bigMoney53.negated();
        org.joda.money.BigMoney bigMoney56 = bigMoney53.minusMinor((long) '#');
        org.joda.money.CurrencyUnit currencyUnit57 = bigMoney56.getCurrencyUnit();
        int int58 = bigMoney56.getAmountMinorInt();
        java.math.BigDecimal bigDecimal59 = bigMoney56.getAmountMajor();
        org.joda.money.BigMoney bigMoney60 = bigMoney44.multipliedBy(bigDecimal59);
        org.joda.money.CurrencyUnit currencyUnit62 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money63 = org.joda.money.Money.zero(currencyUnit62);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit62);
        org.joda.money.BigMoney bigMoney66 = org.joda.money.BigMoney.of(currencyUnit62, (double) '#');
        java.math.BigDecimal bigDecimal67 = bigMoney66.getAmountMajor();
        org.joda.money.BigMoney bigMoney68 = bigMoney66.abs();
        org.joda.money.BigMoney bigMoney69 = bigMoney68.negated();
        org.joda.money.BigMoney bigMoney71 = bigMoney68.minusMinor((long) '#');
        org.joda.money.BigMoney bigMoney72 = bigMoney68.negated();
        org.joda.money.BigMoney bigMoney74 = bigMoney72.plus(0.0d);
        java.math.BigDecimal bigDecimal75 = bigMoney74.getAmountMajor();
        org.joda.money.BigMoney bigMoney76 = bigMoney60.plus(bigDecimal75);
        org.joda.money.Money money77 = money19.minus(bigDecimal75);
        org.joda.money.BigMoney bigMoney79 = org.joda.money.BigMoney.ofScale(currencyUnit1, bigDecimal75, 1000);
        org.joda.money.Money money81 = org.joda.money.Money.ofMinor(currencyUnit1, (long) (-3200));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney32 and bigMoney79", (bigMoney32.compareTo(bigMoney79) == 0) == bigMoney32.equals(bigMoney79));
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        org.joda.money.CurrencyUnit currencyUnit0 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money1 = org.joda.money.Money.zero(currencyUnit0);
        org.joda.money.Money money3 = money1.minusMajor((long) ' ');
        java.lang.String str4 = money3.toString();
        org.joda.money.Money money6 = money3.minusMajor((long) (short) 1);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        org.joda.money.Money money12 = money8.plus((double) (byte) 10);
        org.joda.money.Money money13 = org.joda.money.MoneyUtils.max(money6, money12);
        org.joda.money.Money money15 = money13.minusMinor((long) '.');
        org.joda.money.CurrencyUnit currencyUnit16 = money15.getCurrencyUnit();
        org.joda.money.CurrencyUnit currencyUnit17 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean18 = currencyUnit17.isPseudoCurrency();
        java.lang.String str19 = currencyUnit17.getCode();
        org.joda.money.Money money20 = org.joda.money.Money.zero(currencyUnit17);
        org.joda.money.Money money21 = org.joda.money.Money.zero(currencyUnit17);
        org.joda.money.CurrencyUnit currencyUnit23 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money24 = org.joda.money.Money.zero(currencyUnit23);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit23);
        org.joda.money.BigMoney bigMoney27 = org.joda.money.BigMoney.of(currencyUnit23, (double) '#');
        java.util.Currency currency28 = currencyUnit23.toCurrency();
        org.joda.money.Money money29 = org.joda.money.Money.zero(currencyUnit23);
        org.joda.money.Money money30 = money29.abs();
        org.joda.money.CurrencyUnit currencyUnit32 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money33 = org.joda.money.Money.zero(currencyUnit32);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit32);
        org.joda.money.BigMoney bigMoney36 = org.joda.money.BigMoney.of(currencyUnit32, (double) '#');
        boolean boolean37 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney36);
        org.joda.money.CurrencyUnit currencyUnit38 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money39 = org.joda.money.Money.zero(currencyUnit38);
        org.joda.money.Money money41 = money39.minusMajor((long) ' ');
        boolean boolean42 = bigMoney36.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money41);
        int int43 = bigMoney36.getAmountMajorInt();
        org.joda.money.BigMoney bigMoney44 = bigMoney36.negated();
        org.joda.money.CurrencyUnit currencyUnit45 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money46 = org.joda.money.Money.zero(currencyUnit45);
        org.joda.money.Money money48 = money46.minusMajor((long) ' ');
        int int49 = money46.getAmountMajorInt();
        boolean boolean50 = money46.isZero();
        org.joda.money.Money money52 = money46.plusMinor(0L);
        boolean boolean53 = bigMoney44.isSameCurrency((org.joda.money.BigMoneyProvider) money52);
        java.math.BigDecimal bigDecimal54 = money52.getAmountMajor();
        org.joda.money.Money money55 = money30.plus(bigDecimal54);
        org.joda.money.BigMoney bigMoney56 = org.joda.money.BigMoney.of(currencyUnit17, bigDecimal54);
        int int57 = currencyUnit16.compareTo(currencyUnit17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money1 and bigMoney56", (money1.compareTo(bigMoney56) == 0) == money1.equals(bigMoney56));
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        java.math.BigDecimal bigDecimal6 = bigMoney5.getAmountMajor();
        org.joda.money.BigMoney bigMoney7 = bigMoney5.abs();
        boolean boolean8 = org.joda.money.MoneyUtils.isNegative((org.joda.money.BigMoneyProvider) bigMoney7);
        org.joda.money.CurrencyUnit currencyUnit10 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money11 = org.joda.money.Money.zero(currencyUnit10);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit10);
        org.joda.money.BigMoney bigMoney14 = org.joda.money.BigMoney.of(currencyUnit10, (double) '#');
        java.math.BigDecimal bigDecimal15 = bigMoney14.getAmountMajor();
        org.joda.money.CurrencyUnit currencyUnit17 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money18 = org.joda.money.Money.zero(currencyUnit17);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit17);
        org.joda.money.BigMoney bigMoney21 = org.joda.money.BigMoney.of(currencyUnit17, (double) '#');
        boolean boolean22 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney21);
        org.joda.money.CurrencyUnit currencyUnit23 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money24 = org.joda.money.Money.zero(currencyUnit23);
        org.joda.money.Money money26 = money24.minusMajor((long) ' ');
        boolean boolean27 = bigMoney21.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money26);
        org.joda.money.Money money28 = money26.negated();
        org.joda.money.Money money30 = money28.minusMajor(1L);
        org.joda.money.CurrencyUnit currencyUnit31 = money28.getCurrencyUnit();
        java.util.Currency currency32 = currencyUnit31.toCurrency();
        org.joda.money.BigMoney bigMoney33 = bigMoney14.withCurrencyUnit(currencyUnit31);
        org.joda.money.CurrencyUnit currencyUnit35 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money36 = org.joda.money.Money.zero(currencyUnit35);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit35);
        org.joda.money.BigMoney bigMoney39 = org.joda.money.BigMoney.of(currencyUnit35, (double) '#');
        boolean boolean40 = bigMoney39.isPositive();
        org.joda.money.BigMoney bigMoney41 = bigMoney39.toBigMoney();
        boolean boolean42 = bigMoney14.isLessThan((org.joda.money.BigMoneyProvider) bigMoney39);
        org.joda.money.BigMoney bigMoney43 = org.joda.money.MoneyUtils.min(bigMoney7, bigMoney39);
        org.joda.money.CurrencyUnit currencyUnit45 = org.joda.money.CurrencyUnit.of("EUR");
        org.joda.money.BigMoney bigMoney47 = org.joda.money.BigMoney.ofMinor(currencyUnit45, (long) '0');
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder48 = new org.joda.money.format.MoneyFormatterBuilder();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder49 = moneyFormatterBuilder48.appendCurrencyNumeric3Code();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder50 = moneyFormatterBuilder48.appendCurrencyCode();
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle51 = org.joda.money.format.MoneyAmountStyle.ASCII_DECIMAL_POINT_GROUP3_SPACE;
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder52 = moneyFormatterBuilder50.appendAmount(moneyAmountStyle51);
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle53 = org.joda.money.format.MoneyAmountStyle.ASCII_DECIMAL_COMMA_NO_GROUPING;
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle55 = moneyAmountStyle53.withDecimalPointCharacter((java.lang.Character) '4');
        boolean boolean56 = moneyAmountStyle55.isAbsValue();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder57 = moneyFormatterBuilder50.appendAmount(moneyAmountStyle55);
        org.joda.money.format.MoneyFormatter moneyFormatter58 = moneyFormatterBuilder57.toFormatter();
        java.util.Locale locale59 = moneyFormatter58.getLocale();
        org.joda.money.CurrencyUnit currencyUnit60 = org.joda.money.CurrencyUnit.of(locale59);
        java.lang.String str61 = currencyUnit45.getSymbol(locale59);
        org.joda.money.BigMoney bigMoney62 = bigMoney7.withCurrencyUnit(currencyUnit45);
        org.joda.money.CurrencyUnit currencyUnit64 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money65 = org.joda.money.Money.zero(currencyUnit64);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit64);
        org.joda.money.BigMoney bigMoney68 = org.joda.money.BigMoney.of(currencyUnit64, (double) '#');
        java.math.BigDecimal bigDecimal69 = bigMoney68.getAmountMajor();
        org.joda.money.BigMoney bigMoney70 = bigMoney68.abs();
        org.joda.money.BigMoney bigMoney72 = bigMoney70.minusMinor((long) (-1));
        org.joda.money.CurrencyUnit currencyUnit73 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money74 = org.joda.money.Money.zero(currencyUnit73);
        org.joda.money.Money money76 = money74.minusMajor((long) ' ');
        java.math.BigDecimal bigDecimal77 = money74.getAmountMinor();
        java.math.RoundingMode roundingMode78 = null;
        org.joda.money.BigMoney bigMoney79 = bigMoney72.minusRetainScale((org.joda.money.BigMoneyProvider) money74, roundingMode78);
        org.joda.money.CurrencyUnit currencyUnit80 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money81 = org.joda.money.Money.zero(currencyUnit80);
        org.joda.money.BigMoney bigMoney83 = org.joda.money.BigMoney.ofMajor(currencyUnit80, (long) 'a');
        java.util.Set<java.lang.String> strSet84 = currencyUnit80.getCountryCodes();
        org.joda.money.Money money86 = org.joda.money.Money.ofMajor(currencyUnit80, (long) '0');
        org.joda.money.Money money88 = money86.plusMajor((long) (byte) 10);
        java.math.BigDecimal bigDecimal89 = money88.getAmountMinor();
        org.joda.money.BigMoney bigMoney90 = bigMoney72.plus(bigDecimal89);
        org.joda.money.BigMoney bigMoney91 = bigMoney62.minus(bigDecimal89);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney47 and money86", (bigMoney47.compareTo(money86) == 0) == bigMoney47.equals(money86));
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        org.joda.money.CurrencyUnit currencyUnit0 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money1 = org.joda.money.Money.zero(currencyUnit0);
        org.joda.money.CurrencyUnit currencyUnit2 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money3 = org.joda.money.Money.zero(currencyUnit2);
        org.joda.money.Money money5 = money3.minusMajor((long) ' ');
        boolean boolean6 = money1.isSameCurrency((org.joda.money.BigMoneyProvider) money5);
        java.lang.String str7 = money5.toString();
        org.joda.money.Money money9 = money5.multipliedBy((long) ' ');
        org.joda.money.CurrencyUnit currencyUnit11 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money12 = org.joda.money.Money.zero(currencyUnit11);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit11);
        org.joda.money.BigMoney bigMoney15 = org.joda.money.BigMoney.of(currencyUnit11, (double) '#');
        boolean boolean16 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney15);
        org.joda.money.CurrencyUnit currencyUnit17 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money18 = org.joda.money.Money.zero(currencyUnit17);
        org.joda.money.Money money20 = money18.minusMajor((long) ' ');
        boolean boolean21 = bigMoney15.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money20);
        org.joda.money.CurrencyUnit currencyUnit23 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money24 = org.joda.money.Money.zero(currencyUnit23);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit23);
        org.joda.money.BigMoney bigMoney27 = org.joda.money.BigMoney.of(currencyUnit23, (double) '#');
        org.joda.money.Money money28 = money20.withCurrencyUnit(currencyUnit23);
        org.joda.money.CurrencyUnit currencyUnit30 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money31 = org.joda.money.Money.zero(currencyUnit30);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit30);
        org.joda.money.BigMoney bigMoney34 = org.joda.money.BigMoney.of(currencyUnit30, (double) '#');
        boolean boolean35 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney34);
        org.joda.money.CurrencyUnit currencyUnit36 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money37 = org.joda.money.Money.zero(currencyUnit36);
        org.joda.money.Money money39 = money37.minusMajor((long) ' ');
        boolean boolean40 = bigMoney34.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money39);
        org.joda.money.Money money41 = money39.negated();
        org.joda.money.Money money43 = money41.minusMajor(1L);
        org.joda.money.Money money45 = money43.minusMajor(100L);
        int int46 = money20.compareTo((org.joda.money.BigMoneyProvider) money43);
        java.math.BigDecimal bigDecimal47 = money20.getAmountMinor();
        org.joda.money.Money money48 = money5.minus(money20);
        org.joda.money.BigMoney bigMoney49 = money20.toBigMoney();
        org.joda.money.CurrencyUnit currencyUnit51 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money52 = org.joda.money.Money.zero(currencyUnit51);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit51);
        org.joda.money.BigMoney bigMoney55 = org.joda.money.BigMoney.of(currencyUnit51, (double) '#');
        java.math.BigDecimal bigDecimal56 = bigMoney55.getAmountMajor();
        org.joda.money.CurrencyUnit currencyUnit58 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money59 = org.joda.money.Money.zero(currencyUnit58);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit58);
        org.joda.money.BigMoney bigMoney62 = org.joda.money.BigMoney.of(currencyUnit58, (double) '#');
        boolean boolean63 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney62);
        org.joda.money.CurrencyUnit currencyUnit64 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money65 = org.joda.money.Money.zero(currencyUnit64);
        org.joda.money.Money money67 = money65.minusMajor((long) ' ');
        boolean boolean68 = bigMoney62.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money67);
        org.joda.money.Money money69 = money67.negated();
        org.joda.money.Money money71 = money69.minusMajor(1L);
        org.joda.money.CurrencyUnit currencyUnit72 = money69.getCurrencyUnit();
        java.util.Currency currency73 = currencyUnit72.toCurrency();
        org.joda.money.BigMoney bigMoney74 = bigMoney55.withCurrencyUnit(currencyUnit72);
        org.joda.money.BigMoney bigMoney76 = bigMoney55.plusMinor(100L);
        java.math.BigDecimal bigDecimal77 = bigMoney55.getAmount();
        org.joda.money.BigMoney bigMoney79 = bigMoney55.plusMajor(0L);
        org.joda.money.CurrencyUnit currencyUnit80 = bigMoney79.getCurrencyUnit();
        int int81 = bigMoney79.getScale();
        org.joda.money.BigMoney bigMoney82 = org.joda.money.MoneyUtils.max(bigMoney49, bigMoney79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money5 and bigMoney49", (money5.compareTo(bigMoney49) == 0) == money5.equals(bigMoney49));
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        org.joda.money.CurrencyUnit currencyUnit0 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean1 = currencyUnit0.isPseudoCurrency();
        boolean boolean2 = currencyUnit0.isPseudoCurrency();
        org.joda.money.BigMoney bigMoney3 = org.joda.money.BigMoney.zero(currencyUnit0);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.ofMinor(currencyUnit0, (long) '+');
        org.joda.money.Money money6 = bigMoney5.toMoney();
        org.joda.money.Money money7 = money6.negated();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney5 and money6", (bigMoney5.compareTo(money6) == 0) == bigMoney5.equals(money6));
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle0 = org.joda.money.format.MoneyAmountStyle.ASCII_DECIMAL_COMMA_NO_GROUPING;
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle2 = moneyAmountStyle0.withDecimalPointCharacter((java.lang.Character) '4');
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle4 = moneyAmountStyle2.withDecimalPointCharacter((java.lang.Character) ' ');
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle5 = org.joda.money.format.MoneyAmountStyle.ASCII_DECIMAL_COMMA_GROUP3_DOT;
        org.joda.money.format.GroupingStyle groupingStyle6 = org.joda.money.format.GroupingStyle.FULL;
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle7 = moneyAmountStyle5.withGroupingStyle(groupingStyle6);
        boolean boolean8 = moneyAmountStyle2.equals((java.lang.Object) moneyAmountStyle5);
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle10 = moneyAmountStyle5.withGroupingCharacter((java.lang.Character) 'a');
        org.joda.money.CurrencyUnit currencyUnit12 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money13 = org.joda.money.Money.zero(currencyUnit12);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit12);
        org.joda.money.BigMoney bigMoney16 = org.joda.money.BigMoney.of(currencyUnit12, (double) '#');
        boolean boolean17 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney16);
        org.joda.money.CurrencyUnit currencyUnit18 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money19 = org.joda.money.Money.zero(currencyUnit18);
        org.joda.money.Money money21 = money19.minusMajor((long) ' ');
        boolean boolean22 = bigMoney16.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money21);
        org.joda.money.Money money23 = money21.negated();
        org.joda.money.Money money25 = money23.minusMajor(1L);
        org.joda.money.CurrencyUnit currencyUnit26 = money23.getCurrencyUnit();
        boolean boolean27 = moneyAmountStyle10.equals((java.lang.Object) currencyUnit26);
        org.joda.money.BigMoney bigMoney28 = org.joda.money.BigMoney.zero(currencyUnit26);
        org.joda.money.Money money29 = bigMoney28.toMoney();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money13 and bigMoney28", (money13.compareTo(bigMoney28) == 0) == money13.equals(bigMoney28));
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        boolean boolean7 = bigMoney5.isCurrencyScale();
        org.joda.money.CurrencyUnit currencyUnit9 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money10 = org.joda.money.Money.zero(currencyUnit9);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit9);
        org.joda.money.BigMoney bigMoney13 = org.joda.money.BigMoney.of(currencyUnit9, (double) 10L);
        java.util.Currency currency14 = currencyUnit9.toCurrency();
        org.joda.money.BigMoney bigMoney15 = bigMoney5.withCurrencyUnit(currencyUnit9);
        org.joda.money.CurrencyUnit currencyUnit16 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money17 = org.joda.money.Money.zero(currencyUnit16);
        org.joda.money.Money money19 = money17.minusMajor((long) ' ');
        java.math.BigDecimal bigDecimal20 = money17.getAmountMinor();
        org.joda.money.BigMoney bigMoney21 = bigMoney15.withAmount(bigDecimal20);
        java.math.BigDecimal bigDecimal22 = bigMoney21.getAmountMinor();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money2 and bigMoney21", (money2.compareTo(bigMoney21) == 0) == money2.equals(bigMoney21));
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        org.joda.money.CurrencyUnit currencyUnit2 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money3 = org.joda.money.Money.zero(currencyUnit2);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit2);
        org.joda.money.BigMoney bigMoney6 = org.joda.money.BigMoney.of(currencyUnit2, (double) '#');
        java.math.BigDecimal bigDecimal7 = bigMoney6.getAmountMajor();
        org.joda.money.BigMoney bigMoney8 = bigMoney6.abs();
        org.joda.money.BigMoney bigMoney9 = bigMoney8.negated();
        org.joda.money.BigMoney bigMoney11 = bigMoney8.minusMinor((long) '#');
        org.joda.money.CurrencyUnit currencyUnit12 = bigMoney11.getCurrencyUnit();
        org.joda.money.CurrencyUnit.registerCountry("org.joda.money.format.MoneyFormatException: EUR", currencyUnit12);
        org.joda.money.BigMoney bigMoney15 = org.joda.money.BigMoney.zero(currencyUnit12, 965);
        org.joda.money.BigMoney bigMoney16 = org.joda.money.BigMoney.zero(currencyUnit12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money3 and bigMoney15", (money3.compareTo(bigMoney15) == 0) == money3.equals(bigMoney15));
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        org.joda.money.CurrencyUnit currencyUnit0 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean1 = currencyUnit0.isPseudoCurrency();
        boolean boolean2 = currencyUnit0.isPseudoCurrency();
        org.joda.money.BigMoney bigMoney3 = org.joda.money.BigMoney.zero(currencyUnit0);
        org.joda.money.BigMoney bigMoney5 = bigMoney3.multipliedBy((-1L));
        long long6 = bigMoney3.getAmountMajorLong();
        java.math.BigDecimal bigDecimal7 = bigMoney3.getAmount();
        org.joda.money.BigMoney bigMoney8 = bigMoney3.negated();
        org.joda.money.CurrencyUnit currencyUnit10 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money11 = org.joda.money.Money.zero(currencyUnit10);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit10);
        org.joda.money.BigMoney bigMoney14 = org.joda.money.BigMoney.of(currencyUnit10, (double) '#');
        boolean boolean15 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney14);
        org.joda.money.CurrencyUnit currencyUnit16 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money17 = org.joda.money.Money.zero(currencyUnit16);
        org.joda.money.Money money19 = money17.minusMajor((long) ' ');
        boolean boolean20 = bigMoney14.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money19);
        org.joda.money.Money money21 = money19.negated();
        org.joda.money.CurrencyUnit currencyUnit23 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money24 = org.joda.money.Money.zero(currencyUnit23);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit23);
        org.joda.money.BigMoney bigMoney27 = org.joda.money.BigMoney.of(currencyUnit23, (double) '#');
        boolean boolean28 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney27);
        org.joda.money.CurrencyUnit currencyUnit29 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money30 = org.joda.money.Money.zero(currencyUnit29);
        org.joda.money.Money money32 = money30.minusMajor((long) ' ');
        boolean boolean33 = bigMoney27.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money32);
        org.joda.money.Money money34 = money32.negated();
        org.joda.money.CurrencyUnit currencyUnit36 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money37 = org.joda.money.Money.zero(currencyUnit36);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit36);
        org.joda.money.BigMoney bigMoney40 = org.joda.money.BigMoney.of(currencyUnit36, (double) '#');
        boolean boolean41 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney40);
        org.joda.money.CurrencyUnit currencyUnit42 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money43 = org.joda.money.Money.zero(currencyUnit42);
        org.joda.money.Money money45 = money43.minusMajor((long) ' ');
        boolean boolean46 = bigMoney40.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money45);
        org.joda.money.Money money47 = money45.negated();
        org.joda.money.Money money48 = money32.minus(money47);
        org.joda.money.Money money49 = money19.minus(money48);
        org.joda.money.Money money51 = money48.multipliedBy((long) '.');
        org.joda.money.Money money52 = money48.abs();
        org.joda.money.BigMoney bigMoney53 = bigMoney8.plus((org.joda.money.BigMoneyProvider) money52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney8 and money11", (bigMoney8.compareTo(money11) == 0) == bigMoney8.equals(money11));
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.of("EUR");
        org.joda.money.BigMoney bigMoney3 = org.joda.money.BigMoney.ofMinor(currencyUnit1, (long) '0');
        org.joda.money.Money money4 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.BigMoney bigMoney7 = org.joda.money.BigMoney.ofScale(currencyUnit1, (long) 0, 1000);
        java.lang.String str8 = currencyUnit1.getSymbol();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money4 and bigMoney7", (money4.compareTo(bigMoney7) == 0) == money4.equals(bigMoney7));
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.ofCountry("hi!");
        org.joda.money.CurrencyUnit currencyUnit3 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money4 = org.joda.money.Money.zero(currencyUnit3);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit3);
        org.joda.money.BigMoney bigMoney7 = org.joda.money.BigMoney.of(currencyUnit3, (double) '#');
        boolean boolean8 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney7);
        org.joda.money.CurrencyUnit currencyUnit9 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money10 = org.joda.money.Money.zero(currencyUnit9);
        org.joda.money.Money money12 = money10.minusMajor((long) ' ');
        boolean boolean13 = bigMoney7.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money12);
        org.joda.money.CurrencyUnit currencyUnit15 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money16 = org.joda.money.Money.zero(currencyUnit15);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit15);
        org.joda.money.BigMoney bigMoney19 = org.joda.money.BigMoney.of(currencyUnit15, (double) '#');
        org.joda.money.Money money20 = money12.withCurrencyUnit(currencyUnit15);
        org.joda.money.CurrencyUnit currencyUnit22 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money23 = org.joda.money.Money.zero(currencyUnit22);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit22);
        org.joda.money.BigMoney bigMoney26 = org.joda.money.BigMoney.of(currencyUnit22, (double) '#');
        boolean boolean27 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney26);
        org.joda.money.CurrencyUnit currencyUnit28 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money29 = org.joda.money.Money.zero(currencyUnit28);
        org.joda.money.Money money31 = money29.minusMajor((long) ' ');
        boolean boolean32 = bigMoney26.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money31);
        org.joda.money.Money money33 = money31.negated();
        org.joda.money.Money money35 = money33.minusMajor(1L);
        org.joda.money.Money money37 = money35.minusMajor(100L);
        int int38 = money12.compareTo((org.joda.money.BigMoneyProvider) money35);
        java.math.BigDecimal bigDecimal39 = money12.getAmountMinor();
        org.joda.money.Money money41 = money12.withAmount((double) 1L);
        org.joda.money.Money money42 = org.joda.money.Money.of((org.joda.money.BigMoneyProvider) money12);
        org.joda.money.Money money44 = money42.plusMinor((long) (short) 100);
        org.joda.money.CurrencyUnit currencyUnit46 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money47 = org.joda.money.Money.zero(currencyUnit46);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit46);
        org.joda.money.BigMoney bigMoney50 = org.joda.money.BigMoney.of(currencyUnit46, (double) '#');
        boolean boolean51 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney50);
        org.joda.money.CurrencyUnit currencyUnit52 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money53 = org.joda.money.Money.zero(currencyUnit52);
        org.joda.money.Money money55 = money53.minusMajor((long) ' ');
        boolean boolean56 = bigMoney50.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money55);
        org.joda.money.Money money57 = money55.negated();
        org.joda.money.Money money59 = money57.minusMajor(1L);
        org.joda.money.Money money61 = money59.minusMajor(100L);
        org.joda.money.Money money63 = money61.minusMinor((long) 3);
        org.joda.money.Money money65 = money61.plusMinor((long) '0');
        org.joda.money.Money money66 = money42.minus(money65);
        org.joda.money.CurrencyUnit currencyUnit67 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean68 = currencyUnit67.isPseudoCurrency();
        java.lang.String str69 = currencyUnit67.getCode();
        org.joda.money.Money money70 = org.joda.money.Money.zero(currencyUnit67);
        org.joda.money.CurrencyUnit currencyUnit71 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money72 = org.joda.money.Money.zero(currencyUnit71);
        org.joda.money.Money money74 = money72.minusMajor((long) ' ');
        java.math.BigDecimal bigDecimal75 = money72.getAmountMinor();
        org.joda.money.Money money76 = org.joda.money.Money.of(currencyUnit67, bigDecimal75);
        org.joda.money.Money money78 = org.joda.money.Money.ofMajor(currencyUnit67, 31L);
        org.joda.money.CurrencyUnit currencyUnit79 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money80 = org.joda.money.Money.zero(currencyUnit79);
        org.joda.money.Money money82 = money80.minusMajor((long) ' ');
        java.math.BigDecimal bigDecimal83 = money80.getAmountMinor();
        org.joda.money.Money money84 = money78.withAmount(bigDecimal83);
        java.math.RoundingMode roundingMode85 = null;
        org.joda.money.Money money86 = money42.plus(bigDecimal83, roundingMode85);
        org.joda.money.BigMoney bigMoney88 = org.joda.money.BigMoney.ofScale(currencyUnit1, bigDecimal83, (int) ',');
        java.lang.String str89 = currencyUnit1.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money4 and bigMoney88", (money4.compareTo(bigMoney88) == 0) == money4.equals(bigMoney88));
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.CurrencyUnit currencyUnit13 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money14 = org.joda.money.Money.zero(currencyUnit13);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit13);
        org.joda.money.BigMoney bigMoney17 = org.joda.money.BigMoney.of(currencyUnit13, (double) '#');
        org.joda.money.Money money18 = money10.withCurrencyUnit(currencyUnit13);
        org.joda.money.CurrencyUnit currencyUnit20 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money21 = org.joda.money.Money.zero(currencyUnit20);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit20);
        org.joda.money.BigMoney bigMoney24 = org.joda.money.BigMoney.of(currencyUnit20, (double) '#');
        java.math.BigDecimal bigDecimal25 = bigMoney24.getAmountMajor();
        org.joda.money.BigMoney bigMoney26 = bigMoney24.abs();
        org.joda.money.BigMoney bigMoney27 = org.joda.money.BigMoney.of((org.joda.money.BigMoneyProvider) bigMoney26);
        org.joda.money.BigMoney bigMoney29 = bigMoney27.minus((double) 'a');
        boolean boolean30 = money10.isSameCurrency((org.joda.money.BigMoneyProvider) bigMoney29);
        org.joda.money.BigMoney bigMoney32 = bigMoney29.plusMajor((long) 3);
        org.joda.money.BigMoney bigMoney33 = bigMoney32.withCurrencyScale();
        org.joda.money.Money money34 = org.joda.money.Money.of((org.joda.money.BigMoneyProvider) bigMoney32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney32 and bigMoney33", (bigMoney32.compareTo(bigMoney33) == 0) == bigMoney32.equals(bigMoney33));
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.of("EUR");
        org.joda.money.BigMoney bigMoney3 = org.joda.money.BigMoney.ofMinor(currencyUnit1, (long) '0');
        org.joda.money.Money money4 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.BigMoney bigMoney7 = org.joda.money.BigMoney.ofScale(currencyUnit1, (long) 0, 1000);
        org.joda.money.CurrencyUnit currencyUnit9 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money10 = org.joda.money.Money.zero(currencyUnit9);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit9);
        org.joda.money.BigMoney bigMoney13 = org.joda.money.BigMoney.of(currencyUnit9, (double) '#');
        java.math.BigDecimal bigDecimal14 = bigMoney13.getAmountMajor();
        org.joda.money.BigMoney bigMoney15 = bigMoney13.abs();
        org.joda.money.BigMoney bigMoney16 = org.joda.money.MoneyUtils.add(bigMoney7, bigMoney15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money4 and bigMoney7", (money4.compareTo(bigMoney7) == 0) == money4.equals(bigMoney7));
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        org.joda.money.BigMoney bigMoney7 = bigMoney5.withScale((int) (byte) 1);
        boolean boolean8 = bigMoney5.isCurrencyScale();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney5 and bigMoney7", (bigMoney5.compareTo(bigMoney7) == 0) == bigMoney5.equals(bigMoney7));
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        java.math.BigDecimal bigDecimal6 = bigMoney5.getAmountMajor();
        org.joda.money.BigMoney bigMoney7 = bigMoney5.abs();
        org.joda.money.BigMoney bigMoney9 = bigMoney7.minusMinor((long) (-1));
        org.joda.money.CurrencyUnit currencyUnit10 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money11 = org.joda.money.Money.zero(currencyUnit10);
        org.joda.money.Money money13 = money11.minusMajor((long) ' ');
        java.math.BigDecimal bigDecimal14 = money11.getAmountMinor();
        java.math.RoundingMode roundingMode15 = null;
        org.joda.money.BigMoney bigMoney16 = bigMoney9.minusRetainScale((org.joda.money.BigMoneyProvider) money11, roundingMode15);
        org.joda.money.CurrencyUnit currencyUnit18 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money19 = org.joda.money.Money.zero(currencyUnit18);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit18);
        org.joda.money.BigMoney bigMoney22 = org.joda.money.BigMoney.of(currencyUnit18, (double) '#');
        boolean boolean23 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney22);
        org.joda.money.CurrencyUnit currencyUnit24 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money25 = org.joda.money.Money.zero(currencyUnit24);
        org.joda.money.Money money27 = money25.minusMajor((long) ' ');
        boolean boolean28 = bigMoney22.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money27);
        org.joda.money.Money money29 = money27.negated();
        org.joda.money.CurrencyUnit currencyUnit31 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money32 = org.joda.money.Money.zero(currencyUnit31);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit31);
        org.joda.money.BigMoney bigMoney35 = org.joda.money.BigMoney.of(currencyUnit31, (double) '#');
        boolean boolean36 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney35);
        org.joda.money.CurrencyUnit currencyUnit37 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money38 = org.joda.money.Money.zero(currencyUnit37);
        org.joda.money.Money money40 = money38.minusMajor((long) ' ');
        boolean boolean41 = bigMoney35.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money40);
        org.joda.money.Money money42 = money40.negated();
        org.joda.money.Money money43 = money27.minus(money42);
        org.joda.money.CurrencyUnit currencyUnit44 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money45 = org.joda.money.Money.zero(currencyUnit44);
        org.joda.money.Money money47 = money45.minusMajor((long) ' ');
        org.joda.money.CurrencyUnit currencyUnit49 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money50 = org.joda.money.Money.zero(currencyUnit49);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit49);
        org.joda.money.BigMoney bigMoney53 = org.joda.money.BigMoney.of(currencyUnit49, (double) '#');
        boolean boolean54 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney53);
        org.joda.money.CurrencyUnit currencyUnit55 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money56 = org.joda.money.Money.zero(currencyUnit55);
        org.joda.money.Money money58 = money56.minusMajor((long) ' ');
        boolean boolean59 = bigMoney53.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money58);
        org.joda.money.Money money60 = money58.negated();
        org.joda.money.Money money62 = money60.minusMajor(1L);
        org.joda.money.Money money63 = money47.plus(money62);
        org.joda.money.Money money64 = org.joda.money.MoneyUtils.add(money43, money62);
        java.math.BigDecimal bigDecimal65 = money43.getAmountMinor();
        org.joda.money.BigMoney bigMoney66 = bigMoney9.minus(bigDecimal65);
        org.joda.money.BigMoney bigMoney67 = bigMoney66.toBigMoney();
        org.joda.money.BigMoney bigMoney68 = bigMoney66.toBigMoney();
        java.lang.String str69 = bigMoney68.toString();
        org.joda.money.CurrencyUnit currencyUnit71 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money72 = org.joda.money.Money.zero(currencyUnit71);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit71);
        org.joda.money.BigMoney bigMoney75 = org.joda.money.BigMoney.of(currencyUnit71, (double) '#');
        boolean boolean76 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney75);
        org.joda.money.CurrencyUnit currencyUnit77 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money78 = org.joda.money.Money.zero(currencyUnit77);
        org.joda.money.Money money80 = money78.minusMajor((long) ' ');
        boolean boolean81 = bigMoney75.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money80);
        org.joda.money.CurrencyUnit currencyUnit83 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money84 = org.joda.money.Money.zero(currencyUnit83);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit83);
        org.joda.money.BigMoney bigMoney87 = org.joda.money.BigMoney.of(currencyUnit83, (double) '#');
        org.joda.money.Money money88 = money80.withCurrencyUnit(currencyUnit83);
        org.joda.money.BigMoney bigMoney90 = org.joda.money.BigMoney.ofMajor(currencyUnit83, (-1L));
        org.joda.money.Money money91 = org.joda.money.Money.zero(currencyUnit83);
        org.joda.money.CurrencyUnit currencyUnit93 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money94 = org.joda.money.Money.zero(currencyUnit93);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit93);
        org.joda.money.BigMoney bigMoney97 = org.joda.money.BigMoney.of(currencyUnit93, (double) '#');
        boolean boolean98 = money91.equals((java.lang.Object) currencyUnit93);
        boolean boolean99 = bigMoney68.isSameCurrency((org.joda.money.BigMoneyProvider) money91);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money63 and bigMoney90", (money63.compareTo(bigMoney90) == 0) == money63.equals(bigMoney90));
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        org.joda.money.CurrencyUnit currencyUnit0 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money1 = org.joda.money.Money.zero(currencyUnit0);
        org.joda.money.BigMoney bigMoney3 = org.joda.money.BigMoney.ofMajor(currencyUnit0, (long) 'a');
        org.joda.money.CurrencyUnit currencyUnit4 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean5 = currencyUnit4.isPseudoCurrency();
        boolean boolean6 = currencyUnit4.isPseudoCurrency();
        org.joda.money.CurrencyUnit currencyUnit8 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money9 = org.joda.money.Money.zero(currencyUnit8);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit8);
        org.joda.money.BigMoney bigMoney12 = org.joda.money.BigMoney.of(currencyUnit8, (double) '#');
        boolean boolean13 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney12);
        org.joda.money.CurrencyUnit currencyUnit14 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money15 = org.joda.money.Money.zero(currencyUnit14);
        org.joda.money.Money money17 = money15.minusMajor((long) ' ');
        boolean boolean18 = bigMoney12.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money17);
        org.joda.money.CurrencyUnit currencyUnit19 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money20 = org.joda.money.Money.zero(currencyUnit19);
        org.joda.money.CurrencyUnit currencyUnit22 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money23 = org.joda.money.Money.zero(currencyUnit22);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit22);
        org.joda.money.BigMoney bigMoney26 = org.joda.money.BigMoney.of(currencyUnit22, (double) '#');
        boolean boolean27 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney26);
        org.joda.money.CurrencyUnit currencyUnit28 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money29 = org.joda.money.Money.zero(currencyUnit28);
        org.joda.money.Money money31 = money29.minusMajor((long) ' ');
        boolean boolean32 = bigMoney26.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money31);
        org.joda.money.CurrencyUnit currencyUnit34 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money35 = org.joda.money.Money.zero(currencyUnit34);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit34);
        org.joda.money.BigMoney bigMoney38 = org.joda.money.BigMoney.of(currencyUnit34, (double) '#');
        org.joda.money.Money money39 = money31.withCurrencyUnit(currencyUnit34);
        org.joda.money.CurrencyUnit currencyUnit40 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money41 = org.joda.money.Money.zero(currencyUnit40);
        org.joda.money.Money money43 = money41.minusMajor((long) ' ');
        int int44 = money41.getAmountMajorInt();
        org.joda.money.CurrencyUnit currencyUnit46 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money47 = org.joda.money.Money.zero(currencyUnit46);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit46);
        org.joda.money.BigMoney bigMoney50 = org.joda.money.BigMoney.of(currencyUnit46, (double) '#');
        boolean boolean51 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney50);
        org.joda.money.CurrencyUnit currencyUnit52 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money53 = org.joda.money.Money.zero(currencyUnit52);
        org.joda.money.Money money55 = money53.minusMajor((long) ' ');
        boolean boolean56 = bigMoney50.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money55);
        org.joda.money.Money money57 = money55.negated();
        org.joda.money.CurrencyUnit currencyUnit59 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money60 = org.joda.money.Money.zero(currencyUnit59);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit59);
        org.joda.money.BigMoney bigMoney63 = org.joda.money.BigMoney.of(currencyUnit59, (double) '#');
        boolean boolean64 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney63);
        org.joda.money.CurrencyUnit currencyUnit65 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money66 = org.joda.money.Money.zero(currencyUnit65);
        org.joda.money.Money money68 = money66.minusMajor((long) ' ');
        boolean boolean69 = bigMoney63.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money68);
        org.joda.money.Money money70 = money68.negated();
        org.joda.money.Money money71 = money55.minus(money70);
        org.joda.money.CurrencyUnit currencyUnit73 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money74 = org.joda.money.Money.zero(currencyUnit73);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit73);
        org.joda.money.BigMoney bigMoney77 = org.joda.money.BigMoney.of(currencyUnit73, (double) '#');
        boolean boolean78 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney77);
        org.joda.money.CurrencyUnit currencyUnit79 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money80 = org.joda.money.Money.zero(currencyUnit79);
        org.joda.money.Money money82 = money80.minusMajor((long) ' ');
        boolean boolean83 = bigMoney77.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money82);
        org.joda.money.Money money84 = money82.negated();
        org.joda.money.Money money86 = money84.minusMajor(1L);
        org.joda.money.Money[] moneyArray87 = new org.joda.money.Money[] { money17, money20, money31, money41, money71, money86 };
        org.joda.money.Money money88 = org.joda.money.Money.total(currencyUnit4, moneyArray87);
        org.joda.money.BigMoney bigMoney89 = org.joda.money.BigMoney.total(currencyUnit0, (org.joda.money.BigMoneyProvider[]) moneyArray87);
        org.joda.money.Money money91 = org.joda.money.Money.ofMinor(currencyUnit0, (long) '.');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money88 and bigMoney89", (money88.compareTo(bigMoney89) == 0) == money88.equals(bigMoney89));
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.Money money12 = money10.negated();
        org.joda.money.CurrencyUnit currencyUnit14 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money15 = org.joda.money.Money.zero(currencyUnit14);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit14);
        org.joda.money.BigMoney bigMoney18 = org.joda.money.BigMoney.of(currencyUnit14, (double) '#');
        boolean boolean19 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney18);
        org.joda.money.CurrencyUnit currencyUnit20 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money21 = org.joda.money.Money.zero(currencyUnit20);
        org.joda.money.Money money23 = money21.minusMajor((long) ' ');
        boolean boolean24 = bigMoney18.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money23);
        org.joda.money.Money money25 = money23.negated();
        org.joda.money.Money money26 = money10.minus(money25);
        org.joda.money.CurrencyUnit currencyUnit28 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money29 = org.joda.money.Money.zero(currencyUnit28);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit28);
        org.joda.money.BigMoney bigMoney32 = org.joda.money.BigMoney.of(currencyUnit28, (double) '#');
        boolean boolean33 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney32);
        org.joda.money.CurrencyUnit currencyUnit34 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money35 = org.joda.money.Money.zero(currencyUnit34);
        org.joda.money.Money money37 = money35.minusMajor((long) ' ');
        boolean boolean38 = bigMoney32.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money37);
        org.joda.money.CurrencyUnit currencyUnit40 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money41 = org.joda.money.Money.zero(currencyUnit40);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit40);
        org.joda.money.BigMoney bigMoney44 = org.joda.money.BigMoney.of(currencyUnit40, (double) '#');
        boolean boolean45 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney44);
        org.joda.money.CurrencyUnit currencyUnit46 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money47 = org.joda.money.Money.zero(currencyUnit46);
        org.joda.money.Money money49 = money47.minusMajor((long) ' ');
        boolean boolean50 = bigMoney44.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money49);
        org.joda.money.Money money51 = money49.negated();
        org.joda.money.Money money53 = money51.minusMajor(1L);
        org.joda.money.Money money55 = money53.minusMajor(100L);
        org.joda.money.CurrencyUnit currencyUnit57 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money58 = org.joda.money.Money.zero(currencyUnit57);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit57);
        org.joda.money.BigMoney bigMoney61 = org.joda.money.BigMoney.of(currencyUnit57, (double) '#');
        boolean boolean62 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney61);
        org.joda.money.CurrencyUnit currencyUnit63 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money64 = org.joda.money.Money.zero(currencyUnit63);
        org.joda.money.Money money66 = money64.minusMajor((long) ' ');
        boolean boolean67 = bigMoney61.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money66);
        org.joda.money.Money money68 = money66.negated();
        org.joda.money.CurrencyUnit currencyUnit70 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money71 = org.joda.money.Money.zero(currencyUnit70);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit70);
        org.joda.money.BigMoney bigMoney74 = org.joda.money.BigMoney.of(currencyUnit70, (double) '#');
        boolean boolean75 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney74);
        org.joda.money.CurrencyUnit currencyUnit76 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money77 = org.joda.money.Money.zero(currencyUnit76);
        org.joda.money.Money money79 = money77.minusMajor((long) ' ');
        boolean boolean80 = bigMoney74.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money79);
        org.joda.money.Money money81 = money79.negated();
        org.joda.money.Money money82 = money66.minus(money81);
        org.joda.money.Money[] moneyArray83 = new org.joda.money.Money[] { money37, money55, money66 };
        org.joda.money.Money money84 = org.joda.money.Money.total(moneyArray83);
        org.joda.money.Money money85 = org.joda.money.MoneyUtils.add(money25, money84);
        boolean boolean86 = money84.isNegativeOrZero();
        org.joda.money.Money money87 = money84.negated();
        org.joda.money.BigMoney bigMoney88 = money84.toBigMoney();
        org.joda.money.CurrencyUnit currencyUnit89 = money84.getCurrencyUnit();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money84 and bigMoney88", (money84.compareTo(bigMoney88) == 0) == money84.equals(bigMoney88));
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        java.math.BigDecimal bigDecimal6 = bigMoney5.getAmountMajor();
        org.joda.money.BigMoney bigMoney7 = bigMoney5.abs();
        org.joda.money.BigMoney bigMoney8 = org.joda.money.BigMoney.of((org.joda.money.BigMoneyProvider) bigMoney7);
        org.joda.money.BigMoney bigMoney10 = bigMoney8.minus((double) 'a');
        org.joda.money.CurrencyUnit currencyUnit12 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money13 = org.joda.money.Money.zero(currencyUnit12);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit12);
        org.joda.money.BigMoney bigMoney16 = org.joda.money.BigMoney.of(currencyUnit12, (double) '#');
        boolean boolean17 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney16);
        org.joda.money.CurrencyUnit currencyUnit18 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money19 = org.joda.money.Money.zero(currencyUnit18);
        org.joda.money.Money money21 = money19.minusMajor((long) ' ');
        boolean boolean22 = bigMoney16.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money21);
        org.joda.money.Money money23 = money21.negated();
        org.joda.money.CurrencyUnit currencyUnit25 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money26 = org.joda.money.Money.zero(currencyUnit25);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit25);
        org.joda.money.BigMoney bigMoney29 = org.joda.money.BigMoney.of(currencyUnit25, (double) '#');
        boolean boolean30 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney29);
        org.joda.money.CurrencyUnit currencyUnit31 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money32 = org.joda.money.Money.zero(currencyUnit31);
        org.joda.money.Money money34 = money32.minusMajor((long) ' ');
        boolean boolean35 = bigMoney29.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money34);
        org.joda.money.Money money36 = money34.negated();
        org.joda.money.Money money37 = money21.minus(money36);
        org.joda.money.CurrencyUnit currencyUnit39 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money40 = org.joda.money.Money.zero(currencyUnit39);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit39);
        org.joda.money.BigMoney bigMoney43 = org.joda.money.BigMoney.of(currencyUnit39, (double) '#');
        boolean boolean44 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney43);
        org.joda.money.CurrencyUnit currencyUnit45 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money46 = org.joda.money.Money.zero(currencyUnit45);
        org.joda.money.Money money48 = money46.minusMajor((long) ' ');
        boolean boolean49 = bigMoney43.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money48);
        int int50 = bigMoney43.getAmountMajorInt();
        boolean boolean51 = money36.isLessThanOrEqual((org.joda.money.BigMoneyProvider) bigMoney43);
        org.joda.money.BigMoney bigMoney53 = bigMoney43.withScale((int) (byte) 0);
        org.joda.money.BigMoney bigMoney55 = bigMoney53.plus((double) ' ');
        boolean boolean56 = bigMoney55.isZero();
        boolean boolean57 = bigMoney10.isSameCurrency((org.joda.money.BigMoneyProvider) bigMoney55);
        boolean boolean58 = bigMoney10.isZero();
        org.joda.money.CurrencyUnit currencyUnit59 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean60 = currencyUnit59.isPseudoCurrency();
        boolean boolean61 = currencyUnit59.isPseudoCurrency();
        org.joda.money.BigMoney bigMoney62 = org.joda.money.BigMoney.zero(currencyUnit59);
        org.joda.money.BigMoney bigMoney64 = bigMoney62.multipliedBy((-1L));
        org.joda.money.BigMoney bigMoney66 = bigMoney64.withAmount((double) (-33));
        org.joda.money.BigMoney bigMoney68 = bigMoney64.multipliedBy((double) (-3300));
        boolean boolean69 = bigMoney10.isGreaterThanOrEqual((org.joda.money.BigMoneyProvider) bigMoney68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money2 and bigMoney62", (money2.compareTo(bigMoney62) == 0) == money2.equals(bigMoney62));
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.Money money12 = money10.negated();
        org.joda.money.Money money14 = money12.minusMajor(1L);
        org.joda.money.CurrencyUnit currencyUnit15 = money12.getCurrencyUnit();
        java.lang.String str16 = currencyUnit15.toString();
        org.joda.money.CurrencyUnit currencyUnit17 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money18 = org.joda.money.Money.zero(currencyUnit17);
        org.joda.money.BigMoney bigMoney20 = org.joda.money.BigMoney.ofMajor(currencyUnit17, (long) 'a');
        java.util.Set<java.lang.String> strSet21 = currencyUnit17.getCountryCodes();
        int int22 = currencyUnit17.getDecimalPlaces();
        org.joda.money.CurrencyMismatchException currencyMismatchException23 = new org.joda.money.CurrencyMismatchException(currencyUnit15, currencyUnit17);
        org.joda.money.CurrencyUnit currencyUnit24 = currencyMismatchException23.getSecondCurrency();
        org.joda.money.CurrencyUnit currencyUnit25 = currencyMismatchException23.getSecondCurrency();
        org.joda.money.CurrencyUnit currencyUnit26 = currencyMismatchException23.getFirstCurrency();
        java.lang.String str27 = currencyUnit26.getCode();
        org.joda.money.CurrencyUnit currencyUnit29 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money30 = org.joda.money.Money.zero(currencyUnit29);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit29);
        org.joda.money.BigMoney bigMoney33 = org.joda.money.BigMoney.of(currencyUnit29, (double) '#');
        boolean boolean34 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney33);
        org.joda.money.CurrencyUnit currencyUnit35 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money36 = org.joda.money.Money.zero(currencyUnit35);
        org.joda.money.Money money38 = money36.minusMajor((long) ' ');
        boolean boolean39 = bigMoney33.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money38);
        org.joda.money.Money money41 = money38.multipliedBy((long) (byte) 10);
        org.joda.money.CurrencyUnit currencyUnit42 = money41.getCurrencyUnit();
        java.math.BigDecimal bigDecimal43 = money41.getAmountMajor();
        org.joda.money.BigMoney bigMoney44 = org.joda.money.BigMoney.of(currencyUnit26, bigDecimal43);
        org.joda.money.CurrencyUnit currencyUnit45 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean46 = currencyUnit45.isPseudoCurrency();
        boolean boolean47 = currencyUnit45.isPseudoCurrency();
        org.joda.money.CurrencyUnit currencyUnit49 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money50 = org.joda.money.Money.zero(currencyUnit49);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit49);
        org.joda.money.BigMoney bigMoney53 = org.joda.money.BigMoney.of(currencyUnit49, (double) '#');
        java.math.BigDecimal bigDecimal54 = bigMoney53.getAmountMajor();
        org.joda.money.BigMoney bigMoney55 = org.joda.money.BigMoney.of(currencyUnit45, bigDecimal54);
        org.joda.money.BigMoney bigMoney57 = org.joda.money.BigMoney.of(currencyUnit45, (double) 3465);
        org.joda.money.CurrencyUnit currencyUnit58 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean59 = currencyUnit58.isPseudoCurrency();
        boolean boolean60 = currencyUnit58.isPseudoCurrency();
        org.joda.money.CurrencyUnit currencyUnit62 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money63 = org.joda.money.Money.zero(currencyUnit62);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit62);
        org.joda.money.BigMoney bigMoney66 = org.joda.money.BigMoney.of(currencyUnit62, (double) '#');
        java.math.BigDecimal bigDecimal67 = bigMoney66.getAmountMajor();
        org.joda.money.BigMoney bigMoney68 = org.joda.money.BigMoney.of(currencyUnit58, bigDecimal67);
        org.joda.money.BigMoney bigMoney69 = bigMoney57.minus(bigDecimal67);
        org.joda.money.BigMoney bigMoney71 = org.joda.money.BigMoney.ofScale(currencyUnit26, bigDecimal67, (int) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money41 and bigMoney44", (money41.compareTo(bigMoney44) == 0) == money41.equals(bigMoney44));
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.Money money12 = money10.negated();
        org.joda.money.CurrencyUnit currencyUnit14 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money15 = org.joda.money.Money.zero(currencyUnit14);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit14);
        org.joda.money.BigMoney bigMoney18 = org.joda.money.BigMoney.of(currencyUnit14, (double) '#');
        boolean boolean19 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney18);
        org.joda.money.CurrencyUnit currencyUnit20 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money21 = org.joda.money.Money.zero(currencyUnit20);
        org.joda.money.Money money23 = money21.minusMajor((long) ' ');
        boolean boolean24 = bigMoney18.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money23);
        org.joda.money.Money money25 = money23.negated();
        org.joda.money.CurrencyUnit currencyUnit27 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money28 = org.joda.money.Money.zero(currencyUnit27);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit27);
        org.joda.money.BigMoney bigMoney31 = org.joda.money.BigMoney.of(currencyUnit27, (double) '#');
        boolean boolean32 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney31);
        org.joda.money.CurrencyUnit currencyUnit33 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money34 = org.joda.money.Money.zero(currencyUnit33);
        org.joda.money.Money money36 = money34.minusMajor((long) ' ');
        boolean boolean37 = bigMoney31.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money36);
        org.joda.money.Money money38 = money36.negated();
        org.joda.money.Money money39 = money23.minus(money38);
        org.joda.money.Money money40 = money10.minus(money39);
        org.joda.money.Money money42 = money39.multipliedBy((long) '.');
        org.joda.money.Money money44 = money42.minus((double) '4');
        org.joda.money.CurrencyUnit currencyUnit46 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money47 = org.joda.money.Money.zero(currencyUnit46);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit46);
        org.joda.money.BigMoney bigMoney50 = org.joda.money.BigMoney.of(currencyUnit46, (double) '#');
        boolean boolean51 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney50);
        org.joda.money.CurrencyUnit currencyUnit52 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money53 = org.joda.money.Money.zero(currencyUnit52);
        org.joda.money.Money money55 = money53.minusMajor((long) ' ');
        boolean boolean56 = bigMoney50.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money55);
        org.joda.money.Money money57 = money55.negated();
        org.joda.money.Money money59 = money57.minusMajor(1L);
        org.joda.money.CurrencyUnit currencyUnit60 = money57.getCurrencyUnit();
        java.lang.String str61 = currencyUnit60.toString();
        org.joda.money.CurrencyUnit currencyUnit62 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money63 = org.joda.money.Money.zero(currencyUnit62);
        org.joda.money.BigMoney bigMoney65 = org.joda.money.BigMoney.ofMajor(currencyUnit62, (long) 'a');
        java.util.Set<java.lang.String> strSet66 = currencyUnit62.getCountryCodes();
        int int67 = currencyUnit62.getDecimalPlaces();
        org.joda.money.CurrencyMismatchException currencyMismatchException68 = new org.joda.money.CurrencyMismatchException(currencyUnit60, currencyUnit62);
        org.joda.money.CurrencyUnit currencyUnit69 = currencyMismatchException68.getFirstCurrency();
        java.util.Set<java.lang.String> strSet70 = currencyUnit69.getCountryCodes();
        org.joda.money.BigMoney bigMoney72 = org.joda.money.BigMoney.of(currencyUnit69, 100.0d);
        org.joda.money.BigMoney bigMoney73 = bigMoney72.withCurrencyScale();
        boolean boolean74 = money42.isSameCurrency((org.joda.money.BigMoneyProvider) bigMoney73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney72 and bigMoney73", (bigMoney72.compareTo(bigMoney73) == 0) == bigMoney72.equals(bigMoney73));
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder0 = new org.joda.money.format.MoneyFormatterBuilder();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder1 = moneyFormatterBuilder0.appendCurrencyNumeric3Code();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder2 = new org.joda.money.format.MoneyFormatterBuilder();
        org.joda.money.format.MoneyFormatter moneyFormatter3 = moneyFormatterBuilder2.toFormatter();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder4 = new org.joda.money.format.MoneyFormatterBuilder();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder5 = moneyFormatterBuilder4.appendCurrencyNumeric3Code();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder6 = moneyFormatterBuilder4.appendCurrencyCode();
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle7 = org.joda.money.format.MoneyAmountStyle.ASCII_DECIMAL_POINT_GROUP3_SPACE;
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder8 = moneyFormatterBuilder6.appendAmount(moneyAmountStyle7);
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder9 = moneyFormatterBuilder6.appendCurrencySymbolLocalized();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder10 = new org.joda.money.format.MoneyFormatterBuilder();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder11 = moneyFormatterBuilder10.appendCurrencyNumeric3Code();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder12 = moneyFormatterBuilder10.appendCurrencyNumericCode();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder13 = moneyFormatterBuilder12.appendAmountLocalized();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder14 = moneyFormatterBuilder13.appendCurrencyNumericCode();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder15 = moneyFormatterBuilder13.appendCurrencyNumericCode();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder16 = moneyFormatterBuilder13.appendCurrencyNumericCode();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder17 = new org.joda.money.format.MoneyFormatterBuilder();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder18 = moneyFormatterBuilder17.appendCurrencyNumeric3Code();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder19 = moneyFormatterBuilder17.appendCurrencyCode();
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle20 = org.joda.money.format.MoneyAmountStyle.ASCII_DECIMAL_POINT_GROUP3_SPACE;
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder21 = moneyFormatterBuilder19.appendAmount(moneyAmountStyle20);
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle22 = org.joda.money.format.MoneyAmountStyle.ASCII_DECIMAL_COMMA_NO_GROUPING;
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle24 = moneyAmountStyle22.withDecimalPointCharacter((java.lang.Character) '4');
        boolean boolean25 = moneyAmountStyle24.isAbsValue();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder26 = moneyFormatterBuilder19.appendAmount(moneyAmountStyle24);
        org.joda.money.format.MoneyFormatter moneyFormatter27 = moneyFormatterBuilder26.toFormatter();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder28 = new org.joda.money.format.MoneyFormatterBuilder();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder29 = moneyFormatterBuilder28.appendCurrencyNumeric3Code();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder30 = moneyFormatterBuilder28.appendCurrencyCode();
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle31 = org.joda.money.format.MoneyAmountStyle.ASCII_DECIMAL_POINT_GROUP3_SPACE;
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder32 = moneyFormatterBuilder30.appendAmount(moneyAmountStyle31);
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle33 = org.joda.money.format.MoneyAmountStyle.ASCII_DECIMAL_COMMA_NO_GROUPING;
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle35 = moneyAmountStyle33.withDecimalPointCharacter((java.lang.Character) '4');
        boolean boolean36 = moneyAmountStyle35.isAbsValue();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder37 = moneyFormatterBuilder30.appendAmount(moneyAmountStyle35);
        org.joda.money.format.MoneyFormatter moneyFormatter38 = moneyFormatterBuilder37.toFormatter();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder39 = moneyFormatterBuilder16.appendSigned(moneyFormatter27, moneyFormatter38);
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder40 = new org.joda.money.format.MoneyFormatterBuilder();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder41 = moneyFormatterBuilder40.appendCurrencyNumeric3Code();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder42 = moneyFormatterBuilder40.appendCurrencyCode();
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle43 = org.joda.money.format.MoneyAmountStyle.ASCII_DECIMAL_POINT_GROUP3_SPACE;
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder44 = moneyFormatterBuilder42.appendAmount(moneyAmountStyle43);
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle45 = org.joda.money.format.MoneyAmountStyle.ASCII_DECIMAL_COMMA_NO_GROUPING;
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle47 = moneyAmountStyle45.withDecimalPointCharacter((java.lang.Character) '4');
        boolean boolean48 = moneyAmountStyle47.isAbsValue();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder49 = moneyFormatterBuilder42.appendAmount(moneyAmountStyle47);
        org.joda.money.format.MoneyFormatter moneyFormatter50 = moneyFormatterBuilder49.toFormatter();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder51 = new org.joda.money.format.MoneyFormatterBuilder();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder52 = moneyFormatterBuilder51.appendCurrencyNumeric3Code();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder53 = moneyFormatterBuilder51.appendCurrencyCode();
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle54 = org.joda.money.format.MoneyAmountStyle.ASCII_DECIMAL_POINT_GROUP3_SPACE;
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder55 = moneyFormatterBuilder53.appendAmount(moneyAmountStyle54);
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle56 = org.joda.money.format.MoneyAmountStyle.ASCII_DECIMAL_COMMA_NO_GROUPING;
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle58 = moneyAmountStyle56.withDecimalPointCharacter((java.lang.Character) '4');
        boolean boolean59 = moneyAmountStyle58.isAbsValue();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder60 = moneyFormatterBuilder53.appendAmount(moneyAmountStyle58);
        org.joda.money.format.MoneyFormatter moneyFormatter61 = moneyFormatterBuilder60.toFormatter();
        java.util.Locale locale62 = moneyFormatter61.getLocale();
        org.joda.money.BigMoney bigMoney64 = org.joda.money.BigMoney.parse("EUR -32.00");
        org.joda.money.BigMoney bigMoney66 = bigMoney64.plus((double) 10L);
        boolean boolean67 = org.joda.money.MoneyUtils.isPositive((org.joda.money.BigMoneyProvider) bigMoney66);
        org.joda.money.BigMoney bigMoney68 = bigMoney66.negated();
        org.joda.money.CurrencyUnit currencyUnit69 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean70 = currencyUnit69.isPseudoCurrency();
        boolean boolean71 = currencyUnit69.isPseudoCurrency();
        org.joda.money.BigMoney bigMoney72 = org.joda.money.BigMoney.zero(currencyUnit69);
        org.joda.money.BigMoney bigMoney74 = bigMoney72.multipliedBy((-1L));
        long long75 = bigMoney72.getAmountMajorLong();
        java.math.BigDecimal bigDecimal76 = bigMoney72.getAmount();
        org.joda.money.BigMoney bigMoney77 = bigMoney72.negated();
        boolean boolean78 = bigMoney66.isGreaterThan((org.joda.money.BigMoneyProvider) bigMoney77);
        java.lang.String str79 = moneyFormatter61.print((org.joda.money.BigMoneyProvider) bigMoney66);
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder80 = moneyFormatterBuilder6.appendSigned(moneyFormatter27, moneyFormatter50, moneyFormatter61);
        java.util.Locale locale81 = moneyFormatter61.getLocale();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder82 = moneyFormatterBuilder0.appendSigned(moneyFormatter3, moneyFormatter61);
        org.joda.money.CurrencyUnit currencyUnit83 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean84 = currencyUnit83.isPseudoCurrency();
        boolean boolean85 = currencyUnit83.isPseudoCurrency();
        org.joda.money.BigMoney bigMoney86 = org.joda.money.BigMoney.zero(currencyUnit83);
        org.joda.money.BigMoney bigMoney88 = bigMoney86.multipliedBy((-1L));
        org.joda.money.BigMoney bigMoney90 = bigMoney88.withAmount((double) (-33));
        org.joda.money.BigMoney bigMoney92 = bigMoney88.multipliedBy((double) (-3300));
        java.lang.String str93 = moneyFormatter3.print((org.joda.money.BigMoneyProvider) bigMoney88);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney72 and bigMoney92", (bigMoney72.compareTo(bigMoney92) == 0) == bigMoney72.equals(bigMoney92));
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.Money money12 = money10.negated();
        org.joda.money.CurrencyUnit currencyUnit14 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money15 = org.joda.money.Money.zero(currencyUnit14);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit14);
        org.joda.money.BigMoney bigMoney18 = org.joda.money.BigMoney.of(currencyUnit14, (double) '#');
        boolean boolean19 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney18);
        org.joda.money.CurrencyUnit currencyUnit20 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money21 = org.joda.money.Money.zero(currencyUnit20);
        org.joda.money.Money money23 = money21.minusMajor((long) ' ');
        boolean boolean24 = bigMoney18.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money23);
        org.joda.money.Money money25 = money23.negated();
        org.joda.money.Money money26 = money10.minus(money25);
        org.joda.money.CurrencyUnit currencyUnit28 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money29 = org.joda.money.Money.zero(currencyUnit28);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit28);
        org.joda.money.BigMoney bigMoney32 = org.joda.money.BigMoney.of(currencyUnit28, (double) '#');
        boolean boolean33 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney32);
        org.joda.money.CurrencyUnit currencyUnit34 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money35 = org.joda.money.Money.zero(currencyUnit34);
        org.joda.money.Money money37 = money35.minusMajor((long) ' ');
        boolean boolean38 = bigMoney32.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money37);
        int int39 = bigMoney32.getAmountMajorInt();
        boolean boolean40 = money25.isLessThanOrEqual((org.joda.money.BigMoneyProvider) bigMoney32);
        java.math.BigDecimal bigDecimal41 = money25.getAmountMajor();
        boolean boolean42 = org.joda.money.MoneyUtils.isPositiveOrZero((org.joda.money.BigMoneyProvider) money25);
        org.joda.money.Money money44 = money25.minusMajor((-32L));
        java.math.BigDecimal bigDecimal45 = money44.getAmountMajor();
        boolean boolean46 = money44.isZero();
        org.joda.money.CurrencyUnit currencyUnit48 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money49 = org.joda.money.Money.zero(currencyUnit48);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit48);
        org.joda.money.BigMoney bigMoney52 = org.joda.money.BigMoney.of(currencyUnit48, (double) '#');
        boolean boolean53 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney52);
        org.joda.money.CurrencyUnit currencyUnit54 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money55 = org.joda.money.Money.zero(currencyUnit54);
        org.joda.money.Money money57 = money55.minusMajor((long) ' ');
        boolean boolean58 = bigMoney52.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money57);
        org.joda.money.CurrencyUnit currencyUnit60 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money61 = org.joda.money.Money.zero(currencyUnit60);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit60);
        org.joda.money.BigMoney bigMoney64 = org.joda.money.BigMoney.of(currencyUnit60, (double) '#');
        org.joda.money.Money money65 = money57.withCurrencyUnit(currencyUnit60);
        org.joda.money.CurrencyUnit currencyUnit67 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money68 = org.joda.money.Money.zero(currencyUnit67);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit67);
        org.joda.money.BigMoney bigMoney71 = org.joda.money.BigMoney.of(currencyUnit67, (double) '#');
        boolean boolean72 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney71);
        org.joda.money.CurrencyUnit currencyUnit73 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money74 = org.joda.money.Money.zero(currencyUnit73);
        org.joda.money.Money money76 = money74.minusMajor((long) ' ');
        boolean boolean77 = bigMoney71.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money76);
        org.joda.money.Money money78 = money76.negated();
        org.joda.money.Money money80 = money78.minusMajor(1L);
        org.joda.money.Money money82 = money80.minusMajor(100L);
        int int83 = money57.compareTo((org.joda.money.BigMoneyProvider) money80);
        java.math.BigDecimal bigDecimal84 = money57.getAmountMinor();
        org.joda.money.Money money86 = money57.withAmount((double) 1L);
        org.joda.money.Money money87 = org.joda.money.Money.of((org.joda.money.BigMoneyProvider) money57);
        org.joda.money.BigMoney bigMoney88 = money87.toBigMoney();
        org.joda.money.Money money89 = money44.minus(money87);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money10 and bigMoney88", (money10.compareTo(bigMoney88) == 0) == money10.equals(bigMoney88));
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        int int12 = bigMoney5.getAmountMajorInt();
        org.joda.money.CurrencyUnit currencyUnit14 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money15 = org.joda.money.Money.zero(currencyUnit14);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit14);
        org.joda.money.BigMoney bigMoney18 = org.joda.money.BigMoney.of(currencyUnit14, (double) '#');
        boolean boolean19 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney18);
        org.joda.money.CurrencyUnit currencyUnit20 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money21 = org.joda.money.Money.zero(currencyUnit20);
        org.joda.money.Money money23 = money21.minusMajor((long) ' ');
        boolean boolean24 = bigMoney18.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money23);
        org.joda.money.CurrencyUnit currencyUnit26 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money27 = org.joda.money.Money.zero(currencyUnit26);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit26);
        org.joda.money.BigMoney bigMoney30 = org.joda.money.BigMoney.of(currencyUnit26, (double) '#');
        org.joda.money.Money money31 = money23.withCurrencyUnit(currencyUnit26);
        org.joda.money.BigMoney bigMoney32 = bigMoney5.plus((org.joda.money.BigMoneyProvider) money23);
        long long33 = bigMoney32.getAmountMajorLong();
        org.joda.money.BigMoney bigMoney35 = bigMoney32.minus((double) (byte) 100);
        java.math.BigDecimal bigDecimal36 = bigMoney32.getAmountMinor();
        org.joda.money.BigMoney bigMoney38 = bigMoney32.minusMinor((long) (byte) 10);
        org.joda.money.Money money39 = bigMoney32.toMoney();
        int int40 = bigMoney32.getAmountMinorInt();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney32 and money39", (bigMoney32.compareTo(money39) == 0) == bigMoney32.equals(money39));
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        java.math.BigDecimal bigDecimal6 = bigMoney5.getAmountMajor();
        org.joda.money.BigMoney bigMoney7 = bigMoney5.abs();
        org.joda.money.CurrencyUnit currencyUnit9 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money10 = org.joda.money.Money.zero(currencyUnit9);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit9);
        org.joda.money.BigMoney bigMoney13 = org.joda.money.BigMoney.of(currencyUnit9, (double) '#');
        boolean boolean14 = bigMoney13.isPositive();
        org.joda.money.BigMoney bigMoney15 = bigMoney13.toBigMoney();
        org.joda.money.BigMoney bigMoney16 = org.joda.money.MoneyUtils.max(bigMoney7, bigMoney13);
        org.joda.money.CurrencyUnit currencyUnit17 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean18 = currencyUnit17.isPseudoCurrency();
        org.joda.money.Money money20 = org.joda.money.Money.ofMajor(currencyUnit17, (-1L));
        int int21 = currencyUnit17.getDecimalPlaces();
        org.joda.money.BigMoney bigMoney22 = bigMoney7.withCurrencyUnit(currencyUnit17);
        org.joda.money.Money money24 = org.joda.money.Money.ofMinor(currencyUnit17, (long) 35);
        java.lang.String str25 = currencyUnit17.toString();
        org.joda.money.CurrencyUnit currencyUnit26 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money27 = org.joda.money.Money.zero(currencyUnit26);
        org.joda.money.Money money29 = money27.minusMajor((long) ' ');
        java.lang.String str30 = money29.toString();
        org.joda.money.Money money32 = money29.minusMajor((long) (short) 1);
        org.joda.money.Money money34 = money29.minusMinor((long) '#');
        org.joda.money.CurrencyUnit currencyUnit36 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money37 = org.joda.money.Money.zero(currencyUnit36);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit36);
        org.joda.money.BigMoney bigMoney40 = org.joda.money.BigMoney.of(currencyUnit36, (double) '#');
        java.math.BigDecimal bigDecimal41 = bigMoney40.getAmountMajor();
        org.joda.money.BigMoney bigMoney42 = bigMoney40.abs();
        org.joda.money.BigMoney bigMoney43 = bigMoney42.negated();
        org.joda.money.BigMoney bigMoney45 = bigMoney42.minusMinor((long) '#');
        org.joda.money.CurrencyUnit currencyUnit47 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money48 = org.joda.money.Money.zero(currencyUnit47);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit47);
        org.joda.money.BigMoney bigMoney51 = org.joda.money.BigMoney.of(currencyUnit47, (double) '#');
        org.joda.money.BigMoney bigMoney53 = org.joda.money.BigMoney.ofMinor(currencyUnit47, (long) (byte) -1);
        boolean boolean54 = bigMoney53.isNegativeOrZero();
        org.joda.money.BigMoney bigMoney55 = bigMoney45.plus((org.joda.money.BigMoneyProvider) bigMoney53);
        long long56 = bigMoney55.getAmountMajorLong();
        org.joda.money.CurrencyUnit currencyUnit58 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money59 = org.joda.money.Money.zero(currencyUnit58);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit58);
        org.joda.money.BigMoney bigMoney62 = org.joda.money.BigMoney.of(currencyUnit58, (double) '#');
        java.math.BigDecimal bigDecimal63 = bigMoney62.getAmountMajor();
        org.joda.money.BigMoney bigMoney64 = bigMoney62.abs();
        org.joda.money.BigMoney bigMoney65 = bigMoney64.negated();
        org.joda.money.BigMoney bigMoney67 = bigMoney64.minusMinor((long) '#');
        org.joda.money.CurrencyUnit currencyUnit68 = bigMoney67.getCurrencyUnit();
        int int69 = bigMoney67.getAmountMinorInt();
        java.math.BigDecimal bigDecimal70 = bigMoney67.getAmountMajor();
        org.joda.money.BigMoney bigMoney71 = bigMoney55.multipliedBy(bigDecimal70);
        org.joda.money.Money money72 = money34.plus(bigDecimal70);
        org.joda.money.Money money73 = org.joda.money.Money.of(currencyUnit17, bigDecimal70);
        java.util.Set<java.lang.String> strSet74 = currencyUnit17.getCountryCodes();
        org.joda.money.BigMoney bigMoney76 = org.joda.money.BigMoney.zero(currencyUnit17, 10);
        boolean boolean77 = org.joda.money.MoneyUtils.isNegative((org.joda.money.BigMoneyProvider) bigMoney76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money2 and bigMoney76", (money2.compareTo(bigMoney76) == 0) == money2.equals(bigMoney76));
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        int int7 = bigMoney5.getMinorPart();
        org.joda.money.BigMoney bigMoney9 = bigMoney5.plus((double) (-3500));
        org.joda.money.BigMoney bigMoney10 = bigMoney5.withCurrencyScale();
        org.joda.money.CurrencyUnit currencyUnit11 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean12 = currencyUnit11.isPseudoCurrency();
        boolean boolean13 = currencyUnit11.isPseudoCurrency();
        org.joda.money.CurrencyUnit currencyUnit15 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money16 = org.joda.money.Money.zero(currencyUnit15);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit15);
        org.joda.money.BigMoney bigMoney19 = org.joda.money.BigMoney.of(currencyUnit15, (double) '#');
        java.math.BigDecimal bigDecimal20 = bigMoney19.getAmountMajor();
        org.joda.money.BigMoney bigMoney21 = org.joda.money.BigMoney.of(currencyUnit11, bigDecimal20);
        org.joda.money.BigMoney bigMoney23 = org.joda.money.BigMoney.of(currencyUnit11, (double) 3465);
        org.joda.money.CurrencyUnit currencyUnit24 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean25 = currencyUnit24.isPseudoCurrency();
        boolean boolean26 = currencyUnit24.isPseudoCurrency();
        org.joda.money.CurrencyUnit currencyUnit28 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money29 = org.joda.money.Money.zero(currencyUnit28);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit28);
        org.joda.money.BigMoney bigMoney32 = org.joda.money.BigMoney.of(currencyUnit28, (double) '#');
        java.math.BigDecimal bigDecimal33 = bigMoney32.getAmountMajor();
        org.joda.money.BigMoney bigMoney34 = org.joda.money.BigMoney.of(currencyUnit24, bigDecimal33);
        org.joda.money.BigMoney bigMoney35 = bigMoney23.minus(bigDecimal33);
        org.joda.money.BigMoney bigMoney36 = bigMoney5.minus(bigDecimal33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney5 and bigMoney10", (bigMoney5.compareTo(bigMoney10) == 0) == bigMoney5.equals(bigMoney10));
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.Money money12 = money10.negated();
        org.joda.money.Money money14 = money12.minusMajor(1L);
        org.joda.money.Money money16 = money14.plusMinor((long) 35);
        org.joda.money.CurrencyUnit currencyUnit17 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money18 = org.joda.money.Money.zero(currencyUnit17);
        org.joda.money.Money money20 = money18.minusMajor((long) ' ');
        org.joda.money.Money money21 = org.joda.money.MoneyUtils.min(money16, money20);
        long long22 = money20.getAmountMinorLong();
        org.joda.money.Money money24 = org.joda.money.Money.parse("EUR -32.00");
        java.math.BigDecimal bigDecimal25 = money24.getAmountMinor();
        java.math.BigDecimal bigDecimal26 = money24.getAmountMajor();
        org.joda.money.Money money27 = money20.plus(bigDecimal26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money10 and money24", (money10.compareTo(money24) == 0) == money10.equals(money24));
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        org.joda.money.CurrencyUnit currencyUnit0 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean1 = currencyUnit0.isPseudoCurrency();
        boolean boolean2 = currencyUnit0.isPseudoCurrency();
        org.joda.money.BigMoney bigMoney3 = org.joda.money.BigMoney.zero(currencyUnit0);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.ofMinor(currencyUnit0, (long) '+');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.BigMoney bigMoney8 = bigMoney5.multipliedBy(0L);
        org.joda.money.CurrencyUnit currencyUnit10 = org.joda.money.CurrencyUnit.ofCountry("hi!");
        org.joda.money.BigMoney bigMoney12 = org.joda.money.BigMoney.of(currencyUnit10, (double) (-133L));
        org.joda.money.BigMoney bigMoney13 = org.joda.money.MoneyUtils.max(bigMoney8, bigMoney12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney3 and bigMoney13", (bigMoney3.compareTo(bigMoney13) == 0) == bigMoney3.equals(bigMoney13));
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.Money money12 = money10.negated();
        org.joda.money.CurrencyUnit currencyUnit14 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money15 = org.joda.money.Money.zero(currencyUnit14);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit14);
        org.joda.money.BigMoney bigMoney18 = org.joda.money.BigMoney.of(currencyUnit14, (double) '#');
        boolean boolean19 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney18);
        org.joda.money.CurrencyUnit currencyUnit20 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money21 = org.joda.money.Money.zero(currencyUnit20);
        org.joda.money.Money money23 = money21.minusMajor((long) ' ');
        boolean boolean24 = bigMoney18.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money23);
        org.joda.money.Money money25 = money23.negated();
        org.joda.money.CurrencyUnit currencyUnit27 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money28 = org.joda.money.Money.zero(currencyUnit27);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit27);
        org.joda.money.BigMoney bigMoney31 = org.joda.money.BigMoney.of(currencyUnit27, (double) '#');
        boolean boolean32 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney31);
        org.joda.money.CurrencyUnit currencyUnit33 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money34 = org.joda.money.Money.zero(currencyUnit33);
        org.joda.money.Money money36 = money34.minusMajor((long) ' ');
        boolean boolean37 = bigMoney31.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money36);
        org.joda.money.Money money38 = money36.negated();
        org.joda.money.Money money39 = money23.minus(money38);
        org.joda.money.Money money40 = money10.minus(money39);
        org.joda.money.CurrencyUnit currencyUnit42 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money43 = org.joda.money.Money.zero(currencyUnit42);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit42);
        org.joda.money.BigMoney bigMoney46 = org.joda.money.BigMoney.of(currencyUnit42, (double) '#');
        boolean boolean47 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney46);
        org.joda.money.CurrencyUnit currencyUnit48 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money49 = org.joda.money.Money.zero(currencyUnit48);
        org.joda.money.Money money51 = money49.minusMajor((long) ' ');
        boolean boolean52 = bigMoney46.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money51);
        org.joda.money.Money money53 = money51.negated();
        org.joda.money.CurrencyUnit currencyUnit55 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money56 = org.joda.money.Money.zero(currencyUnit55);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit55);
        org.joda.money.BigMoney bigMoney59 = org.joda.money.BigMoney.of(currencyUnit55, (double) '#');
        boolean boolean60 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney59);
        org.joda.money.CurrencyUnit currencyUnit61 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money62 = org.joda.money.Money.zero(currencyUnit61);
        org.joda.money.Money money64 = money62.minusMajor((long) ' ');
        boolean boolean65 = bigMoney59.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money64);
        org.joda.money.Money money66 = money64.negated();
        org.joda.money.CurrencyUnit currencyUnit68 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money69 = org.joda.money.Money.zero(currencyUnit68);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit68);
        org.joda.money.BigMoney bigMoney72 = org.joda.money.BigMoney.of(currencyUnit68, (double) '#');
        boolean boolean73 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney72);
        org.joda.money.CurrencyUnit currencyUnit74 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money75 = org.joda.money.Money.zero(currencyUnit74);
        org.joda.money.Money money77 = money75.minusMajor((long) ' ');
        boolean boolean78 = bigMoney72.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money77);
        org.joda.money.Money money79 = money77.negated();
        org.joda.money.Money money80 = money64.minus(money79);
        org.joda.money.Money money81 = money51.minus(money80);
        org.joda.money.Money money82 = money39.plus(money81);
        org.joda.money.BigMoney bigMoney83 = money39.toBigMoney();
        org.joda.money.Money money85 = money39.plusMajor((long) 3200);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money39 and bigMoney83", (money39.compareTo(bigMoney83) == 0) == money39.equals(bigMoney83));
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        org.joda.money.BigMoney bigMoney7 = org.joda.money.BigMoney.ofMinor(currencyUnit1, (long) (byte) -1);
        boolean boolean8 = bigMoney7.isNegativeOrZero();
        org.joda.money.CurrencyUnit currencyUnit10 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money11 = org.joda.money.Money.zero(currencyUnit10);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit10);
        org.joda.money.BigMoney bigMoney14 = org.joda.money.BigMoney.of(currencyUnit10, (double) '#');
        boolean boolean15 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney14);
        org.joda.money.CurrencyUnit currencyUnit16 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money17 = org.joda.money.Money.zero(currencyUnit16);
        org.joda.money.Money money19 = money17.minusMajor((long) ' ');
        boolean boolean20 = bigMoney14.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money19);
        org.joda.money.CurrencyUnit currencyUnit22 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money23 = org.joda.money.Money.zero(currencyUnit22);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit22);
        org.joda.money.BigMoney bigMoney26 = org.joda.money.BigMoney.of(currencyUnit22, (double) '#');
        org.joda.money.Money money27 = money19.withCurrencyUnit(currencyUnit22);
        org.joda.money.CurrencyUnit currencyUnit29 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money30 = org.joda.money.Money.zero(currencyUnit29);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit29);
        org.joda.money.BigMoney bigMoney33 = org.joda.money.BigMoney.of(currencyUnit29, (double) '#');
        boolean boolean34 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney33);
        org.joda.money.CurrencyUnit currencyUnit35 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money36 = org.joda.money.Money.zero(currencyUnit35);
        org.joda.money.Money money38 = money36.minusMajor((long) ' ');
        boolean boolean39 = bigMoney33.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money38);
        org.joda.money.Money money40 = money38.negated();
        org.joda.money.CurrencyUnit currencyUnit42 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money43 = org.joda.money.Money.zero(currencyUnit42);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit42);
        org.joda.money.BigMoney bigMoney46 = org.joda.money.BigMoney.of(currencyUnit42, (double) '#');
        boolean boolean47 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney46);
        org.joda.money.CurrencyUnit currencyUnit48 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money49 = org.joda.money.Money.zero(currencyUnit48);
        org.joda.money.Money money51 = money49.minusMajor((long) ' ');
        boolean boolean52 = bigMoney46.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money51);
        org.joda.money.Money money53 = money51.negated();
        org.joda.money.Money money54 = money38.minus(money53);
        org.joda.money.CurrencyUnit currencyUnit56 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money57 = org.joda.money.Money.zero(currencyUnit56);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit56);
        org.joda.money.BigMoney bigMoney60 = org.joda.money.BigMoney.of(currencyUnit56, (double) '#');
        boolean boolean61 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney60);
        org.joda.money.CurrencyUnit currencyUnit62 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money63 = org.joda.money.Money.zero(currencyUnit62);
        org.joda.money.Money money65 = money63.minusMajor((long) ' ');
        boolean boolean66 = bigMoney60.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money65);
        int int67 = bigMoney60.getAmountMajorInt();
        boolean boolean68 = money53.isLessThanOrEqual((org.joda.money.BigMoneyProvider) bigMoney60);
        java.math.BigDecimal bigDecimal69 = money53.getAmountMajor();
        org.joda.money.Money money70 = org.joda.money.Money.of(currencyUnit22, bigDecimal69);
        org.joda.money.BigMoney bigMoney71 = bigMoney7.multipliedBy(bigDecimal69);
        org.joda.money.CurrencyUnit currencyUnit72 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean73 = currencyUnit72.isPseudoCurrency();
        java.lang.String str74 = currencyUnit72.getCode();
        org.joda.money.Money money75 = org.joda.money.Money.zero(currencyUnit72);
        org.joda.money.CurrencyUnit currencyUnit76 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money77 = org.joda.money.Money.zero(currencyUnit76);
        org.joda.money.Money money79 = money77.minusMajor((long) ' ');
        java.math.BigDecimal bigDecimal80 = money77.getAmountMinor();
        org.joda.money.Money money81 = org.joda.money.Money.of(currencyUnit72, bigDecimal80);
        org.joda.money.BigMoney bigMoney82 = org.joda.money.BigMoney.zero(currencyUnit72);
        boolean boolean83 = bigMoney7.equals((java.lang.Object) bigMoney82);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money2 and bigMoney82", (money2.compareTo(bigMoney82) == 0) == money2.equals(bigMoney82));
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        org.joda.money.CurrencyUnit currencyUnit0 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean1 = currencyUnit0.isPseudoCurrency();
        boolean boolean2 = currencyUnit0.isPseudoCurrency();
        org.joda.money.BigMoney bigMoney3 = org.joda.money.BigMoney.zero(currencyUnit0);
        java.math.BigDecimal bigDecimal4 = bigMoney3.getAmountMajor();
        long long5 = bigMoney3.getAmountMajorLong();
        java.math.RoundingMode roundingMode7 = null;
        org.joda.money.BigMoney bigMoney8 = bigMoney3.plusRetainScale((double) (byte) 0, roundingMode7);
        int int9 = bigMoney8.getAmountMinorInt();
        org.joda.money.CurrencyUnit currencyUnit10 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean11 = currencyUnit10.isPseudoCurrency();
        java.lang.String str12 = currencyUnit10.getCode();
        org.joda.money.Money money13 = org.joda.money.Money.zero(currencyUnit10);
        org.joda.money.CurrencyUnit currencyUnit14 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money15 = org.joda.money.Money.zero(currencyUnit14);
        org.joda.money.Money money17 = money15.minusMajor((long) ' ');
        java.math.BigDecimal bigDecimal18 = money15.getAmountMinor();
        org.joda.money.Money money19 = org.joda.money.Money.of(currencyUnit10, bigDecimal18);
        org.joda.money.Money money21 = org.joda.money.Money.ofMajor(currencyUnit10, 31L);
        java.lang.String str22 = money21.toString();
        int int23 = money21.getScale();
        boolean boolean24 = bigMoney8.isGreaterThan((org.joda.money.BigMoneyProvider) money21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney8 and money13", (bigMoney8.compareTo(money13) == 0) == bigMoney8.equals(money13));
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.Money money12 = money10.negated();
        org.joda.money.Money money14 = money12.minusMajor(1L);
        org.joda.money.CurrencyUnit currencyUnit15 = money12.getCurrencyUnit();
        java.lang.String str16 = currencyUnit15.toString();
        org.joda.money.CurrencyUnit currencyUnit17 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money18 = org.joda.money.Money.zero(currencyUnit17);
        org.joda.money.BigMoney bigMoney20 = org.joda.money.BigMoney.ofMajor(currencyUnit17, (long) 'a');
        java.util.Set<java.lang.String> strSet21 = currencyUnit17.getCountryCodes();
        int int22 = currencyUnit17.getDecimalPlaces();
        org.joda.money.CurrencyMismatchException currencyMismatchException23 = new org.joda.money.CurrencyMismatchException(currencyUnit15, currencyUnit17);
        org.joda.money.BigMoney bigMoney25 = org.joda.money.BigMoney.ofMinor(currencyUnit15, 34L);
        boolean boolean26 = currencyUnit15.isPseudoCurrency();
        org.joda.money.CurrencyUnit currencyUnit31 = org.joda.money.CurrencyUnit.registerCurrency("EUR", (int) '#', (int) (short) -1, true);
        org.joda.money.BigMoney bigMoney32 = org.joda.money.BigMoney.zero(currencyUnit31);
        org.joda.money.CurrencyMismatchException currencyMismatchException33 = new org.joda.money.CurrencyMismatchException(currencyUnit15, currencyUnit31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money2 and bigMoney32", (money2.compareTo(bigMoney32) == 0) == money2.equals(bigMoney32));
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        org.joda.money.CurrencyUnit currencyUnit0 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean1 = currencyUnit0.isPseudoCurrency();
        boolean boolean2 = currencyUnit0.isPseudoCurrency();
        org.joda.money.BigMoney bigMoney3 = org.joda.money.BigMoney.zero(currencyUnit0);
        org.joda.money.BigMoney bigMoney5 = bigMoney3.multipliedBy((-1L));
        org.joda.money.BigMoney bigMoney7 = bigMoney5.withAmount((double) (-33));
        org.joda.money.CurrencyUnit currencyUnit8 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean9 = currencyUnit8.isPseudoCurrency();
        java.lang.String str10 = currencyUnit8.getCode();
        org.joda.money.BigMoney bigMoney13 = org.joda.money.BigMoney.ofScale(currencyUnit8, (long) (short) 10, (int) (byte) 10);
        org.joda.money.BigMoney bigMoney14 = bigMoney13.negated();
        org.joda.money.BigMoney bigMoney16 = bigMoney13.minusMajor((-9600L));
        org.joda.money.CurrencyUnit currencyUnit18 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money19 = org.joda.money.Money.zero(currencyUnit18);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit18);
        org.joda.money.BigMoney bigMoney22 = org.joda.money.BigMoney.of(currencyUnit18, (double) '#');
        java.math.BigDecimal bigDecimal23 = bigMoney22.getAmountMajor();
        org.joda.money.CurrencyUnit currencyUnit25 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money26 = org.joda.money.Money.zero(currencyUnit25);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit25);
        org.joda.money.BigMoney bigMoney29 = org.joda.money.BigMoney.of(currencyUnit25, (double) '#');
        boolean boolean30 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney29);
        org.joda.money.CurrencyUnit currencyUnit31 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money32 = org.joda.money.Money.zero(currencyUnit31);
        org.joda.money.Money money34 = money32.minusMajor((long) ' ');
        boolean boolean35 = bigMoney29.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money34);
        org.joda.money.Money money36 = money34.negated();
        org.joda.money.Money money38 = money36.minusMajor(1L);
        org.joda.money.CurrencyUnit currencyUnit39 = money36.getCurrencyUnit();
        java.util.Currency currency40 = currencyUnit39.toCurrency();
        org.joda.money.BigMoney bigMoney41 = bigMoney22.withCurrencyUnit(currencyUnit39);
        org.joda.money.BigMoney bigMoney43 = bigMoney22.plusMinor(100L);
        java.math.BigDecimal bigDecimal44 = bigMoney22.getAmount();
        org.joda.money.BigMoney bigMoney46 = bigMoney22.plusMajor(0L);
        org.joda.money.CurrencyUnit currencyUnit47 = bigMoney46.getCurrencyUnit();
        int int48 = bigMoney46.getScale();
        org.joda.money.BigMoney bigMoney49 = org.joda.money.MoneyUtils.add(bigMoney13, bigMoney46);
        org.joda.money.BigMoney bigMoney50 = bigMoney5.plus((org.joda.money.BigMoneyProvider) bigMoney49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney3 and money19", (bigMoney3.compareTo(money19) == 0) == bigMoney3.equals(money19));
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        org.joda.money.BigMoney bigMoney7 = org.joda.money.BigMoney.ofMinor(currencyUnit1, (long) (byte) -1);
        int int8 = bigMoney7.getAmountMinorInt();
        org.joda.money.CurrencyUnit currencyUnit10 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money11 = org.joda.money.Money.zero(currencyUnit10);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit10);
        org.joda.money.BigMoney bigMoney14 = org.joda.money.BigMoney.of(currencyUnit10, (double) '#');
        boolean boolean15 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney14);
        int int16 = bigMoney14.getMinorPart();
        boolean boolean17 = bigMoney14.isPositive();
        org.joda.money.BigMoney bigMoney18 = org.joda.money.MoneyUtils.subtract(bigMoney7, bigMoney14);
        org.joda.money.Money money19 = bigMoney7.toMoney();
        org.joda.money.BigMoney bigMoney20 = org.joda.money.BigMoney.of((org.joda.money.BigMoneyProvider) bigMoney7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney20 and money19", (bigMoney20.compareTo(money19) == 0) == bigMoney20.equals(money19));
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.Money money12 = money10.negated();
        org.joda.money.Money money14 = money12.minusMajor(1L);
        org.joda.money.CurrencyUnit currencyUnit15 = money12.getCurrencyUnit();
        java.lang.String str16 = currencyUnit15.toString();
        org.joda.money.CurrencyUnit currencyUnit17 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money18 = org.joda.money.Money.zero(currencyUnit17);
        org.joda.money.BigMoney bigMoney20 = org.joda.money.BigMoney.ofMajor(currencyUnit17, (long) 'a');
        java.util.Set<java.lang.String> strSet21 = currencyUnit17.getCountryCodes();
        int int22 = currencyUnit17.getDecimalPlaces();
        org.joda.money.CurrencyMismatchException currencyMismatchException23 = new org.joda.money.CurrencyMismatchException(currencyUnit15, currencyUnit17);
        org.joda.money.CurrencyUnit currencyUnit24 = currencyMismatchException23.getSecondCurrency();
        org.joda.money.CurrencyUnit currencyUnit25 = currencyMismatchException23.getSecondCurrency();
        org.joda.money.CurrencyUnit currencyUnit26 = currencyMismatchException23.getFirstCurrency();
        java.lang.String str27 = currencyUnit26.getNumeric3Code();
        org.joda.money.BigMoney bigMoney29 = org.joda.money.BigMoney.ofMinor(currencyUnit26, 58L);
        org.joda.money.CurrencyUnit currencyUnit30 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean31 = currencyUnit30.isPseudoCurrency();
        boolean boolean32 = currencyUnit30.isPseudoCurrency();
        org.joda.money.BigMoney bigMoney33 = org.joda.money.BigMoney.zero(currencyUnit30);
        java.math.BigDecimal bigDecimal34 = bigMoney33.getAmountMajor();
        long long35 = bigMoney33.getAmountMajorLong();
        java.math.RoundingMode roundingMode37 = null;
        org.joda.money.BigMoney bigMoney38 = bigMoney33.plusRetainScale((double) (byte) 0, roundingMode37);
        org.joda.money.CurrencyUnit currencyUnit39 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean40 = currencyUnit39.isPseudoCurrency();
        boolean boolean41 = currencyUnit39.isPseudoCurrency();
        org.joda.money.BigMoney bigMoney42 = org.joda.money.BigMoney.zero(currencyUnit39);
        org.joda.money.BigMoney bigMoney44 = bigMoney42.multipliedBy((-1L));
        long long45 = bigMoney42.getAmountMajorLong();
        java.math.BigDecimal bigDecimal46 = bigMoney42.getAmount();
        org.joda.money.BigMoney bigMoney47 = bigMoney42.negated();
        org.joda.money.BigMoney bigMoney48 = org.joda.money.MoneyUtils.subtract(bigMoney38, bigMoney42);
        org.joda.money.BigMoney bigMoney50 = bigMoney42.withAmount((double) (byte) 100);
        org.joda.money.BigMoney bigMoney52 = bigMoney42.withAmount((double) 35);
        java.math.BigDecimal bigDecimal53 = bigMoney52.getAmountMinor();
        org.joda.money.BigMoney bigMoney54 = bigMoney29.multipliedBy(bigDecimal53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money2 and bigMoney33", (money2.compareTo(bigMoney33) == 0) == money2.equals(bigMoney33));
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        java.math.BigDecimal bigDecimal6 = bigMoney5.getAmountMajor();
        org.joda.money.BigMoney bigMoney7 = bigMoney5.abs();
        org.joda.money.BigMoney bigMoney8 = bigMoney7.negated();
        org.joda.money.BigMoney bigMoney10 = bigMoney8.withScale((int) (short) 100);
        org.joda.money.CurrencyUnit currencyUnit12 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money13 = org.joda.money.Money.zero(currencyUnit12);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit12);
        org.joda.money.BigMoney bigMoney16 = org.joda.money.BigMoney.of(currencyUnit12, (double) '#');
        boolean boolean17 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney16);
        org.joda.money.CurrencyUnit currencyUnit18 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money19 = org.joda.money.Money.zero(currencyUnit18);
        org.joda.money.Money money21 = money19.minusMajor((long) ' ');
        boolean boolean22 = bigMoney16.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money21);
        org.joda.money.Money money23 = money21.negated();
        org.joda.money.CurrencyUnit currencyUnit25 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money26 = org.joda.money.Money.zero(currencyUnit25);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit25);
        org.joda.money.BigMoney bigMoney29 = org.joda.money.BigMoney.of(currencyUnit25, (double) '#');
        boolean boolean30 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney29);
        org.joda.money.CurrencyUnit currencyUnit31 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money32 = org.joda.money.Money.zero(currencyUnit31);
        org.joda.money.Money money34 = money32.minusMajor((long) ' ');
        boolean boolean35 = bigMoney29.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money34);
        org.joda.money.Money money36 = money34.negated();
        org.joda.money.Money money37 = money21.minus(money36);
        int int38 = money37.getMinorPart();
        org.joda.money.CurrencyUnit currencyUnit40 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money41 = org.joda.money.Money.zero(currencyUnit40);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit40);
        org.joda.money.BigMoney bigMoney44 = org.joda.money.BigMoney.of(currencyUnit40, (double) '#');
        boolean boolean45 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney44);
        org.joda.money.CurrencyUnit currencyUnit46 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money47 = org.joda.money.Money.zero(currencyUnit46);
        org.joda.money.Money money49 = money47.minusMajor((long) ' ');
        boolean boolean50 = bigMoney44.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money49);
        org.joda.money.CurrencyUnit currencyUnit52 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money53 = org.joda.money.Money.zero(currencyUnit52);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit52);
        org.joda.money.BigMoney bigMoney56 = org.joda.money.BigMoney.of(currencyUnit52, (double) '#');
        org.joda.money.Money money57 = money49.withCurrencyUnit(currencyUnit52);
        org.joda.money.CurrencyUnit currencyUnit59 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money60 = org.joda.money.Money.zero(currencyUnit59);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit59);
        org.joda.money.BigMoney bigMoney63 = org.joda.money.BigMoney.of(currencyUnit59, (double) '#');
        boolean boolean64 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney63);
        org.joda.money.CurrencyUnit currencyUnit65 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money66 = org.joda.money.Money.zero(currencyUnit65);
        org.joda.money.Money money68 = money66.minusMajor((long) ' ');
        boolean boolean69 = bigMoney63.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money68);
        org.joda.money.Money money70 = money68.negated();
        org.joda.money.Money money72 = money70.minusMajor(1L);
        org.joda.money.Money money74 = money72.minusMajor(100L);
        int int75 = money49.compareTo((org.joda.money.BigMoneyProvider) money72);
        org.joda.money.Money money77 = money49.withAmount((double) 10);
        boolean boolean78 = money37.isSameCurrency((org.joda.money.BigMoneyProvider) money77);
        java.math.BigDecimal bigDecimal79 = money37.getAmountMinor();
        java.math.BigDecimal bigDecimal80 = money37.getAmount();
        org.joda.money.BigMoney bigMoney81 = bigMoney8.multipliedBy(bigDecimal80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney8 and bigMoney10", (bigMoney8.compareTo(bigMoney10) == 0) == bigMoney8.equals(bigMoney10));
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        org.joda.money.CurrencyUnit currencyUnit4 = org.joda.money.CurrencyUnit.registerCurrency("EUR", (int) '#', (int) (short) -1, true);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.zero(currencyUnit4);
        boolean boolean6 = org.joda.money.MoneyUtils.isNegative((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.BigMoney bigMoney8 = bigMoney5.withScale(35);
        int int9 = bigMoney5.getMinorPart();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney5 and bigMoney8", (bigMoney5.compareTo(bigMoney8) == 0) == bigMoney5.equals(bigMoney8));
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
        org.joda.money.CurrencyUnit currencyUnit4 = org.joda.money.CurrencyUnit.registerCurrency("EUR", (int) '#', (int) (short) -1, true);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.zero(currencyUnit4);
        boolean boolean6 = org.joda.money.MoneyUtils.isNegative((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean8 = currencyUnit7.isPseudoCurrency();
        boolean boolean9 = currencyUnit7.isPseudoCurrency();
        org.joda.money.BigMoney bigMoney10 = org.joda.money.BigMoney.zero(currencyUnit7);
        org.joda.money.BigMoney bigMoney12 = bigMoney10.multipliedBy((-1L));
        long long13 = bigMoney10.getAmountMajorLong();
        org.joda.money.BigMoney bigMoney15 = bigMoney10.multipliedBy(3500L);
        org.joda.money.BigMoney bigMoney16 = org.joda.money.MoneyUtils.min(bigMoney5, bigMoney10);
        org.joda.money.CurrencyUnit currencyUnit18 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money19 = org.joda.money.Money.zero(currencyUnit18);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit18);
        org.joda.money.BigMoney bigMoney22 = org.joda.money.BigMoney.of(currencyUnit18, (double) '#');
        boolean boolean23 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney22);
        org.joda.money.CurrencyUnit currencyUnit24 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money25 = org.joda.money.Money.zero(currencyUnit24);
        org.joda.money.Money money27 = money25.minusMajor((long) ' ');
        boolean boolean28 = bigMoney22.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money27);
        org.joda.money.CurrencyUnit currencyUnit30 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money31 = org.joda.money.Money.zero(currencyUnit30);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit30);
        org.joda.money.BigMoney bigMoney34 = org.joda.money.BigMoney.of(currencyUnit30, (double) '#');
        org.joda.money.Money money35 = money27.withCurrencyUnit(currencyUnit30);
        org.joda.money.CurrencyUnit currencyUnit37 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money38 = org.joda.money.Money.zero(currencyUnit37);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit37);
        org.joda.money.BigMoney bigMoney41 = org.joda.money.BigMoney.of(currencyUnit37, (double) '#');
        boolean boolean42 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney41);
        org.joda.money.CurrencyUnit currencyUnit43 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money44 = org.joda.money.Money.zero(currencyUnit43);
        org.joda.money.Money money46 = money44.minusMajor((long) ' ');
        boolean boolean47 = bigMoney41.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money46);
        org.joda.money.Money money48 = money46.negated();
        org.joda.money.Money money50 = money48.minusMajor(1L);
        org.joda.money.Money money52 = money50.minusMajor(100L);
        int int53 = money27.compareTo((org.joda.money.BigMoneyProvider) money50);
        java.math.BigDecimal bigDecimal54 = money27.getAmountMinor();
        org.joda.money.Money money56 = money27.withAmount((double) 1L);
        org.joda.money.Money money57 = org.joda.money.Money.of((org.joda.money.BigMoneyProvider) money27);
        org.joda.money.Money money59 = money57.plusMinor((long) (short) 100);
        org.joda.money.Money money61 = money57.minusMinor(31L);
        org.joda.money.BigMoney bigMoney62 = bigMoney16.minus((org.joda.money.BigMoneyProvider) money61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney5 and money19", (bigMoney5.compareTo(money19) == 0) == bigMoney5.equals(money19));
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
        org.joda.money.CurrencyUnit currencyUnit0 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean1 = currencyUnit0.isPseudoCurrency();
        boolean boolean2 = currencyUnit0.isPseudoCurrency();
        org.joda.money.BigMoney bigMoney3 = org.joda.money.BigMoney.zero(currencyUnit0);
        java.math.BigDecimal bigDecimal4 = bigMoney3.getAmountMajor();
        long long5 = bigMoney3.getAmountMajorLong();
        java.math.RoundingMode roundingMode7 = null;
        org.joda.money.BigMoney bigMoney8 = bigMoney3.plusRetainScale((double) (byte) 0, roundingMode7);
        org.joda.money.CurrencyUnit currencyUnit9 = bigMoney8.getCurrencyUnit();
        org.joda.money.CurrencyUnit currencyUnit10 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean11 = currencyUnit10.isPseudoCurrency();
        boolean boolean12 = currencyUnit10.isPseudoCurrency();
        org.joda.money.CurrencyUnit currencyUnit14 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money15 = org.joda.money.Money.zero(currencyUnit14);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit14);
        org.joda.money.BigMoney bigMoney18 = org.joda.money.BigMoney.of(currencyUnit14, (double) '#');
        java.math.BigDecimal bigDecimal19 = bigMoney18.getAmountMajor();
        org.joda.money.BigMoney bigMoney20 = org.joda.money.BigMoney.of(currencyUnit10, bigDecimal19);
        org.joda.money.Money money22 = org.joda.money.Money.of(currencyUnit10, (double) (short) 0);
        org.joda.money.CurrencyUnit currencyUnit24 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money25 = org.joda.money.Money.zero(currencyUnit24);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit24);
        org.joda.money.BigMoney bigMoney28 = org.joda.money.BigMoney.of(currencyUnit24, (double) '#');
        java.math.BigDecimal bigDecimal29 = bigMoney28.getAmountMajor();
        org.joda.money.BigMoney bigMoney30 = bigMoney28.abs();
        org.joda.money.BigMoney bigMoney31 = bigMoney30.negated();
        org.joda.money.BigMoney bigMoney33 = bigMoney30.minusMinor((long) '#');
        org.joda.money.CurrencyUnit currencyUnit34 = bigMoney33.getCurrencyUnit();
        int int35 = bigMoney33.getAmountMinorInt();
        java.math.BigDecimal bigDecimal36 = bigMoney33.getAmountMajor();
        org.joda.money.Money money37 = money22.plus(bigDecimal36);
        org.joda.money.BigMoney bigMoney38 = org.joda.money.BigMoney.of(currencyUnit9, bigDecimal36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney3 and money15", (bigMoney3.compareTo(money15) == 0) == bigMoney3.equals(money15));
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.of("EUR");
        org.joda.money.BigMoney bigMoney3 = org.joda.money.BigMoney.ofMinor(currencyUnit1, (long) '0');
        org.joda.money.Money money4 = org.joda.money.Money.zero(currencyUnit1);
        java.lang.String str5 = currencyUnit1.getSymbol();
        org.joda.money.BigMoney bigMoney7 = org.joda.money.BigMoney.zero(currencyUnit1, 3500);
        long long8 = bigMoney7.getAmountMinorLong();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money4 and bigMoney7", (money4.compareTo(bigMoney7) == 0) == money4.equals(bigMoney7));
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        org.joda.money.CurrencyUnit currencyUnit0 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean1 = currencyUnit0.isPseudoCurrency();
        boolean boolean2 = currencyUnit0.isPseudoCurrency();
        org.joda.money.CurrencyUnit currencyUnit4 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money5 = org.joda.money.Money.zero(currencyUnit4);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit4);
        org.joda.money.BigMoney bigMoney8 = org.joda.money.BigMoney.of(currencyUnit4, (double) '#');
        boolean boolean9 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney8);
        org.joda.money.CurrencyUnit currencyUnit10 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money11 = org.joda.money.Money.zero(currencyUnit10);
        org.joda.money.Money money13 = money11.minusMajor((long) ' ');
        boolean boolean14 = bigMoney8.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money13);
        org.joda.money.CurrencyUnit currencyUnit15 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money16 = org.joda.money.Money.zero(currencyUnit15);
        org.joda.money.CurrencyUnit currencyUnit18 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money19 = org.joda.money.Money.zero(currencyUnit18);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit18);
        org.joda.money.BigMoney bigMoney22 = org.joda.money.BigMoney.of(currencyUnit18, (double) '#');
        boolean boolean23 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney22);
        org.joda.money.CurrencyUnit currencyUnit24 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money25 = org.joda.money.Money.zero(currencyUnit24);
        org.joda.money.Money money27 = money25.minusMajor((long) ' ');
        boolean boolean28 = bigMoney22.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money27);
        org.joda.money.CurrencyUnit currencyUnit30 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money31 = org.joda.money.Money.zero(currencyUnit30);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit30);
        org.joda.money.BigMoney bigMoney34 = org.joda.money.BigMoney.of(currencyUnit30, (double) '#');
        org.joda.money.Money money35 = money27.withCurrencyUnit(currencyUnit30);
        org.joda.money.CurrencyUnit currencyUnit36 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money37 = org.joda.money.Money.zero(currencyUnit36);
        org.joda.money.Money money39 = money37.minusMajor((long) ' ');
        int int40 = money37.getAmountMajorInt();
        org.joda.money.CurrencyUnit currencyUnit42 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money43 = org.joda.money.Money.zero(currencyUnit42);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit42);
        org.joda.money.BigMoney bigMoney46 = org.joda.money.BigMoney.of(currencyUnit42, (double) '#');
        boolean boolean47 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney46);
        org.joda.money.CurrencyUnit currencyUnit48 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money49 = org.joda.money.Money.zero(currencyUnit48);
        org.joda.money.Money money51 = money49.minusMajor((long) ' ');
        boolean boolean52 = bigMoney46.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money51);
        org.joda.money.Money money53 = money51.negated();
        org.joda.money.CurrencyUnit currencyUnit55 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money56 = org.joda.money.Money.zero(currencyUnit55);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit55);
        org.joda.money.BigMoney bigMoney59 = org.joda.money.BigMoney.of(currencyUnit55, (double) '#');
        boolean boolean60 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney59);
        org.joda.money.CurrencyUnit currencyUnit61 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money62 = org.joda.money.Money.zero(currencyUnit61);
        org.joda.money.Money money64 = money62.minusMajor((long) ' ');
        boolean boolean65 = bigMoney59.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money64);
        org.joda.money.Money money66 = money64.negated();
        org.joda.money.Money money67 = money51.minus(money66);
        org.joda.money.CurrencyUnit currencyUnit69 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money70 = org.joda.money.Money.zero(currencyUnit69);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit69);
        org.joda.money.BigMoney bigMoney73 = org.joda.money.BigMoney.of(currencyUnit69, (double) '#');
        boolean boolean74 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney73);
        org.joda.money.CurrencyUnit currencyUnit75 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money76 = org.joda.money.Money.zero(currencyUnit75);
        org.joda.money.Money money78 = money76.minusMajor((long) ' ');
        boolean boolean79 = bigMoney73.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money78);
        org.joda.money.Money money80 = money78.negated();
        org.joda.money.Money money82 = money80.minusMajor(1L);
        org.joda.money.Money[] moneyArray83 = new org.joda.money.Money[] { money13, money16, money27, money37, money67, money82 };
        org.joda.money.Money money84 = org.joda.money.Money.total(currencyUnit0, moneyArray83);
        org.joda.money.Money money85 = org.joda.money.Money.total(moneyArray83);
        org.joda.money.Money money86 = org.joda.money.Money.total(moneyArray83);
        org.joda.money.Money money87 = org.joda.money.Money.total(moneyArray83);
        org.joda.money.Money money88 = org.joda.money.Money.total(moneyArray83);
        org.joda.money.BigMoney bigMoney89 = org.joda.money.BigMoney.total((org.joda.money.BigMoneyProvider[]) moneyArray83);
        java.lang.String str90 = bigMoney89.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money84 and bigMoney89", (money84.compareTo(bigMoney89) == 0) == money84.equals(bigMoney89));
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
        org.joda.money.CurrencyUnit currencyUnit0 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean1 = currencyUnit0.isPseudoCurrency();
        boolean boolean2 = currencyUnit0.isPseudoCurrency();
        org.joda.money.CurrencyUnit currencyUnit4 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money5 = org.joda.money.Money.zero(currencyUnit4);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit4);
        org.joda.money.BigMoney bigMoney8 = org.joda.money.BigMoney.of(currencyUnit4, (double) '#');
        boolean boolean9 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney8);
        org.joda.money.CurrencyUnit currencyUnit10 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money11 = org.joda.money.Money.zero(currencyUnit10);
        org.joda.money.Money money13 = money11.minusMajor((long) ' ');
        boolean boolean14 = bigMoney8.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money13);
        org.joda.money.CurrencyUnit currencyUnit15 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money16 = org.joda.money.Money.zero(currencyUnit15);
        org.joda.money.CurrencyUnit currencyUnit18 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money19 = org.joda.money.Money.zero(currencyUnit18);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit18);
        org.joda.money.BigMoney bigMoney22 = org.joda.money.BigMoney.of(currencyUnit18, (double) '#');
        boolean boolean23 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney22);
        org.joda.money.CurrencyUnit currencyUnit24 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money25 = org.joda.money.Money.zero(currencyUnit24);
        org.joda.money.Money money27 = money25.minusMajor((long) ' ');
        boolean boolean28 = bigMoney22.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money27);
        org.joda.money.CurrencyUnit currencyUnit30 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money31 = org.joda.money.Money.zero(currencyUnit30);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit30);
        org.joda.money.BigMoney bigMoney34 = org.joda.money.BigMoney.of(currencyUnit30, (double) '#');
        org.joda.money.Money money35 = money27.withCurrencyUnit(currencyUnit30);
        org.joda.money.CurrencyUnit currencyUnit36 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money37 = org.joda.money.Money.zero(currencyUnit36);
        org.joda.money.Money money39 = money37.minusMajor((long) ' ');
        int int40 = money37.getAmountMajorInt();
        org.joda.money.CurrencyUnit currencyUnit42 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money43 = org.joda.money.Money.zero(currencyUnit42);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit42);
        org.joda.money.BigMoney bigMoney46 = org.joda.money.BigMoney.of(currencyUnit42, (double) '#');
        boolean boolean47 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney46);
        org.joda.money.CurrencyUnit currencyUnit48 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money49 = org.joda.money.Money.zero(currencyUnit48);
        org.joda.money.Money money51 = money49.minusMajor((long) ' ');
        boolean boolean52 = bigMoney46.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money51);
        org.joda.money.Money money53 = money51.negated();
        org.joda.money.CurrencyUnit currencyUnit55 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money56 = org.joda.money.Money.zero(currencyUnit55);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit55);
        org.joda.money.BigMoney bigMoney59 = org.joda.money.BigMoney.of(currencyUnit55, (double) '#');
        boolean boolean60 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney59);
        org.joda.money.CurrencyUnit currencyUnit61 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money62 = org.joda.money.Money.zero(currencyUnit61);
        org.joda.money.Money money64 = money62.minusMajor((long) ' ');
        boolean boolean65 = bigMoney59.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money64);
        org.joda.money.Money money66 = money64.negated();
        org.joda.money.Money money67 = money51.minus(money66);
        org.joda.money.CurrencyUnit currencyUnit69 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money70 = org.joda.money.Money.zero(currencyUnit69);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit69);
        org.joda.money.BigMoney bigMoney73 = org.joda.money.BigMoney.of(currencyUnit69, (double) '#');
        boolean boolean74 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney73);
        org.joda.money.CurrencyUnit currencyUnit75 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money76 = org.joda.money.Money.zero(currencyUnit75);
        org.joda.money.Money money78 = money76.minusMajor((long) ' ');
        boolean boolean79 = bigMoney73.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money78);
        org.joda.money.Money money80 = money78.negated();
        org.joda.money.Money money82 = money80.minusMajor(1L);
        org.joda.money.Money[] moneyArray83 = new org.joda.money.Money[] { money13, money16, money27, money37, money67, money82 };
        org.joda.money.Money money84 = org.joda.money.Money.total(currencyUnit0, moneyArray83);
        org.joda.money.BigMoney bigMoney85 = org.joda.money.BigMoney.total((org.joda.money.BigMoneyProvider[]) moneyArray83);
        org.joda.money.Money money86 = org.joda.money.Money.total(moneyArray83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money84 and bigMoney85", (money84.compareTo(bigMoney85) == 0) == money84.equals(bigMoney85));
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.CurrencyUnit currencyUnit13 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money14 = org.joda.money.Money.zero(currencyUnit13);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit13);
        org.joda.money.BigMoney bigMoney17 = org.joda.money.BigMoney.of(currencyUnit13, (double) '#');
        org.joda.money.Money money18 = money10.withCurrencyUnit(currencyUnit13);
        org.joda.money.CurrencyUnit currencyUnit20 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money21 = org.joda.money.Money.zero(currencyUnit20);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit20);
        org.joda.money.BigMoney bigMoney24 = org.joda.money.BigMoney.of(currencyUnit20, (double) '#');
        boolean boolean25 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney24);
        org.joda.money.CurrencyUnit currencyUnit26 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money27 = org.joda.money.Money.zero(currencyUnit26);
        org.joda.money.Money money29 = money27.minusMajor((long) ' ');
        boolean boolean30 = bigMoney24.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money29);
        org.joda.money.Money money31 = money29.negated();
        org.joda.money.CurrencyUnit currencyUnit33 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money34 = org.joda.money.Money.zero(currencyUnit33);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit33);
        org.joda.money.BigMoney bigMoney37 = org.joda.money.BigMoney.of(currencyUnit33, (double) '#');
        boolean boolean38 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney37);
        org.joda.money.CurrencyUnit currencyUnit39 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money40 = org.joda.money.Money.zero(currencyUnit39);
        org.joda.money.Money money42 = money40.minusMajor((long) ' ');
        boolean boolean43 = bigMoney37.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money42);
        org.joda.money.Money money44 = money42.negated();
        org.joda.money.Money money45 = money29.minus(money44);
        org.joda.money.CurrencyUnit currencyUnit47 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money48 = org.joda.money.Money.zero(currencyUnit47);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit47);
        org.joda.money.BigMoney bigMoney51 = org.joda.money.BigMoney.of(currencyUnit47, (double) '#');
        boolean boolean52 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney51);
        org.joda.money.CurrencyUnit currencyUnit53 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money54 = org.joda.money.Money.zero(currencyUnit53);
        org.joda.money.Money money56 = money54.minusMajor((long) ' ');
        boolean boolean57 = bigMoney51.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money56);
        int int58 = bigMoney51.getAmountMajorInt();
        boolean boolean59 = money44.isLessThanOrEqual((org.joda.money.BigMoneyProvider) bigMoney51);
        java.math.BigDecimal bigDecimal60 = money44.getAmountMajor();
        org.joda.money.Money money61 = org.joda.money.Money.of(currencyUnit13, bigDecimal60);
        org.joda.money.CurrencyUnit currencyUnit63 = org.joda.money.CurrencyUnit.of("EUR");
        org.joda.money.BigMoney bigMoney65 = org.joda.money.BigMoney.ofMinor(currencyUnit63, (long) '0');
        java.lang.String str66 = currencyUnit63.toString();
        java.lang.String str67 = currencyUnit63.getSymbol();
        boolean boolean68 = currencyUnit13.equals((java.lang.Object) currencyUnit63);
        org.joda.money.Money money70 = org.joda.money.Money.ofMinor(currencyUnit13, (long) 3500);
        boolean boolean71 = money70.isPositiveOrZero();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney5 and money70", (bigMoney5.compareTo(money70) == 0) == bigMoney5.equals(money70));
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
        org.joda.money.CurrencyUnit currencyUnit0 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean1 = currencyUnit0.isPseudoCurrency();
        boolean boolean2 = currencyUnit0.isPseudoCurrency();
        org.joda.money.BigMoney bigMoney3 = org.joda.money.BigMoney.zero(currencyUnit0);
        org.joda.money.BigMoney bigMoney5 = bigMoney3.multipliedBy((-1L));
        long long6 = bigMoney3.getAmountMajorLong();
        boolean boolean7 = bigMoney3.isPositiveOrZero();
        int int8 = bigMoney3.getScale();
        org.joda.money.BigMoney bigMoney9 = bigMoney3.abs();
        boolean boolean10 = bigMoney9.isPositiveOrZero();
        org.joda.money.CurrencyUnit currencyUnit12 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money13 = org.joda.money.Money.zero(currencyUnit12);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit12);
        org.joda.money.BigMoney bigMoney16 = org.joda.money.BigMoney.of(currencyUnit12, (double) '#');
        boolean boolean17 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney16);
        org.joda.money.CurrencyUnit currencyUnit18 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money19 = org.joda.money.Money.zero(currencyUnit18);
        org.joda.money.Money money21 = money19.minusMajor((long) ' ');
        boolean boolean22 = bigMoney16.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money21);
        int int23 = bigMoney16.getAmountMajorInt();
        org.joda.money.CurrencyUnit currencyUnit25 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money26 = org.joda.money.Money.zero(currencyUnit25);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit25);
        org.joda.money.BigMoney bigMoney29 = org.joda.money.BigMoney.of(currencyUnit25, (double) '#');
        boolean boolean30 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney29);
        org.joda.money.CurrencyUnit currencyUnit31 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money32 = org.joda.money.Money.zero(currencyUnit31);
        org.joda.money.Money money34 = money32.minusMajor((long) ' ');
        boolean boolean35 = bigMoney29.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money34);
        org.joda.money.CurrencyUnit currencyUnit37 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money38 = org.joda.money.Money.zero(currencyUnit37);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit37);
        org.joda.money.BigMoney bigMoney41 = org.joda.money.BigMoney.of(currencyUnit37, (double) '#');
        org.joda.money.Money money42 = money34.withCurrencyUnit(currencyUnit37);
        org.joda.money.BigMoney bigMoney43 = bigMoney16.plus((org.joda.money.BigMoneyProvider) money34);
        org.joda.money.BigMoney bigMoney45 = bigMoney43.minus((double) (byte) 0);
        org.joda.money.BigMoney bigMoney46 = bigMoney43.toBigMoney();
        org.joda.money.CurrencyUnit currencyUnit47 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean48 = currencyUnit47.isPseudoCurrency();
        java.lang.String str49 = currencyUnit47.getCode();
        org.joda.money.Money money50 = org.joda.money.Money.zero(currencyUnit47);
        org.joda.money.Money money51 = org.joda.money.Money.zero(currencyUnit47);
        org.joda.money.Money money52 = money51.negated();
        org.joda.money.Money money53 = money51.abs();
        java.math.BigDecimal bigDecimal54 = money51.getAmount();
        org.joda.money.BigMoney bigMoney55 = bigMoney43.withAmount(bigDecimal54);
        org.joda.money.BigMoney bigMoney56 = bigMoney9.plus(bigDecimal54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney56 and money13", (bigMoney56.compareTo(money13) == 0) == bigMoney56.equals(money13));
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.Money money5 = org.joda.money.Money.ofMajor(currencyUnit1, (long) (byte) 10);
        org.joda.money.Money money6 = money5.abs();
        org.joda.money.Money money8 = money6.minusMajor(0L);
        org.joda.money.CurrencyUnit currencyUnit9 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money10 = org.joda.money.Money.zero(currencyUnit9);
        org.joda.money.BigMoney bigMoney12 = org.joda.money.BigMoney.ofMajor(currencyUnit9, (long) 'a');
        java.util.Set<java.lang.String> strSet13 = currencyUnit9.getCountryCodes();
        org.joda.money.Money money15 = org.joda.money.Money.ofMajor(currencyUnit9, (long) '0');
        org.joda.money.Money money17 = money15.plusMajor((long) (byte) 10);
        java.math.BigDecimal bigDecimal18 = money17.getAmountMinor();
        org.joda.money.Money money19 = org.joda.money.MoneyUtils.subtract(money8, money17);
        org.joda.money.Money money21 = money19.plusMajor((long) (-1200));
        org.joda.money.Money money23 = money19.minus((double) (byte) -1);
        boolean boolean24 = money19.isNegative();
        org.joda.money.Money money26 = money19.withAmount((double) (-62));
        org.joda.money.CurrencyUnit currencyUnit28 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money29 = org.joda.money.Money.zero(currencyUnit28);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit28);
        org.joda.money.BigMoney bigMoney32 = org.joda.money.BigMoney.of(currencyUnit28, (double) '#');
        boolean boolean33 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney32);
        org.joda.money.CurrencyUnit currencyUnit34 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money35 = org.joda.money.Money.zero(currencyUnit34);
        org.joda.money.Money money37 = money35.minusMajor((long) ' ');
        boolean boolean38 = bigMoney32.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money37);
        org.joda.money.Money money39 = money37.negated();
        org.joda.money.CurrencyUnit currencyUnit41 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money42 = org.joda.money.Money.zero(currencyUnit41);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit41);
        org.joda.money.BigMoney bigMoney45 = org.joda.money.BigMoney.of(currencyUnit41, (double) '#');
        boolean boolean46 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney45);
        org.joda.money.CurrencyUnit currencyUnit47 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money48 = org.joda.money.Money.zero(currencyUnit47);
        org.joda.money.Money money50 = money48.minusMajor((long) ' ');
        boolean boolean51 = bigMoney45.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money50);
        org.joda.money.Money money52 = money50.negated();
        org.joda.money.Money money53 = money37.minus(money52);
        org.joda.money.CurrencyUnit currencyUnit55 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money56 = org.joda.money.Money.zero(currencyUnit55);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit55);
        org.joda.money.BigMoney bigMoney59 = org.joda.money.BigMoney.of(currencyUnit55, (double) '#');
        boolean boolean60 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney59);
        org.joda.money.CurrencyUnit currencyUnit61 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money62 = org.joda.money.Money.zero(currencyUnit61);
        org.joda.money.Money money64 = money62.minusMajor((long) ' ');
        boolean boolean65 = bigMoney59.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money64);
        int int66 = bigMoney59.getAmountMajorInt();
        boolean boolean67 = money52.isLessThanOrEqual((org.joda.money.BigMoneyProvider) bigMoney59);
        org.joda.money.CurrencyUnit currencyUnit69 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money70 = org.joda.money.Money.zero(currencyUnit69);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit69);
        org.joda.money.BigMoney bigMoney73 = org.joda.money.BigMoney.of(currencyUnit69, (double) '#');
        boolean boolean74 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney73);
        org.joda.money.CurrencyUnit currencyUnit75 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money76 = org.joda.money.Money.zero(currencyUnit75);
        org.joda.money.Money money78 = money76.minusMajor((long) ' ');
        boolean boolean79 = bigMoney73.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money78);
        org.joda.money.Money money81 = money78.multipliedBy((long) (byte) 10);
        boolean boolean82 = bigMoney59.isLessThan((org.joda.money.BigMoneyProvider) money78);
        org.joda.money.BigMoney bigMoney84 = bigMoney59.multipliedBy((long) 10);
        org.joda.money.Money money85 = org.joda.money.Money.of((org.joda.money.BigMoneyProvider) bigMoney84);
        org.joda.money.Money money86 = money19.minus(money85);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney84 and money85", (bigMoney84.compareTo(money85) == 0) == bigMoney84.equals(money85));
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.Money money13 = money10.multipliedBy((long) (byte) 10);
        org.joda.money.Money money15 = money13.minusMajor((long) (byte) 10);
        org.joda.money.CurrencyUnit currencyUnit17 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money18 = org.joda.money.Money.zero(currencyUnit17);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit17);
        org.joda.money.BigMoney bigMoney21 = org.joda.money.BigMoney.of(currencyUnit17, (double) '#');
        boolean boolean22 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney21);
        org.joda.money.CurrencyUnit currencyUnit23 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money24 = org.joda.money.Money.zero(currencyUnit23);
        org.joda.money.Money money26 = money24.minusMajor((long) ' ');
        boolean boolean27 = bigMoney21.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money26);
        org.joda.money.Money money28 = money26.negated();
        org.joda.money.Money money30 = money28.minusMajor(1L);
        org.joda.money.Money money32 = money30.plusMinor((long) 35);
        org.joda.money.CurrencyUnit currencyUnit33 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money34 = org.joda.money.Money.zero(currencyUnit33);
        org.joda.money.Money money36 = money34.minusMajor((long) ' ');
        org.joda.money.Money money37 = org.joda.money.MoneyUtils.min(money32, money36);
        boolean boolean38 = org.joda.money.MoneyUtils.isPositive((org.joda.money.BigMoneyProvider) money37);
        org.joda.money.Money[] moneyArray39 = new org.joda.money.Money[] { money15, money37 };
        org.joda.money.Money money40 = org.joda.money.Money.total(moneyArray39);
        org.joda.money.BigMoney bigMoney41 = org.joda.money.BigMoney.total((org.joda.money.BigMoneyProvider[]) moneyArray39);
        org.joda.money.CurrencyUnit currencyUnit43 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money44 = org.joda.money.Money.zero(currencyUnit43);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit43);
        org.joda.money.CurrencyUnit currencyUnit46 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean47 = currencyUnit46.isPseudoCurrency();
        java.lang.String str48 = currencyUnit46.getCode();
        org.joda.money.Money money49 = org.joda.money.Money.zero(currencyUnit46);
        org.joda.money.CurrencyUnit currencyUnit50 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money51 = org.joda.money.Money.zero(currencyUnit50);
        org.joda.money.Money money53 = money51.minusMajor((long) ' ');
        java.math.BigDecimal bigDecimal54 = money51.getAmountMinor();
        org.joda.money.Money money55 = org.joda.money.Money.of(currencyUnit46, bigDecimal54);
        org.joda.money.BigMoney bigMoney56 = org.joda.money.BigMoney.of(currencyUnit43, bigDecimal54);
        org.joda.money.BigMoney bigMoney57 = bigMoney41.minus(bigDecimal54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money2 and bigMoney56", (money2.compareTo(bigMoney56) == 0) == money2.equals(bigMoney56));
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
        org.joda.money.CurrencyUnit currencyUnit0 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money1 = org.joda.money.Money.zero(currencyUnit0);
        org.joda.money.CurrencyUnit currencyUnit2 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money3 = org.joda.money.Money.zero(currencyUnit2);
        org.joda.money.Money money5 = money3.minusMajor((long) ' ');
        boolean boolean6 = money1.isSameCurrency((org.joda.money.BigMoneyProvider) money5);
        java.lang.String str7 = money5.toString();
        org.joda.money.Money money9 = money5.multipliedBy((long) ' ');
        org.joda.money.CurrencyUnit currencyUnit11 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money12 = org.joda.money.Money.zero(currencyUnit11);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit11);
        org.joda.money.BigMoney bigMoney15 = org.joda.money.BigMoney.of(currencyUnit11, (double) '#');
        boolean boolean16 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney15);
        org.joda.money.CurrencyUnit currencyUnit17 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money18 = org.joda.money.Money.zero(currencyUnit17);
        org.joda.money.Money money20 = money18.minusMajor((long) ' ');
        boolean boolean21 = bigMoney15.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money20);
        org.joda.money.CurrencyUnit currencyUnit23 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money24 = org.joda.money.Money.zero(currencyUnit23);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit23);
        org.joda.money.BigMoney bigMoney27 = org.joda.money.BigMoney.of(currencyUnit23, (double) '#');
        org.joda.money.Money money28 = money20.withCurrencyUnit(currencyUnit23);
        org.joda.money.CurrencyUnit currencyUnit30 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money31 = org.joda.money.Money.zero(currencyUnit30);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit30);
        org.joda.money.BigMoney bigMoney34 = org.joda.money.BigMoney.of(currencyUnit30, (double) '#');
        boolean boolean35 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney34);
        org.joda.money.CurrencyUnit currencyUnit36 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money37 = org.joda.money.Money.zero(currencyUnit36);
        org.joda.money.Money money39 = money37.minusMajor((long) ' ');
        boolean boolean40 = bigMoney34.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money39);
        org.joda.money.Money money41 = money39.negated();
        org.joda.money.Money money43 = money41.minusMajor(1L);
        org.joda.money.Money money45 = money43.minusMajor(100L);
        int int46 = money20.compareTo((org.joda.money.BigMoneyProvider) money43);
        java.math.BigDecimal bigDecimal47 = money20.getAmountMinor();
        org.joda.money.Money money48 = money5.minus(money20);
        org.joda.money.BigMoney bigMoney49 = money20.toBigMoney();
        org.joda.money.Money money51 = money20.multipliedBy(34L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money5 and bigMoney49", (money5.compareTo(bigMoney49) == 0) == money5.equals(bigMoney49));
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.Money money12 = money10.negated();
        org.joda.money.CurrencyUnit currencyUnit14 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money15 = org.joda.money.Money.zero(currencyUnit14);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit14);
        org.joda.money.BigMoney bigMoney18 = org.joda.money.BigMoney.of(currencyUnit14, (double) '#');
        boolean boolean19 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney18);
        org.joda.money.CurrencyUnit currencyUnit20 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money21 = org.joda.money.Money.zero(currencyUnit20);
        org.joda.money.Money money23 = money21.minusMajor((long) ' ');
        boolean boolean24 = bigMoney18.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money23);
        org.joda.money.Money money25 = money23.negated();
        org.joda.money.Money money26 = money10.minus(money25);
        org.joda.money.CurrencyUnit currencyUnit28 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money29 = org.joda.money.Money.zero(currencyUnit28);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit28);
        org.joda.money.BigMoney bigMoney32 = org.joda.money.BigMoney.of(currencyUnit28, (double) '#');
        boolean boolean33 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney32);
        org.joda.money.CurrencyUnit currencyUnit34 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money35 = org.joda.money.Money.zero(currencyUnit34);
        org.joda.money.Money money37 = money35.minusMajor((long) ' ');
        boolean boolean38 = bigMoney32.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money37);
        org.joda.money.CurrencyUnit currencyUnit40 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money41 = org.joda.money.Money.zero(currencyUnit40);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit40);
        org.joda.money.BigMoney bigMoney44 = org.joda.money.BigMoney.of(currencyUnit40, (double) '#');
        boolean boolean45 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney44);
        org.joda.money.CurrencyUnit currencyUnit46 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money47 = org.joda.money.Money.zero(currencyUnit46);
        org.joda.money.Money money49 = money47.minusMajor((long) ' ');
        boolean boolean50 = bigMoney44.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money49);
        org.joda.money.Money money51 = money49.negated();
        org.joda.money.Money money53 = money51.minusMajor(1L);
        org.joda.money.Money money55 = money53.minusMajor(100L);
        org.joda.money.CurrencyUnit currencyUnit57 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money58 = org.joda.money.Money.zero(currencyUnit57);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit57);
        org.joda.money.BigMoney bigMoney61 = org.joda.money.BigMoney.of(currencyUnit57, (double) '#');
        boolean boolean62 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney61);
        org.joda.money.CurrencyUnit currencyUnit63 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money64 = org.joda.money.Money.zero(currencyUnit63);
        org.joda.money.Money money66 = money64.minusMajor((long) ' ');
        boolean boolean67 = bigMoney61.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money66);
        org.joda.money.Money money68 = money66.negated();
        org.joda.money.CurrencyUnit currencyUnit70 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money71 = org.joda.money.Money.zero(currencyUnit70);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit70);
        org.joda.money.BigMoney bigMoney74 = org.joda.money.BigMoney.of(currencyUnit70, (double) '#');
        boolean boolean75 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney74);
        org.joda.money.CurrencyUnit currencyUnit76 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money77 = org.joda.money.Money.zero(currencyUnit76);
        org.joda.money.Money money79 = money77.minusMajor((long) ' ');
        boolean boolean80 = bigMoney74.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money79);
        org.joda.money.Money money81 = money79.negated();
        org.joda.money.Money money82 = money66.minus(money81);
        org.joda.money.Money[] moneyArray83 = new org.joda.money.Money[] { money37, money55, money66 };
        org.joda.money.Money money84 = org.joda.money.Money.total(moneyArray83);
        org.joda.money.Money money85 = org.joda.money.MoneyUtils.add(money25, money84);
        org.joda.money.Money money87 = money84.plusMinor((long) (short) 0);
        java.lang.String str88 = money87.toString();
        org.joda.money.Money money90 = money87.plus((double) (-1200));
        org.joda.money.CurrencyUnit currencyUnit91 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean92 = currencyUnit91.isPseudoCurrency();
        boolean boolean93 = currencyUnit91.isPseudoCurrency();
        org.joda.money.BigMoney bigMoney94 = org.joda.money.BigMoney.zero(currencyUnit91);
        org.joda.money.BigMoney bigMoney96 = org.joda.money.BigMoney.of(currencyUnit91, (double) (short) 1);
        java.math.BigDecimal bigDecimal97 = bigMoney96.getAmount();
        org.joda.money.Money money98 = money90.minus(bigDecimal97);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money2 and bigMoney94", (money2.compareTo(bigMoney94) == 0) == money2.equals(bigMoney94));
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        int int12 = bigMoney5.getAmountMajorInt();
        org.joda.money.BigMoney bigMoney13 = bigMoney5.negated();
        boolean boolean14 = bigMoney13.isCurrencyScale();
        org.joda.money.CurrencyUnit currencyUnit16 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money17 = org.joda.money.Money.zero(currencyUnit16);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit16);
        org.joda.money.BigMoney bigMoney20 = org.joda.money.BigMoney.of(currencyUnit16, (double) '#');
        java.math.BigDecimal bigDecimal21 = bigMoney20.getAmountMajor();
        boolean boolean22 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney20);
        org.joda.money.BigMoney bigMoney23 = bigMoney20.abs();
        org.joda.money.CurrencyUnit currencyUnit25 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money26 = org.joda.money.Money.zero(currencyUnit25);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit25);
        org.joda.money.BigMoney bigMoney29 = org.joda.money.BigMoney.of(currencyUnit25, (double) '#');
        boolean boolean30 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney29);
        org.joda.money.CurrencyUnit currencyUnit31 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money32 = org.joda.money.Money.zero(currencyUnit31);
        org.joda.money.Money money34 = money32.minusMajor((long) ' ');
        boolean boolean35 = bigMoney29.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money34);
        org.joda.money.Money money36 = money34.negated();
        org.joda.money.Money money38 = money36.minusMajor(1L);
        org.joda.money.CurrencyUnit currencyUnit39 = money36.getCurrencyUnit();
        org.joda.money.BigMoney bigMoney42 = org.joda.money.BigMoney.ofScale(currencyUnit39, 10L, (int) (short) 0);
        org.joda.money.CurrencyUnit currencyUnit44 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money45 = org.joda.money.Money.zero(currencyUnit44);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit44);
        org.joda.money.BigMoney bigMoney48 = org.joda.money.BigMoney.of(currencyUnit44, (double) '#');
        boolean boolean49 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney48);
        org.joda.money.CurrencyUnit currencyUnit50 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money51 = org.joda.money.Money.zero(currencyUnit50);
        org.joda.money.Money money53 = money51.minusMajor((long) ' ');
        boolean boolean54 = bigMoney48.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money53);
        org.joda.money.Money money55 = money53.negated();
        org.joda.money.Money money57 = money55.minusMajor(1L);
        org.joda.money.Money money59 = money57.plusMinor((long) 35);
        org.joda.money.Money money61 = money59.multipliedBy((long) (byte) -1);
        org.joda.money.BigMoney bigMoney62 = bigMoney42.plus((org.joda.money.BigMoneyProvider) money61);
        org.joda.money.CurrencyUnit currencyUnit63 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money64 = org.joda.money.Money.zero(currencyUnit63);
        org.joda.money.Money money66 = money64.minusMajor((long) ' ');
        java.lang.String str67 = money66.toString();
        org.joda.money.Money money69 = money66.minusMajor((long) (short) 1);
        boolean boolean70 = org.joda.money.MoneyUtils.isZero((org.joda.money.BigMoneyProvider) money69);
        org.joda.money.Money money72 = money69.plus((double) 'a');
        boolean boolean73 = bigMoney42.isGreaterThanOrEqual((org.joda.money.BigMoneyProvider) money72);
        int int74 = bigMoney20.compareTo((org.joda.money.BigMoneyProvider) money72);
        org.joda.money.BigMoney bigMoney75 = org.joda.money.BigMoney.of((org.joda.money.BigMoneyProvider) money72);
        boolean boolean76 = bigMoney13.isSameCurrency((org.joda.money.BigMoneyProvider) money72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money72 and bigMoney75", (money72.compareTo(bigMoney75) == 0) == money72.equals(bigMoney75));
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test603");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        java.math.BigDecimal bigDecimal6 = bigMoney5.getAmountMajor();
        org.joda.money.BigMoney bigMoney7 = bigMoney5.abs();
        org.joda.money.BigMoney bigMoney8 = bigMoney7.negated();
        org.joda.money.BigMoney bigMoney10 = bigMoney8.withScale((int) (short) 100);
        org.joda.money.CurrencyUnit currencyUnit12 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money13 = org.joda.money.Money.zero(currencyUnit12);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit12);
        org.joda.money.BigMoney bigMoney16 = org.joda.money.BigMoney.of(currencyUnit12, (double) '#');
        java.math.BigDecimal bigDecimal17 = bigMoney16.getAmountMajor();
        org.joda.money.BigMoney bigMoney18 = bigMoney16.abs();
        org.joda.money.BigMoney bigMoney20 = bigMoney18.minusMinor((long) (-1));
        boolean boolean21 = bigMoney20.isNegativeOrZero();
        org.joda.money.BigMoney bigMoney22 = bigMoney20.toBigMoney();
        org.joda.money.CurrencyUnit currencyUnit24 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money25 = org.joda.money.Money.zero(currencyUnit24);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit24);
        org.joda.money.BigMoney bigMoney28 = org.joda.money.BigMoney.of(currencyUnit24, (double) '#');
        boolean boolean29 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney28);
        org.joda.money.CurrencyUnit currencyUnit30 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money31 = org.joda.money.Money.zero(currencyUnit30);
        org.joda.money.Money money33 = money31.minusMajor((long) ' ');
        boolean boolean34 = bigMoney28.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money33);
        org.joda.money.Money money35 = money33.negated();
        org.joda.money.CurrencyUnit currencyUnit37 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money38 = org.joda.money.Money.zero(currencyUnit37);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit37);
        org.joda.money.BigMoney bigMoney41 = org.joda.money.BigMoney.of(currencyUnit37, (double) '#');
        boolean boolean42 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney41);
        org.joda.money.CurrencyUnit currencyUnit43 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money44 = org.joda.money.Money.zero(currencyUnit43);
        org.joda.money.Money money46 = money44.minusMajor((long) ' ');
        boolean boolean47 = bigMoney41.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money46);
        org.joda.money.Money money48 = money46.negated();
        org.joda.money.Money money49 = money33.minus(money48);
        int int50 = money49.getMinorPart();
        org.joda.money.CurrencyUnit currencyUnit52 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money53 = org.joda.money.Money.zero(currencyUnit52);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit52);
        org.joda.money.BigMoney bigMoney56 = org.joda.money.BigMoney.of(currencyUnit52, (double) '#');
        boolean boolean57 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney56);
        org.joda.money.CurrencyUnit currencyUnit58 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money59 = org.joda.money.Money.zero(currencyUnit58);
        org.joda.money.Money money61 = money59.minusMajor((long) ' ');
        boolean boolean62 = bigMoney56.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money61);
        org.joda.money.CurrencyUnit currencyUnit64 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money65 = org.joda.money.Money.zero(currencyUnit64);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit64);
        org.joda.money.BigMoney bigMoney68 = org.joda.money.BigMoney.of(currencyUnit64, (double) '#');
        org.joda.money.Money money69 = money61.withCurrencyUnit(currencyUnit64);
        org.joda.money.CurrencyUnit currencyUnit71 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money72 = org.joda.money.Money.zero(currencyUnit71);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit71);
        org.joda.money.BigMoney bigMoney75 = org.joda.money.BigMoney.of(currencyUnit71, (double) '#');
        boolean boolean76 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney75);
        org.joda.money.CurrencyUnit currencyUnit77 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money78 = org.joda.money.Money.zero(currencyUnit77);
        org.joda.money.Money money80 = money78.minusMajor((long) ' ');
        boolean boolean81 = bigMoney75.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money80);
        org.joda.money.Money money82 = money80.negated();
        org.joda.money.Money money84 = money82.minusMajor(1L);
        org.joda.money.Money money86 = money84.minusMajor(100L);
        int int87 = money61.compareTo((org.joda.money.BigMoneyProvider) money84);
        org.joda.money.Money money89 = money61.withAmount((double) 10);
        boolean boolean90 = money49.isSameCurrency((org.joda.money.BigMoneyProvider) money89);
        java.math.BigDecimal bigDecimal91 = money49.getAmountMinor();
        org.joda.money.BigMoney bigMoney92 = bigMoney20.multipliedBy(bigDecimal91);
        int int93 = bigMoney8.compareTo((org.joda.money.BigMoneyProvider) bigMoney92);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney8 and bigMoney10", (bigMoney8.compareTo(bigMoney10) == 0) == bigMoney8.equals(bigMoney10));
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test604");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        org.joda.money.BigMoney bigMoney7 = org.joda.money.BigMoney.ofMinor(currencyUnit1, (long) (byte) -1);
        int int8 = bigMoney7.getAmountMinorInt();
        org.joda.money.CurrencyUnit currencyUnit10 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money11 = org.joda.money.Money.zero(currencyUnit10);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit10);
        org.joda.money.BigMoney bigMoney14 = org.joda.money.BigMoney.of(currencyUnit10, (double) '#');
        boolean boolean15 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney14);
        int int16 = bigMoney14.getMinorPart();
        boolean boolean17 = bigMoney14.isPositive();
        org.joda.money.BigMoney bigMoney18 = org.joda.money.MoneyUtils.subtract(bigMoney7, bigMoney14);
        org.joda.money.Money money19 = bigMoney7.toMoney();
        org.joda.money.CurrencyUnit currencyUnit20 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money21 = org.joda.money.Money.zero(currencyUnit20);
        org.joda.money.Money money23 = money21.minusMajor((long) ' ');
        java.lang.String str24 = money23.toString();
        org.joda.money.Money money26 = money23.minusMajor((long) (short) 1);
        org.joda.money.CurrencyUnit currencyUnit27 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money28 = org.joda.money.Money.zero(currencyUnit27);
        org.joda.money.Money money30 = money28.minusMajor((long) ' ');
        org.joda.money.Money money32 = money28.plus((double) (byte) 10);
        org.joda.money.Money money33 = org.joda.money.MoneyUtils.max(money26, money32);
        org.joda.money.CurrencyUnit currencyUnit35 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money36 = org.joda.money.Money.zero(currencyUnit35);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit35);
        org.joda.money.BigMoney bigMoney39 = org.joda.money.BigMoney.of(currencyUnit35, (double) '#');
        boolean boolean40 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney39);
        org.joda.money.CurrencyUnit currencyUnit41 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money42 = org.joda.money.Money.zero(currencyUnit41);
        org.joda.money.Money money44 = money42.minusMajor((long) ' ');
        boolean boolean45 = bigMoney39.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money44);
        org.joda.money.Money money46 = money44.negated();
        org.joda.money.Money money48 = money46.minusMajor(1L);
        org.joda.money.Money money50 = money48.plusMinor((long) 35);
        org.joda.money.CurrencyUnit currencyUnit51 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money52 = org.joda.money.Money.zero(currencyUnit51);
        org.joda.money.Money money54 = money52.minusMajor((long) ' ');
        org.joda.money.Money money55 = org.joda.money.MoneyUtils.min(money50, money54);
        org.joda.money.Money money56 = money50.abs();
        org.joda.money.Money money57 = money26.plus(money50);
        org.joda.money.CurrencyUnit currencyUnit58 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money59 = org.joda.money.Money.zero(currencyUnit58);
        org.joda.money.Money money61 = money59.minusMajor((long) ' ');
        java.math.BigDecimal bigDecimal62 = money59.getAmountMinor();
        org.joda.money.Money money63 = money57.minus(bigDecimal62);
        org.joda.money.BigMoney bigMoney64 = bigMoney7.multipliedBy(bigDecimal62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney7 and money19", (bigMoney7.compareTo(money19) == 0) == bigMoney7.equals(money19));
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test605");
        org.joda.money.CurrencyUnit currencyUnit0 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean1 = currencyUnit0.isPseudoCurrency();
        boolean boolean2 = currencyUnit0.isPseudoCurrency();
        org.joda.money.BigMoney bigMoney3 = org.joda.money.BigMoney.zero(currencyUnit0);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit0, (double) (short) 1);
        org.joda.money.BigMoney bigMoney7 = org.joda.money.BigMoney.of(currencyUnit0, (double) (-6900L));
        org.joda.money.CurrencyUnit currencyUnit9 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money10 = org.joda.money.Money.zero(currencyUnit9);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit9);
        org.joda.money.BigMoney bigMoney13 = org.joda.money.BigMoney.of(currencyUnit9, (double) '#');
        java.math.BigDecimal bigDecimal14 = bigMoney13.getAmountMajor();
        org.joda.money.BigMoney bigMoney15 = bigMoney13.abs();
        org.joda.money.CurrencyUnit currencyUnit17 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money18 = org.joda.money.Money.zero(currencyUnit17);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit17);
        org.joda.money.BigMoney bigMoney21 = org.joda.money.BigMoney.of(currencyUnit17, (double) '#');
        boolean boolean22 = bigMoney21.isPositive();
        org.joda.money.BigMoney bigMoney23 = bigMoney21.toBigMoney();
        org.joda.money.BigMoney bigMoney24 = org.joda.money.MoneyUtils.max(bigMoney15, bigMoney21);
        org.joda.money.CurrencyUnit currencyUnit25 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean26 = currencyUnit25.isPseudoCurrency();
        org.joda.money.Money money28 = org.joda.money.Money.ofMajor(currencyUnit25, (-1L));
        int int29 = currencyUnit25.getDecimalPlaces();
        org.joda.money.BigMoney bigMoney30 = bigMoney15.withCurrencyUnit(currencyUnit25);
        org.joda.money.BigMoney bigMoney32 = org.joda.money.BigMoney.ofMinor(currencyUnit25, (long) (byte) -1);
        org.joda.money.CurrencyUnit currencyUnit34 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money35 = org.joda.money.Money.zero(currencyUnit34);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit34);
        org.joda.money.BigMoney bigMoney38 = org.joda.money.BigMoney.of(currencyUnit34, (double) '#');
        boolean boolean39 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney38);
        org.joda.money.CurrencyUnit currencyUnit40 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money41 = org.joda.money.Money.zero(currencyUnit40);
        org.joda.money.Money money43 = money41.minusMajor((long) ' ');
        boolean boolean44 = bigMoney38.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money43);
        org.joda.money.Money money46 = money43.multipliedBy((long) (byte) 10);
        org.joda.money.CurrencyUnit currencyUnit48 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money49 = org.joda.money.Money.zero(currencyUnit48);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit48);
        org.joda.money.BigMoney bigMoney52 = org.joda.money.BigMoney.of(currencyUnit48, (double) '#');
        boolean boolean53 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney52);
        org.joda.money.CurrencyUnit currencyUnit54 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money55 = org.joda.money.Money.zero(currencyUnit54);
        org.joda.money.Money money57 = money55.minusMajor((long) ' ');
        boolean boolean58 = bigMoney52.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money57);
        org.joda.money.Money money59 = money57.negated();
        boolean boolean60 = money59.isPositiveOrZero();
        boolean boolean61 = money46.isLessThan((org.joda.money.BigMoneyProvider) money59);
        org.joda.money.CurrencyUnit currencyUnit62 = money59.getCurrencyUnit();
        org.joda.money.CurrencyUnit currencyUnit64 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money65 = org.joda.money.Money.zero(currencyUnit64);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit64);
        org.joda.money.BigMoney bigMoney68 = org.joda.money.BigMoney.of(currencyUnit64, (double) '#');
        boolean boolean69 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney68);
        org.joda.money.CurrencyUnit currencyUnit70 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money71 = org.joda.money.Money.zero(currencyUnit70);
        org.joda.money.Money money73 = money71.minusMajor((long) ' ');
        boolean boolean74 = bigMoney68.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money73);
        org.joda.money.Money money75 = money73.negated();
        org.joda.money.Money money77 = money75.minusMajor(1L);
        org.joda.money.CurrencyUnit currencyUnit78 = money75.getCurrencyUnit();
        java.util.Currency currency79 = currencyUnit78.toCurrency();
        org.joda.money.CurrencyUnit currencyUnit81 = org.joda.money.CurrencyUnit.of("EUR");
        org.joda.money.BigMoney bigMoney83 = org.joda.money.BigMoney.ofMinor(currencyUnit81, (long) '0');
        java.lang.String str84 = currencyUnit81.toString();
        int int85 = currencyUnit78.compareTo(currencyUnit81);
        int int86 = currencyUnit62.compareTo(currencyUnit81);
        org.joda.money.BigMoney bigMoney88 = org.joda.money.BigMoney.of(currencyUnit62, (double) 10);
        org.joda.money.CurrencyUnit currencyUnit89 = bigMoney88.getCurrencyUnit();
        java.lang.String str90 = currencyUnit89.getSymbol();
        org.joda.money.CurrencyMismatchException currencyMismatchException91 = new org.joda.money.CurrencyMismatchException(currencyUnit25, currencyUnit89);
        boolean boolean92 = currencyUnit0.equals((java.lang.Object) currencyUnit25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney3 and money10", (bigMoney3.compareTo(money10) == 0) == bigMoney3.equals(money10));
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test606");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        java.math.BigDecimal bigDecimal6 = bigMoney5.getAmountMajor();
        org.joda.money.BigMoney bigMoney7 = bigMoney5.abs();
        org.joda.money.CurrencyUnit currencyUnit9 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money10 = org.joda.money.Money.zero(currencyUnit9);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit9);
        org.joda.money.BigMoney bigMoney13 = org.joda.money.BigMoney.of(currencyUnit9, (double) '#');
        boolean boolean14 = bigMoney13.isPositive();
        org.joda.money.BigMoney bigMoney15 = bigMoney13.toBigMoney();
        org.joda.money.BigMoney bigMoney16 = org.joda.money.MoneyUtils.max(bigMoney7, bigMoney13);
        org.joda.money.CurrencyUnit currencyUnit17 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean18 = currencyUnit17.isPseudoCurrency();
        org.joda.money.Money money20 = org.joda.money.Money.ofMajor(currencyUnit17, (-1L));
        int int21 = currencyUnit17.getDecimalPlaces();
        org.joda.money.BigMoney bigMoney22 = bigMoney7.withCurrencyUnit(currencyUnit17);
        org.joda.money.Money money24 = org.joda.money.Money.ofMinor(currencyUnit17, (long) 35);
        org.joda.money.BigMoney bigMoney26 = org.joda.money.BigMoney.ofMinor(currencyUnit17, (long) (byte) 0);
        org.joda.money.BigMoney bigMoney27 = org.joda.money.BigMoney.zero(currencyUnit17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money2 and bigMoney26", (money2.compareTo(bigMoney26) == 0) == money2.equals(bigMoney26));
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test607");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.Money money5 = org.joda.money.Money.ofMajor(currencyUnit1, (long) (byte) 10);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit7);
        org.joda.money.BigMoney bigMoney11 = org.joda.money.BigMoney.of(currencyUnit7, (double) '#');
        boolean boolean12 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney11);
        org.joda.money.CurrencyUnit currencyUnit13 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money14 = org.joda.money.Money.zero(currencyUnit13);
        org.joda.money.Money money16 = money14.minusMajor((long) ' ');
        boolean boolean17 = bigMoney11.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money16);
        org.joda.money.CurrencyUnit currencyUnit19 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money20 = org.joda.money.Money.zero(currencyUnit19);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit19);
        org.joda.money.BigMoney bigMoney23 = org.joda.money.BigMoney.of(currencyUnit19, (double) '#');
        org.joda.money.Money money24 = money16.withCurrencyUnit(currencyUnit19);
        org.joda.money.CurrencyUnit currencyUnit26 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money27 = org.joda.money.Money.zero(currencyUnit26);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit26);
        org.joda.money.BigMoney bigMoney30 = org.joda.money.BigMoney.of(currencyUnit26, (double) '#');
        boolean boolean31 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney30);
        org.joda.money.CurrencyUnit currencyUnit32 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money33 = org.joda.money.Money.zero(currencyUnit32);
        org.joda.money.Money money35 = money33.minusMajor((long) ' ');
        boolean boolean36 = bigMoney30.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money35);
        org.joda.money.Money money37 = money35.negated();
        org.joda.money.CurrencyUnit currencyUnit39 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money40 = org.joda.money.Money.zero(currencyUnit39);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit39);
        org.joda.money.BigMoney bigMoney43 = org.joda.money.BigMoney.of(currencyUnit39, (double) '#');
        boolean boolean44 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney43);
        org.joda.money.CurrencyUnit currencyUnit45 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money46 = org.joda.money.Money.zero(currencyUnit45);
        org.joda.money.Money money48 = money46.minusMajor((long) ' ');
        boolean boolean49 = bigMoney43.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money48);
        org.joda.money.Money money50 = money48.negated();
        org.joda.money.Money money51 = money35.minus(money50);
        org.joda.money.CurrencyUnit currencyUnit53 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money54 = org.joda.money.Money.zero(currencyUnit53);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit53);
        org.joda.money.BigMoney bigMoney57 = org.joda.money.BigMoney.of(currencyUnit53, (double) '#');
        boolean boolean58 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney57);
        org.joda.money.CurrencyUnit currencyUnit59 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money60 = org.joda.money.Money.zero(currencyUnit59);
        org.joda.money.Money money62 = money60.minusMajor((long) ' ');
        boolean boolean63 = bigMoney57.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money62);
        int int64 = bigMoney57.getAmountMajorInt();
        boolean boolean65 = money50.isLessThanOrEqual((org.joda.money.BigMoneyProvider) bigMoney57);
        java.math.BigDecimal bigDecimal66 = money50.getAmountMajor();
        org.joda.money.Money money67 = org.joda.money.Money.of(currencyUnit19, bigDecimal66);
        org.joda.money.BigMoney bigMoney68 = org.joda.money.BigMoney.of(currencyUnit1, bigDecimal66);
        org.joda.money.BigMoney bigMoney71 = org.joda.money.BigMoney.ofScale(currencyUnit1, (long) 35, 2);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money37 and bigMoney68", (money37.compareTo(bigMoney68) == 0) == money37.equals(bigMoney68));
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test608");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.Money money13 = money10.multipliedBy((long) (byte) 10);
        boolean boolean14 = money13.isNegativeOrZero();
        boolean boolean16 = money13.equals((java.lang.Object) 10);
        org.joda.money.BigMoney bigMoney17 = money13.toBigMoney();
        int int18 = bigMoney17.getScale();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money13 and bigMoney17", (money13.compareTo(bigMoney17) == 0) == money13.equals(bigMoney17));
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test609");
        org.joda.money.CurrencyUnit currencyUnit2 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money3 = org.joda.money.Money.zero(currencyUnit2);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit2);
        org.joda.money.BigMoney bigMoney6 = org.joda.money.BigMoney.of(currencyUnit2, (double) '#');
        boolean boolean7 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney6);
        org.joda.money.CurrencyUnit currencyUnit8 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money9 = org.joda.money.Money.zero(currencyUnit8);
        org.joda.money.Money money11 = money9.minusMajor((long) ' ');
        boolean boolean12 = bigMoney6.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money11);
        org.joda.money.Money money13 = money11.negated();
        org.joda.money.Money money15 = money13.minusMajor(1L);
        org.joda.money.CurrencyUnit currencyUnit16 = money13.getCurrencyUnit();
        java.lang.String str17 = currencyUnit16.toString();
        org.joda.money.CurrencyUnit currencyUnit18 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money19 = org.joda.money.Money.zero(currencyUnit18);
        org.joda.money.BigMoney bigMoney21 = org.joda.money.BigMoney.ofMajor(currencyUnit18, (long) 'a');
        java.util.Set<java.lang.String> strSet22 = currencyUnit18.getCountryCodes();
        int int23 = currencyUnit18.getDecimalPlaces();
        org.joda.money.CurrencyMismatchException currencyMismatchException24 = new org.joda.money.CurrencyMismatchException(currencyUnit16, currencyUnit18);
        org.joda.money.CurrencyUnit currencyUnit25 = currencyMismatchException24.getSecondCurrency();
        org.joda.money.CurrencyUnit currencyUnit26 = currencyMismatchException24.getFirstCurrency();
        org.joda.money.CurrencyUnit currencyUnit27 = currencyMismatchException24.getSecondCurrency();
        org.joda.money.format.MoneyFormatException moneyFormatException28 = new org.joda.money.format.MoneyFormatException("MoneyAmountStyle['0','+','-',',','NONE,.','3',false',false]", (java.lang.Throwable) currencyMismatchException24);
        org.joda.money.CurrencyUnit currencyUnit29 = currencyMismatchException24.getSecondCurrency();
        org.joda.money.BigMoney bigMoney31 = org.joda.money.BigMoney.zero(currencyUnit29, 0);
        java.lang.String str32 = currencyUnit29.getCode();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money3 and bigMoney31", (money3.compareTo(bigMoney31) == 0) == money3.equals(bigMoney31));
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test610");
        java.util.List<java.lang.String> strList3 = org.joda.money.CurrencyUnit.registeredCountries();
        org.joda.money.CurrencyUnit currencyUnit5 = org.joda.money.CurrencyUnit.registerCurrency("EUR", 35, 1, strList3, true);
        org.joda.money.Money money6 = org.joda.money.Money.zero(currencyUnit5);
        org.joda.money.CurrencyUnit currencyUnit8 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money9 = org.joda.money.Money.zero(currencyUnit8);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit8);
        org.joda.money.BigMoney bigMoney12 = org.joda.money.BigMoney.of(currencyUnit8, (double) '#');
        boolean boolean13 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney12);
        org.joda.money.CurrencyUnit currencyUnit14 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money15 = org.joda.money.Money.zero(currencyUnit14);
        org.joda.money.Money money17 = money15.minusMajor((long) ' ');
        boolean boolean18 = bigMoney12.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money17);
        org.joda.money.Money money19 = money17.negated();
        boolean boolean20 = money19.isPositiveOrZero();
        org.joda.money.CurrencyUnit currencyUnit22 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money23 = org.joda.money.Money.zero(currencyUnit22);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit22);
        org.joda.money.BigMoney bigMoney26 = org.joda.money.BigMoney.of(currencyUnit22, (double) '#');
        boolean boolean27 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney26);
        org.joda.money.CurrencyUnit currencyUnit28 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money29 = org.joda.money.Money.zero(currencyUnit28);
        org.joda.money.Money money31 = money29.minusMajor((long) ' ');
        boolean boolean32 = bigMoney26.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money31);
        int int33 = bigMoney26.getAmountMajorInt();
        org.joda.money.BigMoney bigMoney34 = bigMoney26.negated();
        org.joda.money.CurrencyUnit currencyUnit35 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money36 = org.joda.money.Money.zero(currencyUnit35);
        org.joda.money.Money money38 = money36.minusMajor((long) ' ');
        int int39 = money36.getAmountMajorInt();
        boolean boolean40 = money36.isZero();
        org.joda.money.Money money42 = money36.plusMinor(0L);
        boolean boolean43 = bigMoney34.isSameCurrency((org.joda.money.BigMoneyProvider) money42);
        java.math.BigDecimal bigDecimal44 = money42.getAmountMajor();
        org.joda.money.Money money46 = money42.minus((double) '4');
        boolean boolean47 = money19.equals((java.lang.Object) money42);
        org.joda.money.Money money48 = org.joda.money.MoneyUtils.add(money6, money19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money6 and money9", (money6.compareTo(money9) == 0) == money6.equals(money9));
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test611");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.Money money13 = money10.multipliedBy((long) (byte) 10);
        org.joda.money.Money money15 = money13.minusMajor((long) (byte) 10);
        org.joda.money.CurrencyUnit currencyUnit17 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money18 = org.joda.money.Money.zero(currencyUnit17);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit17);
        org.joda.money.BigMoney bigMoney21 = org.joda.money.BigMoney.of(currencyUnit17, (double) '#');
        boolean boolean22 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney21);
        org.joda.money.CurrencyUnit currencyUnit23 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money24 = org.joda.money.Money.zero(currencyUnit23);
        org.joda.money.Money money26 = money24.minusMajor((long) ' ');
        boolean boolean27 = bigMoney21.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money26);
        org.joda.money.Money money28 = money26.negated();
        org.joda.money.Money money30 = money28.minusMajor(1L);
        org.joda.money.Money money32 = money30.plusMinor((long) 35);
        org.joda.money.CurrencyUnit currencyUnit33 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money34 = org.joda.money.Money.zero(currencyUnit33);
        org.joda.money.Money money36 = money34.minusMajor((long) ' ');
        org.joda.money.Money money37 = org.joda.money.MoneyUtils.min(money32, money36);
        boolean boolean38 = org.joda.money.MoneyUtils.isPositive((org.joda.money.BigMoneyProvider) money37);
        org.joda.money.Money[] moneyArray39 = new org.joda.money.Money[] { money15, money37 };
        org.joda.money.Money money40 = org.joda.money.Money.total(moneyArray39);
        org.joda.money.BigMoney bigMoney41 = money40.toBigMoney();
        boolean boolean42 = bigMoney41.isPositive();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money40 and bigMoney41", (money40.compareTo(bigMoney41) == 0) == money40.equals(bigMoney41));
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test612");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.CurrencyUnit currencyUnit13 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money14 = org.joda.money.Money.zero(currencyUnit13);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit13);
        org.joda.money.BigMoney bigMoney17 = org.joda.money.BigMoney.of(currencyUnit13, (double) '#');
        org.joda.money.Money money18 = money10.withCurrencyUnit(currencyUnit13);
        org.joda.money.CurrencyUnit currencyUnit20 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money21 = org.joda.money.Money.zero(currencyUnit20);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit20);
        org.joda.money.BigMoney bigMoney24 = org.joda.money.BigMoney.of(currencyUnit20, (double) '#');
        boolean boolean25 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney24);
        org.joda.money.CurrencyUnit currencyUnit26 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money27 = org.joda.money.Money.zero(currencyUnit26);
        org.joda.money.Money money29 = money27.minusMajor((long) ' ');
        boolean boolean30 = bigMoney24.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money29);
        org.joda.money.Money money31 = money29.negated();
        org.joda.money.CurrencyUnit currencyUnit33 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money34 = org.joda.money.Money.zero(currencyUnit33);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit33);
        org.joda.money.BigMoney bigMoney37 = org.joda.money.BigMoney.of(currencyUnit33, (double) '#');
        boolean boolean38 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney37);
        org.joda.money.CurrencyUnit currencyUnit39 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money40 = org.joda.money.Money.zero(currencyUnit39);
        org.joda.money.Money money42 = money40.minusMajor((long) ' ');
        boolean boolean43 = bigMoney37.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money42);
        org.joda.money.Money money44 = money42.negated();
        org.joda.money.Money money45 = money29.minus(money44);
        org.joda.money.CurrencyUnit currencyUnit47 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money48 = org.joda.money.Money.zero(currencyUnit47);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit47);
        org.joda.money.BigMoney bigMoney51 = org.joda.money.BigMoney.of(currencyUnit47, (double) '#');
        boolean boolean52 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney51);
        org.joda.money.CurrencyUnit currencyUnit53 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money54 = org.joda.money.Money.zero(currencyUnit53);
        org.joda.money.Money money56 = money54.minusMajor((long) ' ');
        boolean boolean57 = bigMoney51.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money56);
        int int58 = bigMoney51.getAmountMajorInt();
        boolean boolean59 = money44.isLessThanOrEqual((org.joda.money.BigMoneyProvider) bigMoney51);
        java.math.BigDecimal bigDecimal60 = money44.getAmountMajor();
        org.joda.money.Money money61 = org.joda.money.Money.of(currencyUnit13, bigDecimal60);
        org.joda.money.CurrencyUnit currencyUnit63 = org.joda.money.CurrencyUnit.of("EUR");
        org.joda.money.BigMoney bigMoney65 = org.joda.money.BigMoney.ofMinor(currencyUnit63, (long) '0');
        java.lang.String str66 = currencyUnit63.toString();
        java.lang.String str67 = currencyUnit63.getSymbol();
        boolean boolean68 = currencyUnit13.equals((java.lang.Object) currencyUnit63);
        org.joda.money.CurrencyUnit currencyUnit70 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money71 = org.joda.money.Money.zero(currencyUnit70);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit70);
        org.joda.money.BigMoney bigMoney74 = org.joda.money.BigMoney.of(currencyUnit70, (double) '#');
        java.math.BigDecimal bigDecimal75 = bigMoney74.getAmountMajor();
        org.joda.money.Money money76 = org.joda.money.Money.of(currencyUnit63, bigDecimal75);
        int int77 = currencyUnit63.getDecimalPlaces();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney5 and money76", (bigMoney5.compareTo(money76) == 0) == bigMoney5.equals(money76));
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test613");
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder0 = new org.joda.money.format.MoneyFormatterBuilder();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder1 = moneyFormatterBuilder0.appendCurrencyNumeric3Code();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder2 = moneyFormatterBuilder0.appendCurrencyCode();
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle3 = org.joda.money.format.MoneyAmountStyle.ASCII_DECIMAL_POINT_GROUP3_SPACE;
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder4 = moneyFormatterBuilder2.appendAmount(moneyAmountStyle3);
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder5 = new org.joda.money.format.MoneyFormatterBuilder();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder6 = moneyFormatterBuilder5.appendCurrencyNumeric3Code();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder7 = moneyFormatterBuilder5.appendCurrencyCode();
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle8 = org.joda.money.format.MoneyAmountStyle.ASCII_DECIMAL_POINT_GROUP3_SPACE;
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder9 = moneyFormatterBuilder7.appendAmount(moneyAmountStyle8);
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle10 = org.joda.money.format.MoneyAmountStyle.ASCII_DECIMAL_COMMA_NO_GROUPING;
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle12 = moneyAmountStyle10.withDecimalPointCharacter((java.lang.Character) '4');
        boolean boolean13 = moneyAmountStyle12.isAbsValue();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder14 = moneyFormatterBuilder7.appendAmount(moneyAmountStyle12);
        org.joda.money.format.MoneyFormatter moneyFormatter15 = moneyFormatterBuilder14.toFormatter();
        java.util.Locale locale16 = moneyFormatter15.getLocale();
        org.joda.money.format.MoneyFormatter moneyFormatter17 = moneyFormatterBuilder2.toFormatter(locale16);
        org.joda.money.CurrencyUnit currencyUnit18 = org.joda.money.CurrencyUnit.of(locale16);
        org.joda.money.Money money20 = org.joda.money.Money.ofMinor(currencyUnit18, 0L);
        org.joda.money.CurrencyUnit currencyUnit21 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money22 = org.joda.money.Money.zero(currencyUnit21);
        org.joda.money.BigMoney bigMoney24 = org.joda.money.BigMoney.ofMajor(currencyUnit21, (long) 'a');
        java.util.Set<java.lang.String> strSet25 = currencyUnit21.getCountryCodes();
        org.joda.money.CurrencyUnit currencyUnit27 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money28 = org.joda.money.Money.zero(currencyUnit27);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit27);
        org.joda.money.BigMoney bigMoney31 = org.joda.money.BigMoney.of(currencyUnit27, (double) '#');
        boolean boolean32 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney31);
        org.joda.money.CurrencyUnit currencyUnit33 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money34 = org.joda.money.Money.zero(currencyUnit33);
        org.joda.money.Money money36 = money34.minusMajor((long) ' ');
        boolean boolean37 = bigMoney31.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money36);
        org.joda.money.CurrencyUnit currencyUnit39 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money40 = org.joda.money.Money.zero(currencyUnit39);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit39);
        org.joda.money.BigMoney bigMoney43 = org.joda.money.BigMoney.of(currencyUnit39, (double) '#');
        org.joda.money.Money money44 = money36.withCurrencyUnit(currencyUnit39);
        org.joda.money.CurrencyUnit currencyUnit46 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money47 = org.joda.money.Money.zero(currencyUnit46);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit46);
        org.joda.money.BigMoney bigMoney50 = org.joda.money.BigMoney.of(currencyUnit46, (double) '#');
        boolean boolean51 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney50);
        org.joda.money.CurrencyUnit currencyUnit52 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money53 = org.joda.money.Money.zero(currencyUnit52);
        org.joda.money.Money money55 = money53.minusMajor((long) ' ');
        boolean boolean56 = bigMoney50.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money55);
        org.joda.money.Money money57 = money55.negated();
        org.joda.money.Money money59 = money57.minusMajor(1L);
        org.joda.money.Money money61 = money59.minusMajor(100L);
        int int62 = money36.compareTo((org.joda.money.BigMoneyProvider) money59);
        boolean boolean63 = money36.isNegativeOrZero();
        java.math.BigDecimal bigDecimal64 = money36.getAmountMajor();
        org.joda.money.BigMoney bigMoney65 = org.joda.money.BigMoney.of(currencyUnit21, bigDecimal64);
        org.joda.money.BigMoney bigMoney67 = org.joda.money.BigMoney.ofScale(currencyUnit18, bigDecimal64, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money20 and money22", (money20.compareTo(money22) == 0) == money20.equals(money22));
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test614");
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle0 = org.joda.money.format.MoneyAmountStyle.ASCII_DECIMAL_COMMA_NO_GROUPING;
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle2 = moneyAmountStyle0.withDecimalPointCharacter((java.lang.Character) '4');
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle4 = moneyAmountStyle2.withDecimalPointCharacter((java.lang.Character) ' ');
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle5 = org.joda.money.format.MoneyAmountStyle.ASCII_DECIMAL_COMMA_GROUP3_DOT;
        org.joda.money.format.GroupingStyle groupingStyle6 = org.joda.money.format.GroupingStyle.FULL;
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle7 = moneyAmountStyle5.withGroupingStyle(groupingStyle6);
        boolean boolean8 = moneyAmountStyle2.equals((java.lang.Object) moneyAmountStyle5);
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle10 = moneyAmountStyle5.withGroupingCharacter((java.lang.Character) 'a');
        org.joda.money.CurrencyUnit currencyUnit12 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money13 = org.joda.money.Money.zero(currencyUnit12);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit12);
        org.joda.money.BigMoney bigMoney16 = org.joda.money.BigMoney.of(currencyUnit12, (double) '#');
        boolean boolean17 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney16);
        org.joda.money.CurrencyUnit currencyUnit18 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money19 = org.joda.money.Money.zero(currencyUnit18);
        org.joda.money.Money money21 = money19.minusMajor((long) ' ');
        boolean boolean22 = bigMoney16.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money21);
        org.joda.money.Money money23 = money21.negated();
        org.joda.money.Money money25 = money23.minusMajor(1L);
        org.joda.money.CurrencyUnit currencyUnit26 = money23.getCurrencyUnit();
        boolean boolean27 = moneyAmountStyle10.equals((java.lang.Object) currencyUnit26);
        org.joda.money.BigMoney bigMoney29 = org.joda.money.BigMoney.zero(currencyUnit26, (int) (byte) -1);
        org.joda.money.CurrencyUnit currencyUnit31 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money32 = org.joda.money.Money.zero(currencyUnit31);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit31);
        org.joda.money.Money money35 = org.joda.money.Money.ofMajor(currencyUnit31, (long) (byte) 10);
        int int36 = currencyUnit31.getDecimalPlaces();
        org.joda.money.CurrencyUnit currencyUnit38 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money39 = org.joda.money.Money.zero(currencyUnit38);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit38);
        org.joda.money.BigMoney bigMoney42 = org.joda.money.BigMoney.of(currencyUnit38, (double) '#');
        boolean boolean43 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney42);
        org.joda.money.CurrencyUnit currencyUnit44 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money45 = org.joda.money.Money.zero(currencyUnit44);
        org.joda.money.Money money47 = money45.minusMajor((long) ' ');
        boolean boolean48 = bigMoney42.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money47);
        org.joda.money.Money money50 = money47.multipliedBy((long) (byte) 10);
        org.joda.money.Money money52 = money50.minusMajor((long) (byte) 10);
        org.joda.money.CurrencyUnit currencyUnit54 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money55 = org.joda.money.Money.zero(currencyUnit54);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit54);
        org.joda.money.BigMoney bigMoney58 = org.joda.money.BigMoney.of(currencyUnit54, (double) '#');
        boolean boolean59 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney58);
        org.joda.money.CurrencyUnit currencyUnit60 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money61 = org.joda.money.Money.zero(currencyUnit60);
        org.joda.money.Money money63 = money61.minusMajor((long) ' ');
        boolean boolean64 = bigMoney58.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money63);
        org.joda.money.Money money65 = money63.negated();
        org.joda.money.Money money67 = money65.minusMajor(1L);
        org.joda.money.Money money69 = money67.plusMinor((long) 35);
        org.joda.money.CurrencyUnit currencyUnit70 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money71 = org.joda.money.Money.zero(currencyUnit70);
        org.joda.money.Money money73 = money71.minusMajor((long) ' ');
        org.joda.money.Money money74 = org.joda.money.MoneyUtils.min(money69, money73);
        boolean boolean75 = org.joda.money.MoneyUtils.isPositive((org.joda.money.BigMoneyProvider) money74);
        org.joda.money.Money[] moneyArray76 = new org.joda.money.Money[] { money52, money74 };
        org.joda.money.Money money77 = org.joda.money.Money.total(moneyArray76);
        org.joda.money.Money money78 = org.joda.money.Money.total(currencyUnit31, moneyArray76);
        org.joda.money.Money money79 = org.joda.money.Money.total(moneyArray76);
        org.joda.money.Money money80 = org.joda.money.Money.total(currencyUnit26, moneyArray76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money13 and bigMoney29", (money13.compareTo(bigMoney29) == 0) == money13.equals(bigMoney29));
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test615");
        org.joda.money.CurrencyUnit currencyUnit4 = org.joda.money.CurrencyUnit.registerCurrency("EUR", (int) '#', (int) (short) -1, true);
        org.joda.money.CurrencyUnit currencyUnit5 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money6 = org.joda.money.Money.zero(currencyUnit5);
        org.joda.money.CurrencyUnit currencyUnit8 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money9 = org.joda.money.Money.zero(currencyUnit8);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit8);
        org.joda.money.BigMoney bigMoney12 = org.joda.money.BigMoney.of(currencyUnit8, (double) '#');
        boolean boolean13 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney12);
        org.joda.money.CurrencyUnit currencyUnit14 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money15 = org.joda.money.Money.zero(currencyUnit14);
        org.joda.money.Money money17 = money15.minusMajor((long) ' ');
        boolean boolean18 = bigMoney12.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money17);
        org.joda.money.CurrencyUnit currencyUnit20 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money21 = org.joda.money.Money.zero(currencyUnit20);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit20);
        org.joda.money.BigMoney bigMoney24 = org.joda.money.BigMoney.of(currencyUnit20, (double) '#');
        boolean boolean25 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney24);
        org.joda.money.CurrencyUnit currencyUnit26 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money27 = org.joda.money.Money.zero(currencyUnit26);
        org.joda.money.Money money29 = money27.minusMajor((long) ' ');
        boolean boolean30 = bigMoney24.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money29);
        org.joda.money.Money money31 = money29.negated();
        org.joda.money.Money money33 = money31.minusMajor(1L);
        org.joda.money.Money money35 = money33.minusMajor(100L);
        org.joda.money.CurrencyUnit currencyUnit37 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money38 = org.joda.money.Money.zero(currencyUnit37);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit37);
        org.joda.money.BigMoney bigMoney41 = org.joda.money.BigMoney.of(currencyUnit37, (double) '#');
        boolean boolean42 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney41);
        org.joda.money.CurrencyUnit currencyUnit43 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money44 = org.joda.money.Money.zero(currencyUnit43);
        org.joda.money.Money money46 = money44.minusMajor((long) ' ');
        boolean boolean47 = bigMoney41.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money46);
        org.joda.money.Money money48 = money46.negated();
        org.joda.money.CurrencyUnit currencyUnit50 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money51 = org.joda.money.Money.zero(currencyUnit50);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit50);
        org.joda.money.BigMoney bigMoney54 = org.joda.money.BigMoney.of(currencyUnit50, (double) '#');
        boolean boolean55 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney54);
        org.joda.money.CurrencyUnit currencyUnit56 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money57 = org.joda.money.Money.zero(currencyUnit56);
        org.joda.money.Money money59 = money57.minusMajor((long) ' ');
        boolean boolean60 = bigMoney54.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money59);
        org.joda.money.Money money61 = money59.negated();
        org.joda.money.Money money62 = money46.minus(money61);
        org.joda.money.Money[] moneyArray63 = new org.joda.money.Money[] { money17, money35, money46 };
        org.joda.money.Money money64 = org.joda.money.Money.total(moneyArray63);
        org.joda.money.Money money65 = org.joda.money.Money.total(moneyArray63);
        org.joda.money.Money money66 = org.joda.money.Money.total(currencyUnit5, moneyArray63);
        org.joda.money.BigMoney bigMoney67 = org.joda.money.BigMoney.total(currencyUnit4, (org.joda.money.BigMoneyProvider[]) moneyArray63);
        boolean boolean68 = org.joda.money.MoneyUtils.isZero((org.joda.money.BigMoneyProvider) bigMoney67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money64 and bigMoney67", (money64.compareTo(bigMoney67) == 0) == money64.equals(bigMoney67));
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test616");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.Money money12 = money10.negated();
        boolean boolean13 = org.joda.money.MoneyUtils.isPositiveOrZero((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.BigMoney bigMoney14 = money10.toBigMoney();
        org.joda.money.BigMoney bigMoney16 = bigMoney14.minusMinor((long) (-1200));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money10 and bigMoney14", (money10.compareTo(bigMoney14) == 0) == money10.equals(bigMoney14));
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test617");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.Money money12 = money10.negated();
        org.joda.money.Money money14 = money12.minusMajor(1L);
        org.joda.money.CurrencyUnit currencyUnit15 = money12.getCurrencyUnit();
        org.joda.money.BigMoney bigMoney18 = org.joda.money.BigMoney.ofScale(currencyUnit15, 10L, (int) (short) 0);
        org.joda.money.CurrencyUnit currencyUnit19 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean20 = currencyUnit19.isPseudoCurrency();
        boolean boolean21 = currencyUnit19.isPseudoCurrency();
        org.joda.money.CurrencyUnit currencyUnit23 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money24 = org.joda.money.Money.zero(currencyUnit23);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit23);
        org.joda.money.BigMoney bigMoney27 = org.joda.money.BigMoney.of(currencyUnit23, (double) '#');
        java.math.BigDecimal bigDecimal28 = bigMoney27.getAmountMajor();
        org.joda.money.BigMoney bigMoney29 = org.joda.money.BigMoney.of(currencyUnit19, bigDecimal28);
        org.joda.money.Money money30 = org.joda.money.Money.of(currencyUnit15, bigDecimal28);
        org.joda.money.CurrencyUnit currencyUnit32 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money33 = org.joda.money.Money.zero(currencyUnit32);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit32);
        org.joda.money.BigMoney bigMoney36 = org.joda.money.BigMoney.of(currencyUnit32, (double) '#');
        boolean boolean37 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney36);
        org.joda.money.CurrencyUnit currencyUnit38 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money39 = org.joda.money.Money.zero(currencyUnit38);
        org.joda.money.Money money41 = money39.minusMajor((long) ' ');
        boolean boolean42 = bigMoney36.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money41);
        org.joda.money.CurrencyUnit currencyUnit44 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money45 = org.joda.money.Money.zero(currencyUnit44);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit44);
        org.joda.money.BigMoney bigMoney48 = org.joda.money.BigMoney.of(currencyUnit44, (double) '#');
        org.joda.money.Money money49 = money41.withCurrencyUnit(currencyUnit44);
        org.joda.money.BigMoney bigMoney51 = org.joda.money.BigMoney.ofMajor(currencyUnit44, (-1L));
        org.joda.money.Money money52 = org.joda.money.Money.zero(currencyUnit44);
        boolean boolean53 = money52.isPositiveOrZero();
        org.joda.money.Money money54 = org.joda.money.Money.of((org.joda.money.BigMoneyProvider) money52);
        org.joda.money.Money money55 = money30.minus(money52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney5 and money55", (bigMoney5.compareTo(money55) == 0) == bigMoney5.equals(money55));
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test618");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.BigMoney bigMoney13 = bigMoney5.multipliedBy((long) (byte) -1);
        org.joda.money.CurrencyUnit currencyUnit15 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money16 = org.joda.money.Money.zero(currencyUnit15);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit15);
        org.joda.money.BigMoney bigMoney19 = org.joda.money.BigMoney.of(currencyUnit15, (double) '#');
        boolean boolean20 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney19);
        org.joda.money.CurrencyUnit currencyUnit21 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money22 = org.joda.money.Money.zero(currencyUnit21);
        org.joda.money.Money money24 = money22.minusMajor((long) ' ');
        boolean boolean25 = bigMoney19.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money24);
        org.joda.money.Money money26 = money24.negated();
        org.joda.money.Money money28 = money26.minusMajor(1L);
        org.joda.money.CurrencyUnit currencyUnit29 = money26.getCurrencyUnit();
        java.lang.String str30 = currencyUnit29.toString();
        org.joda.money.CurrencyUnit currencyUnit31 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money32 = org.joda.money.Money.zero(currencyUnit31);
        org.joda.money.BigMoney bigMoney34 = org.joda.money.BigMoney.ofMajor(currencyUnit31, (long) 'a');
        java.util.Set<java.lang.String> strSet35 = currencyUnit31.getCountryCodes();
        int int36 = currencyUnit31.getDecimalPlaces();
        org.joda.money.CurrencyMismatchException currencyMismatchException37 = new org.joda.money.CurrencyMismatchException(currencyUnit29, currencyUnit31);
        org.joda.money.CurrencyUnit currencyUnit38 = currencyMismatchException37.getFirstCurrency();
        org.joda.money.BigMoney bigMoney40 = org.joda.money.BigMoney.zero(currencyUnit38, (int) (short) 1);
        boolean boolean41 = bigMoney5.isLessThan((org.joda.money.BigMoneyProvider) bigMoney40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money2 and bigMoney40", (money2.compareTo(bigMoney40) == 0) == money2.equals(bigMoney40));
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test619");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.CurrencyUnit currencyUnit13 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money14 = org.joda.money.Money.zero(currencyUnit13);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit13);
        org.joda.money.BigMoney bigMoney17 = org.joda.money.BigMoney.of(currencyUnit13, (double) '#');
        org.joda.money.Money money18 = money10.withCurrencyUnit(currencyUnit13);
        org.joda.money.CurrencyUnit currencyUnit20 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money21 = org.joda.money.Money.zero(currencyUnit20);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit20);
        org.joda.money.BigMoney bigMoney24 = org.joda.money.BigMoney.of(currencyUnit20, (double) '#');
        boolean boolean25 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney24);
        org.joda.money.CurrencyUnit currencyUnit26 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money27 = org.joda.money.Money.zero(currencyUnit26);
        org.joda.money.Money money29 = money27.minusMajor((long) ' ');
        boolean boolean30 = bigMoney24.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money29);
        org.joda.money.Money money31 = money29.negated();
        org.joda.money.CurrencyUnit currencyUnit33 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money34 = org.joda.money.Money.zero(currencyUnit33);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit33);
        org.joda.money.BigMoney bigMoney37 = org.joda.money.BigMoney.of(currencyUnit33, (double) '#');
        boolean boolean38 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney37);
        org.joda.money.CurrencyUnit currencyUnit39 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money40 = org.joda.money.Money.zero(currencyUnit39);
        org.joda.money.Money money42 = money40.minusMajor((long) ' ');
        boolean boolean43 = bigMoney37.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money42);
        org.joda.money.Money money44 = money42.negated();
        org.joda.money.Money money45 = money29.minus(money44);
        org.joda.money.CurrencyUnit currencyUnit47 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money48 = org.joda.money.Money.zero(currencyUnit47);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit47);
        org.joda.money.BigMoney bigMoney51 = org.joda.money.BigMoney.of(currencyUnit47, (double) '#');
        boolean boolean52 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney51);
        org.joda.money.CurrencyUnit currencyUnit53 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money54 = org.joda.money.Money.zero(currencyUnit53);
        org.joda.money.Money money56 = money54.minusMajor((long) ' ');
        boolean boolean57 = bigMoney51.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money56);
        int int58 = bigMoney51.getAmountMajorInt();
        boolean boolean59 = money44.isLessThanOrEqual((org.joda.money.BigMoneyProvider) bigMoney51);
        java.math.BigDecimal bigDecimal60 = money44.getAmountMajor();
        org.joda.money.Money money61 = org.joda.money.Money.of(currencyUnit13, bigDecimal60);
        org.joda.money.CurrencyUnit currencyUnit63 = org.joda.money.CurrencyUnit.of("EUR");
        org.joda.money.BigMoney bigMoney65 = org.joda.money.BigMoney.ofMinor(currencyUnit63, (long) '0');
        java.lang.String str66 = currencyUnit63.toString();
        java.lang.String str67 = currencyUnit63.getSymbol();
        boolean boolean68 = currencyUnit13.equals((java.lang.Object) currencyUnit63);
        org.joda.money.Money money70 = org.joda.money.Money.ofMinor(currencyUnit13, (long) 3500);
        org.joda.money.Money money71 = money70.negated();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney5 and money70", (bigMoney5.compareTo(money70) == 0) == bigMoney5.equals(money70));
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test620");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.Money money12 = money10.negated();
        org.joda.money.Money money14 = money12.minusMajor(1L);
        org.joda.money.CurrencyUnit currencyUnit15 = money12.getCurrencyUnit();
        java.lang.String str16 = currencyUnit15.toString();
        org.joda.money.CurrencyUnit currencyUnit17 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money18 = org.joda.money.Money.zero(currencyUnit17);
        org.joda.money.BigMoney bigMoney20 = org.joda.money.BigMoney.ofMajor(currencyUnit17, (long) 'a');
        java.util.Set<java.lang.String> strSet21 = currencyUnit17.getCountryCodes();
        int int22 = currencyUnit17.getDecimalPlaces();
        org.joda.money.CurrencyMismatchException currencyMismatchException23 = new org.joda.money.CurrencyMismatchException(currencyUnit15, currencyUnit17);
        org.joda.money.BigMoney bigMoney25 = org.joda.money.BigMoney.ofMinor(currencyUnit15, 34L);
        org.joda.money.BigMoney bigMoney27 = bigMoney25.multipliedBy(10.0d);
        org.joda.money.Money money29 = org.joda.money.Money.parse("EUR 35");
        org.joda.money.Money money31 = money29.minusMinor((long) 'a');
        org.joda.money.CurrencyUnit currencyUnit32 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money33 = org.joda.money.Money.zero(currencyUnit32);
        org.joda.money.Money money35 = money33.minusMajor((long) ' ');
        java.math.BigDecimal bigDecimal36 = money33.getAmountMinor();
        org.joda.money.Money money37 = org.joda.money.MoneyUtils.subtract(money31, money33);
        org.joda.money.BigMoney bigMoney38 = bigMoney25.minus((org.joda.money.BigMoneyProvider) money37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney5 and money29", (bigMoney5.compareTo(money29) == 0) == bigMoney5.equals(money29));
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test621");
        org.joda.money.CurrencyUnit currencyUnit2 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money3 = org.joda.money.Money.zero(currencyUnit2);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit2);
        org.joda.money.BigMoney bigMoney6 = org.joda.money.BigMoney.of(currencyUnit2, (double) '#');
        boolean boolean7 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney6);
        org.joda.money.CurrencyUnit currencyUnit8 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money9 = org.joda.money.Money.zero(currencyUnit8);
        org.joda.money.Money money11 = money9.minusMajor((long) ' ');
        boolean boolean12 = bigMoney6.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money11);
        org.joda.money.Money money13 = money11.negated();
        org.joda.money.Money money15 = money13.minusMajor(1L);
        org.joda.money.CurrencyUnit currencyUnit16 = money13.getCurrencyUnit();
        java.lang.String str17 = currencyUnit16.toString();
        org.joda.money.CurrencyUnit currencyUnit18 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money19 = org.joda.money.Money.zero(currencyUnit18);
        org.joda.money.BigMoney bigMoney21 = org.joda.money.BigMoney.ofMajor(currencyUnit18, (long) 'a');
        java.util.Set<java.lang.String> strSet22 = currencyUnit18.getCountryCodes();
        int int23 = currencyUnit18.getDecimalPlaces();
        org.joda.money.CurrencyMismatchException currencyMismatchException24 = new org.joda.money.CurrencyMismatchException(currencyUnit16, currencyUnit18);
        org.joda.money.CurrencyUnit currencyUnit25 = currencyMismatchException24.getFirstCurrency();
        org.joda.money.CurrencyUnit currencyUnit26 = currencyMismatchException24.getSecondCurrency();
        org.joda.money.format.MoneyFormatException moneyFormatException27 = new org.joda.money.format.MoneyFormatException("978EUR34.6534465", (java.lang.Throwable) currencyMismatchException24);
        org.joda.money.CurrencyUnit currencyUnit28 = currencyMismatchException24.getFirstCurrency();
        org.joda.money.CurrencyUnit currencyUnit30 = org.joda.money.CurrencyUnit.of("EUR");
        org.joda.money.BigMoney bigMoney32 = org.joda.money.BigMoney.ofMinor(currencyUnit30, (-3200L));
        org.joda.money.BigMoney bigMoney34 = org.joda.money.BigMoney.zero(currencyUnit30, 47);
        org.joda.money.CurrencyMismatchException currencyMismatchException35 = new org.joda.money.CurrencyMismatchException(currencyUnit28, currencyUnit30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money3 and bigMoney34", (money3.compareTo(bigMoney34) == 0) == money3.equals(bigMoney34));
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test622");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        int int12 = bigMoney5.getAmountMajorInt();
        org.joda.money.CurrencyUnit currencyUnit14 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money15 = org.joda.money.Money.zero(currencyUnit14);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit14);
        org.joda.money.BigMoney bigMoney18 = org.joda.money.BigMoney.of(currencyUnit14, (double) '#');
        boolean boolean19 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney18);
        org.joda.money.CurrencyUnit currencyUnit20 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money21 = org.joda.money.Money.zero(currencyUnit20);
        org.joda.money.Money money23 = money21.minusMajor((long) ' ');
        boolean boolean24 = bigMoney18.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money23);
        org.joda.money.CurrencyUnit currencyUnit26 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money27 = org.joda.money.Money.zero(currencyUnit26);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit26);
        org.joda.money.BigMoney bigMoney30 = org.joda.money.BigMoney.of(currencyUnit26, (double) '#');
        org.joda.money.Money money31 = money23.withCurrencyUnit(currencyUnit26);
        org.joda.money.BigMoney bigMoney32 = bigMoney5.plus((org.joda.money.BigMoneyProvider) money23);
        long long33 = bigMoney32.getAmountMajorLong();
        org.joda.money.BigMoney bigMoney35 = bigMoney32.minus((double) (byte) 100);
        org.joda.money.BigMoney bigMoney37 = bigMoney35.withAmount((double) 10L);
        org.joda.money.BigMoney bigMoney39 = bigMoney35.withScale(3);
        boolean boolean40 = bigMoney39.isPositive();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney35 and bigMoney39", (bigMoney35.compareTo(bigMoney39) == 0) == bigMoney35.equals(bigMoney39));
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test623");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.Money money12 = money10.negated();
        org.joda.money.Money money14 = money12.minusMajor(1L);
        org.joda.money.CurrencyUnit currencyUnit15 = money12.getCurrencyUnit();
        java.lang.String str16 = currencyUnit15.toString();
        org.joda.money.CurrencyUnit currencyUnit17 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money18 = org.joda.money.Money.zero(currencyUnit17);
        org.joda.money.BigMoney bigMoney20 = org.joda.money.BigMoney.ofMajor(currencyUnit17, (long) 'a');
        java.util.Set<java.lang.String> strSet21 = currencyUnit17.getCountryCodes();
        int int22 = currencyUnit17.getDecimalPlaces();
        org.joda.money.CurrencyMismatchException currencyMismatchException23 = new org.joda.money.CurrencyMismatchException(currencyUnit15, currencyUnit17);
        org.joda.money.CurrencyUnit currencyUnit24 = currencyMismatchException23.getSecondCurrency();
        org.joda.money.CurrencyUnit currencyUnit25 = currencyMismatchException23.getSecondCurrency();
        org.joda.money.CurrencyUnit currencyUnit26 = currencyMismatchException23.getFirstCurrency();
        java.lang.String str27 = currencyUnit26.getCode();
        org.joda.money.CurrencyUnit currencyUnit29 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money30 = org.joda.money.Money.zero(currencyUnit29);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit29);
        org.joda.money.BigMoney bigMoney33 = org.joda.money.BigMoney.of(currencyUnit29, (double) '#');
        boolean boolean34 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney33);
        org.joda.money.CurrencyUnit currencyUnit35 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money36 = org.joda.money.Money.zero(currencyUnit35);
        org.joda.money.Money money38 = money36.minusMajor((long) ' ');
        boolean boolean39 = bigMoney33.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money38);
        org.joda.money.Money money41 = money38.multipliedBy((long) (byte) 10);
        org.joda.money.CurrencyUnit currencyUnit42 = money41.getCurrencyUnit();
        java.math.BigDecimal bigDecimal43 = money41.getAmountMajor();
        org.joda.money.BigMoney bigMoney44 = org.joda.money.BigMoney.of(currencyUnit26, bigDecimal43);
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder45 = new org.joda.money.format.MoneyFormatterBuilder();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder46 = moneyFormatterBuilder45.appendCurrencyNumeric3Code();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder47 = moneyFormatterBuilder45.appendCurrencyNumericCode();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder48 = moneyFormatterBuilder47.appendAmountLocalized();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder49 = moneyFormatterBuilder48.appendCurrencyNumericCode();
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle50 = org.joda.money.format.MoneyAmountStyle.ASCII_DECIMAL_COMMA_NO_GROUPING;
        java.lang.String str51 = moneyAmountStyle50.toString();
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle53 = moneyAmountStyle50.withNegativeSignCharacter((java.lang.Character) 'a');
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle55 = moneyAmountStyle53.withAbsValue(false);
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle57 = moneyAmountStyle53.withDecimalPointCharacter((java.lang.Character) '+');
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder58 = moneyFormatterBuilder49.appendAmount(moneyAmountStyle57);
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder59 = moneyFormatterBuilder58.appendAmountLocalized();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder60 = moneyFormatterBuilder59.appendCurrencySymbolLocalized();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder61 = new org.joda.money.format.MoneyFormatterBuilder();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder62 = moneyFormatterBuilder61.appendCurrencyNumeric3Code();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder63 = moneyFormatterBuilder61.appendCurrencyCode();
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle64 = org.joda.money.format.MoneyAmountStyle.ASCII_DECIMAL_POINT_GROUP3_SPACE;
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder65 = moneyFormatterBuilder63.appendAmount(moneyAmountStyle64);
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle66 = org.joda.money.format.MoneyAmountStyle.ASCII_DECIMAL_COMMA_NO_GROUPING;
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle68 = moneyAmountStyle66.withDecimalPointCharacter((java.lang.Character) '4');
        boolean boolean69 = moneyAmountStyle68.isAbsValue();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder70 = moneyFormatterBuilder63.appendAmount(moneyAmountStyle68);
        org.joda.money.format.MoneyFormatter moneyFormatter71 = moneyFormatterBuilder70.toFormatter();
        java.util.Locale locale72 = moneyFormatter71.getLocale();
        org.joda.money.format.MoneyFormatter moneyFormatter73 = moneyFormatterBuilder59.toFormatter(locale72);
        java.lang.String str74 = currencyUnit26.getSymbol(locale72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money41 and bigMoney44", (money41.compareTo(bigMoney44) == 0) == money41.equals(bigMoney44));
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test624");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.Money money5 = org.joda.money.Money.ofMajor(currencyUnit1, (long) (byte) 10);
        org.joda.money.Money money6 = money5.abs();
        org.joda.money.Money money8 = money6.minusMajor(0L);
        org.joda.money.CurrencyUnit currencyUnit9 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money10 = org.joda.money.Money.zero(currencyUnit9);
        org.joda.money.BigMoney bigMoney12 = org.joda.money.BigMoney.ofMajor(currencyUnit9, (long) 'a');
        java.util.Set<java.lang.String> strSet13 = currencyUnit9.getCountryCodes();
        org.joda.money.Money money15 = org.joda.money.Money.ofMajor(currencyUnit9, (long) '0');
        org.joda.money.Money money17 = money15.plusMajor((long) (byte) 10);
        java.math.BigDecimal bigDecimal18 = money17.getAmountMinor();
        org.joda.money.Money money19 = org.joda.money.MoneyUtils.subtract(money8, money17);
        org.joda.money.CurrencyUnit currencyUnit21 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money22 = org.joda.money.Money.zero(currencyUnit21);
        org.joda.money.BigMoney bigMoney24 = org.joda.money.BigMoney.ofMajor(currencyUnit21, (long) 'a');
        java.util.Set<java.lang.String> strSet25 = currencyUnit21.getCountryCodes();
        int int26 = currencyUnit21.getDecimalPlaces();
        org.joda.money.CurrencyUnit.registerCountry("EUR", currencyUnit21);
        java.lang.String str28 = currencyUnit21.getSymbol();
        org.joda.money.CurrencyUnit currencyUnit30 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money31 = org.joda.money.Money.zero(currencyUnit30);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit30);
        org.joda.money.BigMoney bigMoney34 = org.joda.money.BigMoney.of(currencyUnit30, (double) '#');
        boolean boolean35 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney34);
        org.joda.money.CurrencyUnit currencyUnit36 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money37 = org.joda.money.Money.zero(currencyUnit36);
        org.joda.money.Money money39 = money37.minusMajor((long) ' ');
        boolean boolean40 = bigMoney34.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money39);
        org.joda.money.CurrencyUnit currencyUnit42 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money43 = org.joda.money.Money.zero(currencyUnit42);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit42);
        org.joda.money.BigMoney bigMoney46 = org.joda.money.BigMoney.of(currencyUnit42, (double) '#');
        boolean boolean47 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney46);
        org.joda.money.CurrencyUnit currencyUnit48 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money49 = org.joda.money.Money.zero(currencyUnit48);
        org.joda.money.Money money51 = money49.minusMajor((long) ' ');
        boolean boolean52 = bigMoney46.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money51);
        org.joda.money.Money money53 = money51.negated();
        org.joda.money.Money money55 = money53.minusMajor(1L);
        org.joda.money.Money money57 = money55.minusMajor(100L);
        org.joda.money.CurrencyUnit currencyUnit59 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money60 = org.joda.money.Money.zero(currencyUnit59);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit59);
        org.joda.money.BigMoney bigMoney63 = org.joda.money.BigMoney.of(currencyUnit59, (double) '#');
        boolean boolean64 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney63);
        org.joda.money.CurrencyUnit currencyUnit65 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money66 = org.joda.money.Money.zero(currencyUnit65);
        org.joda.money.Money money68 = money66.minusMajor((long) ' ');
        boolean boolean69 = bigMoney63.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money68);
        org.joda.money.Money money70 = money68.negated();
        org.joda.money.CurrencyUnit currencyUnit72 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money73 = org.joda.money.Money.zero(currencyUnit72);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit72);
        org.joda.money.BigMoney bigMoney76 = org.joda.money.BigMoney.of(currencyUnit72, (double) '#');
        boolean boolean77 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney76);
        org.joda.money.CurrencyUnit currencyUnit78 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money79 = org.joda.money.Money.zero(currencyUnit78);
        org.joda.money.Money money81 = money79.minusMajor((long) ' ');
        boolean boolean82 = bigMoney76.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money81);
        org.joda.money.Money money83 = money81.negated();
        org.joda.money.Money money84 = money68.minus(money83);
        org.joda.money.Money[] moneyArray85 = new org.joda.money.Money[] { money39, money57, money68 };
        org.joda.money.Money money86 = org.joda.money.Money.total(moneyArray85);
        org.joda.money.Money money87 = org.joda.money.Money.total(moneyArray85);
        org.joda.money.BigMoney bigMoney88 = org.joda.money.BigMoney.total(currencyUnit21, (org.joda.money.BigMoneyProvider[]) moneyArray85);
        org.joda.money.Money money89 = money8.withCurrencyUnit(currencyUnit21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money86 and bigMoney88", (money86.compareTo(bigMoney88) == 0) == money86.equals(bigMoney88));
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test625");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.of("EUR");
        org.joda.money.BigMoney bigMoney3 = org.joda.money.BigMoney.ofMinor(currencyUnit1, (long) '0');
        org.joda.money.Money money4 = org.joda.money.Money.zero(currencyUnit1);
        int int5 = currencyUnit1.getDecimalPlaces();
        java.util.Currency currency6 = currencyUnit1.toCurrency();
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.of(currency6);
        org.joda.money.CurrencyUnit currencyUnit8 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean9 = currencyUnit8.isPseudoCurrency();
        boolean boolean10 = currencyUnit8.isPseudoCurrency();
        org.joda.money.BigMoney bigMoney11 = org.joda.money.BigMoney.zero(currencyUnit8);
        org.joda.money.BigMoney bigMoney13 = bigMoney11.multipliedBy((-1L));
        long long14 = bigMoney11.getAmountMajorLong();
        java.math.BigDecimal bigDecimal15 = bigMoney11.getAmount();
        org.joda.money.BigMoney bigMoney17 = org.joda.money.BigMoney.ofScale(currencyUnit7, bigDecimal15, (int) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money4 and bigMoney11", (money4.compareTo(bigMoney11) == 0) == money4.equals(bigMoney11));
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test626");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.Money money12 = money10.negated();
        org.joda.money.Money money14 = money12.minusMajor(1L);
        org.joda.money.CurrencyUnit currencyUnit15 = money12.getCurrencyUnit();
        java.lang.String str16 = currencyUnit15.toString();
        org.joda.money.CurrencyUnit currencyUnit18 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money19 = org.joda.money.Money.zero(currencyUnit18);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit18);
        org.joda.money.BigMoney bigMoney22 = org.joda.money.BigMoney.of(currencyUnit18, (double) '#');
        boolean boolean23 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney22);
        org.joda.money.CurrencyUnit currencyUnit24 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money25 = org.joda.money.Money.zero(currencyUnit24);
        org.joda.money.Money money27 = money25.minusMajor((long) ' ');
        boolean boolean28 = bigMoney22.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money27);
        org.joda.money.CurrencyUnit currencyUnit30 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money31 = org.joda.money.Money.zero(currencyUnit30);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit30);
        org.joda.money.BigMoney bigMoney34 = org.joda.money.BigMoney.of(currencyUnit30, (double) '#');
        boolean boolean35 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney34);
        org.joda.money.CurrencyUnit currencyUnit36 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money37 = org.joda.money.Money.zero(currencyUnit36);
        org.joda.money.Money money39 = money37.minusMajor((long) ' ');
        boolean boolean40 = bigMoney34.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money39);
        org.joda.money.Money money41 = money39.negated();
        org.joda.money.Money money43 = money41.minusMajor(1L);
        org.joda.money.Money money45 = money43.minusMajor(100L);
        org.joda.money.CurrencyUnit currencyUnit47 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money48 = org.joda.money.Money.zero(currencyUnit47);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit47);
        org.joda.money.BigMoney bigMoney51 = org.joda.money.BigMoney.of(currencyUnit47, (double) '#');
        boolean boolean52 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney51);
        org.joda.money.CurrencyUnit currencyUnit53 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money54 = org.joda.money.Money.zero(currencyUnit53);
        org.joda.money.Money money56 = money54.minusMajor((long) ' ');
        boolean boolean57 = bigMoney51.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money56);
        org.joda.money.Money money58 = money56.negated();
        org.joda.money.CurrencyUnit currencyUnit60 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money61 = org.joda.money.Money.zero(currencyUnit60);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit60);
        org.joda.money.BigMoney bigMoney64 = org.joda.money.BigMoney.of(currencyUnit60, (double) '#');
        boolean boolean65 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney64);
        org.joda.money.CurrencyUnit currencyUnit66 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money67 = org.joda.money.Money.zero(currencyUnit66);
        org.joda.money.Money money69 = money67.minusMajor((long) ' ');
        boolean boolean70 = bigMoney64.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money69);
        org.joda.money.Money money71 = money69.negated();
        org.joda.money.Money money72 = money56.minus(money71);
        org.joda.money.Money[] moneyArray73 = new org.joda.money.Money[] { money27, money45, money56 };
        org.joda.money.Money money74 = org.joda.money.Money.total(moneyArray73);
        org.joda.money.Money money75 = org.joda.money.Money.total(moneyArray73);
        org.joda.money.BigMoney bigMoney76 = org.joda.money.BigMoney.total((org.joda.money.BigMoneyProvider[]) moneyArray73);
        org.joda.money.Money money77 = org.joda.money.Money.total(currencyUnit15, moneyArray73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money74 and bigMoney76", (money74.compareTo(bigMoney76) == 0) == money74.equals(bigMoney76));
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test627");
        org.joda.money.CurrencyUnit currencyUnit0 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean1 = currencyUnit0.isPseudoCurrency();
        boolean boolean2 = currencyUnit0.isPseudoCurrency();
        org.joda.money.BigMoney bigMoney3 = org.joda.money.BigMoney.zero(currencyUnit0);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.ofMinor(currencyUnit0, (long) '+');
        java.lang.String str6 = currencyUnit0.toString();
        org.joda.money.CurrencyUnit currencyUnit8 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money9 = org.joda.money.Money.zero(currencyUnit8);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit8);
        org.joda.money.BigMoney bigMoney12 = org.joda.money.BigMoney.of(currencyUnit8, (double) '#');
        boolean boolean13 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney12);
        org.joda.money.CurrencyUnit currencyUnit14 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money15 = org.joda.money.Money.zero(currencyUnit14);
        org.joda.money.Money money17 = money15.minusMajor((long) ' ');
        boolean boolean18 = bigMoney12.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money17);
        org.joda.money.Money money19 = money17.negated();
        org.joda.money.CurrencyUnit currencyUnit21 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money22 = org.joda.money.Money.zero(currencyUnit21);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit21);
        org.joda.money.BigMoney bigMoney25 = org.joda.money.BigMoney.of(currencyUnit21, (double) '#');
        boolean boolean26 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney25);
        org.joda.money.CurrencyUnit currencyUnit27 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money28 = org.joda.money.Money.zero(currencyUnit27);
        org.joda.money.Money money30 = money28.minusMajor((long) ' ');
        boolean boolean31 = bigMoney25.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money30);
        org.joda.money.Money money32 = money30.negated();
        org.joda.money.Money money33 = money17.minus(money32);
        org.joda.money.CurrencyUnit currencyUnit35 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money36 = org.joda.money.Money.zero(currencyUnit35);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit35);
        org.joda.money.BigMoney bigMoney39 = org.joda.money.BigMoney.of(currencyUnit35, (double) '#');
        boolean boolean40 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney39);
        org.joda.money.CurrencyUnit currencyUnit41 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money42 = org.joda.money.Money.zero(currencyUnit41);
        org.joda.money.Money money44 = money42.minusMajor((long) ' ');
        boolean boolean45 = bigMoney39.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money44);
        int int46 = bigMoney39.getAmountMajorInt();
        boolean boolean47 = money32.isLessThanOrEqual((org.joda.money.BigMoneyProvider) bigMoney39);
        org.joda.money.CurrencyUnit currencyUnit49 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money50 = org.joda.money.Money.zero(currencyUnit49);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit49);
        org.joda.money.BigMoney bigMoney53 = org.joda.money.BigMoney.of(currencyUnit49, (double) '#');
        boolean boolean54 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney53);
        org.joda.money.CurrencyUnit currencyUnit55 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money56 = org.joda.money.Money.zero(currencyUnit55);
        org.joda.money.Money money58 = money56.minusMajor((long) ' ');
        boolean boolean59 = bigMoney53.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money58);
        org.joda.money.Money money61 = money58.multipliedBy((long) (byte) 10);
        boolean boolean62 = bigMoney39.isLessThan((org.joda.money.BigMoneyProvider) money58);
        org.joda.money.BigMoney bigMoney64 = bigMoney39.multipliedBy((long) 10);
        java.math.BigDecimal bigDecimal65 = bigMoney39.getAmountMinor();
        org.joda.money.BigMoney bigMoney66 = org.joda.money.BigMoney.of(currencyUnit0, bigDecimal65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney3 and money9", (bigMoney3.compareTo(money9) == 0) == bigMoney3.equals(money9));
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test628");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        org.joda.money.BigMoney bigMoney7 = bigMoney5.withScale((int) (byte) 1);
        org.joda.money.BigMoney bigMoney9 = bigMoney5.minus((double) (-9600L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney5 and bigMoney7", (bigMoney5.compareTo(bigMoney7) == 0) == bigMoney5.equals(bigMoney7));
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test629");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.Money money13 = money10.multipliedBy((long) (byte) 10);
        org.joda.money.CurrencyUnit currencyUnit14 = money13.getCurrencyUnit();
        org.joda.money.BigMoney bigMoney17 = org.joda.money.BigMoney.ofScale(currencyUnit14, (-32L), 3);
        org.joda.money.CurrencyUnit currencyUnit18 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money19 = org.joda.money.Money.zero(currencyUnit18);
        org.joda.money.BigMoney bigMoney21 = org.joda.money.BigMoney.ofMajor(currencyUnit18, (long) 'a');
        org.joda.money.CurrencyMismatchException currencyMismatchException22 = new org.joda.money.CurrencyMismatchException(currencyUnit14, currencyUnit18);
        org.joda.money.CurrencyUnit currencyUnit24 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money25 = org.joda.money.Money.zero(currencyUnit24);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit24);
        org.joda.money.BigMoney bigMoney28 = org.joda.money.BigMoney.of(currencyUnit24, (double) 10L);
        java.util.Currency currency29 = currencyUnit24.toCurrency();
        org.joda.money.BigMoney bigMoney32 = org.joda.money.BigMoney.ofScale(currencyUnit24, (long) (short) 10, 3465);
        org.joda.money.BigMoney bigMoney34 = org.joda.money.BigMoney.ofMinor(currencyUnit24, (long) (-3200));
        int int35 = currencyUnit14.compareTo(currencyUnit24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money10 and bigMoney34", (money10.compareTo(bigMoney34) == 0) == money10.equals(bigMoney34));
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test630");
        org.joda.money.CurrencyUnit currencyUnit0 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean1 = currencyUnit0.isPseudoCurrency();
        boolean boolean2 = currencyUnit0.isPseudoCurrency();
        org.joda.money.BigMoney bigMoney3 = org.joda.money.BigMoney.zero(currencyUnit0);
        org.joda.money.BigMoney bigMoney5 = bigMoney3.multipliedBy((-1L));
        long long6 = bigMoney3.getAmountMajorLong();
        boolean boolean7 = bigMoney3.isPositiveOrZero();
        int int8 = bigMoney3.getScale();
        org.joda.money.BigMoney bigMoney10 = bigMoney3.minusMajor((long) 0);
        org.joda.money.CurrencyUnit currencyUnit12 = org.joda.money.CurrencyUnit.of("EUR");
        org.joda.money.BigMoney bigMoney14 = org.joda.money.BigMoney.ofMinor(currencyUnit12, (long) '0');
        java.lang.String str15 = currencyUnit12.toString();
        org.joda.money.CurrencyUnit currencyUnit17 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money18 = org.joda.money.Money.zero(currencyUnit17);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit17);
        org.joda.money.BigMoney bigMoney21 = org.joda.money.BigMoney.of(currencyUnit17, (double) '#');
        java.math.BigDecimal bigDecimal22 = bigMoney21.getAmountMajor();
        org.joda.money.BigMoney bigMoney23 = bigMoney21.abs();
        org.joda.money.BigMoney bigMoney25 = bigMoney23.minusMinor((long) (-1));
        org.joda.money.CurrencyUnit currencyUnit26 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money27 = org.joda.money.Money.zero(currencyUnit26);
        org.joda.money.Money money29 = money27.minusMajor((long) ' ');
        java.math.BigDecimal bigDecimal30 = money27.getAmountMinor();
        java.math.RoundingMode roundingMode31 = null;
        org.joda.money.BigMoney bigMoney32 = bigMoney25.minusRetainScale((org.joda.money.BigMoneyProvider) money27, roundingMode31);
        java.math.BigDecimal bigDecimal33 = bigMoney25.getAmountMajor();
        org.joda.money.BigMoney bigMoney34 = bigMoney3.convertedTo(currencyUnit12, bigDecimal33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney3 and money18", (bigMoney3.compareTo(money18) == 0) == bigMoney3.equals(money18));
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test631");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        java.math.BigDecimal bigDecimal6 = bigMoney5.getAmountMajor();
        org.joda.money.BigMoney bigMoney7 = bigMoney5.abs();
        org.joda.money.BigMoney bigMoney8 = org.joda.money.BigMoney.of((org.joda.money.BigMoneyProvider) bigMoney7);
        org.joda.money.BigMoney bigMoney10 = org.joda.money.BigMoney.parse("EUR -32.00");
        org.joda.money.BigMoney bigMoney12 = bigMoney10.plus((double) 10L);
        boolean boolean13 = org.joda.money.MoneyUtils.isPositive((org.joda.money.BigMoneyProvider) bigMoney12);
        org.joda.money.BigMoney bigMoney14 = bigMoney12.negated();
        org.joda.money.CurrencyUnit currencyUnit16 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money17 = org.joda.money.Money.zero(currencyUnit16);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit16);
        org.joda.money.BigMoney bigMoney20 = org.joda.money.BigMoney.of(currencyUnit16, (double) '#');
        java.math.BigDecimal bigDecimal21 = bigMoney20.getAmountMajor();
        org.joda.money.BigMoney bigMoney22 = bigMoney20.abs();
        org.joda.money.BigMoney bigMoney23 = bigMoney22.negated();
        org.joda.money.BigMoney bigMoney25 = bigMoney22.minusMinor((long) '#');
        org.joda.money.BigMoney bigMoney26 = bigMoney25.toBigMoney();
        boolean boolean27 = bigMoney12.isSameCurrency((org.joda.money.BigMoneyProvider) bigMoney25);
        org.joda.money.BigMoney bigMoney28 = org.joda.money.MoneyUtils.subtract(bigMoney8, bigMoney25);
        org.joda.money.BigMoney bigMoney29 = null;
        org.joda.money.CurrencyUnit currencyUnit31 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money32 = org.joda.money.Money.zero(currencyUnit31);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit31);
        org.joda.money.BigMoney bigMoney35 = org.joda.money.BigMoney.of(currencyUnit31, (double) '#');
        org.joda.money.BigMoney bigMoney37 = org.joda.money.BigMoney.ofMinor(currencyUnit31, (long) (byte) -1);
        int int38 = bigMoney37.getAmountMinorInt();
        org.joda.money.CurrencyUnit currencyUnit40 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money41 = org.joda.money.Money.zero(currencyUnit40);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit40);
        org.joda.money.BigMoney bigMoney44 = org.joda.money.BigMoney.of(currencyUnit40, (double) '#');
        boolean boolean45 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney44);
        int int46 = bigMoney44.getMinorPart();
        boolean boolean47 = bigMoney44.isPositive();
        org.joda.money.BigMoney bigMoney48 = org.joda.money.MoneyUtils.subtract(bigMoney37, bigMoney44);
        org.joda.money.BigMoney bigMoney49 = org.joda.money.MoneyUtils.min(bigMoney29, bigMoney37);
        org.joda.money.CurrencyUnit currencyUnit51 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money52 = org.joda.money.Money.zero(currencyUnit51);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit51);
        org.joda.money.BigMoney bigMoney55 = org.joda.money.BigMoney.of(currencyUnit51, (double) '#');
        java.math.BigDecimal bigDecimal56 = bigMoney55.getAmountMajor();
        org.joda.money.BigMoney bigMoney57 = bigMoney55.abs();
        org.joda.money.BigMoney bigMoney59 = bigMoney57.minusMinor((long) (-1));
        boolean boolean60 = bigMoney49.isSameCurrency((org.joda.money.BigMoneyProvider) bigMoney57);
        org.joda.money.BigMoney bigMoney62 = bigMoney49.withAmount((double) (-6400L));
        org.joda.money.BigMoney bigMoney63 = org.joda.money.MoneyUtils.min(bigMoney8, bigMoney62);
        org.joda.money.Money money65 = org.joda.money.Money.parse("EUR 35");
        org.joda.money.Money money67 = money65.minusMinor((long) 'a');
        org.joda.money.CurrencyUnit currencyUnit68 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money69 = org.joda.money.Money.zero(currencyUnit68);
        org.joda.money.Money money71 = money69.minusMajor((long) ' ');
        java.math.BigDecimal bigDecimal72 = money69.getAmountMinor();
        org.joda.money.Money money73 = org.joda.money.MoneyUtils.subtract(money67, money69);
        java.math.BigDecimal bigDecimal74 = money67.getAmount();
        boolean boolean75 = bigMoney63.isEqual((org.joda.money.BigMoneyProvider) money67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney5 and money65", (bigMoney5.compareTo(money65) == 0) == bigMoney5.equals(money65));
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test632");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.CurrencyUnit currencyUnit13 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money14 = org.joda.money.Money.zero(currencyUnit13);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit13);
        org.joda.money.BigMoney bigMoney17 = org.joda.money.BigMoney.of(currencyUnit13, (double) '#');
        boolean boolean18 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney17);
        org.joda.money.CurrencyUnit currencyUnit19 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money20 = org.joda.money.Money.zero(currencyUnit19);
        org.joda.money.Money money22 = money20.minusMajor((long) ' ');
        boolean boolean23 = bigMoney17.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money22);
        org.joda.money.Money money24 = money22.negated();
        org.joda.money.Money money25 = org.joda.money.MoneyUtils.add(money10, money22);
        org.joda.money.CurrencyUnit currencyUnit27 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money28 = org.joda.money.Money.zero(currencyUnit27);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit27);
        org.joda.money.BigMoney bigMoney31 = org.joda.money.BigMoney.of(currencyUnit27, (double) '#');
        boolean boolean32 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney31);
        org.joda.money.CurrencyUnit currencyUnit33 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money34 = org.joda.money.Money.zero(currencyUnit33);
        org.joda.money.Money money36 = money34.minusMajor((long) ' ');
        boolean boolean37 = bigMoney31.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money36);
        org.joda.money.Money money38 = money36.negated();
        org.joda.money.CurrencyUnit currencyUnit40 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money41 = org.joda.money.Money.zero(currencyUnit40);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit40);
        org.joda.money.BigMoney bigMoney44 = org.joda.money.BigMoney.of(currencyUnit40, (double) '#');
        boolean boolean45 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney44);
        org.joda.money.CurrencyUnit currencyUnit46 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money47 = org.joda.money.Money.zero(currencyUnit46);
        org.joda.money.Money money49 = money47.minusMajor((long) ' ');
        boolean boolean50 = bigMoney44.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money49);
        org.joda.money.Money money51 = money49.negated();
        org.joda.money.Money money52 = money36.minus(money51);
        org.joda.money.Money money54 = money52.minusMinor((long) ' ');
        org.joda.money.Money money55 = org.joda.money.MoneyUtils.max(money22, money52);
        org.joda.money.CurrencyUnit currencyUnit57 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money58 = org.joda.money.Money.zero(currencyUnit57);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit57);
        org.joda.money.BigMoney bigMoney61 = org.joda.money.BigMoney.of(currencyUnit57, (double) '#');
        boolean boolean62 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney61);
        org.joda.money.CurrencyUnit currencyUnit63 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money64 = org.joda.money.Money.zero(currencyUnit63);
        org.joda.money.Money money66 = money64.minusMajor((long) ' ');
        boolean boolean67 = bigMoney61.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money66);
        org.joda.money.CurrencyUnit currencyUnit69 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money70 = org.joda.money.Money.zero(currencyUnit69);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit69);
        org.joda.money.BigMoney bigMoney73 = org.joda.money.BigMoney.of(currencyUnit69, (double) '#');
        org.joda.money.Money money74 = money66.withCurrencyUnit(currencyUnit69);
        org.joda.money.CurrencyUnit currencyUnit76 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money77 = org.joda.money.Money.zero(currencyUnit76);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit76);
        org.joda.money.BigMoney bigMoney80 = org.joda.money.BigMoney.of(currencyUnit76, (double) '#');
        boolean boolean81 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney80);
        org.joda.money.CurrencyUnit currencyUnit82 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money83 = org.joda.money.Money.zero(currencyUnit82);
        org.joda.money.Money money85 = money83.minusMajor((long) ' ');
        boolean boolean86 = bigMoney80.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money85);
        org.joda.money.Money money87 = money85.negated();
        org.joda.money.Money money89 = money87.minusMajor(1L);
        org.joda.money.Money money91 = money89.minusMajor(100L);
        int int92 = money66.compareTo((org.joda.money.BigMoneyProvider) money89);
        java.math.BigDecimal bigDecimal93 = money66.getAmountMinor();
        org.joda.money.Money money95 = money66.withAmount((double) 1L);
        java.math.BigDecimal bigDecimal96 = money66.getAmountMinor();
        org.joda.money.Money money97 = money22.plus(bigDecimal96);
        org.joda.money.BigMoney bigMoney98 = money97.toBigMoney();
        long long99 = bigMoney98.getAmountMajorLong();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money97 and bigMoney98", (money97.compareTo(bigMoney98) == 0) == money97.equals(bigMoney98));
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test633");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit7);
        org.joda.money.BigMoney bigMoney11 = org.joda.money.BigMoney.of(currencyUnit7, (double) '#');
        boolean boolean12 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney11);
        org.joda.money.CurrencyUnit currencyUnit13 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money14 = org.joda.money.Money.zero(currencyUnit13);
        org.joda.money.Money money16 = money14.minusMajor((long) ' ');
        boolean boolean17 = bigMoney11.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money16);
        org.joda.money.CurrencyUnit currencyUnit19 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money20 = org.joda.money.Money.zero(currencyUnit19);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit19);
        org.joda.money.BigMoney bigMoney23 = org.joda.money.BigMoney.of(currencyUnit19, (double) '#');
        org.joda.money.Money money24 = money16.withCurrencyUnit(currencyUnit19);
        org.joda.money.CurrencyUnit currencyUnit26 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money27 = org.joda.money.Money.zero(currencyUnit26);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit26);
        org.joda.money.BigMoney bigMoney30 = org.joda.money.BigMoney.of(currencyUnit26, (double) '#');
        boolean boolean31 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney30);
        org.joda.money.CurrencyUnit currencyUnit32 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money33 = org.joda.money.Money.zero(currencyUnit32);
        org.joda.money.Money money35 = money33.minusMajor((long) ' ');
        boolean boolean36 = bigMoney30.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money35);
        org.joda.money.Money money37 = money35.negated();
        org.joda.money.Money money39 = money37.minusMajor(1L);
        org.joda.money.Money money41 = money39.minusMajor(100L);
        int int42 = money16.compareTo((org.joda.money.BigMoneyProvider) money39);
        java.math.BigDecimal bigDecimal43 = money16.getAmountMinor();
        org.joda.money.BigMoney bigMoney44 = bigMoney5.withAmount(bigDecimal43);
        org.joda.money.BigMoney bigMoney46 = bigMoney44.withAmount((double) 35);
        org.joda.money.BigMoney bigMoney48 = org.joda.money.BigMoney.parse("EUR -32.00");
        org.joda.money.BigMoney bigMoney50 = bigMoney48.plus((double) 10L);
        boolean boolean51 = org.joda.money.MoneyUtils.isPositive((org.joda.money.BigMoneyProvider) bigMoney50);
        org.joda.money.BigMoney bigMoney52 = bigMoney50.negated();
        org.joda.money.CurrencyUnit currencyUnit53 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean54 = currencyUnit53.isPseudoCurrency();
        boolean boolean55 = currencyUnit53.isPseudoCurrency();
        org.joda.money.BigMoney bigMoney56 = org.joda.money.BigMoney.zero(currencyUnit53);
        org.joda.money.BigMoney bigMoney58 = bigMoney56.multipliedBy((-1L));
        long long59 = bigMoney56.getAmountMajorLong();
        java.math.BigDecimal bigDecimal60 = bigMoney56.getAmount();
        org.joda.money.BigMoney bigMoney61 = bigMoney56.negated();
        boolean boolean62 = bigMoney50.isGreaterThan((org.joda.money.BigMoneyProvider) bigMoney61);
        org.joda.money.BigMoney bigMoney64 = bigMoney61.minusMajor(5800L);
        boolean boolean65 = bigMoney46.equals((java.lang.Object) bigMoney61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money2 and bigMoney61", (money2.compareTo(bigMoney61) == 0) == money2.equals(bigMoney61));
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test634");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.Money money12 = money10.negated();
        org.joda.money.Money money14 = money12.minusMajor(1L);
        org.joda.money.Money money16 = money14.minusMajor(100L);
        org.joda.money.Money money18 = money16.minusMinor((long) 3);
        org.joda.money.Money money20 = money16.plusMinor((long) '0');
        org.joda.money.CurrencyUnit currencyUnit21 = money16.getCurrencyUnit();
        java.lang.String str22 = currencyUnit21.toString();
        org.joda.money.BigMoney bigMoney23 = org.joda.money.BigMoney.zero(currencyUnit21);
        org.joda.money.Money money24 = bigMoney23.toMoney();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money2 and bigMoney23", (money2.compareTo(bigMoney23) == 0) == money2.equals(bigMoney23));
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test635");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        java.math.BigDecimal bigDecimal6 = bigMoney5.getAmountMajor();
        org.joda.money.BigMoney bigMoney7 = bigMoney5.abs();
        org.joda.money.BigMoney bigMoney9 = bigMoney7.minusMinor((long) (-1));
        org.joda.money.CurrencyUnit currencyUnit10 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money11 = org.joda.money.Money.zero(currencyUnit10);
        org.joda.money.Money money13 = money11.minusMajor((long) ' ');
        java.math.BigDecimal bigDecimal14 = money11.getAmountMinor();
        java.math.RoundingMode roundingMode15 = null;
        org.joda.money.BigMoney bigMoney16 = bigMoney9.minusRetainScale((org.joda.money.BigMoneyProvider) money11, roundingMode15);
        org.joda.money.CurrencyUnit currencyUnit18 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money19 = org.joda.money.Money.zero(currencyUnit18);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit18);
        org.joda.money.BigMoney bigMoney22 = org.joda.money.BigMoney.of(currencyUnit18, (double) '#');
        boolean boolean23 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney22);
        org.joda.money.CurrencyUnit currencyUnit24 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money25 = org.joda.money.Money.zero(currencyUnit24);
        org.joda.money.Money money27 = money25.minusMajor((long) ' ');
        boolean boolean28 = bigMoney22.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money27);
        org.joda.money.Money money29 = money27.negated();
        org.joda.money.CurrencyUnit currencyUnit31 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money32 = org.joda.money.Money.zero(currencyUnit31);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit31);
        org.joda.money.BigMoney bigMoney35 = org.joda.money.BigMoney.of(currencyUnit31, (double) '#');
        boolean boolean36 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney35);
        org.joda.money.CurrencyUnit currencyUnit37 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money38 = org.joda.money.Money.zero(currencyUnit37);
        org.joda.money.Money money40 = money38.minusMajor((long) ' ');
        boolean boolean41 = bigMoney35.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money40);
        org.joda.money.Money money42 = money40.negated();
        org.joda.money.Money money43 = money27.minus(money42);
        org.joda.money.CurrencyUnit currencyUnit44 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money45 = org.joda.money.Money.zero(currencyUnit44);
        org.joda.money.Money money47 = money45.minusMajor((long) ' ');
        org.joda.money.CurrencyUnit currencyUnit49 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money50 = org.joda.money.Money.zero(currencyUnit49);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit49);
        org.joda.money.BigMoney bigMoney53 = org.joda.money.BigMoney.of(currencyUnit49, (double) '#');
        boolean boolean54 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney53);
        org.joda.money.CurrencyUnit currencyUnit55 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money56 = org.joda.money.Money.zero(currencyUnit55);
        org.joda.money.Money money58 = money56.minusMajor((long) ' ');
        boolean boolean59 = bigMoney53.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money58);
        org.joda.money.Money money60 = money58.negated();
        org.joda.money.Money money62 = money60.minusMajor(1L);
        org.joda.money.Money money63 = money47.plus(money62);
        org.joda.money.Money money64 = org.joda.money.MoneyUtils.add(money43, money62);
        java.math.BigDecimal bigDecimal65 = money43.getAmountMinor();
        org.joda.money.BigMoney bigMoney66 = bigMoney9.minus(bigDecimal65);
        org.joda.money.BigMoney bigMoney67 = bigMoney66.toBigMoney();
        org.joda.money.BigMoney bigMoney68 = bigMoney66.toBigMoney();
        int int69 = bigMoney66.getAmountMajorInt();
        org.joda.money.CurrencyUnit currencyUnit70 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean71 = currencyUnit70.isPseudoCurrency();
        boolean boolean72 = currencyUnit70.isPseudoCurrency();
        org.joda.money.BigMoney bigMoney73 = org.joda.money.BigMoney.zero(currencyUnit70);
        org.joda.money.BigMoney bigMoney75 = bigMoney73.multipliedBy((-1L));
        org.joda.money.BigMoney bigMoney77 = bigMoney73.withAmount(0.0d);
        org.joda.money.BigMoney bigMoney78 = org.joda.money.MoneyUtils.min(bigMoney66, bigMoney73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money2 and bigMoney78", (money2.compareTo(bigMoney78) == 0) == money2.equals(bigMoney78));
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test636");
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder0 = new org.joda.money.format.MoneyFormatterBuilder();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder1 = moneyFormatterBuilder0.appendCurrencyNumeric3Code();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder2 = moneyFormatterBuilder0.appendCurrencyCode();
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle3 = org.joda.money.format.MoneyAmountStyle.ASCII_DECIMAL_POINT_GROUP3_SPACE;
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder4 = moneyFormatterBuilder2.appendAmount(moneyAmountStyle3);
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder5 = new org.joda.money.format.MoneyFormatterBuilder();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder6 = moneyFormatterBuilder5.appendCurrencyNumeric3Code();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder7 = moneyFormatterBuilder5.appendCurrencyCode();
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle8 = org.joda.money.format.MoneyAmountStyle.ASCII_DECIMAL_POINT_GROUP3_SPACE;
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder9 = moneyFormatterBuilder7.appendAmount(moneyAmountStyle8);
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle10 = org.joda.money.format.MoneyAmountStyle.ASCII_DECIMAL_COMMA_NO_GROUPING;
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle12 = moneyAmountStyle10.withDecimalPointCharacter((java.lang.Character) '4');
        boolean boolean13 = moneyAmountStyle12.isAbsValue();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder14 = moneyFormatterBuilder7.appendAmount(moneyAmountStyle12);
        org.joda.money.format.MoneyFormatter moneyFormatter15 = moneyFormatterBuilder14.toFormatter();
        java.util.Locale locale16 = moneyFormatter15.getLocale();
        org.joda.money.format.MoneyFormatter moneyFormatter17 = moneyFormatterBuilder2.toFormatter(locale16);
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle18 = org.joda.money.format.MoneyAmountStyle.of(locale16);
        org.joda.money.CurrencyUnit currencyUnit19 = org.joda.money.CurrencyUnit.of(locale16);
        org.joda.money.BigMoney bigMoney21 = org.joda.money.BigMoney.zero(currencyUnit19, (int) ',');
        org.joda.money.CurrencyUnit currencyUnit23 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money24 = org.joda.money.Money.zero(currencyUnit23);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit23);
        org.joda.money.BigMoney bigMoney27 = org.joda.money.BigMoney.of(currencyUnit23, (double) '#');
        boolean boolean28 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney27);
        org.joda.money.CurrencyUnit currencyUnit29 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money30 = org.joda.money.Money.zero(currencyUnit29);
        org.joda.money.Money money32 = money30.minusMajor((long) ' ');
        boolean boolean33 = bigMoney27.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money32);
        org.joda.money.BigMoney bigMoney35 = bigMoney27.multipliedBy((long) (byte) -1);
        int int36 = bigMoney35.getMinorPart();
        boolean boolean37 = org.joda.money.MoneyUtils.isPositive((org.joda.money.BigMoneyProvider) bigMoney35);
        boolean boolean38 = bigMoney35.isPositiveOrZero();
        boolean boolean39 = bigMoney35.isCurrencyScale();
        org.joda.money.BigMoney bigMoney40 = bigMoney35.negated();
        org.joda.money.CurrencyUnit currencyUnit41 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money42 = org.joda.money.Money.zero(currencyUnit41);
        org.joda.money.Money money44 = money42.minusMajor((long) ' ');
        boolean boolean45 = org.joda.money.MoneyUtils.isPositive((org.joda.money.BigMoneyProvider) money42);
        org.joda.money.Money money47 = money42.minusMinor((long) (byte) 100);
        org.joda.money.CurrencyUnit currencyUnit48 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean49 = currencyUnit48.isPseudoCurrency();
        java.lang.String str50 = currencyUnit48.getCode();
        org.joda.money.Money money51 = org.joda.money.Money.zero(currencyUnit48);
        org.joda.money.CurrencyUnit currencyUnit52 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money53 = org.joda.money.Money.zero(currencyUnit52);
        org.joda.money.Money money55 = money53.minusMajor((long) ' ');
        java.math.BigDecimal bigDecimal56 = money53.getAmountMinor();
        org.joda.money.Money money57 = org.joda.money.Money.of(currencyUnit48, bigDecimal56);
        org.joda.money.Money money59 = money57.plusMinor((long) (byte) 1);
        boolean boolean60 = org.joda.money.MoneyUtils.isZero((org.joda.money.BigMoneyProvider) money59);
        org.joda.money.Money money62 = money59.minusMinor((-6200L));
        org.joda.money.BigMoneyProvider[] bigMoneyProviderArray63 = new org.joda.money.BigMoneyProvider[] { bigMoney35, money42, money59 };
        org.joda.money.BigMoney bigMoney64 = org.joda.money.BigMoney.total(currencyUnit19, bigMoneyProviderArray63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney21 and money24", (bigMoney21.compareTo(money24) == 0) == bigMoney21.equals(money24));
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test637");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.CurrencyUnit currencyUnit13 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money14 = org.joda.money.Money.zero(currencyUnit13);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit13);
        org.joda.money.BigMoney bigMoney17 = org.joda.money.BigMoney.of(currencyUnit13, (double) '#');
        org.joda.money.Money money18 = money10.withCurrencyUnit(currencyUnit13);
        org.joda.money.BigMoney bigMoney20 = org.joda.money.BigMoney.ofMajor(currencyUnit13, (-1L));
        org.joda.money.Money money21 = org.joda.money.Money.zero(currencyUnit13);
        org.joda.money.BigMoney bigMoney23 = org.joda.money.BigMoney.ofMinor(currencyUnit13, 1L);
        boolean boolean24 = bigMoney23.isPositiveOrZero();
        org.joda.money.CurrencyUnit currencyUnit26 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money27 = org.joda.money.Money.zero(currencyUnit26);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit26);
        org.joda.money.BigMoney bigMoney30 = org.joda.money.BigMoney.of(currencyUnit26, (double) '#');
        org.joda.money.CurrencyUnit currencyUnit32 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money33 = org.joda.money.Money.zero(currencyUnit32);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit32);
        org.joda.money.BigMoney bigMoney36 = org.joda.money.BigMoney.of(currencyUnit32, (double) '#');
        boolean boolean37 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney36);
        org.joda.money.CurrencyUnit currencyUnit38 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money39 = org.joda.money.Money.zero(currencyUnit38);
        org.joda.money.Money money41 = money39.minusMajor((long) ' ');
        boolean boolean42 = bigMoney36.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money41);
        org.joda.money.CurrencyUnit currencyUnit44 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money45 = org.joda.money.Money.zero(currencyUnit44);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit44);
        org.joda.money.BigMoney bigMoney48 = org.joda.money.BigMoney.of(currencyUnit44, (double) '#');
        org.joda.money.Money money49 = money41.withCurrencyUnit(currencyUnit44);
        org.joda.money.CurrencyUnit currencyUnit51 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money52 = org.joda.money.Money.zero(currencyUnit51);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit51);
        org.joda.money.BigMoney bigMoney55 = org.joda.money.BigMoney.of(currencyUnit51, (double) '#');
        boolean boolean56 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney55);
        org.joda.money.CurrencyUnit currencyUnit57 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money58 = org.joda.money.Money.zero(currencyUnit57);
        org.joda.money.Money money60 = money58.minusMajor((long) ' ');
        boolean boolean61 = bigMoney55.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money60);
        org.joda.money.Money money62 = money60.negated();
        org.joda.money.Money money64 = money62.minusMajor(1L);
        org.joda.money.Money money66 = money64.minusMajor(100L);
        int int67 = money41.compareTo((org.joda.money.BigMoneyProvider) money64);
        java.math.BigDecimal bigDecimal68 = money41.getAmountMinor();
        org.joda.money.BigMoney bigMoney69 = bigMoney30.withAmount(bigDecimal68);
        long long70 = bigMoney69.getAmountMinorLong();
        java.lang.String str71 = bigMoney69.toString();
        org.joda.money.BigMoney bigMoney73 = bigMoney69.withScale((int) (short) 0);
        org.joda.money.CurrencyUnit currencyUnit75 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money76 = org.joda.money.Money.zero(currencyUnit75);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit75);
        org.joda.money.BigMoney bigMoney79 = org.joda.money.BigMoney.of(currencyUnit75, (double) '#');
        java.math.BigDecimal bigDecimal80 = bigMoney79.getAmountMajor();
        org.joda.money.BigMoney bigMoney81 = bigMoney79.abs();
        boolean boolean82 = bigMoney81.isNegative();
        long long83 = bigMoney81.getAmountMinorLong();
        org.joda.money.BigMoney bigMoney84 = org.joda.money.MoneyUtils.subtract(bigMoney73, bigMoney81);
        java.math.BigDecimal bigDecimal85 = bigMoney81.getAmountMajor();
        org.joda.money.BigMoney bigMoney86 = org.joda.money.MoneyUtils.min(bigMoney23, bigMoney81);
        org.joda.money.BigMoney bigMoney88 = bigMoney81.withScale(34);
        int int89 = bigMoney88.getScale();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney5 and bigMoney88", (bigMoney5.compareTo(bigMoney88) == 0) == bigMoney5.equals(bigMoney88));
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test638");
        org.joda.money.CurrencyUnit currencyUnit0 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean1 = currencyUnit0.isPseudoCurrency();
        boolean boolean2 = currencyUnit0.isPseudoCurrency();
        org.joda.money.BigMoney bigMoney3 = org.joda.money.BigMoney.zero(currencyUnit0);
        java.math.BigDecimal bigDecimal4 = bigMoney3.getAmountMajor();
        long long5 = bigMoney3.getAmountMajorLong();
        java.math.RoundingMode roundingMode7 = null;
        org.joda.money.BigMoney bigMoney8 = bigMoney3.plusRetainScale((double) (byte) 0, roundingMode7);
        org.joda.money.CurrencyUnit currencyUnit9 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean10 = currencyUnit9.isPseudoCurrency();
        boolean boolean11 = currencyUnit9.isPseudoCurrency();
        org.joda.money.BigMoney bigMoney12 = org.joda.money.BigMoney.zero(currencyUnit9);
        java.math.BigDecimal bigDecimal13 = bigMoney12.getAmountMajor();
        long long14 = bigMoney12.getAmountMajorLong();
        java.math.RoundingMode roundingMode16 = null;
        org.joda.money.BigMoney bigMoney17 = bigMoney12.plusRetainScale((double) (byte) 0, roundingMode16);
        org.joda.money.BigMoney bigMoney18 = org.joda.money.MoneyUtils.subtract(bigMoney8, bigMoney12);
        org.joda.money.CurrencyUnit currencyUnit19 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money20 = org.joda.money.Money.zero(currencyUnit19);
        org.joda.money.Money money22 = money20.minusMajor((long) ' ');
        java.lang.String str23 = money22.toString();
        org.joda.money.Money money25 = money22.minusMajor((long) (short) 1);
        org.joda.money.CurrencyUnit currencyUnit26 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money27 = org.joda.money.Money.zero(currencyUnit26);
        org.joda.money.Money money29 = money27.minusMajor((long) ' ');
        org.joda.money.Money money31 = money27.plus((double) (byte) 10);
        org.joda.money.Money money32 = org.joda.money.MoneyUtils.max(money25, money31);
        org.joda.money.Money money34 = money32.minusMinor((long) '.');
        boolean boolean35 = money34.isZero();
        boolean boolean36 = bigMoney18.isEqual((org.joda.money.BigMoneyProvider) money34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney18 and money20", (bigMoney18.compareTo(money20) == 0) == bigMoney18.equals(money20));
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test639");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.Money money12 = money10.negated();
        org.joda.money.Money money14 = money12.minusMajor(1L);
        org.joda.money.CurrencyUnit currencyUnit15 = money12.getCurrencyUnit();
        java.lang.String str16 = currencyUnit15.toString();
        org.joda.money.CurrencyUnit currencyUnit17 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money18 = org.joda.money.Money.zero(currencyUnit17);
        org.joda.money.BigMoney bigMoney20 = org.joda.money.BigMoney.ofMajor(currencyUnit17, (long) 'a');
        java.util.Set<java.lang.String> strSet21 = currencyUnit17.getCountryCodes();
        int int22 = currencyUnit17.getDecimalPlaces();
        org.joda.money.CurrencyMismatchException currencyMismatchException23 = new org.joda.money.CurrencyMismatchException(currencyUnit15, currencyUnit17);
        org.joda.money.CurrencyUnit currencyUnit24 = currencyMismatchException23.getFirstCurrency();
        org.joda.money.CurrencyUnit currencyUnit25 = currencyMismatchException23.getSecondCurrency();
        java.util.Set<java.lang.String> strSet26 = currencyUnit25.getCountryCodes();
        java.util.Currency currency27 = currencyUnit25.toCurrency();
        org.joda.money.BigMoney bigMoney29 = org.joda.money.BigMoney.of(currencyUnit25, 0.0d);
        java.util.Set<java.lang.String> strSet30 = currencyUnit25.getCountryCodes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money2 and bigMoney29", (money2.compareTo(bigMoney29) == 0) == money2.equals(bigMoney29));
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test640");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.Money money12 = money10.negated();
        boolean boolean13 = money12.isPositiveOrZero();
        boolean boolean14 = money12.isPositiveOrZero();
        org.joda.money.CurrencyUnit currencyUnit15 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean16 = currencyUnit15.isPseudoCurrency();
        java.lang.String str17 = currencyUnit15.getCode();
        org.joda.money.Money money18 = org.joda.money.Money.zero(currencyUnit15);
        org.joda.money.CurrencyUnit currencyUnit19 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money20 = org.joda.money.Money.zero(currencyUnit19);
        org.joda.money.Money money22 = money20.minusMajor((long) ' ');
        java.math.BigDecimal bigDecimal23 = money20.getAmountMinor();
        org.joda.money.Money money24 = org.joda.money.Money.of(currencyUnit15, bigDecimal23);
        org.joda.money.Money money26 = org.joda.money.Money.ofMajor(currencyUnit15, 31L);
        java.lang.String str27 = money26.toString();
        org.joda.money.Money money28 = money12.plus(money26);
        org.joda.money.CurrencyUnit currencyUnit30 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money31 = org.joda.money.Money.zero(currencyUnit30);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit30);
        org.joda.money.BigMoney bigMoney34 = org.joda.money.BigMoney.of(currencyUnit30, (double) '#');
        java.util.Currency currency35 = currencyUnit30.toCurrency();
        org.joda.money.CurrencyUnit currencyUnit36 = org.joda.money.CurrencyUnit.of(currency35);
        org.joda.money.Money money37 = money26.withCurrencyUnit(currencyUnit36);
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle38 = org.joda.money.format.MoneyAmountStyle.LOCALIZED_NO_GROUPING;
        org.joda.money.CurrencyUnit currencyUnit40 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money41 = org.joda.money.Money.zero(currencyUnit40);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit40);
        org.joda.money.BigMoney bigMoney44 = org.joda.money.BigMoney.of(currencyUnit40, (double) '#');
        boolean boolean45 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney44);
        org.joda.money.CurrencyUnit currencyUnit46 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money47 = org.joda.money.Money.zero(currencyUnit46);
        org.joda.money.Money money49 = money47.minusMajor((long) ' ');
        boolean boolean50 = bigMoney44.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money49);
        int int51 = bigMoney44.getAmountMajorInt();
        org.joda.money.CurrencyUnit currencyUnit53 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money54 = org.joda.money.Money.zero(currencyUnit53);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit53);
        org.joda.money.BigMoney bigMoney57 = org.joda.money.BigMoney.of(currencyUnit53, (double) '#');
        boolean boolean58 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney57);
        org.joda.money.CurrencyUnit currencyUnit59 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money60 = org.joda.money.Money.zero(currencyUnit59);
        org.joda.money.Money money62 = money60.minusMajor((long) ' ');
        boolean boolean63 = bigMoney57.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money62);
        org.joda.money.CurrencyUnit currencyUnit65 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money66 = org.joda.money.Money.zero(currencyUnit65);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit65);
        org.joda.money.BigMoney bigMoney69 = org.joda.money.BigMoney.of(currencyUnit65, (double) '#');
        org.joda.money.Money money70 = money62.withCurrencyUnit(currencyUnit65);
        org.joda.money.BigMoney bigMoney71 = bigMoney44.plus((org.joda.money.BigMoneyProvider) money62);
        long long72 = bigMoney71.getAmountMajorLong();
        org.joda.money.BigMoney bigMoney74 = bigMoney71.minusMinor((long) 0);
        org.joda.money.CurrencyUnit currencyUnit75 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean76 = currencyUnit75.isPseudoCurrency();
        java.lang.String str77 = currencyUnit75.getCode();
        org.joda.money.Money money78 = org.joda.money.Money.zero(currencyUnit75);
        org.joda.money.Money money80 = money78.withAmount((double) '+');
        boolean boolean81 = bigMoney74.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money78);
        java.math.BigDecimal bigDecimal82 = money78.getAmountMajor();
        boolean boolean83 = moneyAmountStyle38.equals((java.lang.Object) bigDecimal82);
        org.joda.money.Money money84 = money26.withAmount(bigDecimal82);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money26 and money37", (money26.compareTo(money37) == 0) == money26.equals(money37));
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test641");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit7);
        org.joda.money.BigMoney bigMoney11 = org.joda.money.BigMoney.of(currencyUnit7, (double) '#');
        boolean boolean12 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney11);
        org.joda.money.CurrencyUnit currencyUnit13 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money14 = org.joda.money.Money.zero(currencyUnit13);
        org.joda.money.Money money16 = money14.minusMajor((long) ' ');
        boolean boolean17 = bigMoney11.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money16);
        org.joda.money.CurrencyUnit currencyUnit19 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money20 = org.joda.money.Money.zero(currencyUnit19);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit19);
        org.joda.money.BigMoney bigMoney23 = org.joda.money.BigMoney.of(currencyUnit19, (double) '#');
        org.joda.money.Money money24 = money16.withCurrencyUnit(currencyUnit19);
        org.joda.money.CurrencyUnit currencyUnit26 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money27 = org.joda.money.Money.zero(currencyUnit26);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit26);
        org.joda.money.BigMoney bigMoney30 = org.joda.money.BigMoney.of(currencyUnit26, (double) '#');
        boolean boolean31 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney30);
        org.joda.money.CurrencyUnit currencyUnit32 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money33 = org.joda.money.Money.zero(currencyUnit32);
        org.joda.money.Money money35 = money33.minusMajor((long) ' ');
        boolean boolean36 = bigMoney30.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money35);
        org.joda.money.Money money37 = money35.negated();
        org.joda.money.Money money39 = money37.minusMajor(1L);
        org.joda.money.Money money41 = money39.minusMajor(100L);
        int int42 = money16.compareTo((org.joda.money.BigMoneyProvider) money39);
        java.math.BigDecimal bigDecimal43 = money16.getAmountMinor();
        org.joda.money.BigMoney bigMoney44 = bigMoney5.withAmount(bigDecimal43);
        org.joda.money.BigMoney bigMoney45 = bigMoney5.negated();
        int int46 = bigMoney5.getAmountMinorInt();
        org.joda.money.BigMoney bigMoney47 = bigMoney5.withCurrencyScale();
        boolean boolean48 = org.joda.money.MoneyUtils.isZero((org.joda.money.BigMoneyProvider) bigMoney47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney5 and bigMoney47", (bigMoney5.compareTo(bigMoney47) == 0) == bigMoney5.equals(bigMoney47));
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test642");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.BigMoney bigMoney13 = bigMoney5.multipliedBy((long) (byte) -1);
        org.joda.money.CurrencyUnit currencyUnit14 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money15 = org.joda.money.Money.zero(currencyUnit14);
        org.joda.money.CurrencyUnit currencyUnit16 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money17 = org.joda.money.Money.zero(currencyUnit16);
        org.joda.money.Money money19 = money17.minusMajor((long) ' ');
        boolean boolean20 = money15.isSameCurrency((org.joda.money.BigMoneyProvider) money19);
        boolean boolean21 = money19.isPositive();
        org.joda.money.CurrencyUnit currencyUnit23 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money24 = org.joda.money.Money.zero(currencyUnit23);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit23);
        org.joda.money.BigMoney bigMoney27 = org.joda.money.BigMoney.of(currencyUnit23, (double) '#');
        java.math.BigDecimal bigDecimal28 = bigMoney27.getAmountMajor();
        org.joda.money.BigMoney bigMoney29 = bigMoney27.abs();
        org.joda.money.CurrencyUnit currencyUnit31 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money32 = org.joda.money.Money.zero(currencyUnit31);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit31);
        org.joda.money.BigMoney bigMoney35 = org.joda.money.BigMoney.of(currencyUnit31, (double) '#');
        boolean boolean36 = bigMoney35.isPositive();
        org.joda.money.BigMoney bigMoney37 = bigMoney35.toBigMoney();
        org.joda.money.BigMoney bigMoney38 = org.joda.money.MoneyUtils.max(bigMoney29, bigMoney35);
        org.joda.money.CurrencyUnit currencyUnit39 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean40 = currencyUnit39.isPseudoCurrency();
        org.joda.money.Money money42 = org.joda.money.Money.ofMajor(currencyUnit39, (-1L));
        int int43 = currencyUnit39.getDecimalPlaces();
        org.joda.money.BigMoney bigMoney44 = bigMoney29.withCurrencyUnit(currencyUnit39);
        org.joda.money.BigMoney bigMoney46 = org.joda.money.BigMoney.ofMinor(currencyUnit39, (long) (byte) -1);
        org.joda.money.BigMoney bigMoney49 = org.joda.money.BigMoney.ofScale(currencyUnit39, (-9600L), (int) (short) 0);
        boolean boolean50 = money19.isEqual((org.joda.money.BigMoneyProvider) bigMoney49);
        org.joda.money.BigMoney bigMoney52 = bigMoney49.minusMajor((long) 3100);
        int int53 = bigMoney5.compareTo((org.joda.money.BigMoneyProvider) bigMoney49);
        org.joda.money.CurrencyUnit currencyUnit58 = org.joda.money.CurrencyUnit.registerCurrency("EUR", (int) '#', (int) (short) -1, true);
        org.joda.money.BigMoney bigMoney59 = org.joda.money.BigMoney.zero(currencyUnit58);
        boolean boolean60 = org.joda.money.MoneyUtils.isNegative((org.joda.money.BigMoneyProvider) bigMoney59);
        org.joda.money.BigMoney bigMoney62 = bigMoney59.withScale(35);
        boolean boolean63 = bigMoney49.isGreaterThan((org.joda.money.BigMoneyProvider) bigMoney59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money2 and bigMoney59", (money2.compareTo(bigMoney59) == 0) == money2.equals(bigMoney59));
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test643");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        int int12 = bigMoney5.getAmountMajorInt();
        org.joda.money.BigMoney bigMoney13 = bigMoney5.negated();
        int int14 = bigMoney5.getScale();
        org.joda.money.CurrencyUnit currencyUnit15 = bigMoney5.getCurrencyUnit();
        org.joda.money.CurrencyUnit currencyUnit17 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money18 = org.joda.money.Money.zero(currencyUnit17);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit17);
        org.joda.money.BigMoney bigMoney21 = org.joda.money.BigMoney.of(currencyUnit17, (double) '#');
        boolean boolean22 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney21);
        org.joda.money.CurrencyUnit currencyUnit23 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money24 = org.joda.money.Money.zero(currencyUnit23);
        org.joda.money.Money money26 = money24.minusMajor((long) ' ');
        boolean boolean27 = bigMoney21.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money26);
        org.joda.money.Money money28 = money26.negated();
        boolean boolean29 = org.joda.money.MoneyUtils.isPositiveOrZero((org.joda.money.BigMoneyProvider) money26);
        org.joda.money.CurrencyUnit currencyUnit31 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money32 = org.joda.money.Money.zero(currencyUnit31);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit31);
        org.joda.money.BigMoney bigMoney35 = org.joda.money.BigMoney.of(currencyUnit31, (double) '#');
        boolean boolean36 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney35);
        org.joda.money.CurrencyUnit currencyUnit37 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money38 = org.joda.money.Money.zero(currencyUnit37);
        org.joda.money.Money money40 = money38.minusMajor((long) ' ');
        boolean boolean41 = bigMoney35.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money40);
        org.joda.money.CurrencyUnit currencyUnit43 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money44 = org.joda.money.Money.zero(currencyUnit43);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit43);
        org.joda.money.BigMoney bigMoney47 = org.joda.money.BigMoney.of(currencyUnit43, (double) '#');
        org.joda.money.Money money48 = money40.withCurrencyUnit(currencyUnit43);
        org.joda.money.CurrencyUnit currencyUnit50 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money51 = org.joda.money.Money.zero(currencyUnit50);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit50);
        org.joda.money.BigMoney bigMoney54 = org.joda.money.BigMoney.of(currencyUnit50, (double) '#');
        boolean boolean55 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney54);
        org.joda.money.CurrencyUnit currencyUnit56 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money57 = org.joda.money.Money.zero(currencyUnit56);
        org.joda.money.Money money59 = money57.minusMajor((long) ' ');
        boolean boolean60 = bigMoney54.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money59);
        org.joda.money.Money money61 = money59.negated();
        org.joda.money.CurrencyUnit currencyUnit63 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money64 = org.joda.money.Money.zero(currencyUnit63);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit63);
        org.joda.money.BigMoney bigMoney67 = org.joda.money.BigMoney.of(currencyUnit63, (double) '#');
        boolean boolean68 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney67);
        org.joda.money.CurrencyUnit currencyUnit69 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money70 = org.joda.money.Money.zero(currencyUnit69);
        org.joda.money.Money money72 = money70.minusMajor((long) ' ');
        boolean boolean73 = bigMoney67.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money72);
        org.joda.money.Money money74 = money72.negated();
        org.joda.money.Money money75 = money59.minus(money74);
        org.joda.money.CurrencyUnit currencyUnit77 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money78 = org.joda.money.Money.zero(currencyUnit77);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit77);
        org.joda.money.BigMoney bigMoney81 = org.joda.money.BigMoney.of(currencyUnit77, (double) '#');
        boolean boolean82 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney81);
        org.joda.money.CurrencyUnit currencyUnit83 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money84 = org.joda.money.Money.zero(currencyUnit83);
        org.joda.money.Money money86 = money84.minusMajor((long) ' ');
        boolean boolean87 = bigMoney81.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money86);
        int int88 = bigMoney81.getAmountMajorInt();
        boolean boolean89 = money74.isLessThanOrEqual((org.joda.money.BigMoneyProvider) bigMoney81);
        java.math.BigDecimal bigDecimal90 = money74.getAmountMajor();
        org.joda.money.Money money91 = org.joda.money.Money.of(currencyUnit43, bigDecimal90);
        org.joda.money.Money money92 = money26.minus(bigDecimal90);
        org.joda.money.BigMoney bigMoney93 = org.joda.money.BigMoney.of(currencyUnit15, bigDecimal90);
        org.joda.money.BigMoney bigMoney96 = org.joda.money.BigMoney.ofScale(currencyUnit15, (-320000L), (int) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money28 and bigMoney93", (money28.compareTo(bigMoney93) == 0) == money28.equals(bigMoney93));
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test644");
        org.joda.money.CurrencyUnit currencyUnit0 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean1 = currencyUnit0.isPseudoCurrency();
        java.lang.String str2 = currencyUnit0.getCode();
        org.joda.money.Money money3 = org.joda.money.Money.zero(currencyUnit0);
        org.joda.money.CurrencyUnit currencyUnit4 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money5 = org.joda.money.Money.zero(currencyUnit4);
        org.joda.money.Money money7 = money5.minusMajor((long) ' ');
        java.math.BigDecimal bigDecimal8 = money5.getAmountMinor();
        org.joda.money.Money money9 = org.joda.money.Money.of(currencyUnit0, bigDecimal8);
        org.joda.money.BigMoney bigMoney11 = org.joda.money.BigMoney.ofMajor(currencyUnit0, 3L);
        org.joda.money.BigMoney bigMoney14 = org.joda.money.BigMoney.ofScale(currencyUnit0, (long) ',', (int) (byte) 10);
        org.joda.money.BigMoney bigMoney17 = org.joda.money.BigMoney.ofScale(currencyUnit0, (long) (-3200), (int) (short) -1);
        org.joda.money.BigMoney bigMoney19 = bigMoney17.withAmount((double) (-6900L));
        org.joda.money.BigMoney bigMoney20 = bigMoney19.withCurrencyScale();
        org.joda.money.CurrencyUnit currencyUnit22 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money23 = org.joda.money.Money.zero(currencyUnit22);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit22);
        org.joda.money.BigMoney bigMoney26 = org.joda.money.BigMoney.of(currencyUnit22, (double) '#');
        boolean boolean27 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney26);
        org.joda.money.CurrencyUnit currencyUnit28 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money29 = org.joda.money.Money.zero(currencyUnit28);
        org.joda.money.Money money31 = money29.minusMajor((long) ' ');
        boolean boolean32 = bigMoney26.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money31);
        org.joda.money.CurrencyUnit currencyUnit34 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money35 = org.joda.money.Money.zero(currencyUnit34);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit34);
        org.joda.money.BigMoney bigMoney38 = org.joda.money.BigMoney.of(currencyUnit34, (double) '#');
        org.joda.money.Money money39 = money31.withCurrencyUnit(currencyUnit34);
        org.joda.money.CurrencyUnit currencyUnit41 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money42 = org.joda.money.Money.zero(currencyUnit41);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit41);
        org.joda.money.BigMoney bigMoney45 = org.joda.money.BigMoney.of(currencyUnit41, (double) '#');
        boolean boolean46 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney45);
        org.joda.money.CurrencyUnit currencyUnit47 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money48 = org.joda.money.Money.zero(currencyUnit47);
        org.joda.money.Money money50 = money48.minusMajor((long) ' ');
        boolean boolean51 = bigMoney45.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money50);
        org.joda.money.Money money52 = money50.negated();
        org.joda.money.CurrencyUnit currencyUnit54 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money55 = org.joda.money.Money.zero(currencyUnit54);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit54);
        org.joda.money.BigMoney bigMoney58 = org.joda.money.BigMoney.of(currencyUnit54, (double) '#');
        boolean boolean59 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney58);
        org.joda.money.CurrencyUnit currencyUnit60 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money61 = org.joda.money.Money.zero(currencyUnit60);
        org.joda.money.Money money63 = money61.minusMajor((long) ' ');
        boolean boolean64 = bigMoney58.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money63);
        org.joda.money.Money money65 = money63.negated();
        org.joda.money.Money money66 = money50.minus(money65);
        org.joda.money.CurrencyUnit currencyUnit68 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money69 = org.joda.money.Money.zero(currencyUnit68);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit68);
        org.joda.money.BigMoney bigMoney72 = org.joda.money.BigMoney.of(currencyUnit68, (double) '#');
        boolean boolean73 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney72);
        org.joda.money.CurrencyUnit currencyUnit74 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money75 = org.joda.money.Money.zero(currencyUnit74);
        org.joda.money.Money money77 = money75.minusMajor((long) ' ');
        boolean boolean78 = bigMoney72.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money77);
        int int79 = bigMoney72.getAmountMajorInt();
        boolean boolean80 = money65.isLessThanOrEqual((org.joda.money.BigMoneyProvider) bigMoney72);
        java.math.BigDecimal bigDecimal81 = money65.getAmountMajor();
        org.joda.money.Money money82 = org.joda.money.Money.of(currencyUnit34, bigDecimal81);
        int int83 = currencyUnit34.getNumericCode();
        org.joda.money.BigMoney bigMoney85 = org.joda.money.BigMoney.ofMajor(currencyUnit34, (long) '0');
        org.joda.money.BigMoney bigMoney86 = bigMoney20.withCurrencyUnit(currencyUnit34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney19 and bigMoney86", (bigMoney19.compareTo(bigMoney86) == 0) == bigMoney19.equals(bigMoney86));
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test645");
        org.joda.money.CurrencyUnit currencyUnit0 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean1 = currencyUnit0.isPseudoCurrency();
        boolean boolean2 = currencyUnit0.isPseudoCurrency();
        org.joda.money.BigMoney bigMoney3 = org.joda.money.BigMoney.zero(currencyUnit0);
        java.math.BigDecimal bigDecimal4 = bigMoney3.getAmountMajor();
        long long5 = bigMoney3.getAmountMajorLong();
        java.math.RoundingMode roundingMode7 = null;
        org.joda.money.BigMoney bigMoney8 = bigMoney3.plusRetainScale((double) (byte) 0, roundingMode7);
        int int9 = bigMoney8.getAmountMinorInt();
        org.joda.money.CurrencyUnit currencyUnit11 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money12 = org.joda.money.Money.zero(currencyUnit11);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit11);
        org.joda.money.BigMoney bigMoney15 = org.joda.money.BigMoney.of(currencyUnit11, (double) '#');
        java.math.BigDecimal bigDecimal16 = bigMoney15.getAmountMajor();
        org.joda.money.BigMoney bigMoney17 = bigMoney15.abs();
        org.joda.money.BigMoney bigMoney18 = bigMoney17.negated();
        org.joda.money.CurrencyUnit currencyUnit19 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean20 = currencyUnit19.isPseudoCurrency();
        java.lang.String str21 = currencyUnit19.getCode();
        org.joda.money.Money money22 = org.joda.money.Money.zero(currencyUnit19);
        org.joda.money.CurrencyUnit currencyUnit23 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money24 = org.joda.money.Money.zero(currencyUnit23);
        org.joda.money.Money money26 = money24.minusMajor((long) ' ');
        java.math.BigDecimal bigDecimal27 = money24.getAmountMinor();
        org.joda.money.Money money28 = org.joda.money.Money.of(currencyUnit19, bigDecimal27);
        org.joda.money.BigMoney bigMoney29 = bigMoney17.minus(bigDecimal27);
        org.joda.money.BigMoney bigMoney30 = org.joda.money.MoneyUtils.max(bigMoney8, bigMoney29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney8 and money12", (bigMoney8.compareTo(money12) == 0) == bigMoney8.equals(money12));
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test646");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        java.math.BigDecimal bigDecimal6 = bigMoney5.getAmountMajor();
        org.joda.money.BigMoney bigMoney7 = bigMoney5.abs();
        org.joda.money.CurrencyUnit currencyUnit9 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money10 = org.joda.money.Money.zero(currencyUnit9);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit9);
        org.joda.money.BigMoney bigMoney13 = org.joda.money.BigMoney.of(currencyUnit9, (double) '#');
        boolean boolean14 = bigMoney13.isPositive();
        org.joda.money.BigMoney bigMoney15 = bigMoney13.toBigMoney();
        org.joda.money.BigMoney bigMoney16 = org.joda.money.MoneyUtils.max(bigMoney7, bigMoney13);
        org.joda.money.CurrencyUnit currencyUnit17 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean18 = currencyUnit17.isPseudoCurrency();
        org.joda.money.Money money20 = org.joda.money.Money.ofMajor(currencyUnit17, (-1L));
        int int21 = currencyUnit17.getDecimalPlaces();
        org.joda.money.BigMoney bigMoney22 = bigMoney7.withCurrencyUnit(currencyUnit17);
        org.joda.money.BigMoney bigMoney24 = bigMoney22.minus((double) (byte) -1);
        long long25 = bigMoney22.getAmountMajorLong();
        org.joda.money.BigMoney bigMoney27 = bigMoney22.minusMinor((long) 1000);
        org.joda.money.BigMoney bigMoney29 = bigMoney22.minusMinor(5800L);
        org.joda.money.Money money30 = org.joda.money.Money.of((org.joda.money.BigMoneyProvider) bigMoney22);
        org.joda.money.Money money32 = money30.minusMajor((long) 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney5 and money30", (bigMoney5.compareTo(money30) == 0) == bigMoney5.equals(money30));
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test647");
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder0 = new org.joda.money.format.MoneyFormatterBuilder();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder1 = moneyFormatterBuilder0.appendCurrencyNumeric3Code();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder2 = moneyFormatterBuilder0.appendCurrencyCode();
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle3 = org.joda.money.format.MoneyAmountStyle.ASCII_DECIMAL_POINT_GROUP3_SPACE;
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder4 = moneyFormatterBuilder2.appendAmount(moneyAmountStyle3);
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle5 = org.joda.money.format.MoneyAmountStyle.ASCII_DECIMAL_COMMA_NO_GROUPING;
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle7 = moneyAmountStyle5.withDecimalPointCharacter((java.lang.Character) '4');
        boolean boolean8 = moneyAmountStyle7.isAbsValue();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder9 = moneyFormatterBuilder2.appendAmount(moneyAmountStyle7);
        org.joda.money.format.MoneyFormatter moneyFormatter10 = moneyFormatterBuilder9.toFormatter();
        java.util.Locale locale11 = moneyFormatter10.getLocale();
        org.joda.money.CurrencyUnit currencyUnit12 = org.joda.money.CurrencyUnit.of(locale11);
        org.joda.money.CurrencyUnit currencyUnit14 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money15 = org.joda.money.Money.zero(currencyUnit14);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit14);
        org.joda.money.Money money18 = org.joda.money.Money.ofMajor(currencyUnit14, (long) (byte) 10);
        int int19 = currencyUnit14.getDecimalPlaces();
        int int20 = currencyUnit12.compareTo(currencyUnit14);
        org.joda.money.BigMoney bigMoney22 = org.joda.money.BigMoney.zero(currencyUnit14, (int) (byte) 100);
        org.joda.money.CurrencyUnit currencyUnit24 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money25 = org.joda.money.Money.zero(currencyUnit24);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit24);
        org.joda.money.BigMoney bigMoney28 = org.joda.money.BigMoney.of(currencyUnit24, (double) '#');
        boolean boolean29 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney28);
        org.joda.money.CurrencyUnit currencyUnit30 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money31 = org.joda.money.Money.zero(currencyUnit30);
        org.joda.money.Money money33 = money31.minusMajor((long) ' ');
        boolean boolean34 = bigMoney28.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money33);
        org.joda.money.Money money36 = money33.multipliedBy((long) (byte) 10);
        org.joda.money.Money money38 = money36.minusMajor((long) (byte) 10);
        org.joda.money.CurrencyUnit currencyUnit40 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money41 = org.joda.money.Money.zero(currencyUnit40);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit40);
        org.joda.money.BigMoney bigMoney44 = org.joda.money.BigMoney.of(currencyUnit40, (double) '#');
        boolean boolean45 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney44);
        org.joda.money.CurrencyUnit currencyUnit46 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money47 = org.joda.money.Money.zero(currencyUnit46);
        org.joda.money.Money money49 = money47.minusMajor((long) ' ');
        boolean boolean50 = bigMoney44.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money49);
        org.joda.money.Money money51 = money49.negated();
        org.joda.money.Money money53 = money51.minusMajor(1L);
        org.joda.money.Money money55 = money53.plusMinor((long) 35);
        org.joda.money.CurrencyUnit currencyUnit56 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money57 = org.joda.money.Money.zero(currencyUnit56);
        org.joda.money.Money money59 = money57.minusMajor((long) ' ');
        org.joda.money.Money money60 = org.joda.money.MoneyUtils.min(money55, money59);
        boolean boolean61 = org.joda.money.MoneyUtils.isPositive((org.joda.money.BigMoneyProvider) money60);
        org.joda.money.Money[] moneyArray62 = new org.joda.money.Money[] { money38, money60 };
        org.joda.money.Money money63 = org.joda.money.Money.total(moneyArray62);
        org.joda.money.Money money64 = org.joda.money.Money.total(currencyUnit14, moneyArray62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money15 and bigMoney22", (money15.compareTo(bigMoney22) == 0) == money15.equals(bigMoney22));
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test648");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        org.joda.money.BigMoney bigMoney7 = org.joda.money.BigMoney.ofMinor(currencyUnit1, (long) (byte) -1);
        int int8 = bigMoney7.getAmountMinorInt();
        org.joda.money.CurrencyUnit currencyUnit10 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money11 = org.joda.money.Money.zero(currencyUnit10);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit10);
        org.joda.money.BigMoney bigMoney14 = org.joda.money.BigMoney.of(currencyUnit10, (double) '#');
        boolean boolean15 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney14);
        int int16 = bigMoney14.getMinorPart();
        boolean boolean17 = bigMoney14.isPositive();
        org.joda.money.BigMoney bigMoney18 = org.joda.money.MoneyUtils.subtract(bigMoney7, bigMoney14);
        org.joda.money.Money money19 = bigMoney7.toMoney();
        org.joda.money.BigMoney bigMoney20 = bigMoney7.withCurrencyScale();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney20 and money19", (bigMoney20.compareTo(money19) == 0) == bigMoney20.equals(money19));
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test649");
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder0 = new org.joda.money.format.MoneyFormatterBuilder();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder1 = moneyFormatterBuilder0.appendCurrencyNumeric3Code();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder2 = moneyFormatterBuilder0.appendCurrencyCode();
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle3 = org.joda.money.format.MoneyAmountStyle.ASCII_DECIMAL_POINT_GROUP3_SPACE;
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder4 = moneyFormatterBuilder2.appendAmount(moneyAmountStyle3);
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle5 = org.joda.money.format.MoneyAmountStyle.ASCII_DECIMAL_COMMA_NO_GROUPING;
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle7 = moneyAmountStyle5.withDecimalPointCharacter((java.lang.Character) '4');
        boolean boolean8 = moneyAmountStyle7.isAbsValue();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder9 = moneyFormatterBuilder2.appendAmount(moneyAmountStyle7);
        org.joda.money.format.MoneyFormatter moneyFormatter10 = moneyFormatterBuilder9.toFormatter();
        java.util.Locale locale11 = moneyFormatter10.getLocale();
        org.joda.money.BigMoney bigMoney13 = org.joda.money.BigMoney.parse("EUR -32.00");
        org.joda.money.BigMoney bigMoney15 = bigMoney13.plus((double) 10L);
        boolean boolean16 = org.joda.money.MoneyUtils.isPositive((org.joda.money.BigMoneyProvider) bigMoney15);
        org.joda.money.BigMoney bigMoney17 = bigMoney15.negated();
        org.joda.money.CurrencyUnit currencyUnit18 = org.joda.money.CurrencyUnit.EUR;
        boolean boolean19 = currencyUnit18.isPseudoCurrency();
        boolean boolean20 = currencyUnit18.isPseudoCurrency();
        org.joda.money.BigMoney bigMoney21 = org.joda.money.BigMoney.zero(currencyUnit18);
        org.joda.money.BigMoney bigMoney23 = bigMoney21.multipliedBy((-1L));
        long long24 = bigMoney21.getAmountMajorLong();
        java.math.BigDecimal bigDecimal25 = bigMoney21.getAmount();
        org.joda.money.BigMoney bigMoney26 = bigMoney21.negated();
        boolean boolean27 = bigMoney15.isGreaterThan((org.joda.money.BigMoneyProvider) bigMoney26);
        java.lang.String str28 = moneyFormatter10.print((org.joda.money.BigMoneyProvider) bigMoney15);
        org.joda.money.CurrencyUnit currencyUnit29 = bigMoney15.getCurrencyUnit();
        boolean boolean30 = bigMoney15.isNegative();
        org.joda.money.BigMoney bigMoney31 = bigMoney15.negated();
        org.joda.money.CurrencyUnit currencyUnit33 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money34 = org.joda.money.Money.zero(currencyUnit33);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit33);
        org.joda.money.BigMoney bigMoney37 = org.joda.money.BigMoney.of(currencyUnit33, (double) '#');
        org.joda.money.CurrencyUnit currencyUnit39 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money40 = org.joda.money.Money.zero(currencyUnit39);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit39);
        org.joda.money.BigMoney bigMoney43 = org.joda.money.BigMoney.of(currencyUnit39, (double) '#');
        boolean boolean44 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney43);
        org.joda.money.CurrencyUnit currencyUnit45 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money46 = org.joda.money.Money.zero(currencyUnit45);
        org.joda.money.Money money48 = money46.minusMajor((long) ' ');
        boolean boolean49 = bigMoney43.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money48);
        org.joda.money.Money money50 = money48.negated();
        org.joda.money.Money money52 = money50.minusMajor(1L);
        org.joda.money.Money money54 = money52.plusMinor((long) 35);
        org.joda.money.CurrencyUnit currencyUnit55 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money56 = org.joda.money.Money.zero(currencyUnit55);
        org.joda.money.Money money58 = money56.minusMajor((long) ' ');
        org.joda.money.Money money59 = org.joda.money.MoneyUtils.min(money54, money58);
        boolean boolean60 = bigMoney37.isLessThan((org.joda.money.BigMoneyProvider) money59);
        org.joda.money.CurrencyUnit currencyUnit61 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money62 = org.joda.money.Money.zero(currencyUnit61);
        org.joda.money.CurrencyUnit currencyUnit63 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money64 = org.joda.money.Money.zero(currencyUnit63);
        org.joda.money.Money money66 = money64.minusMajor((long) ' ');
        boolean boolean67 = money62.isSameCurrency((org.joda.money.BigMoneyProvider) money66);
        org.joda.money.Money money68 = org.joda.money.MoneyUtils.add(money59, money62);
        boolean boolean69 = bigMoney15.isEqual((org.joda.money.BigMoneyProvider) money59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney13 and money48", (bigMoney13.compareTo(money48) == 0) == bigMoney13.equals(money48));
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test650");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.Money money12 = money10.negated();
        org.joda.money.CurrencyUnit currencyUnit14 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money15 = org.joda.money.Money.zero(currencyUnit14);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit14);
        org.joda.money.BigMoney bigMoney18 = org.joda.money.BigMoney.of(currencyUnit14, (double) '#');
        boolean boolean19 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney18);
        org.joda.money.CurrencyUnit currencyUnit20 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money21 = org.joda.money.Money.zero(currencyUnit20);
        org.joda.money.Money money23 = money21.minusMajor((long) ' ');
        boolean boolean24 = bigMoney18.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money23);
        org.joda.money.Money money25 = money23.negated();
        org.joda.money.CurrencyUnit currencyUnit27 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money28 = org.joda.money.Money.zero(currencyUnit27);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit27);
        org.joda.money.BigMoney bigMoney31 = org.joda.money.BigMoney.of(currencyUnit27, (double) '#');
        boolean boolean32 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney31);
        org.joda.money.CurrencyUnit currencyUnit33 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money34 = org.joda.money.Money.zero(currencyUnit33);
        org.joda.money.Money money36 = money34.minusMajor((long) ' ');
        boolean boolean37 = bigMoney31.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money36);
        org.joda.money.Money money38 = money36.negated();
        org.joda.money.Money money39 = money23.minus(money38);
        org.joda.money.Money money40 = money10.minus(money39);
        org.joda.money.CurrencyUnit currencyUnit42 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money43 = org.joda.money.Money.zero(currencyUnit42);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit42);
        org.joda.money.BigMoney bigMoney46 = org.joda.money.BigMoney.of(currencyUnit42, (double) '#');
        boolean boolean47 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney46);
        org.joda.money.CurrencyUnit currencyUnit48 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money49 = org.joda.money.Money.zero(currencyUnit48);
        org.joda.money.Money money51 = money49.minusMajor((long) ' ');
        boolean boolean52 = bigMoney46.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money51);
        org.joda.money.Money money53 = money51.negated();
        org.joda.money.CurrencyUnit currencyUnit55 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money56 = org.joda.money.Money.zero(currencyUnit55);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit55);
        org.joda.money.BigMoney bigMoney59 = org.joda.money.BigMoney.of(currencyUnit55, (double) '#');
        boolean boolean60 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney59);
        org.joda.money.CurrencyUnit currencyUnit61 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money62 = org.joda.money.Money.zero(currencyUnit61);
        org.joda.money.Money money64 = money62.minusMajor((long) ' ');
        boolean boolean65 = bigMoney59.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money64);
        org.joda.money.Money money66 = money64.negated();
        org.joda.money.CurrencyUnit currencyUnit68 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money69 = org.joda.money.Money.zero(currencyUnit68);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit68);
        org.joda.money.BigMoney bigMoney72 = org.joda.money.BigMoney.of(currencyUnit68, (double) '#');
        boolean boolean73 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney72);
        org.joda.money.CurrencyUnit currencyUnit74 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money75 = org.joda.money.Money.zero(currencyUnit74);
        org.joda.money.Money money77 = money75.minusMajor((long) ' ');
        boolean boolean78 = bigMoney72.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money77);
        org.joda.money.Money money79 = money77.negated();
        org.joda.money.Money money80 = money64.minus(money79);
        org.joda.money.Money money81 = money51.minus(money80);
        org.joda.money.Money money82 = money39.plus(money81);
        org.joda.money.BigMoney bigMoney83 = money39.toBigMoney();
        boolean boolean84 = bigMoney83.isPositiveOrZero();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money39 and bigMoney83", (money39.compareTo(bigMoney83) == 0) == money39.equals(bigMoney83));
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test651");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit7);
        org.joda.money.BigMoney bigMoney11 = org.joda.money.BigMoney.of(currencyUnit7, (double) '#');
        boolean boolean12 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney11);
        org.joda.money.CurrencyUnit currencyUnit13 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money14 = org.joda.money.Money.zero(currencyUnit13);
        org.joda.money.Money money16 = money14.minusMajor((long) ' ');
        boolean boolean17 = bigMoney11.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money16);
        org.joda.money.CurrencyUnit currencyUnit19 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money20 = org.joda.money.Money.zero(currencyUnit19);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit19);
        org.joda.money.BigMoney bigMoney23 = org.joda.money.BigMoney.of(currencyUnit19, (double) '#');
        org.joda.money.Money money24 = money16.withCurrencyUnit(currencyUnit19);
        org.joda.money.CurrencyUnit currencyUnit26 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money27 = org.joda.money.Money.zero(currencyUnit26);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit26);
        org.joda.money.BigMoney bigMoney30 = org.joda.money.BigMoney.of(currencyUnit26, (double) '#');
        boolean boolean31 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney30);
        org.joda.money.CurrencyUnit currencyUnit32 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money33 = org.joda.money.Money.zero(currencyUnit32);
        org.joda.money.Money money35 = money33.minusMajor((long) ' ');
        boolean boolean36 = bigMoney30.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money35);
        org.joda.money.Money money37 = money35.negated();
        org.joda.money.Money money39 = money37.minusMajor(1L);
        org.joda.money.Money money41 = money39.minusMajor(100L);
        int int42 = money16.compareTo((org.joda.money.BigMoneyProvider) money39);
        java.math.BigDecimal bigDecimal43 = money16.getAmountMinor();
        org.joda.money.BigMoney bigMoney44 = bigMoney5.withAmount(bigDecimal43);
        org.joda.money.BigMoney bigMoney45 = bigMoney5.negated();
        int int46 = bigMoney5.getAmountMinorInt();
        org.joda.money.BigMoney bigMoney47 = bigMoney5.withCurrencyScale();
        org.joda.money.BigMoney bigMoney49 = bigMoney47.minus((double) (-3235000L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney5 and bigMoney47", (bigMoney5.compareTo(bigMoney47) == 0) == bigMoney5.equals(bigMoney47));
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test652");
        org.joda.money.BigMoney bigMoney1 = org.joda.money.BigMoney.parse("EUR -32.00");
        org.joda.money.BigMoney bigMoney2 = org.joda.money.BigMoney.of((org.joda.money.BigMoneyProvider) bigMoney1);
        org.joda.money.BigMoney bigMoney4 = bigMoney2.multipliedBy((long) 100);
        org.joda.money.CurrencyUnit currencyUnit6 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money7 = org.joda.money.Money.zero(currencyUnit6);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit6);
        org.joda.money.BigMoney bigMoney10 = org.joda.money.BigMoney.of(currencyUnit6, (double) '#');
        boolean boolean11 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney10);
        org.joda.money.CurrencyUnit currencyUnit12 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money13 = org.joda.money.Money.zero(currencyUnit12);
        org.joda.money.Money money15 = money13.minusMajor((long) ' ');
        boolean boolean16 = bigMoney10.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money15);
        int int17 = bigMoney10.getAmountMajorInt();
        org.joda.money.CurrencyUnit currencyUnit19 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money20 = org.joda.money.Money.zero(currencyUnit19);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit19);
        org.joda.money.BigMoney bigMoney23 = org.joda.money.BigMoney.of(currencyUnit19, (double) '#');
        boolean boolean24 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney23);
        org.joda.money.CurrencyUnit currencyUnit25 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money26 = org.joda.money.Money.zero(currencyUnit25);
        org.joda.money.Money money28 = money26.minusMajor((long) ' ');
        boolean boolean29 = bigMoney23.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money28);
        org.joda.money.CurrencyUnit currencyUnit31 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money32 = org.joda.money.Money.zero(currencyUnit31);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit31);
        org.joda.money.BigMoney bigMoney35 = org.joda.money.BigMoney.of(currencyUnit31, (double) '#');
        org.joda.money.Money money36 = money28.withCurrencyUnit(currencyUnit31);
        org.joda.money.BigMoney bigMoney37 = bigMoney10.plus((org.joda.money.BigMoneyProvider) money28);
        long long38 = bigMoney37.getAmountMajorLong();
        org.joda.money.BigMoney bigMoney40 = bigMoney37.minus((double) (byte) 100);
        boolean boolean41 = bigMoney2.isGreaterThan((org.joda.money.BigMoneyProvider) bigMoney40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney2 and money15", (bigMoney2.compareTo(money15) == 0) == bigMoney2.equals(money15));
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test653");
        org.joda.money.CurrencyUnit currencyUnit0 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money1 = org.joda.money.Money.zero(currencyUnit0);
        org.joda.money.CurrencyUnit currencyUnit2 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money3 = org.joda.money.Money.zero(currencyUnit2);
        org.joda.money.Money money5 = money3.minusMajor((long) ' ');
        java.math.BigDecimal bigDecimal6 = money3.getAmountMinor();
        org.joda.money.BigMoney bigMoney7 = org.joda.money.BigMoney.of(currencyUnit0, bigDecimal6);
        java.util.Currency currency8 = currencyUnit0.toCurrency();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money1 and bigMoney7", (money1.compareTo(bigMoney7) == 0) == money1.equals(bigMoney7));
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test654");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.Money money12 = money10.negated();
        org.joda.money.CurrencyUnit currencyUnit14 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money15 = org.joda.money.Money.zero(currencyUnit14);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit14);
        org.joda.money.BigMoney bigMoney18 = org.joda.money.BigMoney.of(currencyUnit14, (double) '#');
        boolean boolean19 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney18);
        org.joda.money.CurrencyUnit currencyUnit20 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money21 = org.joda.money.Money.zero(currencyUnit20);
        org.joda.money.Money money23 = money21.minusMajor((long) ' ');
        boolean boolean24 = bigMoney18.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money23);
        org.joda.money.Money money25 = money23.negated();
        org.joda.money.CurrencyUnit currencyUnit27 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money28 = org.joda.money.Money.zero(currencyUnit27);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit27);
        org.joda.money.BigMoney bigMoney31 = org.joda.money.BigMoney.of(currencyUnit27, (double) '#');
        boolean boolean32 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney31);
        org.joda.money.CurrencyUnit currencyUnit33 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money34 = org.joda.money.Money.zero(currencyUnit33);
        org.joda.money.Money money36 = money34.minusMajor((long) ' ');
        boolean boolean37 = bigMoney31.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money36);
        org.joda.money.Money money38 = money36.negated();
        org.joda.money.Money money39 = money23.minus(money38);
        org.joda.money.Money money40 = money10.minus(money39);
        org.joda.money.CurrencyUnit currencyUnit42 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money43 = org.joda.money.Money.zero(currencyUnit42);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit42);
        org.joda.money.BigMoney bigMoney46 = org.joda.money.BigMoney.of(currencyUnit42, (double) '#');
        java.math.BigDecimal bigDecimal47 = bigMoney46.getAmountMajor();
        org.joda.money.BigMoney bigMoney48 = bigMoney46.abs();
        boolean boolean49 = org.joda.money.MoneyUtils.isNegative((org.joda.money.BigMoneyProvider) bigMoney48);
        java.math.BigDecimal bigDecimal50 = bigMoney48.getAmount();
        org.joda.money.Money money51 = money40.plus(bigDecimal50);
        org.joda.money.CurrencyUnit currencyUnit53 = org.joda.money.CurrencyUnit.of("EUR");
        org.joda.money.BigMoney bigMoney55 = org.joda.money.BigMoney.ofMinor(currencyUnit53, (long) '0');
        org.joda.money.Money money56 = org.joda.money.Money.zero(currencyUnit53);
        int int57 = currencyUnit53.getDecimalPlaces();
        java.util.Currency currency58 = currencyUnit53.toCurrency();
        org.joda.money.BigMoney bigMoney60 = org.joda.money.BigMoney.ofMinor(currencyUnit53, (long) 10);
        java.lang.String str61 = bigMoney60.toString();
        boolean boolean62 = money51.isLessThan((org.joda.money.BigMoneyProvider) bigMoney60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on money2 and money56", (money2.compareTo(money56) == 0) == money2.equals(money56));
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test655");
        org.joda.money.CurrencyUnit currencyUnit1 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money2 = org.joda.money.Money.zero(currencyUnit1);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit1);
        org.joda.money.BigMoney bigMoney5 = org.joda.money.BigMoney.of(currencyUnit1, (double) '#');
        boolean boolean6 = org.joda.money.MoneyUtils.isNegativeOrZero((org.joda.money.BigMoneyProvider) bigMoney5);
        org.joda.money.CurrencyUnit currencyUnit7 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money8 = org.joda.money.Money.zero(currencyUnit7);
        org.joda.money.Money money10 = money8.minusMajor((long) ' ');
        boolean boolean11 = bigMoney5.isLessThanOrEqual((org.joda.money.BigMoneyProvider) money10);
        org.joda.money.CurrencyUnit currencyUnit13 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money14 = org.joda.money.Money.zero(currencyUnit13);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit13);
        org.joda.money.BigMoney bigMoney17 = org.joda.money.BigMoney.of(currencyUnit13, (double) '#');
        org.joda.money.Money money18 = money10.withCurrencyUnit(currencyUnit13);
        org.joda.money.BigMoney bigMoney20 = org.joda.money.BigMoney.ofMajor(currencyUnit13, (-1L));
        org.joda.money.Money money21 = org.joda.money.Money.zero(currencyUnit13);
        org.joda.money.CurrencyUnit currencyUnit23 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money24 = org.joda.money.Money.zero(currencyUnit23);
        org.joda.money.CurrencyUnit.registerCountry("hi!", currencyUnit23);
        org.joda.money.BigMoney bigMoney27 = org.joda.money.BigMoney.of(currencyUnit23, (double) '#');
        boolean boolean28 = money21.equals((java.lang.Object) currencyUnit23);
        org.joda.money.CurrencyUnit currencyUnit29 = org.joda.money.CurrencyUnit.EUR;
        org.joda.money.Money money30 = org.joda.money.Money.zero(currencyUnit29);
        org.joda.money.Money money32 = money30.minusMajor((long) ' ');
        java.lang.String str33 = money32.toString();
        org.joda.money.Money money35 = money32.minusMajor((long) (short) 1);
        org.joda.money.Money money37 = money32.minusMinor((long) '#');
        org.joda.money.CurrencyUnit currencyUnit38 = money37.getCurrencyUnit();
        org.joda.money.CurrencyMismatchException currencyMismatchException39 = new org.joda.money.CurrencyMismatchException(currencyUnit23, currencyUnit38);
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder40 = new org.joda.money.format.MoneyFormatterBuilder();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder41 = moneyFormatterBuilder40.appendCurrencyNumeric3Code();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder42 = moneyFormatterBuilder40.appendCurrencyCode();
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle43 = org.joda.money.format.MoneyAmountStyle.ASCII_DECIMAL_POINT_GROUP3_SPACE;
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder44 = moneyFormatterBuilder42.appendAmount(moneyAmountStyle43);
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder45 = new org.joda.money.format.MoneyFormatterBuilder();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder46 = moneyFormatterBuilder45.appendCurrencyNumeric3Code();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder47 = moneyFormatterBuilder45.appendCurrencyCode();
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle48 = org.joda.money.format.MoneyAmountStyle.ASCII_DECIMAL_POINT_GROUP3_SPACE;
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder49 = moneyFormatterBuilder47.appendAmount(moneyAmountStyle48);
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle50 = org.joda.money.format.MoneyAmountStyle.ASCII_DECIMAL_COMMA_NO_GROUPING;
        org.joda.money.format.MoneyAmountStyle moneyAmountStyle52 = moneyAmountStyle50.withDecimalPointCharacter((java.lang.Character) '4');
        boolean boolean53 = moneyAmountStyle52.isAbsValue();
        org.joda.money.format.MoneyFormatterBuilder moneyFormatterBuilder54 = moneyFormatterBuilder47.appendAmount(moneyAmountStyle52);
        org.joda.money.format.MoneyFormatter moneyFormatter55 = moneyFormatterBuilder54.toFormatter();
        java.util.Locale locale56 = moneyFormatter55.getLocale();
        org.joda.money.format.MoneyFormatter moneyFormatter57 = moneyFormatterBuilder42.toFormatter(locale56);
        org.joda.money.CurrencyUnit currencyUnit58 = org.joda.money.CurrencyUnit.of(locale56);
        org.joda.money.Money money60 = org.joda.money.Money.ofMajor(currencyUnit58, 35L);
        org.joda.money.CurrencyMismatchException currencyMismatchException61 = new org.joda.money.CurrencyMismatchException(currencyUnit23, currencyUnit58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigMoney5 and money60", (bigMoney5.compareTo(money60) == 0) == bigMoney5.equals(money60));
    }
}

