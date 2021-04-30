package com.ogeryavenko;

import static org.junit.Assert.*;

import org.junit.*;


public class SolutionTest
{
    Solution solution = new Solution();
    @Test
    public void example1()
    {
        int answer = solution.reverse(123);
        int expanted = 321;
        assertEquals(expanted, answer);
    }

    @Test
    public void example2()
    {
        int answer = solution.reverse(-123);
        int expanted = -321;
        assertEquals(expanted, answer);
    }

    @Test
    public void example3()
    {
        int answer = solution.reverse(120);
        int expanted = 21;
        assertEquals(expanted, answer);
    }

    @Test
    public void example4()
    {
        int answer = solution.reverse(0);
        int expanted = 0;
        assertEquals(expanted, answer);
    }
}
