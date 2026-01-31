import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
            System.out.format("%n%s%n", "RegressionTest1.test501");
        org.apache.commons.lang3.IntegerRange integerRange2 = org.apache.commons.lang3.IntegerRange.of((int) '#', (int) (byte) 1);
        org.apache.commons.lang3.NumberRange<java.lang.Integer> intNumberRange3 = org.apache.commons.lang3.SerializationUtils.clone((org.apache.commons.lang3.NumberRange<java.lang.Integer>) integerRange2);
        boolean boolean4 = integerRange2.isNaturalOrdering();
        org.apache.commons.lang3.IntegerRange integerRange7 = org.apache.commons.lang3.IntegerRange.of((int) '#', (int) (byte) 1);
        org.apache.commons.lang3.BitField bitField9 = new org.apache.commons.lang3.BitField(5);
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils10 = new org.apache.commons.lang3.reflect.FieldUtils();
        org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.IntegerRange, org.apache.commons.lang3.BitField, org.apache.commons.lang3.reflect.FieldUtils> integerRangeMutableTriple11 = org.apache.commons.lang3.tuple.MutableTriple.of(integerRange7, bitField9, fieldUtils10);
        org.apache.commons.lang3.IntegerRange integerRange14 = org.apache.commons.lang3.IntegerRange.of((int) '#', (int) (byte) 1);
        org.apache.commons.lang3.NumberRange<java.lang.Integer> intNumberRange15 = org.apache.commons.lang3.SerializationUtils.clone((org.apache.commons.lang3.NumberRange<java.lang.Integer>) integerRange14);
        boolean boolean16 = integerRange7.isOverlappedBy((org.apache.commons.lang3.Range<java.lang.Integer>) intNumberRange15);
        org.apache.commons.lang3.Range<java.lang.Integer> intRange17 = integerRange2.intersectionWith((org.apache.commons.lang3.Range<java.lang.Integer>) intNumberRange15);
        java.lang.String str18 = intNumberRange15.toString();
        boolean boolean20 = intNumberRange15.isEndedBy((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(integerRange2);
        org.junit.Assert.assertNotNull(intNumberRange3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(integerRange7);
        org.junit.Assert.assertNotNull(integerRangeMutableTriple11);
        org.junit.Assert.assertNotNull(integerRange14);
        org.junit.Assert.assertNotNull(intNumberRange15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intRange17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[1..35]" + "'", str18, "[1..35]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        org.apache.commons.lang3.ObjectUtils objectUtils0 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        org.apache.commons.lang3.builder.DiffBuilder<org.apache.commons.lang3.ObjectUtils> objectUtilsDiffBuilder3 = new org.apache.commons.lang3.builder.DiffBuilder<org.apache.commons.lang3.ObjectUtils>(objectUtils0, objectUtils1, toStringStyle2);
        org.apache.commons.lang3.builder.DiffBuilder<org.apache.commons.lang3.ObjectUtils> objectUtilsDiffBuilder7 = objectUtilsDiffBuilder3.append("sun.net.httpserver.drainAmount", '#', '\000');
        org.apache.commons.lang3.builder.DiffBuilder<org.apache.commons.lang3.ObjectUtils> objectUtilsDiffBuilder11 = objectUtilsDiffBuilder7.append("stderr.encoding", (short) 5, (short) 5);
        short[] shortArray17 = new short[] { (short) 1, (short) 1, (short) 1, (short) -1 };
        short[] shortArray18 = org.apache.commons.lang3.ArraySorter.sort(shortArray17);
        short[] shortArray19 = null;
        org.apache.commons.lang3.builder.DiffBuilder<org.apache.commons.lang3.ObjectUtils> objectUtilsDiffBuilder20 = objectUtilsDiffBuilder7.append("", shortArray18, shortArray19);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer24 = new org.apache.commons.lang3.text.StrTokenizer("hi!", 'a');
        org.apache.commons.lang3.IntegerRange integerRange27 = org.apache.commons.lang3.IntegerRange.of((int) '#', (int) (byte) 1);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder28 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder31 = reflectionToStringBuilder28.append("sun.net.httpserver.maxIdleConnections", (byte) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder33 = toStringBuilder31.append('a');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder35 = toStringBuilder33.append('3');
        java.lang.String str36 = toStringBuilder35.build();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder39 = toStringBuilder35.append("d/2mISuPX[", (short) 10);
        org.apache.commons.lang3.builder.DiffBuilder<org.apache.commons.lang3.ObjectUtils> objectUtilsDiffBuilder40 = objectUtilsDiffBuilder20.append("(null,StrTokenizer[not tokenized yet])", (java.lang.Object) strTokenizer24, (java.lang.Object) (short) 10);
        org.junit.Assert.assertNotNull(toStringStyle2);
        org.junit.Assert.assertNotNull(objectUtilsDiffBuilder7);
        org.junit.Assert.assertNotNull(objectUtilsDiffBuilder11);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray17, new short[] { (short) -1, (short) 1, (short) 1, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray18, new short[] { (short) -1, (short) 1, (short) 1, (short) 1 });
        org.junit.Assert.assertNotNull(objectUtilsDiffBuilder20);
        org.junit.Assert.assertNotNull(integerRange27);
        org.junit.Assert.assertNotNull(toStringBuilder31);
        org.junit.Assert.assertNotNull(toStringBuilder33);
        org.junit.Assert.assertNotNull(toStringBuilder35);
        org.junit.Assert.assertNotNull(toStringBuilder39);
        org.junit.Assert.assertNotNull(objectUtilsDiffBuilder40);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        java.lang.String str0 = org.apache.commons.lang3.SystemProperties.JDK_SERIAL_FILTER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "jdk.serialFilter" + "'", str0, "jdk.serialFilter");
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        org.apache.commons.lang3.IntegerRange integerRange2 = org.apache.commons.lang3.IntegerRange.of((int) '#', (int) (byte) 1);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder3 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder3.append("sun.net.httpserver.maxIdleConnections", (byte) 10);
        java.lang.Double[] doubleArray12 = new java.lang.Double[] { 0.0d, 10.0d, 0.0d, 100.0d, 10.0d };
        java.lang.Double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray12);
        java.lang.Double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray13);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder15 = reflectionToStringBuilder3.appendAsObjectToString((java.lang.Object) doubleArray13);
        long[] longArray17 = new long[] { 1L };
        long long18 = org.apache.commons.lang3.math.NumberUtils.min(longArray17);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder19 = reflectionToStringBuilder3.append(longArray17);
        char[] charArray21 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder23 = reflectionToStringBuilder3.append("[-1..0]", charArray21, true);
        java.lang.Short[] shortArray25 = new java.lang.Short[] { (short) -1 };
        short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray25, (short) (byte) 1);
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray27, (short) 100, 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder31 = reflectionToStringBuilder3.append(shortArray27);
        org.junit.Assert.assertNotNull(integerRange2);
        org.junit.Assert.assertNotNull(toStringBuilder6);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new java.lang.Double[] { 0.0d, 10.0d, 0.0d, 100.0d, 10.0d });
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new java.lang.Double[] { 0.0d, 10.0d, 0.0d, 100.0d, 10.0d });
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new java.lang.Double[] { 0.0d, 10.0d, 0.0d, 100.0d, 10.0d });
        org.junit.Assert.assertNotNull(toStringBuilder15);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(toStringBuilder19);
        org.junit.Assert.assertNotNull(toStringBuilder23);
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertArrayEquals(shortArray25, new java.lang.Short[] { (short) -1 });
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertArrayEquals(shortArray27, new short[] { (short) -1 });
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(toStringBuilder31);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        java.lang.String str0 = org.apache.commons.lang3.SystemProperties.JAVAX_RMI_SSL_CLIENT_ENABLED_PROTOCOLS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "javax.rmi.ssl.client.enabledProtocols" + "'", str0, "javax.rmi.ssl.client.enabledProtocols");
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        org.apache.commons.lang3.ObjectUtils objectUtils0 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        org.apache.commons.lang3.builder.DiffBuilder<org.apache.commons.lang3.ObjectUtils> objectUtilsDiffBuilder3 = new org.apache.commons.lang3.builder.DiffBuilder<org.apache.commons.lang3.ObjectUtils>(objectUtils0, objectUtils1, toStringStyle2);
        org.apache.commons.lang3.builder.DiffBuilder<org.apache.commons.lang3.ObjectUtils> objectUtilsDiffBuilder7 = objectUtilsDiffBuilder3.append("sun.net.httpserver.drainAmount", '#', '\000');
        org.apache.commons.lang3.IntegerRange integerRange11 = org.apache.commons.lang3.IntegerRange.of((int) '#', (int) (byte) 1);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder12 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder15 = reflectionToStringBuilder12.append("sun.net.httpserver.maxIdleConnections", (byte) 10);
        org.apache.commons.lang3.IntegerRange integerRange19 = org.apache.commons.lang3.IntegerRange.of((int) '#', (int) (byte) 1);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder20 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.concurrent.CircuitBreakingException circuitBreakingException21 = new org.apache.commons.lang3.concurrent.CircuitBreakingException();
        org.apache.commons.lang3.concurrent.CircuitBreakingException circuitBreakingException22 = new org.apache.commons.lang3.concurrent.CircuitBreakingException((java.lang.Throwable) circuitBreakingException21);
        org.apache.commons.lang3.concurrent.CircuitBreakingException circuitBreakingException23 = org.apache.commons.lang3.ObjectUtils.clone(circuitBreakingException22);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder24 = reflectionToStringBuilder20.appendAsObjectToString((java.lang.Object) circuitBreakingException22);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer28 = new org.apache.commons.lang3.text.StrTokenizer("hi!", 'a');
        java.util.ListIterator<java.lang.String> strItor29 = org.apache.commons.lang3.ObjectUtils.clone((java.util.ListIterator<java.lang.String>) strTokenizer28);
        char[] charArray33 = new char[] { '#' };
        int int34 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "java.vm.specification.vendor", (int) '4', charArray33);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer35 = strTokenizer28.reset(charArray33);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder36 = reflectionToStringBuilder20.append("on", charArray33);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder38 = toStringBuilder15.append("jdk.internal.httpclient.disableHostnameVerification", charArray33, true);
        short[] shortArray44 = new short[] { (short) 100, (short) 10, (byte) -1, (short) 10, (byte) 100 };
        short[] shortArray46 = org.apache.commons.lang3.ArrayUtils.removeAllOccurrences(shortArray44, (short) (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder47 = toStringBuilder15.append(shortArray44);
        java.util.BitSet bitSet50 = org.apache.commons.lang3.ArrayUtils.indexesOf(shortArray44, (short) (byte) 1, (int) 'j');
        java.lang.Short[] shortArray52 = new java.lang.Short[] { (short) -1 };
        short[] shortArray54 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray52, (short) (byte) 1);
        int int57 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray54, (short) 100, 0);
        int int60 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray54, (short) (byte) 10, 0);
        org.apache.commons.lang3.builder.DiffBuilder<org.apache.commons.lang3.ObjectUtils> objectUtilsDiffBuilder61 = objectUtilsDiffBuilder3.append("01:00:00", shortArray44, shortArray54);
        org.apache.commons.lang3.builder.DiffBuilder<org.apache.commons.lang3.ObjectUtils> objectUtilsDiffBuilder65 = objectUtilsDiffBuilder3.append("72d81250", false, false);
        org.junit.Assert.assertNotNull(toStringStyle2);
        org.junit.Assert.assertNotNull(objectUtilsDiffBuilder7);
        org.junit.Assert.assertNotNull(integerRange11);
        org.junit.Assert.assertNotNull(toStringBuilder15);
        org.junit.Assert.assertNotNull(integerRange19);
        org.junit.Assert.assertNull(circuitBreakingException23);
        org.junit.Assert.assertNotNull(toStringBuilder24);
        org.junit.Assert.assertNotNull(strItor29);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { '#' });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertNotNull(toStringBuilder36);
        org.junit.Assert.assertNotNull(toStringBuilder38);
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertArrayEquals(shortArray44, new short[] { (short) 100, (short) 10, (short) -1, (short) 10, (short) 100 });
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertArrayEquals(shortArray46, new short[] { (short) 100, (short) 10, (short) -1, (short) 10, (short) 100 });
        org.junit.Assert.assertNotNull(toStringBuilder47);
        org.junit.Assert.assertNotNull(bitSet50);
        org.junit.Assert.assertEquals(bitSet50.toString(), "{}");
        org.junit.Assert.assertNotNull(shortArray52);
        org.junit.Assert.assertArrayEquals(shortArray52, new java.lang.Short[] { (short) -1 });
        org.junit.Assert.assertNotNull(shortArray54);
        org.junit.Assert.assertArrayEquals(shortArray54, new short[] { (short) -1 });
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(objectUtilsDiffBuilder61);
        org.junit.Assert.assertNotNull(objectUtilsDiffBuilder65);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        boolean boolean1 = stopWatch0.isStarted();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        org.apache.commons.lang3.function.ByteConsumer byteConsumer0 = org.apache.commons.lang3.function.ByteConsumer.nop();
        org.apache.commons.lang3.mutable.MutableLong mutableLong2 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 2);
        float float3 = mutableLong2.floatValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong5 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 2);
        int int6 = mutableLong2.compareTo(mutableLong5);
        org.apache.commons.lang3.mutable.MutableLong mutableLong8 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 2);
        int int9 = mutableLong8.intValue();
        org.apache.commons.lang3.Range<org.apache.commons.lang3.mutable.MutableLong> mutableLongRange10 = org.apache.commons.lang3.Range.is(mutableLong8);
        mutableLong8.increment();
        org.apache.commons.lang3.mutable.MutableLong mutableLong13 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 2);
        int int14 = mutableLong13.intValue();
        org.apache.commons.lang3.Range<org.apache.commons.lang3.mutable.MutableLong> mutableLongRange15 = org.apache.commons.lang3.Range.is(mutableLong13);
        org.apache.commons.lang3.mutable.MutableLong mutableLong17 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 2);
        float float18 = mutableLong17.floatValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong20 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 2);
        int int21 = mutableLong20.intValue();
        org.apache.commons.lang3.Range<org.apache.commons.lang3.mutable.MutableLong> mutableLongRange22 = org.apache.commons.lang3.Range.is(mutableLong20);
        org.apache.commons.lang3.mutable.MutableLong mutableLong24 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 2);
        int int25 = mutableLong24.intValue();
        org.apache.commons.lang3.Range<org.apache.commons.lang3.mutable.MutableLong> mutableLongRange26 = org.apache.commons.lang3.Range.is(mutableLong24);
        org.apache.commons.lang3.mutable.MutableLong[] mutableLongArray27 = new org.apache.commons.lang3.mutable.MutableLong[] { mutableLong5, mutableLong8, mutableLong13, mutableLong17, mutableLong20, mutableLong24 };
        java.lang.Class<org.apache.commons.lang3.mutable.MutableLong> mutableLongClass28 = org.apache.commons.lang3.ArrayUtils.getComponentType(mutableLongArray27);
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.function.ByteConsumer, org.apache.commons.lang3.mutable.MutableLong[]> byteConsumerImmutablePair29 = org.apache.commons.lang3.tuple.ImmutablePair.of(byteConsumer0, mutableLongArray27);
        org.apache.commons.lang3.function.ByteConsumer byteConsumer30 = org.apache.commons.lang3.function.ByteConsumer.nop();
        org.apache.commons.lang3.function.ByteConsumer byteConsumer31 = byteConsumer0.andThen(byteConsumer30);
        byteConsumer0.accept((byte) -1);
        org.junit.Assert.assertNotNull(byteConsumer0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(mutableLongRange10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(mutableLongRange15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 2.0f + "'", float18 == 2.0f);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(mutableLongRange22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(mutableLongRange26);
        org.junit.Assert.assertNotNull(mutableLongArray27);
        org.junit.Assert.assertNotNull(mutableLongClass28);
        org.junit.Assert.assertNotNull(byteConsumerImmutablePair29);
        org.junit.Assert.assertNotNull(byteConsumer30);
        org.junit.Assert.assertNotNull(byteConsumer31);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        org.apache.commons.lang3.function.FailableObjIntConsumer<java.lang.Enum<org.apache.commons.lang3.JavaVersion>, org.apache.commons.lang3.concurrent.CircuitBreakingException> javaVersionEnumFailableObjIntConsumer0 = org.apache.commons.lang3.function.FailableObjIntConsumer.nop();
        org.apache.commons.lang3.JavaVersion javaVersion1 = org.apache.commons.lang3.JavaVersion.JAVA_9;
        org.apache.commons.lang3.JavaVersion javaVersion2 = org.apache.commons.lang3.JavaVersion.JAVA_9;
        int int3 = org.apache.commons.lang3.ObjectUtils.compare(javaVersion1, javaVersion2);
        org.apache.commons.lang3.Range<org.apache.commons.lang3.JavaVersion> javaVersionRange4 = org.apache.commons.lang3.Range.is(javaVersion1);
        javaVersionEnumFailableObjIntConsumer0.accept((java.lang.Enum<org.apache.commons.lang3.JavaVersion>) javaVersion1, 96);
        org.junit.Assert.assertNotNull(javaVersionEnumFailableObjIntConsumer0);
        org.junit.Assert.assertTrue("'" + javaVersion1 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_9 + "'", javaVersion1.equals(org.apache.commons.lang3.JavaVersion.JAVA_9));
        org.junit.Assert.assertTrue("'" + javaVersion2 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_9 + "'", javaVersion2.equals(org.apache.commons.lang3.JavaVersion.JAVA_9));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(javaVersionRange4);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.String str2 = strSubstitutor0.replace((java.lang.CharSequence) "101");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = strSubstitutor0.replace("jdk.xml.entityReplacementLimi_t", 2026, (int) (short) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "101" + "'", str2, "101");
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Object[]> objArrayMutableObject7 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Object[]>((java.lang.Object[]) wildcardClassArray6);
        org.apache.commons.lang3.JavaVersion javaVersion8 = org.apache.commons.lang3.JavaVersion.JAVA_9;
        java.lang.String[] strArray28 = new java.lang.String[] { "UTF-16LE", "apple.awt.enableTemplateImages", "P0Y0M0DT0H0M0.004S", "java.nio.channels.spi.AsynchronousChannelProvider", "jdk.net.URLClassPath.showIgnoredClassPathEntries", "Character", "hi!", "jdk.http.auth.proxying.disabledSchemes", "Azul Systems, Inc.", ":", "jdk.http.auth.proxying.disabledSchemes", "Azul Systems, Inc.", "local|*.local|169.254/16|*.169.254/16", "jdk.module.main", "UTF-16LE", "java.rmi.server.codebase", "P0Y0M0DT0H0M0.004S", "P0Y0M0DT0H0M0.004S", "04jdk.http.auth.proxying.disabledSchemes452#52#-14Character4Character44java.rmi.server.codebase4jdk.net.URLClassPath.showIgnoredClassPathEntries40" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        org.apache.commons.lang3.tuple.MutableTriple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>> objArraySupplierMutableTriple31 = new org.apache.commons.lang3.tuple.MutableTriple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>((java.util.function.Supplier<java.lang.Object[]>) objArrayMutableObject7, (java.lang.Enum<org.apache.commons.lang3.JavaVersion>) javaVersion8, (java.util.List<java.lang.String>) strList29);
        org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>> objArraySupplierTriple32 = null;
        java.util.function.Predicate<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>> objArraySupplierTriplePredicate33 = org.apache.commons.lang3.compare.ComparableUtils.betweenExclusive((org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>) objArraySupplierMutableTriple31, objArraySupplierTriple32);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer36 = new org.apache.commons.lang3.text.StrTokenizer("Character", '#');
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>, org.apache.commons.lang3.text.StrTokenizer> objArraySupplierTripleImmutablePair37 = org.apache.commons.lang3.tuple.ImmutablePair.of(objArraySupplierTriple32, strTokenizer36);
        org.apache.commons.lang3.Range<org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>, org.apache.commons.lang3.text.StrTokenizer>> supplierTripleImmutablePairRange38 = org.apache.commons.lang3.Range.is(objArraySupplierTripleImmutablePair37);
        java.lang.String str39 = objArraySupplierTripleImmutablePair37.toString();
        org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>> objArraySupplierTriple40 = objArraySupplierTripleImmutablePair37.getLeft();
        org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>, org.apache.commons.lang3.text.StrTokenizer> objArraySupplierTriplePair41 = org.apache.commons.lang3.ObjectUtils.clone((org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>, org.apache.commons.lang3.text.StrTokenizer>) objArraySupplierTripleImmutablePair37);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertTrue("'" + javaVersion8 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_9 + "'", javaVersion8.equals(org.apache.commons.lang3.JavaVersion.JAVA_9));
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "UTF-16LE", "apple.awt.enableTemplateImages", "P0Y0M0DT0H0M0.004S", "java.nio.channels.spi.AsynchronousChannelProvider", "jdk.net.URLClassPath.showIgnoredClassPathEntries", "Character", "hi!", "jdk.http.auth.proxying.disabledSchemes", "Azul Systems, Inc.", ":", "jdk.http.auth.proxying.disabledSchemes", "Azul Systems, Inc.", "local|*.local|169.254/16|*.169.254/16", "jdk.module.main", "UTF-16LE", "java.rmi.server.codebase", "P0Y0M0DT0H0M0.004S", "P0Y0M0DT0H0M0.004S", "04jdk.http.auth.proxying.disabledSchemes452#52#-14Character4Character44java.rmi.server.codebase4jdk.net.URLClassPath.showIgnoredClassPathEntries40" });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArraySupplierTriplePredicate33);
        org.junit.Assert.assertNotNull(objArraySupplierTripleImmutablePair37);
        org.junit.Assert.assertNotNull(supplierTripleImmutablePairRange38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "(null,StrTokenizer[not tokenized yet])" + "'", str39, "(null,StrTokenizer[not tokenized yet])");
        org.junit.Assert.assertNull(objArraySupplierTriple40);
        org.junit.Assert.assertNull(objArraySupplierTriplePair41);
    }

