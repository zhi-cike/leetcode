package com.z.leetcode.easy;

import com.z.leetcode.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author zhi
 * @date 2024/7/3
 * @see P206_ReverseLinkedList
 */
public class P206_ReverseLinkedListTest {

    @Test
    public void testReverseList() {
        testExecute(new P206_ReverseLinkedList()::reverseList);
    }

    @Test
    public void testReverseList2() {
        testExecute(new P206_ReverseLinkedList()::reverseList2);
    }

    @Test
    public void testReverseList3() {
        testExecute(new P206_ReverseLinkedList()::reverseList3);
    }

    private void testExecute(Solution solution) {
        ListNode reverse;

        reverse = solution.reverseList(ListNode.createNodes());
        Assertions.assertNull(reverse);

        reverse = solution.reverseList(ListNode.createNodes(1));
        Assertions.assertEquals("1", reverse.toString());

        reverse = solution.reverseList(ListNode.createNodes(1, 2));
        Assertions.assertEquals("2,1", reverse.toString());

        reverse = solution.reverseList(ListNode.createNodes(1, 2, 3, 4, 5));
        Assertions.assertEquals("5,4,3,2,1", reverse.toString());
    }

    @FunctionalInterface
    public interface Solution {

        ListNode reverseList(ListNode head);
    }

}
