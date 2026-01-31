package org.apache.commons.lang3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Comparator;

import static org.junit.Assert.*;

public class gemini_ac_RangeTest {

    private Range<Integer> range16To64;
    private Range<Integer> range10To20;

    @Before
    public void setUp() {
        range16To64 = Range.between(16, 64);
        range10To20 = Range.of(10, 20);
    }

    // --- AC-1: Factory Methods & Construction ---

    @Test
    public void testOf_NormalOrder_ShouldCreateCorrectRange() {
        Range<Integer> range = Range.of(16, 64);
        assertEquals(Integer.valueOf(16), range.getMinimum());
        assertEquals(Integer.valueOf(64), range.getMaximum());
    }

    @Test
    public void testOf_ReverseOrder_ShouldAutoSwapToCorrectRange() {
        Range<Integer> range = Range.of(64, 16);
        assertEquals(Integer.valueOf(16), range.getMinimum());
        assertEquals(Integer.valueOf(64), range.getMaximum());
    }

    @Test(expected = NullPointerException.class)
    public void testOf_NullFirstArgument_ShouldThrowException() {
        Range.of(null, 1);
    }

    @Test(expected = NullPointerException.class)
    public void testOf_NullSecondArgument_ShouldThrowException() {
        Range.of(1, null);
    }

    @Test
    public void testBetween_NormalOrder_ShouldCreateCorrectRange() {
        Range<Integer> range = Range.between(16, 64);
        assertEquals(Integer.valueOf(16), range.getMinimum());
        assertEquals(Integer.valueOf(64), range.getMaximum());
    }

    @Test
    public void testBetween_WithComparator_ShouldWork() {
        Comparator<Integer> rev = (a, b) -> b.compareTo(a);
        // With reverse comparator, 64 is "smaller" than 16
        Range<Integer> range = Range.between(16, 64, rev);
        assertEquals(Integer.valueOf(64), range.getMinimum());
        assertEquals(Integer.valueOf(16), range.getMaximum());
        assertFalse(range.isNaturalOrdering());
    }

    @Test
    public void testIs_SingleValueRange_ShouldHaveSameMinMax() {
        Range<Integer> range = Range.is(10);
        assertEquals(Integer.valueOf(10), range.getMinimum());
        assertEquals(Integer.valueOf(10), range.getMaximum());
    }

    // --- AC-2: Contains ---

    @Test
    public void testContains_InsideRange_ShouldReturnTrue() {
        Range<Integer> range = Range.of(-10, 20);
        assertTrue(range.contains(10));
    }

    @Test
    public void testContains_LowerBoundary_ShouldReturnTrue() {
        Range<Integer> range = Range.of(-10, 20);
        assertTrue(range.contains(-10));
    }

    @Test
    public void testContains_NullValue_ShouldReturnFalse() {
        Range<Integer> range = Range.of(-10, 20);
        assertFalse(range.contains(null));
    }

    @Test
    public void testContains_BelowRange_ShouldReturnFalse() {
        Range<Integer> range = Range.of(-10, 20);
        assertFalse(range.contains(-11));
    }

    // --- AC-3: elementCompareTo ---

    @Test
    public void testElementCompareTo_VariousInputs_ShouldMatchExpected() {
        assertEquals(-1, range16To64.elementCompareTo(15));
        assertEquals(0, range16To64.elementCompareTo(16));
        assertEquals(0, range16To64.elementCompareTo(17));
        assertEquals(0, range16To64.elementCompareTo(64));
        assertEquals(1, range16To64.elementCompareTo(65));
    }

    @Test(expected = NullPointerException.class)
    public void testElementCompareTo_Null_ShouldThrowException() {
        range16To64.elementCompareTo(null);
    }

    // --- AC-4: Fit ---

