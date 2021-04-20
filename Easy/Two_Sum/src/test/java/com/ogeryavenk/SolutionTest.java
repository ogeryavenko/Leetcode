package com.ogeryavenk;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void sum() {
        Solution nums = new Solution();
        int actual[] =  nums.twoSum(new int[]{2,7,11,15}, 9);
        int[] expanted = {0, 1};
        assertEquals(expanted, actual);
    }
}