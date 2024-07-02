package com.z.leetcode.sort;

/**
 * 冒泡排序
 *
 * @author zhi
 * @date 2024/7/2
 */
public class BubbleSort {

    /**
     * 冒泡排序
     * 从小到大排序，且会修改原本的数组
     *
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public static int[] bubbleSort(int[] nums) {
        if (nums == null) {
            return null;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // 不符合从小到大的顺序，进行交换
                if (nums[i] > nums[j]) {
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
        return nums;
    }

}
