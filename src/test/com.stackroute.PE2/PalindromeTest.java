package com.stackroute.PE2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkPalindromeSuccess() {
        assertEquals("a given number is palindrome","121");
        assertEquals("a given number is palindrome","12321");
        assertEquals("a given number is palindrome","1");
        assertEquals("a given number is palindrome","1234321");
        assertEquals("a given number is palindrome","0");

    }
    @Test
    public void checkPalindromeFailure() {
        assertNotEquals("a given number not is a palindrome","123");
        assertNotEquals("a given number not is a palindrome","456");
        assertNotEquals("a given number not is a palindrome","456789");
        assertNotEquals("a given number not is a palindrome","123456");
        assertNotEquals("a given number not is a palindrome","457456");
        assertNotEquals("a given number not is a palindrome","-321223");

    }

    @Test
    public void checkPalindromeStringSuccess() {
        assertEquals("a given number is palindrome","dad");
        assertEquals("a given number is palindrome","Madam");
        assertEquals("a given number is palindrome","");
        assertEquals("a given number is palindrome"," ");
        assertEquals("a given number is palindrome","s");
    }
    @Test
    public void checkPalindromeStringFailure() {
        assertEquals("a given number is palindrome","sad");
        assertEquals("a given number is palindrome","story");
    }
}