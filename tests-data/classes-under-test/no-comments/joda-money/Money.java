package org.joda.money;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Iterator;

import org.joda.convert.FromString;
import org.joda.convert.ToString;


public final class Money implements BigMoneyProvider, Comparable<BigMoneyProvider>, Serializable {

    private static final long serialVersionUID = 1L;

    private final BigMoney money;
    
    public static Money of(CurrencyUnit currency, BigDecimal amount) {
        MoneyUtils.checkNotNull(currency, "Currency must not be null");
        MoneyUtils.checkNotNull(amount, "Amount must not be null");
        if (amount.scale() > currency.getDecimalPlaces()) {
            throw new ArithmeticException("Scale of amount " + amount + " is greater than the scale of the currency " + currency);
        }
        return Money.of(currency, amount, RoundingMode.UNNECESSARY);
    }

    public static Money of(CurrencyUnit currency, BigDecimal amount, RoundingMode roundingMode) {
        MoneyUtils.checkNotNull(currency, "CurrencyUnit must not be null");
        MoneyUtils.checkNotNull(amount, "Amount must not be null");
        MoneyUtils.checkNotNull(roundingMode, "RoundingMode must not be null");
        BigDecimal scaledAmount = amount.setScale(currency.getDecimalPlaces(), roundingMode);
        return new Money(BigMoney.of(currency, scaledAmount));
    }
    
    public static Money of(CurrencyUnit currency, double amount) {
        return Money.of(currency, BigDecimal.valueOf(amount));
    }

    public static Money of(CurrencyUnit currency, double amount, RoundingMode roundingMode) {
        return Money.of(currency, BigDecimal.valueOf(amount), roundingMode);
    }
    
    public static Money ofMajor(CurrencyUnit currency, long amountMajor) {
        return Money.of(currency, BigDecimal.valueOf(amountMajor), RoundingMode.UNNECESSARY);
    }
    
    public static Money ofMinor(CurrencyUnit currency, long amountMinor) {
        return new Money(BigMoney.ofMinor(currency, amountMinor));
    }
    
    public static Money zero(CurrencyUnit currency) {
        MoneyUtils.checkNotNull(currency, "Currency must not be null");
        BigDecimal bd = BigDecimal.valueOf(0, currency.getDecimalPlaces());
        return new Money(BigMoney.of(currency, bd));
    }
    
    public static Money of(BigMoneyProvider moneyProvider) {
        return Money.of(moneyProvider, RoundingMode.UNNECESSARY);
    }

    public static Money of(BigMoneyProvider moneyProvider, RoundingMode roundingMode) {
        MoneyUtils.checkNotNull(moneyProvider, "BigMoneyProvider must not be null");
        MoneyUtils.checkNotNull(roundingMode, "RoundingMode must not be null");
        return new Money(BigMoney.of(moneyProvider).withCurrencyScale(roundingMode));
    }
    
    public static Money total(Money... monies) {
        MoneyUtils.checkNotNull(monies, "Money array must not be null");
        if (monies.length == 0) {
            throw new IllegalArgumentException("Money array must not be empty");
        }
        Money total = monies[0];
        MoneyUtils.checkNotNull(total, "Money arary must not contain null entries");
        for (int i = 1; i < monies.length; i++) {
            total = total.plus(monies[i]);
        }
        return total;
    }

    public static Money total(Iterable<Money> monies) {
        MoneyUtils.checkNotNull(monies, "Money iterator must not be null");
        Iterator<Money> it = monies.iterator();
        if (it.hasNext() == false) {
            throw new IllegalArgumentException("Money iterator must not be empty");
        }
        Money total = it.next();
        MoneyUtils.checkNotNull(total, "Money iterator must not contain null entries");
        while (it.hasNext()) {
            total = total.plus(it.next());
        }
        return total;
    }
    
    public static Money total(CurrencyUnit currency, Money... monies) {
        return Money.zero(currency).plus(Arrays.asList(monies));
    }
    
