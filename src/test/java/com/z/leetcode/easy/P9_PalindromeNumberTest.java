package com.z.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author zhi
 * @date 2024/6/30
 */
public class P9_PalindromeNumberTest {

    @Test
    public void testIsPalindrome() {
        testExecute(new P9_PalindromeNumber()::isPalindrome);
    }

    @Test
    public void testIsPalindrome2() {
        testExecute(new P9_PalindromeNumber()::isPalindrome2);
    }

    @Test
    public void testIsPalindrome3() {
        testExecute(new P9_PalindromeNumber()::isPalindrome3);
    }

    public void testExecute(Solution solution) {

        // 121  ->  true
        boolean isPalindrome = solution.isPalindrome(121);
        Assertions.assertTrue(isPalindrome);

        // -121  ->  false
        isPalindrome = solution.isPalindrome(-121);
        Assertions.assertFalse(isPalindrome);

        // 10  ->  false
        isPalindrome = solution.isPalindrome(10);
        Assertions.assertFalse(isPalindrome);

        // 0  ->  true
        isPalindrome = solution.isPalindrome(0);
        Assertions.assertTrue(isPalindrome);

        // 8  ->  true
        isPalindrome = solution.isPalindrome(8);
        Assertions.assertTrue(isPalindrome);

        // 128  ->  true
        isPalindrome = solution.isPalindrome(128);
        Assertions.assertFalse(isPalindrome);
    }

    @FunctionalInterface
    private interface Solution {

        boolean isPalindrome(int x);

    }
}