//    @Test
//    public void test512() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest1.test512");
//        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("0");
//        java.util.TimeZone timeZone2 = fastDateFormat1.getTimeZone();
//        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.DateFormatUtils.ISO_DATETIME_TIME_ZONE_FORMAT;
//        org.apache.commons.lang3.text.CompositeFormat compositeFormat4 = new org.apache.commons.lang3.text.CompositeFormat((java.text.Format) fastDateFormat1, (java.text.Format) fastDateFormat3);
//        java.lang.String str6 = compositeFormat4.reformat("01:00:00");
//        java.text.Format format7 = compositeFormat4.getFormatter();
//        org.junit.Assert.assertNotNull(fastDateFormat1);
//        org.junit.Assert.assertNotNull(timeZone2);
//        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Central European Standard Time");
//        org.junit.Assert.assertNotNull(fastDateFormat3);
//        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01T00:00:00+01:00" + "'", str6, "1970-01-01T00:00:00+01:00");
//        org.junit.Assert.assertNotNull(format7);
//    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        org.apache.commons.lang3.IntegerRange integerRange2 = org.apache.commons.lang3.IntegerRange.of((int) '#', (int) (byte) 1);
        org.apache.commons.lang3.BitField bitField4 = new org.apache.commons.lang3.BitField(5);
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils5 = new org.apache.commons.lang3.reflect.FieldUtils();
        org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.IntegerRange, org.apache.commons.lang3.BitField, org.apache.commons.lang3.reflect.FieldUtils> integerRangeMutableTriple6 = org.apache.commons.lang3.tuple.MutableTriple.of(integerRange2, bitField4, fieldUtils5);
        boolean boolean8 = integerRange2.isBefore((java.lang.Integer) 1);
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.ONE_QUARTER;
        boolean boolean12 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) "P0Y0M0DT0H0M0.004S", (java.lang.Object) fraction10, false);
        org.apache.commons.lang3.math.Fraction fraction13 = fraction10.abs();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder15 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) fraction10, toStringStyle14);
        boolean boolean16 = integerRange2.equals((java.lang.Object) fraction10);
        boolean boolean18 = integerRange2.isAfter((java.lang.Integer) 37);
        org.junit.Assert.assertNotNull(integerRange2);
        org.junit.Assert.assertNotNull(integerRangeMutableTriple6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(toStringStyle14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        java.lang.Float[] floatArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY;
        java.lang.Class<?> wildcardClass1 = null;
        java.lang.Class[] classArray3 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray4 = (java.lang.Class<?>[]) classArray3;
        wildcardClassArray4[0] = wildcardClass1;
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray4);
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Object[]> objArrayMutableObject8 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Object[]>((java.lang.Object[]) wildcardClassArray7);
        org.apache.commons.lang3.JavaVersion javaVersion9 = org.apache.commons.lang3.JavaVersion.JAVA_9;
        java.lang.String[] strArray29 = new java.lang.String[] { "UTF-16LE", "apple.awt.enableTemplateImages", "P0Y0M0DT0H0M0.004S", "java.nio.channels.spi.AsynchronousChannelProvider", "jdk.net.URLClassPath.showIgnoredClassPathEntries", "Character", "hi!", "jdk.http.auth.proxying.disabledSchemes", "Azul Systems, Inc.", ":", "jdk.http.auth.proxying.disabledSchemes", "Azul Systems, Inc.", "local|*.local|169.254/16|*.169.254/16", "jdk.module.main", "UTF-16LE", "java.rmi.server.codebase", "P0Y0M0DT0H0M0.004S", "P0Y0M0DT0H0M0.004S", "04jdk.http.auth.proxying.disabledSchemes452#52#-14Character4Character44java.rmi.server.codebase4jdk.net.URLClassPath.showIgnoredClassPathEntries40" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        org.apache.commons.lang3.tuple.MutableTriple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>> objArraySupplierMutableTriple32 = new org.apache.commons.lang3.tuple.MutableTriple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>((java.util.function.Supplier<java.lang.Object[]>) objArrayMutableObject8, (java.lang.Enum<org.apache.commons.lang3.JavaVersion>) javaVersion9, (java.util.List<java.lang.String>) strList30);
        org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>> objArraySupplierTriple33 = null;
        java.util.function.Predicate<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>> objArraySupplierTriplePredicate34 = org.apache.commons.lang3.compare.ComparableUtils.betweenExclusive((org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>) objArraySupplierMutableTriple32, objArraySupplierTriple33);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer37 = new org.apache.commons.lang3.text.StrTokenizer("Character", '#');
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>, org.apache.commons.lang3.text.StrTokenizer> objArraySupplierTripleImmutablePair38 = org.apache.commons.lang3.tuple.ImmutablePair.of(objArraySupplierTriple33, strTokenizer37);
        java.util.Iterator[] iteratorArray40 = new java.util.Iterator[1];
        @SuppressWarnings("unchecked")
        java.util.Iterator<java.lang.String>[] strItorArray41 = (java.util.Iterator<java.lang.String>[]) iteratorArray40;
        strItorArray41[0] = strTokenizer37;
        org.apache.commons.lang3.concurrent.CircuitBreakingException circuitBreakingException46 = new org.apache.commons.lang3.concurrent.CircuitBreakingException();
        org.apache.commons.lang3.concurrent.CircuitBreakingException circuitBreakingException47 = new org.apache.commons.lang3.concurrent.CircuitBreakingException((java.lang.Throwable) circuitBreakingException46);
        java.lang.Throwable[] throwableArray48 = circuitBreakingException47.getSuppressed();
        org.apache.commons.lang3.concurrent.CircuitBreakingException circuitBreakingException49 = new org.apache.commons.lang3.concurrent.CircuitBreakingException();
        org.apache.commons.lang3.concurrent.CircuitBreakingException circuitBreakingException50 = new org.apache.commons.lang3.concurrent.CircuitBreakingException((java.lang.Throwable) circuitBreakingException49);
        org.apache.commons.lang3.concurrent.CircuitBreakingException circuitBreakingException51 = new org.apache.commons.lang3.concurrent.CircuitBreakingException();
        org.apache.commons.lang3.concurrent.CircuitBreakingException circuitBreakingException52 = new org.apache.commons.lang3.concurrent.CircuitBreakingException((java.lang.Throwable) circuitBreakingException51);
        java.lang.Throwable[] throwableArray53 = circuitBreakingException52.getSuppressed();
        org.apache.commons.lang3.concurrent.CircuitBreakingException circuitBreakingException54 = new org.apache.commons.lang3.concurrent.CircuitBreakingException();
        org.apache.commons.lang3.concurrent.CircuitBreakingException circuitBreakingException55 = new org.apache.commons.lang3.concurrent.CircuitBreakingException((java.lang.Throwable) circuitBreakingException54);
        java.lang.Throwable[] throwableArray56 = circuitBreakingException55.getSuppressed();
        org.apache.commons.lang3.concurrent.CircuitBreakingException circuitBreakingException57 = new org.apache.commons.lang3.concurrent.CircuitBreakingException();
        org.apache.commons.lang3.concurrent.CircuitBreakingException circuitBreakingException58 = new org.apache.commons.lang3.concurrent.CircuitBreakingException((java.lang.Throwable) circuitBreakingException57);
        java.lang.Exception[] exceptionArray59 = new java.lang.Exception[] { circuitBreakingException47, circuitBreakingException50, circuitBreakingException52, circuitBreakingException55, circuitBreakingException57 };
        java.lang.Class<?> wildcardClass61 = null;
        java.lang.Class[] classArray63 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray64 = (java.lang.Class<?>[]) classArray63;
        wildcardClassArray64[0] = wildcardClass61;
        java.lang.Class<?>[] wildcardClassArray67 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray64);
        java.lang.Exception[] exceptionArray68 = org.apache.commons.lang3.Validate.notEmpty(exceptionArray59, "04jdk.http.auth.proxying.disabledSchemes452#52#-14Character4Character44java.rmi.server.codebase4jdk.net.URLClassPath.showIgnoredClassPathEntries40", (java.lang.Object[]) wildcardClassArray64);
        java.util.Iterator<java.lang.String>[] strItorArray69 = org.apache.commons.lang3.Validate.validIndex(strItorArray41, (int) (short) 0, "0", (java.lang.Object[]) exceptionArray68);
        boolean boolean70 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) floatArray0, (java.lang.Object[]) exceptionArray68);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertArrayEquals(floatArray0, new java.lang.Float[] {});
        org.junit.Assert.assertNotNull(classArray3);
        org.junit.Assert.assertArrayEquals(classArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertArrayEquals(wildcardClassArray4, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertArrayEquals(wildcardClassArray7, new java.lang.Class[] { null });
        org.junit.Assert.assertTrue("'" + javaVersion9 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_9 + "'", javaVersion9.equals(org.apache.commons.lang3.JavaVersion.JAVA_9));
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "UTF-16LE", "apple.awt.enableTemplateImages", "P0Y0M0DT0H0M0.004S", "java.nio.channels.spi.AsynchronousChannelProvider", "jdk.net.URLClassPath.showIgnoredClassPathEntries", "Character", "hi!", "jdk.http.auth.proxying.disabledSchemes", "Azul Systems, Inc.", ":", "jdk.http.auth.proxying.disabledSchemes", "Azul Systems, Inc.", "local|*.local|169.254/16|*.169.254/16", "jdk.module.main", "UTF-16LE", "java.rmi.server.codebase", "P0Y0M0DT0H0M0.004S", "P0Y0M0DT0H0M0.004S", "04jdk.http.auth.proxying.disabledSchemes452#52#-14Character4Character44java.rmi.server.codebase4jdk.net.URLClassPath.showIgnoredClassPathEntries40" });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(objArraySupplierTriplePredicate34);
        org.junit.Assert.assertNotNull(objArraySupplierTripleImmutablePair38);
        org.junit.Assert.assertNotNull(iteratorArray40);
        org.junit.Assert.assertNotNull(strItorArray41);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertArrayEquals(throwableArray48, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertArrayEquals(throwableArray53, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertArrayEquals(throwableArray56, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(exceptionArray59);
        org.junit.Assert.assertNotNull(classArray63);
        org.junit.Assert.assertArrayEquals(classArray63, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertArrayEquals(wildcardClassArray64, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray67);
        org.junit.Assert.assertArrayEquals(wildcardClassArray67, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(exceptionArray68);
        org.junit.Assert.assertNotNull(strItorArray69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        java.util.regex.Matcher matcher2 = org.apache.commons.lang3.RegExUtils.dotAllMatcher("", "Java Platform API Specificationos.version");
        org.junit.Assert.assertNotNull(matcher2);
        org.junit.Assert.assertEquals(matcher2.toString(), "java.util.regex.Matcher[pattern= region=0,41 lastmatch=]");
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean3 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        int int4 = mutableBoolean1.compareTo(mutableBoolean3);
        java.util.function.Predicate<org.apache.commons.lang3.mutable.MutableBoolean> mutableBooleanPredicate5 = org.apache.commons.lang3.compare.ComparableUtils.gt(mutableBoolean3);
        org.apache.commons.lang3.IntegerRange integerRange8 = org.apache.commons.lang3.IntegerRange.of((int) '#', (int) (byte) 1);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder9 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) '#');
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split(":");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder12 = reflectionToStringBuilder9.append((java.lang.Object[]) strArray11);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder14 = toStringBuilder12.append(0.0f);
        boolean boolean15 = mutableBoolean3.equals((java.lang.Object) toStringBuilder14);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(mutableBooleanPredicate5);
        org.junit.Assert.assertNotNull(integerRange8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { ":" });
        org.junit.Assert.assertNotNull(toStringBuilder12);
        org.junit.Assert.assertNotNull(toStringBuilder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_QUARTER;
        org.apache.commons.lang3.math.Fraction fraction1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction2 = fraction0.add(fraction1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: fraction");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        org.apache.commons.lang3.Strings strings0 = org.apache.commons.lang3.Strings.CI;
        boolean boolean1 = strings0.isCaseSensitive();
        org.apache.commons.lang3.concurrent.CircuitBreakingException circuitBreakingException4 = new org.apache.commons.lang3.concurrent.CircuitBreakingException();
        org.apache.commons.lang3.concurrent.CircuitBreakingException circuitBreakingException5 = new org.apache.commons.lang3.concurrent.CircuitBreakingException((java.lang.Throwable) circuitBreakingException4);
        org.apache.commons.lang3.concurrent.CircuitBreakingException circuitBreakingException7 = new org.apache.commons.lang3.concurrent.CircuitBreakingException();
        org.apache.commons.lang3.concurrent.CircuitBreakingException circuitBreakingException8 = new org.apache.commons.lang3.concurrent.CircuitBreakingException((java.lang.Throwable) circuitBreakingException7);
        java.util.stream.Stream<java.lang.Throwable> throwableStream9 = org.apache.commons.lang3.exception.ExceptionUtils.stream((java.lang.Throwable) circuitBreakingException7);
        org.apache.commons.lang3.exception.ContextedException contextedException10 = new org.apache.commons.lang3.exception.ContextedException("OpenJDK 64-Bit Server VM", (java.lang.Throwable) circuitBreakingException7);
        org.apache.commons.lang3.function.FailableBiPredicate<org.apache.commons.lang3.function.FailableBiFunction<char[], char[], short[], org.apache.commons.lang3.concurrent.CircuitBreakingException>, java.text.Format, java.lang.Exception> charArrayFailableBiFunctionFailableBiPredicate11 = org.apache.commons.lang3.function.FailableBiPredicate.truePredicate();
        org.apache.commons.lang3.concurrent.CircuitBreakingException circuitBreakingException12 = new org.apache.commons.lang3.concurrent.CircuitBreakingException();
        org.apache.commons.lang3.concurrent.CircuitBreakingException circuitBreakingException13 = new org.apache.commons.lang3.concurrent.CircuitBreakingException((java.lang.Throwable) circuitBreakingException12);
        org.apache.commons.lang3.concurrent.CircuitBreakingException circuitBreakingException14 = org.apache.commons.lang3.SerializationUtils.roundtrip(circuitBreakingException13);
        org.apache.commons.lang3.function.FailableLongPredicate<org.apache.commons.lang3.concurrent.CircuitBreakingException> circuitBreakingExceptionFailableLongPredicate15 = org.apache.commons.lang3.function.FailableLongPredicate.falsePredicate();
        org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.function.FailableBiPredicate<org.apache.commons.lang3.function.FailableBiFunction<char[], char[], short[], org.apache.commons.lang3.concurrent.CircuitBreakingException>, java.text.Format, java.lang.Exception>, java.lang.Throwable, org.apache.commons.lang3.function.FailableLongPredicate<org.apache.commons.lang3.concurrent.CircuitBreakingException>> charArrayFailableBiFunctionFailableBiPredicateMutableTriple16 = org.apache.commons.lang3.tuple.MutableTriple.of(charArrayFailableBiFunctionFailableBiPredicate11, (java.lang.Throwable) circuitBreakingException14, circuitBreakingExceptionFailableLongPredicate15);
        org.apache.commons.lang3.exception.CloneFailedException cloneFailedException18 = new org.apache.commons.lang3.exception.CloneFailedException("local|*.local|169.254/16|*.169.254/16");
        org.apache.commons.lang3.concurrent.CircuitBreakingException circuitBreakingException19 = new org.apache.commons.lang3.concurrent.CircuitBreakingException();
        org.apache.commons.lang3.concurrent.CircuitBreakingException circuitBreakingException20 = new org.apache.commons.lang3.concurrent.CircuitBreakingException((java.lang.Throwable) circuitBreakingException19);
        org.apache.commons.lang3.concurrent.CircuitBreakingException circuitBreakingException21 = org.apache.commons.lang3.SerializationUtils.roundtrip(circuitBreakingException20);
        org.apache.commons.lang3.concurrent.CircuitBreakingException circuitBreakingException22 = new org.apache.commons.lang3.concurrent.CircuitBreakingException();
        java.lang.Throwable[] throwableArray23 = new java.lang.Throwable[] { circuitBreakingException5, circuitBreakingException7, circuitBreakingException14, cloneFailedException18, circuitBreakingException21, circuitBreakingException22 };
        java.lang.String[] strArray25 = new java.lang.String[] {};
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.firstNonEmpty(strArray25);
        boolean boolean27 = org.apache.commons.lang3.CharSetUtils.containsAny("UTF-8", strArray25);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.firstNonBlank(strArray25);
        org.apache.commons.lang3.tuple.Triple<java.lang.Number, java.lang.Throwable[], java.lang.String[]> numberTriple29 = org.apache.commons.lang3.tuple.Triple.of((java.lang.Number) 100L, throwableArray23, strArray25);
        boolean boolean30 = strings0.startsWithAny((java.lang.CharSequence) "java.class.version", (java.lang.CharSequence[]) strArray25);
        boolean boolean33 = strings0.equals((java.lang.CharSequence) "java.nio.file.spi.DefaultFileSystemProvider", (java.lang.CharSequence) "0#1#10#100#1");
        boolean boolean36 = strings0.equals("java.protocol.han0ler.pkg0", "2025-10-21");
        org.apache.commons.lang3.IntegerRange integerRange39 = org.apache.commons.lang3.IntegerRange.of((int) '#', (int) (byte) 1);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder40 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder43 = reflectionToStringBuilder40.append("sun.net.httpserver.maxIdleConnections", (byte) 10);
        org.apache.commons.lang3.IntegerRange integerRange47 = org.apache.commons.lang3.IntegerRange.of((int) '#', (int) (byte) 1);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder48 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.concurrent.CircuitBreakingException circuitBreakingException49 = new org.apache.commons.lang3.concurrent.CircuitBreakingException();
        org.apache.commons.lang3.concurrent.CircuitBreakingException circuitBreakingException50 = new org.apache.commons.lang3.concurrent.CircuitBreakingException((java.lang.Throwable) circuitBreakingException49);
        org.apache.commons.lang3.concurrent.CircuitBreakingException circuitBreakingException51 = org.apache.commons.lang3.ObjectUtils.clone(circuitBreakingException50);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder52 = reflectionToStringBuilder48.appendAsObjectToString((java.lang.Object) circuitBreakingException50);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer56 = new org.apache.commons.lang3.text.StrTokenizer("hi!", 'a');
        java.util.ListIterator<java.lang.String> strItor57 = org.apache.commons.lang3.ObjectUtils.clone((java.util.ListIterator<java.lang.String>) strTokenizer56);
        char[] charArray61 = new char[] { '#' };
        int int62 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "java.vm.specification.vendor", (int) '4', charArray61);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer63 = strTokenizer56.reset(charArray61);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder64 = reflectionToStringBuilder48.append("on", charArray61);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder66 = toStringBuilder43.append("jdk.internal.httpclient.disableHostnameVerification", charArray61, true);
        short[] shortArray72 = new short[] { (short) 100, (short) 10, (byte) -1, (short) 10, (byte) 100 };
        short[] shortArray74 = org.apache.commons.lang3.ArrayUtils.removeAllOccurrences(shortArray72, (short) (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder75 = toStringBuilder43.append(shortArray72);
        long[] longArray77 = new long[] { 1L };
        long long78 = org.apache.commons.lang3.math.NumberUtils.min(longArray77);
        long[] longArray79 = org.apache.commons.lang3.ArrayUtils.clone(longArray77);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder80 = toStringBuilder75.append(longArray77);
        java.lang.String[] strArray84 = new java.lang.String[] {};
        java.lang.String str85 = org.apache.commons.lang3.StringUtils.firstNonEmpty(strArray84);
        boolean boolean86 = org.apache.commons.lang3.CharSetUtils.containsAny("UTF-8", strArray84);
        java.lang.String str87 = org.apache.commons.lang3.StringUtils.appendIfMissing("java.vm.specification.name", (java.lang.CharSequence) "ISO-8859-1", (java.lang.CharSequence[]) strArray84);
        // The following exception was thrown during execution in test generation
        try {
            int int88 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) "java.protocol.han0ler.pkg0", (java.lang.Object) toStringBuilder75, strArray84);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strings0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(throwableStream9);
        org.junit.Assert.assertNotNull(charArrayFailableBiFunctionFailableBiPredicate11);
        org.junit.Assert.assertNotNull(circuitBreakingException14);
        org.junit.Assert.assertNotNull(circuitBreakingExceptionFailableLongPredicate15);
        org.junit.Assert.assertNotNull(charArrayFailableBiFunctionFailableBiPredicateMutableTriple16);
        org.junit.Assert.assertNotNull(circuitBreakingException21);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] {});
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(numberTriple29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(integerRange39);
        org.junit.Assert.assertNotNull(toStringBuilder43);
        org.junit.Assert.assertNotNull(integerRange47);
        org.junit.Assert.assertNull(circuitBreakingException51);
        org.junit.Assert.assertNotNull(toStringBuilder52);
        org.junit.Assert.assertNotNull(strItor57);
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertArrayEquals(charArray61, new char[] { '#' });
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer63);
        org.junit.Assert.assertNotNull(toStringBuilder64);
        org.junit.Assert.assertNotNull(toStringBuilder66);
        org.junit.Assert.assertNotNull(shortArray72);
        org.junit.Assert.assertArrayEquals(shortArray72, new short[] { (short) 100, (short) 10, (short) -1, (short) 10, (short) 100 });
        org.junit.Assert.assertNotNull(shortArray74);
        org.junit.Assert.assertArrayEquals(shortArray74, new short[] { (short) 100, (short) 10, (short) -1, (short) 10, (short) 100 });
        org.junit.Assert.assertNotNull(toStringBuilder75);
        org.junit.Assert.assertNotNull(longArray77);
        org.junit.Assert.assertArrayEquals(longArray77, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 1L + "'", long78 == 1L);
        org.junit.Assert.assertNotNull(longArray79);
        org.junit.Assert.assertArrayEquals(longArray79, new long[] { 1L });
        org.junit.Assert.assertNotNull(toStringBuilder80);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] {});
        org.junit.Assert.assertNull(str85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "java.vm.specification.nameISO-8859-1" + "'", str87, "java.vm.specification.nameISO-8859-1");
    }

//    @Test
//    public void test519() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest1.test519");
//        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder(671248312);
//        org.apache.commons.lang3.text.StrMatcher strMatcher3 = null;
//        org.apache.commons.lang3.text.StrMatcher strMatcher4 = org.apache.commons.lang3.text.StrMatcher.commaMatcher();
//        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer("pa\"P*", strMatcher3, strMatcher4);
//        org.apache.commons.lang3.text.StrBuilder strBuilder10 = strBuilder1.replace(strMatcher4, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.SSS'S'", 0, (int) 'j', (int) (byte) 100);
//        org.apache.commons.lang3.text.StrTokenizer strTokenizer11 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
//        int int12 = strTokenizer11.size();
//        org.apache.commons.lang3.text.StrMatcher strMatcher13 = org.apache.commons.lang3.text.StrMatcher.splitMatcher();
//        org.apache.commons.lang3.text.StrTokenizer strTokenizer14 = strTokenizer11.setQuoteMatcher(strMatcher13);
//        boolean boolean15 = strBuilder10.contains(strMatcher13);
//        int int18 = strBuilder10.indexOf("java.vm.specification.name", 97);
//        org.apache.commons.lang3.text.StrBuilder strBuilder20 = strBuilder10.append((java.lang.CharSequence) "java.util.PropertyResourceBundle.encoding");
//        org.apache.commons.lang3.IntegerRange integerRange24 = org.apache.commons.lang3.IntegerRange.of((int) '#', (int) (byte) 1);
//        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder25 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) '#');
//        java.lang.Short[] shortArray29 = new java.lang.Short[] { (short) 100, (short) 100 };
//        short[] shortArray31 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray29, (short) 1);
//        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder32 = reflectionToStringBuilder25.append("1", (java.lang.Object[]) shortArray29);
//        java.lang.String[] strArray34 = new java.lang.String[] {};
//        java.lang.String str35 = org.apache.commons.lang3.StringUtils.firstNonEmpty(strArray34);
//        boolean boolean36 = org.apache.commons.lang3.CharSetUtils.containsAny("UTF-8", strArray34);
//        java.lang.String str37 = org.apache.commons.lang3.StringUtils.firstNonBlank(strArray34);
//        java.lang.String str38 = org.apache.commons.lang3.StringUtils.firstNonEmpty(strArray34);
//        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder39 = reflectionToStringBuilder25.setExcludeFieldNames(strArray34);
//        org.apache.commons.lang3.text.StrBuilder strBuilder40 = strBuilder20.appendln("jdk.xml.overrideDefaultParser", (java.lang.Object[]) strArray34);
//        org.junit.Assert.assertNotNull(strMatcher4);
//        org.junit.Assert.assertNotNull(strBuilder10);
//        org.junit.Assert.assertNotNull(strTokenizer11);
//        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
//        org.junit.Assert.assertNotNull(strMatcher13);
//        org.junit.Assert.assertNotNull(strTokenizer14);
//        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
//        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
//        org.junit.Assert.assertNotNull(strBuilder20);
//        org.junit.Assert.assertNotNull(integerRange24);
//        org.junit.Assert.assertNotNull(shortArray29);
//        org.junit.Assert.assertArrayEquals(shortArray29, new java.lang.Short[] { (short) 100, (short) 100 });
//        org.junit.Assert.assertNotNull(shortArray31);
//        org.junit.Assert.assertArrayEquals(shortArray31, new short[] { (short) 100, (short) 100 });
//        org.junit.Assert.assertNotNull(toStringBuilder32);
//        org.junit.Assert.assertNotNull(strArray34);
//        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] {});
//        org.junit.Assert.assertNull(str35);
//        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
//        org.junit.Assert.assertNull(str37);
//        org.junit.Assert.assertNull(str38);
//        org.junit.Assert.assertNotNull(reflectionToStringBuilder39);
//        org.junit.Assert.assertNotNull(strBuilder40);
//    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-65L));
        float float3 = mutableFloat1.addAndGet(0.0f);
        mutableFloat1.increment();
        long long5 = mutableFloat1.longValue();
        mutableFloat1.decrement();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-65.0f) + "'", float3 == (-65.0f));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-64L) + "'", long5 == (-64L));
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        org.apache.commons.lang3.RandomStringUtils randomStringUtils0 = org.apache.commons.lang3.RandomStringUtils.insecure();
        java.lang.String str3 = randomStringUtils0.next((int) '\000', "27");
        org.apache.commons.lang3.mutable.MutableLong mutableLong5 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 2);
        float float6 = mutableLong5.floatValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong8 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 2);
        int int9 = mutableLong5.compareTo(mutableLong8);
        org.apache.commons.lang3.mutable.MutableLong mutableLong11 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 2);
        int int12 = mutableLong11.intValue();
        org.apache.commons.lang3.Range<org.apache.commons.lang3.mutable.MutableLong> mutableLongRange13 = org.apache.commons.lang3.Range.is(mutableLong11);
        mutableLong11.increment();
        org.apache.commons.lang3.mutable.MutableLong mutableLong16 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 2);
        int int17 = mutableLong16.intValue();
        org.apache.commons.lang3.Range<org.apache.commons.lang3.mutable.MutableLong> mutableLongRange18 = org.apache.commons.lang3.Range.is(mutableLong16);
        org.apache.commons.lang3.mutable.MutableLong mutableLong20 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 2);
        float float21 = mutableLong20.floatValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong23 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 2);
        int int24 = mutableLong23.intValue();
        org.apache.commons.lang3.Range<org.apache.commons.lang3.mutable.MutableLong> mutableLongRange25 = org.apache.commons.lang3.Range.is(mutableLong23);
        org.apache.commons.lang3.mutable.MutableLong mutableLong27 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 2);
        int int28 = mutableLong27.intValue();
        org.apache.commons.lang3.Range<org.apache.commons.lang3.mutable.MutableLong> mutableLongRange29 = org.apache.commons.lang3.Range.is(mutableLong27);
        org.apache.commons.lang3.mutable.MutableLong[] mutableLongArray30 = new org.apache.commons.lang3.mutable.MutableLong[] { mutableLong8, mutableLong11, mutableLong16, mutableLong20, mutableLong23, mutableLong27 };
        java.lang.Class<org.apache.commons.lang3.mutable.MutableLong> mutableLongClass31 = org.apache.commons.lang3.ArrayUtils.getComponentType(mutableLongArray30);
        java.lang.Class<?> wildcardClass32 = org.apache.commons.lang3.ClassUtils.primitiveToWrapper(mutableLongClass31);
        java.util.stream.Stream<org.apache.commons.lang3.mutable.MutableLong> mutableLongStream33 = org.apache.commons.lang3.EnumUtils.stream(mutableLongClass31);
        java.lang.String str35 = org.apache.commons.lang3.ClassPathUtils.toFullyQualifiedPath(mutableLongClass31, "org.apache.commons.lang3.mutable");
        org.apache.commons.lang3.mutable.MutableLong mutableLong37 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 2);
        int int38 = mutableLong37.intValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.event.EventUtils.addEventListener((java.lang.Object) str3, mutableLongClass31, mutableLong37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unable to add listener for class java.lang.String and public addMutableLong method which takes a parameter of type org.apache.commons.lang3.mutable.MutableLong.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(randomStringUtils0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.0f + "'", float6 == 2.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(mutableLongRange13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(mutableLongRange18);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 2.0f + "'", float21 == 2.0f);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(mutableLongRange25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(mutableLongRange29);
        org.junit.Assert.assertNotNull(mutableLongArray30);
        org.junit.Assert.assertNotNull(mutableLongClass31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(mutableLongStream33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "org/apache/commons/lang3/mutable/org.apache.commons.lang3.mutable" + "'", str35, "org/apache/commons/lang3/mutable/org.apache.commons.lang3.mutable");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 2);
        float float2 = mutableLong1.floatValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 2);
        int int5 = mutableLong1.compareTo(mutableLong4);
        org.apache.commons.lang3.mutable.MutableLong mutableLong7 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 2);
        int int8 = mutableLong7.intValue();
        org.apache.commons.lang3.Range<org.apache.commons.lang3.mutable.MutableLong> mutableLongRange9 = org.apache.commons.lang3.Range.is(mutableLong7);
        mutableLong7.increment();
        org.apache.commons.lang3.mutable.MutableLong mutableLong12 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 2);
        int int13 = mutableLong12.intValue();
        org.apache.commons.lang3.Range<org.apache.commons.lang3.mutable.MutableLong> mutableLongRange14 = org.apache.commons.lang3.Range.is(mutableLong12);
        org.apache.commons.lang3.mutable.MutableLong mutableLong16 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 2);
        float float17 = mutableLong16.floatValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong19 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 2);
        int int20 = mutableLong19.intValue();
        org.apache.commons.lang3.Range<org.apache.commons.lang3.mutable.MutableLong> mutableLongRange21 = org.apache.commons.lang3.Range.is(mutableLong19);
        org.apache.commons.lang3.mutable.MutableLong mutableLong23 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 2);
        int int24 = mutableLong23.intValue();
        org.apache.commons.lang3.Range<org.apache.commons.lang3.mutable.MutableLong> mutableLongRange25 = org.apache.commons.lang3.Range.is(mutableLong23);
        org.apache.commons.lang3.mutable.MutableLong[] mutableLongArray26 = new org.apache.commons.lang3.mutable.MutableLong[] { mutableLong4, mutableLong7, mutableLong12, mutableLong16, mutableLong19, mutableLong23 };
        java.lang.Class<org.apache.commons.lang3.mutable.MutableLong> mutableLongClass27 = org.apache.commons.lang3.ArrayUtils.getComponentType(mutableLongArray26);
        java.lang.String str28 = org.apache.commons.lang3.ClassUtils.getPackageName(mutableLongClass27);
        java.lang.Iterable<java.lang.Class<?>> wildcardClassIterable29 = org.apache.commons.lang3.ClassUtils.hierarchy(mutableLongClass27);
        java.lang.String str30 = org.apache.commons.lang3.ClassUtils.getSimpleName(mutableLongClass27);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(mutableLongRange9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(mutableLongRange14);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 2.0f + "'", float17 == 2.0f);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(mutableLongRange21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(mutableLongRange25);
        org.junit.Assert.assertNotNull(mutableLongArray26);
        org.junit.Assert.assertNotNull(mutableLongClass27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "org.apache.commons.lang3.mutable" + "'", str28, "org.apache.commons.lang3.mutable");
        org.junit.Assert.assertNotNull(wildcardClassIterable29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "MutableLong" + "'", str30, "MutableLong");
    }