    public static Money total(CurrencyUnit currency, Iterable<Money> monies) {
        return Money.zero(currency).plus(monies);
    }

    @FromString
    public static Money parse(String moneyStr) {
        return Money.of(BigMoney.parse(moneyStr));
    }

    
    
    @SuppressWarnings("unused")
    private Money() {
        this.money = null;
    }

    Money(BigMoney money) {
        assert money != null : "Joda-Money bug: BigMoney must not be null";
        assert money.isCurrencyScale() : "Joda-Money bug: Only currency scale is valid for Money";
        this.money = money;
    }

    private void readObject(ObjectInputStream ois) throws InvalidObjectException {
        throw new InvalidObjectException("Serialization delegate required");
    }
    
    private Object writeReplace() {
        return new Ser(Ser.MONEY, this);
    }
    
    private Money with(BigMoney newInstance) {
        if (money.equals(newInstance)) {
            return this;
        }
        return new Money(newInstance);
    }

    public CurrencyUnit getCurrencyUnit() {
        return money.getCurrencyUnit();
    }
    
    public Money withCurrencyUnit(CurrencyUnit currency) {
        return withCurrencyUnit(currency, RoundingMode.UNNECESSARY);
    }

    public Money withCurrencyUnit(CurrencyUnit currency, RoundingMode roundingMode) {
        return with(money.withCurrencyUnit(currency).withCurrencyScale(roundingMode));
    }

    public int getScale() {
        return money.getScale();
    }
    
    public BigDecimal getAmount() {
        return money.getAmount();
    }

    public BigDecimal getAmountMajor() {
        return money.getAmountMajor();
    }

    public long getAmountMajorLong() {
        return money.getAmountMajorLong();
    }

    public int getAmountMajorInt() {
        return money.getAmountMajorInt();
    }

    public BigDecimal getAmountMinor() {
        return money.getAmountMinor();
    }
    
    public long getAmountMinorLong() {
        return money.getAmountMinorLong();
    }
    
    public int getAmountMinorInt() {
        return money.getAmountMinorInt();
    }

    public int getMinorPart() {
        return money.getMinorPart();
    }
    
    public boolean isZero() {
        return money.isZero();
    }

    public boolean isPositive() {
        return money.isPositive();
    }

    public boolean isPositiveOrZero() {
        return money.isPositiveOrZero();
    }

    public boolean isNegative() {
        return money.isNegative();
    }

    public boolean isNegativeOrZero() {
        return money.isNegativeOrZero();
    }
    
    public Money withAmount(BigDecimal amount) {
        return withAmount(amount, RoundingMode.UNNECESSARY);
    }
    
    public Money withAmount(BigDecimal amount, RoundingMode roundingMode) {
        return with(money.withAmount(amount).withCurrencyScale(roundingMode));
    }

    public Money withAmount(double amount) {
        return withAmount(amount, RoundingMode.UNNECESSARY);
    }

    public Money withAmount(double amount, RoundingMode roundingMode) {
        return with(money.withAmount(amount).withCurrencyScale(roundingMode));
    }

    public Money plus(Iterable<Money> moniesToAdd) {
        return with(money.plus(moniesToAdd));
    }

    public Money plus(Money moneyToAdd) {
        return with(money.plus(moneyToAdd));
    }

    public Money plus(BigDecimal amountToAdd) {
        return plus(amountToAdd, RoundingMode.UNNECESSARY);
    }

    public Money plus(BigDecimal amountToAdd, RoundingMode roundingMode) {
        return with(money.plusRetainScale(amountToAdd, roundingMode));
    }

    public Money plus(double amountToAdd) {
        return plus(amountToAdd, RoundingMode.UNNECESSARY);
    }

    public Money plus(double amountToAdd, RoundingMode roundingMode) {
        return with(money.plusRetainScale(amountToAdd, roundingMode));
    }
    
