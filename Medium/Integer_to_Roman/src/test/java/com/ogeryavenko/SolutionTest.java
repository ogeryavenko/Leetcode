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
       String actual = solution.intToRoman(3);
       String expected = "III";
       assertEquals(expected, actual);
    }

    @Test
    public void example2()
    {
        String actual = solution.intToRoman(9);
        String expected = "IX";
        assertEquals(expected, actual);
    }

    @Test
    public void example3()
    {
        String actual = solution.intToRoman(1994);
        String expected = "MCMXCIV";
        assertEquals(expected, actual);
    }
}
