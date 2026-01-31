package org.apache.commons.lang3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.Test;

/**
 * Unit tests for {@link RegExUtils} targeting Java 8 and JUnit 4.
 * Covers edge cases, null handling, and dotAll behavior.
 */
public class gemini_noac_RegExUtilsTest {

    // --- Pattern & Matcher Tests ---

    @Test
    public void testDotAll_ShouldCompileWithDotAllFlag() {
        // Arrange
        String regex = "A.C";
        String text = "A\nC";

        // Act
        Pattern pattern = RegExUtils.dotAll(regex);

        // Assert
        assertTrue("Pattern should match newline in DOTALL mode", pattern.matcher(text).matches());
    }

    @Test
    public void testDotAllMatcher_CharSequence_ShouldMatch() {
        // Arrange
        String regex = "^.+$";
        StringBuilder text = new StringBuilder("Line1\nLine2");

        // Act
        Matcher matcher = RegExUtils.dotAllMatcher(regex, text);

        // Assert
        assertTrue(matcher.matches());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testDotAllMatcher_String_ShouldMatch() {
        // Arrange
        String regex = "^.+$";
        String text = "Line1\nLine2";

        // Act
        Matcher matcher = RegExUtils.dotAllMatcher(regex, text);

        // Assert
        assertTrue(matcher.matches());
    }

    // --- removeAll Tests ---

    @Test
    public void testRemoveAll_Pattern_ShouldRemoveAllOccurrences() {
        // Arrange
        String text = "abaaca";
        Pattern pattern = Pattern.compile("a");

        // Act
        String result = RegExUtils.removeAll(text, pattern);

        // Assert
        assertEquals("bc", result);
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testRemoveAll_DeprecatedStringPattern_ShouldRemoveAllOccurrences() {
        // Act
        String result = RegExUtils.removeAll("abaaca", Pattern.compile("a"));
        // Assert
        assertEquals("bc", result);
    }

    @Test
    public void testRemoveAll_StringRegex_ShouldRemoveAllOccurrences() {
        // Act
        String result = RegExUtils.removeAll("abaaca", "a");
        // Assert
        assertEquals("bc", result);
    }

    // --- removeFirst Tests ---

    @Test
    public void testRemoveFirst_Pattern_ShouldRemoveOnlyFirstOccurrence() {
        // Arrange
        String text = "abaaca";
        Pattern pattern = Pattern.compile("a");

        // Act
        String result = RegExUtils.removeFirst(text, pattern);

        // Assert
        assertEquals("baaca", result);
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testRemoveFirst_DeprecatedStringPattern_ShouldRemoveOnlyFirstOccurrence() {
        // Act
        String result = RegExUtils.removeFirst("abaaca", Pattern.compile("a"));
        // Assert
        assertEquals("baaca", result);
    }

    @Test
    public void testRemoveFirst_StringRegex_ShouldRemoveOnlyFirstOccurrence() {
        // Act
        String result = RegExUtils.removeFirst("abaaca", "a");
        // Assert
        assertEquals("baaca", result);
    }

    // --- removePattern Tests ---

    @Test
    public void testRemovePattern_ShouldUseDotAllBehavior() {
        // Arrange
        String text = "A\nB";
        String regex = "A.B"; // . matches \n in removePattern

        // Act
        String result = RegExUtils.removePattern(text, regex);

        // Assert
        assertEquals("", result);
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testRemovePattern_Deprecated_ShouldUseDotAllBehavior() {
        // Act
        String result = RegExUtils.removePattern("A\nB", "A.B");
        // Assert
        assertEquals("", result);
    }

    // --- replaceAll Tests ---

    @Test
    public void testReplaceAll_CharSequencePattern_ShouldReplaceAll() {
        // Arrange
        StringBuilder sb = new StringBuilder("123-456");
        Pattern pattern = Pattern.compile("\\d");

        // Act
        String result = RegExUtils.replaceAll(sb, pattern, "X");

        // Assert
        assertEquals("XXX-XXX", result);
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testReplaceAll_DeprecatedStringPattern_ShouldReplaceAll() {
        // Act
        String result = RegExUtils.replaceAll("123", Pattern.compile("\\d"), "X");
        // Assert
        assertEquals("XXX", result);
    }

    @Test
    public void testReplaceAll_StringString_ShouldReplaceAll() {
        // Act
        String result = RegExUtils.replaceAll("123-123", "123", "ABC");
        // Assert
        assertEquals("ABC-ABC", result);
    }

    // --- replaceFirst Tests ---

    @Test
    public void testReplaceFirst_CharSequencePattern_ShouldReplaceFirstOnly() {
        // Act
        String result = RegExUtils.replaceFirst("aaaa", Pattern.compile("a"), "b");
        // Assert
        assertEquals("baaa", result);
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testReplaceFirst_DeprecatedStringPattern_ShouldReplaceFirstOnly() {
        // Act
        String result = RegExUtils.replaceFirst("aaaa", Pattern.compile("a"), "b");
        // Assert
        assertEquals("baaa", result);
    }

    @Test
    public void testReplaceFirst_StringString_ShouldReplaceFirstOnly() {
        // Act
        String result = RegExUtils.replaceFirst("aaaa", "a", "b");
        // Assert
        assertEquals("baaa", result);
    }

    // --- replacePattern Tests ---

    @Test
    public void testReplacePattern_ShouldHandleComplexRegexWithNewlines() {
        // Arrange
        String text = "Start\nEnd";
        String regex = "Start.End";

        // Act
        String result = RegExUtils.replacePattern(text, regex, "Found");

        // Assert
        assertEquals("Found", result);
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testReplacePattern_Deprecated_ShouldHandleComplexRegex() {
        // Act
        String result = RegExUtils.replacePattern("Start\nEnd", "Start.End", "Found");
        // Assert
        assertEquals("Found", result);
    }

    // --- Null Handling & Edge Cases ---

    @Test
    public void testReplaceAll_WithNullInputs_ShouldReturnOriginalOrNull() {
        // CharSequence/Pattern variant
        assertNull("Null text should return null", RegExUtils.replaceAll((CharSequence) null, Pattern.compile("."), ""));
        assertEquals("Null regex should return original text", "abc", RegExUtils.replaceAll("abc", (Pattern) null, ""));
        assertEquals("Null replacement should return original text", "abc", RegExUtils.replaceAll("abc", Pattern.compile("."), null));

        // String/String variant
        assertNull("Null text should return null", RegExUtils.replaceAll((String) null, ".", ""));
        assertEquals("Null regex should return original text", "abc", RegExUtils.replaceAll("abc", (String) null, ""));
        assertEquals("Null replacement should return original text", "abc", RegExUtils.replaceAll("abc", ".", null));
    }

    @Test
    public void testReplaceFirst_WithNullInputs_ShouldReturnOriginalOrNull() {
        // CharSequence/Pattern variant
        assertNull(RegExUtils.replaceFirst((CharSequence) null, Pattern.compile("."), ""));
        assertEquals("abc", RegExUtils.replaceFirst("abc", (Pattern) null, ""));
        assertEquals("abc", RegExUtils.replaceFirst("abc", Pattern.compile("."), null));

        // String/String variant
        assertNull(RegExUtils.replaceFirst((String) null, ".", ""));
        assertEquals("abc", RegExUtils.replaceFirst("abc", (String) null, ""));
        assertEquals("abc", RegExUtils.replaceFirst("abc", ".", null));
    }

    @Test
    public void testReplacePattern_WithNullInputs_ShouldReturnOriginalOrNull() {
        assertNull(RegExUtils.replacePattern(null, ".", ""));
        assertEquals("abc", RegExUtils.replacePattern("abc", null, ""));
        assertEquals("abc", RegExUtils.replacePattern("abc", ".", null));
    }

    @Test
    public void testEmptyStrings_ShouldWorkNormally() {
        assertEquals("", RegExUtils.removeAll("", "a"));
        assertEquals("X", RegExUtils.replaceFirst(" ", " ", "X")); // FAILING:
        assertEquals("X", RegExUtils.replaceAll("", "^$", "X"));
    }

    // --- Internal & Miscellaneous ---

    @Test
    public void testVersionSplitPattern_ShouldSplitCorrectly() {
        // Arrange
        String version = "1.2.3";

        // Act
        String[] parts = RegExUtils.VERSION_SPLIT_PATTERN.split(version);

        // Assert
        assertEquals(3, parts.length);
        assertEquals("1", parts[0]);
        assertEquals("2", parts[1]);
        assertEquals("3", parts[2]);
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testConstructor_ShouldExistForBackwardCompatibility() {
        RegExUtils utils = new RegExUtils();
        assertNotNull("Constructor should be accessible", utils);
    }
}