package com.z.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author zhi
 * @date 2024/6/30
 */
public class P14_LongestCommonPrefixTest {

    @Test
    public void testLongestCommonPrefix() {
        P14_LongestCommonPrefix solution = new P14_LongestCommonPrefix();

        // ["flower","flow","flight"]  ->  "fl"
        String prefix = solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        Assertions.assertEquals("fl", prefix);

        // ["dog","racecar","car"]  ->  ""
        prefix = solution.longestCommonPrefix(new String[]{"dog", "racecar", "car"});
        Assertions.assertEquals("", prefix);

        // ["","racecar","car"]  ->  ""
        prefix = solution.longestCommonPrefix(new String[]{"", "racecar", "car"});
        Assertions.assertEquals("", prefix);

        // ["dog","racecar",""]  ->  ""
        prefix = solution.longestCommonPrefix(new String[]{"dog", "racecar", ""});
        Assertions.assertEquals("", prefix);

        // ["dog","dacecar","d"]  ->  ""
        prefix = solution.longestCommonPrefix(new String[]{"dog", "dacecar", "d"});
        Assertions.assertEquals("d", prefix);
    }

}
