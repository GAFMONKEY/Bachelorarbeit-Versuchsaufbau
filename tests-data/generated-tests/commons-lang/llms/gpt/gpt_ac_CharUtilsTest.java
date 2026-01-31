package org.apache.commons.lang3;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class gpt_ac_CharUtilsTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    // ----------------------------
    // AC-1: compare
    // ----------------------------

    @Test
    public void compare_whenSameChars_thenZero() {
        // act
        int result = CharUtils.compare('a', 'a');

        // assert
        assertEquals(0, result);
    }

    @Test
    public void compare_whenFirstLessThanSecond_thenNegativeOneForAdjacentAscii() {
        // act
        int result = CharUtils.compare('a', 'b');

        // assert
        assertEquals(-1, result);
        assertTrue("Expected a negative result", result < 0);
    }

    @Test
    public void compare_whenFirstGreaterThanSecond_thenPositiveOneForAdjacentAscii() {
        // act
        int result = CharUtils.compare('b', 'a');

        // assert
        assertEquals(1, result);
        assertTrue("Expected a positive result", result > 0);
    }

    // ----------------------------
    // AC-2: ASCII character classification
    // ----------------------------

    @Test
    public void isAscii_givenTypicalAsciiCharacters_thenTrue_andNonAscii_thenFalse() {
        assertTrue(CharUtils.isAscii('a'));
        assertTrue(CharUtils.isAscii('A'));
        assertTrue(CharUtils.isAscii('3'));
        assertTrue(CharUtils.isAscii('-'));
        assertTrue(CharUtils.isAscii('\n'));

        assertFalse(CharUtils.isAscii('\u00A9')); // ©
        assertTrue(CharUtils.isAscii((char) 127));
        assertFalse(CharUtils.isAscii((char) 128));
    }

    @Test
    public void isAsciiAlpha_givenLetters_thenTrue_andOthers_thenFalse() {
        assertTrue(CharUtils.isAsciiAlpha('a'));
        assertTrue(CharUtils.isAsciiAlpha('A'));

        assertFalse(CharUtils.isAsciiAlpha('3'));
        assertFalse(CharUtils.isAsciiAlpha('-'));
        assertFalse(CharUtils.isAsciiAlpha('\n'));
        assertFalse(CharUtils.isAsciiAlpha('\u00A9')); // ©
    }

    @Test
    public void isAsciiAlphaLower_givenLowercaseRange_thenTrue_otherwiseFalse() {
        assertTrue(CharUtils.isAsciiAlphaLower('a'));
        assertTrue(CharUtils.isAsciiAlphaLower('z'));

        assertFalse(CharUtils.isAsciiAlphaLower('A'));
        assertFalse(CharUtils.isAsciiAlphaLower('`')); // before 'a'
        assertFalse(CharUtils.isAsciiAlphaLower('{')); // after 'z'
        assertFalse(CharUtils.isAsciiAlphaLower('3'));
        assertFalse(CharUtils.isAsciiAlphaLower('-'));
        assertFalse(CharUtils.isAsciiAlphaLower('\n'));
        assertFalse(CharUtils.isAsciiAlphaLower('\u00A9')); // ©
    }

    @Test
    public void isAsciiAlphaUpper_givenUppercaseRange_thenTrue_otherwiseFalse() {
        assertTrue(CharUtils.isAsciiAlphaUpper('A'));
        assertTrue(CharUtils.isAsciiAlphaUpper('Z'));

        assertFalse(CharUtils.isAsciiAlphaUpper('a'));
        assertFalse(CharUtils.isAsciiAlphaUpper('@')); // before 'A'
        assertFalse(CharUtils.isAsciiAlphaUpper('[')); // after 'Z'
        assertFalse(CharUtils.isAsciiAlphaUpper('3'));
        assertFalse(CharUtils.isAsciiAlphaUpper('-'));
        assertFalse(CharUtils.isAsciiAlphaUpper('\n'));
        assertFalse(CharUtils.isAsciiAlphaUpper('\u00A9')); // ©
    }

    @Test
    public void isAsciiAlphanumeric_givenAlphaOrDigit_thenTrue_otherwiseFalse() {
        assertTrue(CharUtils.isAsciiAlphanumeric('a')); // alpha path
        assertTrue(CharUtils.isAsciiAlphanumeric('A')); // alpha path
        assertTrue(CharUtils.isAsciiAlphanumeric('3')); // numeric path

        assertFalse(CharUtils.isAsciiAlphanumeric('-'));
        assertFalse(CharUtils.isAsciiAlphanumeric('\n'));
        assertFalse(CharUtils.isAsciiAlphanumeric('\u00A9')); // ©
    }

    @Test
    public void isAsciiControl_givenControlChars_thenTrue_otherwiseFalse() {
        assertTrue(CharUtils.isAsciiControl('\n'));      // < 32
        assertTrue(CharUtils.isAsciiControl((char) 0));  // NUL
        assertTrue(CharUtils.isAsciiControl((char) 31)); // last < 32
        assertTrue(CharUtils.isAsciiControl((char) 127));// DEL

        assertFalse(CharUtils.isAsciiControl((char) 32));
        assertFalse(CharUtils.isAsciiControl('a'));
        assertFalse(CharUtils.isAsciiControl('A'));
        assertFalse(CharUtils.isAsciiControl('3'));
        assertFalse(CharUtils.isAsciiControl('-'));
        assertFalse(CharUtils.isAsciiControl('\u00A9')); // ©
    }

    @Test
    public void isAsciiNumeric_givenDigits_thenTrue_otherwiseFalse() {
        assertTrue(CharUtils.isAsciiNumeric('0'));
        assertTrue(CharUtils.isAsciiNumeric('9'));

        assertFalse(CharUtils.isAsciiNumeric('/')); // before '0'
        assertFalse(CharUtils.isAsciiNumeric(':')); // after '9'
        assertFalse(CharUtils.isAsciiNumeric('a'));
        assertFalse(CharUtils.isAsciiNumeric('A'));
        assertFalse(CharUtils.isAsciiNumeric('-'));
        assertFalse(CharUtils.isAsciiNumeric('\n'));
        assertFalse(CharUtils.isAsciiNumeric('\u00A9')); // ©
    }

    @Test
    public void isAsciiPrintable_givenPrintableRange_thenTrue_otherwiseFalse() {
        assertTrue(CharUtils.isAsciiPrintable('a'));
        assertTrue(CharUtils.isAsciiPrintable('A'));
        assertTrue(CharUtils.isAsciiPrintable('3'));
        assertTrue(CharUtils.isAsciiPrintable('-'));

        assertTrue(CharUtils.isAsciiPrintable((char) 32));  // space boundary
        assertTrue(CharUtils.isAsciiPrintable((char) 126)); // '~' boundary

        assertFalse(CharUtils.isAsciiPrintable('\n'));       // control
        assertFalse(CharUtils.isAsciiPrintable((char) 31));  // control
        assertFalse(CharUtils.isAsciiPrintable((char) 127)); // not < 127
        assertFalse(CharUtils.isAsciiPrintable('\u00A9'));   // ©
    }

    // ----------------------------
    // AC-3: isHex
    // ----------------------------

    @Test
    public void isHex_givenHexDigits_thenTrue_otherwiseFalse() {
        assertTrue(CharUtils.isHex('0'));
        assertTrue(CharUtils.isHex('9'));

        assertTrue(CharUtils.isHex('a'));
        assertTrue(CharUtils.isHex('f'));
        assertFalse(CharUtils.isHex('g'));

        assertTrue(CharUtils.isHex('A'));
        assertTrue(CharUtils.isHex('F'));
        assertFalse(CharUtils.isHex('G'));

        assertFalse(CharUtils.isHex('#'));
        assertFalse(CharUtils.isHex('-'));
        assertFalse(CharUtils.isHex('\n'));
        assertFalse(CharUtils.isHex('\u00A9')); // ©
    }

    // ----------------------------
    // AC-4: isOctal
    // ----------------------------

    @Test
    public void isOctal_given0to7_thenTrue_otherwiseFalse() {
        assertTrue(CharUtils.isOctal('0'));
        assertTrue(CharUtils.isOctal('7'));

        assertFalse(CharUtils.isOctal('8'));
        assertFalse(CharUtils.isOctal('9'));
        assertFalse(CharUtils.isOctal('a'));
        assertFalse(CharUtils.isOctal('/')); // before '0'
        assertFalse(CharUtils.isOctal(':')); // after '9'
    }

    // ----------------------------
    // AC-5: toChar
    // ----------------------------

    @Test
    public void toChar_givenNullCharacter_thenThrowsNullPointerException() {
        thrown.expect(NullPointerException.class);
        thrown.expectMessage("ch");

        CharUtils.toChar((Character) null);
    }

    @Test
    public void toChar_givenNonNullCharacter_thenReturnsCharValue() {
        assertEquals(' ', CharUtils.toChar(Character.valueOf(' ')));
        assertEquals('A', CharUtils.toChar(Character.valueOf('A')));
    }

    @Test
    public void toChar_withDefault_givenNullCharacter_thenReturnsDefault() {
        assertEquals('X', CharUtils.toChar((Character) null, 'X'));
    }

    @Test
    public void toChar_withDefault_givenNonNullCharacter_thenReturnsCharacterValue() {
        assertEquals(' ', CharUtils.toChar(Character.valueOf(' '), 'X'));
        assertEquals('A', CharUtils.toChar(Character.valueOf('A'), 'X'));
    }

    @Test
    public void toChar_givenStringSingleChar_thenReturnsFirstChar() {
        assertEquals('A', CharUtils.toChar("A"));
    }

    @Test
    public void toChar_givenStringMultipleChars_thenReturnsFirstChar() {
        assertEquals('B', CharUtils.toChar("BA"));
    }

    @Test
    public void toChar_givenNullString_thenThrowsNullPointerException() {
        thrown.expect(NullPointerException.class);
        CharUtils.toChar((String) null);
    }

    @Test
    public void toChar_givenEmptyString_thenThrowsIllegalArgumentExceptionWithMessage() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("The String must not be empty");

        CharUtils.toChar("");
    }

    @Test
    public void toChar_stringWithDefault_givenNullOrEmpty_thenReturnsDefault_otherwiseFirstChar() {
        assertEquals('X', CharUtils.toChar((String) null, 'X'));
        assertEquals('X', CharUtils.toChar("", 'X'));

        assertEquals('A', CharUtils.toChar("A", 'X'));
        assertEquals('B', CharUtils.toChar("BA", 'X'));
    }

    @Test
    public void toCharacterObject_givenChar_thenReturnsCharacterWrapper() {
        assertEquals(Character.valueOf('A'), CharUtils.toCharacterObject('A'));
        assertEquals(Character.valueOf('\n'), CharUtils.toCharacterObject(CharUtils.LF));
    }

    @Test
    public void toCharacterObject_givenStringNullOrEmpty_thenReturnsNull_otherwiseFirstChar() {
        assertNull(CharUtils.toCharacterObject((String) null));
        assertNull(CharUtils.toCharacterObject(""));

        assertEquals(Character.valueOf('A'), CharUtils.toCharacterObject("A"));
        assertEquals(Character.valueOf('B'), CharUtils.toCharacterObject("BA"));
    }

    // ----------------------------
    // AC-6: toIntValue
    // ----------------------------

    @Test
    public void toIntValue_givenDigitChar_thenReturnsNumericValue() {
        assertEquals(3, CharUtils.toIntValue('3'));
        assertEquals(0, CharUtils.toIntValue('0'));
        assertEquals(9, CharUtils.toIntValue('9'));
    }

    @Test
    public void toIntValue_givenNonDigitChar_thenThrowsIllegalArgumentException() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("not in the range");

        CharUtils.toIntValue('A');
    }

    @Test
    public void toIntValue_withDefault_givenDigit_thenReturnsNumericValue_otherwiseDefault() {
        assertEquals(3, CharUtils.toIntValue('3', -1));
        assertEquals(-1, CharUtils.toIntValue('A', -1));
        assertEquals(42, CharUtils.toIntValue('-', 42));
    }

    @Test
    public void toIntValue_givenCharacterWrapperDigit_thenReturnsNumericValue() {
        assertEquals(3, CharUtils.toIntValue(Character.valueOf('3')));
    }

    @Test
    public void toIntValue_givenCharacterWrapperNull_thenThrowsNullPointerException() {
        thrown.expect(NullPointerException.class);
        thrown.expectMessage("ch");

        CharUtils.toIntValue((Character) null);
    }

    @Test
    public void toIntValue_givenCharacterWrapperNonDigit_thenThrowsIllegalArgumentException() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("not in the range");

        CharUtils.toIntValue(Character.valueOf('A'));
    }

    @Test
    public void toIntValue_characterWrapperWithDefault_givenNull_thenReturnsDefault() {
        assertEquals(-1, CharUtils.toIntValue((Character) null, -1));
    }

    @Test
    public void toIntValue_characterWrapperWithDefault_givenDigit_thenReturnsNumericValue_otherwiseDefault() {
        assertEquals(3, CharUtils.toIntValue(Character.valueOf('3'), -1));
        assertEquals(-1, CharUtils.toIntValue(Character.valueOf('A'), -1));
    }

    // ----------------------------
    // AC-7: toString
    // ----------------------------

    @Test
    public void toString_givenCharSpaceAndA_thenReturnsSingleCharString() {
        assertEquals(" ", CharUtils.toString(' '));
        assertEquals("A", CharUtils.toString('A'));
    }

    @Test
    public void toString_givenCharacterNull_thenReturnsNull() {
        assertNull(CharUtils.toString((Character) null));
    }

    @Test
    public void toString_givenCharacterNonNull_thenReturnsString() {
        assertEquals(" ", CharUtils.toString(Character.valueOf(' ')));
        assertEquals("A", CharUtils.toString(Character.valueOf('A')));
    }

    @Test
    public void toString_whenAsciiChar_thenReturnsCachedStringInstance() {
        // arrange
        char ch = 'A';

        // act
        String s1 = CharUtils.toString(ch);
        String s2 = CharUtils.toString(ch);

        // assert
        assertEquals("A", s1);
        assertSame("ASCII characters should use the cached String instance", s1, s2);
    }

    @Test
    public void toString_whenNonAsciiChar_thenReturnsNewStringValueEachCall() {
        // arrange
        char ch = (char) 128; // forces else branch (not < 128)

        // act
        String s1 = CharUtils.toString(ch);
        String s2 = CharUtils.toString(ch);

        // assert
        assertEquals(1, s1.length());
        assertEquals(ch, s1.charAt(0));
        assertEquals(s1, s2);
        assertNotSame("Non-ASCII characters should not come from the ASCII cache", s1, s2);
    }

    // ----------------------------
    // AC-8: unicodeEscaped
    // ----------------------------

    @Test
    public void unicodeEscaped_givenCharSpaceAndA_thenReturnsExpectedEscape() {
        assertEquals("\\u0020", CharUtils.unicodeEscaped(' '));
        assertEquals("\\u0041", CharUtils.unicodeEscaped('A'));
    }

    @Test
    public void unicodeEscaped_givenCharacterNull_thenReturnsNull() {
        assertNull(CharUtils.unicodeEscaped((Character) null));
    }

    @Test
    public void unicodeEscaped_givenCharacterNonNull_thenReturnsExpectedEscape() {
        assertEquals("\\u0020", CharUtils.unicodeEscaped(Character.valueOf(' ')));
        assertEquals("\\u0041", CharUtils.unicodeEscaped(Character.valueOf('A')));
    }

    @Test
    public void unicodeEscaped_givenEdgeValues_thenFormatsLowercaseHexAndPadsToFourDigits() {
        assertEquals("\\u0000", CharUtils.unicodeEscaped(CharUtils.NUL));
        assertEquals("\\u000a", CharUtils.unicodeEscaped(CharUtils.LF));
        assertEquals("\\u00a9", CharUtils.unicodeEscaped('\u00A9')); // © uses lowercase hex digits in implementation
        assertEquals("\\u007f", CharUtils.unicodeEscaped((char) 127));
        assertEquals("\\u0080", CharUtils.unicodeEscaped((char) 128));
    }

    // ----------------------------
    // Extra: constants sanity
    // ----------------------------

    @Test
    public void constants_shouldMatchExpectedAsciiCodes() {
        assertEquals('\n', CharUtils.LF);
        assertEquals('\r', CharUtils.CR);
        assertEquals('\0', CharUtils.NUL);
    }
}