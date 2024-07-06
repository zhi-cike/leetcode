package com.z.leetcode.medium;

import com.z.leetcode.sort.QuickSort;
import java.util.Arrays;

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

    /**
     * 快排
     * 先排序再选择
     *
     * 时间复杂度：O(nlogn)
     * 空间复杂度：O(n)
     */
    public int findKthLargest(int[] nums, int k) {
        QuickSort.quickSort(nums);
        return nums[nums.length - k];
    }

    /**
     * 桶排序
     *
     * 题目限制了-10000~10000的值范围，而且要求时间复杂度O(n)
     * 建立一比一的桶，是最符合的解法
     * 参考链接
     * https://leetcode.cn/problems/kth-largest-element-in-an-array/solutions/307351/shu-zu-zhong-de-di-kge-zui-da-yuan-su-by-leetcode-/comments/2216100
     *
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public int findKthLargest2(int[] nums, int k) {
        // 建立一比一的桶
        int[] buckets = new int[20001];
        Arrays.fill(buckets, 0);

        // +10000 处理负数的情况
        for (int num : nums) {
            buckets[num + 10000]++;
        }

        // 从高位到低位遍历桶
        // 遍历中游标就是值，游标对应的value是该值出现的次数
        int count = 0;
        for (int j = buckets.length - 1; j >= 0; j--) {
            count += buckets[j];
            if (count >= k) {
                return j - 10000;
            }
        }
        return 0;
    }

}
