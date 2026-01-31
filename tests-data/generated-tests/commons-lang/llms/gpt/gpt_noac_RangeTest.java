package org.apache.commons.lang3;

import org.junit.Test;

import java.util.Comparator;
import java.util.IllegalFormatConversionException;

import static org.junit.Assert.*;

public class gpt_noac_RangeTest {

    @Test(expected = NullPointerException.class)
    public void of_whenFromIsNull_shouldThrowNpe() {
        Range.of(null, 1);
    }

    @Test(expected = NullPointerException.class)
    public void of_whenToIsNull_shouldThrowNpe() {
        Range.of(1, null);
    }

    @Test
    public void of_whenElementsInOrder_shouldKeepMinimumAndMaximum() {
        // arrange/act
        Range<Integer> range = Range.of(1, 10);

        // assert
        assertEquals(Integer.valueOf(1), range.getMinimum());
        assertEquals(Integer.valueOf(10), range.getMaximum());
        assertTrue(range.isNaturalOrdering());
        assertNotNull(range.getComparator());
    }

    @Test
    public void of_whenElementsOutOfOrder_shouldSwapMinimumAndMaximum() {
        // arrange/act
        Range<Integer> range = Range.of(10, 1);

        // assert
        assertEquals(Integer.valueOf(1), range.getMinimum());
        assertEquals(Integer.valueOf(10), range.getMaximum());
    }

    @Test
    public void of_whenElementsEqual_shouldHaveSameMinAndMaxAndContainOnlyThatValue() {
        // arrange/act
        Range<Integer> range = Range.of(5, 5);

        // assert
        assertEquals(Integer.valueOf(5), range.getMinimum());
        assertEquals(Integer.valueOf(5), range.getMaximum());
        assertTrue(range.contains(5));
        assertFalse(range.contains(4));
        assertFalse(range.contains(6));
    }

    @Test
    public void between_deprecatedFactory_shouldBehaveLikeOf() {
        @SuppressWarnings("deprecation")
        Range<Integer> range = Range.between(2, 4);

        assertEquals(Integer.valueOf(2), range.getMinimum());
        assertEquals(Integer.valueOf(4), range.getMaximum());
        assertTrue(range.contains(3));
    }

    @Test
    public void is_factory_shouldCreateSingleElementRange() {
        Range<String> range = Range.is("x");

        assertEquals("x", range.getMinimum());
        assertEquals("x", range.getMaximum());
        assertTrue(range.contains("x"));
        assertFalse(range.contains("y"));
    }

