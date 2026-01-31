package org.apache.commons.lang3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.Test;

/**
 * Unit tests for {@link RegExUtils} targeting JUnit 4 and Java 8.
 * Covers AC-1 through AC-6 including edge cases, null handling, andAssertion density (Assertions / LOC) branch coverage.
 */
public class gemini_ac_RegExUtilsTest {

    // -----------------------------------------------------------------------
    // AC-1: removeAll tests
    // -----------------------------------------------------------------------

    @Test
    public void removeAll_StringRegex_ShouldHandleAcceptanceCriteria() {
        // Arrange & Act & Assert (AC-1 Table)
        assertNull(RegExUtils.removeAll(null, "*"));
        assertEquals("any", RegExUtils.removeAll("any", (String) null));
        assertEquals("any", RegExUtils.removeAll("any", ""));
        assertEquals("", RegExUtils.removeAll("any", ".*"));
        assertEquals("", RegExUtils.removeAll("any", ".+"));
        assertEquals("", RegExUtils.removeAll("abc", ".?"));
        assertEquals("A\nB", RegExUtils.removeAll("A<__>\n<__>B", "<.*>"));
        assertEquals("AB", RegExUtils.removeAll("A<__>\n<__>B", "(?s)<.*>"));
        assertEquals("ABC123", RegExUtils.removeAll("ABCabc123abc", "[a-z]"));
    }

    @Test
    public void removeAll_PatternRegex_ShouldRemoveMatches() {
        // Arrange
        Pattern pattern = Pattern.compile("[0-9]");
        String text = "123-ABC-456";

        // Act
        String result = RegExUtils.removeAll(text, pattern);

        // Assert
        assertEquals("-ABC-", result);
    }

    @Test
    public void removeAll_DeprecatedStringOverload_ShouldFunction() {
        // Exercise deprecated method for coverage
        String result = RegExUtils.removeAll("test123test", Pattern.compile("\\d+"));
        assertEquals("testtest", result);
    }

    // -----------------------------------------------------------------------
    // AC-2: removeFirst tests
    // -----------------------------------------------------------------------

    @Test
    public void removeFirst_StringRegex_ShouldHandleAcceptanceCriteria() {
        // Arrange & Act & Assert (AC-2 Table)
        assertNull(RegExUtils.removeFirst(null, "*"));
        assertEquals("any", RegExUtils.removeFirst("any", (String) null));
        assertEquals("any", RegExUtils.removeFirst("any", ""));
        assertEquals("", RegExUtils.removeFirst("any", ".*"));
        assertEquals("", RegExUtils.removeFirst("any", ".+"));
        assertEquals("bc", RegExUtils.removeFirst("abc", ".?"));
        assertEquals("A\n<__>B", RegExUtils.removeFirst("A<__>\n<__>B", "<.*>"));
        assertEquals("AB", RegExUtils.removeFirst("A<__>\n<__>B", "(?s)<.*>"));
        assertEquals("ABCbc123", RegExUtils.removeFirst("ABCabc123", "[a-z]"));
        assertEquals("ABC123abc", RegExUtils.removeFirst("ABCabc123abc", "[a-z]+"));
    }

    @Test
    public void removeFirst_PatternRegex_ShouldRemoveOnlyFirstMatch() {
        // Arrange
        Pattern pattern = Pattern.compile("abc");
        String text = "abc-abc-abc";

        // Act
        String result = RegExUtils.removeFirst((CharSequence) text, pattern);

        // Assert
        assertEquals("-abc-abc", result);
    }

    // -----------------------------------------------------------------------
    // AC-3: removePattern tests
    // -----------------------------------------------------------------------

    @Test
    public void removePattern_ShouldHandleAcceptanceCriteria() {
        // Arrange & Act & Assert (AC-3 Table)
        assertNull(RegExUtils.removePattern(null, "<.*>"));
        assertEquals("any", RegExUtils.removePattern("any", null));
        assertEquals("AB", RegExUtils.removePattern("A<__>\n<__>B", "<.*>"));
        assertEquals("ABC123", RegExUtils.removePattern("ABCabc123", "[a-z]"));
    }

