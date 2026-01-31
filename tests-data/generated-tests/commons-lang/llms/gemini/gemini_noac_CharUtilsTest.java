package org.apache.commons.lang3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit tests for {@link CharUtils} using JUnit 4 and Java 8.
 */
public class gemini_noac_CharUtilsTest {

    private static final char CHAR_A = 'A';
    private static final char CHAR_Z = 'Z';
    private static final char CHAR_a = 'a';
    private static final char CHAR_z = 'z';
    private static final char CHAR_0 = '0';
    private static final char CHAR_9 = '9';

    // --- Constructor ---

    @Test
    public void testConstructor() {
        assertNotNull(new CharUtils());
    }

    // --- Compare ---

    @Test
    public void testCompare_shouldReturnDifference() {
        assertTrue(CharUtils.compare('a', 'b') < 0);
        assertTrue(CharUtils.compare('b', 'a') > 0);
        assertEquals(0, CharUtils.compare('a', 'a'));
    }

    // --- ASCII Checks ---

    @Test
    public void testIsAscii_variousCharacters() {
        assertTrue(CharUtils.isAscii((char) 0));
        assertTrue(CharUtils.isAscii((char) 127));
        assertFalse(CharUtils.isAscii((char) 128));
        assertFalse(CharUtils.isAscii('\u0080'));
    }

    @Test
    public void testIsAsciiAlpha_variousCharacters() {
        assertTrue(CharUtils.isAsciiAlpha('a'));
        assertTrue(CharUtils.isAsciiAlpha('Z'));
        assertFalse(CharUtils.isAsciiAlpha('1'));
        assertFalse(CharUtils.isAsciiAlpha('['));
    }

    @Test
    public void testIsAsciiAlphaLower_variousCharacters() {
        assertTrue(CharUtils.isAsciiAlphaLower('a'));
        assertTrue(CharUtils.isAsciiAlphaLower('m'));
        assertTrue(CharUtils.isAsciiAlphaLower('z'));
        assertFalse(CharUtils.isAsciiAlphaLower('A'));
        assertFalse(CharUtils.isAsciiAlphaLower('1'));
    }

    @Test
    public void testIsAsciiAlphaUpper_variousCharacters() {
        assertTrue(CharUtils.isAsciiAlphaUpper('A'));
        assertTrue(CharUtils.isAsciiAlphaUpper('M'));
        assertTrue(CharUtils.isAsciiAlphaUpper('Z'));
        assertFalse(CharUtils.isAsciiAlphaUpper('a'));
        assertFalse(CharUtils.isAsciiAlphaUpper('1'));
    }

    @Test
    public void testIsAsciiAlphanumeric_variousCharacters() {
        assertTrue(CharUtils.isAsciiAlphanumeric('a'));
        assertTrue(CharUtils.isAsciiAlphanumeric('A'));
        assertTrue(CharUtils.isAsciiAlphanumeric('0'));
        assertFalse(CharUtils.isAsciiAlphanumeric('-'));
    }

    @Test
    public void testIsAsciiNumeric_variousCharacters() {
        assertTrue(CharUtils.isAsciiNumeric('0'));
        assertTrue(CharUtils.isAsciiNumeric('5'));
        assertTrue(CharUtils.isAsciiNumeric('9'));
        assertFalse(CharUtils.isAsciiNumeric('/'));
        assertFalse(CharUtils.isAsciiNumeric(':'));
        assertFalse(CharUtils.isAsciiNumeric('a'));
    }

    @Test
    public void testIsAsciiControl_variousCharacters() {
        assertTrue(CharUtils.isAsciiControl((char) 0));
        assertTrue(CharUtils.isAsciiControl((char) 31));
        assertTrue(CharUtils.isAsciiControl((char) 127));
        assertFalse(CharUtils.isAsciiControl((char) 32));
        assertFalse(CharUtils.isAsciiControl('a'));
    }

    @Test
    public void testIsAsciiPrintable_variousCharacters() {
        assertTrue(CharUtils.isAsciiPrintable((char) 32));
        assertTrue(CharUtils.isAsciiPrintable(' '));
        assertTrue(CharUtils.isAsciiPrintable('~')); // 126
        assertFalse(CharUtils.isAsciiPrintable((char) 31));
        assertFalse(CharUtils.isAsciiPrintable((char) 127));
    }

    @Test
    public void testIsHex_variousCharacters() {
        assertTrue(CharUtils.isHex('0'));
        assertTrue(CharUtils.isHex('9'));
        assertTrue(CharUtils.isHex('a'));
        assertTrue(CharUtils.isHex('f'));
        assertTrue(CharUtils.isHex('A'));
        assertTrue(CharUtils.isHex('F'));
        assertFalse(CharUtils.isHex('g'));
        assertFalse(CharUtils.isHex('G'));
        assertFalse(CharUtils.isHex(':'));
    }

