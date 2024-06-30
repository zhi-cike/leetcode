package com.z.leetcode.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author zhi
 * @date 2024/6/30
 * @see ListNode
 */
public class ListNodeTest {

    @Test
    public void testCreate() {
        ListNode l = ListNode.createNodes();
        Assertions.assertNull(l);

        l = ListNode.createNodes(1);
        Assertions.assertEquals("1", l.toString());

        l = ListNode.createNodes(1, 2, 3);
        Assertions.assertEquals("1,2,3", l.toString());
    }

    @Test
    public void testReverse() {
        // [1,2,3]  ->  [3,2,1]
        ListNode reverse = ListNode.createNodes(1, 2, 3).reverse();
        Assertions.assertNotNull(reverse);
        Assertions.assertEquals("3,2,1", reverse.toString());

        // [6]  ->  [6]
        reverse = ListNode.createNodes(6).reverse();
        Assertions.assertNotNull(reverse);
        Assertions.assertEquals("6", reverse.toString());
    }
}
