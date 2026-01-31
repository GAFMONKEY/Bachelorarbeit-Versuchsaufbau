package org.joda.money;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.money.BigMoney;
import org.joda.money.BigMoneyProvider;
import org.joda.money.CurrencyUnit;
import org.joda.money.Money;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Money_ESTest extends Money_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.JPY;
      BigMoney bigMoney0 = BigMoney.ofMinor(currencyUnit0, 0L);
      Money money0 = new Money(bigMoney0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.CAD;
      Money money0 = Money.zero(currencyUnit0);
      money0.hashCode();
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.JPY;
      Money money0 = Money.ofMinor(currencyUnit0, 574L);
      RoundingMode roundingMode0 = RoundingMode.DOWN;
      Money money1 = money0.withCurrencyUnit(currencyUnit0, roundingMode0);
      assertSame(money1, money0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.CHF;
      Money money0 = Money.zero(currencyUnit0);
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      Money money1 = money0.withAmount(bigDecimal0);
      assertNotSame(money1, money0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.EUR;
      Money money0 = Money.ofMajor(currencyUnit0, (-1L));
      RoundingMode roundingMode0 = RoundingMode.HALF_UP;
      Money money1 = money0.withAmount(0.0, roundingMode0);
      assertNotSame(money1, money0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.AUD;
      Money money0 = Money.zero(currencyUnit0);
      Money money1 = money0.withAmount((-2943.37));
      assertNotSame(money1, money0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.JPY;
      Money[] moneyArray0 = new Money[1];
      BigMoney bigMoney0 = BigMoney.zero(currencyUnit0);
      RoundingMode roundingMode0 = RoundingMode.FLOOR;
      Money money0 = bigMoney0.toMoney(roundingMode0);
      moneyArray0[0] = money0;
      Money money1 = Money.total(currencyUnit0, moneyArray0);
      assertNotSame(money1, money0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.JPY;
      RoundingMode roundingMode0 = RoundingMode.FLOOR;
      BigMoney bigMoney0 = BigMoney.ofMinor(currencyUnit0, 0L);
      Money money0 = Money.of((BigMoneyProvider) bigMoney0, roundingMode0);
      BigDecimal bigDecimal0 = money0.getAmountMajor();
      Money money1 = money0.plus(bigDecimal0, roundingMode0);
      assertSame(money1, money0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.CHF;
      Money money0 = Money.zero(currencyUnit0);
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      Money money1 = money0.plus(bigDecimal0);
      assertSame(money1, money0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.USD;
      RoundingMode roundingMode0 = RoundingMode.DOWN;
      Money money0 = Money.of(currencyUnit0, 0.0, roundingMode0);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      PriorityQueue<Money> priorityQueue0 = new PriorityQueue<Money>(comparator0);
      Money money1 = money0.plus((Iterable<Money>) priorityQueue0);
      assertSame(money1, money0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.AUD;
      Money money0 = Money.zero(currencyUnit0);
      Money money1 = money0.plus(0.0);
      assertSame(money1, money0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.JPY;
      Money money0 = Money.zero(currencyUnit0);
      Money money1 = Money.of((BigMoneyProvider) money0);
      assertNotSame(money1, money0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.JPY;
      Money money0 = Money.zero(currencyUnit0);
      BigInteger bigInteger0 = BigInteger.ZERO;
      BigDecimal bigDecimal0 = new BigDecimal(bigInteger0);
      RoundingMode roundingMode0 = RoundingMode.CEILING;
      Money money1 = money0.multipliedBy(bigDecimal0, roundingMode0);
      assertSame(money1, money0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.GBP;
      BigInteger bigInteger0 = BigInteger.ONE;
      BigDecimal bigDecimal0 = new BigDecimal(bigInteger0);
      RoundingMode roundingMode0 = RoundingMode.HALF_DOWN;
      Money money0 = Money.of(currencyUnit0, bigDecimal0, roundingMode0);
      Money money1 = money0.minus(bigDecimal0, roundingMode0);
      assertNotSame(money1, money0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.CHF;
      Money money0 = Money.zero(currencyUnit0);
      LinkedHashSet<Money> linkedHashSet0 = new LinkedHashSet<Money>();
      Money money1 = money0.minus((Iterable<Money>) linkedHashSet0);
      assertSame(money1, money0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.USD;
      RoundingMode roundingMode0 = RoundingMode.DOWN;
      Money money0 = Money.of(currencyUnit0, 0.0, roundingMode0);
      Money money1 = money0.minus((double) (-3581L), roundingMode0);
      assertNotSame(money1, money0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.JPY;
      Money money0 = Money.zero(currencyUnit0);
      Money money1 = money0.minus((-1059.0));
      assertNotSame(money1, money0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.JPY;
      Money money0 = Money.ofMajor(currencyUnit0, (-1025));
      boolean boolean0 = money0.isZero();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.JPY;
      BigMoney bigMoney0 = BigMoney.ofMajor(currencyUnit0, 0L);
      RoundingMode roundingMode0 = RoundingMode.FLOOR;
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      Money money0 = Money.of((BigMoneyProvider) bigMoney0, roundingMode0);
      CurrencyUnit currencyUnit1 = CurrencyUnit.CAD;
      Money money1 = Money.of(currencyUnit1, bigDecimal0);
      boolean boolean0 = money0.isSameCurrency(money1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.USD;
      RoundingMode roundingMode0 = RoundingMode.HALF_DOWN;
      Money money0 = Money.of(currencyUnit0, (-558.3895), roundingMode0);
      boolean boolean0 = money0.isPositiveOrZero();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      CurrencyUnit currencyUnit0 = CurrencyUnit.of(locale0);
      Money money0 = Money.zero(currencyUnit0);
      Money money1 = money0.plusMajor(1L);
      boolean boolean0 = money1.isPositive();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.EUR;
      Money money0 = Money.zero(currencyUnit0);
      boolean boolean0 = money0.isNegativeOrZero();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.JPY;
      RoundingMode roundingMode0 = RoundingMode.HALF_UP;
      Money money0 = Money.of(currencyUnit0, 4424.923732196141, roundingMode0);
      boolean boolean0 = money0.isNegative();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.EUR;
      Money money0 = Money.ofMajor(currencyUnit0, (-1L));
      Money money1 = money0.minusMinor((-1L));
      boolean boolean0 = money1.isLessThanOrEqual(money0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.GBP;
      Money money0 = Money.ofMinor(currencyUnit0, (-1820L));
      BigMoney bigMoney0 = BigMoney.ofScale(currencyUnit0, (-1820L), 47);
      boolean boolean0 = money0.isLessThan(bigMoney0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.USD;
      RoundingMode roundingMode0 = RoundingMode.DOWN;
      Money money0 = Money.of(currencyUnit0, 0.0, roundingMode0);
      BigMoney bigMoney0 = BigMoney.ofMajor(currencyUnit0, (-3581L));
      BigMoney bigMoney1 = bigMoney0.withAmount((double) 1);
      boolean boolean0 = money0.isGreaterThanOrEqual(bigMoney1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.JPY;
      Vector<Money> vector0 = new Vector<Money>();
      LinkedList<Money> linkedList0 = new LinkedList<Money>(vector0);
      Money money0 = Money.total(currencyUnit0, (Iterable<Money>) linkedList0);
      BigDecimal bigDecimal0 = new BigDecimal((-1271L));
      RoundingMode roundingMode0 = RoundingMode.UP;
      Money money1 = Money.of(currencyUnit0, bigDecimal0, roundingMode0);
      boolean boolean0 = money0.isGreaterThan(money1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.JPY;
      Money money0 = Money.zero(currencyUnit0);
      boolean boolean0 = money0.isEqual(money0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.USD;
      Money money0 = Money.ofMajor(currencyUnit0, 1L);
      BigInteger bigInteger0 = BigInteger.TEN;
      RoundingMode roundingMode0 = RoundingMode.UP;
      MathContext mathContext0 = new MathContext(30, roundingMode0);
      BigDecimal bigDecimal0 = new BigDecimal(bigInteger0, 40, mathContext0);
      BigMoney bigMoney0 = new BigMoney(currencyUnit0, bigDecimal0);
      boolean boolean0 = money0.isEqual(bigMoney0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.JPY;
      Money money0 = Money.zero(currencyUnit0);
      int int0 = money0.getScale();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.CHF;
      Money money0 = Money.zero(currencyUnit0);
      int int0 = money0.getMinorPart();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.EUR;
      Money money0 = Money.ofMajor(currencyUnit0, (-1L));
      Money money1 = money0.minusMinor((-1L));
      Money money2 = money1.plusMajor((-1L));
      int int0 = money2.getMinorPart();
      assertEquals((-99), int0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      CurrencyUnit currencyUnit0 = new CurrencyUnit(" is greater than the scale of the currency ", (short)0, (short)1148);
      RoundingMode roundingMode0 = RoundingMode.UP;
      Money money0 = Money.of(currencyUnit0, 0.0, roundingMode0);
      CurrencyUnit currencyUnit1 = money0.getCurrencyUnit();
      assertEquals(1148, currencyUnit1.getDecimalPlaces());
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.AUD;
      Money money0 = Money.zero(currencyUnit0);
      CurrencyUnit currencyUnit1 = money0.getCurrencyUnit();
      assertEquals(36, currencyUnit1.getNumericCode());
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.JPY;
      RoundingMode roundingMode0 = RoundingMode.UP;
      Money money0 = Money.of(currencyUnit0, 1.0, roundingMode0);
      long long0 = money0.getAmountMinorLong();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.USD;
      BigDecimal bigDecimal0 = new BigDecimal((-549));
      Money money0 = Money.of(currencyUnit0, bigDecimal0);
      long long0 = money0.getAmountMinorLong();
      assertEquals((-54900L), long0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.USD;
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      Money money0 = Money.of(currencyUnit0, bigDecimal0);
      int int0 = money0.getAmountMinorInt();
      assertEquals(1000, int0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.USD;
      BigDecimal bigDecimal0 = new BigDecimal((-1L));
      Money money0 = Money.of(currencyUnit0, bigDecimal0);
      int int0 = money0.getAmountMinorInt();
      assertEquals((-100), int0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.AUD;
      Money money0 = Money.zero(currencyUnit0);
      BigDecimal bigDecimal0 = money0.getAmountMinor();
      assertEquals((short)0, bigDecimal0.shortValue());
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.GBP;
      RoundingMode roundingMode0 = RoundingMode.CEILING;
      Money money0 = Money.of(currencyUnit0, (-2789.530291425116), roundingMode0);
      BigDecimal bigDecimal0 = money0.getAmountMinor();
      assertEquals((short) (-16809), bigDecimal0.shortValue());
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.USD;
      Money money0 = Money.zero(currencyUnit0);
      long long0 = money0.getAmountMajorLong();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.AUD;
      ArrayDeque<Money> arrayDeque0 = new ArrayDeque<Money>();
      Money money0 = Money.total(currencyUnit0, (Iterable<Money>) arrayDeque0);
      RoundingMode roundingMode0 = RoundingMode.CEILING;
      Money money1 = money0.plus((-3308.91591039471), roundingMode0);
      long long0 = money1.getAmountMajorLong();
      assertEquals((-3308L), long0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.USD;
      RoundingMode roundingMode0 = RoundingMode.HALF_DOWN;
      Money money0 = Money.of(currencyUnit0, (-558.3895), roundingMode0);
      Money money1 = money0.dividedBy((-558.3895), roundingMode0);
      int int0 = money1.getAmountMajorInt();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.USD;
      Money money0 = Money.ofMajor(currencyUnit0, (-1392L));
      int int0 = money0.getAmountMajorInt();
      assertEquals((-1392), int0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.GBP;
      BigInteger bigInteger0 = BigInteger.ONE;
      BigDecimal bigDecimal0 = new BigDecimal(bigInteger0);
      RoundingMode roundingMode0 = RoundingMode.HALF_DOWN;
      Money money0 = Money.of(currencyUnit0, bigDecimal0, roundingMode0);
      BigDecimal bigDecimal1 = money0.getAmountMajor();
      assertNotSame(bigDecimal0, bigDecimal1);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.JPY;
      RoundingMode roundingMode0 = RoundingMode.HALF_EVEN;
      Money money0 = Money.of(currencyUnit0, (-3303.5591753), roundingMode0);
      BigDecimal bigDecimal0 = money0.getAmount();
      assertEquals((byte)24, bigDecimal0.byteValue());
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.JPY;
      Money money0 = Money.ofMinor(currencyUnit0, 2229L);
      BigDecimal bigDecimal0 = money0.getAmount();
      assertEquals((short)2229, bigDecimal0.shortValue());
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      BigDecimal bigDecimal0 = new BigDecimal((-1271L));
      CurrencyUnit currencyUnit0 = new CurrencyUnit("<e,]!Xas3VBQ-", (short) (-1518), (short) (-1518));
      Money money0 = Money.of(currencyUnit0, bigDecimal0);
      RoundingMode roundingMode0 = RoundingMode.FLOOR;
      Money money1 = money0.dividedBy(bigDecimal0, roundingMode0);
      assertNotSame(money1, money0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.JPY;
      Money money0 = Money.zero(currencyUnit0);
      RoundingMode roundingMode0 = RoundingMode.UNNECESSARY;
      Money money1 = money0.dividedBy(2127L, roundingMode0);
      assertSame(money1, money0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.CAD;
      Money money0 = Money.zero(currencyUnit0);
      BigDecimal bigDecimal0 = new BigDecimal(1.0);
      RoundingMode roundingMode0 = RoundingMode.HALF_EVEN;
      Money money1 = money0.convertedTo(currencyUnit0, bigDecimal0, roundingMode0);
      assertSame(money1, money0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.JPY;
      RoundingMode roundingMode0 = RoundingMode.FLOOR;
      BigMoney bigMoney0 = BigMoney.ofMinor(currencyUnit0, 0L);
      Money money0 = Money.of((BigMoneyProvider) bigMoney0, roundingMode0);
      int int0 = money0.compareTo((BigMoneyProvider) bigMoney0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.USD;
      RoundingMode roundingMode0 = RoundingMode.DOWN;
      Money money0 = Money.of(currencyUnit0, 0.0, roundingMode0);
      BigMoney bigMoney0 = BigMoney.ofMajor(currencyUnit0, (-3581L));
      int int0 = money0.compareTo((BigMoneyProvider) bigMoney0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.JPY;
      RoundingMode roundingMode0 = RoundingMode.HALF_EVEN;
      Money money0 = Money.of(currencyUnit0, (-3303.5591753), roundingMode0);
      BigMoney bigMoney0 = BigMoney.ofMajor(currencyUnit0, (-3581L));
      BigMoney bigMoney1 = bigMoney0.withAmount(1.0);
      int int0 = money0.compareTo((BigMoneyProvider) bigMoney1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      // Undeclared exception!
      try { 
        Money.zero((CurrencyUnit) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Currency must not be null
         //
         verifyException("org.joda.money.MoneyUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.AUD;
      Money money0 = Money.zero(currencyUnit0);
      // Undeclared exception!
      try { 
        money0.withCurrencyUnit((CurrencyUnit) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // CurrencyUnit must not be null
         //
         verifyException("org.joda.money.MoneyUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      CurrencyUnit currencyUnit0 = new CurrencyUnit("Currency must not be null", (short)2015, (short)2015);
      Money money0 = Money.ofMinor(currencyUnit0, (short)2015);
      CurrencyUnit currencyUnit1 = CurrencyUnit.AUD;
      // Undeclared exception!
      try { 
        money0.withCurrencyUnit(currencyUnit1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Rounding necessary
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.JPY;
      Money money0 = Money.zero(currencyUnit0);
      RoundingMode roundingMode0 = RoundingMode.FLOOR;
      // Undeclared exception!
      try { 
        money0.withAmount((BigDecimal) null, roundingMode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Amount must not be null
         //
         verifyException("org.joda.money.MoneyUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.GBP;
      Money money0 = Money.zero(currencyUnit0);
      BigDecimal bigDecimal0 = new BigDecimal((-709.63215967));
      RoundingMode roundingMode0 = RoundingMode.UNNECESSARY;
      // Undeclared exception!
      try { 
        money0.withAmount(bigDecimal0, roundingMode0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Rounding necessary
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.AUD;
      Money money0 = Money.zero(currencyUnit0);
      BigDecimal bigDecimal0 = new BigDecimal(2321.6765650286375);
      // Undeclared exception!
      try { 
        money0.withAmount(bigDecimal0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Rounding necessary
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.JPY;
      Money[] moneyArray0 = new Money[2];
      CurrencyUnit currencyUnit1 = CurrencyUnit.GBP;
      Money money0 = Money.zero(currencyUnit1);
      moneyArray0[0] = money0;
      Money money1 = Money.ofMajor(currencyUnit0, 0L);
      moneyArray0[1] = money1;
      // Undeclared exception!
      try { 
        Money.total(moneyArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Currencies differ: GBP/JPY
         //
         verifyException("org.joda.money.BigMoney", e);
      }
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.EUR;
      Money money0 = Money.zero(currencyUnit0);
      CurrencyUnit currencyUnit1 = CurrencyUnit.CHF;
      Money[] moneyArray0 = new Money[3];
      moneyArray0[0] = money0;
      // Undeclared exception!
      try { 
        Money.total(currencyUnit1, moneyArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Currencies differ: CHF/EUR
         //
         verifyException("org.joda.money.BigMoney", e);
      }
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.CHF;
      // Undeclared exception!
      try { 
        Money.total(currencyUnit0, (Money[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.CAD;
      Money money0 = Money.zero(currencyUnit0);
      CurrencyUnit currencyUnit1 = CurrencyUnit.CHF;
      LinkedHashSet<Money> linkedHashSet0 = new LinkedHashSet<Money>(20);
      linkedHashSet0.add(money0);
      // Undeclared exception!
      try { 
        Money.total(currencyUnit1, (Iterable<Money>) linkedHashSet0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Currencies differ: CHF/CAD
         //
         verifyException("org.joda.money.BigMoney", e);
      }
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.GBP;
      // Undeclared exception!
      try { 
        Money.total(currencyUnit0, (Iterable<Money>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.money.BigMoney", e);
      }
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      HashSet<Money> hashSet0 = new HashSet<Money>();
      // Undeclared exception!
      try { 
        Money.total((CurrencyUnit) null, (Iterable<Money>) hashSet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Currency must not be null
         //
         verifyException("org.joda.money.MoneyUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      // Undeclared exception!
      try { 
        Money.total((Iterable<Money>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Money iterator must not be null
         //
         verifyException("org.joda.money.MoneyUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.AUD;
      Money money0 = Money.zero(currencyUnit0);
      CurrencyUnit currencyUnit1 = CurrencyUnit.JPY;
      Money money1 = Money.zero(currencyUnit1);
      // Undeclared exception!
      try { 
        money1.plus(money0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Currencies differ: JPY/AUD
         //
         verifyException("org.joda.money.BigMoney", e);
      }
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.CHF;
      Money money0 = Money.zero(currencyUnit0);
      // Undeclared exception!
      try { 
        money0.plus((Money) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // BigMoneyProvider must not be null
         //
         verifyException("org.joda.money.MoneyUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.EUR;
      Money money0 = Money.zero(currencyUnit0);
      BigDecimal bigDecimal0 = new BigDecimal(1814.846353776208);
      RoundingMode roundingMode0 = RoundingMode.UNNECESSARY;
      // Undeclared exception!
      try { 
        money0.plus(bigDecimal0, roundingMode0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Rounding necessary
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.CHF;
      Money money0 = Money.zero(currencyUnit0);
      BigDecimal bigDecimal0 = new BigDecimal((-2149.9285512593733));
      // Undeclared exception!
      try { 
        money0.plus(bigDecimal0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Rounding necessary
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      // Undeclared exception!
      try { 
        Money.parse("Y~j.");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown currency 'Y~j'
         //
         verifyException("org.joda.money.CurrencyUnit", e);
      }
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      // Undeclared exception!
      try { 
        Money.parse((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Money must not be null
         //
         verifyException("org.joda.money.MoneyUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      // Undeclared exception!
      try { 
        Money.parse("GgO");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Money 'GgO' cannot be parsed
         //
         verifyException("org.joda.money.BigMoney", e);
      }
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      // Undeclared exception!
      try { 
        Money.ofMinor((CurrencyUnit) null, 0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // CurrencyUnit must not be null
         //
         verifyException("org.joda.money.MoneyUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      // Undeclared exception!
      try { 
        Money.ofMajor((CurrencyUnit) null, 5298L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // CurrencyUnit must not be null
         //
         verifyException("org.joda.money.MoneyUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.CHF;
      BigDecimal bigDecimal0 = BigDecimal.valueOf(639.661);
      RoundingMode roundingMode0 = RoundingMode.UNNECESSARY;
      // Undeclared exception!
      try { 
        Money.of(currencyUnit0, bigDecimal0, roundingMode0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Rounding necessary
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      // Undeclared exception!
      try { 
        Money.of((CurrencyUnit) null, bigDecimal0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Currency must not be null
         //
         verifyException("org.joda.money.MoneyUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      RoundingMode roundingMode0 = RoundingMode.UNNECESSARY;
      // Undeclared exception!
      try { 
        Money.of((CurrencyUnit) null, 2223.87271, roundingMode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // CurrencyUnit must not be null
         //
         verifyException("org.joda.money.MoneyUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.CHF;
      RoundingMode roundingMode0 = RoundingMode.UNNECESSARY;
      // Undeclared exception!
      try { 
        Money.of(currencyUnit0, 870.78204154194, roundingMode0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Rounding necessary
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      // Undeclared exception!
      try { 
        Money.of((CurrencyUnit) null, 1195.6351903902184);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Currency must not be null
         //
         verifyException("org.joda.money.MoneyUtils", e);
      }
  }

//  @Test(timeout = 4000) FAILING
//  public void test080()  throws Throwable  {
//      BigDecimal bigDecimal0 = new BigDecimal(1937.075147290477);
//      BigMoney bigMoney0 = new BigMoney((CurrencyUnit) null, bigDecimal0);
//      RoundingMode roundingMode0 = RoundingMode.FLOOR;
//      // Undeclared exception!
//      try {
//        Money.of((BigMoneyProvider) bigMoney0, roundingMode0);
//        fail("Expecting exception: NullPointerException");
//
//      } catch(NullPointerException e) {
//         //
//         // no message in exception (getMessage() returned null)
//         //
//         verifyException("org.joda.money.BigMoney", e);
//      }
//  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      RoundingMode roundingMode0 = RoundingMode.UP;
      // Undeclared exception!
      try { 
        Money.of((BigMoneyProvider) null, roundingMode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // BigMoneyProvider must not be null
         //
         verifyException("org.joda.money.MoneyUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.EUR;
      BigMoney bigMoney0 = BigMoney.of(currencyUnit0, (-280.173032));
      RoundingMode roundingMode0 = RoundingMode.UNNECESSARY;
      // Undeclared exception!
      try { 
        Money.of((BigMoneyProvider) bigMoney0, roundingMode0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Rounding necessary
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

//  @Test(timeout = 4000) FAILING
//  public void test083()  throws Throwable  {
//      BigInteger bigInteger0 = BigInteger.ZERO;
//      BigDecimal bigDecimal0 = new BigDecimal(bigInteger0);
//      BigMoney bigMoney0 = new BigMoney((CurrencyUnit) null, bigDecimal0);
//      // Undeclared exception!
//      try {
//        Money.of((BigMoneyProvider) bigMoney0);
//        fail("Expecting exception: NullPointerException");
//
//      } catch(NullPointerException e) {
//         //
//         // no message in exception (getMessage() returned null)
//         //
//         verifyException("org.joda.money.BigMoney", e);
//      }
//  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.CHF;
      BigMoney bigMoney0 = BigMoney.of(currencyUnit0, 2068.639972131);
      // Undeclared exception!
      try { 
        Money.of((BigMoneyProvider) bigMoney0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Rounding necessary
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.USD;
      RoundingMode roundingMode0 = RoundingMode.UNNECESSARY;
      Money money0 = Money.of(currencyUnit0, (-2826.0), roundingMode0);
      // Undeclared exception!
      try { 
        money0.multipliedBy((-1275.0521955), roundingMode0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Rounding necessary
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.AUD;
      CurrencyUnit currencyUnit1 = CurrencyUnit.EUR;
      Money money0 = Money.ofMinor(currencyUnit0, (-1667L));
      Money money1 = Money.zero(currencyUnit1);
      // Undeclared exception!
      try { 
        money0.minus(money1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Currencies differ: AUD/EUR
         //
         verifyException("org.joda.money.BigMoney", e);
      }
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.USD;
      Money money0 = Money.zero(currencyUnit0);
      // Undeclared exception!
      try { 
        money0.minus((Money) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // BigMoneyProvider must not be null
         //
         verifyException("org.joda.money.MoneyUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.CHF;
      Money money0 = Money.zero(currencyUnit0);
      // Undeclared exception!
      try { 
        money0.minus((BigDecimal) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Amount must not be null
         //
         verifyException("org.joda.money.MoneyUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.CAD;
      Money money0 = Money.zero(currencyUnit0);
      BigDecimal bigDecimal0 = new BigDecimal((-1422.3137529196));
      // Undeclared exception!
      try { 
        money0.minus(bigDecimal0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Rounding necessary
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.EUR;
      Money money0 = Money.zero(currencyUnit0);
      // Undeclared exception!
      try { 
        money0.isSameCurrency((BigMoneyProvider) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // BigMoneyProvider must not be null
         //
         verifyException("org.joda.money.MoneyUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.GBP;
      Money money0 = Money.ofMinor(currencyUnit0, (-2318L));
      CurrencyUnit currencyUnit1 = CurrencyUnit.JPY;
      BigMoney bigMoney0 = BigMoney.ofMinor(currencyUnit1, (-2318L));
      // Undeclared exception!
      try { 
        money0.isLessThanOrEqual(bigMoney0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Currencies differ: GBP/JPY
         //
         verifyException("org.joda.money.BigMoney", e);
      }
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.GBP;
      Money money0 = Money.zero(currencyUnit0);
      // Undeclared exception!
      try { 
        money0.isLessThanOrEqual((BigMoneyProvider) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // BigMoneyProvider must not be null
         //
         verifyException("org.joda.money.MoneyUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.JPY;
      CurrencyUnit currencyUnit1 = CurrencyUnit.CAD;
      Money money0 = Money.zero(currencyUnit1);
      Money money1 = Money.ofMajor(currencyUnit0, 0L);
      // Undeclared exception!
      try { 
        money0.isLessThan(money1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Currencies differ: CAD/JPY
         //
         verifyException("org.joda.money.BigMoney", e);
      }
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.USD;
      Money money0 = Money.zero(currencyUnit0);
      // Undeclared exception!
      try { 
        money0.isLessThan((BigMoneyProvider) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // BigMoneyProvider must not be null
         //
         verifyException("org.joda.money.MoneyUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.AUD;
      Money money0 = Money.ofMajor(currencyUnit0, 0L);
      CurrencyUnit currencyUnit1 = CurrencyUnit.USD;
      Comparator<Money> comparator0 = (Comparator<Money>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      PriorityQueue<Money> priorityQueue0 = new PriorityQueue<Money>(30, comparator0);
      Money money1 = Money.total(currencyUnit1, (Iterable<Money>) priorityQueue0);
      // Undeclared exception!
      try { 
        money0.isGreaterThanOrEqual(money1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Currencies differ: AUD/USD
         //
         verifyException("org.joda.money.BigMoney", e);
      }
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.EUR;
      Money money0 = Money.zero(currencyUnit0);
      // Undeclared exception!
      try { 
        money0.isGreaterThanOrEqual((BigMoneyProvider) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // BigMoneyProvider must not be null
         //
         verifyException("org.joda.money.MoneyUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.JPY;
      Money money0 = Money.zero(currencyUnit0);
      // Undeclared exception!
      try { 
        money0.isGreaterThan((BigMoneyProvider) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // BigMoneyProvider must not be null
         //
         verifyException("org.joda.money.MoneyUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.USD;
      Money money0 = Money.ofMajor(currencyUnit0, 0L);
      CurrencyUnit currencyUnit1 = new CurrencyUnit("", (short)12, (short)12);
      BigMoney bigMoney0 = BigMoney.ofMinor(currencyUnit1, (short)12);
      // Undeclared exception!
      try { 
        money0.isEqual(bigMoney0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Currencies differ: USD/
         //
         verifyException("org.joda.money.BigMoney", e);
      }
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      CurrencyUnit currencyUnit0 = new CurrencyUnit("Money arary must not contain null entries", (short)77, (short)77);
      RoundingMode roundingMode0 = RoundingMode.HALF_EVEN;
      Money money0 = Money.of(currencyUnit0, (double) (short)77, roundingMode0);
      // Undeclared exception!
      try { 
        money0.getAmountMinorLong();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Overflow
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      CurrencyUnit currencyUnit0 = new CurrencyUnit("", (short)3742, (short)1131);
      Money money0 = Money.of(currencyUnit0, 1457.1728033);
      // Undeclared exception!
      try { 
        money0.getAmountMinorInt();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Overflow
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.JPY;
      Money money0 = Money.zero(currencyUnit0);
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      RoundingMode roundingMode0 = RoundingMode.DOWN;
      // Undeclared exception!
      try { 
        money0.dividedBy(bigDecimal0, roundingMode0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.JPY;
      Money money0 = Money.ofMinor(currencyUnit0, 1850L);
      // Undeclared exception!
      try { 
        money0.dividedBy(1850L, (RoundingMode) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.CHF;
      Money money0 = Money.zero(currencyUnit0);
      RoundingMode roundingMode0 = RoundingMode.UP;
      // Undeclared exception!
      try { 
        money0.convertedTo(currencyUnit0, (BigDecimal) null, roundingMode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Multiplier must not be null
         //
         verifyException("org.joda.money.MoneyUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.AUD;
      PriorityQueue<Money> priorityQueue0 = new PriorityQueue<Money>(3381, (Comparator<? super Money>) null);
      Money money0 = Money.total(currencyUnit0, (Iterable<Money>) priorityQueue0);
      CurrencyUnit currencyUnit1 = CurrencyUnit.GBP;
      BigDecimal bigDecimal0 = new BigDecimal(3361);
      Money money1 = Money.of(currencyUnit1, bigDecimal0);
      // Undeclared exception!
      try { 
        money0.compareTo((BigMoneyProvider) money1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Currencies differ: AUD/GBP
         //
         verifyException("org.joda.money.BigMoney", e);
      }
  }

//  @Test(timeout = 4000) FAILING
//  public void test105()  throws Throwable  {
//      BigDecimal bigDecimal0 = new BigDecimal((-43));
//      BigMoney bigMoney0 = new BigMoney((CurrencyUnit) null, bigDecimal0);
//      Money money0 = null;
//      try {
//        money0 = new Money(bigMoney0);
//        fail("Expecting exception: NullPointerException");
//
//      } catch(NullPointerException e) {
//         //
//         // no message in exception (getMessage() returned null)
//         //
//         verifyException("org.joda.money.BigMoney", e);
//      }
//  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.EUR;
      BigDecimal bigDecimal0 = new BigDecimal(264.84);
      // Undeclared exception!
      try { 
        Money.of(currencyUnit0, bigDecimal0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Scale of amount 264.83999999999997498889570124447345733642578125 is greater than the scale of the currency EUR
         //
         verifyException("org.joda.money.Money", e);
      }
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.GBP;
      RoundingMode roundingMode0 = RoundingMode.CEILING;
      // Undeclared exception!
      try { 
        Money.of(currencyUnit0, (BigDecimal) null, roundingMode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Amount must not be null
         //
         verifyException("org.joda.money.MoneyUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.EUR;
      Money money0 = Money.zero(currencyUnit0);
      // Undeclared exception!
      try { 
        money0.plus((Iterable<Money>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.money.BigMoney", e);
      }
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.CHF;
      Money money0 = Money.zero(currencyUnit0);
      Money money1 = money0.negated();
      assertSame(money1, money0);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.EUR;
      Money money0 = Money.zero(currencyUnit0);
      RoundingMode roundingMode0 = RoundingMode.UNNECESSARY;
      // Undeclared exception!
      try { 
        money0.plus((-1517.0575), roundingMode0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Rounding necessary
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      // Undeclared exception!
      try { 
        Money.of((BigMoneyProvider) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // BigMoneyProvider must not be null
         //
         verifyException("org.joda.money.MoneyUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.EUR;
      Money money0 = Money.zero(currencyUnit0);
      RoundingMode roundingMode0 = RoundingMode.UP;
      // Undeclared exception!
      try { 
        money0.withCurrencyUnit((CurrencyUnit) null, roundingMode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // CurrencyUnit must not be null
         //
         verifyException("org.joda.money.MoneyUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.JPY;
      Vector<Money> vector0 = new Vector<Money>();
      LinkedList<Money> linkedList0 = new LinkedList<Money>(vector0);
      Money money0 = Money.total(currencyUnit0, (Iterable<Money>) linkedList0);
      BigMoney bigMoney0 = money0.toBigMoney();
      assertNotNull(bigMoney0);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.CAD;
      Money money0 = Money.zero(currencyUnit0);
      RoundingMode roundingMode0 = RoundingMode.CEILING;
      // Undeclared exception!
      try { 
        money0.minus((BigDecimal) null, roundingMode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Amount must not be null
         //
         verifyException("org.joda.money.MoneyUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.USD;
      RoundingMode roundingMode0 = RoundingMode.HALF_DOWN;
      Money money0 = Money.of(currencyUnit0, (-558.3895), roundingMode0);
      boolean boolean0 = money0.isNegative();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.CAD;
      Money money0 = Money.zero(currencyUnit0);
      RoundingMode roundingMode0 = RoundingMode.CEILING;
      // Undeclared exception!
      try { 
        money0.plus((BigDecimal) null, roundingMode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Amount must not be null
         //
         verifyException("org.joda.money.MoneyUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.JPY;
      BigMoney bigMoney0 = BigMoney.ofMajor(currencyUnit0, 0L);
      RoundingMode roundingMode0 = RoundingMode.FLOOR;
      Money money0 = Money.of((BigMoneyProvider) bigMoney0, roundingMode0);
      Money money1 = money0.plus(money0);
      assertSame(money1, money0);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.JPY;
      Money money0 = Money.zero(currencyUnit0);
      Money money1 = Money.zero(currencyUnit0);
      boolean boolean0 = money1.equals(money0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.AUD;
      Money money0 = Money.zero(currencyUnit0);
      boolean boolean0 = money0.equals(money0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.CHF;
      Money money0 = Money.ofMinor(currencyUnit0, 0L);
      boolean boolean0 = money0.equals(currencyUnit0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.EUR;
      Money money0 = Money.zero(currencyUnit0);
      Money money1 = money0.abs();
      assertSame(money1, money0);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.USD;
      Stack<Money> stack0 = new Stack<Money>();
      BigMoney bigMoney0 = BigMoney.total(currencyUnit0, (Iterable<? extends BigMoneyProvider>) stack0);
      Money money0 = null;
      try {
        money0 = new Money(bigMoney0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // Joda-Money bug: Only currency scale is valid for Money
         //
      }
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      Money money0 = null;
      try {
        money0 = new Money((BigMoney) null);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // Joda-Money bug: BigMoney must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.GBP;
      LinkedList<Money> linkedList0 = new LinkedList<Money>();
      Money money0 = Money.ofMinor(currencyUnit0, (-1674L));
      linkedList0.add(money0);
      linkedList0.add(money0);
      Money money1 = Money.total((Iterable<Money>) linkedList0);
      assertFalse(linkedList0.contains(money1));
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      HashSet<Money> hashSet0 = new HashSet<Money>();
      // Undeclared exception!
      try { 
        Money.total((Iterable<Money>) hashSet0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Money iterator must not be empty
         //
         verifyException("org.joda.money.Money", e);
      }
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.JPY;
      Money money0 = Money.ofMajor(currencyUnit0, 392L);
      Money[] moneyArray0 = new Money[3];
      moneyArray0[0] = money0;
      moneyArray0[1] = money0;
      moneyArray0[2] = money0;
      Money money1 = Money.total(moneyArray0);
      assertNotSame(money1, money0);
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      Money[] moneyArray0 = new Money[0];
      // Undeclared exception!
      try { 
        Money.total(moneyArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Money array must not be empty
         //
         verifyException("org.joda.money.Money", e);
      }
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.GBP;
      // Undeclared exception!
      try { 
        Money.of(currencyUnit0, (-2358.8779594298107));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Scale of amount -2358.8779594298107 is greater than the scale of the currency GBP
         //
         verifyException("org.joda.money.Money", e);
      }
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      CurrencyUnit currencyUnit0 = new CurrencyUnit("", (short)3742, (short)1131);
      Money money0 = Money.of(currencyUnit0, 1457.1728033);
      boolean boolean0 = money0.isLessThan(money0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.USD;
      RoundingMode roundingMode0 = RoundingMode.DOWN;
      Money money0 = Money.of(currencyUnit0, 0.0, roundingMode0);
      int int0 = money0.getAmountMajorInt();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.JPY;
      Money money0 = Money.ofMajor(currencyUnit0, 392L);
      long long0 = money0.getAmountMajorLong();
      assertEquals(392L, long0);
  }

  @Test(timeout = 4000)
  public void test132()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.JPY;
      Money money0 = Money.zero(currencyUnit0);
      boolean boolean0 = money0.isZero();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test133()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.GBP;
      Money money0 = Money.of(currencyUnit0, 1684.97);
      int int0 = money0.getMinorPart();
      assertEquals(97, int0);
  }

  @Test(timeout = 4000)
  public void test134()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.USD;
      Money money0 = Money.zero(currencyUnit0);
      // Undeclared exception!
      try { 
        money0.minus((-241.8153805656));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Rounding necessary
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test135()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.JPY;
      Money money0 = Money.ofMajor(currencyUnit0, 392L);
      Money money1 = money0.minusMajor(365L);
      assertNotSame(money1, money0);
  }

  @Test(timeout = 4000)
  public void test136()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.CAD;
      Money money0 = Money.zero(currencyUnit0);
      boolean boolean0 = money0.isPositiveOrZero();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test137()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.AUD;
      Money money0 = Money.zero(currencyUnit0);
      RoundingMode roundingMode0 = RoundingMode.CEILING;
      // Undeclared exception!
      try { 
        money0.multipliedBy((BigDecimal) null, roundingMode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Multiplier must not be null
         //
         verifyException("org.joda.money.MoneyUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test138()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.CHF;
      Money money0 = Money.zero(currencyUnit0);
      // Undeclared exception!
      try { 
        money0.compareTo((BigMoneyProvider) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // BigMoneyProvider must not be null
         //
         verifyException("org.joda.money.MoneyUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test139()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.AUD;
      RoundingMode roundingMode0 = RoundingMode.HALF_EVEN;
      Money money0 = Money.of(currencyUnit0, (-2659.10202), roundingMode0);
      // Undeclared exception!
      try { 
        money0.withAmount((-2659.10202));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Rounding necessary
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test140()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.AUD;
      RoundingMode roundingMode0 = RoundingMode.HALF_EVEN;
      Money money0 = Money.of(currencyUnit0, (-2659.10202), roundingMode0);
      BigDecimal bigDecimal0 = money0.getAmountMajor();
      assertEquals((byte) (-99), bigDecimal0.byteValue());
  }

  @Test(timeout = 4000)
  public void test141()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.JPY;
      Money money0 = Money.zero(currencyUnit0);
      RoundingMode roundingMode0 = RoundingMode.DOWN;
      // Undeclared exception!
      try { 
        money0.dividedBy(0L, roundingMode0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test142()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.GBP;
      Money money0 = Money.zero(currencyUnit0);
      RoundingMode roundingMode0 = RoundingMode.HALF_UP;
      // Undeclared exception!
      try { 
        money0.dividedBy(0.0, roundingMode0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test143()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.EUR;
      Money money0 = Money.zero(currencyUnit0);
      // Undeclared exception!
      try { 
        money0.withAmount((BigDecimal) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Amount must not be null
         //
         verifyException("org.joda.money.MoneyUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test144()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.GBP;
      Money money0 = Money.ofMinor(currencyUnit0, (-1820L));
      RoundingMode roundingMode0 = RoundingMode.UP;
      Money money1 = money0.rounded(47, roundingMode0);
      assertSame(money1, money0);
  }

  @Test(timeout = 4000)
  public void test145()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.JPY;
      Money money0 = Money.ofMajor(currencyUnit0, 392L);
      RoundingMode roundingMode0 = RoundingMode.HALF_DOWN;
      Money money1 = money0.multipliedBy(2194.9354263, roundingMode0);
      assertNotSame(money1, money0);
  }

  @Test(timeout = 4000)
  public void test146()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.USD;
      Money money0 = Money.zero(currencyUnit0);
      long long0 = money0.getAmountMinorLong();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test147()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.JPY;
      Money money0 = Money.zero(currencyUnit0);
      boolean boolean0 = money0.isGreaterThan(money0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test148()  throws Throwable  {
      CurrencyUnit currencyUnit0 = new CurrencyUnit("", (short)3742, (short)1131);
      Money money0 = Money.of(currencyUnit0, 1457.1728033);
      Money money1 = money0.withCurrencyUnit(currencyUnit0);
      assertSame(money1, money0);
  }

  @Test(timeout = 4000)
  public void test149()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.CHF;
      Money money0 = Money.ofMinor(currencyUnit0, 0L);
      BigDecimal bigDecimal0 = new BigDecimal(0L);
      Money money1 = money0.minus(bigDecimal0);
      assertSame(money1, money0);
  }

  @Test(timeout = 4000)
  public void test150()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.JPY;
      Money money0 = Money.zero(currencyUnit0);
      boolean boolean0 = money0.isPositive();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test151()  throws Throwable  {
      Money money0 = Money.parse("USD 0.00");
      assertNotNull(money0);
  }

  @Test(timeout = 4000)
  public void test152()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.CHF;
      Money money0 = Money.ofMinor(currencyUnit0, 0L);
      Money money1 = money0.multipliedBy(4909L);
      assertSame(money1, money0);
  }

  @Test(timeout = 4000)
  public void test153()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.JPY;
      Money[] moneyArray0 = new Money[2];
      Money money0 = Money.zero(currencyUnit0);
      moneyArray0[0] = money0;
      // Undeclared exception!
      try { 
        Money.total(moneyArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // BigMoneyProvider must not be null
         //
         verifyException("org.joda.money.MoneyUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test154()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.CAD;
      Money money0 = Money.zero(currencyUnit0);
      RoundingMode roundingMode0 = RoundingMode.UNNECESSARY;
      // Undeclared exception!
      try { 
        money0.withAmount((-491.0826), roundingMode0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Rounding necessary
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test155()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.AUD;
      Money money0 = Money.ofMajor(currencyUnit0, 0L);
      boolean boolean0 = money0.isGreaterThanOrEqual(money0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test156()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.USD;
      RoundingMode roundingMode0 = RoundingMode.DOWN;
      Money money0 = Money.of(currencyUnit0, 0.0, roundingMode0);
      BigDecimal bigDecimal0 = money0.getAmount();
      assertEquals((short)0, bigDecimal0.shortValue());
  }

  @Test(timeout = 4000)
  public void test157()  throws Throwable  {
      CurrencyUnit currencyUnit0 = new CurrencyUnit("00", (short) (-2339), (short) (-2339));
      Money money0 = Money.zero(currencyUnit0);
      CurrencyUnit currencyUnit1 = money0.getCurrencyUnit();
      assertEquals("00", currencyUnit1.getCode());
  }

  @Test(timeout = 4000)
  public void test158()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.JPY;
      Money[] moneyArray0 = new Money[3];
      // Undeclared exception!
      try { 
        Money.total(currencyUnit0, moneyArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // BigMoneyProvider must not be null
         //
         verifyException("org.joda.money.MoneyUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test159()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.AUD;
      Money money0 = Money.zero(currencyUnit0);
      int int0 = money0.getAmountMinorInt();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test160()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.AUD;
      Money money0 = Money.zero(currencyUnit0);
      RoundingMode roundingMode0 = RoundingMode.UP;
      // Undeclared exception!
      try { 
        money0.dividedBy((BigDecimal) null, roundingMode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Divisor must not be null
         //
         verifyException("org.joda.money.MoneyUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test161()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.CHF;
      Money money0 = Money.ofMinor(currencyUnit0, 0L);
      String string0 = money0.toString();
      assertEquals("CHF 0.00", string0);
  }

  @Test(timeout = 4000)
  public void test162()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.EUR;
      Money money0 = Money.zero(currencyUnit0);
      // Undeclared exception!
      try { 
        money0.plus((BigDecimal) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Amount must not be null
         //
         verifyException("org.joda.money.MoneyUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test163()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.CHF;
      Money money0 = Money.ofMinor(currencyUnit0, 0L);
      Money money1 = money0.minus(money0);
      assertSame(money1, money0);
  }

  @Test(timeout = 4000)
  public void test164()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.GBP;
      Money money0 = Money.zero(currencyUnit0);
      // Undeclared exception!
      try { 
        money0.minus((Iterable<Money>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.money.BigMoney", e);
      }
  }

  @Test(timeout = 4000)
  public void test165()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.CAD;
      Money money0 = Money.zero(currencyUnit0);
      int int0 = money0.getScale();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test166()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.CHF;
      Money money0 = Money.ofMinor(currencyUnit0, 0L);
      Money money1 = money0.plusMinor((-1L));
      assertNotSame(money1, money0);
  }

  @Test(timeout = 4000)
  public void test167()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.EUR;
      Money money0 = Money.zero(currencyUnit0);
      // Undeclared exception!
      try { 
        money0.plus((-4592.28337743954));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Rounding necessary
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test168()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.JPY;
      Money money0 = Money.ofMajor(currencyUnit0, 392L);
      RoundingMode roundingMode0 = RoundingMode.HALF_DOWN;
      BigDecimal bigDecimal0 = money0.getAmountMinor();
      Money money1 = money0.withAmount(bigDecimal0, roundingMode0);
      assertSame(money1, money0);
      assertEquals((byte) (-120), bigDecimal0.byteValue());
  }

  @Test(timeout = 4000)
  public void test169()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.CAD;
      RoundingMode roundingMode0 = RoundingMode.FLOOR;
      Money money0 = Money.of(currencyUnit0, 202.6291235115, roundingMode0);
      boolean boolean0 = money0.isNegativeOrZero();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test170()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.CHF;
      Money money0 = Money.zero(currencyUnit0);
      // Undeclared exception!
      try { 
        money0.isEqual((BigMoneyProvider) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // BigMoneyProvider must not be null
         //
         verifyException("org.joda.money.MoneyUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test171()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.GBP;
      Money money0 = Money.ofMinor(currencyUnit0, (-2318L));
      BigMoney bigMoney0 = BigMoney.ofMinor(currencyUnit0, (-2318L));
      boolean boolean0 = money0.isLessThanOrEqual(bigMoney0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test172()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.CHF;
      Money money0 = Money.zero(currencyUnit0);
      RoundingMode roundingMode0 = RoundingMode.UNNECESSARY;
      // Undeclared exception!
      try { 
        money0.minus(48.575, roundingMode0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Rounding necessary
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test173()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.JPY;
      BigMoney bigMoney0 = BigMoney.ofMajor(currencyUnit0, 0L);
      RoundingMode roundingMode0 = RoundingMode.FLOOR;
      Money money0 = Money.of((BigMoneyProvider) bigMoney0, roundingMode0);
      boolean boolean0 = money0.isSameCurrency(money0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test174()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.CAD;
      Money money0 = Money.zero(currencyUnit0);
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      RoundingMode roundingMode0 = RoundingMode.FLOOR;
      // Undeclared exception!
      try { 
        money0.convertedTo(currencyUnit0, bigDecimal0, roundingMode0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot convert to the same currency
         //
         verifyException("org.joda.money.BigMoney", e);
      }
  }

  @Test(timeout = 4000)
  public void test175()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.JPY;
      Money money0 = Money.ofMinor(currencyUnit0, (-950L));
      Money money1 = money0.abs();
      assertNotSame(money1, money0);
  }
}
