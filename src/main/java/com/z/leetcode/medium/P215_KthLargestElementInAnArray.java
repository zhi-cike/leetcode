package com.z.leetcode.medium;

import com.z.leetcode.sort.QuickSort;

/**
 * 215. 数组中的第K个最大元素
 * https://leetcode.cn/problems/kth-largest-element-in-an-array/description/
 *
 * 1. 快排 {@link #findKthLargest}
 * 2. TODO 时间复杂度O(n)解法
 *
 * @author zhi
 * @date 2024/7/4
 */
public class P215_KthLargestElementInAnArray {

    public int findKthLargest(int[] nums, int k) {
        QuickSort.quickSort(nums);
        return nums[nums.length - k];
    }

}
