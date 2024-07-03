package com.z.leetcode.easy;

import com.z.leetcode.common.ListNode;

/**
 * 206. 反转列表
 * https://leetcode.cn/problems/reverse-linked-list/description/
 *
 * 1. 挨个反转 {@link #reverseList}
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

}
