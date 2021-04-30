package com.ogeryavenko;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class SolutionTest
{
    Solution solution = new Solution();
    @Test
    public void example1()
    {
        int answer = solution.maxArea(new int[]{1, 1});
        int expanse = 1;
        assertEquals(expanse, answer);
    }

    @Test
    public void example2()
    {
        int answer = solution.maxArea(new int[]{4,3,2,1,4});
        int expanse = 16;
        assertEquals(expanse, answer);
    }
}
