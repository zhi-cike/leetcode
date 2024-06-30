package com.z.leetcode.medium;

/**
 * 11. 盛最多水的容器
 * https://leetcode.cn/problems/container-with-most-water/description/
 *
 * 1. 暴力解法 {@link #maxArea}
 * 2. 双指针 {@link #maxArea2}
 * 3. 双指针优化 {@link #maxArea3}
 *
 * @author zhi
 * @date 2024/6/30
 */
public class P11_ContainerWithMostWater {

    /**
     * 暴力解法
     *
     * 遍历所有可能的情况，取出其中最大值
     *
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(1)
     */
    public int maxArea(int[] height) {
        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int area = (j - i) * Math.min(height[i], height[j]);
                maxArea = Math.max(area, maxArea);
            }
        }
        return maxArea;
    }

    /**
     * 双指针
     *
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public int maxArea2(int[] height) {
        int maxArea = 0;
        int l = 0, r = height.length - 1;
        while (l < r) {
            maxArea = Math.max(maxArea, (r - l) * Math.min(height[l], height[r]));
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxArea;
    }

    /**
     * 双指针优化
     *
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public int maxArea3(int[] height) {
        int maxArea = 0;
        int l = 0, r = height.length - 1;
        while (l < r) {
            maxArea = Math.max(maxArea, (r - l) * Math.min(height[l], height[r]));
            if (height[l] < height[r]) {
                int lHeight = height[l];
                while (l < r && height[l] <= lHeight) {
                    l++;
                }
            } else {
                int rHeight = height[r];
                while (l < r && height[r] <= rHeight) {
                    r--;
                }
            }
        }
        return maxArea;
    }

}
