package org.apache.commons.lang3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.Comparator;
import org.junit.Test;

/**
 * Unit tests for {@link Range} achieving high line and branch coverage.
 */
public class gemini_noac_RangeTest {

    // --- Factory & Constructor Tests ---

    @Test
    public void of_validInputs_createsRange() {
        // Arrange & Act
        Range<Integer> range = Range.of(10, 20);

        // Assert
        assertEquals(Integer.valueOf(10), range.getMinimum());
        assertEquals(Integer.valueOf(20), range.getMaximum());
    }

    @Test
    public void of_swappedInputs_correctlyAssignsMinMax() {
        // Arrange & Act
        Range<Integer> range = Range.of(20, 10);

        // Assert
        assertEquals(Integer.valueOf(10), range.getMinimum());
        assertEquals(Integer.valueOf(20), range.getMaximum());
    }

    @Test(expected = NullPointerException.class)
    public void of_nullFirstElement_throwsException() {
        Range.of(null, 10);
    }

    @Test(expected = NullPointerException.class)
    public void of_nullSecondElement_throwsException() {
        Range.of(10, null);
    }

    @Test
    @SuppressWarnings("deprecation")
    public void between_deprecatedMethods_workAsExpected() {
        Range<Integer> range1 = Range.between(5, 15);
        Range<Integer> range2 = Range.between(5, 15, null);

        assertEquals(range1, range2);
        assertTrue(range1.isNaturalOrdering());
    }

    @Test
    public void is_singleElement_minEqualsMax() {
        Range<Integer> range = Range.is(10);
        assertEquals(Integer.valueOf(10), range.getMinimum());
        assertEquals(Integer.valueOf(10), range.getMaximum());
    }

    @Test
    public void of_customComparator_usesComparator() {
        // Arrange
        Comparator<String> lengthComparator = (s1, s2) -> Integer.compare(s1.length(), s2.length());

        // Act
        Range<String> range = Range.of("apple", "a", lengthComparator);

        // Assert
        assertEquals("a", range.getMinimum());
        assertEquals("apple", range.getMaximum());
        assertSame(lengthComparator, range.getComparator());
        assertFalse(range.isNaturalOrdering());
    }

    // --- Basic Logic Tests (Contains, Before, After) ---

    @Test
    public void contains_variousInputs_returnsExpectedResults() {
        Range<Integer> range = Range.of(10, 20);

        assertTrue("Should contain middle", range.contains(15));
        assertTrue("Should contain boundary min", range.contains(10));
        assertTrue("Should contain boundary max", range.contains(20));
        assertFalse("Should not contain below min", range.contains(9));
        assertFalse("Should not contain above max", range.contains(21));
        assertFalse("Should return false for null", range.contains(null));
    }

    @Test
    public void isAfter_variousInputs_returnsExpectedResults() {
        Range<Integer> range = Range.of(10, 20);

        assertTrue(range.isAfter(5));
        assertFalse(range.isAfter(10)); // Boundary
        assertFalse(range.isAfter(15));
        assertFalse(range.isAfter(null));
    }

    @Test
    public void isBefore_variousInputs_returnsExpectedResults() {
        Range<Integer> range = Range.of(10, 20);

        assertTrue(range.isBefore(25));
        assertFalse(range.isBefore(20)); // Boundary
        assertFalse(range.isBefore(15));
        assertFalse(range.isBefore(null));
    }

    @Test
    public void isStartedBy_isEndedBy_detectBoundaries() {
        Range<Integer> range = Range.of(10, 20);

        assertTrue(range.isStartedBy(10));
        assertFalse(range.isStartedBy(11));
        assertFalse(range.isStartedBy(null));

        assertTrue(range.isEndedBy(20));
        assertFalse(range.isEndedBy(19));
        assertFalse(range.isEndedBy(null));
    }

    // --- Range Relationship Tests ---

    @Test
    public void containsRange_variousRanges_returnsExpectedResults() {
        Range<Integer> main = Range.of(10, 20);

        assertTrue("Exact match", main.containsRange(Range.of(10, 20)));
        assertTrue("Sub range", main.containsRange(Range.of(12, 18)));
        assertFalse("Partial overlap start", main.containsRange(Range.of(5, 15)));
        assertFalse("Partial overlap end", main.containsRange(Range.of(15, 25)));
        assertFalse("Totally outside", main.containsRange(Range.of(30, 40)));
        assertFalse("Null range", main.containsRange(null));
    }

