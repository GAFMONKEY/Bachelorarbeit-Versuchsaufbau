package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import java.util.FormatFlagsConversionMismatchException;
import java.util.IllegalFormatCodePointException;
import java.util.IllegalFormatConversionException;
import java.util.IllegalFormatFlagsException;
import java.util.UnknownFormatConversionException;
import org.apache.commons.lang3.Range;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class Range_ESTest extends Range_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Integer integer0 = new Integer((-2485));
      Range<Integer> range0 = Range.is(integer0);
      Integer integer1 = new Integer(1873);
      boolean boolean0 = range0.isStartedBy(integer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Integer integer0 = new Integer(895);
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(comparator0).compare(anyInt() , anyInt());
      Range<Integer> range0 = Range.is(integer0, comparator0);
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 3).when(comparator1).compare(any() , any());
      Range<Object> range1 = new Range<Object>(range0, range0, comparator1);
      Object object0 = new Object();
      boolean boolean0 = range1.isEndedBy(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Range<Integer> range0 = Range.between(integer0, integer0);
      Comparator<Range<Integer>> comparator0 = (Comparator<Range<Integer>>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1247, (-1483)).when(comparator0).compare(any(org.apache.commons.lang3.Range.class) , any(org.apache.commons.lang3.Range.class));
      Range<Range<Integer>> range1 = Range.between(range0, range0, comparator0);
      boolean boolean0 = range1.isBefore(range0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Integer integer0 = new Integer(251);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1, 41, (-1), 251, (-669)).when(comparator0).compare(any() , any());
      Range<Object> range0 = Range.is((Object) integer0, comparator0);
      Range<Object> range1 = range0.intersectionWith(range0);
      boolean boolean0 = range1.containsRange(range0);
      assertSame(range1, range0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Integer integer0 = new Integer(6111);
      Range<Integer> range0 = Range.of(integer0, integer0);
      String string0 = range0.toString(">Z&F*&Py1p|!SEk@Z>");
      assertEquals(">Z&F*&Py1p|!SEk@Z>", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Integer integer0 = new Integer(251);
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(2808, (-1)).when(comparator0).compare(anyInt() , anyInt());
      Range<Integer> range0 = Range.is(integer0, comparator0);
      boolean boolean0 = range0.isAfterRange(range0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Integer integer0 = new Integer(964);
      Range<Integer> range0 = Range.is(integer0);
      // Undeclared exception!
      try { 
        range0.toString("Kz'z4%zXs'& ");
        fail("Expecting exception: UnknownFormatConversionException");
      
      } catch(UnknownFormatConversionException e) {
         //
         // Conversion = 'z'
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Integer integer0 = new Integer((-504));
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(anyInt() , anyInt());
      Range<Integer> range0 = Range.of(integer0, integer0, comparator0);
      // Undeclared exception!
      try { 
        range0.toString("0Z\"%+nRu/");
        fail("Expecting exception: IllegalFormatFlagsException");
      
      } catch(IllegalFormatFlagsException e) {
         //
         // Flags = '+'
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparable0).compareTo(any());
      doReturn((String) null, (String) null).when(comparable0).toString();
      Range<Comparable<Object>> range0 = Range.between(comparable0, comparable0);
      // Undeclared exception!
      try { 
        range0.toString("`$Pdf>C#|%C#1");
        fail("Expecting exception: IllegalFormatConversionException");
      
      } catch(IllegalFormatConversionException e) {
         //
         // c != org.evosuite.shaded.org.mockito.codegen.Comparable$MockitoMock$1144233697
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer((-1));
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      Range<Object> range0 = Range.of((Object) integer1, (Object) integer0, comparator0);
      // Undeclared exception!
      try { 
        range0.toString("rs\"<7%CWt<JqtS'j");
        fail("Expecting exception: IllegalFormatCodePointException");
      
      } catch(IllegalFormatCodePointException e) {
         //
         // Code point = 0xffffffff
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      Range<Integer> range0 = Range.is(integer0);
      // Undeclared exception!
      try { 
        range0.toString("]c--j%,hQT`|j`%!ET9");
        fail("Expecting exception: FormatFlagsConversionMismatchException");
      
      } catch(FormatFlagsConversionMismatchException e) {
         //
         // Conversion = h, Flags = ,
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Integer integer0 = new Integer(902);
      Range<Integer> range0 = Range.between(integer0, integer0);
      // Undeclared exception!
      try { 
        range0.toString((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        Range.of((Object) null, (Object) null, (Comparator<Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // element1
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        Range.of(object0, object0, (Comparator<Object>) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.Object cannot be cast to class java.lang.Comparable (java.lang.Object and java.lang.Comparable are in module java.base of loader 'bootstrap')
         //
         verifyException("org.apache.commons.lang3.Range$ComparableComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        Range.of((Comparable<Object>) null, (Comparable<Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // element1
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Range<Object> range0 = Range.is((Object) integer0, (Comparator<Object>) null);
      // Undeclared exception!
      try { 
        range0.isStartedBy(range0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.apache.commons.lang3.Range cannot be cast to class java.lang.Comparable (org.apache.commons.lang3.Range is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @74926420; java.lang.Comparable is in module java.base of loader 'bootstrap')
         //
         verifyException("org.apache.commons.lang3.Range$ComparableComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(439).when(comparable0).compareTo(any());
      doReturn("$VALUES", "").when(comparable0).toString();
      Range<Object> range0 = Range.is((Object) comparable0, (Comparator<Object>) null);
      // Undeclared exception!
      try { 
        range0.isEndedBy("$VALUES");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparable0).compareTo(any());
      doReturn((String) null, (String) null).when(comparable0).toString();
      Range<Object> range0 = Range.is((Object) comparable0, (Comparator<Object>) null);
      Integer integer0 = new Integer(842);
      Range<Object> range1 = Range.is((Object) integer0, (Comparator<Object>) null);
      // Undeclared exception!
      try { 
        range0.isBeforeRange(range1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Integer integer0 = new Integer((-1745));
      Range<Object> range0 = Range.between((Object) integer0, (Object) integer0, (Comparator<Object>) null);
      // Undeclared exception!
      try { 
        range0.isBefore(range0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.apache.commons.lang3.Range cannot be cast to class java.lang.Comparable (org.apache.commons.lang3.Range is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @74926420; java.lang.Comparable is in module java.base of loader 'bootstrap')
         //
         verifyException("org.apache.commons.lang3.Range$ComparableComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((-35)).when(comparable0).compareTo(any());
      doReturn((String) null, "INSTANCE").when(comparable0).toString();
      Range<Object> range0 = Range.of((Object) comparable0, (Object) comparable0, (Comparator<Object>) null);
      // Undeclared exception!
      try { 
        range0.isAfter("");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        Range.is((Object) null, (Comparator<Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // element1
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Integer integer0 = new Integer(16);
      Range<Integer> range0 = Range.between(integer0, integer0);
      // Undeclared exception!
      try { 
        Range.is(range0, (Comparator<Range<Integer>>) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.apache.commons.lang3.Range cannot be cast to class java.lang.Comparable (org.apache.commons.lang3.Range is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @74926420; java.lang.Comparable is in module java.base of loader 'bootstrap')
         //
         verifyException("org.apache.commons.lang3.Range$ComparableComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        Range.is((Comparable<Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // element1
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparable0).compareTo(any());
      doReturn((String) null, (String) null).when(comparable0).toString();
      Range<Comparable<Object>> range0 = Range.is(comparable0);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      Range<Object> range1 = Range.of((Object) range0, (Object) range0, comparator0);
      Integer integer0 = new Integer(576);
      Range<Object> range2 = Range.is((Object) integer0, (Comparator<Object>) null);
      // Undeclared exception!
      try { 
        range1.intersectionWith(range2);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.apache.commons.lang3.Range cannot be cast to class java.lang.Comparable (org.apache.commons.lang3.Range is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @74926420; java.lang.Comparable is in module java.base of loader 'bootstrap')
         //
         verifyException("org.apache.commons.lang3.Range$ComparableComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Integer integer0 = new Integer(902);
      Object object0 = new Object();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1185), 902, (-1185), 902, 0).when(comparator0).compare(any() , any());
      Range<Object> range0 = Range.between((Object) integer0, object0, comparator0);
      Range<Object> range1 = range0.intersectionWith(range0);
      Range range2 = (Range)range0.fit(range1);
      range2.getMinimum();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Range<Object> range0 = Range.is((Object) "S1;", (Comparator<Object>) null);
      // Undeclared exception!
      try { 
        range0.fit((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // element
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((-126)).when(comparable0).compareTo(any());
      doReturn((String) null, "").when(comparable0).toString();
      Range<Comparable<Object>> range0 = Range.of(comparable0, comparable0);
      Range<Object> range1 = new Range<Object>("", "", (Comparator<Object>) null);
      // Undeclared exception!
      try { 
        range1.fit(range0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.apache.commons.lang3.Range cannot be cast to class java.lang.Comparable (org.apache.commons.lang3.Range is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @74926420; java.lang.Comparable is in module java.base of loader 'bootstrap')
         //
         verifyException("org.apache.commons.lang3.Range$ComparableComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Integer integer0 = new Integer(6111);
      Range<Integer> range0 = Range.is(integer0);
      // Undeclared exception!
      try { 
        range0.elementCompareTo((Integer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // element
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((-35)).when(comparable0).compareTo(any());
      doReturn((String) null, "INSTANCE").when(comparable0).toString();
      Range<Object> range0 = Range.of((Object) comparable0, (Object) comparable0, (Comparator<Object>) null);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        range0.elementCompareTo(object0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.Object cannot be cast to class java.lang.Comparable (java.lang.Object and java.lang.Comparable are in module java.base of loader 'bootstrap')
         //
         verifyException("org.apache.commons.lang3.Range$ComparableComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Integer integer0 = new Integer(2227);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparable0).compareTo(any());
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(comparable0).toString();
      Comparator<Comparable<Object>> comparator0 = (Comparator<Comparable<Object>>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any(java.lang.Comparable.class) , any(java.lang.Comparable.class));
      Range<Comparable<Object>> range0 = Range.between(comparable0, comparable0, comparator0);
      Object object0 = range0.getMinimum();
      Range<Object> range1 = Range.of((Object) object0, (Object) object0, (Comparator<Object>) null);
      // Undeclared exception!
      try { 
        range1.contains(integer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        Range.between(object0, object0, (Comparator<Object>) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.Object cannot be cast to class java.lang.Comparable (java.lang.Object and java.lang.Comparable are in module java.base of loader 'bootstrap')
         //
         verifyException("org.apache.commons.lang3.Range$ComparableComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        Range.between((Comparable<Object>) null, (Comparable<Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // element1
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Range<Comparable<Object>> range0 = null;
      try {
        range0 = new Range<Comparable<Object>>((Comparable<Object>) null, (Comparable<Object>) null, (Comparator<Comparable<Object>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // element1
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Object object0 = new Object();
      Range<Object> range0 = null;
      try {
        range0 = new Range<Object>(object0, object0, (Comparator<Object>) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.Object cannot be cast to class java.lang.Comparable (java.lang.Object and java.lang.Comparable are in module java.base of loader 'bootstrap')
         //
         verifyException("org.apache.commons.lang3.Range$ComparableComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Integer integer0 = new Integer((-2165));
      Range<Integer> range0 = Range.is(integer0);
      String string0 = range0.toString();
      assertEquals("[-2165..-2165]", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Range<Integer> range0 = Range.between(integer0, integer0);
      Comparator<Range<Integer>> comparator0 = (Comparator<Range<Integer>>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 292, 0).when(comparator0).compare(any(org.apache.commons.lang3.Range.class) , any(org.apache.commons.lang3.Range.class));
      Range<Range<Integer>> range1 = Range.between(range0, range0, comparator0);
      Comparator<Range<Integer>> comparator1 = (Comparator<Range<Integer>>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator1).compare(any(org.apache.commons.lang3.Range.class) , any(org.apache.commons.lang3.Range.class));
      Range<Range<Integer>> range2 = Range.between(range0, range0, comparator1);
      range1.isAfterRange(range2);
      Integer integer1 = new Integer(3609);
      Comparator<Integer> comparator2 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1724)).when(comparator2).compare(anyInt() , anyInt());
      Range.is(integer1, comparator2);
      range1.isBefore(range0);
      range0.getMinimum();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(2189, 1247, 2189, 0, 0).when(comparable0).compareTo(any());
      doReturn("", "").when(comparable0).toString();
      Range<Comparable<Object>> range3 = Range.between(comparable0, comparable0, (Comparator<Comparable<Object>>) null);
      Comparable<Object> comparable1 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(3318).when(comparable1).compareTo(any());
      doReturn("", "").when(comparable1).toString();
      Range<Comparable<Object>> range4 = Range.is(comparable1, (Comparator<Comparable<Object>>) null);
      range3.isOverlappedBy(range4);
      Comparable<Object> comparable2 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((-1724)).when(comparable2).compareTo(any());
      range3.isStartedBy(comparable2);
      Comparator<Integer> comparator3 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1483)).when(comparator3).compare(anyInt() , anyInt());
      Range.between(integer0, integer1, comparator3);
      Comparable<Integer> comparable3 = null;
      Comparator<Comparable<Integer>> comparator4 = (Comparator<Comparable<Integer>>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        Range.between((Comparable<Integer>) integer1, (Comparable<Integer>) null, comparator4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // element2
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((-2641), (-2641), 1).when(comparable0).compareTo(any());
      doReturn("DJ", "hL").when(comparable0).toString();
      Range<Comparable<Object>> range0 = Range.of(comparable0, comparable0);
      Comparable<Object> comparable1 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparable1).compareTo(any());
      doReturn("", "hL", "", (String) null).when(comparable1).toString();
      Comparator<Comparable<Object>> comparator0 = (Comparator<Comparable<Object>>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-2641), 1, (-1), 0, 0).when(comparator0).compare(any(java.lang.Comparable.class) , any(java.lang.Comparable.class));
      Range<Comparable<Object>> range1 = Range.of(comparable1, comparable1, comparator0);
      Range<Comparable<Object>> range2 = range0.intersectionWith(range1);
      boolean boolean0 = range2.isNaturalOrdering();
      Integer integer0 = new Integer(0);
      Range<Integer> range3 = Range.between(integer0, integer0);
      boolean boolean1 = range3.isStartedBy(integer0);
      assertTrue(boolean1 == boolean0);
      
      Integer integer1 = new Integer(0);
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn("", "DJ", "DJ").when(comparator1).toString();
      doReturn((-2641), (-877), (-1), 801).when(comparator1).compare(any() , any());
      Range<Object> range4 = Range.between((Object) integer0, (Object) integer1, comparator1);
      Comparator<Integer> comparator2 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(comparator2).compare(anyInt() , anyInt());
      Range<Integer> range5 = Range.is(integer1, comparator2);
      Object object0 = range5.getMaximum();
      Comparator<Object> comparator3 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1, 3, (-877)).when(comparator3).compare(any() , any());
      Range<Object> range6 = new Range<Object>(range1, object0, comparator3);
      Range<Object> range7 = range4.intersectionWith(range6);
      Comparator<Comparable<Integer>> comparator4 = (Comparator<Comparable<Integer>>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator4).compare(any(java.lang.Comparable.class) , any(java.lang.Comparable.class));
      Range<Comparable<Integer>> range8 = Range.between((Comparable<Integer>) integer1, (Comparable<Integer>) integer1, comparator4);
      Comparator<Range<Object>> comparator5 = (Comparator<Range<Object>>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator5).compare(any(org.apache.commons.lang3.Range.class) , any(org.apache.commons.lang3.Range.class));
      Range<Range<Object>> range9 = Range.of(range7, range6, comparator5);
      Object object1 = range9.getMaximum();
      boolean boolean2 = range8.equals(object1);
      assertFalse(boolean2);
      assertTrue(range4.equals((Object)range7));
      
      range0.isOverlappedBy(range1);
      assertTrue(range1.equals((Object)range2));
      assertFalse(range0.equals((Object)range1));
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Integer integer0 = new Integer(895);
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(895).when(comparator0).compare(anyInt() , anyInt());
      Range<Integer> range0 = Range.is(integer0, comparator0);
      boolean boolean0 = range0.isOverlappedBy((Range<Integer>) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Integer integer0 = new Integer(251);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn("", "", "").when(comparator0).toString();
      doReturn(1, 41, (-1), 251, (-669)).when(comparator0).compare(any() , any());
      Range<Object> range0 = Range.is((Object) integer0, comparator0);
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(251, 1, 0).when(comparator1).compare(any() , any());
      Range<Object> range1 = Range.between((Object) range0, (Object) integer0, comparator1);
      Range<Object> range2 = range0.intersectionWith(range1);
      boolean boolean0 = range0.isAfter(range2);
      assertTrue(boolean0);
      assertTrue(range2.equals((Object)range0));
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Integer integer0 = new Integer(251);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1, 41).when(comparator0).compare(any() , any());
      Range<Object> range0 = Range.is((Object) integer0, comparator0);
      boolean boolean0 = range0.isAfter(range0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Integer integer0 = new Integer(902);
      Object object0 = new Object();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      Range<Object> range0 = Range.between((Object) integer0, object0, comparator0);
      Comparator<Range<Object>> comparator1 = (Comparator<Range<Object>>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator1).compare(any(org.apache.commons.lang3.Range.class) , any(org.apache.commons.lang3.Range.class));
      Range<Range<Object>> range1 = Range.is(range0, comparator1);
      boolean boolean0 = range1.equals(range0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-2641)).when(comparator0).compare(any() , any());
      Range<Object> range0 = Range.between((Object) integer0, (Object) integer0, comparator0);
      Comparator<Comparable<Integer>> comparator1 = (Comparator<Comparable<Integer>>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1824)).when(comparator1).compare(any(java.lang.Comparable.class) , any(java.lang.Comparable.class));
      Range<Comparable<Integer>> range1 = Range.between((Comparable<Integer>) integer0, (Comparable<Integer>) integer0, comparator1);
      Comparator<Range<Object>> comparator2 = (Comparator<Range<Object>>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1106).when(comparator2).compare(any(org.apache.commons.lang3.Range.class) , any(org.apache.commons.lang3.Range.class));
      Range<Range<Object>> range2 = Range.of(range0, range0, comparator2);
      Object object0 = range2.getMaximum();
      boolean boolean0 = range1.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparable0).compareTo(any());
      doReturn((String) null, (String) null).when(comparable0).toString();
      Range<Comparable<Object>> range0 = Range.is(comparable0);
      Integer integer0 = new Integer((-424));
      Object object0 = new Object();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null).when(comparator0).toString();
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Range<Object> range1 = new Range<Object>(integer0, object0, comparator0);
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(comparator1).compare(any() , any());
      Range<Object> range2 = Range.is((Object) range0, comparator1);
      Range<Object> range3 = range1.intersectionWith(range2);
      Object object1 = range3.getMaximum();
      boolean boolean0 = range0.equals(object1);
      assertTrue(boolean0);
      assertFalse(range3.equals((Object)range2));
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Integer integer0 = new Integer((-1745));
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Range<Integer> range0 = Range.is(integer0, comparator0);
      boolean boolean0 = range0.contains(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Integer integer0 = new Integer(902);
      Range<Integer> range0 = Range.between(integer0, integer0);
      Integer integer1 = new Integer(1380);
      boolean boolean0 = range0.contains(integer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Integer integer0 = new Integer(2227);
      Range<Integer> range0 = Range.of(integer0, integer0);
      Comparator<Integer> comparator0 = range0.getComparator();
      assertNotNull(comparator0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Integer integer0 = new Integer(2251);
      Range<Object> range0 = new Range<Object>(integer0, integer0, (Comparator<Object>) null);
      String string0 = range0.toString();
      assertNotNull(string0);
      assertEquals("[2251..2251]", string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparable0).compareTo(any());
      doReturn((String) null, (String) null).when(comparable0).toString();
      Range<Comparable<Object>> range0 = Range.between(comparable0, comparable0);
      boolean boolean0 = range0.isStartedBy((Comparable<Object>) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Integer integer0 = new Integer(37);
      Range<Integer> range0 = Range.is(integer0);
      // Undeclared exception!
      try { 
        range0.intersectionWith((Range<Integer>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot calculate intersection with non-overlapping range null
         //
         verifyException("org.apache.commons.lang3.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Integer integer0 = new Integer(895);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(895).when(comparator0).compare(any() , any());
      Range<Object> range0 = Range.of((Object) integer0, (Object) integer0, comparator0);
      boolean boolean0 = range0.isNaturalOrdering();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Integer integer0 = new Integer(902);
      Range<Integer> range0 = Range.between(integer0, integer0);
      Integer integer1 = new Integer((-1));
      boolean boolean0 = range0.isEndedBy(integer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Integer integer0 = new Integer(6111);
      Range<Integer> range0 = Range.is(integer0);
      boolean boolean0 = range0.isEndedBy((Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Integer integer0 = new Integer((-1837));
      Range<Integer> range0 = Range.between(integer0, integer0);
      boolean boolean0 = range0.isEndedBy(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Integer integer0 = new Integer(902);
      Range<Integer> range0 = Range.between(integer0, integer0);
      boolean boolean0 = range0.isBeforeRange((Range<Integer>) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Integer integer0 = new Integer(902);
      Object object0 = new Object();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1185), 902).when(comparator0).compare(any() , any());
      Range<Object> range0 = Range.between((Object) integer0, object0, comparator0);
      boolean boolean0 = range0.isBeforeRange(range0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Integer integer0 = new Integer(40);
      Range<Integer> range0 = Range.between(integer0, integer0);
      boolean boolean0 = range0.isBefore((Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Integer integer0 = new Integer((-1837));
      Range<Integer> range0 = Range.between(integer0, integer0);
      boolean boolean0 = range0.isAfterRange((Range<Integer>) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparable0).compareTo(any());
      doReturn((String) null, (String) null).when(comparable0).toString();
      Range<Comparable<Object>> range0 = Range.is(comparable0);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Range<Object> range1 = Range.of((Object) range0, (Object) range0, comparator0);
      boolean boolean0 = range1.isAfterRange(range1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Integer integer0 = new Integer((-694));
      Range<Integer> range0 = Range.between(integer0, integer0);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-694)).when(comparator0).compare(any() , any());
      Range<Object> range1 = Range.of((Object) range0, (Object) range0, comparator0);
      boolean boolean0 = range1.isAfter((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Integer integer0 = new Integer((-1154));
      Integer integer1 = new Integer(2554);
      Range<Integer> range0 = Range.of(integer0, integer1);
      Integer integer2 = new Integer(1039);
      Range<Integer> range1 = Range.is(integer2);
      Range<Integer> range2 = range0.intersectionWith(range1);
      assertNotSame(range2, range0);
      assertTrue(range2.equals((Object)range1));
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Integer integer0 = new Integer(902);
      Range<Integer> range0 = Range.between(integer0, integer0);
      range0.hashCode();
      range0.hashCode();
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Integer integer0 = new Integer(902);
      Object object0 = new Object();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn("", "", "").when(comparator0).toString();
      doReturn((-1185), 902, (-1185), 902).when(comparator0).compare(any() , any());
      Range<Object> range0 = Range.between((Object) integer0, object0, comparator0);
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(902, 37, 902, 744, (-1185)).when(comparator1).compare(any() , any());
      Range<Object> range1 = new Range<Object>(range0, integer0, comparator1);
      Range<Object> range2 = range0.intersectionWith(range1);
      range1.fit(range2);
      assertNotSame(range2, range0);
      assertFalse(range2.equals((Object)range0));
      assertNotSame(range0, range2);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Integer integer0 = new Integer((-1837));
      Range<Integer> range0 = Range.between(integer0, integer0);
      Integer integer1 = range0.fit(integer0);
      assertEquals((-1837), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Integer integer0 = new Integer((-694));
      Range<Integer> range0 = Range.between(integer0, integer0);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-694)).when(comparator0).compare(any() , any());
      Range<Object> range1 = Range.of((Object) range0, (Object) range0, comparator0);
      boolean boolean0 = range1.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((-1185)).when(comparable0).compareTo(any());
      doReturn("v&", "v&").when(comparable0).toString();
      Range<Comparable<Object>> range0 = Range.is(comparable0);
      boolean boolean0 = range0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Integer integer0 = new Integer((-2950));
      Range<Integer> range0 = Range.between(integer0, integer0);
      Integer integer1 = new Integer(3);
      int int0 = range0.elementCompareTo(integer1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Integer integer0 = new Integer(902);
      Range<Integer> range0 = Range.is(integer0);
      Integer integer1 = new Integer((-1586));
      int int0 = range0.elementCompareTo(integer1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Integer integer0 = new Integer(2443);
      Range<Integer> range0 = Range.is(integer0);
      int int0 = range0.elementCompareTo(integer0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Integer integer0 = new Integer((-1780));
      Range<Integer> range0 = Range.between(integer0, integer0);
      boolean boolean0 = range0.containsRange(range0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Integer integer0 = new Integer(37);
      Range<Integer> range0 = Range.is(integer0);
      Integer integer1 = new Integer((-3232));
      Range<Integer> range1 = Range.of(integer1, integer1);
      boolean boolean0 = range0.containsRange(range1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Range<Integer> range0 = Range.between(integer0, integer0);
      boolean boolean0 = range0.containsRange((Range<Integer>) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Integer integer0 = new Integer(2256);
      Range<Integer> range0 = Range.is(integer0);
      Integer integer1 = new Integer(37);
      boolean boolean0 = range0.contains(integer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Integer integer0 = new Integer(6111);
      Range<Integer> range0 = Range.is(integer0);
      boolean boolean0 = range0.contains((Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Integer integer0 = new Integer((-2485));
      Integer integer1 = new Integer(1873);
      Range<Integer> range0 = Range.between(integer1, integer0);
      assertTrue(range0.isNaturalOrdering());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Integer integer0 = new Integer((-2485));
      Range<Integer> range0 = Range.is(integer0);
      Integer integer1 = new Integer(1873);
      Range<Integer> range1 = Range.between(integer1, integer0);
      boolean boolean0 = range0.containsRange(range1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      Range<Integer> range0 = Range.between(integer0, integer0);
      String string0 = range0.toString("");
      assertEquals("", string0);
  }
}
