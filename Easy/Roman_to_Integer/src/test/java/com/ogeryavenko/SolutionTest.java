package com.ogeryavenko;

import static org.junit.Assert.*;

import org.junit.*;

public class SolutionTest
{
    Solution solution = new Solution();
    @Test
    public void example1()
    {
        int answer = solution.romanToInt("III");
        int expanted = 3;
        assertEquals(expanted, answer);
    }

    @Test
    public void example2()
    {
        int answer = solution.romanToInt("IX");
        int expanted = 9;
        assertEquals(expanted, answer);
    }

    @Test
    public void example3()
    {
        int answer = solution.romanToInt("LVIII");
        int expanted = 58;
        assertEquals(expanted, answer);
    }

    @Test
    public void example4()
    {
        int answer = solution.romanToInt("MCMXCIV");
        int expanted = 1994;
        assertEquals(expanted, answer);
    }
}
