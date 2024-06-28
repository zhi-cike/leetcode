package com.z.leetcode.medium;

import com.z.leetcode.common.ListNode;

/**
 * 24. 两两交换链表中的节点
 * https://leetcode.cn/problems/swap-nodes-in-pairs/
 *
 * 1. 迭代法 {@link P24_SwapNodesInPairs#swapPairs}
 *
 * @author zhi
 * @date 2024/6/28
 */
public class P24_SwapNodesInPairs {

    /**
     * 迭代法
     * 依次替换符合要求的节点
     */
    public ListNode swapPairs(ListNode head) {
        // 当链表为空或只有一个节点时,直接返回
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = null;
        ListNode lastNode = null;
        // 当前节点和其下一个节点存在,即满足调换条件
        while (head != null && head.next != null) {
            // 需要调换顺序的节点，node1定义可以去掉来节约内存使用
            ListNode node1 = head;
            ListNode node2 = head.next;
            ListNode node3 = head.next.next;

            // 调换两个节点
            node2.next = node1;
            node1.next = node3;

            if (lastNode == null) {
                // 记录首次已调换链表的尾节点
                lastNode = node1;
                // 记录调换后的头结点
                newHead = node2;
            } else {
                // 将调换的头结点链接至已调换链表尾部
                lastNode.next = node2;
                // 重置调换后的尾节点
                lastNode = node1;
            }
            // 指向新的待处理链表
            head = node3;
        }
        return newHead;
    }


}
