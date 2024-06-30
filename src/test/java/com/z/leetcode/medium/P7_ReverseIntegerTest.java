package com.z.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author zhi
 * @date 2024/6/30
 */
public class P7_ReverseIntegerTest {

    @Test
    public void testReverse() {
        testExecute(new P7_ReverseInteger()::reverse);
    }

    @Test
    public void testReverse1() {
        testExecute(new P7_ReverseInteger()::reverse1);
    }

    private void testExecute(Solution solution) {
        // 123  ->  321
        int reverse = solution.reverse(123);
        Assertions.assertEquals(321, reverse);

        // -123  -> -321
        reverse = solution.reverse(-123);
        Assertions.assertEquals(-321, reverse);

        // 120  -> 21
        reverse = solution.reverse(120);
        Assertions.assertEquals(21, reverse);

        // 0  -> 0
        reverse = solution.reverse(0);
        Assertions.assertEquals(0, reverse);

        // 2^31-1  -> 0
        reverse = solution.reverse(Integer.MAX_VALUE); // 2147483647
        Assertions.assertEquals(0, reverse);

        // -2^31  -> 0
        int i = (int) (-Math.pow(2, 31));
        reverse = solution.reverse(Integer.MIN_VALUE); // -2147483648
        Assertions.assertEquals(0, reverse);
    }


    @FunctionalInterface
    interface Solution {

        int reverse(int x);
    }
}
