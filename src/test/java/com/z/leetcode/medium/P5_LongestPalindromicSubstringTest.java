package com.z.leetcode.medium;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author zhi
 * @date 2024/6/28
 */
public class P5_LongestPalindromicSubstringTest {

    @Test
    public void test() {
        P5_LongestPalindromicSubstring solution = new P5_LongestPalindromicSubstring();
        String value = solution.longestPalindrome("babad");

        Assertions.assertTrue(Arrays.asList("bab", "aba").contains(value));

        value = solution.longestPalindrome("cbbd");
        Assertions.assertEquals("bb", value);
    }

}
