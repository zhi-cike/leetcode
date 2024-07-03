package com.z.leetcode.easy;

import com.z.leetcode.common.ListNode;

/**
 * 206. 反转列表
 * https://leetcode.cn/problems/reverse-linked-list/description/
 *
 * 1. 迭代 {@link #reverseList}
 * 2. 递归 {@link #reverseList2}
 * 3. 迭代，空间占用大 {@link #reverseList3}
 *
 * @author zhi
 * @date 2024/7/3
 */
public class P206_ReverseLinkedList {

    /**
     * 挨个反转
     *
     * e.g.
     * [1,2,3,4,5]
     * 遍历过程如下
     * 1. reverse=[1], head=[2,3,4,5]
     * 2. reverse=[2,1], head=[3,4,5]
     * 3. reverse=[3,2,1], head=[4,5]
     * 4. reverse=[4,3,2,1], head=[5]
     * 5. reverse=[5,4,3,2,1], head=null
     *
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public ListNode reverseList(ListNode head) {
        // 反转后的头节点
        ListNode reverse = null;
        while (head != null) {
            // 记录当前节点的下一个节点
            ListNode next = head.next;
            // 修改当前节点的下一个为反转后的节点
            head.next = reverse;
            // 设置反转后的头节点
            reverse = head;
            // 继续遍历下一个节点
            head = next;
        }
        return reverse;
    }

    /**
     * 递归
     *
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            // 若长度<=1，则直接返回，无需递归
            // 若长度>1，结束递归的条件总是最后一个节点，所以反转头结点始终是最后一个节点
            return head;
        }
        // 反转头结点始终是最后一个节点
        ListNode reverse = reverseList2(head.next);

        // 假设当前节点为n，上次递归将大于n的节点进行了反转
        // n+2节点：{val=n+2, next=Node(n+1)}， n+1个节点： {val=n+1, next=null}
        // 所以 Node(n+1).next = Node(n) 即 Node(n).next.next = Node(n)
        // Node(n).next = null
        head.next.next = head;
        head.next = null;

        // 返回反转的头结点
        return reverse;
    }

    /**
     * 迭代，空间占用大
     *
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
    public ListNode reverseList3(ListNode head) {
        ListNode reverse = null;
        while (head != null) {
            reverse = new ListNode(head.val, reverse);
            head = head.next;
        }
        return reverse;
    }

}
