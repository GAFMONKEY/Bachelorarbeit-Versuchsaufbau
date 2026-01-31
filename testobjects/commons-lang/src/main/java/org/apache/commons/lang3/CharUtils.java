
package org.apache.commons.lang3;

import java.util.Objects;

public class CharUtils {

    private static final String[] CHAR_STRING_ARRAY = ArrayUtils.setAll(new String[128], i -> String.valueOf((char) i));

    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final char LF = '\n';

    public static final char CR = '\r';

    public static final char NUL = '\0';

    public static int compare(final char x, final char y) {
        return x - y;
    }

    public static boolean isAscii(final char ch) {
        return ch < 128;
    }

    public static boolean isAsciiAlpha(final char ch) {
        return isAsciiAlphaUpper(ch) || isAsciiAlphaLower(ch);
    }

    public static boolean isAsciiAlphaLower(final char ch) {
        return ch >= 'a' && ch <= 'z';
    }

    public static boolean isAsciiAlphanumeric(final char ch) {
        return isAsciiAlpha(ch) || isAsciiNumeric(ch);
    }

    public static boolean isAsciiAlphaUpper(final char ch) {
        return ch >= 'A' && ch <= 'Z';
    }

    public static boolean isAsciiControl(final char ch) {
        return ch < 32 || ch == 127;
    }

    public static boolean isAsciiNumeric(final char ch) {
        return ch >= '0' && ch <= '9';
    }

    public static boolean isAsciiPrintable(final char ch) {
        return ch >= 32 && ch < 127;
    }

    public static boolean isHex(final char ch) {
        return isAsciiNumeric(ch) || ch >= 'a' && ch <= 'f' || ch >= 'A' && ch <= 'F';
    }

    public static boolean isOctal(final char ch) {
        return ch >= '0' && ch <= '7';
    }

    public static char toChar(final Character ch) {
        return Objects.requireNonNull(ch, "ch").charValue();
    }

    public static char toChar(final Character ch, final char defaultValue) {
        return ch != null ? ch.charValue() : defaultValue;
    }

    public static char toChar(final String str) {
        Validate.notEmpty(str, "The String must not be empty");
        return str.charAt(0);
    }

    public static char toChar(final String str, final char defaultValue) {
        return StringUtils.isEmpty(str) ? defaultValue : str.charAt(0);
    }

    @Deprecated
    public static Character toCharacterObject(final char c) {
        return Character.valueOf(c);
    }

    public static Character toCharacterObject(final String str) {
        return StringUtils.isEmpty(str) ? null : Character.valueOf(str.charAt(0));
    }

    public static int toIntValue(final char ch) {
        if (!isAsciiNumeric(ch)) {
            throw new IllegalArgumentException("The character " + ch + " is not in the range '0' - '9'");
        }
        return ch - 48;
    }

    public static int toIntValue(final char ch, final int defaultValue) {
        return isAsciiNumeric(ch) ? ch - 48 : defaultValue;
    }

    public static int toIntValue(final Character ch) {
        return toIntValue(toChar(ch));
    }

    public static int toIntValue(final Character ch, final int defaultValue) {
        return ch != null ? toIntValue(ch.charValue(), defaultValue) : defaultValue;
    }

    public static String toString(final char ch) {
        if (ch < CHAR_STRING_ARRAY.length) {
            return CHAR_STRING_ARRAY[ch];
        }
        return String.valueOf(ch);
    }

    public static String toString(final Character ch) {
        return ch != null ? toString(ch.charValue()) : null;
    }

    public static String unicodeEscaped(final char ch) {
        return "\\u" +
            HEX_DIGITS[ch >> 12 & 15] +
            HEX_DIGITS[ch >> 8 & 15] +
            HEX_DIGITS[ch >> 4 & 15] +
            HEX_DIGITS[ch & 15];
    }

    public static String unicodeEscaped(final Character ch) {
        return ch != null ? unicodeEscaped(ch.charValue()) : null;
    }

    @Deprecated
    public CharUtils() {
        
    }
}