    public Money plusMajor(long amountToAdd) {
        return with(money.plusMajor(amountToAdd));
    }

    public Money plusMinor(long amountToAdd) {
        return with(money.plusMinor(amountToAdd));
    }
    
    public Money minus(Iterable<Money> moniesToSubtract) {
        return with(money.minus(moniesToSubtract));
    }

    public Money minus(Money moneyToSubtract) {
        return with(money.minus(moneyToSubtract));
    }

    public Money minus(BigDecimal amountToSubtract) {
        return minus(amountToSubtract, RoundingMode.UNNECESSARY);
    }

    public Money minus(BigDecimal amountToSubtract, RoundingMode roundingMode) {
        return with(money.minusRetainScale(amountToSubtract, roundingMode));
    }
    
    public Money minus(double amountToSubtract) {
        return minus(amountToSubtract, RoundingMode.UNNECESSARY);
    }

    public Money minus(double amountToSubtract, RoundingMode roundingMode) {
        return with(money.minusRetainScale(amountToSubtract, roundingMode));
    }

    public Money minusMajor(long amountToSubtract) {
        return with(money.minusMajor(amountToSubtract));
    }

    public Money minusMinor(long amountToSubtract) {
        return with(money.minusMinor(amountToSubtract));
    }

    public Money multipliedBy(BigDecimal valueToMultiplyBy, RoundingMode roundingMode) {
        return with(money.multiplyRetainScale(valueToMultiplyBy, roundingMode));
    }
    
    public Money multipliedBy(double valueToMultiplyBy, RoundingMode roundingMode) {
        return with(money.multiplyRetainScale(valueToMultiplyBy, roundingMode));
    }
    
    public Money multipliedBy(long valueToMultiplyBy) {
        return with(money.multipliedBy(valueToMultiplyBy));
    }

    public Money dividedBy(BigDecimal valueToDivideBy, RoundingMode roundingMode) {
        return with(money.dividedBy(valueToDivideBy, roundingMode));
    }

    public Money dividedBy(double valueToDivideBy, RoundingMode roundingMode) {
        return with(money.dividedBy(valueToDivideBy, roundingMode));
    }

    public Money dividedBy(long valueToDivideBy, RoundingMode roundingMode) {
        return with(money.dividedBy(valueToDivideBy, roundingMode));
    }

    public Money negated() {
        return with(money.negated());
    }
    
    public Money abs() {
        return (isNegative() ? negated() : this);
    }
    
    public Money rounded(int scale, RoundingMode roundingMode) {
        return with(money.rounded(scale, roundingMode));
    }
    
    public Money convertedTo(CurrencyUnit currency, BigDecimal conversionMultipler, RoundingMode roundingMode) {
        return with(money.convertedTo(currency, conversionMultipler).withCurrencyScale(roundingMode));
    }

    @Override
    public BigMoney toBigMoney() {
        return money;
    }
    
    public boolean isSameCurrency(BigMoneyProvider other) {
        return money.isSameCurrency(other);
    }
    
    @Override
    public int compareTo(BigMoneyProvider other) {
        return money.compareTo(other);
    }

    public boolean isEqual(BigMoneyProvider other) {
        return money.isEqual(other);
    }

    public boolean isGreaterThan(BigMoneyProvider other) {
        return money.isGreaterThan(other);
    }
    
    public boolean isGreaterThanOrEqual(BigMoneyProvider other) {
        return money.isGreaterThanOrEqual(other);
    }

    public boolean isLessThan(BigMoneyProvider other) {
        return money.isLessThan(other);
    }

    public boolean isLessThanOrEqual(BigMoneyProvider other) {
        return money.isLessThanOrEqual(other);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof Money) {
            Money otherMoney = (Money) other;
            return money.equals(otherMoney.money);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return money.hashCode() + 3;
    }
    
    @Override
    @ToString
    public String toString() {
        return money.toString();
    }

}
