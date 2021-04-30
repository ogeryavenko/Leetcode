package com.ogeryavenk;

import static org.junit.Assert.*;

import org.junit.*;

public class SolutionTest
{
    Solution solution = new Solution();

    @Test
    public void example1()
    {
        boolean answer = solution.isValid("()");
        assertEquals(true, answer);
    }
    @Test
    public void example2()
    {
        boolean answer = solution.isValid("()[]()");
        assertEquals(true, answer);
    }

    @Test
    public void example5()
    {
        boolean answer = solution.isValid("{[]}");
        assertEquals(true, answer);
    }
}
