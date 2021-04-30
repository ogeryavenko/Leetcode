package com.geryavenko;

import static org.junit.Assert.*;

import org.junit.*;

public class SolutionTest
{
    Solution solution = new Solution();
    String actual;

    @Test
    public void example1()
    {
        actual = solution.longestCommonPrefix(new String[] {"flower","flow","flight"});
        String expanted = "fl";
        assertEquals(expanted, actual);
    }

    @Test
    public void example2()
    {
        actual = solution.longestCommonPrefix(new String[] {"dog","racecar","car"});
        String expanted = "";
        assertEquals(expanted, actual);
    }

}