    // -----------------------------------------------------------------------
    // AC-4: replaceAll tests
    // -----------------------------------------------------------------------

    @Test
    public void replaceAll_StringRegex_ShouldHandleAcceptanceCriteria() {
        // Arrange & Act & Assert (AC-4 Table)
        assertNull(RegExUtils.replaceAll(null, "", ""));
        assertEquals("any", RegExUtils.replaceAll("any", (String) null, "")); // ADDED: "(String)" - ambiguous method reference
        assertEquals("any", RegExUtils.replaceAll("any", "", null));
        assertEquals("zzz", RegExUtils.replaceAll("", "", "zzz"));
        assertEquals("zzz", RegExUtils.replaceAll("", ".*", "zzz"));
        assertEquals("", RegExUtils.replaceAll("", ".+", "zzz"));
        assertEquals("ZZaZZbZZcZZ", RegExUtils.replaceAll("abc", "", "ZZ"));
        assertEquals("z\nz", RegExUtils.replaceAll("<__>\n<__>", "<.*>", "z"));
        assertEquals("z", RegExUtils.replaceAll("<__>\n<__>", "(?s)<.*>", "z"));
        assertEquals("ABC___123", RegExUtils.replaceAll("ABCabc123", "[a-z]", "_"));
        assertEquals("ABC_123", RegExUtils.replaceAll("ABCabc123", "[^A-Z0-9]+", "_"));
        assertEquals("ABC123", RegExUtils.replaceAll("ABCabc123", "[^A-Z0-9]+", ""));
        assertEquals("Lorem_ipsum_dolor_sit", RegExUtils.replaceAll("Lorem ipsum  dolor   sit", "( +)([a-z]+)", "_$2"));
    }

    @Test
    public void replaceAll_PatternOverload_ShouldHandleNulls() {
        // Branch coverage for Pattern variant
        assertNull(RegExUtils.replaceAll((CharSequence) null, Pattern.compile(".*"), "rep"));
        assertEquals("text", RegExUtils.replaceAll("text", (Pattern) null, "rep"));
        assertEquals("text", RegExUtils.replaceAll("text", Pattern.compile(".*"), null));
    }

    // -----------------------------------------------------------------------
    // AC-5: replaceFirst tests
    // -----------------------------------------------------------------------

    @Test
    public void replaceFirst_StringRegex_ShouldHandleAcceptanceCriteria() {
        // Arrange & Act & Assert (AC-5 Table)
        assertNull(RegExUtils.replaceFirst(null, "", ""));
        assertEquals("any", RegExUtils.replaceFirst("any", (String) null, "")); // ADDED: (String) - ambiguous method reference
        assertEquals("any", RegExUtils.replaceFirst("any", "", null));
        assertEquals("zzz", RegExUtils.replaceFirst("", "", "zzz"));
        assertEquals("zzz", RegExUtils.replaceFirst("", ".*", "zzz"));
        assertEquals("", RegExUtils.replaceFirst("", ".+", "zzz"));
        assertEquals("ZZabc", RegExUtils.replaceFirst("abc", "", "ZZ"));
        assertEquals("z\n<__>", RegExUtils.replaceFirst("<__>\n<__>", "<.*>", "z"));
        assertEquals("z", RegExUtils.replaceFirst("<__>\n<__>", "(?s)<.*>", "z"));
        assertEquals("ABC_bc123", RegExUtils.replaceFirst("ABCabc123", "[a-z]", "_"));
        assertEquals("ABC_123abc", RegExUtils.replaceFirst("ABCabc123abc", "[^A-Z0-9]+", "_"));
        assertEquals("ABC123abc", RegExUtils.replaceFirst("ABCabc123abc", "[^A-Z0-9]+", ""));
        assertEquals("Lorem_ipsum  dolor   sit", RegExUtils.replaceFirst("Lorem ipsum  dolor   sit", "( +)([a-z]+)", "_$2"));
    }

