package com.z.leetcode.medium;

/**
 * 5. 最长回文子串
 * https://leetcode.cn/problems/longest-palindromic-substring/description/
 *
 * 1. 中心扩散法： {@link P5_LongestPalindromicSubstring#longestPalindrome}
 *
 * @author zhi
 * @date 2024/6/28
 */
public class P5_LongestPalindromicSubstring {

    /**
     * 中心扩散法
     * 选中一个或两个中心位置，向两边扩散，遍历所有可能性取其中最长值
     */
    public String longestPalindrome(String s) {
        int length = s.length();
        if (length <= 1) {
            return s;
        }
        int beginIndex = 0;
        int endIndex = 0;
        for (int i = 0; i < length; i++) {
            int l = i;
            int r = l;
            // 尝试奇数对称类，由选定的字符为准向两边遍历
            while (l >= 0 && r < length && s.charAt(l) == s.charAt(r)) {
                // 如果大于当前最大的长度就更新
                if (r - l > endIndex - beginIndex) {
                    endIndex = r;
                    beginIndex = l;
                }
                // 向两侧移动游标
                l--;
                r++;
            }
            l = i;
            r = l + 1;
            // 尝试偶数对称类，以选定的字符及其右边的字符为准，向两边遍历
            while (l >= 0 && r < length && s.charAt(l) == s.charAt(r)) {
                // 如果大于当前最大的长度就更新
                if (r - l > endIndex - beginIndex) {
                    endIndex = r;
                    beginIndex = l;
                }
                // 向两侧移动游标
                l--;
                r++;
            }
        }
        // 按照遍历结果直接截取
        return s.substring(beginIndex, endIndex + 1);
    }

}
