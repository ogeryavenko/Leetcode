package com.ogeryavenko;

import static org.junit.Assert.*;

import org.junit.*;


public class SolutionTest
{

    @Test
    public void reverse()
    {
        Solution numbers = new Solution();
        int answer = numbers.reverse(123);
        int expanted = 321;
        assertEquals(expanted, answer);
    }

    @Test
    public void minusReverse()
    {
        Solution numbers = new Solution();
        int answer = numbers.reverse(-123);
        int expanted = -321;
        assertEquals(expanted, answer);
    }
}
