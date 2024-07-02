package com.z.leetcode.sort;

/**
 * 快速排序
 *
 * @author zhi
 * @date 2024/7/2
 */
public class QuickSort {

    /**
     * 快速排序
     * 从小到大排序，且会修改原本的数组
     *
     * 在指定的数组段内[left, right]选定一个值，假设为P，初始时[left=0, right=nums.length-1]
     * 随后以P为准，遍历数组段，将小等于P的移到数组的最左侧
     * 遍历完成后，会得到P的最新位置，假设为index，将index作为下次数据段分割基准
     * 下次分为两段[left, index-1] [index-1, right]
     *
     * 核心逻辑示例
     * nums = [3,2,0,1]
     * left=0, right=3
     * 1. P=nums[3]=3; index=0
     * 2. 遍历数组段, 遍历序号定义j=left, 循环结束条件j<right
     * 1) j==left nums[j]>P => index=0 nums=[3,2,0,1]
     * 2) j==left+1 nums[j]>P => index=0 nums=[3,2,0,1]
     * 3) j==left+2 nums[j]<=P swap(j, index) => index=1 nums=[0,2,3,1]
     * 3. 循环结束
     * 由于P本身是符合<=P的条件，将自己前移，swap(index, right) => index=1 nums=[0,1,3,2]
     * 4. 最终结果 index=1  nums=[0,1,3,2]
     *
     * 时间复杂度：O(nlogn)
     * 空间复杂度：O(1)
     */
    public static int[] quickSort(int[] nums) {
        if (nums == null) {
            return null;
        }
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    private static void quickSort(int[] nums, int left, int right) {
        // 分段长度小于等于0时结束递归
        if (left >= right) {
            return;
        }
        // 【核心逻辑】获取下一分段的分界点
        int p = partition(nums, left, right);

        quickSort(nums, left, p - 1);
        quickSort(nums, p + 1, right);
    }

    private static int partition(int[] nums, int left, int right) {
        // 选中最后一个点为基准，或者可以选择其他点
        int p = nums[right];
        // 分界点位置
        int index = left;
        for (int i = left; i <= right; i++) {
            // 将小于等于基准点的值移到数组前边
            if (nums[i] <= p) {
                swap(nums, i, index);
                index++;
            }
        }
        // 最终的分界点位置
        return index - 1;
    }

    private static void swap(int[] nums, int i, int j) {
        // 如果本身是正序的，不需要交换
        if (i == j) {
            return;
        }
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }


}
