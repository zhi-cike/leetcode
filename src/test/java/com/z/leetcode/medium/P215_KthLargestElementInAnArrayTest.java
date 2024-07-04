package com.z.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author zhi
 * @date 2024/7/4
 * @see P215_KthLargestElementInAnArray
 */
public class P215_KthLargestElementInAnArrayTest {

    @Test
    public void testFindKthLargest() {
        testExecute(new P215_KthLargestElementInAnArray()::findKthLargest);
    }

    public void testExecute(Solution solution) {
        int kth;

        kth = solution.findKthLargest(new int[]{3}, 1);
        Assertions.assertEquals(3, kth);

        kth = solution.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2);
        Assertions.assertEquals(5, kth);

        kth = solution.findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4);
        Assertions.assertEquals(4, kth);
    }

    @FunctionalInterface
    public interface Solution {

        int findKthLargest(int[] nums, int k);

    }

}