    @Test
    public void of_withCustomComparatorReverseOrder_shouldUseComparatorOrdering() {
        // arrange
        Comparator<Integer> reverse = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return b.compareTo(a);
            }
        };

        // act
        Range<Integer> range = Range.of(1, 10, reverse);

        // assert (minimum/maximum are based on comparator ordering)
        assertEquals(Integer.valueOf(10), range.getMinimum());
        assertEquals(Integer.valueOf(1), range.getMaximum());
        assertSame(reverse, range.getComparator());
        assertFalse(range.isNaturalOrdering());

        // contains should still be inclusive under the comparator semantics
        assertTrue(range.contains(10));
        assertTrue(range.contains(5));
        assertTrue(range.contains(1));
        assertFalse(range.contains(11));
        assertFalse(range.contains(0));
    }

    @Test
    public void contains_whenElementIsNull_shouldReturnFalse() {
        Range<Integer> range = Range.of(1, 3);
        assertFalse(range.contains(null));
    }

    @Test
    public void contains_shouldBeInclusiveAndHandleOutsideValues() {
        Range<Integer> range = Range.of(1, 3);

        assertTrue(range.contains(1));
        assertTrue(range.contains(2));
        assertTrue(range.contains(3));
        assertFalse(range.contains(0));
        assertFalse(range.contains(4));
    }

    @Test
    public void containsRange_whenOtherIsNull_shouldReturnFalse() {
        Range<Integer> range = Range.of(1, 5);
        assertFalse(range.containsRange(null));
    }

    @Test
    public void containsRange_whenOtherWithin_shouldReturnTrue_otherwiseFalse() {
        Range<Integer> outer = Range.of(1, 10);
        Range<Integer> inner = Range.of(3, 7);
        Range<Integer> overlappingButNotContained = Range.of(0, 5);

        assertTrue(outer.containsRange(inner));
        assertFalse(outer.containsRange(overlappingButNotContained));
    }

    @Test(expected = NullPointerException.class)
    public void elementCompareTo_whenElementIsNull_shouldThrowNpe() {
        Range.of(1, 3).elementCompareTo(null);
    }

    @Test
    public void elementCompareTo_shouldReturnMinusOneForBelowMin_plusOneForAboveMax_zeroForInside() {
        Range<Integer> range = Range.of(10, 20);

        assertEquals(-1, range.elementCompareTo(9));   // range is after element (element < min)
        assertEquals(0, range.elementCompareTo(10));   // inside (boundary)
        assertEquals(0, range.elementCompareTo(15));   // inside
        assertEquals(0, range.elementCompareTo(20));   // inside (boundary)
        assertEquals(1, range.elementCompareTo(21));   // range is before element (element > max)
    }

    @Test(expected = NullPointerException.class)
    public void fit_whenElementIsNull_shouldThrowNpe() {
        Range.of(1, 3).fit(null);
    }

    @Test
    public void fit_whenElementBelowMin_shouldReturnMinimum_whenAboveMax_shouldReturnMaximum_whenInside_shouldReturnSameReference() {
        Range<Integer> intRange = Range.of(10, 20);
        assertEquals(Integer.valueOf(10), intRange.fit(9));
        assertEquals(Integer.valueOf(20), intRange.fit(21));
        assertEquals(Integer.valueOf(15), intRange.fit(15));

        Range<String> strRange = Range.of("a", "c");
        String b = new String("b");
        assertSame(b, strRange.fit(b)); // should return the provided instance when within range
    }

    @Test
    public void isAfter_isBefore_isStartedBy_isEndedBy_shouldHandleNullAndBoundaries() {
        Range<Integer> range = Range.of(5, 10);

        assertFalse(range.isAfter(null));
        assertFalse(range.isBefore(null));
        assertFalse(range.isStartedBy(null));
        assertFalse(range.isEndedBy(null));

        assertTrue(range.isAfter(4));
        assertFalse(range.isAfter(5));
        assertFalse(range.isAfter(6));

        assertTrue(range.isBefore(11));
        assertFalse(range.isBefore(10));
        assertFalse(range.isBefore(9));

        assertTrue(range.isStartedBy(5));
        assertFalse(range.isStartedBy(6));

        assertTrue(range.isEndedBy(10));
        assertFalse(range.isEndedBy(9));
    }

    @Test
    public void isAfterRange_isBeforeRange_shouldHandleNullAndOrdering() {
        Range<Integer> range = Range.of(10, 20);
        Range<Integer> left = Range.of(1, 5);
        Range<Integer> right = Range.of(30, 40);

        assertFalse(range.isAfterRange(null));
        assertFalse(range.isBeforeRange(null));

        assertTrue(range.isAfterRange(left));
        assertFalse(range.isAfterRange(right));

        assertTrue(range.isBeforeRange(right));
        assertFalse(range.isBeforeRange(left));
    }

    @Test
    public void isOverlappedBy_shouldHandleNull_andCoverEachOrBranch() {
        Range<Integer> base = Range.of(1, 5);

        assertFalse(base.isOverlappedBy(null));

        // OR branch 1: otherRange.contains(minimum) == true
        Range<Integer> otherContainsMin = Range.of(0, 2);
        assertTrue(base.isOverlappedBy(otherContainsMin));

        // OR branch 2: otherRange.contains(minimum) == false, otherRange.contains(maximum) == true
        Range<Integer> otherContainsMaxOnly = Range.of(4, 6);
        assertTrue(base.isOverlappedBy(otherContainsMaxOnly));

        // OR branch 3: otherRange.contains(minimum/maximum) == false, contains(otherRange.minimum) == true (other inside)
        Range<Integer> otherInside = Range.of(2, 3);
        assertTrue(base.isOverlappedBy(otherInside));

        // negative: no overlap
        Range<Integer> disjoint = Range.of(6, 9);
        assertFalse(base.isOverlappedBy(disjoint));
    }

    @Test
    public void intersectionWith_whenEqualRange_shouldReturnSameInstance() {
        Range<Integer> range = Range.of(1, 5);
        Range<Integer> result = range.intersectionWith(Range.of(1, 5));

        assertSame(range, result);
    }

    @Test
    public void intersectionWith_whenOverlapping_shouldReturnIntersectionAndPreserveComparatorInstance() {
        Comparator<Integer> natural = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a.compareTo(b);
            }
        };
        Range<Integer> r1 = Range.of(1, 10, natural);
        Range<Integer> r2 = Range.of(5, 20, natural);

        Range<Integer> intersection = r1.intersectionWith(r2);

        assertNotSame(r1, intersection);
        assertEquals(Integer.valueOf(5), intersection.getMinimum());
        assertEquals(Integer.valueOf(10), intersection.getMaximum());
        assertSame(natural, intersection.getComparator());
    }

    @Test
    public void intersectionWith_whenNonOverlapping_shouldThrowIllegalArgumentExceptionWithRangeInMessage() {
        Range<Integer> r1 = Range.of(1, 3);
        Range<Integer> r2 = Range.of(5, 7);

        try {
            r1.intersectionWith(r2);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            assertTrue(ex.getMessage().contains(r2.toString()));
        }
    }

    @Test
    public void equals_shouldHandleSelfNullDifferentClassAndNormalizedInputs() {
        Range<Integer> a = Range.of(1, 5);
        Range<Integer> b = Range.of(5, 1); // normalized
        Range<Integer> c = Range.of(1, 6);

        assertTrue(a.equals(a));
        assertFalse(a.equals(null));
        assertFalse(a.equals("not a range"));

        assertTrue(a.equals(b));
        assertTrue(b.equals(a));
        assertFalse(a.equals(c));
    }

    @Test
    public void hashCode_shouldBeStableAndUseCachedValueAfterFirstCall() {
        Range<Integer> range = Range.of(1, 5);

        int h1 = range.hashCode();
        int h2 = range.hashCode();

        assertEquals(h1, h2);

        Range<Integer> same = Range.of(1, 5);
        Range<Integer> different = Range.of(1, 6);

        assertEquals(h1, same.hashCode());
        assertNotEquals(h1, different.hashCode());
    }

    @Test
    public void toString_shouldBeCachedAndUseExpectedFormat() {
        Range<Integer> range = Range.of(1, 3);

        String s1 = range.toString();
        String s2 = range.toString();

        assertEquals("[1..3]", s1);
        assertSame(s1, s2); // cached instance
    }

    @Test
    public void toString_withFormat_shouldIncludeMinimumMaximumAndComparator() {
        Range<Integer> range = Range.of(1, 3);
        String formatted = range.toString("min=%s,max=%s,comp=%s");

        assertTrue(formatted.contains("min=1"));
        assertTrue(formatted.contains("max=3"));
        assertTrue(formatted.contains("comp=")); // comparator toString included
    }

    @Test(expected = IllegalFormatConversionException.class)
    public void toString_withInvalidFormat_shouldThrow() {
        Range<String> range = Range.of("a", "b");
        range.toString("%d"); // expects an integer-compatible argument, but receives "a"
    }
}