    @Test
    public void testIsOctal_variousCharacters() {
        assertTrue(CharUtils.isOctal('0'));
        assertTrue(CharUtils.isOctal('7'));
        assertFalse(CharUtils.isOctal('8'));
        assertFalse(CharUtils.isOctal('a'));
    }

    // --- Conversions to char ---

    @Test
    public void testToChar_Character_success() {
        assertEquals('A', CharUtils.toChar(Character.valueOf('A')));
    }

    @Test(expected = NullPointerException.class)
    public void testToChar_Character_nullThrows() {
        CharUtils.toChar((Character) null);
    }

    @Test
    public void testToChar_CharacterDefault_success() {
        assertEquals('A', CharUtils.toChar(Character.valueOf('A'), 'X'));
        assertEquals('X', CharUtils.toChar((Character) null, 'X'));
    }

    @Test
    public void testToChar_String_success() {
        assertEquals('A', CharUtils.toChar("A"));
        assertEquals('A', CharUtils.toChar("ABC"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToChar_String_emptyThrows() {
        CharUtils.toChar("");
    }

    @Test(expected = NullPointerException.class)
    public void testToChar_String_nullThrows() {
        CharUtils.toChar((String) null); // FAILING:
    }

    @Test
    public void testToChar_StringDefault_success() {
        assertEquals('A', CharUtils.toChar("A", 'X'));
        assertEquals('X', CharUtils.toChar("", 'X'));
        assertEquals('X', CharUtils.toChar((String) null, 'X'));
    }

    // --- Conversions to Character Object ---

    @Test
    public void testToCharacterObject_char() {
        assertEquals(Character.valueOf('A'), CharUtils.toCharacterObject('A'));
    }

    @Test
    public void testToCharacterObject_String() {
        assertEquals(Character.valueOf('A'), CharUtils.toCharacterObject("A"));
        assertEquals(Character.valueOf('B'), CharUtils.toCharacterObject("BAA"));
        assertNull(CharUtils.toCharacterObject(""));
        assertNull(CharUtils.toCharacterObject((String) null));
    }

    // --- Conversions to int value ---

    @Test
    public void testToIntValue_char_success() {
        assertEquals(0, CharUtils.toIntValue('0'));
        assertEquals(9, CharUtils.toIntValue('9'));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToIntValue_char_invalidThrows() {
        CharUtils.toIntValue('A');
    }

    @Test
    public void testToIntValue_charDefault_success() {
        assertEquals(5, CharUtils.toIntValue('5', -1));
        assertEquals(-1, CharUtils.toIntValue('A', -1));
    }

    @Test
    public void testToIntValue_Character_success() {
        assertEquals(3, CharUtils.toIntValue(Character.valueOf('3')));
    }

    @Test(expected = NullPointerException.class)
    public void testToIntValue_Character_nullThrows() {
        CharUtils.toIntValue((Character) null);
    }

    @Test
    public void testToIntValue_CharacterDefault_success() {
        assertEquals(7, CharUtils.toIntValue(Character.valueOf('7'), -1));
        assertEquals(-1, CharUtils.toIntValue((Character) null, -1));
        assertEquals(-1, CharUtils.toIntValue(Character.valueOf('Z'), -1));
    }

    // --- Conversions to String ---

    @Test
    public void testToString_char() {
        // Test cached range
        assertEquals("A", CharUtils.toString('A'));
        assertEquals("\0", CharUtils.toString(CharUtils.NUL));
        // Test non-cached range (beyond 127)
        assertEquals("\u0080", CharUtils.toString((char) 128));
        assertEquals("©", CharUtils.toString('\u00a9'));
    }

    @Test
    public void testToString_Character() {
        assertEquals("A", CharUtils.toString(Character.valueOf('A')));
        assertNull(CharUtils.toString((Character) null));
    }

    // --- Unicode Escaped ---

    @Test
    public void testUnicodeEscaped_char() {
        assertEquals("\\u0041", CharUtils.unicodeEscaped('A'));
        assertEquals("\\u0061", CharUtils.unicodeEscaped('a'));
        assertEquals("\\u0000", CharUtils.unicodeEscaped((char) 0));
        assertEquals("\\u007f", CharUtils.unicodeEscaped((char) 127));
        assertEquals("\\uf0ff", CharUtils.unicodeEscaped('\uf0ff'));
    }

    @Test
    public void testUnicodeEscaped_Character() {
        assertEquals("\\u0041", CharUtils.unicodeEscaped(Character.valueOf('A')));
        assertNull(CharUtils.unicodeEscaped((Character) null));
    }
}