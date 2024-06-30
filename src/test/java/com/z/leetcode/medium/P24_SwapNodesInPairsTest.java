package com.z.leetcode.medium;

import com.z.leetcode.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author zhi
 * @date 2024/6/28
 * @see P24_SwapNodesInPairs
 */
public class P24_SwapNodesInPairsTest {

    /**
     * 迭代法
     *
     * @see P24_SwapNodesInPairs#swapPairs
     */
    @Test
    public void testSwapPairs() {
        P24_SwapNodesInPairs solution = new P24_SwapNodesInPairs();

        // [1,2,3,4] -> [2,1,4,3]
        ListNode node = solution.swapPairs(ListNode.createNodes(1, 2, 3, 4));
        Assertions.assertNotNull(node);
        Assertions.assertEquals("2,1,4,3", node.toString());

        // [] -> []
        node = solution.swapPairs(ListNode.createNodes());
        Assertions.assertNull(node);

        // [1] -> [1]
        node = solution.swapPairs(ListNode.createNodes(1));
        Assertions.assertNotNull(node);
        Assertions.assertEquals("1", node.toString());
    }


}
