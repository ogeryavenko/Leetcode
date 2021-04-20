package com.ogeryavenko;

import static org.junit.Assert.*;

import org.junit.*;

public class SolutionTest
{
    @Test
    public void reverseRomanTree()
    {
        Solution numbers = new Solution();
        int answer = numbers.romanToInt("III");
        int expanted = 3;
        assertEquals(expanted, answer);
    }
    @Test
    public void reverseRoman()
    {
        Solution numbers = new Solution();
        int answer = numbers.romanToInt("MCMXCIV");
        int expanted = 1994;
        assertEquals(expanted, answer);
    }
}