    @Test
    public void replaceFirst_PatternOverload_ShouldHandleNulls() {
        // Branch coverage for Pattern variant
        assertNull(RegExUtils.replaceFirst((CharSequence) null, Pattern.compile(".*"), "rep"));
        assertEquals("text", RegExUtils.replaceFirst("text", (Pattern) null, "rep"));
        assertEquals("text", RegExUtils.replaceFirst("text", Pattern.compile(".*"), null));
    }

    // -----------------------------------------------------------------------
    // AC-6: replacePattern tests
    // -----------------------------------------------------------------------

    @Test
    public void replacePattern_ShouldHandleAcceptanceCriteria() {
        // Arrange & Act & Assert (AC-6 Table)
        assertNull(RegExUtils.replacePattern(null, "", ""));
        assertEquals("any", RegExUtils.replacePattern("any", null, ""));
        assertEquals("any", RegExUtils.replacePattern("any", "", null));
        assertEquals("zzz", RegExUtils.replacePattern("", "", "zzz"));
        assertEquals("zzz", RegExUtils.replacePattern("", ".*", "zzz"));
        assertEquals("", RegExUtils.replacePattern("", ".+", "zzz"));
        assertEquals("z", RegExUtils.replacePattern("<__>\n<__>", "<.*>", "z"));
        assertEquals("ABC___123", RegExUtils.replacePattern("ABCabc123", "[a-z]", "_"));
        assertEquals("ABC_123", RegExUtils.replacePattern("ABCabc123", "[^A-Z0-9]+", "_"));
        assertEquals("ABC123", RegExUtils.replacePattern("ABCabc123", "[^A-Z0-9]+", ""));
        assertEquals("Lorem_ipsum_dolor_sit", RegExUtils.replacePattern("Lorem ipsum  dolor   sit", "( +)([a-z]+)", "_$2"));
    }

    // -----------------------------------------------------------------------
    // Additional Edge Cases & Utility Coverage
    // -----------------------------------------------------------------------

    @Test
    public void dotAllMatcher_ShouldMatchAcrossNewlines() {
        // Arrange
        String text = "First Line\nSecond Line";
        String regex = "First.*Second";

        // Act
        Matcher matcher = RegExUtils.dotAllMatcher(regex, text);

        // Assert
        assertEquals(true, matcher.find());
    }

    @Test
    public void dotAllMatcher_DeprecatedStringOverload_ShouldFunction() {
        // Coverage for deprecated Matcher dotAllMatcher(String, String)
        Matcher matcher = RegExUtils.dotAllMatcher("A.B", "A\nB");
        assertEquals(true, matcher.find());
    }

    @Test
    public void dotAll_ShouldCompileWithDotAllFlag() {
        // Act
        Pattern p = RegExUtils.dotAll(".*");

        // Assert
        assertEquals(Pattern.DOTALL, p.flags() & Pattern.DOTALL);
    }

    @Test
    public void constructor_ExerciseDeprecatedConstructor() {
        // Exercise for 100% coverage
        new RegExUtils();
    }

    @Test
    public void replacePattern_NullHandlingBranch() {
        // Tests the toStringOrNull utility indirectly through replacePattern
        assertNull(RegExUtils.replacePattern(null, "regex", "replacement"));
    }

    @Test
    public void versionSplitPattern_VerifyConstant() {
        // Assert the internal split pattern is correct
        assertNotNull(RegExUtils.VERSION_SPLIT_PATTERN);
        String[] parts = RegExUtils.VERSION_SPLIT_PATTERN.split("1.2.3");
        assertEquals(3, parts.length);
        assertEquals("1", parts[0]);
    }
}