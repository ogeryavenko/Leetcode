package com.ogeryavenko;

import static org.junit.Assert.*;

import org.junit.*;

public class SolutionTest
{
    @Test
    public void exampleTrue()
    {
        Solution numbers = new Solution();
        boolean answer = numbers.isPalindrome(121);
        boolean expanted = true;
        assertEquals(expanted, answer);
    }
    @Test
    public void exampleFalse()
    {
        Solution numbers = new Solution();
        boolean answer = numbers.isPalindrome(-121);
        boolean expanted = false;
        assertEquals(expanted, answer);
    }
}
