package com.z.leetcode.easy;

import com.z.leetcode.utils.ArrayUtil;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author zhi
 * @date 2024/6/29
 */
public class P1_TwoNumTest {

    /**
     * @see P1_TwoNum#twoSum
     */
    @Test
    public void testTwoSum() {
        testExecute(new P1_TwoNum()::twoSum);
    }

    /**
     * @see P1_TwoNum#twoSum2
     */
    @Test
    public void testTwoSum2() {
        testExecute(new P1_TwoNum()::twoSum2);
    }

    /**
     * @see P1_TwoNum#twoSum3
     */
    @Test
    public void testTwoSum3() {
        testExecute(new P1_TwoNum()::twoSum3);
    }

    public void testExecute(Solution solution) {

        // nums=[2,7,11,15], taget=9  ->  [0,1]/[1,0]
        int[] result = solution.twoNum(new int[]{2, 7, 11, 15}, 9);
        Assertions.assertNotNull(result);
        Assertions.assertTrue(Arrays.asList("[0,1]", "[1,0]").contains(ArrayUtil.toString(result)));

        // nums=[3,2,4], target=6  ->  [1,2]/[2,1]
        result = solution.twoNum(new int[]{3, 2, 4}, 6);
        Assertions.assertNotNull(result);
        Assertions.assertTrue(Arrays.asList("[1,2]", "[2,1]").contains(ArrayUtil.toString(result)));

        // nums=[3,3], target=6  ->  [0,1]/[1,0]
        result = solution.twoNum(new int[]{3, 3}, 6);
        Assertions.assertNotNull(result);
        Assertions.assertTrue(Arrays.asList("[0,1]", "[1,0]").contains(ArrayUtil.toString(result)));

        // nums=[3,3,1,5,4], target=7  ->  [0,4]/[4,0]/[1,4]/[4,1]
        result = solution.twoNum(new int[]{3, 3, 1, 5, 4}, 7);
        Assertions.assertNotNull(result);
        Assertions.assertTrue(Arrays.asList("[0,4]", "[4,0]", "[1,4]", "[4,1]").contains(ArrayUtil.toString(result)));

    }

    @FunctionalInterface
    public interface Solution {

        int[] twoNum(int[] nums, int target);

    }


}
