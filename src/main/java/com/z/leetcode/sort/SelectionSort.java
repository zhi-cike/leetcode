package com.z.leetcode.sort;

/**
 * 选择排序
 *
 * @author zhi
 * @date 2024/7/2
 */
public class SelectionSort {

    /**
     * 选择排序
     * 从小到大排序，且会修改原本的数组
     *
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(1)
     */
    public static int[] selectionSort(int[] nums) {
        if (nums == null) {
            return null;
        }
        for (int i = 0; i < nums.length; i++) {

            // 找到最小的位置
            int minPosition = i;
            for (int j = i; j < nums.length; j++) {
                if (nums[minPosition] > nums[j]) {
                    minPosition = j;
                }
            }

            // 交换当前位置和最小位置
            if (i != minPosition) {
                int tmp = nums[minPosition];
                nums[minPosition] = nums[i];
                nums[i] = tmp;
            }
        }
        return nums;
    }

}