//    @Test
//    public void test523() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest1.test523");
//        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
//        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setValueDelimiter("04jdk.http.auth.proxying.disabledSchemes452#52#-14Character4Character44java.rmi.server.codebase4jdk.net.URLClassPath.showIgnoredClassPathEntries40");
//        org.apache.commons.lang3.text.StrBuilder strBuilder4 = new org.apache.commons.lang3.text.StrBuilder(671248312);
//        org.apache.commons.lang3.text.StrMatcher strMatcher6 = null;
//        org.apache.commons.lang3.text.StrMatcher strMatcher7 = org.apache.commons.lang3.text.StrMatcher.commaMatcher();
//        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer("pa\"P*", strMatcher6, strMatcher7);
//        org.apache.commons.lang3.text.StrBuilder strBuilder13 = strBuilder4.replace(strMatcher7, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.SSS'S'", 0, (int) 'j', (int) (byte) 100);
//        org.apache.commons.lang3.text.StrBuilder strBuilder16 = strBuilder13.appendPadding((int) '\r', '\r');
//        boolean boolean19 = strSubstitutor0.replaceIn(strBuilder13, (int) (byte) 100, 10);
//        org.junit.Assert.assertNotNull(strSubstitutor2);
//        org.junit.Assert.assertNotNull(strMatcher7);
//        org.junit.Assert.assertNotNull(strBuilder13);
//        org.junit.Assert.assertNotNull(strBuilder16);
//        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
//    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        mutableByte0.setValue((byte) 0);
        byte byte3 = mutableByte0.getAndIncrement();
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte();
        mutableByte4.setValue((byte) 0);
        byte byte7 = mutableByte4.getAndIncrement();
        org.apache.commons.lang3.mutable.MutableByte mutableByte8 = new org.apache.commons.lang3.mutable.MutableByte();
        mutableByte8.setValue((byte) 0);
        byte byte11 = mutableByte8.getAndIncrement();
        int int13 = org.apache.commons.lang3.ObjectUtils.compare(mutableByte4, mutableByte8, false);
        byte byte14 = mutableByte4.decrementAndGet();
        org.apache.commons.lang3.Range<org.apache.commons.lang3.mutable.MutableByte> mutableByteRange15 = org.apache.commons.lang3.Range.of(mutableByte0, mutableByte4);
        byte byte16 = mutableByte0.decrementAndGet();
        byte byte17 = mutableByte0.getAndDecrement();
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 0 + "'", byte11 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 0 + "'", byte14 == (byte) 0);
        org.junit.Assert.assertNotNull(mutableByteRange15);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.firstNonEmpty(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.prependIfMissingIgnoreCase("java.class.version", (java.lang.CharSequence) "java.protocol.handler.pkgs", (java.lang.CharSequence[]) strArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.inclusiveBetween("byte[]httpserver.maxIdleConnections", "", (java.lang.Comparable<java.lang.String>) "java.vendor", "http://www.azul.com/", (java.lang.Object[]) strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: http://www.azul.com/");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.protocol.handler.pkgsjava.class.version" + "'", str8, "java.protocol.handler.pkgsjava.class.version");
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isCreatable("user.dir");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        org.apache.commons.lang3.DoubleRange doubleRange2 = org.apache.commons.lang3.DoubleRange.of((java.lang.Double) (-1.0d), (java.lang.Double) 27.21678707536893d);
        org.apache.commons.lang3.DoubleRange doubleRange5 = org.apache.commons.lang3.DoubleRange.of((java.lang.Double) (-1.0d), (java.lang.Double) 27.21678707536893d);
        boolean boolean6 = doubleRange2.isBeforeRange((org.apache.commons.lang3.Range<java.lang.Double>) doubleRange5);
        boolean boolean8 = doubleRange2.isAfter((java.lang.Double) 1.0d);
        org.apache.commons.lang3.DoubleRange doubleRange11 = org.apache.commons.lang3.DoubleRange.of((java.lang.Double) (-1.0d), (java.lang.Double) 27.21678707536893d);
        org.apache.commons.lang3.DoubleRange doubleRange14 = org.apache.commons.lang3.DoubleRange.of((java.lang.Double) (-1.0d), (java.lang.Double) 27.21678707536893d);
        boolean boolean15 = doubleRange11.isBeforeRange((org.apache.commons.lang3.Range<java.lang.Double>) doubleRange14);
        boolean boolean16 = doubleRange2.containsRange((org.apache.commons.lang3.Range<java.lang.Double>) doubleRange11);
        org.junit.Assert.assertNotNull(doubleRange2);
        org.junit.Assert.assertNotNull(doubleRange5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doubleRange11);
        org.junit.Assert.assertNotNull(doubleRange14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\n", 5, '5');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n5555" + "'", str3, "\n5555");
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-65L));
        float float3 = mutableFloat1.addAndGet(0.0f);
        mutableFloat1.increment();
        org.apache.commons.lang3.mutable.MutableByte mutableByte5 = new org.apache.commons.lang3.mutable.MutableByte();
        mutableByte5.setValue((byte) 0);
        byte byte8 = mutableByte5.getAndIncrement();
        org.apache.commons.lang3.mutable.MutableByte mutableByte9 = new org.apache.commons.lang3.mutable.MutableByte();
        mutableByte9.setValue((byte) 0);
        byte byte12 = mutableByte9.getAndIncrement();
        org.apache.commons.lang3.mutable.MutableByte mutableByte13 = new org.apache.commons.lang3.mutable.MutableByte();
        mutableByte13.setValue((byte) 0);
        byte byte16 = mutableByte13.getAndIncrement();
        int int18 = org.apache.commons.lang3.ObjectUtils.compare(mutableByte9, mutableByte13, false);
        byte byte19 = mutableByte9.decrementAndGet();
        org.apache.commons.lang3.Range<org.apache.commons.lang3.mutable.MutableByte> mutableByteRange20 = org.apache.commons.lang3.Range.of(mutableByte5, mutableByte9);
        mutableFloat1.add((java.lang.Number) mutableByte5);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-65.0f) + "'", float3 == (-65.0f));
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
        org.junit.Assert.assertNotNull(mutableByteRange20);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.StringBuilder stringBuilder1 = null;
        boolean boolean4 = strSubstitutor0.replaceIn(stringBuilder1, (int) '0', (int) '\000');
        char char5 = strSubstitutor0.getEscapeChar();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor6 = new org.apache.commons.lang3.text.StrSubstitutor();
        java.lang.String str8 = strSubstitutor6.replace((java.lang.CharSequence) "101");
        java.lang.String str9 = strSubstitutor0.replace((java.lang.Object) "101");
        org.apache.commons.lang3.function.FailableBiFunction<char[], char[], short[], org.apache.commons.lang3.concurrent.CircuitBreakingException> charArrayFailableBiFunction10 = org.apache.commons.lang3.function.FailableBiFunction.nop();
        char[] charArray13 = org.apache.commons.lang3.CharSequenceUtils.toCharArray((java.lang.CharSequence) "ent.ForkJoinPool.common.parallelismjava.util.concurr");
        java.lang.String str14 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("jdk.httpclient.allowRestrictedHeaders", charArray13);
        char[] charArray17 = org.apache.commons.lang3.CharSequenceUtils.toCharArray((java.lang.CharSequence) "ent.ForkJoinPool.common.parallelismjava.util.concurr");
        java.lang.String str18 = org.apache.commons.lang3.text.WordUtils.capitalizeFully("jdk.httpclient.allowRestrictedHeaders", charArray17);
        short[] shortArray19 = org.apache.commons.lang3.function.Failable.apply(charArrayFailableBiFunction10, charArray13, charArray17);
        char[] charArray26 = new char[] { '#', '4', '#', 'a', '4', 'a' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer29 = new org.apache.commons.lang3.text.StrTokenizer(charArray26, 'a', '#');
        char[] charArray32 = org.apache.commons.lang3.ArrayUtils.add(charArray26, (int) (byte) 0, '5');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer35 = new org.apache.commons.lang3.text.StrTokenizer("hi!", 'a');
        java.util.ListIterator<java.lang.String> strItor36 = org.apache.commons.lang3.ObjectUtils.clone((java.util.ListIterator<java.lang.String>) strTokenizer35);
        char[] charArray40 = new char[] { '#' };
        int int41 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "java.vm.specification.vendor", (int) '4', charArray40);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer42 = strTokenizer35.reset(charArray40);
        short[] shortArray43 = org.apache.commons.lang3.function.Failable.apply(charArrayFailableBiFunction10, charArray32, charArray40);
        java.lang.String str44 = strSubstitutor0.replace(charArray40);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '$' + "'", char5 == '$');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "101" + "'", str8, "101");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "101" + "'", str9, "101");
        org.junit.Assert.assertNotNull(charArrayFailableBiFunction10);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "jDk.Httpclient.alloWrestricteDheaDers" + "'", str14, "jDk.Httpclient.alloWrestricteDheaDers");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "jDk.Httpclient.alloWrestricteDheaDers" + "'", str18, "jDk.Httpclient.alloWrestricteDheaDers");
        org.junit.Assert.assertNull(shortArray19);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '#', '4', '#', 'a', '4', 'a' });
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { '5', '#', '4', '#', 'a', '4', 'a' });
        org.junit.Assert.assertNotNull(strItor36);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] { '#' });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNull(shortArray43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "#" + "'", str44, "#");
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        org.apache.commons.lang3.util.FluentBitSet fluentBitSet1 = new org.apache.commons.lang3.util.FluentBitSet(629);
        int int3 = fluentBitSet1.previousSetBit(0);
        double[] doubleArray6 = new double[] { (short) 10, 1.0f };
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray6);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray6, (double) 10, (int) ' ');
        java.util.BitSet bitSet14 = org.apache.commons.lang3.ArrayUtils.indexesOf(doubleArray6, (double) 100.0f, 5, (double) 32L);
        boolean boolean15 = fluentBitSet1.intersects(bitSet14);
        int int17 = fluentBitSet1.previousSetBit(4);
        int int19 = fluentBitSet1.nextClearBit((int) '5');
        org.apache.commons.lang3.IntegerRange integerRange22 = org.apache.commons.lang3.IntegerRange.of((int) '#', (int) (byte) 1);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder23 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder26 = reflectionToStringBuilder23.append("sun.net.httpserver.maxIdleConnections", (byte) 10);
        org.apache.commons.lang3.IntegerRange integerRange30 = org.apache.commons.lang3.IntegerRange.of((int) '#', (int) (byte) 1);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder31 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.concurrent.CircuitBreakingException circuitBreakingException32 = new org.apache.commons.lang3.concurrent.CircuitBreakingException();
        org.apache.commons.lang3.concurrent.CircuitBreakingException circuitBreakingException33 = new org.apache.commons.lang3.concurrent.CircuitBreakingException((java.lang.Throwable) circuitBreakingException32);
        org.apache.commons.lang3.concurrent.CircuitBreakingException circuitBreakingException34 = org.apache.commons.lang3.ObjectUtils.clone(circuitBreakingException33);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder35 = reflectionToStringBuilder31.appendAsObjectToString((java.lang.Object) circuitBreakingException33);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer39 = new org.apache.commons.lang3.text.StrTokenizer("hi!", 'a');
        java.util.ListIterator<java.lang.String> strItor40 = org.apache.commons.lang3.ObjectUtils.clone((java.util.ListIterator<java.lang.String>) strTokenizer39);
        char[] charArray44 = new char[] { '#' };
        int int45 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "java.vm.specification.vendor", (int) '4', charArray44);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer46 = strTokenizer39.reset(charArray44);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder47 = reflectionToStringBuilder31.append("on", charArray44);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder49 = toStringBuilder26.append("jdk.internal.httpclient.disableHostnameVerification", charArray44, true);
        short[] shortArray55 = new short[] { (short) 100, (short) 10, (byte) -1, (short) 10, (byte) 100 };
        short[] shortArray57 = org.apache.commons.lang3.ArrayUtils.removeAllOccurrences(shortArray55, (short) (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder58 = toStringBuilder26.append(shortArray55);
        java.util.BitSet bitSet61 = org.apache.commons.lang3.ArrayUtils.indexesOf(shortArray55, (short) (byte) 1, (int) 'j');
        boolean boolean62 = fluentBitSet1.intersects(bitSet61);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(bitSet14);
        org.junit.Assert.assertEquals(bitSet14.toString(), "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 53 + "'", int19 == 53);
        org.junit.Assert.assertNotNull(integerRange22);
        org.junit.Assert.assertNotNull(toStringBuilder26);
        org.junit.Assert.assertNotNull(integerRange30);
        org.junit.Assert.assertNull(circuitBreakingException34);
        org.junit.Assert.assertNotNull(toStringBuilder35);
        org.junit.Assert.assertNotNull(strItor40);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertArrayEquals(charArray44, new char[] { '#' });
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer46);
        org.junit.Assert.assertNotNull(toStringBuilder47);
        org.junit.Assert.assertNotNull(toStringBuilder49);
        org.junit.Assert.assertNotNull(shortArray55);
        org.junit.Assert.assertArrayEquals(shortArray55, new short[] { (short) 100, (short) 10, (short) -1, (short) 10, (short) 100 });
        org.junit.Assert.assertNotNull(shortArray57);
        org.junit.Assert.assertArrayEquals(shortArray57, new short[] { (short) 100, (short) 10, (short) -1, (short) 10, (short) 100 });
        org.junit.Assert.assertNotNull(toStringBuilder58);
        org.junit.Assert.assertNotNull(bitSet61);
        org.junit.Assert.assertEquals(bitSet61.toString(), "{}");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped((java.lang.Character) '\r');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u000d" + "'", str1, "\\u000d");
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str2 = org.apache.commons.lang3.RegExUtils.removeFirst((java.lang.CharSequence) "CircuitBreakingException", pattern1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CircuitBreakingException" + "'", str2, "CircuitBreakingException");
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder0 = new org.apache.commons.lang3.builder.CompareToBuilder();
        short[] shortArray1 = null;
        short[] shortArray6 = new short[] { (short) 1, (short) 1, (short) 1, (short) -1 };
        short[] shortArray7 = org.apache.commons.lang3.ArraySorter.sort(shortArray6);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder8 = compareToBuilder0.append(shortArray1, shortArray7);
        org.apache.commons.lang3.IntegerRange integerRange11 = org.apache.commons.lang3.IntegerRange.of((int) '#', (int) (byte) 1);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder12 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) '#');
        int[] intArray17 = new int[] { '4', '4', (byte) -1 };
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray17, '#');
        int[] intArray25 = new int[] { (short) 0, (short) 1, (short) 10, (short) 100, 1 };
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(intArray25, '4');
        int[] intArray28 = org.apache.commons.lang3.ArrayUtils.removeElements(intArray17, intArray25);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder29 = reflectionToStringBuilder12.append("false", intArray17);
        int[] intArray31 = org.apache.commons.lang3.StringUtils.toCodePoints((java.lang.CharSequence) "mixed mode");
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder32 = compareToBuilder8.append(intArray17, intArray31);
        org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder35 = compareToBuilder32.append(false, true);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] { (short) -1, (short) 1, (short) 1, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertArrayEquals(shortArray7, new short[] { (short) -1, (short) 1, (short) 1, (short) 1 });
        org.junit.Assert.assertNotNull(compareToBuilder8);
        org.junit.Assert.assertNotNull(integerRange11);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 52, 52, (-1) });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "52#52#-1" + "'", str19, "52#52#-1");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 0, 1, 10, 100, 1 });
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "041410410041" + "'", str27, "041410410041");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 52, 52, (-1) });
        org.junit.Assert.assertNotNull(toStringBuilder29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { 109, 105, 120, 101, 100, 32, 109, 111, 100, 101 });
        org.junit.Assert.assertNotNull(compareToBuilder32);
        org.junit.Assert.assertNotNull(compareToBuilder35);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.ONE_QUARTER;
        boolean boolean3 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) "P0Y0M0DT0H0M0.004S", (java.lang.Object) fraction1, false);
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.abs();
        java.lang.String str5 = fraction4.toProperString();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction4.negate();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1/4" + "'", str5, "1/4");
        org.junit.Assert.assertNotNull(fraction6);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        long[] longArray1 = new long[] { 1L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.clone(longArray1);
        org.apache.commons.lang3.IntegerRange integerRange6 = org.apache.commons.lang3.IntegerRange.of((int) '#', (int) (byte) 1);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder7 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder10 = reflectionToStringBuilder7.append("sun.net.httpserver.maxIdleConnections", (byte) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder12 = toStringBuilder10.append('a');
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.removeAllOccurences(longArray13, (long) 22);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder16 = toStringBuilder10.append(longArray15);
        long[] longArray17 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray15);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertArrayEquals(longArray3, new long[] { 1L });
        org.junit.Assert.assertNotNull(integerRange6);
        org.junit.Assert.assertNotNull(toStringBuilder10);
        org.junit.Assert.assertNotNull(toStringBuilder12);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] {});
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertArrayEquals(longArray15, new long[] {});
        org.junit.Assert.assertNotNull(toStringBuilder16);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] { 1L });
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        org.apache.commons.lang3.IntegerRange integerRange2 = org.apache.commons.lang3.IntegerRange.of((int) '#', (int) (byte) 1);
        org.apache.commons.lang3.BitField bitField4 = new org.apache.commons.lang3.BitField(5);
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils5 = new org.apache.commons.lang3.reflect.FieldUtils();
        org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.IntegerRange, org.apache.commons.lang3.BitField, org.apache.commons.lang3.reflect.FieldUtils> integerRangeMutableTriple6 = org.apache.commons.lang3.tuple.MutableTriple.of(integerRange2, bitField4, fieldUtils5);
        boolean boolean8 = integerRange2.isBefore((java.lang.Integer) 1);
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.ONE_QUARTER;
        boolean boolean12 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) "P0Y0M0DT0H0M0.004S", (java.lang.Object) fraction10, false);
        org.apache.commons.lang3.math.Fraction fraction13 = fraction10.abs();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder15 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) fraction10, toStringStyle14);
        boolean boolean16 = integerRange2.equals((java.lang.Object) fraction10);
        java.lang.Integer int17 = integerRange2.getMinimum();
        org.junit.Assert.assertNotNull(integerRange2);
        org.junit.Assert.assertNotNull(integerRangeMutableTriple6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(toStringStyle14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        org.apache.commons.lang3.IntegerRange integerRange2 = org.apache.commons.lang3.IntegerRange.of((int) '#', (int) (byte) 1);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder3 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.concurrent.CircuitBreakingException circuitBreakingException4 = new org.apache.commons.lang3.concurrent.CircuitBreakingException();
        org.apache.commons.lang3.concurrent.CircuitBreakingException circuitBreakingException5 = new org.apache.commons.lang3.concurrent.CircuitBreakingException((java.lang.Throwable) circuitBreakingException4);
        org.apache.commons.lang3.concurrent.CircuitBreakingException circuitBreakingException6 = org.apache.commons.lang3.ObjectUtils.clone(circuitBreakingException5);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder3.appendAsObjectToString((java.lang.Object) circuitBreakingException5);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append((double) 2.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder11 = toStringBuilder9.append(false);
        org.junit.Assert.assertNotNull(integerRange2);
        org.junit.Assert.assertNull(circuitBreakingException6);
        org.junit.Assert.assertNotNull(toStringBuilder7);
        org.junit.Assert.assertNotNull(toStringBuilder9);
        org.junit.Assert.assertNotNull(toStringBuilder11);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        org.apache.commons.lang3.concurrent.CircuitBreakingException circuitBreakingException0 = new org.apache.commons.lang3.concurrent.CircuitBreakingException();
        org.apache.commons.lang3.concurrent.CircuitBreakingException circuitBreakingException1 = new org.apache.commons.lang3.concurrent.CircuitBreakingException((java.lang.Throwable) circuitBreakingException0);
        java.lang.Throwable[] throwableArray2 = circuitBreakingException1.getSuppressed();
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "0", "jdk.http.auth.proxying.disabledSchemes", "52#52#-1", "Character", "Character", "", "java.rmi.server.codebase", "jdk.net.URLClassPath.showIgnoredClassPathEntries", "0", "jdk.net.URLClassPath.showIgnoredClassPathEntries" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        boolean boolean19 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals((java.lang.Object) "0", (java.lang.Object) strArray4, (java.util.Collection<java.lang.String>) strList17);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join((java.util.List<java.lang.String>) strList17, '#', (int) (byte) 0, (int) (short) 0);
        org.apache.commons.lang3.stream.Streams.FailableStream<java.lang.String> strFailableStream24 = org.apache.commons.lang3.stream.Streams.stream((java.util.Collection<java.lang.String>) strList17);
        java.lang.String str25 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) throwableArray2, (java.util.Collection<java.lang.String>) strList17);
        org.apache.commons.lang3.stream.Streams.FailableStream<java.lang.String> strFailableStream26 = org.apache.commons.lang3.stream.Streams.failableStream((java.util.Collection<java.lang.String>) strList17);
        java.lang.Class<?> wildcardClass28 = null;
        java.lang.Class[] classArray30 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray31 = (java.lang.Class<?>[]) classArray30;
        wildcardClassArray31[0] = wildcardClass28;
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray31);
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Object[]> objArrayMutableObject35 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Object[]>((java.lang.Object[]) wildcardClassArray34);
        org.apache.commons.lang3.ArrayUtils.shift((java.lang.Object[]) wildcardClassArray34, 0);
        java.lang.Class<?> wildcardClass38 = null;
        java.lang.Class[] classArray40 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray41 = (java.lang.Class<?>[]) classArray40;
        wildcardClassArray41[0] = wildcardClass38;
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray41);
        boolean boolean46 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray34, wildcardClassArray41, false);
        java.util.List<java.lang.String> strList47 = org.apache.commons.lang3.Validate.noNullElements((java.util.List<java.lang.String>) strList17, "US-ASCII", (java.lang.Object[]) wildcardClassArray34);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "0", "jdk.http.auth.proxying.disabledSchemes", "52#52#-1", "Character", "Character", "", "java.rmi.server.codebase", "jdk.net.URLClassPath.showIgnoredClassPathEntries", "0", "jdk.net.URLClassPath.showIgnoredClassPathEntries" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strFailableStream24);
        org.junit.Assert.assertNotNull(strFailableStream26);
        org.junit.Assert.assertNotNull(classArray30);
        org.junit.Assert.assertArrayEquals(classArray30, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertArrayEquals(wildcardClassArray31, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertArrayEquals(wildcardClassArray34, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray40);
        org.junit.Assert.assertArrayEquals(classArray40, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertArrayEquals(wildcardClassArray41, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertArrayEquals(wildcardClassArray44, new java.lang.Class[] { null });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strList47);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        org.apache.commons.lang3.DoubleRange doubleRange2 = org.apache.commons.lang3.DoubleRange.of((java.lang.Double) (-1.0d), (java.lang.Double) 27.21678707536893d);
        org.apache.commons.lang3.DoubleRange doubleRange5 = org.apache.commons.lang3.DoubleRange.of((java.lang.Double) (-1.0d), (java.lang.Double) 27.21678707536893d);
        org.apache.commons.lang3.DoubleRange doubleRange8 = org.apache.commons.lang3.DoubleRange.of((java.lang.Double) (-1.0d), (java.lang.Double) 27.21678707536893d);
        boolean boolean9 = doubleRange5.isBeforeRange((org.apache.commons.lang3.Range<java.lang.Double>) doubleRange8);
        org.apache.commons.lang3.DoubleRange doubleRange12 = org.apache.commons.lang3.DoubleRange.of((java.lang.Double) (-1.0d), (java.lang.Double) 27.21678707536893d);
        org.apache.commons.lang3.DoubleRange doubleRange15 = org.apache.commons.lang3.DoubleRange.of((java.lang.Double) (-1.0d), (java.lang.Double) 27.21678707536893d);
        boolean boolean16 = doubleRange12.isBeforeRange((org.apache.commons.lang3.Range<java.lang.Double>) doubleRange15);
        boolean boolean17 = doubleRange8.isAfterRange((org.apache.commons.lang3.Range<java.lang.Double>) doubleRange15);
        boolean boolean18 = doubleRange2.isBeforeRange((org.apache.commons.lang3.Range<java.lang.Double>) doubleRange15);
        java.lang.Double double19 = doubleRange15.getMinimum();
        org.junit.Assert.assertNotNull(doubleRange2);
        org.junit.Assert.assertNotNull(doubleRange5);
        org.junit.Assert.assertNotNull(doubleRange8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleRange12);
        org.junit.Assert.assertNotNull(doubleRange15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService2);
        java.util.concurrent.ExecutorService executorService4 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService4);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        org.apache.commons.lang3.IntegerRange integerRange2 = org.apache.commons.lang3.IntegerRange.of((int) '#', (int) (byte) 1);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder3 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder3.append("sun.net.httpserver.maxIdleConnections", (byte) 10);
        java.lang.Double[] doubleArray12 = new java.lang.Double[] { 0.0d, 10.0d, 0.0d, 100.0d, 10.0d };
        java.lang.Double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray12);
        java.lang.Double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray13);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder15 = reflectionToStringBuilder3.appendAsObjectToString((java.lang.Object) doubleArray13);
        long[] longArray17 = new long[] { 1L };
        long long18 = org.apache.commons.lang3.math.NumberUtils.min(longArray17);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder19 = reflectionToStringBuilder3.append(longArray17);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(longArray17, 'j');
        org.junit.Assert.assertNotNull(integerRange2);
        org.junit.Assert.assertNotNull(toStringBuilder6);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new java.lang.Double[] { 0.0d, 10.0d, 0.0d, 100.0d, 10.0d });
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new java.lang.Double[] { 0.0d, 10.0d, 0.0d, 100.0d, 10.0d });
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new java.lang.Double[] { 0.0d, 10.0d, 0.0d, 100.0d, 10.0d });
        org.junit.Assert.assertNotNull(toStringBuilder15);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(toStringBuilder19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1" + "'", str21, "1");
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        org.apache.commons.lang3.IntegerRange integerRange2 = org.apache.commons.lang3.IntegerRange.of((int) '#', (int) (byte) 1);
        org.apache.commons.lang3.NumberRange<java.lang.Integer> intNumberRange3 = org.apache.commons.lang3.SerializationUtils.clone((org.apache.commons.lang3.NumberRange<java.lang.Integer>) integerRange2);
        boolean boolean5 = integerRange2.isEndedBy((java.lang.Integer) (-2));
        int int7 = integerRange2.fit((-9));
        org.junit.Assert.assertNotNull(integerRange2);
        org.junit.Assert.assertNotNull(intNumberRange3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        int[] intArray3 = new int[] { '4', '4', (byte) -1 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray3, '#');
        int[] intArray11 = new int[] { (short) 0, (short) 1, (short) 10, (short) 100, 1 };
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray11, '4');
        int[] intArray14 = org.apache.commons.lang3.ArrayUtils.removeElements(intArray3, intArray11);
        java.lang.reflect.Field field15 = null;
        java.lang.reflect.Field[] fieldArray16 = new java.lang.reflect.Field[] { field15 };
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper17 = new org.apache.commons.lang3.text.translate.NumericEntityEscaper();
        org.apache.commons.lang3.NotImplementedException notImplementedException20 = new org.apache.commons.lang3.NotImplementedException("stdout.encoding", "041410410041");
        org.apache.commons.lang3.tuple.Triple<java.lang.reflect.Field[], org.apache.commons.lang3.text.translate.CodePointTranslator, org.apache.commons.lang3.NotImplementedException> fieldArrayTriple21 = org.apache.commons.lang3.tuple.Triple.of(fieldArray16, (org.apache.commons.lang3.text.translate.CodePointTranslator) numericEntityEscaper17, notImplementedException20);
        java.lang.String str22 = notImplementedException20.getCode();
        double[] doubleArray25 = new double[] { (short) 10, 1.0f };
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray25);
        java.util.List<java.lang.Boolean> booleanList27 = org.apache.commons.lang3.BooleanUtils.values();
        org.apache.commons.lang3.compare.ObjectToStringComparator objectToStringComparator28 = org.apache.commons.lang3.compare.ObjectToStringComparator.INSTANCE;
        org.apache.commons.lang3.Range<java.lang.Object> objRange29 = org.apache.commons.lang3.Range.of((java.lang.Object) doubleArray25, (java.lang.Object) booleanList27, (java.util.Comparator<java.lang.Object>) objectToStringComparator28);
        org.apache.commons.lang3.Range<java.lang.Object> objRange30 = org.apache.commons.lang3.Range.between((java.lang.Object) intArray14, (java.lang.Object) notImplementedException20, (java.util.Comparator<java.lang.Object>) objectToStringComparator28);
        int[] intArray33 = org.apache.commons.lang3.ArrayUtils.subarray(intArray14, 2, (int) (short) 10);
        int int34 = org.apache.commons.lang3.math.NumberUtils.min(intArray14);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 52, 52, (-1) });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "52#52#-1" + "'", str5, "52#52#-1");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 0, 1, 10, 100, 1 });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "041410410041" + "'", str13, "041410410041");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 52, 52, (-1) });
        org.junit.Assert.assertNotNull(fieldArray16);
        org.junit.Assert.assertArrayEquals(fieldArray16, new java.lang.reflect.Field[] { null });
        org.junit.Assert.assertNotNull(fieldArrayTriple21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "041410410041" + "'", str22, "041410410041");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(booleanList27);
        org.junit.Assert.assertNotNull(objectToStringComparator28);
        org.junit.Assert.assertNotNull(objRange29);
        org.junit.Assert.assertNotNull(objRange30);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        org.apache.commons.lang3.concurrent.CircuitBreakingException circuitBreakingException1 = new org.apache.commons.lang3.concurrent.CircuitBreakingException("P0Y0M0DT0H0M0.004S");
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        org.apache.commons.lang3.IntegerRange integerRange2 = org.apache.commons.lang3.IntegerRange.of((int) (short) 7, 1001);
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] {};
        boolean boolean6 = org.apache.commons.lang3.StringUtils.isNoneBlank(charSequenceArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.isAllBlank(charSequenceArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "null", charSequenceArray5);
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "java.vm.specification.version", charSequenceArray5);
        boolean boolean10 = integerRange2.equals((java.lang.Object) charSequenceArray5);
        java.lang.Integer int12 = integerRange2.fit((java.lang.Integer) 109);
        boolean boolean14 = integerRange2.isAfter((java.lang.Integer) 629);
        org.junit.Assert.assertNotNull(integerRange2);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertArrayEquals(charSequenceArray5, new java.lang.CharSequence[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 109 + "'", int12 == 109);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor0 = new org.apache.commons.lang3.text.StrSubstitutor();
        org.apache.commons.lang3.text.StrSubstitutor strSubstitutor2 = strSubstitutor0.setValueDelimiter("04jdk.http.auth.proxying.disabledSchemes452#52#-14Character4Character44java.rmi.server.codebase4jdk.net.URLClassPath.showIgnoredClassPathEntries40");
        org.apache.commons.lang3.function.FailableFunction<org.apache.commons.lang3.NotImplementedException, org.apache.commons.lang3.NotImplementedException, org.apache.commons.lang3.concurrent.ConcurrentRuntimeException> notImplementedExceptionFailableFunction3 = org.apache.commons.lang3.function.FailableFunction.identity();
        java.lang.String str4 = strSubstitutor0.replace((java.lang.Object) notImplementedExceptionFailableFunction3);
        strSubstitutor0.setEnableSubstitutionInVariables(false);
        org.junit.Assert.assertNotNull(strSubstitutor2);
        org.junit.Assert.assertNotNull(notImplementedExceptionFailableFunction3);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC(0L, "gaf");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: g");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        org.apache.commons.lang3.LongRange longRange2 = org.apache.commons.lang3.LongRange.of((java.lang.Long) (-1L), (java.lang.Long) 0L);
        java.util.Comparator<java.lang.Long> longComparator3 = longRange2.getComparator();
        org.apache.commons.lang3.LongRange longRange6 = org.apache.commons.lang3.LongRange.of((java.lang.Long) (-1L), (java.lang.Long) 0L);
        java.util.Comparator<java.lang.Long> longComparator7 = longRange6.getComparator();
        boolean boolean8 = longRange6.isNaturalOrdering();
        org.apache.commons.lang3.Range<java.lang.Long> longRange9 = longRange2.intersectionWith((org.apache.commons.lang3.Range<java.lang.Long>) longRange6);
        boolean boolean11 = longRange9.contains((java.lang.Long) (-65L));
        java.lang.String str12 = longRange9.toString();
        org.junit.Assert.assertNotNull(longRange2);
        org.junit.Assert.assertNotNull(longComparator3);
        org.junit.Assert.assertNotNull(longRange6);
        org.junit.Assert.assertNotNull(longComparator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(longRange9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[-1..0]" + "'", str12, "[-1..0]");
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        java.util.concurrent.Callable<org.apache.commons.lang3.Streams.FailableStream<java.lang.Throwable>> throwableFailableStreamCallable0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.CallableBackgroundInitializer<org.apache.commons.lang3.Streams.FailableStream<java.lang.Throwable>> throwableFailableStreamCallableBackgroundInitializer2 = new org.apache.commons.lang3.concurrent.CallableBackgroundInitializer<org.apache.commons.lang3.Streams.FailableStream<java.lang.Throwable>>(throwableFailableStreamCallable0, executorService1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: callable");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 2);
        float float2 = mutableLong1.floatValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 2);
        int int5 = mutableLong1.compareTo(mutableLong4);
        org.apache.commons.lang3.mutable.MutableLong mutableLong7 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 2);
        int int8 = mutableLong7.intValue();
        org.apache.commons.lang3.Range<org.apache.commons.lang3.mutable.MutableLong> mutableLongRange9 = org.apache.commons.lang3.Range.is(mutableLong7);
        mutableLong7.increment();
        org.apache.commons.lang3.mutable.MutableLong mutableLong12 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 2);
        int int13 = mutableLong12.intValue();
        org.apache.commons.lang3.Range<org.apache.commons.lang3.mutable.MutableLong> mutableLongRange14 = org.apache.commons.lang3.Range.is(mutableLong12);
        org.apache.commons.lang3.mutable.MutableLong mutableLong16 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 2);
        float float17 = mutableLong16.floatValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong19 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 2);
        int int20 = mutableLong19.intValue();
        org.apache.commons.lang3.Range<org.apache.commons.lang3.mutable.MutableLong> mutableLongRange21 = org.apache.commons.lang3.Range.is(mutableLong19);
        org.apache.commons.lang3.mutable.MutableLong mutableLong23 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 2);
        int int24 = mutableLong23.intValue();
        org.apache.commons.lang3.Range<org.apache.commons.lang3.mutable.MutableLong> mutableLongRange25 = org.apache.commons.lang3.Range.is(mutableLong23);
        org.apache.commons.lang3.mutable.MutableLong[] mutableLongArray26 = new org.apache.commons.lang3.mutable.MutableLong[] { mutableLong4, mutableLong7, mutableLong12, mutableLong16, mutableLong19, mutableLong23 };
        java.lang.Class<org.apache.commons.lang3.mutable.MutableLong> mutableLongClass27 = org.apache.commons.lang3.ArrayUtils.getComponentType(mutableLongArray26);
        java.lang.String str28 = org.apache.commons.lang3.ClassUtils.getPackageName(mutableLongClass27);
        java.lang.Iterable<java.lang.Class<?>> wildcardClassIterable29 = org.apache.commons.lang3.ClassUtils.hierarchy(mutableLongClass27);
        java.lang.Class<?> wildcardClass30 = org.apache.commons.lang3.ClassUtils.wrapperToPrimitive(mutableLongClass27);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(mutableLongRange9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(mutableLongRange14);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 2.0f + "'", float17 == 2.0f);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(mutableLongRange21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(mutableLongRange25);
        org.junit.Assert.assertNotNull(mutableLongArray26);
        org.junit.Assert.assertNotNull(mutableLongClass27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "org.apache.commons.lang3.mutable" + "'", str28, "org.apache.commons.lang3.mutable");
        org.junit.Assert.assertNotNull(wildcardClassIterable29);
        org.junit.Assert.assertNull(wildcardClass30);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        org.apache.commons.lang3.SystemProperties systemProperties0 = new org.apache.commons.lang3.SystemProperties();
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        org.apache.commons.lang3.LongRange longRange2 = org.apache.commons.lang3.LongRange.of((java.lang.Long) (-1L), (java.lang.Long) 0L);
        java.lang.String str4 = longRange2.toString("Java Platform API Specification");
        boolean boolean6 = longRange2.isBefore((java.lang.Long) 60000L);
        org.junit.Assert.assertNotNull(longRange2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Java Platform API Specification" + "'", str4, "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

//    @Test
//    public void test554() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest1.test554");
//        java.util.Locale locale2 = null;
//        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 0, locale2);
//        java.lang.String str4 = fastDateFormat3.getPattern();
//        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.DateFormatUtils.ISO_TIME_NO_T_TIME_ZONE_FORMAT;
//        java.util.Locale locale6 = fastDateFormat5.getLocale();
//        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.DateFormatUtils.ISO_TIME_NO_T_TIME_ZONE_FORMAT;
//        java.util.Locale locale8 = fastDateFormat7.getLocale();
//        org.apache.commons.lang3.text.CompositeFormat compositeFormat9 = new org.apache.commons.lang3.text.CompositeFormat((java.text.Format) fastDateFormat5, (java.text.Format) fastDateFormat7);
//        java.text.Format format10 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.text.Format) fastDateFormat5);
//        java.lang.Object obj11 = fastDateFormat5.clone();
//        org.apache.commons.lang3.text.CompositeFormat compositeFormat12 = new org.apache.commons.lang3.text.CompositeFormat((java.text.Format) fastDateFormat3, (java.text.Format) fastDateFormat5);
//        org.junit.Assert.assertNotNull(fastDateFormat3);
//        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EEEE, MMMM d, y 'at' h:mm:ss a zzzz" + "'", str4, "EEEE, MMMM d, y 'at' h:mm:ss a zzzz");
//        org.junit.Assert.assertNotNull(fastDateFormat5);
//        org.junit.Assert.assertNotNull(locale6);
//        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
//        org.junit.Assert.assertNotNull(fastDateFormat7);
//        org.junit.Assert.assertNotNull(locale8);
//        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
//        org.junit.Assert.assertNotNull(format10);
//        org.junit.Assert.assertNotNull(obj11);
//        org.junit.Assert.assertEquals(obj11.toString(), "FastDateFormat[HH:mm:ssZZ,en_US,Europe/Berlin]");
//        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "FastDateFormat[HH:mm:ssZZ,en_US,Europe/Berlin]");
//        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "FastDateFormat[HH:mm:ssZZ,en_US,Europe/Berlin]");
//    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        org.apache.commons.lang3.IntegerRange integerRange2 = org.apache.commons.lang3.IntegerRange.of((int) '#', (int) (byte) 1);
        org.apache.commons.lang3.NumberRange<java.lang.Integer> intNumberRange3 = org.apache.commons.lang3.SerializationUtils.clone((org.apache.commons.lang3.NumberRange<java.lang.Integer>) integerRange2);
        int int5 = integerRange2.fit((int) (byte) 0);
        org.junit.Assert.assertNotNull(integerRange2);
        org.junit.Assert.assertNotNull(intNumberRange3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_JAVA_1_6;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        org.apache.commons.lang3.LongRange longRange2 = org.apache.commons.lang3.LongRange.of((java.lang.Long) (-1L), (java.lang.Long) 0L);
        float[] floatArray9 = new float[] { 'a', ' ', (-1), (short) 1, (byte) 10, (byte) 1 };
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray9);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray9);
        java.util.BitSet bitSet14 = org.apache.commons.lang3.ArrayUtils.indexesOf(floatArray11, (float) 100, 5);
        java.lang.Class<?> wildcardClass15 = null;
        java.lang.Class[] classArray17 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass15;
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray18);
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Object[]> objArrayMutableObject22 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Object[]>((java.lang.Object[]) wildcardClassArray21);
        org.apache.commons.lang3.JavaVersion javaVersion23 = org.apache.commons.lang3.JavaVersion.JAVA_9;
        java.lang.String[] strArray43 = new java.lang.String[] { "UTF-16LE", "apple.awt.enableTemplateImages", "P0Y0M0DT0H0M0.004S", "java.nio.channels.spi.AsynchronousChannelProvider", "jdk.net.URLClassPath.showIgnoredClassPathEntries", "Character", "hi!", "jdk.http.auth.proxying.disabledSchemes", "Azul Systems, Inc.", ":", "jdk.http.auth.proxying.disabledSchemes", "Azul Systems, Inc.", "local|*.local|169.254/16|*.169.254/16", "jdk.module.main", "UTF-16LE", "java.rmi.server.codebase", "P0Y0M0DT0H0M0.004S", "P0Y0M0DT0H0M0.004S", "04jdk.http.auth.proxying.disabledSchemes452#52#-14Character4Character44java.rmi.server.codebase4jdk.net.URLClassPath.showIgnoredClassPathEntries40" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.apache.commons.lang3.tuple.MutableTriple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>> objArraySupplierMutableTriple46 = new org.apache.commons.lang3.tuple.MutableTriple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>((java.util.function.Supplier<java.lang.Object[]>) objArrayMutableObject22, (java.lang.Enum<org.apache.commons.lang3.JavaVersion>) javaVersion23, (java.util.List<java.lang.String>) strList44);
        org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>> objArraySupplierTriple47 = null;
        java.util.function.Predicate<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>> objArraySupplierTriplePredicate48 = org.apache.commons.lang3.compare.ComparableUtils.betweenExclusive((org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>) objArraySupplierMutableTriple46, objArraySupplierTriple47);
        org.apache.commons.lang3.tuple.ImmutablePair[] immutablePairArray50 = new org.apache.commons.lang3.tuple.ImmutablePair[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Exception[], java.util.function.Predicate<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>>>[] exceptionArrayImmutablePairArray51 = (org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Exception[], java.util.function.Predicate<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>>>[]) immutablePairArray50;
        org.apache.commons.lang3.tuple.MutableTriple<java.util.BitSet, java.util.function.Predicate<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>>, org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Exception[], java.util.function.Predicate<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>>>[]> bitSetMutableTriple52 = org.apache.commons.lang3.tuple.MutableTriple.of(bitSet14, objArraySupplierTriplePredicate48, (org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Exception[], java.util.function.Predicate<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>>>[]) immutablePairArray50);
        boolean boolean53 = longRange2.equals((java.lang.Object) objArraySupplierTriplePredicate48);
        long long55 = longRange2.fit((long) 62);
        org.apache.commons.lang3.LongRange longRange58 = org.apache.commons.lang3.LongRange.of((java.lang.Long) (-1L), (java.lang.Long) 0L);
        boolean boolean59 = longRange58.isNaturalOrdering();
        org.apache.commons.lang3.LongRange longRange62 = org.apache.commons.lang3.LongRange.of((java.lang.Long) (-1L), (java.lang.Long) 0L);
        boolean boolean63 = longRange58.isBeforeRange((org.apache.commons.lang3.Range<java.lang.Long>) longRange62);
        org.apache.commons.lang3.Range<java.lang.Long> longRange64 = longRange2.intersectionWith((org.apache.commons.lang3.Range<java.lang.Long>) longRange62);
        org.apache.commons.lang3.LongRange longRange67 = org.apache.commons.lang3.LongRange.of((java.lang.Long) 0L, (java.lang.Long) 60000L);
        boolean boolean68 = longRange2.containsRange((org.apache.commons.lang3.Range<java.lang.Long>) longRange67);
        java.util.stream.LongStream longStream69 = longRange67.toLongStream();
        java.util.Comparator<java.lang.Long> longComparator70 = longRange67.getComparator();
        org.junit.Assert.assertNotNull(longRange2);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertArrayEquals(floatArray9, new float[] { 97.0f, 32.0f, (-1.0f), 1.0f, 10.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertArrayEquals(floatArray11, new float[] { 97.0f, 32.0f, (-1.0f), 1.0f, 10.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(bitSet14);
        org.junit.Assert.assertEquals(bitSet14.toString(), "{}");
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertArrayEquals(classArray17, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertArrayEquals(wildcardClassArray18, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertArrayEquals(wildcardClassArray21, new java.lang.Class[] { null });
        org.junit.Assert.assertTrue("'" + javaVersion23 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_9 + "'", javaVersion23.equals(org.apache.commons.lang3.JavaVersion.JAVA_9));
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "UTF-16LE", "apple.awt.enableTemplateImages", "P0Y0M0DT0H0M0.004S", "java.nio.channels.spi.AsynchronousChannelProvider", "jdk.net.URLClassPath.showIgnoredClassPathEntries", "Character", "hi!", "jdk.http.auth.proxying.disabledSchemes", "Azul Systems, Inc.", ":", "jdk.http.auth.proxying.disabledSchemes", "Azul Systems, Inc.", "local|*.local|169.254/16|*.169.254/16", "jdk.module.main", "UTF-16LE", "java.rmi.server.codebase", "P0Y0M0DT0H0M0.004S", "P0Y0M0DT0H0M0.004S", "04jdk.http.auth.proxying.disabledSchemes452#52#-14Character4Character44java.rmi.server.codebase4jdk.net.URLClassPath.showIgnoredClassPathEntries40" });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(objArraySupplierTriplePredicate48);
        org.junit.Assert.assertNotNull(immutablePairArray50);
        org.junit.Assert.assertArrayEquals(immutablePairArray50, new org.apache.commons.lang3.tuple.ImmutablePair[] {});
        org.junit.Assert.assertNotNull(exceptionArrayImmutablePairArray51);
        org.junit.Assert.assertArrayEquals(exceptionArrayImmutablePairArray51, new org.apache.commons.lang3.tuple.ImmutablePair[] {});
        org.junit.Assert.assertNotNull(bitSetMutableTriple52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertNotNull(longRange58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(longRange62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(longRange64);
        org.junit.Assert.assertNotNull(longRange67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(longStream69);
        org.junit.Assert.assertNotNull(longComparator70);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((-11));
        double double2 = mutableInt1.doubleValue();
        long long3 = mutableInt1.longValue();
        java.lang.Integer int4 = mutableInt1.getValue();
        int int5 = mutableInt1.getAndDecrement();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 1.0d);
        float float8 = mutableShort7.floatValue();
        mutableInt1.add((java.lang.Number) float8);
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.getFraction(100, 37, 4);
        int int14 = fraction13.intValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte15 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) fraction13);
        mutableInt1.add((java.lang.Number) mutableByte15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-11.0d) + "'", double2 == (-11.0d));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-11L) + "'", long3 == (-11L));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-11) + "'", int4 == (-11));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-11) + "'", int5 == (-11));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 109 + "'", int14 == 109);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        org.apache.commons.lang3.IntegerRange integerRange2 = org.apache.commons.lang3.IntegerRange.of((int) '#', (int) (byte) 1);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder3 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.concurrent.CircuitBreakingException circuitBreakingException4 = new org.apache.commons.lang3.concurrent.CircuitBreakingException();
        org.apache.commons.lang3.concurrent.CircuitBreakingException circuitBreakingException5 = new org.apache.commons.lang3.concurrent.CircuitBreakingException((java.lang.Throwable) circuitBreakingException4);
        org.apache.commons.lang3.concurrent.CircuitBreakingException circuitBreakingException6 = org.apache.commons.lang3.ObjectUtils.clone(circuitBreakingException5);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder3.appendAsObjectToString((java.lang.Object) circuitBreakingException5);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append((double) 2.0f);
        int[] intArray14 = new int[] { '4', '4', (byte) -1 };
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray14, '#');
        int[] intArray22 = new int[] { (short) 0, (short) 1, (short) 10, (short) 100, 1 };
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray22, '4');
        int[] intArray25 = org.apache.commons.lang3.ArrayUtils.removeElements(intArray14, intArray22);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder26 = toStringBuilder9.append("P0Y0M0DT0H0M0.004S", intArray14);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray14);
        org.junit.Assert.assertNotNull(integerRange2);
        org.junit.Assert.assertNull(circuitBreakingException6);
        org.junit.Assert.assertNotNull(toStringBuilder7);
        org.junit.Assert.assertNotNull(toStringBuilder9);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 52, 52 });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "52#52#-1" + "'", str16, "52#52#-1");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 0, 1, 10, 100, 1 });
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "041410410041" + "'", str24, "041410410041");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 52, 52, (-1) });
        org.junit.Assert.assertNotNull(toStringBuilder26);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        org.apache.commons.lang3.function.FailableDoubleConsumer<java.lang.Exception> exceptionFailableDoubleConsumer0 = org.apache.commons.lang3.function.FailableDoubleConsumer.nop();
        org.junit.Assert.assertNotNull(exceptionFailableDoubleConsumer0);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        org.apache.commons.lang3.DoubleRange doubleRange2 = org.apache.commons.lang3.DoubleRange.of((java.lang.Double) (-1.0d), (java.lang.Double) 27.21678707536893d);
        java.util.Comparator<java.lang.Double> doubleComparator3 = doubleRange2.getComparator();
        org.junit.Assert.assertNotNull(doubleRange2);
        org.junit.Assert.assertNotNull(doubleComparator3);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        mutableByte0.setValue((byte) 0);
        byte byte3 = mutableByte0.getAndIncrement();
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte();
        mutableByte4.setValue((byte) 0);
        byte byte7 = mutableByte4.getAndIncrement();
        int int9 = org.apache.commons.lang3.ObjectUtils.compare(mutableByte0, mutableByte4, false);
        java.lang.Byte byte10 = mutableByte0.getValue();
        java.lang.Byte byte11 = mutableByte0.toByte();
        java.lang.Number number12 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableByte0.add(number12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        double[] doubleArray2 = new double[] { (short) 10, 1.0f };
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray2);
        java.util.List<java.lang.Boolean> booleanList4 = org.apache.commons.lang3.BooleanUtils.values();
        org.apache.commons.lang3.compare.ObjectToStringComparator objectToStringComparator5 = org.apache.commons.lang3.compare.ObjectToStringComparator.INSTANCE;
        org.apache.commons.lang3.Range<java.lang.Object> objRange6 = org.apache.commons.lang3.Range.of((java.lang.Object) doubleArray2, (java.lang.Object) booleanList4, (java.util.Comparator<java.lang.Object>) objectToStringComparator5);
        org.apache.commons.lang3.concurrent.CircuitBreakingException circuitBreakingException8 = new org.apache.commons.lang3.concurrent.CircuitBreakingException();
        org.apache.commons.lang3.concurrent.CircuitBreakingException circuitBreakingException9 = new org.apache.commons.lang3.concurrent.CircuitBreakingException((java.lang.Throwable) circuitBreakingException8);
        java.util.stream.Stream<java.lang.Throwable> throwableStream10 = org.apache.commons.lang3.exception.ExceptionUtils.stream((java.lang.Throwable) circuitBreakingException8);
        org.apache.commons.lang3.exception.ContextedException contextedException11 = new org.apache.commons.lang3.exception.ContextedException("OpenJDK 64-Bit Server VM", (java.lang.Throwable) circuitBreakingException8);
        java.util.Set<java.lang.String> strSet12 = contextedException11.getContextLabels();
        java.util.stream.Stream<java.lang.String> strStream13 = org.apache.commons.lang3.stream.Streams.nonNull((java.util.Collection<java.lang.String>) strSet12);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) strSet12, (java.lang.Object) 0);
        java.lang.String str16 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringInclude((java.lang.Object) doubleArray2, (java.util.Collection<java.lang.String>) strSet12);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray2, (double) (-11.0f));
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(objectToStringComparator5);
        org.junit.Assert.assertNotNull(objRange6);
        org.junit.Assert.assertNotNull(throwableStream10);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strStream13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

