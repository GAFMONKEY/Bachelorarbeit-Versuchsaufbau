
package org.apache.commons.lang3;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegExUtils {

    
    static final Pattern VERSION_SPLIT_PATTERN = Pattern.compile("\\.");

    
    public static Pattern dotAll(final String regex) {
        return Pattern.compile(regex, Pattern.DOTALL);
    }

    
    public static Matcher dotAllMatcher(final String regex, final CharSequence text) {
        return dotAll(regex).matcher(text);
    }

    
    @Deprecated
    public static Matcher dotAllMatcher(final String regex, final String text) {
        return dotAll(regex).matcher(text);
    }

    
    public static String removeAll(final CharSequence text, final Pattern regex) {
        return replaceAll(text, regex, StringUtils.EMPTY);
    }

    
    @Deprecated
    public static String removeAll(final String text, final Pattern regex) {
        return replaceAll((CharSequence) text, regex, StringUtils.EMPTY);
    }

    
    public static String removeAll(final String text, final String regex) {
        return replaceAll(text, regex, StringUtils.EMPTY);
    }

    
    public static String removeFirst(final CharSequence text, final Pattern regex) {
        return replaceFirst(text, regex, StringUtils.EMPTY);
    }

    
    @Deprecated
    public static String removeFirst(final String text, final Pattern regex) {
        return replaceFirst(text, regex, StringUtils.EMPTY);
    }

    
    public static String removeFirst(final String text, final String regex) {
        return replaceFirst(text, regex, StringUtils.EMPTY);
    }

    
    public static String removePattern(final CharSequence text, final String regex) {
        return replacePattern(text, regex, StringUtils.EMPTY);
    }

    
    @Deprecated
    public static String removePattern(final String text, final String regex) {
        return replacePattern((CharSequence) text, regex, StringUtils.EMPTY);
    }

    
    public static String replaceAll(final CharSequence text, final Pattern regex, final String replacement) {
        if (ObjectUtils.anyNull(text, regex, replacement)) {
            return toStringOrNull(text);
        }
        return regex.matcher(text).replaceAll(replacement);
    }

    
    @Deprecated
    public static String replaceAll(final String text, final Pattern regex, final String replacement) {
        return replaceAll((CharSequence) text, regex, replacement);
    }

    
    public static String replaceAll(final String text, final String regex, final String replacement) {
        if (ObjectUtils.anyNull(text, regex, replacement)) {
            return text;
        }
        return text.replaceAll(regex, replacement);
    }

    
    public static String replaceFirst(final CharSequence text, final Pattern regex, final String replacement) {
        if (text == null || regex == null || replacement == null) {
            return toStringOrNull(text);
        }
        return regex.matcher(text).replaceFirst(replacement);
    }

    
    @Deprecated
    public static String replaceFirst(final String text, final Pattern regex, final String replacement) {
        return replaceFirst((CharSequence) text, regex, replacement);
    }

    
    public static String replaceFirst(final String text, final String regex, final String replacement) {
        if (text == null || regex == null || replacement == null) {
            return text;
        }
        return text.replaceFirst(regex, replacement);
    }

    
    public static String replacePattern(final CharSequence text, final String regex, final String replacement) {
        if (ObjectUtils.anyNull(text, regex, replacement)) {
            return toStringOrNull(text);
        }
        return dotAllMatcher(regex, text).replaceAll(replacement);
    }

    
    @Deprecated
    public static String replacePattern(final String text, final String regex, final String replacement) {
        return replacePattern((CharSequence) text, regex, replacement);
    }

    private static String toStringOrNull(final CharSequence text) {
        return Objects.toString(text, null);
    }

    
    @Deprecated
    public RegExUtils() {
        
    }
}
