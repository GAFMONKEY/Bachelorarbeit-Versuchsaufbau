package org.apache.commons.lang3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit tests for CharUtils focusing on AC compliance, boundary conditions, and branch coverage.
 */
public class gemini_ac_CharUtilsTest {

    // -----------------------------------------------------------------------
    // AC-1: Comparing two characters
    // -----------------------------------------------------------------------

    @Test
    public void testCompare_WhenCharsAreEqual_ReturnsZero() {
        assertEquals(0, CharUtils.compare('a', 'a'));
    }

    @Test
    public void testCompare_WhenFirstIsSmaller_ReturnsNegative() {
        assertTrue(CharUtils.compare('a', 'b') < 0);
    }

    @Test
    public void testCompare_WhenFirstIsLarger_ReturnsPositive() {
        assertTrue(CharUtils.compare('b', 'a') > 0);
    }

    // -----------------------------------------------------------------------
    // AC-2: ASCII character classification
    // -----------------------------------------------------------------------

    @Test
    public void testIsAscii_VariousInputs_ReturnsExpected() {
        assertTrue(CharUtils.isAscii('a'));
        assertTrue(CharUtils.isAscii('A'));
        assertTrue(CharUtils.isAscii('3'));
        assertTrue(CharUtils.isAscii('-'));
        assertTrue(CharUtils.isAscii('\n'));
        assertTrue(CharUtils.isAscii((char) 127)); // Boundary
        assertFalse(CharUtils.isAscii((char) 128)); // Boundary
        assertFalse(CharUtils.isAscii('©'));
    }

    @Test
    public void testIsAsciiAlpha_VariousInputs_ReturnsExpected() {
        assertTrue(CharUtils.isAsciiAlpha('a'));
        assertTrue(CharUtils.isAsciiAlpha('A'));
        assertFalse(CharUtils.isAsciiAlpha('3'));
        assertFalse(CharUtils.isAsciiAlpha('-'));
        assertFalse(CharUtils.isAsciiAlpha('\n'));
        assertFalse(CharUtils.isAsciiAlpha('©'));
    }

    @Test
    public void testIsAsciiAlphaLower_VariousInputs_ReturnsExpected() {
        assertTrue(CharUtils.isAsciiAlphaLower('a'));
        assertTrue(CharUtils.isAsciiAlphaLower('z'));
        assertFalse(CharUtils.isAsciiAlphaLower('A'));
        assertFalse(CharUtils.isAsciiAlphaLower('3'));
        assertFalse(CharUtils.isAsciiAlphaLower('©'));
    }

    @Test
    public void testIsAsciiAlphaUpper_VariousInputs_ReturnsExpected() {
        assertTrue(CharUtils.isAsciiAlphaUpper('A'));
        assertTrue(CharUtils.isAsciiAlphaUpper('Z'));
        assertFalse(CharUtils.isAsciiAlphaUpper('a'));
        assertFalse(CharUtils.isAsciiAlphaUpper('3'));
    }

    @Test
    public void testIsAsciiAlphanumeric_VariousInputs_ReturnsExpected() {
        assertTrue(CharUtils.isAsciiAlphanumeric('a'));
        assertTrue(CharUtils.isAsciiAlphanumeric('A'));
        assertTrue(CharUtils.isAsciiAlphanumeric('3'));
        assertFalse(CharUtils.isAsciiAlphanumeric('-'));
        assertFalse(CharUtils.isAsciiAlphanumeric('\n'));
    }

    @Test
    public void testIsAsciiNumeric_VariousInputs_ReturnsExpected() {
        assertTrue(CharUtils.isAsciiNumeric('0'));
        assertTrue(CharUtils.isAsciiNumeric('9'));
        assertFalse(CharUtils.isAsciiNumeric('a'));
        assertFalse(CharUtils.isAsciiNumeric('-'));
    }

    @Test
    public void testIsAsciiControl_VariousInputs_ReturnsExpected() {
        assertTrue(CharUtils.isAsciiControl('\n'));
        assertTrue(CharUtils.isAsciiControl((char) 31));
        assertTrue(CharUtils.isAsciiControl((char) 127));
        assertFalse(CharUtils.isAsciiControl('a'));
        assertFalse(CharUtils.isAsciiControl(' '));
    }

    @Test
    public void testIsAsciiPrintable_VariousInputs_ReturnsExpected() {
        assertTrue(CharUtils.isAsciiPrintable('a'));
        assertTrue(CharUtils.isAsciiPrintable(' '));
        assertTrue(CharUtils.isAsciiPrintable('-'));
        assertFalse(CharUtils.isAsciiPrintable('\n'));
        assertFalse(CharUtils.isAsciiPrintable((char) 127));
    }

    // -----------------------------------------------------------------------
    // AC-3: Hexadecimal classification
    // -----------------------------------------------------------------------

    @Test
    public void testIsHex_VariousInputs_ReturnsExpected() {
        assertTrue(CharUtils.isHex('0'));
        assertTrue(CharUtils.isHex('9'));
        assertTrue(CharUtils.isHex('a'));
        assertTrue(CharUtils.isHex('f'));
        assertTrue(CharUtils.isHex('A'));
        assertTrue(CharUtils.isHex('F'));
        assertFalse(CharUtils.isHex('g'));
        assertFalse(CharUtils.isHex('G'));
        assertFalse(CharUtils.isHex('#'));
    }

    // -----------------------------------------------------------------------
    // AC-4: Octal classification
    // -----------------------------------------------------------------------

    @Test
    public void testIsOctal_VariousInputs_ReturnsExpected() {
        assertTrue(CharUtils.isOctal('0'));
        assertTrue(CharUtils.isOctal('7'));
        assertFalse(CharUtils.isOctal('8'));
        assertFalse(CharUtils.isOctal('9'));
        assertFalse(CharUtils.isOctal('a'));
    }