//    @Test
//    public void test564() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest1.test564");
//        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder(671248312);
//        org.apache.commons.lang3.text.StrMatcher strMatcher3 = null;
//        org.apache.commons.lang3.text.StrMatcher strMatcher4 = org.apache.commons.lang3.text.StrMatcher.commaMatcher();
//        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer("pa\"P*", strMatcher3, strMatcher4);
//        org.apache.commons.lang3.text.StrBuilder strBuilder10 = strBuilder1.replace(strMatcher4, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.SSS'S'", 0, (int) 'j', (int) (byte) 100);
//        org.apache.commons.lang3.text.StrBuilder strBuilder12 = strBuilder10.appendln((double) 2026);
//        byte[] byteArray13 = new byte[] {};
//        byte[] byteArray14 = new byte[] {};
//        byte[] byteArray15 = new byte[] {};
//        byte[] byteArray16 = new byte[] {};
//        byte[][] byteArray17 = new byte[][] { byteArray13, byteArray14, byteArray15, byteArray16 };
//        byte[][] byteArray18 = org.apache.commons.lang3.ArrayUtils.toArray(byteArray17);
//        byte[] byteArray23 = new byte[] { (byte) 5, (byte) 0, (byte) -1, (byte) 100 };
//        byte[] byteArray28 = new byte[] { (byte) 5, (byte) 0, (byte) -1, (byte) 100 };
//        byte[][] byteArray29 = new byte[][] { byteArray23, byteArray28 };
//        org.apache.commons.lang3.builder.ToStringStyle toStringStyle30 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
//        org.apache.commons.lang3.builder.ReflectionDiffBuilder<byte[][]> byteArrayReflectionDiffBuilder31 = new org.apache.commons.lang3.builder.ReflectionDiffBuilder<byte[][]>(byteArray17, byteArray29, toStringStyle30);
//        byte[] byteArray32 = new byte[] {};
//        byte[] byteArray33 = new byte[] {};
//        byte[] byteArray34 = new byte[] {};
//        byte[] byteArray35 = new byte[] {};
//        byte[][] byteArray36 = new byte[][] { byteArray32, byteArray33, byteArray34, byteArray35 };
//        byte[][] byteArray37 = org.apache.commons.lang3.ArrayUtils.toArray(byteArray36);
//        org.apache.commons.lang3.builder.ToStringStyle toStringStyle38 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
//        org.apache.commons.lang3.builder.ReflectionDiffBuilder<byte[][]> byteArrayReflectionDiffBuilder39 = new org.apache.commons.lang3.builder.ReflectionDiffBuilder<byte[][]>(byteArray17, byteArray36, toStringStyle38);
//        java.lang.String[] strArray44 = new java.lang.String[] {};
//        java.lang.String str45 = org.apache.commons.lang3.StringUtils.firstNonEmpty(strArray44);
//        java.lang.String str46 = org.apache.commons.lang3.StringUtils.prependIfMissingIgnoreCase("java.class.version", (java.lang.CharSequence) "java.protocol.handler.pkgs", (java.lang.CharSequence[]) strArray44);
//        java.lang.String str47 = java.text.MessageFormat.format("UTF-16LE", (java.lang.Object[]) strArray44);
//        java.lang.String[] strArray48 = org.apache.commons.lang3.StringUtils.stripAll(strArray44);
//        org.apache.commons.lang3.ArrayUtils.shuffle((java.lang.Object[]) strArray44);
//        boolean boolean50 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "OpenJDK 64-Bit Server VM", (java.lang.CharSequence[]) strArray44);
//        org.apache.commons.lang3.builder.ReflectionDiffBuilder<byte[][]> byteArrayReflectionDiffBuilder51 = byteArrayReflectionDiffBuilder39.setExcludeFieldNames(strArray44);
//        boolean boolean52 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) strBuilder10, (java.lang.CharSequence[]) strArray44);
//        org.junit.Assert.assertNotNull(strMatcher4);
//        org.junit.Assert.assertNotNull(strBuilder10);
//        org.junit.Assert.assertNotNull(strBuilder12);
//        org.junit.Assert.assertNotNull(byteArray13);
//        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray14);
//        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray15);
//        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray17);
//        org.junit.Assert.assertNotNull(byteArray18);
//        org.junit.Assert.assertNotNull(byteArray23);
//        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 5, (byte) 0, (byte) -1, (byte) 100 });
//        org.junit.Assert.assertNotNull(byteArray28);
//        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 5, (byte) 0, (byte) -1, (byte) 100 });
//        org.junit.Assert.assertNotNull(byteArray29);
//        org.junit.Assert.assertNotNull(toStringStyle30);
//        org.junit.Assert.assertNotNull(byteArray32);
//        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray33);
//        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray34);
//        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray35);
//        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray36);
//        org.junit.Assert.assertNotNull(byteArray37);
//        org.junit.Assert.assertNotNull(toStringStyle38);
//        org.junit.Assert.assertNotNull(strArray44);
//        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] {});
//        org.junit.Assert.assertNull(str45);
//        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "java.protocol.handler.pkgsjava.class.version" + "'", str46, "java.protocol.handler.pkgsjava.class.version");
//        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "UTF-16LE" + "'", str47, "UTF-16LE");
//        org.junit.Assert.assertNotNull(strArray48);
//        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] {});
//        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
//        org.junit.Assert.assertNotNull(byteArrayReflectionDiffBuilder51);
//        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
//    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        // The following exception was thrown during execution in test generation
        try {
            char char1 = org.apache.commons.lang3.CharUtils.toChar("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        java.lang.String str2 = org.apache.commons.lang3.RegExUtils.removeAll("hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        char char1 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) ' ');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ' ' + "'", char1 == ' ');
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character   is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceFirst("", "hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>, org.apache.commons.lang3.text.StrTokenizer> objArraySupplierTripleMutablePair0 = null;
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>, org.apache.commons.lang3.text.StrTokenizer> objArraySupplierTripleMutablePair1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>, org.apache.commons.lang3.text.StrTokenizer>> supplierTripleMutablePairRange2 = org.apache.commons.lang3.Range.between(objArraySupplierTripleMutablePair0, objArraySupplierTripleMutablePair1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        org.apache.commons.lang3.DoubleRange doubleRange2 = org.apache.commons.lang3.DoubleRange.of((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        org.junit.Assert.assertNotNull(doubleRange2);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare((java.lang.Object) ' ', (java.lang.Object) 1.0d, (java.util.Collection<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime0 = null;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.time.chrono.ChronoZonedDateTime<java.time.LocalDate>> localDateChronoZonedDateTimeRange2 = org.apache.commons.lang3.Range.between(localDateChronoZonedDateTime0, localDateChronoZonedDateTime1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        java.util.Comparator<java.lang.Object> objComparator1 = null;
        org.apache.commons.lang3.Range<java.lang.Object> objRange2 = org.apache.commons.lang3.Range.is((java.lang.Object) 100L, objComparator1);
        org.junit.Assert.assertNotNull(objRange2);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("");
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        java.util.Comparator<java.lang.Object> objComparator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.lang.Object> objRange3 = org.apache.commons.lang3.Range.between((java.lang.Object) ' ', (java.lang.Object) 100.0f, objComparator2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Float cannot be cast to class java.lang.Character (java.lang.Float and java.lang.Character are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        java.util.Comparator<java.lang.Object> objComparator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.lang.Object> objRange3 = org.apache.commons.lang3.Range.between((java.lang.Object) (byte) -1, (java.lang.Object) 1L, objComparator2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Long cannot be cast to class java.lang.Byte (java.lang.Long and java.lang.Byte are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("hi!", timeZone1, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        org.apache.commons.lang3.math.Fraction fraction0 = null;
        org.apache.commons.lang3.math.Fraction fraction1 = null;
        java.util.Comparator<org.apache.commons.lang3.math.Fraction> fractionComparator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.NumberRange<org.apache.commons.lang3.math.Fraction> fractionNumberRange3 = new org.apache.commons.lang3.NumberRange<org.apache.commons.lang3.math.Fraction>(fraction0, fraction1, fractionComparator2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = null;
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<org.apache.commons.lang3.mutable.MutableShort> mutableShortRange2 = org.apache.commons.lang3.Range.between(mutableShort0, mutableShort1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlpha('4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        java.io.File file0 = null;
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.io.File> fileRange2 = org.apache.commons.lang3.Range.between(file0, file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        java.lang.Object obj0 = null;
        java.util.Comparator<java.lang.Object> objComparator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.lang.Object> objRange3 = org.apache.commons.lang3.Range.between(obj0, (java.lang.Object) (short) 0, objComparator2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str2 = org.apache.commons.lang3.RegExUtils.removeFirst((java.lang.CharSequence) "", pattern1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str2 = org.apache.commons.lang3.RegExUtils.removeAll("hi!", pattern1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        org.apache.commons.lang3.DoubleRange doubleRange2 = org.apache.commons.lang3.DoubleRange.of((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        org.junit.Assert.assertNotNull(doubleRange2);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) '4', 0L, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject("");
        org.junit.Assert.assertNull(char1);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replacePattern("", "", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        org.apache.commons.lang3.IntegerRange integerRange2 = org.apache.commons.lang3.IntegerRange.of((int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertNotNull(integerRange2);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10L, true, (byte) -1 };
        java.lang.Class<?> wildcardClass7 = null;
        java.lang.Class[] classArray9 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray10 = (java.lang.Class<?>[]) classArray9;
        wildcardClassArray10[0] = wildcardClass7;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod((java.lang.Object) 0, true, "hi!", objArray6, wildcardClassArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No method: java.lang.Integer.hi!()");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, true, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, true, -1]");
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertArrayEquals(classArray9, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertArrayEquals(wildcardClassArray10, new java.lang.Class[] { null });
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeAll("", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        java.util.Calendar calendar0 = null;
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format(calendar0, "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        java.util.regex.Pattern pattern1 = org.apache.commons.lang3.RegExUtils.dotAll("");
        org.junit.Assert.assertNotNull(pattern1);
        org.junit.Assert.assertEquals(pattern1.toString(), "");
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        org.apache.commons.lang3.LongRange longRange2 = org.apache.commons.lang3.LongRange.of((long) (short) 1, (long) (byte) 10);
        org.junit.Assert.assertNotNull(longRange2);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        java.util.stream.Stream<java.lang.Throwable> throwableStream0 = null;
        java.util.stream.Stream<java.lang.Throwable> throwableStream1 = org.apache.commons.lang3.stream.Streams.nonNull(throwableStream0);
        org.junit.Assert.assertNotNull(throwableStream1);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped((java.lang.Character) '#');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0023" + "'", str1, "\\u0023");
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 1, "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped('a');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0061" + "'", str1, "\\u0061");
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        java.util.Date date0 = null;
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC(date0, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = null;
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<org.apache.commons.lang3.mutable.MutableShort> mutableShortRange2 = org.apache.commons.lang3.Range.of(mutableShort0, mutableShort1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaUpper('a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        java.util.regex.Matcher matcher2 = org.apache.commons.lang3.RegExUtils.dotAllMatcher("hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNotNull(matcher2);
        org.junit.Assert.assertEquals(matcher2.toString(), "java.util.regex.Matcher[pattern=hi! region=0,3 lastmatch=]");
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = org.apache.commons.lang3.RegExUtils.replaceFirst((java.lang.CharSequence) "hi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        org.apache.commons.lang3.LongRange longRange2 = org.apache.commons.lang3.LongRange.of((long) 1, 10L);
        org.junit.Assert.assertNotNull(longRange2);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        int[] intArray0 = null;
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.add(intArray0, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 1 });
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        java.util.Date date0 = null;
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(date0, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped('4');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0034" + "'", str1, "\\u0034");
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        java.time.ZonedDateTime zonedDateTime0 = null;
        java.time.ZonedDateTime zonedDateTime1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.time.ZonedDateTime> zonedDateTimeRange2 = org.apache.commons.lang3.Range.between(zonedDateTime0, zonedDateTime1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        java.lang.String str3 = org.apache.commons.lang3.RegExUtils.replacePattern("", "hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        java.time.Duration duration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.time.Duration> durationRange1 = org.apache.commons.lang3.Range.is(duration0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("hi!", strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Format 'i' not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "" });
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        org.apache.commons.lang3.IntegerRange integerRange2 = org.apache.commons.lang3.IntegerRange.of((java.lang.Integer) 0, (java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(integerRange2);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceIgnoreCase("hi!", "", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        org.apache.commons.lang3.DoubleRange doubleRange2 = org.apache.commons.lang3.DoubleRange.of((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        org.junit.Assert.assertNotNull(doubleRange2);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "hi!", "" };
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "hi!", charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        java.util.Comparator<java.lang.Object> objComparator1 = null;
        org.apache.commons.lang3.Range<java.lang.Object> objRange2 = org.apache.commons.lang3.Range.is((java.lang.Object) 10.0f, objComparator1);
        org.junit.Assert.assertNotNull(objRange2);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue('a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character a is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        java.util.Comparator<java.lang.Object> objComparator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.lang.Object> objRange3 = org.apache.commons.lang3.Range.between((java.lang.Object) 0.0d, (java.lang.Object) (byte) -1, objComparator2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Byte cannot be cast to class java.lang.Double (java.lang.Byte and java.lang.Double are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject('a');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'a' + "'", char1 == 'a');
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '4', 'a');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        java.util.Comparator<java.lang.Object> objComparator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.lang.Object> objRange3 = org.apache.commons.lang3.Range.between((java.lang.Object) "hi!", (java.lang.Object) (byte) 100, objComparator2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Byte cannot be cast to class java.lang.String (java.lang.Byte and java.lang.String are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        java.util.regex.Matcher matcher2 = org.apache.commons.lang3.RegExUtils.dotAllMatcher("", "");
        org.junit.Assert.assertNotNull(matcher2);
        org.junit.Assert.assertEquals(matcher2.toString(), "java.util.regex.Matcher[pattern= region=0,0 lastmatch=]");
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        java.util.regex.Matcher matcher2 = org.apache.commons.lang3.RegExUtils.dotAllMatcher("hi!", "");
        org.junit.Assert.assertNotNull(matcher2);
        org.junit.Assert.assertEquals(matcher2.toString(), "java.util.regex.Matcher[pattern=hi! region=0,0 lastmatch=]");
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        org.apache.commons.lang3.LongRange longRange2 = org.apache.commons.lang3.LongRange.of((long) 1, (long) '#');
        org.junit.Assert.assertNotNull(longRange2);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray1 = org.apache.commons.lang3.exception.ExceptionUtils.throwUnchecked(typeArray0);
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertArrayEquals(typeArray0, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertArrayEquals(typeArray1, new java.lang.reflect.Type[] {});
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format(100L, "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiControl('#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        java.lang.String str2 = org.apache.commons.lang3.RegExUtils.removePattern("", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        java.util.regex.Matcher matcher2 = org.apache.commons.lang3.RegExUtils.dotAllMatcher("", "hi!");
        org.junit.Assert.assertNotNull(matcher2);
        org.junit.Assert.assertEquals(matcher2.toString(), "java.util.regex.Matcher[pattern= region=0,3 lastmatch=]");
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaUpper('4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isHex('4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str2 = org.apache.commons.lang3.RegExUtils.removeFirst("", pattern1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        java.lang.String str3 = org.apache.commons.lang3.RegExUtils.replaceAll("hi!", "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, locale1);
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) 'a', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        java.util.Comparator<java.lang.Object> objComparator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.lang.Object> objRange3 = org.apache.commons.lang3.Range.of((java.lang.Object) true, (java.lang.Object) 100, objComparator2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Boolean (java.lang.Integer and java.lang.Boolean are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        org.apache.commons.lang3.IntegerRange integerRange2 = org.apache.commons.lang3.IntegerRange.of((java.lang.Integer) 100, (java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(integerRange2);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "hi!", "", "hi!", "" };
        boolean boolean6 = org.apache.commons.lang3.StringUtils.isAllEmpty(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        org.apache.commons.lang3.arch.Processor.Arch arch0 = null;
        org.apache.commons.lang3.arch.Processor.Arch arch1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<org.apache.commons.lang3.arch.Processor.Arch> archRange2 = org.apache.commons.lang3.Range.between(arch0, arch1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        java.util.Calendar calendar0 = null;
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(calendar0, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = org.apache.commons.lang3.RegExUtils.replaceAll("hi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format(calendar0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        org.apache.commons.lang3.DoubleRange doubleRange2 = org.apache.commons.lang3.DoubleRange.of((double) 0.0f, (double) 1);
        org.junit.Assert.assertNotNull(doubleRange2);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        char[] charArray5 = new char[] { ' ', '4', '#', '4', '4' };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.valueOf(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '4', '#', '4', '4' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " 4#44" + "'", str6, " 4#44");
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replacePattern("", "", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC(date0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("hi!", strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Format 'i' not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = org.apache.commons.lang3.RegExUtils.replaceFirst("", pattern1, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removePattern("", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiPrintable('#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        java.util.Comparator<java.lang.Object> objComparator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.lang.Object> objRange3 = org.apache.commons.lang3.Range.between((java.lang.Object) (byte) 100, (java.lang.Object) 100, objComparator2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Byte (java.lang.Integer and java.lang.Byte are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        java.lang.String str2 = org.apache.commons.lang3.RegExUtils.removePattern((java.lang.CharSequence) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = org.apache.commons.lang3.RegExUtils.replaceAll("hi!", pattern1, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        java.util.Comparator<java.lang.Object> objComparator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.lang.Object> objRange3 = org.apache.commons.lang3.Range.between((java.lang.Object) 0, (java.lang.Object) "hi!", objComparator2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, locale1);
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        java.util.Comparator<java.lang.Object> objComparator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.lang.Object> objRange3 = org.apache.commons.lang3.Range.of((java.lang.Object) 1, (java.lang.Object) (short) -1, objComparator2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Short cannot be cast to class java.lang.Integer (java.lang.Short and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphanumeric('4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.io.File> fileRange1 = org.apache.commons.lang3.Range.is(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlpha('#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION> oPTIONRange1 = org.apache.commons.lang3.Range.is(oPTION0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        java.time.ZonedDateTime zonedDateTime0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.time.ZonedDateTime> zonedDateTimeRange1 = org.apache.commons.lang3.Range.is(zonedDateTime0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceAll("", "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (byte) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString(' ');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " " + "'", str1, " ");
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        java.time.Duration duration0 = null;
        java.time.Duration duration1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.time.Duration> durationRange2 = org.apache.commons.lang3.Range.between(duration0, duration1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        java.lang.Object obj0 = null;
        java.util.Comparator<java.lang.Object> objComparator1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.lang.Object> objRange2 = org.apache.commons.lang3.Range.is(obj0, objComparator1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        java.lang.String str2 = org.apache.commons.lang3.RegExUtils.removeAll("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isHex(' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlpha('a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        java.time.LocalDateTime localDateTime0 = null;
        java.time.LocalDateTime localDateTime1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.time.LocalDateTime> localDateTimeRange2 = org.apache.commons.lang3.Range.between(localDateTime0, localDateTime1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphanumeric(' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        org.apache.commons.lang3.IntegerRange integerRange2 = org.apache.commons.lang3.IntegerRange.of((java.lang.Integer) 10, (java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(integerRange2);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        org.apache.commons.lang3.concurrent.locks.LockingVisitors.LockVisitor<java.lang.Iterable<java.lang.String>, java.util.concurrent.locks.ReentrantLock>[] strIterableLockVisitorArray0 = null;
        org.apache.commons.lang3.concurrent.locks.LockingVisitors.LockVisitor<java.lang.Iterable<java.lang.String>, java.util.concurrent.locks.ReentrantLock> strIterableLockVisitor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.locks.LockingVisitors.LockVisitor<java.lang.Iterable<java.lang.String>, java.util.concurrent.locks.ReentrantLock>[] strIterableLockVisitorArray3 = org.apache.commons.lang3.ArrayUtils.add(strIterableLockVisitorArray0, 10, strIterableLockVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array and element cannot both be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = org.apache.commons.lang3.RegExUtils.replaceFirst((java.lang.CharSequence) "", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        java.lang.String str3 = org.apache.commons.lang3.RegExUtils.replacePattern("", "", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        java.lang.String str2 = org.apache.commons.lang3.RegExUtils.removePattern("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        java.util.Comparator<java.lang.Object> objComparator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.lang.Object> objRange3 = org.apache.commons.lang3.Range.of((java.lang.Object) 10, (java.lang.Object) false, objComparator2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Boolean cannot be cast to class java.lang.Integer (java.lang.Boolean and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        java.lang.String str3 = org.apache.commons.lang3.RegExUtils.replaceFirst("hi!", "", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isCreatable("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        java.util.Comparator<java.lang.Object> objComparator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.lang.Object> objRange3 = org.apache.commons.lang3.Range.of((java.lang.Object) (short) 100, (java.lang.Object) (byte) 0, objComparator2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Byte cannot be cast to class java.lang.Short (java.lang.Byte and java.lang.Short are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = null;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION> oPTIONRange2 = org.apache.commons.lang3.Range.of(oPTION0, oPTION1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        java.lang.String str3 = org.apache.commons.lang3.RegExUtils.replacePattern((java.lang.CharSequence) "", "", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        java.util.Comparator<java.lang.Object> objComparator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.lang.Object> objRange3 = org.apache.commons.lang3.Range.between((java.lang.Object) 1, (java.lang.Object) (byte) 10, objComparator2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Byte cannot be cast to class java.lang.Integer (java.lang.Byte and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        char char1 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'a');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'a' + "'", char1 == 'a');
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        java.util.Comparator<java.lang.Object> objComparator1 = null;
        org.apache.commons.lang3.Range<java.lang.Object> objRange2 = org.apache.commons.lang3.Range.is((java.lang.Object) (-1.0d), objComparator1);
        org.junit.Assert.assertNotNull(objRange2);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        java.util.Calendar calendar0 = null;
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(calendar0, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (short) 1, timeZone2, locale3);
        org.junit.Assert.assertNotNull(fastDateFormat4);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        java.util.Comparator<java.lang.Object> objComparator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.lang.Object> objRange3 = org.apache.commons.lang3.Range.between((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100, objComparator2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Byte cannot be cast to class java.lang.Double (java.lang.Byte and java.lang.Double are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        java.util.Comparator<java.lang.Object> objComparator2 = null;
        org.apache.commons.lang3.Range<java.lang.Object> objRange3 = org.apache.commons.lang3.Range.between((java.lang.Object) 100.0f, (java.lang.Object) 100.0f, objComparator2);
        org.junit.Assert.assertNotNull(objRange3);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        float[] floatArray0 = new float[] {};
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(floatArray0, '#', (int) 'a', (int) (short) 0);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertArrayEquals(floatArray0, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = null;
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<org.apache.commons.lang3.mutable.MutableByte> mutableByteRange2 = org.apache.commons.lang3.Range.between(mutableByte0, mutableByte1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) 1, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        java.util.Comparator<java.lang.Object> objComparator2 = null;
        org.apache.commons.lang3.Range<java.lang.Object> objRange3 = org.apache.commons.lang3.Range.of((java.lang.Object) (-1.0d), (java.lang.Object) (-1.0d), objComparator2);
        org.junit.Assert.assertNotNull(objRange3);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        org.apache.commons.lang3.tuple.ImmutableTriple<org.apache.commons.lang3.function.FailableSupplier, java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.math.NumberUtils> failableSupplierImmutableTriple0 = org.apache.commons.lang3.tuple.ImmutableTriple.nullTriple();
        org.junit.Assert.assertNotNull(failableSupplierImmutableTriple0);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        java.util.regex.Pattern pattern1 = org.apache.commons.lang3.RegExUtils.dotAll("hi!");
        org.junit.Assert.assertNotNull(pattern1);
        org.junit.Assert.assertEquals(pattern1.toString(), "hi!");
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        java.util.Comparator<java.lang.Object> objComparator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.lang.Object> objRange3 = org.apache.commons.lang3.Range.of((java.lang.Object) 10, (java.lang.Object) (byte) 10, objComparator2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Byte cannot be cast to class java.lang.Integer (java.lang.Byte and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = null;
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<org.apache.commons.lang3.mutable.MutableInt> mutableIntRange2 = org.apache.commons.lang3.Range.between(mutableInt0, mutableInt1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceFirst("hi!", "hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        java.util.Comparator<java.lang.Object> objComparator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.lang.Object> objRange3 = org.apache.commons.lang3.Range.of((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100, objComparator2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Byte cannot be cast to class java.lang.Double (java.lang.Byte and java.lang.Double are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        java.util.TimeZone timeZone1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("hi!", timeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character # is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        java.util.Comparator<java.lang.Object> objComparator1 = null;
        org.apache.commons.lang3.Range<java.lang.Object> objRange2 = org.apache.commons.lang3.Range.is((java.lang.Object) 10.0d, objComparator1);
        org.junit.Assert.assertNotNull(objRange2);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        int[] intArray4 = new int[] { (byte) 10, (byte) 10, 0, 10 };
        int[] intArray10 = new int[] { (byte) -1, (byte) -1, (short) 10, (byte) 10, 1 };
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray4, intArray10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 10, 10, 0, 10 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { (-1), (-1), 10, 10, 1 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        java.util.Comparator<java.lang.Object> objComparator1 = null;
        org.apache.commons.lang3.Range<java.lang.Object> objRange2 = org.apache.commons.lang3.Range.is((java.lang.Object) (byte) 0, objComparator1);
        org.junit.Assert.assertNotNull(objRange2);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeAll("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime0 = null;
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>> localDateChronoLocalDateTimeRange2 = org.apache.commons.lang3.Range.between(localDateChronoLocalDateTime0, localDateChronoLocalDateTime1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        java.util.Comparator<java.lang.Object> objComparator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.lang.Object> objRange3 = org.apache.commons.lang3.Range.between((java.lang.Object) (byte) 10, (java.lang.Object) 100, objComparator2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Byte (java.lang.Integer and java.lang.Byte are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        java.lang.String str3 = org.apache.commons.lang3.RegExUtils.replacePattern((java.lang.CharSequence) "hi!", "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        org.apache.commons.lang3.time.StopWatch.Split split0 = null;
        org.apache.commons.lang3.time.StopWatch.Split split1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<org.apache.commons.lang3.time.StopWatch.Split> splitRange2 = org.apache.commons.lang3.Range.of(split0, split1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        java.util.Comparator<java.lang.Object> objComparator1 = null;
        org.apache.commons.lang3.Range<java.lang.Object> objRange2 = org.apache.commons.lang3.Range.is((java.lang.Object) 0.0f, objComparator1);
        org.junit.Assert.assertNotNull(objRange2);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        boolean[] booleanArray2 = new boolean[] { false, true };
        boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.removeAllOccurrences(booleanArray2, true);
        org.junit.Assert.assertNotNull(booleanArray2);
        assertBooleanArrayEquals(booleanArray2, new boolean[] { false, true });
        org.junit.Assert.assertNotNull(booleanArray4);
        assertBooleanArrayEquals(booleanArray4, new boolean[] { false });
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str2 = org.apache.commons.lang3.RegExUtils.removeAll((java.lang.CharSequence) "", pattern1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        java.lang.String str3 = org.apache.commons.lang3.RegExUtils.replacePattern((java.lang.CharSequence) "hi!", "", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("hi!", locale1, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Format 'i' not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        org.apache.commons.lang3.IntegerRange integerRange2 = org.apache.commons.lang3.IntegerRange.of((java.lang.Integer) (-1), (java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(integerRange2);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        java.lang.Class<org.apache.commons.lang3.mutable.MutableLong> mutableLongClass0 = null;
        java.lang.Class<?> wildcardClass2 = null;
        java.lang.Class[] classArray4 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        wildcardClassArray5[0] = wildcardClass2;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method8 = org.apache.commons.lang3.reflect.MethodUtils.getMatchingAccessibleMethod(mutableLongClass0, "", wildcardClassArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertArrayEquals(classArray4, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertArrayEquals(wildcardClassArray5, new java.lang.Class[] { null });
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        java.lang.Object obj0 = null;
        java.util.Comparator<java.lang.Object> objComparator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.lang.Object> objRange3 = org.apache.commons.lang3.Range.of(obj0, (java.lang.Object) (-1.0d), objComparator2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        java.util.Comparator<java.lang.Object> objComparator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.lang.Object> objRange3 = org.apache.commons.lang3.Range.between((java.lang.Object) 10L, (java.lang.Object) '#', objComparator2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Character cannot be cast to class java.lang.Long (java.lang.Character and java.lang.Long are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaUpper('#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        org.apache.commons.lang3.arch.Processor.Arch arch0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<org.apache.commons.lang3.arch.Processor.Arch> archRange1 = org.apache.commons.lang3.Range.is(arch0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        java.lang.String str3 = org.apache.commons.lang3.RegExUtils.replaceAll("hi!", "", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("hi!", ' ');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        org.apache.commons.lang3.DoubleRange doubleRange2 = org.apache.commons.lang3.DoubleRange.of((double) (byte) 0, (double) (byte) -1);
        org.junit.Assert.assertNotNull(doubleRange2);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rotate("hi!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!h" + "'", str2, "i!h");
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        org.apache.commons.lang3.IntegerRange integerRange2 = org.apache.commons.lang3.IntegerRange.of((int) ' ', (int) (byte) 10);
        org.junit.Assert.assertNotNull(integerRange2);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        boolean[] booleanArray4 = new boolean[] { false, false, true, true };
        char char5 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray4);
        assertBooleanArrayEquals(booleanArray4, new boolean[] { false, false, true, true });
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '3' + "'", char5 == '3');
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("hi!", '#');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
        java.util.Comparator<java.lang.Object> objComparator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.lang.Object> objRange3 = org.apache.commons.lang3.Range.of((java.lang.Object) true, (java.lang.Object) 0.0f, objComparator2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Float cannot be cast to class java.lang.Boolean (java.lang.Float and java.lang.Boolean are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject('#');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '#' + "'", char1 == '#');
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<org.apache.commons.lang3.mutable.MutableFloat> mutableFloatRange1 = org.apache.commons.lang3.Range.is(mutableFloat0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
        java.util.Comparator<java.lang.Object> objComparator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.lang.Object> objRange3 = org.apache.commons.lang3.Range.of((java.lang.Object) 'a', (java.lang.Object) 10, objComparator2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Character (java.lang.Integer and java.lang.Character are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
        java.lang.String str3 = org.apache.commons.lang3.RegExUtils.replaceFirst("", "", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = org.apache.commons.lang3.RegExUtils.replaceFirst((java.lang.CharSequence) "hi!", pattern1, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject("hi!");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'h' + "'", char1 == 'h');
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
        java.lang.String str3 = org.apache.commons.lang3.RegExUtils.replaceAll("hi!", "", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!" + "'", str3, "hi!hhi!ihi!!hi!");
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isOctal(' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
        java.lang.String str2 = org.apache.commons.lang3.RegExUtils.removeFirst("hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
        java.lang.String str2 = org.apache.commons.lang3.RegExUtils.removeAll("", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
        java.util.Comparator<java.lang.Object> objComparator1 = null;
        org.apache.commons.lang3.Range<java.lang.Object> objRange2 = org.apache.commons.lang3.Range.is((java.lang.Object) 100L, objComparator1);
        org.junit.Assert.assertNotNull(objRange2);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replaceIgnoreCase("hi!", "", "hi!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test751");
        java.lang.Object obj0 = null;
        java.util.Comparator<java.lang.Object> objComparator1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.lang.Object> objRange2 = org.apache.commons.lang3.Range.is(obj0, objComparator1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test752");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("hi!", locale1, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Format 'i' not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test753");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replacePattern("", "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test754");
        java.math.BigDecimal bigDecimal0 = null;
        java.math.BigDecimal bigDecimal1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.math.BigDecimal> bigDecimalRange2 = org.apache.commons.lang3.Range.between(bigDecimal0, bigDecimal1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test755");
        char[] charArray4 = new char[] { 'a', '4', '#', '4' };
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isSorted(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test756");
        java.util.Comparator<java.lang.Object> objComparator1 = null;
        org.apache.commons.lang3.Range<java.lang.Object> objRange2 = org.apache.commons.lang3.Range.is((java.lang.Object) 10, objComparator1);
        org.junit.Assert.assertNotNull(objRange2);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test757");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1, 0.0d, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap4 = org.apache.commons.lang3.ArrayUtils.toMap(objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, '1', is neither of type Map.Entry nor an Array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 0.0, 1]");
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test758");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("hi!", strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Format 'i' not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "", "hi!", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test759");
        org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>, org.apache.commons.lang3.text.StrTokenizer> objArraySupplierTriplePair0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>, org.apache.commons.lang3.text.StrTokenizer>> supplierTriplePairRange1 = org.apache.commons.lang3.Range.is(objArraySupplierTriplePair0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test760");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = org.apache.commons.lang3.RegExUtils.replaceAll((java.lang.CharSequence) "hi!", pattern1, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test761");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = org.apache.commons.lang3.RegExUtils.replaceFirst((java.lang.CharSequence) "", pattern1, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test762");
        java.util.Comparator<java.lang.Object> objComparator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.lang.Object> objRange3 = org.apache.commons.lang3.Range.between((java.lang.Object) 100.0d, (java.lang.Object) '4', objComparator2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Character cannot be cast to class java.lang.Double (java.lang.Character and java.lang.Double are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test763");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replacePattern("hi!", "", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!" + "'", str3, "hi!hhi!ihi!!hi!");
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test764");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("", '4');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test765");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (short) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test766");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceFirst("hi!", "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test767");
        org.apache.commons.lang3.tuple.MutableTriple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>> objArraySupplierMutableTriple0 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>> objArraySupplierMutableTriple1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<org.apache.commons.lang3.tuple.MutableTriple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>> objArraySupplierMutableTripleRange2 = org.apache.commons.lang3.Range.of(objArraySupplierMutableTriple0, objArraySupplierMutableTriple1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test768");
        org.apache.commons.lang3.math.Fraction fraction0 = null;
        org.apache.commons.lang3.math.Fraction fraction1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<org.apache.commons.lang3.math.Fraction> fractionRange2 = org.apache.commons.lang3.Range.of(fraction0, fraction1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test769");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isOctal('#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test770");
        java.util.Comparator<java.lang.Object> objComparator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.lang.Object> objRange3 = org.apache.commons.lang3.Range.between((java.lang.Object) (byte) 1, (java.lang.Object) 1.0d, objComparator2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Double cannot be cast to class java.lang.Byte (java.lang.Double and java.lang.Byte are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test771");
        java.util.Comparator<java.lang.Object> objComparator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.lang.Object> objRange3 = org.apache.commons.lang3.Range.of((java.lang.Object) (byte) 0, (java.lang.Object) 100.0d, objComparator2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Double cannot be cast to class java.lang.Byte (java.lang.Double and java.lang.Byte are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test772");
        java.util.Comparator<java.lang.Object> objComparator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.lang.Object> objRange3 = org.apache.commons.lang3.Range.of((java.lang.Object) 0L, (java.lang.Object) 1, objComparator2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Long (java.lang.Integer and java.lang.Long are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test773");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character a is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test774");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.nio.file.Path> pathRange1 = org.apache.commons.lang3.Range.is(path0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test775");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiNumeric('a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test776");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("", ' ');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test777");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 0, "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test778");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAscii(' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test779");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiPrintable('4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test780");
        java.util.Comparator<java.lang.Object> objComparator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.lang.Object> objRange3 = org.apache.commons.lang3.Range.between((java.lang.Object) (-1), (java.lang.Object) (-1.0d), objComparator2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Double cannot be cast to class java.lang.Integer (java.lang.Double and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test781");
        java.util.Comparator<java.lang.Object> objComparator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.lang.Object> objRange3 = org.apache.commons.lang3.Range.of((java.lang.Object) ' ', (java.lang.Object) (-1.0f), objComparator2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Float cannot be cast to class java.lang.Character (java.lang.Float and java.lang.Character are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test782");
        org.apache.commons.lang3.DoubleRange doubleRange2 = org.apache.commons.lang3.DoubleRange.of((double) (byte) 0, (double) 100L);
        org.junit.Assert.assertNotNull(doubleRange2);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test783");
        java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC(0L, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test784");
        java.util.Date date0 = null;
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format(date0, "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test785");
        java.time.ZonedDateTime zonedDateTime0 = null;
        java.time.ZonedDateTime zonedDateTime1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.time.ZonedDateTime> zonedDateTimeRange2 = org.apache.commons.lang3.Range.of(zonedDateTime0, zonedDateTime1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test786");
        int int2 = org.apache.commons.lang3.CharUtils.compare('a', '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 45 + "'", int2 == 45);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test787");
        java.util.Comparator<java.lang.Object> objComparator1 = null;
        org.apache.commons.lang3.Range<java.lang.Object> objRange2 = org.apache.commons.lang3.Range.is((java.lang.Object) 1.0d, objComparator1);
        org.junit.Assert.assertNotNull(objRange2);
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test788");
        short[] shortArray5 = new short[] { (short) 1, (short) 1, (byte) 10, (short) 1, (byte) 1 };
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 1, (short) 1, (short) 10, (short) 1, (short) 1 });
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test789");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '4', '#');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test790");
        org.apache.commons.lang3.Range<java.lang.String> strRange2 = org.apache.commons.lang3.Range.between("", "hi!");
        org.junit.Assert.assertNotNull(strRange2);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test791");
        double[] doubleArray5 = new double[] { 100.0d, (-1L), 10, (byte) 10, (short) 0 };
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, 0.0d, (int) (short) -1);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, (-1.0d), 10.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test792");
        java.util.Comparator<java.lang.Object> objComparator1 = null;
        org.apache.commons.lang3.Range<java.lang.Object> objRange2 = org.apache.commons.lang3.Range.is((java.lang.Object) 100.0d, objComparator1);
        org.junit.Assert.assertNotNull(objRange2);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test793");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) (short) 100, (int) (short) 0, "hi!", (int) '#', 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test794");
        java.util.Comparator<java.lang.Object> objComparator2 = null;
        org.apache.commons.lang3.Range<java.lang.Object> objRange3 = org.apache.commons.lang3.Range.of((java.lang.Object) 100, (java.lang.Object) (-1), objComparator2);
        org.junit.Assert.assertNotNull(objRange3);
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test795");
        org.apache.commons.lang3.function.FailableToLongFunction<org.apache.commons.lang3.text.translate.CharSequenceTranslator, org.apache.commons.lang3.exception.ContextedRuntimeException> charSequenceTranslatorFailableToLongFunction0 = org.apache.commons.lang3.function.FailableToLongFunction.nop();
        org.junit.Assert.assertNotNull(charSequenceTranslatorFailableToLongFunction0);
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test796");
        java.time.chrono.ChronoLocalDate chronoLocalDate0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.time.chrono.ChronoLocalDate> chronoLocalDateRange1 = org.apache.commons.lang3.Range.is(chronoLocalDate0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test797");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str2 = org.apache.commons.lang3.RegExUtils.removeFirst((java.lang.CharSequence) "hi!", pattern1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test798");
        java.lang.String str2 = org.apache.commons.lang3.RegExUtils.removePattern((java.lang.CharSequence) "", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test799");
        java.util.Comparator<java.lang.Object> objComparator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.lang.Object> objRange3 = org.apache.commons.lang3.Range.of((java.lang.Object) (byte) 10, (java.lang.Object) 0, objComparator2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Byte (java.lang.Integer and java.lang.Byte are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test800");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString((java.lang.Character) ' ');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " " + "'", str1, " ");
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test801");
        java.util.Comparator<java.lang.Object> objComparator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.lang.Object> objRange3 = org.apache.commons.lang3.Range.between((java.lang.Object) "hi!", (java.lang.Object) 1.0d, objComparator2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Double cannot be cast to class java.lang.String (java.lang.Double and java.lang.String are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test802");
        org.apache.commons.lang3.LongRange longRange2 = org.apache.commons.lang3.LongRange.of((long) 0, (long) (byte) -1);
        org.junit.Assert.assertNotNull(longRange2);
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test803");
        org.apache.commons.lang3.function.FailableFunction<org.apache.commons.lang3.NumberRange<java.lang.Integer>, org.apache.commons.lang3.tuple.ImmutableTriple[], org.apache.commons.lang3.exception.UncheckedInterruptedException> intNumberRangeFailableFunction0 = org.apache.commons.lang3.function.FailableFunction.nop();
        org.junit.Assert.assertNotNull(intNumberRangeFailableFunction0);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test804");
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>, org.apache.commons.lang3.text.StrTokenizer> objArraySupplierTripleImmutablePair0 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>, org.apache.commons.lang3.text.StrTokenizer> objArraySupplierTripleImmutablePair1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>, org.apache.commons.lang3.text.StrTokenizer>> supplierTripleImmutablePairRange2 = org.apache.commons.lang3.Range.between(objArraySupplierTripleImmutablePair0, objArraySupplierTripleImmutablePair1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test805");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiPrintable(' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test806");
        java.util.Comparator<java.lang.Object> objComparator1 = null;
        org.apache.commons.lang3.Range<java.lang.Object> objRange2 = org.apache.commons.lang3.Range.is((java.lang.Object) (short) 1, objComparator1);
        org.junit.Assert.assertNotNull(objRange2);
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test807");
        char[] charArray5 = new char[] { ' ', 'a', '4', '4', '4' };
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.contains(charArray5, '4');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', 'a', '4', '4', '4' });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test808");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceFirst("", "", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test809");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = null;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION> oPTIONRange2 = org.apache.commons.lang3.Range.of(oPTION0, oPTION1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test810");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiNumeric('4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test811");
        java.util.Comparator<java.lang.Object> objComparator1 = null;
        org.apache.commons.lang3.Range<java.lang.Object> objRange2 = org.apache.commons.lang3.Range.is((java.lang.Object) "", objComparator1);
        org.junit.Assert.assertNotNull(objRange2);
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test812");
        int[] intArray5 = new int[] { ' ', (byte) 1, (byte) 10, (short) 1, (byte) 1 };
        java.util.stream.IntStream intStream6 = org.apache.commons.lang3.stream.IntStreams.of(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 1, 1 });
        org.junit.Assert.assertNotNull(intStream6);
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test813");
        java.util.Comparator<java.lang.Object> objComparator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.lang.Object> objRange3 = org.apache.commons.lang3.Range.of((java.lang.Object) (byte) 10, (java.lang.Object) 100.0f, objComparator2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Float cannot be cast to class java.lang.Byte (java.lang.Float and java.lang.Byte are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test814");
        org.apache.commons.lang3.DoubleRange doubleRange2 = org.apache.commons.lang3.DoubleRange.of((double) (short) 10, 1.0d);
        org.junit.Assert.assertNotNull(doubleRange2);
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test815");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: field");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test816");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeFirst("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test817");
        org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>> objArraySupplierTriple0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>> objArraySupplierTripleRange1 = org.apache.commons.lang3.Range.is(objArraySupplierTriple0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test818");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiNumeric(' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test819");
        java.util.Comparator<java.lang.Object> objComparator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.lang.Object> objRange3 = org.apache.commons.lang3.Range.of((java.lang.Object) '#', (java.lang.Object) 100, objComparator2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Character (java.lang.Integer and java.lang.Character are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test820");
        org.apache.commons.lang3.Range<java.lang.String> strRange2 = org.apache.commons.lang3.Range.between("", "hi!");
        org.junit.Assert.assertNotNull(strRange2);
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test821");
        byte[] byteArray0 = new byte[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray0, (byte) 0, (-1));
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test822");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("", '#');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test823");
        org.apache.commons.lang3.IntegerRange integerRange2 = org.apache.commons.lang3.IntegerRange.of((java.lang.Integer) 10, (java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(integerRange2);
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test824");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ExceptionContext exceptionContext2 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("hi!", throwable1, exceptionContext2);
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test825");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceAll("hi!", "hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test826");
        java.util.Calendar calendar0 = null;
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(calendar0, "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test827");
        org.apache.commons.lang3.LongRange longRange2 = org.apache.commons.lang3.LongRange.of((long) (short) 1, (long) ' ');
        org.junit.Assert.assertNotNull(longRange2);
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test828");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test829");
        java.util.Comparator<java.lang.Object> objComparator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.lang.Object> objRange3 = org.apache.commons.lang3.Range.between((java.lang.Object) 10.0f, (java.lang.Object) (short) -1, objComparator2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Short cannot be cast to class java.lang.Float (java.lang.Short and java.lang.Float are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test830");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = org.apache.commons.lang3.RegExUtils.replaceFirst("hi!", pattern1, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test831");
        java.time.LocalDate localDate0 = null;
        java.time.LocalDate localDate1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.time.LocalDate> localDateRange2 = org.apache.commons.lang3.Range.of(localDate0, localDate1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test832");
        java.util.Comparator<java.lang.Object> objComparator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.lang.Object> objRange3 = org.apache.commons.lang3.Range.between((java.lang.Object) 1.0d, (java.lang.Object) 100.0f, objComparator2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Float cannot be cast to class java.lang.Double (java.lang.Float and java.lang.Double are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test833");
        java.util.Comparator<java.lang.Object> objComparator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.lang.Object> objRange3 = org.apache.commons.lang3.Range.of((java.lang.Object) 100.0d, (java.lang.Object) '#', objComparator2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Character cannot be cast to class java.lang.Double (java.lang.Character and java.lang.Double are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test834");
        java.util.Comparator<java.lang.Object> objComparator1 = null;
        org.apache.commons.lang3.Range<java.lang.Object> objRange2 = org.apache.commons.lang3.Range.is((java.lang.Object) (-1), objComparator1);
        org.junit.Assert.assertNotNull(objRange2);
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test835");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) true, (int) '#', (int) (short) 0, 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test836");
        java.util.Comparator<java.lang.Object> objComparator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.lang.Object> objRange3 = org.apache.commons.lang3.Range.between((java.lang.Object) 100.0d, (java.lang.Object) 1.0f, objComparator2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Float cannot be cast to class java.lang.Double (java.lang.Float and java.lang.Double are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test837");
        org.apache.commons.lang3.arch.Processor.Type type0 = null;
        org.apache.commons.lang3.arch.Processor.Type type1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<org.apache.commons.lang3.arch.Processor.Type> typeRange2 = org.apache.commons.lang3.Range.of(type0, type1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test838");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 100, "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test839");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str2 = org.apache.commons.lang3.RegExUtils.removeFirst("hi!", pattern1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test840");
        java.util.Comparator<java.lang.Object> objComparator1 = null;
        org.apache.commons.lang3.Range<java.lang.Object> objRange2 = org.apache.commons.lang3.Range.is((java.lang.Object) 'a', objComparator1);
        org.junit.Assert.assertNotNull(objRange2);
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test841");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test842");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) -1, "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test843");
        org.apache.commons.lang3.DoubleRange doubleRange2 = org.apache.commons.lang3.DoubleRange.of((java.lang.Double) 0.0d, (java.lang.Double) 10.0d);
        org.junit.Assert.assertNotNull(doubleRange2);
    }

    @Test
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test844");
        org.apache.commons.lang3.concurrent.locks.LockingVisitors.StampedLockVisitor.Builder<java.math.BigDecimal[]> bigDecimalArrayBuilder0 = new org.apache.commons.lang3.concurrent.locks.LockingVisitors.StampedLockVisitor.Builder<java.math.BigDecimal[]>();
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test845");
        java.util.Comparator<java.lang.Object> objComparator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.lang.Object> objRange3 = org.apache.commons.lang3.Range.between((java.lang.Object) 1.0d, (java.lang.Object) (byte) 100, objComparator2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Byte cannot be cast to class java.lang.Double (java.lang.Byte and java.lang.Double are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test846");
        org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>> objArraySupplierTriple0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>> objArraySupplierTripleRange1 = org.apache.commons.lang3.Range.is(objArraySupplierTriple0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test847");
        char[] charArray6 = new char[] { '4', 'a', '4', ' ', '4', '4' };
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isSorted(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', 'a', '4', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test848");
        java.lang.String str2 = org.apache.commons.lang3.RegExUtils.removeAll("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test849");
        org.apache.commons.lang3.LongRange longRange2 = org.apache.commons.lang3.LongRange.of((long) (short) 10, (long) '4');
        org.junit.Assert.assertNotNull(longRange2);
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test850");
        // The following exception was thrown during execution in test generation
        try {
            float float2 = org.apache.commons.lang3.RandomUtils.nextFloat((float) 10L, (float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Start value must be smaller or equal to end value.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test851");
        org.apache.commons.lang3.IntegerRange integerRange2 = org.apache.commons.lang3.IntegerRange.of((int) (short) 10, 100);
        org.junit.Assert.assertNotNull(integerRange2);
    }

    @Test
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test852");
        boolean[] booleanArray5 = new boolean[] { true, false, true, true, true };
        java.util.Random random6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ArrayUtils.shuffle(booleanArray5, random6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        assertBooleanArrayEquals(booleanArray5, new boolean[] { true, false, true, true, true });
    }

    @Test
    public void test853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test853");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlpha(' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test854");
        java.util.Comparator<java.lang.Object> objComparator1 = null;
        org.apache.commons.lang3.Range<java.lang.Object> objRange2 = org.apache.commons.lang3.Range.is((java.lang.Object) 0.0d, objComparator1);
        org.junit.Assert.assertNotNull(objRange2);
    }

    @Test
    public void test855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test855");
        java.lang.String str1 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (short) 100);
    }

    @Test
    public void test856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test856");
        org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>, org.apache.commons.lang3.text.StrTokenizer> objArraySupplierTriplePair0 = null;
        org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>, org.apache.commons.lang3.text.StrTokenizer> objArraySupplierTriplePair1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>, org.apache.commons.lang3.text.StrTokenizer>> supplierTriplePairRange2 = org.apache.commons.lang3.Range.of(objArraySupplierTriplePair0, objArraySupplierTriplePair1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test857");
        org.apache.commons.lang3.IntegerRange integerRange2 = org.apache.commons.lang3.IntegerRange.of((java.lang.Integer) (-1), (java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(integerRange2);
    }

    @Test
    public void test858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test858");
        double[] doubleArray6 = new double[] { (-1L), 1.0d, 10.0d, 10, (short) 10, 10.0d };
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray6, (double) 0.0f, (int) (short) 0, (double) (short) -1);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 1.0d, 10.0d, 10.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test859");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceAll("hi!", "", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test860");
        java.lang.String str3 = org.apache.commons.lang3.RegExUtils.replaceAll("", "hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test861");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject('4');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '4' + "'", char1 == '4');
    }

    @Test
    public void test862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test862");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString('4');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4" + "'", str1, "4");
    }

    @Test
    public void test863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test863");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = org.apache.commons.lang3.RegExUtils.replaceAll((java.lang.CharSequence) "", pattern1, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test864");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("hi!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test865");
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>, org.apache.commons.lang3.text.StrTokenizer> objArraySupplierTripleMutablePair0 = null;
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>, org.apache.commons.lang3.text.StrTokenizer> objArraySupplierTripleMutablePair1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>, org.apache.commons.lang3.text.StrTokenizer>> supplierTripleMutablePairRange2 = org.apache.commons.lang3.Range.of(objArraySupplierTripleMutablePair0, objArraySupplierTripleMutablePair1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test866");
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>, org.apache.commons.lang3.text.StrTokenizer> objArraySupplierTripleMutablePair0 = null;
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>, org.apache.commons.lang3.text.StrTokenizer> objArraySupplierTripleMutablePair1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>, org.apache.commons.lang3.text.StrTokenizer>> supplierTripleMutablePairRange2 = org.apache.commons.lang3.Range.between(objArraySupplierTripleMutablePair0, objArraySupplierTripleMutablePair1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test867");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (byte) 100, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test868");
        java.util.Comparator<java.lang.Object> objComparator1 = null;
        org.apache.commons.lang3.Range<java.lang.Object> objRange2 = org.apache.commons.lang3.Range.is((java.lang.Object) (-1L), objComparator1);
        org.junit.Assert.assertNotNull(objRange2);
    }

    @Test
    public void test869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test869");
        java.util.function.Supplier<java.nio.file.Path> pathSupplier1 = null;
        java.nio.file.Path path2 = org.apache.commons.lang3.SystemProperties.getPath("", pathSupplier1);
        org.junit.Assert.assertNull(path2);
    }

    @Test
    public void test870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test870");
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>, org.apache.commons.lang3.text.StrTokenizer> objArraySupplierTripleImmutablePair0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>, org.apache.commons.lang3.text.StrTokenizer>> supplierTripleImmutablePairRange1 = org.apache.commons.lang3.Range.is(objArraySupplierTripleImmutablePair0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test871");
        java.util.Comparator<java.lang.Object> objComparator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.lang.Object> objRange3 = org.apache.commons.lang3.Range.between((java.lang.Object) (short) 100, (java.lang.Object) 100.0f, objComparator2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Float cannot be cast to class java.lang.Short (java.lang.Float and java.lang.Short are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test872");
        java.lang.String str3 = org.apache.commons.lang3.RegExUtils.replacePattern("hi!", "", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test873");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.util.stream.Collector<java.lang.Object, ?, java.lang.String>, org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>, java.lang.RuntimeException> objCollectorImmutableTriple0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<org.apache.commons.lang3.tuple.ImmutableTriple<java.util.stream.Collector<java.lang.Object, ?, java.lang.String>, org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>, java.lang.RuntimeException>> objCollectorImmutableTripleRange1 = org.apache.commons.lang3.Range.is(objCollectorImmutableTriple0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test874");
        java.lang.String str2 = org.apache.commons.lang3.RegExUtils.removeFirst("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test875");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format(0L, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test876");
        java.util.Comparator<java.lang.Object> objComparator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.lang.Object> objRange3 = org.apache.commons.lang3.Range.between((java.lang.Object) 100L, (java.lang.Object) "hi!", objComparator2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.lang.Long (java.lang.String and java.lang.Long are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test877");
        java.util.Comparator<java.lang.Integer> intComparator2 = null;
        org.apache.commons.lang3.NumberRange<java.lang.Integer> intNumberRange3 = new org.apache.commons.lang3.NumberRange<java.lang.Integer>((java.lang.Integer) 1, (java.lang.Integer) 0, intComparator2);
    }

    @Test
    public void test878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test878");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { (-1.0d), (-1.0d) };
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new java.lang.Double[] { (-1.0d), (-1.0d) });
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test879");
        org.apache.commons.lang3.DoubleRange doubleRange2 = org.apache.commons.lang3.DoubleRange.of(0.0d, (double) 100.0f);
        org.junit.Assert.assertNotNull(doubleRange2);
    }

    @Test
    public void test880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test880");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.add(byteArray1, (int) (short) -1, (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1 });
    }

    @Test
    public void test881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test881");
        java.util.Comparator<java.lang.Object> objComparator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.lang.Object> objRange3 = org.apache.commons.lang3.Range.of((java.lang.Object) 10.0f, (java.lang.Object) 10.0d, objComparator2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Double cannot be cast to class java.lang.Float (java.lang.Double and java.lang.Float are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test882");
        int int2 = org.apache.commons.lang3.CharUtils.compare('#', '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test883");
        java.util.Comparator<java.lang.Object> objComparator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.lang.Object> objRange3 = org.apache.commons.lang3.Range.of((java.lang.Object) 0.0d, (java.lang.Object) true, objComparator2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Boolean cannot be cast to class java.lang.Double (java.lang.Boolean and java.lang.Double are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test884");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("hi!", strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Format 'i' not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "hi!", "hi!" });
    }

    @Test
    public void test885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test885");
        java.lang.String str3 = org.apache.commons.lang3.RegExUtils.replacePattern("hi!", "", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!" + "'", str3, "hi!hhi!ihi!!hi!");
    }

    @Test
    public void test886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test886");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("hi!", locale1, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Format 'i' not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" });
    }

    @Test
    public void test887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test887");
        org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>, org.apache.commons.lang3.text.StrTokenizer> objArraySupplierTriplePair0 = null;
        org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>, org.apache.commons.lang3.text.StrTokenizer> objArraySupplierTriplePair1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>, org.apache.commons.lang3.text.StrTokenizer>> supplierTriplePairRange2 = org.apache.commons.lang3.Range.of(objArraySupplierTriplePair0, objArraySupplierTriplePair1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test888");
        java.time.ZonedDateTime zonedDateTime0 = null;
        java.time.ZonedDateTime zonedDateTime1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.time.ZonedDateTime> zonedDateTimeRange2 = org.apache.commons.lang3.Range.between(zonedDateTime0, zonedDateTime1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test889");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replacePattern("hi!", "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test890");
        java.lang.Object obj0 = null;
        java.util.Comparator<java.lang.Object> objComparator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.lang.Object> objRange3 = org.apache.commons.lang3.Range.between(obj0, (java.lang.Object) (-1.0d), objComparator2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test891");
        org.apache.commons.lang3.arch.Processor.Type type0 = null;
        org.apache.commons.lang3.arch.Processor.Type type1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<org.apache.commons.lang3.arch.Processor.Type> typeRange2 = org.apache.commons.lang3.Range.of(type0, type1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test892");
        java.lang.String str2 = org.apache.commons.lang3.RegExUtils.removePattern((java.lang.CharSequence) "hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test893");
        java.util.Comparator<java.lang.Object> objComparator1 = null;
        org.apache.commons.lang3.Range<java.lang.Object> objRange2 = org.apache.commons.lang3.Range.is((java.lang.Object) 100.0f, objComparator1);
        org.junit.Assert.assertNotNull(objRange2);
    }

    @Test
    public void test894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test894");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) -1);
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
    }

    @Test
    public void test895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test895");
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>, org.apache.commons.lang3.text.StrTokenizer> objArraySupplierTripleImmutablePair0 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>, org.apache.commons.lang3.text.StrTokenizer> objArraySupplierTripleImmutablePair1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>, org.apache.commons.lang3.text.StrTokenizer>> supplierTripleImmutablePairRange2 = org.apache.commons.lang3.Range.between(objArraySupplierTripleImmutablePair0, objArraySupplierTripleImmutablePair1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test896");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.io.File> fileRange1 = org.apache.commons.lang3.Range.is(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test897");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Format 'i' not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "", "", "hi!", "hi!" });
    }

    @Test
    public void test898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test898");
        java.nio.file.Path path0 = null;
        java.nio.file.Path path1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.nio.file.Path> pathRange2 = org.apache.commons.lang3.Range.between(path0, path1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test899");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<org.apache.commons.lang3.mutable.MutableShort> mutableShortRange1 = org.apache.commons.lang3.Range.is(mutableShort0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test900");
        char char1 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '#');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '#' + "'", char1 == '#');
    }

    @Test
    public void test901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test901");
        char[] charArray2 = new char[] { '4', '4' };
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isSorted(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', '4' });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test902");
        org.apache.commons.lang3.LongRange longRange2 = org.apache.commons.lang3.LongRange.of((java.lang.Long) (-1L), (java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(longRange2);
    }

    @Test
    public void test903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test903");
        java.lang.Object obj0 = null;
        boolean boolean3 = org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(obj0, (java.lang.Object) 100.0f, false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test904");
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>, org.apache.commons.lang3.text.StrTokenizer> objArraySupplierTripleMutablePair0 = null;
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>, org.apache.commons.lang3.text.StrTokenizer> objArraySupplierTripleMutablePair1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>, org.apache.commons.lang3.text.StrTokenizer>> supplierTripleMutablePairRange2 = org.apache.commons.lang3.Range.of(objArraySupplierTripleMutablePair0, objArraySupplierTripleMutablePair1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test905");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeAll("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test906");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str2 = org.apache.commons.lang3.RegExUtils.removeAll("", pattern1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test907");
        org.apache.commons.lang3.IntegerRange integerRange2 = org.apache.commons.lang3.IntegerRange.of((java.lang.Integer) 0, (java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(integerRange2);
    }

    @Test
    public void test908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test908");
        boolean[] booleanArray5 = new boolean[] { false, true, true, true, true };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        org.junit.Assert.assertNotNull(booleanArray5);
        assertBooleanArrayEquals(booleanArray5, new boolean[] { false, true, true, true, true });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test909");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removePattern("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test910");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.nio.file.Path> pathRange1 = org.apache.commons.lang3.Range.is(path0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test911");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = org.apache.commons.lang3.RegExUtils.replaceFirst("hi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test912");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 'a', "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test913");
        org.apache.commons.lang3.DoubleRange doubleRange2 = org.apache.commons.lang3.DoubleRange.of(1.0d, (double) 10L);
        org.junit.Assert.assertNotNull(doubleRange2);
    }

    @Test
    public void test914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test914");
        org.apache.commons.lang3.concurrent.AtomicInitializer<org.apache.commons.lang3.mutable.MutableLong> mutableLongAtomicInitializer0 = new org.apache.commons.lang3.concurrent.AtomicInitializer<org.apache.commons.lang3.mutable.MutableLong>();
    }

    @Test
    public void test915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test915");
        java.util.Comparator<java.lang.Object> objComparator1 = null;
        org.apache.commons.lang3.Range<java.lang.Object> objRange2 = org.apache.commons.lang3.Range.is((java.lang.Object) (short) -1, objComparator1);
        org.junit.Assert.assertNotNull(objRange2);
    }

    @Test
    public void test916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test916");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 1, (short) 100, (short) 1, '4', 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod((java.lang.Object) (byte) 0, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: No method: java.lang.Byte.(java.lang.Byte, java.lang.Short, java.lang.Short, java.lang.Character, java.lang.Double)");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100, 1, 4, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100, 1, 4, 0.0]");
    }

    @Test
    public void test917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test917");
        java.lang.String str2 = org.apache.commons.lang3.RegExUtils.removePattern((java.lang.CharSequence) "", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test918");
        java.util.Comparator<java.lang.Object> objComparator1 = null;
        org.apache.commons.lang3.Range<java.lang.Object> objRange2 = org.apache.commons.lang3.Range.is((java.lang.Object) ' ', objComparator1);
        org.junit.Assert.assertNotNull(objRange2);
    }

    @Test
    public void test919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test919");
        org.apache.commons.lang3.text.translate.JavaUnicodeEscaper javaUnicodeEscaper2 = org.apache.commons.lang3.text.translate.JavaUnicodeEscaper.outsideOf((int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertNotNull(javaUnicodeEscaper2);
    }

    @Test
    public void test920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test920");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isHex('a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test921");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString((java.lang.Character) '#');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#" + "'", str1, "#");
    }

    @Test
    public void test922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test922");
        java.time.ZonedDateTime zonedDateTime0 = null;
        java.time.ZonedDateTime zonedDateTime1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.time.ZonedDateTime> zonedDateTimeRange2 = org.apache.commons.lang3.Range.between(zonedDateTime0, zonedDateTime1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test923");
        java.util.Comparator<java.lang.Object> objComparator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.lang.Object> objRange3 = org.apache.commons.lang3.Range.of((java.lang.Object) 'a', (java.lang.Object) 100L, objComparator2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Long cannot be cast to class java.lang.Character (java.lang.Long and java.lang.Character are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test924");
        java.util.Comparator<java.lang.Object> objComparator1 = null;
        org.apache.commons.lang3.Range<java.lang.Object> objRange2 = org.apache.commons.lang3.Range.is((java.lang.Object) true, objComparator1);
        org.junit.Assert.assertNotNull(objRange2);
    }

    @Test
    public void test925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test925");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) 0.0d, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not find ceiling of for type: class java.lang.Double");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test926");
        java.lang.Object obj0 = null;
        java.util.Comparator<java.lang.Object> objComparator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.lang.Object> objRange3 = org.apache.commons.lang3.Range.between(obj0, (java.lang.Object) 0, objComparator2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test927");
        java.lang.Object obj1 = null;
        java.util.Comparator<java.lang.Object> objComparator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.lang.Object> objRange3 = org.apache.commons.lang3.Range.between((java.lang.Object) '4', obj1, objComparator2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element2");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test928");
        org.apache.commons.lang3.ClassUtils.Interfaces interfaces0 = null;
        org.apache.commons.lang3.ClassUtils.Interfaces interfaces1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<org.apache.commons.lang3.ClassUtils.Interfaces> interfacesRange2 = org.apache.commons.lang3.Range.of(interfaces0, interfaces1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test929");
        org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>, org.apache.commons.lang3.text.StrTokenizer> objArraySupplierTriplePair0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>, org.apache.commons.lang3.text.StrTokenizer>> supplierTriplePairRange1 = org.apache.commons.lang3.Range.is(objArraySupplierTriplePair0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test930");
        org.apache.commons.lang3.DoubleRange doubleRange2 = org.apache.commons.lang3.DoubleRange.of((double) (byte) -1, (double) 10.0f);
        org.junit.Assert.assertNotNull(doubleRange2);
    }

    @Test
    public void test931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test931");
        short[] shortArray2 = new short[] { (short) 1, (byte) 100 };
        java.util.BitSet bitSet5 = org.apache.commons.lang3.ArrayUtils.indexesOf(shortArray2, (short) 0, (int) (short) 10);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] { (short) 1, (short) 100 });
        org.junit.Assert.assertNotNull(bitSet5);
        org.junit.Assert.assertEquals(bitSet5.toString(), "{}");
    }

    @Test
    public void test932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test932");
        org.apache.commons.lang3.tuple.MutableTriple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>> objArraySupplierMutableTriple0 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>> objArraySupplierMutableTriple1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<org.apache.commons.lang3.tuple.MutableTriple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>> objArraySupplierMutableTripleRange2 = org.apache.commons.lang3.Range.of(objArraySupplierMutableTriple0, objArraySupplierMutableTriple1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test933");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceAll("", "hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test934");
        int int2 = org.apache.commons.lang3.CharUtils.compare(' ', '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test935");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = null;
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<org.apache.commons.lang3.mutable.MutableBoolean> mutableBooleanRange2 = org.apache.commons.lang3.Range.of(mutableBoolean0, mutableBoolean1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test936");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeFirst("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test937");
        java.time.Duration duration0 = null;
        java.time.Duration duration1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.time.Duration> durationRange2 = org.apache.commons.lang3.Range.between(duration0, duration1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test938");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format(0L, "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test939");
        org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>, org.apache.commons.lang3.text.StrTokenizer> objArraySupplierTriplePair0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>, org.apache.commons.lang3.text.StrTokenizer>> supplierTriplePairRange1 = org.apache.commons.lang3.Range.is(objArraySupplierTriplePair0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test940");
        org.apache.commons.lang3.math.Fraction fraction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<org.apache.commons.lang3.math.Fraction> fractionRange1 = org.apache.commons.lang3.Range.is(fraction0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test941");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Format 'i' not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test942");
        java.lang.String str3 = org.apache.commons.lang3.RegExUtils.replacePattern((java.lang.CharSequence) "hi!", "", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!" + "'", str3, "hi!hhi!ihi!!hi!");
    }

    @Test
    public void test943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test943");
        org.apache.commons.lang3.LongRange longRange2 = org.apache.commons.lang3.LongRange.of((java.lang.Long) (-1L), (java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(longRange2);
    }

    @Test
    public void test944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test944");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("hi!", strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Format 'i' not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test945");
        org.apache.commons.lang3.LongRange longRange2 = org.apache.commons.lang3.LongRange.of((java.lang.Long) 10L, (java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(longRange2);
    }

    @Test
    public void test946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test946");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = org.apache.commons.lang3.ArrayFill.fill(doubleArray0, (double) (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
    }

    @Test
    public void test947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test947");
        java.util.Comparator<java.lang.Object> objComparator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.lang.Object> objRange3 = org.apache.commons.lang3.Range.between((java.lang.Object) (short) 100, (java.lang.Object) false, objComparator2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Boolean cannot be cast to class java.lang.Short (java.lang.Boolean and java.lang.Short are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test948");
        java.util.Comparator<java.lang.Object> objComparator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.lang.Object> objRange3 = org.apache.commons.lang3.Range.of((java.lang.Object) 10, (java.lang.Object) 100.0d, objComparator2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Double cannot be cast to class java.lang.Integer (java.lang.Double and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test949");
        java.util.Comparator<java.lang.Object> objComparator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<java.lang.Object> objRange3 = org.apache.commons.lang3.Range.of((java.lang.Object) (byte) 100, (java.lang.Object) 0.0f, objComparator2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Float cannot be cast to class java.lang.Byte (java.lang.Float and java.lang.Byte are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test950");
        java.lang.String str2 = org.apache.commons.lang3.RegExUtils.removePattern("hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test951");
        org.apache.commons.lang3.LongRange longRange2 = org.apache.commons.lang3.LongRange.of((long) (byte) 100, (long) (byte) 1);
        org.junit.Assert.assertNotNull(longRange2);
    }

    @Test
    public void test952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test952");
        char[] charArray0 = new char[] {};
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray0, '4');
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new char[] {});
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
    }

    @Test
    public void test953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test953");
        char[] charArray3 = new char[] { '#', ' ', '#' };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isSorted(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] { '#', ' ', '#' });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test954");
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>, org.apache.commons.lang3.text.StrTokenizer> objArraySupplierTripleImmutablePair0 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>, org.apache.commons.lang3.text.StrTokenizer> objArraySupplierTripleImmutablePair1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Range<org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Triple<java.util.function.Supplier<java.lang.Object[]>, java.lang.Enum<org.apache.commons.lang3.JavaVersion>, java.util.List<java.lang.String>>, org.apache.commons.lang3.text.StrTokenizer>> supplierTripleImmutablePairRange2 = org.apache.commons.lang3.Range.between(objArraySupplierTripleImmutablePair0, objArraySupplierTripleImmutablePair1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: element1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test955");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removePattern("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test956");
        java.lang.Character char1 = org.apache.commons.lang3.CharUtils.toCharacterObject(' ');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ' ' + "'", char1 == ' ');
    }

    @Test
    public void test957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test957");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test958");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test959");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }
}

