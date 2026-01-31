import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

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
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredStaticField(mutableLongClass27, "null", (java.lang.Object) "java.rmi.server.codebase");
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.apache.commons.lang3.IntegerRange integerRange2 = org.apache.commons.lang3.IntegerRange.of((int) '#', (int) (byte) 1);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder3 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) '#');
        int[] intArray8 = new int[] { '4', '4', (byte) -1 };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray8, '#');
        int[] intArray16 = new int[] { (short) 0, (short) 1, (short) 10, (short) 100, 1 };
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray16, '4');
        int[] intArray19 = org.apache.commons.lang3.ArrayUtils.removeElements(intArray8, intArray16);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder20 = reflectionToStringBuilder3.append("false", intArray8);
        float[] floatArray28 = new float[] { 'a', ' ', (-1), (short) 1, (byte) 10, (byte) 1 };
        float float29 = org.apache.commons.lang3.math.NumberUtils.min(floatArray28);
        float[] floatArray30 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray28);
        java.util.BitSet bitSet33 = org.apache.commons.lang3.ArrayUtils.indexesOf(floatArray30, (float) 100, 5);
        float float34 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray30);
        int int36 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray30, (float) 4);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder38 = reflectionToStringBuilder3.append("java.nio.channels.spi.AsynchronousChannelProvider", floatArray30, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray39 = reflectionToStringBuilder3.getIncludeFieldNames();
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
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
        java.lang.Class<?> wildcardClass28 = org.apache.commons.lang3.ClassUtils.primitiveToWrapper(mutableLongClass27);
        java.lang.String str30 = org.apache.commons.lang3.ClassUtils.getSimpleName(mutableLongClass27, "Java Platform API Specification");
        org.apache.commons.lang3.mutable.MutableLong mutableLong32 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 2);
        float float33 = mutableLong32.floatValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong35 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 2);
        int int36 = mutableLong32.compareTo(mutableLong35);
        org.apache.commons.lang3.mutable.MutableLong mutableLong38 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 2);
        int int39 = mutableLong38.intValue();
        org.apache.commons.lang3.Range<org.apache.commons.lang3.mutable.MutableLong> mutableLongRange40 = org.apache.commons.lang3.Range.is(mutableLong38);
        mutableLong38.increment();
        org.apache.commons.lang3.mutable.MutableLong mutableLong43 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 2);
        int int44 = mutableLong43.intValue();
        org.apache.commons.lang3.Range<org.apache.commons.lang3.mutable.MutableLong> mutableLongRange45 = org.apache.commons.lang3.Range.is(mutableLong43);
        org.apache.commons.lang3.mutable.MutableLong mutableLong47 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 2);
        float float48 = mutableLong47.floatValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong50 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 2);
        int int51 = mutableLong50.intValue();
        org.apache.commons.lang3.Range<org.apache.commons.lang3.mutable.MutableLong> mutableLongRange52 = org.apache.commons.lang3.Range.is(mutableLong50);
        org.apache.commons.lang3.mutable.MutableLong mutableLong54 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 2);
        int int55 = mutableLong54.intValue();
        org.apache.commons.lang3.Range<org.apache.commons.lang3.mutable.MutableLong> mutableLongRange56 = org.apache.commons.lang3.Range.is(mutableLong54);
        org.apache.commons.lang3.mutable.MutableLong[] mutableLongArray57 = new org.apache.commons.lang3.mutable.MutableLong[] { mutableLong35, mutableLong38, mutableLong43, mutableLong47, mutableLong50, mutableLong54 };
        java.lang.Class<org.apache.commons.lang3.mutable.MutableLong> mutableLongClass58 = org.apache.commons.lang3.ArrayUtils.getComponentType(mutableLongArray57);
        java.lang.Class<?> wildcardClass59 = org.apache.commons.lang3.ClassUtils.primitiveToWrapper(mutableLongClass58);
        java.util.stream.Stream<org.apache.commons.lang3.mutable.MutableLong> mutableLongStream60 = org.apache.commons.lang3.EnumUtils.stream(mutableLongClass58);
        java.lang.String str62 = org.apache.commons.lang3.ClassPathUtils.toFullyQualifiedPath(mutableLongClass58, "org.apache.commons.lang3.mutable");
        boolean boolean63 = org.apache.commons.lang3.ClassUtils.isAssignable(mutableLongClass27, mutableLongClass58);
        byte[] byteArray69 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) -1 };
        byte[] byteArray76 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 1, (byte) 100, (byte) -1 };
        boolean boolean77 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray69, byteArray76);
        byte[] byteArray79 = org.apache.commons.lang3.ArrayUtils.addFirst(byteArray69, (byte) 1);
        boolean boolean81 = org.apache.commons.lang3.ArrayUtils.contains(byteArray69, (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredStaticField(mutableLongClass27, "java.nio.channels.spi.AsynchronousChannelProvider", (java.lang.Object) (byte) -1, false);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredStaticField(mutableLongClass27, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.SSS'S'", (java.lang.Object) "java.io.tmpdir", true);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        org.apache.commons.lang3.IntegerRange integerRange2 = org.apache.commons.lang3.IntegerRange.of((int) '#', (int) (byte) 1);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder3 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) '#');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split(":");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder3.append((java.lang.Object[]) strArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray7 = reflectionToStringBuilder3.getExcludeFieldNames();
    }
}

