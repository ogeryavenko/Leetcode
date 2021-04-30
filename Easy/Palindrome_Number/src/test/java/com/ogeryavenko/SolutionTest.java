package com.ogeryavenko;

import static org.junit.Assert.*;

import org.junit.*;

public class SolutionTest
{
    Solution solution = new Solution();
    @Test
    public void example1()
    {

        boolean answer = solution.isPalindrome(121);
        boolean expanted = true;
        assertEquals(expanted, answer);
    }
    @Test
    public void example2()
    {
        boolean answer = solution.isPalindrome(-121);
        boolean expanted = false;
        assertEquals(expanted, answer);
    }
}
