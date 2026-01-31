package org.apache.commons.lang3;

import org.junit.Test;

import java.lang.reflect.Field;
import java.util.Comparator;

import static org.junit.Assert.*;

public class gpt_ac_RangeTest {

    // -------- AC-1: of / between create normalized (min..max) ranges and null handling --------

    @Test
    public void of_givenAscendingInputs_shouldCreateRangeWithSameMinMax() {
        Range<Integer> range = Range.of(16, 64);
        assertEquals(Integer.valueOf(16), range.getMinimum());
        assertEquals(Integer.valueOf(64), range.getMaximum());
        assertEquals("[16..64]", range.toString());
    }

    @Test
    public void of_givenDescendingInputs_shouldSwapToCreateAscendingRange() {
        Range<Integer> range = Range.of(64, 16);
        assertEquals(Integer.valueOf(16), range.getMinimum());
        assertEquals(Integer.valueOf(64), range.getMaximum());
        assertEquals("[16..64]", range.toString());
    }

    @Test(expected = NullPointerException.class)
    public void of_givenNullMinimum_shouldThrowNpe() {
        Range.of(null, 1);
    }

    @Test(expected = NullPointerException.class)
    public void of_givenNullMaximum_shouldThrowNpe() {
        Range.of(1, null);
    }

    @Test(expected = NullPointerException.class)
    public void of_withComparator_givenNullMinimum_shouldThrowNpe() {
        Range.of(null, 1, null);
    }

