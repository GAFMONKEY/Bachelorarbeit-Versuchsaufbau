package org.apache.commons.lang3;

import org.junit.Test;

import static org.junit.Assert.*;

public class gpt_noac_CharUtilsTest {

    @Test
    public void compare_whenEqual_returnsZero() {
        // arrange
        char x = 'a';
        char y = 'a';

        // act
        int result = CharUtils.compare(x, y);

        // assert
        assertEquals(0, result);
    }

    @Test
    public void compare_whenDifferent_returnsSignedDifference() {
        // arrange
        char smaller = 'a';
        char larger = 'c';

        // act + assert
        assertTrue(CharUtils.compare(smaller, larger) < 0);
        assertTrue(CharUtils.compare(larger, smaller) > 0);
        assertEquals('c' - 'a', CharUtils.compare(larger, smaller));
    }

    @Test
    public void asciiPredicates_coverBoundariesAndBranches() {
        // isAscii
        assertTrue(CharUtils.isAscii((char) 0));
        assertTrue(CharUtils.isAscii((char) 127));
        assertFalse(CharUtils.isAscii((char) 128));

        // isAsciiControl
        assertTrue(CharUtils.isAsciiControl((char) 0));
        assertTrue(CharUtils.isAsciiControl((char) 31));
        assertFalse(CharUtils.isAsciiControl((char) 32));
        assertTrue(CharUtils.isAsciiControl((char) 127));
        assertFalse(CharUtils.isAsciiControl((char) 126));

        // isAsciiPrintable
        assertFalse(CharUtils.isAsciiPrintable((char) 31));
        assertTrue(CharUtils.isAsciiPrintable((char) 32));
        assertTrue(CharUtils.isAsciiPrintable((char) 126));
        assertFalse(CharUtils.isAsciiPrintable((char) 127));

        // numeric boundaries
        assertFalse(CharUtils.isAsciiNumeric('/'));
        assertTrue(CharUtils.isAsciiNumeric('0'));
        assertTrue(CharUtils.isAsciiNumeric('9'));
        assertFalse(CharUtils.isAsciiNumeric(':'));
    }

    @Test
    public void alphaPredicates_coverUpperLowerAndNonAlpha() {
        // lower
        assertFalse(CharUtils.isAsciiAlphaLower('`'));
        assertTrue(CharUtils.isAsciiAlphaLower('a'));
        assertTrue(CharUtils.isAsciiAlphaLower('z'));
        assertFalse(CharUtils.isAsciiAlphaLower('{'));

        // upper
        assertFalse(CharUtils.isAsciiAlphaUpper('@'));
        assertTrue(CharUtils.isAsciiAlphaUpper('A'));
        assertTrue(CharUtils.isAsciiAlphaUpper('Z'));
        assertFalse(CharUtils.isAsciiAlphaUpper('['));

        // alpha combines
        assertTrue(CharUtils.isAsciiAlpha('A'));
        assertTrue(CharUtils.isAsciiAlpha('m'));
        assertFalse(CharUtils.isAsciiAlpha('0'));

        // alphanumeric combines
        assertTrue(CharUtils.isAsciiAlphanumeric('Z'));
        assertTrue(CharUtils.isAsciiAlphanumeric('7'));
        assertFalse(CharUtils.isAsciiAlphanumeric('-'));
    }

    @Test
    public void isHex_and_isOctal_coverBranchesAndBoundaries() {
        // isHex: numeric
        assertTrue(CharUtils.isHex('0'));
        assertTrue(CharUtils.isHex('9'));

        // isHex: lower alpha
        assertTrue(CharUtils.isHex('a'));
        assertTrue(CharUtils.isHex('f'));
        assertFalse(CharUtils.isHex('g'));

        // isHex: upper alpha
        assertTrue(CharUtils.isHex('A'));
        assertTrue(CharUtils.isHex('F'));
        assertFalse(CharUtils.isHex('G'));

        // isHex: non-hex symbol
        assertFalse(CharUtils.isHex('/'));

        // isOctal boundaries
        assertTrue(CharUtils.isOctal('0'));
        assertTrue(CharUtils.isOctal('7'));
        assertFalse(CharUtils.isOctal('8'));
        assertFalse(CharUtils.isOctal('/'));
    }

    @Test
    public void toChar_whenCharacterNonNull_returnsPrimitiveChar() {
        // arrange
        Character ch = Character.valueOf('X');

        // act
        char result = CharUtils.toChar(ch);

        // assert
        assertEquals('X', result);
    }

    @Test
    public void toChar_whenCharacterNull_throwsNullPointerExceptionWithParamName() {
        try {
            CharUtils.toChar((Character) null);
            fail("Expected NullPointerException");
        } catch (NullPointerException ex) {
            assertEquals("ch", ex.getMessage());
        }
    }

