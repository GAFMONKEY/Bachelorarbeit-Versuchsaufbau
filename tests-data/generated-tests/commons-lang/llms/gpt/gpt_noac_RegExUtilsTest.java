package org.apache.commons.lang3;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class gpt_noac_RegExUtilsTest {

    @Test
    public void dotAll_givenRegex_compilesWithDotAllFlagAndMatchesAcrossLines() {
        // arrange
        String regex = "a.*c";

        // act
        Pattern pattern = RegExUtils.dotAll(regex);
        boolean matches = pattern.matcher("a\nb\nc").matches();

        // assert
        Assert.assertNotNull(pattern);
        Assert.assertTrue("Pattern should have DOTALL enabled", (pattern.flags() & Pattern.DOTALL) != 0);
        Assert.assertTrue("DOTALL should allow '.' to match newline", matches);
    }

    @Test
    public void dotAllMatcher_givenCharSequence_createsMatcherThatUsesDotAll() {
        // arrange
        String regex = "a.*c";
        CharSequence text = new StringBuilder("a\nc");

        // act
        Matcher m = RegExUtils.dotAllMatcher(regex, text);

        // assert
        Assert.assertNotNull(m);
        Assert.assertTrue("DOTALL matcher should match across newline", m.matches());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void dotAllMatcher_givenStringDeprecatedOverload_behavesSameAsCharSequence() {
        // arrange
        String regex = "a.*c";
        String text = "a\nc";

        // act
        Matcher m = RegExUtils.dotAllMatcher(regex, text);

        // assert
        Assert.assertNotNull(m);
        Assert.assertTrue(m.matches());
    }

    @Test
    public void replaceAll_charSequence_whenAnyArgumentNull_returnsToStringOrNull() {
        // text null -> null
        Assert.assertNull(RegExUtils.replaceAll((CharSequence) null, Pattern.compile("a"), "x"));

        // regex null -> text.toString()
        Assert.assertEquals("abc", RegExUtils.replaceAll(new StringBuilder("abc"), null, "x"));

        // replacement null -> text.toString()
        Assert.assertEquals("abc", RegExUtils.replaceAll(new StringBuilder("abc"), Pattern.compile("a"), null));
    }

    @Test
    public void replaceAll_charSequence_whenAllNonNull_replacesAllMatches() {
        // arrange
        CharSequence text = new StringBuilder("abc123abc");
        Pattern regex = Pattern.compile("abc");

        // act
        String out = RegExUtils.replaceAll(text, regex, "X");

        // assert
        Assert.assertEquals("X123X", out);
    }

    @Test
    @SuppressWarnings("deprecation")
    public void replaceAll_stringPatternDeprecated_delegatesToCharSequenceLogicIncludingNullHandling() {
        // arrange
        Pattern regex = Pattern.compile("a");

        // act + assert
        Assert.assertNull(RegExUtils.replaceAll((String) null, regex, "x"));
        Assert.assertEquals("bbbbb", RegExUtils.replaceAll("ababa", regex, "b")); // FAILING:
        Assert.assertEquals("text", RegExUtils.replaceAll("text", (String) null, "x")); // anyNull -> original text // ADDED: (String) - ambiguous method call
        Assert.assertEquals("text", RegExUtils.replaceAll("text", regex, null)); // anyNull -> original text
    }

    @Test
    public void replaceAll_stringRegex_whenAnyArgumentNull_returnsText() {
        Assert.assertNull(RegExUtils.replaceAll((String) null, "a", "x"));
        Assert.assertEquals("hello", RegExUtils.replaceAll("hello", (String) null, "x"));
        Assert.assertEquals("hello", RegExUtils.replaceAll("hello", "l", null));
    }

    @Test(expected = PatternSyntaxException.class)
    public void replaceAll_stringRegex_whenRegexInvalid_throwsPatternSyntaxException() {
        RegExUtils.replaceAll("abc", "(", "x");
    }

    @Test
    public void removeAll_stringRegex_removesAllOccurrences() {
        // arrange
        String text = "ababa";

        // act
        String out = RegExUtils.removeAll(text, "a");

        // assert
        Assert.assertEquals("bb", out); // FAILING:
    }

    @Test
    public void removeAll_charSequencePattern_whenTextOrPatternNull_returnsToStringOrNull() {
        // text null -> null
        Assert.assertNull(RegExUtils.removeAll((CharSequence) null, Pattern.compile("a")));

        // pattern null -> text.toString()
        Assert.assertEquals("abc", RegExUtils.removeAll(new StringBuilder("abc"), null));
    }

    @Test
    public void removeFirst_charSequencePattern_removesOnlyFirstMatch() {
        // arrange
        CharSequence text = new StringBuilder("abc123abc");
        Pattern regex = Pattern.compile("abc");

        // act
        String out = RegExUtils.removeFirst(text, regex);

        // assert
        Assert.assertEquals("123abc", out);
    }

    @Test
    public void replaceFirst_charSequence_whenAnyArgumentNull_returnsToStringOrNull() {
        Assert.assertNull(RegExUtils.replaceFirst((CharSequence) null, Pattern.compile("a"), "x"));
        Assert.assertEquals("abc", RegExUtils.replaceFirst(new StringBuilder("abc"), null, "x"));
        Assert.assertEquals("abc", RegExUtils.replaceFirst(new StringBuilder("abc"), Pattern.compile("a"), null));
    }

    @Test
    public void replaceFirst_stringRegex_replacesOnlyFirstOccurrence() {
        // arrange
        String text = "foofoo";

        // act
        String out = RegExUtils.replaceFirst(text, "foo", "bar");

        // assert
        Assert.assertEquals("barfoo", out);
    }

    @Test
    public void replaceFirst_stringRegex_whenAnyArgumentNull_returnsText() {
        Assert.assertNull(RegExUtils.replaceFirst((String) null, "a", "x"));
        Assert.assertEquals("hello", RegExUtils.replaceFirst("hello", (String) null, "x"));
        Assert.assertEquals("hello", RegExUtils.replaceFirst("hello", "l", null));
    }

    @Test(expected = PatternSyntaxException.class)
    public void replaceFirst_stringRegex_whenRegexInvalid_throwsPatternSyntaxException() {
        RegExUtils.replaceFirst("abc", "(", "x");
    }

    @Test
    public void replacePattern_charSequence_usesDotAllSoDotMatchesNewlines() {
        // arrange
        CharSequence text = new StringBuilder("a\nb\nc");
        String regex = "a.*c";

        // act
        String out = RegExUtils.replacePattern(text, regex, "X");

        // assert
        Assert.assertEquals("X", out);
    }

    @Test
    public void replacePattern_charSequence_whenAnyArgumentNull_returnsToStringOrNull() {
        Assert.assertNull(RegExUtils.replacePattern((CharSequence) null, "a", "x"));
        Assert.assertEquals("abc", RegExUtils.replacePattern(new StringBuilder("abc"), null, "x"));
        Assert.assertEquals("abc", RegExUtils.replacePattern(new StringBuilder("abc"), "a", null));
    }

    @Test(expected = PatternSyntaxException.class)
    public void replacePattern_charSequence_whenRegexInvalid_throwsPatternSyntaxException() {
        RegExUtils.replacePattern(new StringBuilder("abc"), "(", "x");
    }

    @Test
    public void removePattern_charSequence_removesAcrossNewlinesBecauseDotAll() {
        // arrange
        CharSequence text = new StringBuilder("a\nb\nc");

        // act
        String out = RegExUtils.removePattern(text, "a.*c");

        // assert
        Assert.assertEquals("", out);
    }

    @Test
    public void replaceAll_stringRegex_doesNotUseDotAll_soDotDoesNotMatchNewlines() {
        // arrange
        String text = "a\nb\nc";
        String regex = "a.*c";

        // act
        String normal = RegExUtils.replaceAll(text, regex, "X");
        String dotAll = RegExUtils.replacePattern(text, regex, "X");

        // assert
        Assert.assertEquals("Without DOTALL, '.' should not span newlines, so nothing replaced", text, normal);
        Assert.assertEquals("With DOTALL, entire text should be replaced", "X", dotAll);
    }

    @Test
    public void versionSplitPattern_splitsOnLiteralDots() {
        // arrange
        String version = "1.2.3";

        // act
        String[] parts = RegExUtils.VERSION_SPLIT_PATTERN.split(version);

        // assert
        Assert.assertArrayEquals(new String[] { "1", "2", "3" }, parts);
    }

    @Test
    @SuppressWarnings("deprecation")
    public void deprecatedConstructor_canBeInstantiated() {
        Assert.assertNotNull(new RegExUtils());
    }
}