    @Test
    public void isOverlappedBy_variousRanges_returnsExpectedResults() {
        Range<Integer> main = Range.of(10, 20);

        assertTrue("Partial overlap start", main.isOverlappedBy(Range.of(5, 15)));
        assertTrue("Partial overlap end", main.isOverlappedBy(Range.of(15, 25)));
        assertTrue("Completely inside", main.isOverlappedBy(Range.of(12, 18)));
        assertTrue("Completely encompassing", main.isOverlappedBy(Range.of(5, 25)));
        assertFalse("Totally before", main.isOverlappedBy(Range.of(0, 5)));
        assertFalse("Totally after", main.isOverlappedBy(Range.of(25, 30)));
        assertFalse("Null range", main.isOverlappedBy(null));
    }

    @Test
    public void isAfterRange_isBeforeRange_checksPositions() {
        Range<Integer> main = Range.of(10, 20);

        assertTrue(main.isAfterRange(Range.of(0, 5)));
        assertFalse(main.isAfterRange(Range.of(5, 15)));
        assertFalse(main.isAfterRange(null));

        assertTrue(main.isBeforeRange(Range.of(25, 30)));
        assertFalse(main.isBeforeRange(Range.of(15, 25)));
        assertFalse(main.isBeforeRange(null));
    }

    // --- Calculations & Operations ---

    @Test
    public void elementCompareTo_variousValues_returnsCorrectInt() {
        Range<Integer> range = Range.of(10, 20);

        assertEquals(-1, range.elementCompareTo(5));
        assertEquals(1, range.elementCompareTo(25));
        assertEquals(0, range.elementCompareTo(15));
        assertEquals(0, range.elementCompareTo(10));
        assertEquals(0, range.elementCompareTo(20));
    }

    @Test(expected = NullPointerException.class)
    public void elementCompareTo_null_throwsException() {
        Range.of(10, 20).elementCompareTo(null);
    }

    @Test
    public void fit_variousValues_clampsToRange() {
        Range<Integer> range = Range.of(10, 20);

        assertEquals(Integer.valueOf(10), range.fit(5));
        assertEquals(Integer.valueOf(20), range.fit(25));
        assertEquals(Integer.valueOf(15), range.fit(15));
    }

    @Test(expected = NullPointerException.class)
    public void fit_null_throwsException() {
        Range.of(10, 20).fit(null);
    }

    @Test
    public void intersectionWith_overlappingRanges_returnsCorrectIntersection() {
        Range<Integer> main = Range.of(10, 20);

        assertEquals(Range.of(10, 15), main.intersectionWith(Range.of(5, 15)));
        assertEquals(Range.of(15, 20), main.intersectionWith(Range.of(15, 25)));
        assertEquals(Range.of(12, 18), main.intersectionWith(Range.of(12, 18)));

        // Exact same object branch
        assertSame(main, main.intersectionWith(Range.of(10, 20)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void intersectionWith_nonOverlappingRanges_throwsException() {
        Range.of(10, 20).intersectionWith(Range.of(30, 40));
    }

    // --- Object Method Tests ---

    @Test
    public void equals_variousScenarios_logicIsCorrect() {
        Range<Integer> range = Range.of(10, 20);

        assertTrue(range.equals(range));
        assertTrue(range.equals(Range.of(10, 20)));
        assertFalse(range.equals(null));
        assertFalse(range.equals("not a range"));
        assertFalse(range.equals(Range.of(10, 21)));
        assertFalse(range.equals(Range.of(9, 20)));
    }

    @Test
    public void hashCode_consistencyAndCaching() {
        Range<Integer> range = Range.of(10, 20);
        int initialHashCode = range.hashCode();

        assertEquals("Hash code must be consistent", initialHashCode, range.hashCode());
        assertEquals(Range.of(10, 20).hashCode(), initialHashCode);
        assertNotEquals(Range.of(10, 21).hashCode(), initialHashCode);
    }

    @Test
    public void toString_formatsCorrect() {
        Range<Integer> range = Range.of(10, 20);
        assertEquals("[10..20]", range.toString());

        // Custom format
        String formatted = range.toString("Min: %s, Max: %s");
        assertTrue(formatted.contains("Min: 10"));
        assertTrue(formatted.contains("Max: 20"));
    }
}