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
        String answer = solution.convert("PAYPALISHIRING", 3);
        String expected = "PAHNAPLSIIGYIR";
        assertEquals(expected, answer);
    }

    @Test
    public void example2()
    {
        String answer = solution.convert("A", 1);
        String expected = "A";
        assertEquals(expected, answer);
    }
}
