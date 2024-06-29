package com.z.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. 两数之和
 * https://leetcode.cn/problems/two-sum/
 *
 * 1. 利用哈希表单次遍历 {@link #twoSum}
 * 2. 暴力解法，遍历所有情况 {@link #twoSum2}
 *
 * @author zhi
 * @date 2024/6/29
 */
public class P1_TwoNum {

    /**
     * 利用哈希表单次遍历
     *
     * 时间复杂度：O(n)，其中 n 是数组的长度。
     * 空间复杂度：O(n)。
     */
    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        Map<Integer, Integer> cache = new HashMap<>();
        for (int i = 0; i < size; i++) {
            int diff = target - nums[i];
            // 判断第二个数是否已经在哈希表中，如果在取出位置即可，如果不在将其值和位置放入哈希表
            // 如果存在相同的数字会覆盖之前的位置
            if (cache.containsKey(diff)) {
                return new int[]{cache.get(diff), i};
            } else {
                cache.put(nums[i], i);
            }
        }
        return new int[]{};
    }

    /**
     * 暴力解法，遍历所有情况
     *
     * 时间复杂度：O(n^2)，其中 n 是数组的长度。
     * 空间复杂度：O(1)。
     */
    public int[] twoSum2(int[] nums, int target) {
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

}
