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
        int answer = solution.lengthOfLongestSubstring("abcabcbb");
        int expected = 3;
        assertEquals(expected, answer);
    }

    @Test
    public void example2()
    {
        int answer = solution.lengthOfLongestSubstring("bbbbb");
        int expected = 1;
        assertEquals(expected, answer);
    }

    @Test
    public void example3()
    {
        int answer = solution.lengthOfLongestSubstring("pwwkew");
        int expected = 3;
        assertEquals(expected, answer);
    }

    @Test
    public void example4()
    {
        int answer = solution.lengthOfLongestSubstring("");
        int expected = 0;
        assertEquals(expected, answer);
    }
}
