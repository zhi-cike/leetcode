package com.z.leetcode.easy;

/**
 * 14. 最长公共前缀
 * https://leetcode.cn/problems/longest-common-prefix/
 *
 * 1. 遍历 {@link #longestCommonPrefix}
 * TODO 其他解法
 *
 * @author zhi
 * @date 2024/6/30
 */
public class P14_LongestCommonPrefix {

    /**
     * 遍历
     *
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(1)
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length <= 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        // 最长公共前缀长度
        int i;
        // 取第一个字符串，用来对比和其他字符串的公共前缀
        for (i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                // 为按字符遍历模式，所以当遇到当前前缀长度大于等于其他字符串整长时即可结束
                if (i >= strs[j].length()) {
                    return strs[0].substring(0, i);
                }
                // 存在不相同的字符时即可结束
                if (strs[j].charAt(i) != strs[0].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }
        // 循环正常结束，代表最长为第一个字符串
        return strs[0];
    }
}
