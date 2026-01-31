package org.joda.money;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.Currency;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.money.CurrencyUnit;
import org.joda.money.DefaultCurrencyUnitDataProvider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CurrencyUnit_ESTest extends CurrencyUnit_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.GBP;
      boolean boolean0 = currencyUnit0.isPseudoCurrency();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      List<String> list0 = CurrencyUnit.registeredCountries();
      CurrencyUnit currencyUnit0 = CurrencyUnit.registerCurrency("GBP", 1, 0, list0, true);
      int int0 = currencyUnit0.getDecimalPlaces();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CurrencyUnit currencyUnit0 = new CurrencyUnit("SAR", (short)0, (short)541);
      String string0 = currencyUnit0.getNumeric3Code();
      assertEquals("000", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        CurrencyUnit.ofNumericCode("g 7");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown currency '5347'
         //
         verifyException("org.joda.money.CurrencyUnit", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultCurrencyUnitDataProvider defaultCurrencyUnitDataProvider0 = new DefaultCurrencyUnitDataProvider();
      defaultCurrencyUnitDataProvider0.registerCurrencies();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        CurrencyUnit.registerCurrency("ZZx~&)De'zprO7)r9Z", (-3548), (-3548), true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid string code, must be length 3
         //
         verifyException("org.joda.money.CurrencyUnit", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CurrencyUnit currencyUnit0 = new CurrencyUnit("", (short)2, (short) (-2786));
      String string0 = currencyUnit0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.of("VUV");
      Currency currency0 = currencyUnit0.toCurrency();
      assertEquals("VUV", currency0.getCurrencyCode());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.registerCurrency("UZS", (int) (short)0, (int) (short)1, true);
      assertEquals(0, currencyUnit0.getNumericCode());
      assertEquals(1, currencyUnit0.getDecimalPlaces());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.registerCurrency("SZL", 30, 30, true);
      assertEquals(30, currencyUnit0.getNumericCode());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CurrencyUnit currencyUnit0 = new CurrencyUnit("QUV", (short)2, (short)2);
      currencyUnit0.getSymbol();
      Set<String> set0 = currencyUnit0.getCountryCodes();
      LinkedList<String> linkedList0 = new LinkedList<String>(set0);
      // Undeclared exception!
      try { 
        CurrencyUnit.registerCurrency("QUV", 4, (int) (short)2, (List<String>) linkedList0);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // Currency already registered: QUV
         //
         verifyException("org.joda.money.CurrencyUnit", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      LinkedList<Locale.LanguageRange> linkedList1 = new LinkedList<Locale.LanguageRange>();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.AUTOSELECT_FILTERING;
      CurrencyUnit.registerCurrency("QCV", (-1), 2, (List<String>) linkedList0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.ofNumericCode("392");
      assertEquals(392, currencyUnit0.getNumericCode());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.ofNumericCode(999);
      assertEquals(999, currencyUnit0.getNumericCode());
  }

//  @Test(timeout = 4000) FAILING
//  public void test14()  throws Throwable  {
//      CurrencyUnit.ofNumericCode(0);
//  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        CurrencyUnit.ofCountry("840");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No currency found for country '840'
         //
         verifyException("org.joda.money.CurrencyUnit", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.AUD;
      Locale locale0 = Locale.FRANCE;
      locale0.getDisplayLanguage();
      CurrencyUnit currencyUnit1 = CurrencyUnit.of(locale0);
      //  // Unstable assertion: assertEquals(13, currencyUnit1.getNumericCode());
      
      String string0 = currencyUnit0.getNumeric3Code();
      //  // Unstable assertion: assertEquals("036", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      CurrencyUnit currencyUnit0 = CurrencyUnit.of(locale0);
      //  // Unstable assertion: assertEquals("QUV", currencyUnit0.getCode());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      Currency currency0 = Currency.getInstance(locale0);
      CurrencyUnit currencyUnit0 = CurrencyUnit.of(currency0);
      assertEquals("KRW", currencyUnit0.getCode());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      CurrencyUnit currencyUnit0 = CurrencyUnit.registerCurrency("UZS", 0, 15, (List<String>) linkedList0, true);
      Currency currency0 = currencyUnit0.toCurrency();
      CurrencyUnit currencyUnit1 = CurrencyUnit.of(currency0);
      assertEquals(0, currencyUnit1.getNumericCode());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CurrencyUnit currencyUnit0 = new CurrencyUnit("", (short)59, (short)59);
      Locale locale0 = Locale.TAIWAN;
      String string0 = currencyUnit0.getSymbol(locale0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CurrencyUnit currencyUnit0 = new CurrencyUnit("", (short)59, (short)59);
      String string0 = currencyUnit0.getSymbol();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.of("VUV");
      int int0 = currencyUnit0.getNumericCode();
      assertEquals(548, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CurrencyUnit currencyUnit0 = new CurrencyUnit("", (short)39, (short)31);
      String string0 = currencyUnit0.getCode();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CurrencyUnit currencyUnit0 = new CurrencyUnit("", (short)2, (short)928);
      CurrencyUnit currencyUnit1 = CurrencyUnit.GBP;
      int int0 = currencyUnit1.compareTo(currencyUnit0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.JPY;
      Locale locale0 = Locale.US;
      CurrencyUnit currencyUnit1 = CurrencyUnit.of(locale0);
      int int0 = currencyUnit0.compareTo(currencyUnit1);
      //  // Unstable assertion: assertEquals((-7), int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CurrencyUnit currencyUnit0 = new CurrencyUnit("]?=YNm_Kjbl", (short) (-2595), (short) (-2595));
      // Undeclared exception!
      try { 
        currencyUnit0.toCurrency();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Currency", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        CurrencyUnit.registerCurrency((String) null, 0, 0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Currency code must not be null
         //
         verifyException("org.joda.money.MoneyUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        CurrencyUnit.registerCurrency("VES", 3864, 3864, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid numeric code
         //
         verifyException("org.joda.money.CurrencyUnit", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add((String) null);
      // Undeclared exception!
      try { 
        CurrencyUnit.registerCurrency("QUV", (int) (short)8, (int) (short)8, (List<String>) linkedList0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ConcurrentSkipListMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      List<String> list0 = CurrencyUnit.registeredCountries();
      // Undeclared exception!
      try { 
        CurrencyUnit.registerCurrency((String) null, (-1204), (-1204), list0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Currency code must not be null
         //
         verifyException("org.joda.money.MoneyUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      // Undeclared exception!
      try { 
        CurrencyUnit.registerCurrency((String) null, (-763), (-763), (List<String>) linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Currency code must not be null
         //
         verifyException("org.joda.money.MoneyUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        CurrencyUnit.ofNumericCode((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Currency code must not be null
         //
         verifyException("org.joda.money.MoneyUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        CurrencyUnit.ofCountry((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Country code must not be null
         //
         verifyException("org.joda.money.MoneyUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        CurrencyUnit.of((Locale) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Locale must not be null
         //
         verifyException("org.joda.money.MoneyUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        CurrencyUnit.of((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Currency code must not be null
         //
         verifyException("org.joda.money.MoneyUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.AUD;
      // Undeclared exception!
      try { 
        currencyUnit0.getSymbol((Locale) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Locale must not be null
         //
         verifyException("org.joda.money.MoneyUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.EUR;
      // Undeclared exception!
      try { 
        currencyUnit0.compareTo((CurrencyUnit) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.money.CurrencyUnit", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.EUR;
      CurrencyUnit currencyUnit1 = new CurrencyUnit("(BH", (short)39, (short)39);
      boolean boolean0 = currencyUnit1.equals(currencyUnit0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.AUD;
      boolean boolean0 = currencyUnit0.equals(currencyUnit0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      CurrencyUnit currencyUnit0 = CurrencyUnit.of(locale0);
      String string0 = currencyUnit0.getNumeric3Code();
      //  // Unstable assertion: assertEquals("013", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      // Undeclared exception!
      try { 
        CurrencyUnit.ofNumericCode(3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown currency '3'
         //
         verifyException("org.joda.money.CurrencyUnit", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      // Undeclared exception!
      try { 
        CurrencyUnit.registerCurrency("VUV", 81, (-2610), (List<String>) linkedList0, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid number of decimal places
         //
         verifyException("org.joda.money.CurrencyUnit", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      List<String> list0 = CurrencyUnit.registeredCountries();
      // Undeclared exception!
      try { 
        CurrencyUnit.registerCurrency("SSP", 962, 962, list0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid number of decimal places
         //
         verifyException("org.joda.money.CurrencyUnit", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      // Undeclared exception!
      try { 
        CurrencyUnit.registerCurrency("SOS", 1048, (-1358), (List<String>) linkedList0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid numeric code
         //
         verifyException("org.joda.money.CurrencyUnit", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      // Undeclared exception!
      try { 
        CurrencyUnit.registerCurrency("GBP", (-1358), 0, (List<String>) null, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid numeric code
         //
         verifyException("org.joda.money.CurrencyUnit", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      // Undeclared exception!
      try { 
        CurrencyUnit.registerCurrency(",CM", 840, 840, (List<String>) linkedList0, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid string code, must be ASCII upper-case letters
         //
         verifyException("org.joda.money.CurrencyUnit", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CurrencyUnit currencyUnit0 = new CurrencyUnit("", (short)2, (short)928);
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Set<String> set0 = currencyUnit0.getCountryCodes();
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) set0);
      // Undeclared exception!
      try { 
        CurrencyUnit.registerCurrency("", 2319, 2319, list0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid string code, must be length 3
         //
         verifyException("org.joda.money.CurrencyUnit", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.AUD;
      CurrencyUnit.registerCountry("(BH", currencyUnit0);
      assertFalse(currencyUnit0.isPseudoCurrency());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      CurrencyUnit currencyUnit0 = CurrencyUnit.registerCurrency("UZS", 15, 15, (List<String>) linkedList0, true);
      DefaultCurrencyUnitDataProvider defaultCurrencyUnitDataProvider0 = new DefaultCurrencyUnitDataProvider();
      boolean boolean0 = currencyUnit0.equals(defaultCurrencyUnitDataProvider0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.of("XXX");
      Locale locale0 = Locale.TAIWAN;
      String string0 = currencyUnit0.getSymbol(locale0);
      assertEquals("XXX", string0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.of("XXX");
      String string0 = currencyUnit0.getSymbol();
      assertEquals("XXX", string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      CurrencyUnit currencyUnit0 = CurrencyUnit.registerCurrency("UZS", 10, (-1), (List<String>) linkedList0, true);
      boolean boolean0 = currencyUnit0.isPseudoCurrency();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.JPY;
      boolean boolean0 = currencyUnit0.isPseudoCurrency();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      CurrencyUnit currencyUnit0 = null;
      try {
        currencyUnit0 = new CurrencyUnit((String) null, (short) (-3472), (short) (-3472));
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // Joda-Money bug: Currency code must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      // Undeclared exception!
      try { 
        CurrencyUnit.of(locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No currency found for locale 'en'
         //
         verifyException("org.joda.money.CurrencyUnit", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      // Undeclared exception!
      try { 
        CurrencyUnit.ofNumericCode("/%VHXWV94vuePW");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown currency '/%VHXWV94vuePW'
         //
         verifyException("org.joda.money.CurrencyUnit", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.ofNumericCode("t2");
      assertEquals("SAR", currencyUnit0.toString());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      // Undeclared exception!
      try { 
        CurrencyUnit.ofNumericCode("'");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown currency '-9'
         //
         verifyException("org.joda.money.CurrencyUnit", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      // Undeclared exception!
      try { 
        CurrencyUnit.of(" not found");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown currency ' not found'
         //
         verifyException("org.joda.money.CurrencyUnit", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      String string0 = "QUV";
      short short0 = (short)2;
      CurrencyUnit currencyUnit0 = new CurrencyUnit("QUV", (short)2, (short)2);
      currencyUnit0.getSymbol();
      Locale locale0 = Locale.KOREA;
      currencyUnit0.getCountryCodes();
      currencyUnit0.CHF.getCountryCodes();
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      List<String> list0 = CurrencyUnit.registeredCountries();
      // Undeclared exception!
      try { 
        CurrencyUnit.registerCurrency("QUV", 0, (int) (short)2, list0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Currency already registered: QUV
         //
         verifyException("org.joda.money.CurrencyUnit", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      List<String> list0 = CurrencyUnit.registeredCountries();
      // Undeclared exception!
      try { 
        CurrencyUnit.registerCurrency("QUV", (int) (short)13, (-1), list0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Currency already registered for country: (BH
         //
         verifyException("org.joda.money.CurrencyUnit", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      List<String> list0 = CurrencyUnit.registeredCountries();
      CurrencyUnit currencyUnit0 = CurrencyUnit.registerCurrency("QAR", (-1), 18, list0, true);
      assertEquals((-1), currencyUnit0.getNumericCode());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      CurrencyUnit currencyUnit0 = new CurrencyUnit("XXX", (short) (-518), (short) (-518));
      Currency currency0 = currencyUnit0.toCurrency();
      assertEquals("XXX", currency0.getCurrencyCode());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      CurrencyUnit currencyUnit0 = new CurrencyUnit("XXX", (short) (-21516), (short)716);
      int int0 = currencyUnit0.getNumericCode();
      assertEquals((-21516), int0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      // Undeclared exception!
      try { 
        CurrencyUnit.of((Currency) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Currency must not be null
         //
         verifyException("org.joda.money.MoneyUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      CurrencyUnit currencyUnit0 = new CurrencyUnit("G1E<t3j+b2KdZB", (short) (-3073), (short) (-3073));
      int int0 = currencyUnit0.compareTo(currencyUnit0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      // Undeclared exception!
      try { 
        CurrencyUnit.registerCurrency("QUV", 0, 0, (List<String>) linkedList0);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // Currency already registered: QUV
         //
         verifyException("org.joda.money.CurrencyUnit", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      List<CurrencyUnit> list0 = CurrencyUnit.registeredCurrencies();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.registerCurrency("RSD", (-1), (-1), true);
      int int0 = currencyUnit0.getDecimalPlaces();
      assertEquals((-1), currencyUnit0.getNumericCode());
      assertEquals(0, int0);
      assertTrue(currencyUnit0.isPseudoCurrency());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      CurrencyUnit.registeredCountries();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.push("/org/joda/money/CurrencyData.csv");
      CurrencyUnit.registerCurrency("QUV", (int) (short)25, (int) (short)2, (List<String>) linkedList0, false);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.USD;
      String string0 = currencyUnit0.toString();
      assertEquals("USD", string0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      CurrencyUnit currencyUnit0 = CurrencyUnit.GBP;
      currencyUnit0.hashCode();
  }
}
