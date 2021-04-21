package com.ogeryavenk;

import static org.junit.Assert.*;

import org.junit.*;

public class SolutionTest
{

    @Test
    public void Example1()
    {
        Solution num = new Solution();
        boolean answer = num.isValid("()");
        assertEquals(true, answer);
    }
    @Test
    public void Example2()
    {
        Solution num = new Solution();
        boolean answer = num.isValid("()[]()");
        assertEquals(true, answer);
    }

    @Test
    public void Example5()
    {
        Solution num = new Solution();
        boolean answer = num.isValid("{[]}");
        assertEquals(true, answer);
    }
}
