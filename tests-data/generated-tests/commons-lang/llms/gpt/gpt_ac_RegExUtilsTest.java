package org.apache.commons.lang3;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class gpt_ac_RegExUtilsTest {

    // --------------------
    // dotAll / dotAllMatcher
    // --------------------

    @Test
    public void dotAll_whenCompiled_shouldHaveDotAllFlagAndMatchAcrossNewlines() {
        // arrange
        String regex = "<.*>";
        String text = "<__>\n<__>";

        // act
        Pattern p = RegExUtils.dotAll(regex);
        String replaced = p.matcher(text).replaceAll("z");

        // assert
        Assert.assertTrue((p.flags() & Pattern.DOTALL) != 0);
        Assert.assertEquals("z", replaced);
    }

    @Test
    public void dotAllMatcher_whenUsed_shouldReturnMatcherThatUsesDotAll() {
        // arrange
        String regex = "<.*>";
        CharSequence text = "A<__>\n<__>B";

        // act
        Matcher m = RegExUtils.dotAllMatcher(regex, text);
        String out = m.replaceAll("");

        // assert (DOTALL removes across newline => "AB")
        Assert.assertEquals("AB", out);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void dotAllMatcher_deprecatedStringOverload_shouldBehaveSameAsCharSequence() {
        // arrange
        String regex = "<.*>";
        String text = "A<__>\n<__>B";

        // act
        String out = RegExUtils.dotAllMatcher(regex, text).replaceAll("");

        // assert
        Assert.assertEquals("AB", out);
    }

    @Test(expected = PatternSyntaxException.class)
    public void dotAll_whenRegexInvalid_shouldThrowPatternSyntaxException() {
        RegExUtils.dotAll("*");
    }

    // --------------------
    // AC-1: removeAll(text, regexString)
    // --------------------

    @Test
    public void removeAll_stringRegex_acceptanceCases() {
        Assert.assertNull(RegExUtils.removeAll((String) null, "*")); // invalid regex should not be evaluated
        Assert.assertEquals("any", RegExUtils.removeAll("any", (String) null));
        Assert.assertEquals("any", RegExUtils.removeAll("any", ""));
        Assert.assertEquals("", RegExUtils.removeAll("any", ".*"));
        Assert.assertEquals("", RegExUtils.removeAll("any", ".+"));
        Assert.assertEquals("", RegExUtils.removeAll("abc", ".?"));
        Assert.assertEquals("A\nB", RegExUtils.removeAll("A<__>\n<__>B", "<.*>"));
        Assert.assertEquals("AB", RegExUtils.removeAll("A<__>\n<__>B", "(?s)<.*>"));
        Assert.assertEquals("ABC123", RegExUtils.removeAll("ABCabc123abc", "[a-z]"));
    }

    @Test(expected = PatternSyntaxException.class)
    public void removeAll_stringRegex_whenRegexInvalidAndTextNonNull_shouldThrowPatternSyntaxException() {
        RegExUtils.removeAll("abc", "*");
    }

    // --------------------
    // AC-2: removeFirst(text, regexString)
    // --------------------

    @Test
    public void removeFirst_stringRegex_acceptanceCases() {
        Assert.assertNull(RegExUtils.removeFirst((String) null, "*")); // invalid regex should not be evaluated
        Assert.assertEquals("any", RegExUtils.removeFirst("any", (String) null));
        Assert.assertEquals("any", RegExUtils.removeFirst("any", ""));
        Assert.assertEquals("", RegExUtils.removeFirst("any", ".*"));
        Assert.assertEquals("", RegExUtils.removeFirst("any", ".+"));
        Assert.assertEquals("bc", RegExUtils.removeFirst("abc", ".?"));
        Assert.assertEquals("A\n<__>B", RegExUtils.removeFirst("A<__>\n<__>B", "<.*>"));
        Assert.assertEquals("AB", RegExUtils.removeFirst("A<__>\n<__>B", "(?s)<.*>"));
        Assert.assertEquals("ABCbc123", RegExUtils.removeFirst("ABCabc123", "[a-z]"));
        Assert.assertEquals("ABC123abc", RegExUtils.removeFirst("ABCabc123abc", "[a-z]+"));
    }

    @Test(expected = PatternSyntaxException.class)
    public void removeFirst_stringRegex_whenRegexInvalidAndTextNonNull_shouldThrowPatternSyntaxException() {
        RegExUtils.removeFirst("abc", "*");
    }

    // --------------------
    // AC-3: removePattern(text, regexString) => DOTALL
    // --------------------

    @Test
    public void removePattern_acceptanceCases() {
        Assert.assertNull(RegExUtils.removePattern((CharSequence) null, "<.*>"));
        Assert.assertEquals("any", RegExUtils.removePattern((CharSequence) "any", null));
        Assert.assertEquals("AB", RegExUtils.removePattern((CharSequence) "A<__>\n<__>B", "<.*>")); // DOTALL
        Assert.assertEquals("ABC123", RegExUtils.removePattern((CharSequence) "ABCabc123", "[a-z]"));
    }

    @SuppressWarnings("deprecation")
    @Test
    public void removePattern_deprecatedStringOverload_shouldDelegate() {
        Assert.assertEquals("AB", RegExUtils.removePattern("A<__>\n<__>B", "<.*>"));
    }

    // --------------------
    // AC-4: replaceAll(text, regexString, replacement)
    // --------------------

    @Test
    public void replaceAll_stringRegex_acceptanceCases() {
        Assert.assertNull(RegExUtils.replaceAll((String) null, "", ""));
        Assert.assertEquals("any", RegExUtils.replaceAll("any", (String) null, "")); // ADDED: "(String)" - ambiguous method reference
        Assert.assertEquals("any", RegExUtils.replaceAll("any", "", null));
        Assert.assertEquals("zzz", RegExUtils.replaceAll("", "", "zzz"));
        Assert.assertEquals("zzz", RegExUtils.replaceAll("", ".*", "zzz"));
        Assert.assertEquals("", RegExUtils.replaceAll("", ".+", "zzz"));
        Assert.assertEquals("ZZaZZbZZcZZ", RegExUtils.replaceAll("abc", "", "ZZ"));
        Assert.assertEquals("z\nz", RegExUtils.replaceAll("<__>\n<__>", "<.*>", "z"));
        Assert.assertEquals("z", RegExUtils.replaceAll("<__>\n<__>", "(?s)<.*>", "z"));
        Assert.assertEquals("ABC___123", RegExUtils.replaceAll("ABCabc123", "[a-z]", "_"));
        Assert.assertEquals("ABC_123", RegExUtils.replaceAll("ABCabc123", "[^A-Z0-9]+", "_"));
        Assert.assertEquals("ABC123", RegExUtils.replaceAll("ABCabc123", "[^A-Z0-9]+", ""));
        Assert.assertEquals("Lorem_ipsum_dolor_sit",
                RegExUtils.replaceAll("Lorem ipsum  dolor   sit", "( +)([a-z]+)", "_$2"));
    }

    @Test(expected = PatternSyntaxException.class)
    public void replaceAll_stringRegex_whenRegexInvalidAndTextNonNull_shouldThrowPatternSyntaxException() {
        RegExUtils.replaceAll("abc", "*", "x");
    }

    // --------------------
    // AC-5: replaceFirst(text, regexString, replacement)
    // --------------------

    @Test
    public void replaceFirst_stringRegex_acceptanceCases() {
        Assert.assertNull(RegExUtils.replaceFirst((String) null, "", ""));
        Assert.assertEquals("any", RegExUtils.replaceFirst("any", (String) null, "")); // ADDED: "(String)" - ambiguous method reference
        Assert.assertEquals("any", RegExUtils.replaceFirst("any", "", null));
        Assert.assertEquals("zzz", RegExUtils.replaceFirst("", "", "zzz"));
        Assert.assertEquals("zzz", RegExUtils.replaceFirst("", ".*", "zzz"));
        Assert.assertEquals("", RegExUtils.replaceFirst("", ".+", "zzz"));
        Assert.assertEquals("ZZabc", RegExUtils.replaceFirst("abc", "", "ZZ"));
        Assert.assertEquals("z\n<__>", RegExUtils.replaceFirst("<__>\n<__>", "<.*>", "z"));
        Assert.assertEquals("z", RegExUtils.replaceFirst("<__>\n<__>", "(?s)<.*>", "z"));
        Assert.assertEquals("ABC_bc123", RegExUtils.replaceFirst("ABCabc123", "[a-z]", "_"));
        Assert.assertEquals("ABC_123abc", RegExUtils.replaceFirst("ABCabc123abc", "[^A-Z0-9]+", "_"));
        Assert.assertEquals("ABC123abc", RegExUtils.replaceFirst("ABCabc123abc", "[^A-Z0-9]+", ""));
        Assert.assertEquals("Lorem_ipsum  dolor   sit",
                RegExUtils.replaceFirst("Lorem ipsum  dolor   sit", "( +)([a-z]+)", "_$2"));
    }

    @Test(expected = PatternSyntaxException.class)
    public void replaceFirst_stringRegex_whenRegexInvalidAndTextNonNull_shouldThrowPatternSyntaxException() {
        RegExUtils.replaceFirst("abc", "*", "x");
    }

    // --------------------
    // AC-6: replacePattern(text, regexString, replacement) => DOTALL
    // --------------------

    @Test
    public void replacePattern_acceptanceCases_andDotAllBehavior() {
        Assert.assertNull(RegExUtils.replacePattern((CharSequence) null, "", ""));
        Assert.assertEquals("any", RegExUtils.replacePattern((CharSequence) "any", null, ""));
        Assert.assertEquals("any", RegExUtils.replacePattern((CharSequence) "any", "", null));
        Assert.assertEquals("zzz", RegExUtils.replacePattern((CharSequence) "", "", "zzz"));
        Assert.assertEquals("zzz", RegExUtils.replacePattern((CharSequence) "", ".*", "zzz"));
        Assert.assertEquals("", RegExUtils.replacePattern((CharSequence) "", ".+", "zzz"));

        // DOTALL: "<.*>" matches across newline and can consume the entire string
        Assert.assertEquals("z", RegExUtils.replacePattern((CharSequence) "<__>\n<__>", "<.*>", "z"));

        Assert.assertEquals("ABC___123", RegExUtils.replacePattern((CharSequence) "ABCabc123", "[a-z]", "_"));
        Assert.assertEquals("ABC_123", RegExUtils.replacePattern((CharSequence) "ABCabc123", "[^A-Z0-9]+", "_"));
        Assert.assertEquals("ABC123", RegExUtils.replacePattern((CharSequence) "ABCabc123", "[^A-Z0-9]+", ""));
        Assert.assertEquals("Lorem_ipsum_dolor_sit",
                RegExUtils.replacePattern((CharSequence) "Lorem ipsum  dolor   sit", "( +)([a-z]+)", "_$2"));
    }

    @Test(expected = PatternSyntaxException.class)
    public void replacePattern_whenRegexInvalidAndTextNonNull_shouldThrowPatternSyntaxException() {
        RegExUtils.replacePattern((CharSequence) "abc", "*", "x");
    }

    @SuppressWarnings("deprecation")
    @Test
    public void replacePattern_deprecatedStringOverload_shouldDelegate() {
        Assert.assertEquals("AB", RegExUtils.replacePattern("A<__>\n<__>B", "<.*>", ""));
    }

    // --------------------
    // Pattern overloads / null-handling branches (extra coverage)
    // --------------------

    @Test
    public void replaceAll_charSequencePattern_whenAnyArgNull_shouldReturnTextToStringOrNull() {
        // text null => null
        Assert.assertNull(RegExUtils.replaceAll((CharSequence) null, Pattern.compile("a"), "x"));

        // regex null => text.toString()
        Assert.assertEquals("abc", RegExUtils.replaceAll((CharSequence) new StringBuilder("abc"), null, "x"));

        // replacement null => text.toString()
        Assert.assertEquals("abc", RegExUtils.replaceAll((CharSequence) new StringBuilder("abc"), Pattern.compile("b"), null));
    }

    @SuppressWarnings("deprecation")
    @Test
    public void patternOverloads_deprecatedStringVariants_shouldDelegateToCharSequence() {
        Pattern b = Pattern.compile("b");
        Assert.assertEquals("ac", RegExUtils.removeAll("abc", b));
        Assert.assertEquals("ac", RegExUtils.removeFirst("abc", b));
        Assert.assertEquals("aXc", RegExUtils.replaceFirst("abc", b, "X"));
        Assert.assertEquals("aXc", RegExUtils.replaceAll("abc", b, "X"));
    }

    @Test
    public void replaceFirst_charSequencePattern_whenAnyArgNull_shouldReturnTextToStringOrNull() {
        Assert.assertNull(RegExUtils.replaceFirst((CharSequence) null, Pattern.compile("a"), "x"));
        Assert.assertEquals("abc", RegExUtils.replaceFirst((CharSequence) new StringBuilder("abc"), null, "x"));
        Assert.assertEquals("abc", RegExUtils.replaceFirst((CharSequence) new StringBuilder("abc"), Pattern.compile("b"), null));
    }

    // --------------------
    // Misc: VERSION_SPLIT_PATTERN + deprecated constructor
    // --------------------

    @Test
    public void versionSplitPattern_shouldSplitOnDotOnly() {
        Assert.assertArrayEquals(new String[]{"1", "2", "3"}, RegExUtils.VERSION_SPLIT_PATTERN.split("1.2.3"));
        Assert.assertArrayEquals(new String[]{"1-2"}, RegExUtils.VERSION_SPLIT_PATTERN.split("1-2"));
    }

    @SuppressWarnings("deprecation")
    @Test
    public void constructor_deprecated_shouldNotThrow() {
        new RegExUtils();
    }
}