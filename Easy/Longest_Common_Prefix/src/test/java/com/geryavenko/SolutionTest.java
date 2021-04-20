package com.geryavenko;

import static org.junit.Assert.*;

import org.junit.*;

public class SolutionTest
{
    @Test
    public void Example1()
    {
        Solution nums = new Solution();
        String actual;
        actual = nums.longestCommonPrefix(new String[] {"Winter", "Spring", "Summer", "Autumn"});
        String expanted = "fl";
    }
}