    @Test
    public void testFit_VariousInputs_ShouldClampToRange() {
        assertEquals(Integer.valueOf(16), range16To64.fit(-9));
        assertEquals(Integer.valueOf(16), range16To64.fit(0));
        assertEquals(Integer.valueOf(16), range16To64.fit(15));
        assertEquals(Integer.valueOf(16), range16To64.fit(16));
        assertEquals(Integer.valueOf(17), range16To64.fit(17));
        assertEquals(Integer.valueOf(63), range16To64.fit(63));
        assertEquals(Integer.valueOf(64), range16To64.fit(64));
        assertEquals(Integer.valueOf(64), range16To64.fit(99));
    }

    @Test(expected = NullPointerException.class)
    public void testFit_Null_ShouldThrowException() {
        range16To64.fit(null);
    }

    // --- AC-5: Getters ---

    @Test
    public void testGetters_ShouldReturnCorrectValues() {
        assertEquals(Integer.valueOf(16), range16To64.getMinimum());
        assertEquals(Integer.valueOf(64), range16To64.getMaximum());
    }

    // --- AC-6: Intersection ---

    @Test
    public void testIntersectionWith_OverlappingRanges_ShouldReturnCorrectRange() {
        Range<Integer> r1 = Range.of(10, 20);
        Range<Integer> r2 = Range.of(5, 15);
        Range<Integer> result = r1.intersectionWith(r2);
        assertEquals(Integer.valueOf(10), result.getMinimum());
        assertEquals(Integer.valueOf(15), result.getMaximum());
    }

