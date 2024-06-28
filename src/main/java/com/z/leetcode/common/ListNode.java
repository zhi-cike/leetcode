package com.z.leetcode.common;

/**
 * 链表节点
 *
 * @author zhi
 * @date 2024/6/28
 */
public class ListNode {

    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode node = this;
        while (node != null) {
            sb.append(node.val);
            node = node.next;
            if (node != null) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /**
     * 创建链表
     */
    public static ListNode createNodes(int... arr) {
        if (arr == null || arr.length <= 0) {
            return null;
        }
        ListNode head = new ListNode(arr[0]);
        ListNode last = head;
        for (int i = 1; i < arr.length; i++) {
            last.next = new ListNode(arr[i]);
            last = last.next;
        }
        return head;
    }

}
