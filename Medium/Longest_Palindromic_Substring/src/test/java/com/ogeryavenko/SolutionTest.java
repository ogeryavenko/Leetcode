package com.ogeryavenko;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;



public class SolutionTest
{
    Solution solution = new Solution();

    @Test
    public void example1()
    {
        String answer = solution.longestPalindrome("babad");
        String expected = "bab";
        assertEquals(expected, answer);
    }

    @Test
    public void example2()
    {
        String answer = solution.longestPalindrome("cbbd");
        String expected = "bb";
        assertEquals(expected, answer);
    }

    @Test
    public void example3()
    {
        String answer = solution.longestPalindrome("a");
        String expected = "a";
        assertEquals(expected, answer);
    }

    @Test
    public void example4()
    {
        String answer = solution.longestPalindrome("acgit ");
        String expected = "a";
        assertEquals(expected, answer);
    }
}