    @Test(expected = NullPointerException.class)
    public void of_withComparator_givenNullMaximum_shouldThrowNpe() {
        Range.of(1, null, null);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void between_givenAscendingInputs_shouldCreateRangeWithSameMinMax() {
        Range<Integer> range = Range.between(16, 64);
        assertEquals(Integer.valueOf(16), range.getMinimum());
        assertEquals(Integer.valueOf(64), range.getMaximum());
    }

    @SuppressWarnings("deprecation")
    @Test
    public void between_givenDescendingInputs_shouldSwapToCreateAscendingRange() {
        Range<Integer> range = Range.between(64, 16);
        assertEquals(Integer.valueOf(16), range.getMinimum());
        assertEquals(Integer.valueOf(64), range.getMaximum());
    }

    @SuppressWarnings("deprecation")
    @Test(expected = NullPointerException.class)
    public void between_givenNullMinimum_shouldThrowNpe() {
        Range.between(null, 1);
    }

    @SuppressWarnings("deprecation")
    @Test(expected = NullPointerException.class)
    public void between_givenNullMaximum_shouldThrowNpe() {
        Range.between(1, null);
    }

    @SuppressWarnings("deprecation")
    @Test(expected = NullPointerException.class)
    public void between_withComparator_givenNullMinimum_shouldThrowNpe() {
        Range.between(null, 1, null);
    }

    @SuppressWarnings("deprecation")
    @Test(expected = NullPointerException.class)
    public void between_withComparator_givenNullMaximum_shouldThrowNpe() {
        Range.between(1, null, null);
    }

    // -------- AC-2: contains --------

    @Test
    public void contains_givenInRangeValue_shouldReturnTrue() {
        Range<Integer> range = Range.of(-10, 20);
        assertTrue(range.contains(10));
    }

    @Test
    public void contains_givenMinimumBoundary_shouldReturnTrue() {
        Range<Integer> range = Range.of(-10, 20);
        assertTrue(range.contains(-10));
    }

    @Test
    public void contains_givenNull_shouldReturnFalse() {
        Range<Integer> range = Range.of(-10, 20);
        assertFalse(range.contains(null));
    }

    @Test
    public void contains_givenBelowMinimum_shouldReturnFalse() {
        Range<Integer> range = Range.of(-10, 20);
        assertFalse(range.contains(-11));
    }

    @Test
    public void contains_givenAboveMaximum_shouldReturnFalse() {
        Range<Integer> range = Range.of(-10, 20);
        assertFalse(range.contains(21));
    }

    // -------- AC-3: elementCompareTo --------

    @Test
    public void elementCompareTo_givenBelowRange_shouldReturnMinusOne() {
        Range<Integer> range = Range.of(16, 64);
        assertEquals(-1, range.elementCompareTo(15));
    }

    @Test
    public void elementCompareTo_givenAtMinimum_shouldReturnZero() {
        Range<Integer> range = Range.of(16, 64);
        assertEquals(0, range.elementCompareTo(16));
    }

    @Test
    public void elementCompareTo_givenInsideRange_shouldReturnZero() {
        Range<Integer> range = Range.of(16, 64);
        assertEquals(0, range.elementCompareTo(17));
        assertEquals(0, range.elementCompareTo(64));
    }

    @Test
    public void elementCompareTo_givenAboveRange_shouldReturnOne() {
        Range<Integer> range = Range.of(16, 64);
        assertEquals(1, range.elementCompareTo(65));
    }

    @Test(expected = NullPointerException.class)
    public void elementCompareTo_givenNull_shouldThrowNpe() {
        Range<Integer> range = Range.of(16, 64);
        range.elementCompareTo(null);
    }

    // -------- AC-4: fit --------

    @Test
    public void fit_givenBelowRange_shouldReturnMinimum() {
        Range<Integer> range = Range.between(16, 64);
        assertEquals(Integer.valueOf(16), range.fit(-9));
        assertEquals(Integer.valueOf(16), range.fit(0));
        assertEquals(Integer.valueOf(16), range.fit(15));
        assertEquals(Integer.valueOf(16), range.fit(16));
    }

    @Test
    public void fit_givenInsideRange_shouldReturnElement() {
        Range<Integer> range = Range.between(16, 64);
        assertEquals(Integer.valueOf(17), range.fit(17));
        assertEquals(Integer.valueOf(63), range.fit(63));
        assertEquals(Integer.valueOf(64), range.fit(64));
    }

    @Test
    public void fit_givenAboveRange_shouldReturnMaximum() {
        Range<Integer> range = Range.between(16, 64);
        assertEquals(Integer.valueOf(64), range.fit(99));
    }

    @Test(expected = NullPointerException.class)
    public void fit_givenNull_shouldThrowNpe() {
        Range<Integer> range = Range.between(16, 64);
        range.fit(null);
    }

    // -------- AC-5: getMinimum / getMaximum --------

    @Test
    public void getMinimum_shouldReturnMinimum() {
        Range<Integer> range = Range.between(16, 64);
        assertEquals(Integer.valueOf(16), range.getMinimum());
    }

    @Test
    public void getMaximum_shouldReturnMaximum() {
        Range<Integer> range = Range.between(16, 64);
        assertEquals(Integer.valueOf(64), range.getMaximum());
    }

    // -------- AC-6: intersectionWith --------

    @Test
    public void intersectionWith_givenOverlappingRanges_shouldReturnIntersection() {
        Range<Integer> r1 = Range.of(10, 20);
        Range<Integer> r2 = Range.of(5, 15);

        Range<Integer> intersection = r1.intersectionWith(r2);

        assertEquals(Integer.valueOf(10), intersection.getMinimum());
        assertEquals(Integer.valueOf(15), intersection.getMaximum());
        assertTrue(intersection.isNaturalOrdering());
    }

    @Test(expected = IllegalArgumentException.class)
    public void intersectionWith_givenNonOverlappingRanges_shouldThrowIae() {
        Range<Integer> r1 = Range.of(10, 15);
        Range<Integer> r2 = Range.of(16, 25);
        r1.intersectionWith(r2);
    }

    @Test
    public void intersectionWith_givenEqualRanges_shouldReturnSameInstance() {
        Range<Integer> r1 = Range.of(10, 20);
        Range<Integer> r2 = Range.of(20, 10); // equals r1
        assertNotSame(r1, r2);
        assertEquals(r1, r2);

        Range<Integer> result = r1.intersectionWith(r2);
        assertSame(r1, result);
    }

    @Test
    public void intersectionWith_nonOverlappingMessageShouldMentionOtherRange() {
        Range<Integer> r1 = Range.of(10, 15);
        Range<Integer> r2 = Range.of(16, 25);

        try {
            r1.intersectionWith(r2);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            assertTrue(ex.getMessage().contains(r2.toString()));
            assertTrue(ex.getMessage().contains("non-overlapping"));
        }
    }

    // -------- AC-7: isAfter / isBefore element --------

    @Test
    public void isAfter_givenNull_shouldReturnFalse() {
        Range<Integer> range = Range.of(10, 20);
        assertFalse(range.isAfter(null));
    }

    @Test
    public void isAfter_givenBelowMinimum_shouldReturnTrue() {
        Range<Integer> range = Range.of(10, 20);
        assertTrue(range.isAfter(5));
    }

    @Test
    public void isAfter_givenAtOrInsideOrAbove_shouldReturnFalse() {
        Range<Integer> range = Range.of(10, 20);
        assertFalse(range.isAfter(10));
        assertFalse(range.isAfter(15));
        assertFalse(range.isAfter(20));
        assertFalse(range.isAfter(25));
    }

    @Test
    public void isBefore_givenNull_shouldReturnFalse() {
        Range<Integer> range = Range.of(10, 20);
        assertFalse(range.isBefore(null));
    }

    @Test
    public void isBefore_givenAboveMaximum_shouldReturnTrue() {
        Range<Integer> range = Range.of(10, 20);
        assertTrue(range.isBefore(25));
    }

    @Test
    public void isBefore_givenBelowOrAtOrInside_shouldReturnFalse() {
        Range<Integer> range = Range.of(10, 20);
        assertFalse(range.isBefore(5));
        assertFalse(range.isBefore(10));
        assertFalse(range.isBefore(15));
        assertFalse(range.isBefore(20));
    }

    // -------- AC-8: isAfterRange / isBeforeRange --------

    @Test
    public void isAfterRange_givenNull_shouldReturnFalse() {
        Range<Integer> range = Range.of(10, 20);
        assertFalse(range.isAfterRange(null));
    }

    @Test
    public void isAfterRange_givenRangeCompletelyBefore_shouldReturnTrue() {
        Range<Integer> range = Range.of(10, 20);
        assertTrue(range.isAfterRange(Range.of(5, 9)));
    }

    @Test
    public void isAfterRange_givenOverlappingOrTouchingOrAfter_shouldReturnFalse() {
        Range<Integer> range = Range.of(10, 20);
        assertFalse(range.isAfterRange(Range.of(5, 10)));
        assertFalse(range.isAfterRange(Range.of(5, 20)));
        assertFalse(range.isAfterRange(Range.of(5, 25)));
        assertFalse(range.isAfterRange(Range.of(15, 25)));
        assertFalse(range.isAfterRange(Range.of(21, 25)));
        assertFalse(range.isAfterRange(Range.of(10, 20)));
    }

    @Test
    public void isBeforeRange_givenNull_shouldReturnFalse() {
        Range<Integer> range = Range.of(10, 20);
        assertFalse(range.isBeforeRange(null));
    }

    @Test
    public void isBeforeRange_givenRangeCompletelyAfter_shouldReturnTrue() {
        Range<Integer> range = Range.of(10, 20);
        assertTrue(range.isBeforeRange(Range.of(21, 25)));
    }

    @Test
    public void isBeforeRange_givenOverlappingOrTouchingOrBefore_shouldReturnFalse() {
        Range<Integer> range = Range.of(10, 20);
        assertFalse(range.isBeforeRange(Range.of(5, 9)));
        assertFalse(range.isBeforeRange(Range.of(5, 10)));
        assertFalse(range.isBeforeRange(Range.of(5, 20)));
        assertFalse(range.isBeforeRange(Range.of(5, 25)));
        assertFalse(range.isBeforeRange(Range.of(15, 25)));
        assertFalse(range.isBeforeRange(Range.of(10, 20)));
    }

    // -------- AC-9: isStartedBy / isEndedBy --------

    @Test
    public void isStartedBy_shouldMatchOnlyMinimumAndHandleNull() {
        Range<Integer> range = Range.of(10, 20);
        assertFalse(range.isStartedBy(null));
        assertFalse(range.isStartedBy(5));
        assertTrue(range.isStartedBy(10));
        assertFalse(range.isStartedBy(15));
        assertFalse(range.isStartedBy(20));
        assertFalse(range.isStartedBy(25));
    }

    @Test
    public void isEndedBy_shouldMatchOnlyMaximumAndHandleNull() {
        Range<Integer> range = Range.of(10, 20);
        assertFalse(range.isEndedBy(null));
        assertFalse(range.isEndedBy(5));
        assertFalse(range.isEndedBy(10));
        assertFalse(range.isEndedBy(15));
        assertTrue(range.isEndedBy(20));
        assertFalse(range.isEndedBy(25));
    }

    // -------- AC-10: isOverlappedBy --------

    @Test
    public void isOverlappedBy_givenNull_shouldReturnFalse() {
        Range<Integer> range = Range.of(10, 20);
        assertFalse(range.isOverlappedBy(null));
    }

    @Test
    public void isOverlappedBy_shouldReturnExpectedAcrossExamples() {
        Range<Integer> range = Range.of(10, 20);

        assertTrue(range.isOverlappedBy(Range.of(12, 18)));
        assertFalse(range.isOverlappedBy(Range.of(32, 45)));
        assertFalse(range.isOverlappedBy(Range.of(2, 8)));
        assertTrue(range.isOverlappedBy(Range.of(10, 20)));
        assertTrue(range.isOverlappedBy(Range.of(9, 14)));
        assertTrue(range.isOverlappedBy(Range.of(16, 21)));
        assertTrue(range.isOverlappedBy(Range.of(10, 19)));
        assertTrue(range.isOverlappedBy(Range.of(10, 21)));
        assertTrue(range.isOverlappedBy(Range.of(11, 20)));
        assertTrue(range.isOverlappedBy(Range.of(9, 20)));
        assertFalse(range.isOverlappedBy(Range.of(-11, -18))); // normalizes to [-18..-11]
        assertTrue(range.isOverlappedBy(Range.of(9, 21)));
    }

    @Test
    public void isOverlappedBy_shouldCoverAllOrBranches() {
        Range<Integer> range = Range.of(10, 20);

        // Branch 1: other.contains(this.minimum)
        assertTrue(range.isOverlappedBy(Range.of(9, 14)));

        // Branch 2: other.contains(this.maximum) but not minimum
        Range<Integer> onlyContainsMax = Range.of(16, 21);
        assertFalse(onlyContainsMax.contains(range.getMinimum()));
        assertTrue(onlyContainsMax.contains(range.getMaximum()));
        assertTrue(range.isOverlappedBy(onlyContainsMax));

        // Branch 3: this.contains(other.minimum) (other fully inside)
        Range<Integer> inside = Range.of(12, 18);
        assertFalse(inside.contains(range.getMinimum()));
        assertFalse(inside.contains(range.getMaximum()));
        assertTrue(range.contains(inside.getMinimum()));
        assertTrue(range.isOverlappedBy(inside));
    }

    // -------- Additional high-coverage tests: containsRange, equals/hashCode/toString caching, comparator behavior --------

    @Test
    public void containsRange_givenNull_shouldReturnFalse() {
        Range<Integer> range = Range.of(10, 20);
        assertFalse(range.containsRange(null));
    }

    @Test
    public void containsRange_givenFullyContainedRange_shouldReturnTrue() {
        Range<Integer> range = Range.of(10, 20);
        assertTrue(range.containsRange(Range.of(12, 18)));
        assertTrue(range.containsRange(Range.of(10, 20)));
        assertTrue(range.containsRange(Range.of(10, 10)));
        assertTrue(range.containsRange(Range.of(20, 20)));
    }

    @Test
    public void containsRange_givenPartiallyOutsideRange_shouldReturnFalse() {
        Range<Integer> range = Range.of(10, 20);
        assertFalse(range.containsRange(Range.of(9, 18)));
        assertFalse(range.containsRange(Range.of(12, 21)));
        assertFalse(range.containsRange(Range.of(9, 21)));
    }

    @Test
    public void equals_shouldHandleIdentityNullAndDifferentClassAndSameBounds() {
        Range<Integer> r1 = Range.of(10, 20);
        Range<Integer> r2 = Range.of(20, 10);
        Range<Integer> r3 = Range.of(10, 21);

        assertTrue(r1.equals(r1));
        assertFalse(r1.equals(null));
        assertFalse(r1.equals("not a range"));

        assertEquals(r1, r2);
        assertNotEquals(r1, r3);
    }

    @Test
    public void hashCode_shouldBeStableAndCachedAfterFirstCall() throws Exception {
        Range<Integer> range = Range.of(10, 20);

        // reflectively verify cache field transitions from 0 to non-zero
        Field hc = Range.class.getDeclaredField("hashCode");
        hc.setAccessible(true);
        assertEquals(0, hc.getInt(range));

        int h1 = range.hashCode();
        int cached = hc.getInt(range);
        assertNotEquals(0, cached);
        assertEquals(h1, cached);

        int h2 = range.hashCode();
        assertEquals(h1, h2);
        assertEquals(cached, hc.getInt(range));
    }

    @Test
    public void toString_shouldBeStableAndCachedAfterFirstCall() throws Exception {
        Range<Integer> range = Range.of(10, 20);

        Field ts = Range.class.getDeclaredField("toString");
        ts.setAccessible(true);
        assertNull(ts.get(range));

        String s1 = range.toString();
        assertEquals("[10..20]", s1);
        assertEquals(s1, ts.get(range));

        String s2 = range.toString();
        assertSame("cached string instance should be reused", s1, s2);
    }

    @Test
    public void toStringFormat_shouldIncludeMinMaxAndComparator() {
        Range<Integer> range = Range.of(10, 20);
        String formatted = range.toString("min=%s,max=%s,comp=%s");
        assertTrue(formatted.contains("min=10"));
        assertTrue(formatted.contains("max=20"));
        assertTrue(formatted.contains("comp="));
    }

    @Test
    public void isNaturalOrdering_shouldBeTrueForDefaultComparatorAndFalseForCustomComparator() {
        Range<Integer> natural = Range.of(1, 5);
        assertTrue(natural.isNaturalOrdering());
        assertNotNull(natural.getComparator());

        Comparator<Integer> reverse = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return b.compareTo(a);
            }
        };
        Range<Integer> custom = Range.of(1, 5, reverse);
        assertFalse(custom.isNaturalOrdering());
        assertSame(reverse, custom.getComparator());
    }

    @Test
    public void customComparator_shouldAffectMinMaxAndContainment() {
        Comparator<Integer> reverse = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return b.compareTo(a);
            }
        };
        Range<Integer> range = Range.of(1, 5, reverse);

        // Under reverse ordering, "minimum" is 5 and "maximum" is 1 (in comparator terms)
        assertEquals(Integer.valueOf(5), range.getMinimum());
        assertEquals(Integer.valueOf(1), range.getMaximum());

        // Still represents numeric 1..5 for containment semantics
        assertTrue(range.contains(1));
        assertTrue(range.contains(3));
        assertTrue(range.contains(5));
        assertFalse(range.contains(0));
        assertFalse(range.contains(6));
    }

    @Test
    public void fit_shouldUseCustomComparatorBounds() {
        Comparator<Integer> reverse = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return b.compareTo(a);
            }
        };
        Range<Integer> range = Range.of(1, 5, reverse);

        // For numeric 0 (below), fit should return "minimum" which is 5 (in reverse ordering)
        assertEquals(Integer.valueOf(1), range.fit(0)); // FAILING:
        // For numeric 6 (above), fit should return "maximum" which is 1 (in reverse ordering)
        assertEquals(Integer.valueOf(5), range.fit(6)); // FAILING:
        // Inside stays unchanged
        assertEquals(Integer.valueOf(3), range.fit(3));
    }

    @Test
    public void contains_shouldHandleExtremeIntegerBounds() {
        Range<Integer> range = Range.of(Integer.MIN_VALUE, Integer.MAX_VALUE);
        assertTrue(range.contains(Integer.MIN_VALUE));
        assertTrue(range.contains(0));
        assertTrue(range.contains(Integer.MAX_VALUE));
    }

    @Test
    public void is_shouldCreateSingleElementRangeAndBehaveCorrectly() {
        Range<Integer> range = Range.is(42);
        assertEquals(Integer.valueOf(42), range.getMinimum());
        assertEquals(Integer.valueOf(42), range.getMaximum());
        assertTrue(range.contains(42));
        assertFalse(range.contains(41));
        assertFalse(range.contains(43));
        assertTrue(range.isStartedBy(42));
        assertTrue(range.isEndedBy(42));
    }
}