    @Test
    public void testIntersectionWith_SameRange_ShouldReturnSelf() {
        Range<Integer> r1 = Range.of(10, 20);
        Range<Integer> result = r1.intersectionWith(r1);
        assertSame(r1, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIntersectionWith_NonOverlappingRanges_ShouldThrowException() {
        Range<Integer> r1 = Range.of(10, 15);
        Range<Integer> r2 = Range.of(16, 25);
        r1.intersectionWith(r2);
    }

    // --- AC-7: isAfter / isBefore (Elements) ---

    @Test
    public void testIsAfter_Element_ShouldMatchExpected() {
        assertFalse(range10To20.isAfter(null));
        assertTrue(range10To20.isAfter(5));
        assertFalse(range10To20.isAfter(10));
        assertFalse(range10To20.isAfter(15));
        assertFalse(range10To20.isAfter(20));
        assertFalse(range10To20.isAfter(25));
    }

    @Test
    public void testIsBefore_Element_ShouldMatchExpected() {
        assertFalse(range10To20.isBefore(null));
        assertFalse(range10To20.isBefore(5));
        assertFalse(range10To20.isBefore(10));
        assertFalse(range10To20.isBefore(15));
        assertFalse(range10To20.isBefore(20));
        assertTrue(range10To20.isBefore(25));
    }

    // --- AC-8: isAfterRange / isBeforeRange ---

    @Test
    public void testIsAfterRange_ShouldMatchExpected() {
        assertFalse(range10To20.isAfterRange(null));
        assertTrue(range10To20.isAfterRange(Range.of(5, 9)));
        assertFalse(range10To20.isAfterRange(Range.of(5, 10)));
        assertFalse(range10To20.isAfterRange(Range.of(5, 20)));
        assertFalse(range10To20.isAfterRange(Range.of(5, 25)));
        assertFalse(range10To20.isAfterRange(Range.of(15, 25)));
        assertFalse(range10To20.isAfterRange(Range.of(21, 25)));
        assertFalse(range10To20.isAfterRange(Range.of(10, 20)));
    }

    @Test
    public void testIsBeforeRange_ShouldMatchExpected() {
        assertFalse(range10To20.isBeforeRange(null));
        assertFalse(range10To20.isBeforeRange(Range.of(5, 9)));
        assertFalse(range10To20.isBeforeRange(Range.of(5, 10)));
        assertFalse(range10To20.isBeforeRange(Range.of(5, 20)));
        assertFalse(range10To20.isBeforeRange(Range.of(5, 25)));
        assertFalse(range10To20.isBeforeRange(Range.of(15, 25)));
        assertTrue(range10To20.isBeforeRange(Range.of(21, 25)));
        assertFalse(range10To20.isBeforeRange(Range.of(10, 20)));
    }

    // --- AC-9: isStartedBy / isEndedBy ---

    @Test
    public void testIsStartedBy_ShouldMatchExpected() {
        assertFalse(range10To20.isStartedBy(null));
        assertFalse(range10To20.isStartedBy(5));
        assertTrue(range10To20.isStartedBy(10));
        assertFalse(range10To20.isStartedBy(15));
        assertFalse(range10To20.isStartedBy(20));
        assertFalse(range10To20.isStartedBy(25));
    }

    @Test
    public void testIsEndedBy_ShouldMatchExpected() {
        assertFalse(range10To20.isEndedBy(null));
        assertFalse(range10To20.isEndedBy(5));
        assertFalse(range10To20.isEndedBy(10));
        assertFalse(range10To20.isEndedBy(15));
        assertTrue(range10To20.isEndedBy(20));
        assertFalse(range10To20.isEndedBy(25));
    }

    // --- AC-10: isOverlappedBy ---

    @Test
    public void testIsOverlappedBy_ShouldMatchExpected() {
        assertFalse(range10To20.isOverlappedBy(null));
        assertTrue(range10To20.isOverlappedBy(Range.of(12, 18)));
        assertFalse(range10To20.isOverlappedBy(Range.of(32, 45)));
        assertFalse(range10To20.isOverlappedBy(Range.of(2, 8)));
        assertTrue(range10To20.isOverlappedBy(Range.of(10, 20)));
        assertTrue(range10To20.isOverlappedBy(Range.of(9, 14)));
        assertTrue(range10To20.isOverlappedBy(Range.of(16, 21)));
        assertTrue(range10To20.isOverlappedBy(Range.of(10, 19)));
        assertTrue(range10To20.isOverlappedBy(Range.of(10, 21)));
        assertTrue(range10To20.isOverlappedBy(Range.of(11, 20)));
        assertTrue(range10To20.isOverlappedBy(Range.of(9, 20)));
        assertFalse(range10To20.isOverlappedBy(Range.of(-18, -11)));
        assertTrue(range10To20.isOverlappedBy(Range.of(9, 21)));
    }

    // --- Extra Coverage: Equals, HashCode, ToString ---

    @Test
    public void testEquals_And_HashCode() {
        Range<Integer> r1 = Range.of(10, 20);
        Range<Integer> r2 = Range.of(10, 20);
        Range<Integer> r3 = Range.of(11, 21);

        assertEquals(r1, r1); // Same instance
        assertEquals(r1, r2); // Same values
        assertNotEquals(r1, r3); // Different values
        assertNotEquals(r1, null);
        assertNotEquals(r1, "Not a Range");

        assertEquals(r1.hashCode(), r2.hashCode());
        // Verify cache works (coverage for if(hashCode == 0))
        assertEquals(r1.hashCode(), r1.hashCode());
    }

    @Test
    public void testToString_Formats() {
        Range<Integer> r = Range.of(10, 20);
        assertEquals("[10..20]", r.toString());
        // Verify cache works
        assertEquals("[10..20]", r.toString());

        String custom = r.toString("Min: %s, Max: %s");
        assertTrue(custom.contains("Min: 10"));
        assertTrue(custom.contains("Max: 20"));
    }

    @Test
    public void testContainsRange_VariousCases() {
        Range<Integer> outer = Range.of(10, 50);
        assertTrue(outer.containsRange(Range.of(20, 30)));
        assertTrue(outer.containsRange(Range.of(10, 50)));
        assertFalse(outer.containsRange(Range.of(5, 30)));
        assertFalse(outer.containsRange(Range.of(30, 60)));
        assertFalse(outer.containsRange(null));
    }
}