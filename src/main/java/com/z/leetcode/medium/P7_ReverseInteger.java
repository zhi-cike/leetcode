package com.z.leetcode.medium;

/**
 * 7. 整数反转：假设环境不允许存储 64 位整数（有符号或无符号）。
 * https://leetcode.cn/problems/reverse-integer/
 *
 * 1. 十进制反转 {@link #reverse}
 * 2. 字符串反转+Integer解析 {@link #reverse1}
 * TODO 其他解法
 *
 * @author zhi
 * @date 2024/6/30
 */
public class P7_ReverseInteger {

    /**
     * 十进制反转
     *
     * 需要注意的是，反转过程中可能会溢出，每次计算后需要进行判断
     */
    public int reverse(int x) {
        int reverse = 0;
        while (x != 0) {
            int temp = reverse * 10 + x % 10;
            // 判断是否溢出
            if (temp / 10 != reverse) {
                return 0;
            }
            reverse = temp;
            x = x / 10;
        }
        return reverse;
    }

    /**
     * 字符串反转+Integer解析
     */
    public int reverse1(int x) {
        String s = x + "";
        char[] chars = s.toCharArray();
        StringBuilder reverse = null;
        // 反转字符串
        for (int i = chars.length - 1; i >= 0; i--) {
            if (reverse == null) {
                // 跳过尾号的0，x为0时也会被跳过
                if (chars[i] == '0') {
                    continue;
                }
                reverse = new StringBuilder().append(chars[i]);
            } else if (i == 0 && chars[i] == '-') {
                // 负数时跳过，单独处理
            } else {
                reverse.append(chars[i]);
            }
        }

        // x为零时会被过滤掉
        reverse = reverse == null ? new StringBuilder("0") : reverse;
        // 处理负数情况
        String reverseStr = x < 0 ? "-" + reverse : reverse.toString();

        // 利用int解析检查溢出情况
        try {
            return Integer.parseInt(reverseStr);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
