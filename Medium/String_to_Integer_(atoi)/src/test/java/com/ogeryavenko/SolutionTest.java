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
       int answer = solution.myAtoi("42");
       int expected = 42;
       assertEquals(expected, answer);
    }

    @Test
    public void example2()
    {
        int answer = solution.myAtoi("   -42");
        int expected = -42;
        assertEquals(expected, answer);
    }

    @Test
    public void example3()
    {
        int answer = solution.myAtoi("4193 with words");
        int expected = 4193;
        assertEquals(expected, answer);
    }

}
