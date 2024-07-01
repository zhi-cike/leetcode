package com.z.leetcode.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 3. 无重复字符的最长子串
 * https://leetcode.cn/problems/longest-substring-without-repeating-characters/description/
 *
 * 1. 循环遍历  {@link #lengthOfLongestSubstring}
 * 2. 滑动窗口？{@link #lengthOfLongestSubstring2}
 *
 * @author zhi
 * @date 2024/7/1
 */
public class P3_LongestSubstringWithoutRepeatingCharacters {

    /**
     * 循环遍历
     * 从左到右，依次遍历每个字符作为起点时的子串长度，取最大值
     * 此方法由于是依次遍历，当当前最大长度大于等于剩余长度时，可退出遍历
     *
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(n)
     */
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        // 缓存子串
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            // 第一个字符直接添加并累计长度
            set.add(s.charAt(i));
            int len = 1;

            // 寻找最长子串
            for (int j = i + 1; j < s.length(); j++) {
                if (set.contains(s.charAt(j))) {
                    // 有重复则清空缓存子串，结束循环
                    set.clear();
                    break;
                } else {
                    // 缓存字符并累计长度
                    set.add(s.charAt(j));
                    len++;
                }
            }
            // 记录最长长度并清空缓存字符
            maxLen = Math.max(len, maxLen);
            set.clear();

            // 当前最长字长长度已经大于等于剩余字符串长度时，无需继续遍历
            if (maxLen >= s.length() - (i + 1)) {
                break;
            }
        }
        return maxLen;
    }

    /**
     * 滑动窗口？
     *
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
    public int lengthOfLongestSubstring2(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        int start = 0;
        int i;
        for (i = 0; i < s.length(); i++) {
            Integer index = map.get(s.charAt(i));

            // 存在重复字符
            if (index != null) {
                // 当前坐标-上次的坐标，就是最长值
                maxLen = Math.max(maxLen, i - start);
                // 由于坐标可能会超出当前的范围，比如"abba"，当执行到第二个'a'时，start=2,index=0，这个时候start应该为4而不是1
                start = Math.max(start, index + 1);
            }

            // 更新坐标
            map.put(s.charAt(i), i);
        }
        return Math.max(maxLen, i - start);
    }

}
