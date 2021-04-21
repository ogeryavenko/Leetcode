package com.ogeryavenk;

import static org.junit.Assert.*;

import org.junit.*;


public class SolutionTest
{
    @Test
    public void example1()
    {
        Solution solution = new Solution();
        double answer = solution.findMedianSortedArrays(new int[] {1, 3}, new int[] {2});
        double expanted = 2.00000;
        assertEquals(expanted, answer, 0.00001);
    }
}
