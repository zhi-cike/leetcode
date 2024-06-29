package com.z.leetcode.utils;

/**
 * @author zhi
 * @date 2024/6/29
 */
public class ArrayUtil {

    public static String toString(int[] a) {
        if (a == null) {
            return "null";
        }
        if (a.length <= 0) {
            return "[]";
        }
        StringBuilder sb = null;
        for (int v : a) {
            if (sb == null) {
                sb = new StringBuilder();
                sb.append("[").append(v);
            } else {
                sb.append(",").append(v);
            }
        }
        sb.append("]");
        return sb.toString();
    }

}
