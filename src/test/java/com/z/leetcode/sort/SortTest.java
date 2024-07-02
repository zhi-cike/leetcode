package com.z.leetcode.sort;

import com.z.leetcode.utils.ArrayUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author zhi
 * @date 2024/7/2
 * @see BubbleSort
 */
public class SortTest {

    @Test
    public void testBubbleSort() {
        testExecute(BubbleSort::bubbleSort);
    }

    @Test
    public void testQuickSort() {
        testExecute(QuickSort::quickSort);
    }

    @Test
    public void testSelectionSort() {
        testExecute(SelectionSort::selectionSort);
    }

    @Test
    public void testInsertSort() {
        testExecute(InsertSort::insertSort);
    }


    private void testExecute(SortSolution solution) {
        int[] sorts;

        sorts = solution.sort(null);
        Assertions.assertNull(sorts);

        sorts = solution.sort(new int[]{});
        Assertions.assertNotNull(sorts);
        Assertions.assertEquals("[]", ArrayUtil.toString(sorts));

        sorts = solution.sort(new int[]{1, 2, 3});
        Assertions.assertNotNull(sorts);
        Assertions.assertEquals("[1,2,3]", ArrayUtil.toString(sorts));

        sorts = solution.sort(new int[]{3, 2, 1});
        Assertions.assertNotNull(sorts);
        Assertions.assertEquals("[1,2,3]", ArrayUtil.toString(sorts));

        sorts = solution.sort(new int[]{3, 5, 2, 3, 1, 0, 2, 4});
        Assertions.assertNotNull(sorts);
        Assertions.assertEquals("[0,1,2,2,3,3,4,5]", ArrayUtil.toString(sorts));
    }

    @FunctionalInterface
    public interface SortSolution {

        int[] sort(int[] nums);

    }
}
