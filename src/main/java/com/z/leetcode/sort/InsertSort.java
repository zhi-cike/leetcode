package com.z.leetcode.sort;

/**
 * 插入排序
 *
 * @author zhi
 * @date 2024/7/2
 */
public class InsertSort {

    /**
     * 插入排序
     * 从小到大排序，且会修改原本的数组
     *
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(1)
     */
    public static int[] insertSort(int[] nums) {
        if (nums == null) {
            return null;
        }
        // 从第二个数字开始遍历
        for (int i = 1; i < nums.length; i++) {
            // 记录当前的值
            int tmp = nums[i];

            // 遍历第i个之前的，将第i个插入到合适的位置
            for (int j = i - 1; j >= 0; j--) {
                // 第i个比之前的小就插入到前边，否则代表无需插入结束循环即可
                if (tmp < nums[j]) {
                    nums[j + 1] = nums[j];
                    nums[j] = tmp;
                } else {
                    break;
                }
            }
        }
        return nums;
    }

}