    // -----------------------------------------------------------------------
    // AC-5: String/Character to char conversion
    // -----------------------------------------------------------------------

    @Test
    public void testToChar_FromCharacterObject_ReturnsChar() {
        assertEquals('A', CharUtils.toChar(Character.valueOf('A')));
        assertEquals(' ', CharUtils.toChar(Character.valueOf(' ')));
    }

    @Test(expected = NullPointerException.class)
    public void testToChar_FromNullCharacterObject_ThrowsNPE() {
        CharUtils.toChar((Character) null);
    }

    @Test
    public void testToChar_FromCharacterWithDefault_ReturnsExpected() {
        assertEquals('A', CharUtils.toChar(Character.valueOf('A'), 'X'));
        assertEquals('X', CharUtils.toChar((Character) null, 'X')); // ADDED: "(Character)" - ambiguous method reference
    }

    @Test
    public void testToChar_FromString_ReturnsFirstChar() {
        assertEquals('A', CharUtils.toChar("A"));
        assertEquals('B', CharUtils.toChar("BA"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToChar_FromEmptyString_ThrowsIAE() {
        CharUtils.toChar("");
    }

    @Test(expected = NullPointerException.class)
    public void testToChar_FromNullString_ThrowsNPE() {
        CharUtils.toChar((String) null);
    }

    @Test
    public void testToChar_FromStringWithDefault_ReturnsExpected() {
        assertEquals('A', CharUtils.toChar("A", 'X'));
        assertEquals('B', CharUtils.toChar("BA", 'X'));
        assertEquals('X', CharUtils.toChar("", 'X'));
        assertEquals('X', CharUtils.toChar((String) null, 'X'));
    }

    // -----------------------------------------------------------------------
    // AC-6: Character to int value conversion
    // -----------------------------------------------------------------------

    @Test
    public void testToIntValue_FromChar_ReturnsInt() {
        assertEquals(3, CharUtils.toIntValue('3'));
        assertEquals(0, CharUtils.toIntValue('0'));
        assertEquals(9, CharUtils.toIntValue('9'));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToIntValue_FromNonNumericChar_ThrowsIAE() {
        CharUtils.toIntValue('A');
    }

    @Test
    public void testToIntValue_FromCharWithDefault_ReturnsExpected() {
        assertEquals(3, CharUtils.toIntValue('3', -1));
        assertEquals(-1, CharUtils.toIntValue('A', -1));
    }

    @Test
    public void testToIntValue_FromCharacterObject_ReturnsInt() {
        assertEquals(3, CharUtils.toIntValue(Character.valueOf('3')));
    }

    @Test(expected = NullPointerException.class)
    public void testToIntValue_FromNullCharacterObject_ThrowsNPE() {
        CharUtils.toIntValue((Character) null);
    }

    @Test
    public void testToIntValue_FromCharacterObjectWithDefault_ReturnsExpected() {
        assertEquals(3, CharUtils.toIntValue(Character.valueOf('3'), -1));
        assertEquals(-1, CharUtils.toIntValue(Character.valueOf('A'), -1));
        assertEquals(-1, CharUtils.toIntValue((Character) null, -1));
    }

    // -----------------------------------------------------------------------
    // AC-7: Character to String conversion
    // -----------------------------------------------------------------------

    @Test
    public void testToString_FromChar_ReturnsString() {
        assertEquals(" ", CharUtils.toString(' '));
        assertEquals("A", CharUtils.toString('A'));
        // Test cache boundary
        assertEquals("z", CharUtils.toString((char) 122));
        // Test non-cached value
        assertEquals("©", CharUtils.toString('©'));
    }

    @Test
    public void testToString_FromCharacterObject_ReturnsStringOrNull() {
        assertEquals("A", CharUtils.toString(Character.valueOf('A')));
        assertNull(CharUtils.toString((Character) null));
    }

    // -----------------------------------------------------------------------
    // AC-8: Unicode Escaped conversion
    // -----------------------------------------------------------------------

    @Test
    public void testUnicodeEscaped_FromChar_ReturnsFormattedString() {
        assertEquals("\\u0020", CharUtils.unicodeEscaped(' '));
        assertEquals("\\u0041", CharUtils.unicodeEscaped('A'));
        assertEquals("\\u000a", CharUtils.unicodeEscaped('\n'));
        assertEquals("\\u00a9", CharUtils.unicodeEscaped('©'));
        // Test high value for hex bitwise logic
        assertEquals("\\u1234", CharUtils.unicodeEscaped((char) 0x1234));
    }

    @Test
    public void testUnicodeEscaped_FromCharacterObject_ReturnsStringOrNull() {
        assertEquals("\\u0041", CharUtils.unicodeEscaped(Character.valueOf('A')));
        assertNull(CharUtils.unicodeEscaped((Character) null));
    }

    // -----------------------------------------------------------------------
    // Additional Coverage: Deprecated Methods and Edge Cases
    // -----------------------------------------------------------------------

    @Test
    public void testToCharacterObject_FromChar_ReturnsObject() {
        assertEquals(Character.valueOf('a'), CharUtils.toCharacterObject('a'));
    }

    @Test
    public void testToCharacterObject_FromString_ReturnsObjectOrNull() {
        assertEquals(Character.valueOf('a'), CharUtils.toCharacterObject("abc"));
        assertNull(CharUtils.toCharacterObject(""));
        assertNull(CharUtils.toCharacterObject(null));
    }

    @Test
    public void testConstructor_Instantiation() {
        // Covering the deprecated/public constructor for 100% line coverage
        new CharUtils();
    }
}