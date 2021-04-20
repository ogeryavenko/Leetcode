package com.ogeryavenko;

import static org.junit.Assert.*;

import org.junit.Test;


public class SolutionTest
{

    @Test
    public void shouldAnswerWithTrue()
    {
        Solution nums = new Solution();
        int actual[] =  nums.twoSum(new int[]{2,7,11,15}, 9);
        int[] expanted = {0, 1};
        assertArrayEquals(expanted, actual);
    }
}
