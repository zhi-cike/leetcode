package com.z.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author zhi
 * @date 2024/7/1
 * @see P3_LongestSubstringWithoutRepeatingCharacters
 */
public class P3_LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void testLengthOfLongestSubstring() {
        testExecute(new P3_LongestSubstringWithoutRepeatingCharacters()::lengthOfLongestSubstring);
    }

    @Test
    public void testLengthOfLongestSubstring2() {
        testExecute(new P3_LongestSubstringWithoutRepeatingCharacters()::lengthOfLongestSubstring2);
    }

    private void testExecute(Solution solution) {
        int len;

        len = solution.lengthOfLongestSubstring("abcabcbb");
        Assertions.assertEquals(3, len);

        len = solution.lengthOfLongestSubstring("bbbbb");
        Assertions.assertEquals(1, len);

        len = solution.lengthOfLongestSubstring("pwwkew");
        Assertions.assertEquals(3, len);

        len = solution.lengthOfLongestSubstring(" ");
        Assertions.assertEquals(1, len);

        len = solution.lengthOfLongestSubstring("abba");
        Assertions.assertEquals(2, len);
    }

    @FunctionalInterface
    public interface Solution {

        int lengthOfLongestSubstring(String s);
    }
}