    @Test
    public void toChar_withDefault_whenCharacterNull_returnsDefault() {
        assertEquals('D', CharUtils.toChar((Character) null, 'D'));
        assertEquals('Z', CharUtils.toChar(Character.valueOf('Z'), 'D'));
    }

    @Test
    public void toChar_stringOverloads_handleNullEmptyAndNonEmpty() {
        // toChar(String) - non-empty
        assertEquals('a', CharUtils.toChar("abc"));
        assertEquals(' ', CharUtils.toChar(" "));

        // toChar(String) - empty
        try {
            CharUtils.toChar("");
            fail("Expected exception for empty String");
        } catch (RuntimeException ex) {
            // commons-lang Validate.notEmpty throws IllegalArgumentException for empty
            assertTrue(ex instanceof IllegalArgumentException);
            assertTrue(ex.getMessage().contains("must not be empty"));
        }

        // toChar(String) - null
        try {
            CharUtils.toChar((String) null);
            fail("Expected exception for null String");
        } catch (RuntimeException ex) {
            // Validate.notEmpty throws NullPointerException for null
            assertTrue(ex instanceof NullPointerException);
            assertTrue(ex.getMessage().contains("must not be empty"));
        }

        // toChar(String, default)
        assertEquals('D', CharUtils.toChar((String) null, 'D'));
        assertEquals('D', CharUtils.toChar("", 'D'));
        assertEquals('x', CharUtils.toChar("xyz", 'D'));
    }

    @Test
    public void toCharacterObject_overloads_handleNullEmptyAndFirstChar() {
        // deprecated char overload
        assertEquals(Character.valueOf('q'), CharUtils.toCharacterObject('q'));

        // String overload
        assertNull(CharUtils.toCharacterObject((String) null));
        assertNull(CharUtils.toCharacterObject(""));
        assertEquals(Character.valueOf('h'), CharUtils.toCharacterObject("hello"));
    }

    @Test
    public void toIntValue_charOverloads_coverValidAndInvalid() {
        // valid digits
        assertEquals(0, CharUtils.toIntValue('0'));
        assertEquals(9, CharUtils.toIntValue('9'));

        // invalid digit throws with helpful message
        try {
            CharUtils.toIntValue('a');
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            assertTrue(ex.getMessage().contains("not in the range '0' - '9'"));
            assertTrue(ex.getMessage().contains("a"));
        }

        // default overload
        assertEquals(5, CharUtils.toIntValue('5', 123));
        assertEquals(-7, CharUtils.toIntValue('x', -7));
    }

    @Test
    public void toIntValue_characterOverloads_coverNullAndNonNumericWithDefault() {
        assertEquals(4, CharUtils.toIntValue(Character.valueOf('4')));

        // null -> NPE from toChar(Character)
        try {
            CharUtils.toIntValue((Character) null);
            fail("Expected NullPointerException");
        } catch (NullPointerException ex) {
            assertEquals("ch", ex.getMessage());
        }

        // default overload: null returns default; non-numeric returns default
        assertEquals(99, CharUtils.toIntValue((Character) null, 99));
        assertEquals(42, CharUtils.toIntValue(Character.valueOf('x'), 42));
        assertEquals(7, CharUtils.toIntValue(Character.valueOf('7'), 42));
    }

    @Test
    public void toString_overloads_coverCacheBranchAndNull() {
        // within cache (0..127): should be stable reference across calls
        String a1 = CharUtils.toString('A');
        String a2 = CharUtils.toString('A');
        assertEquals("A", a1);
        assertSame(a1, a2);

        // boundary inside cache
        String del = CharUtils.toString((char) 127);
        assertEquals(1, del.length());
        assertEquals((char) 127, del.charAt(0));

        // outside cache branch (>= 128)
        char ch128 = (char) 128;
        String s128 = CharUtils.toString(ch128);
        assertEquals(1, s128.length());
        assertEquals(ch128, s128.charAt(0));

        // Character overload
        assertNull(CharUtils.toString((Character) null));
        assertEquals("B", CharUtils.toString(Character.valueOf('B')));
    }

    @Test
    public void unicodeEscaped_overloads_coverLowHighAndNull() {
        assertEquals("\\u0000", CharUtils.unicodeEscaped('\u0000'));
        assertEquals("\\u0041", CharUtils.unicodeEscaped('A'));
        assertEquals("\\uffff", CharUtils.unicodeEscaped('\uffff')); // lower-case hex digits

        assertNull(CharUtils.unicodeEscaped((Character) null));
        assertEquals("\\u00e9", CharUtils.unicodeEscaped(Character.valueOf('\u00e9'))); // é
    }

    @Test
    public void constructor_deprecated_canInstantiate() {
        // just for coverage: should not throw
        CharUtils utils = new CharUtils();
        assertNotNull(utils);
    }
}