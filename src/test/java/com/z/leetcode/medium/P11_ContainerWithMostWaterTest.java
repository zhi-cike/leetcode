package com.z.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author zhi
 * @date 2024/6/30
 */
public class P11_ContainerWithMostWaterTest {

    @Test
    public void testMaxArea() {
        testExecute(new P11_ContainerWithMostWater()::maxArea);
    }

    @Test
    public void testMaxArea2() {
        testExecute(new P11_ContainerWithMostWater()::maxArea2);
    }

    @Test
    public void testMaxArea3() {
        testExecute(new P11_ContainerWithMostWater()::maxArea3);
    }

    private void testExecute(MaxAreaAction solution) {
        // [1,8,6,2,5,4,8,3,7]  ->  49
        int maxArea = solution.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        Assertions.assertEquals(49, maxArea);

        // [1,1]  ->  1
        maxArea = solution.maxArea(new int[]{1, 1});
        Assertions.assertEquals(1, maxArea);
    }

    @FunctionalInterface
    public interface MaxAreaAction {

        int maxArea(int[] height);

    }
}
