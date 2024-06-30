package com.z.leetcode.medium;

import com.z.leetcode.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author zhi
 * @date 2024/6/30
 * @see P2_AddTwoNumbers
 */
public class P2_AddTwoNumbersTest {

    @Test
    public void testAddTwoNumbers() {
        testExecute(new P2_AddTwoNumbers()::addTwoNumbers);
    }

    private void testExecute(Solution solution) {

        // l1 = [2,4,3], l2 = [5,6,4]  ->  [8,0,7]
        ListNode sum = solution.addTwoNumbers(ListNode.createNodes(2, 4, 3), ListNode.createNodes(5, 6, 4));
        Assertions.assertNotNull(sum);
        Assertions.assertEquals("7,0,8", sum.toString());

        // l1 = [0], l2 = [0]  ->  [0]
        sum = solution.addTwoNumbers(ListNode.createNodes(0), ListNode.createNodes(0));
        Assertions.assertNotNull(sum);
        Assertions.assertEquals("0", sum.toString());

        // l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]  ->  [8,9,9,9,0,0,0,1]
        sum = solution.addTwoNumbers(ListNode.createNodes(9, 9, 9, 9, 9, 9, 9), ListNode.createNodes(9, 9, 9, 9));
        Assertions.assertNotNull(sum);
        Assertions.assertEquals("8,9,9,9,0,0,0,1", sum.toString());

    }

    @FunctionalInterface
    public interface Solution {

        ListNode addTwoNumbers(ListNode l1, ListNode l2);

    }
}
