package com.ogeryavenko;

public class Solution
{
    public boolean isPalindrome(int x) {
        int result = 0;
        int ix = x;

        while (x != 0) {
            int pop = x % 10;
            x = x / 10;
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && pop > 7)) {
                return false;
            }
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && pop < -8)) {
                return false;
            }
            result = result * 10 + pop;
        }
        System.out.println(result);
        if (result == ix) {
            if(result < 0) {
                return false;
            }
            return true;
        } else {
            return false;
        }
    }
}
