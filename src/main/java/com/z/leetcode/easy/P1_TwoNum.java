package com.z.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 1. 两数之和
 * https://leetcode.cn/problems/two-sum/
 *
 * 1. 利用哈希表单次遍历 {@link #twoSum}
 * 2. 暴力解法，遍历所有情况 {@link #twoSum2}
 * 3. 先排序，再遍历 {@link #twoSum3}
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

    /**
     * 先排序，后遍历
     */
    public int[] twoSum3(int[] nums, int target) {
        // 保留原始数组
        int[] originNums = Arrays.copyOf(nums, nums.length);
        // 从低到高排序
        Arrays.sort(nums);
        // 最小的数大于目标和，则直接返回
        if (nums[0] > target) {
            return new int[]{};
        }

        // 遍历排序后的数组，由于是排序的可以按左右指针缩进的方式
        int l = 0, r = nums.length - 1;
        Integer a = null, b = null;
        while (l < r) {
            int sum = nums[l] + nums[r];
            if (sum == target) {
                // 相等则成功找到
                a = nums[l];
                b = nums[r];
                break;
            } else if (sum < target) {
                // 小则右移左指针
                l++;
            } else {
                // 大则左移右指针
                r--;
            }
        }
        if (a == null) {
            // 未找到直接返回
            return new int[]{};
        }

        // 避免装拆箱过程
        int aValue = a;
        int bValue = b;

        // 由于排序后顺序打乱，需要用原始数组重新匹配位置
        // 位置不可能是小于0的值，所以可以用-1来标记默认值
        int[] result = new int[]{-1, -1};
        for (int i = 0; i < originNums.length; i++) {
            // 用默认值判断来实现唯一填充，且要保证一个值只能被使用一次
            if (originNums[i] == aValue && result[0] == -1) {
                result[0] = i;
            } else if (originNums[i] == bValue && result[1] == -1) {
                result[1] = i;
            }
            // 两个值填充完成，退出循环
            if (result[0] != -1 && result[1] != -1) {
                break;
            }
        }
        return result;
    }

}
