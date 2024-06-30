package com.z.leetcode.easy;

/**
 * 9. 回文数
 * https://leetcode.cn/problems/palindrome-number/description/
 *
 * 1. 先反转再对比 {@link #isPalindrome}
 * 2. 先反转再对比优化 {@link #isPalindrome2}
 * 3. 转字符串 {@link #isPalindrome3}
 * TODO 其他解法
 *
 * @author zhi
 * @date 2024/6/30
 */
public class P9_PalindromeNumber {

    /**
     * 先反转再对比
     *
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        int originX = x;
        int reverse = 0;
        while (x > 0) {
            reverse = reverse * 10 + x % 10;
            x = x / 10;
        }
        return reverse == originX;
    }

    /**
     * 先反转再对比优化
     *
     * 反转到一半时，两个值是否相等或10倍差
     *
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public boolean isPalindrome2(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        int reverse = 0;
        while (x > reverse) {
            reverse = reverse * 10 + x % 10;
            x = x / 10;
        }
        return reverse == x || reverse / 10 == x;
    }

    /**
     * 转字符串
     *
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
    public boolean isPalindrome3(int x) {
        String s = x + "";
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

}