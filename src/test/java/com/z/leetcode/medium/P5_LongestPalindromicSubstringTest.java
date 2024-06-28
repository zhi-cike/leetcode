package com.z.leetcode.medium;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author zhi
 * @date 2024/6/28
 * @see P5_LongestPalindromicSubstring
 */
public class P5_LongestPalindromicSubstringTest {

    /**
     * 中心扩散法
     *
     * @see P5_LongestPalindromicSubstring#longestPalindrome
     */
    @Test
    public void test() {
        P5_LongestPalindromicSubstring solution = new P5_LongestPalindromicSubstring();

        // babad -> bab/aba
        String value = solution.longestPalindrome("babad");
        Assertions.assertTrue(Arrays.asList("bab", "aba").contains(value));

        // cbbd -> bb
        value = solution.longestPalindrome("cbbd");
        Assertions.assertEquals("bb", value);
    }

}
