package com.z.leetcode.medium;

import com.z.leetcode.common.ListNode;

/**
 * 2. 两数相加
 * https://leetcode.cn/problems/add-two-numbers/description/
 *
 * 1. 依次遍历 {@link #addTwoNumbers}
 *
 * @author zhi
 * @date 2024/6/30
 */
public class P2_AddTwoNumbers {

    /**
     * 依次遍历
     * 链表已经从低位到高位的顺序，只需要按顺序叠加两个链表即可，只是需要处理进位的情况
     *
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 最终的求和链表
        ListNode sum = null;
        ListNode sumTmp = null;
        int add = 0;
        // 链表尚未遍历完成或存在进位
        while (l1 != null || l2 != null || add > 0) {
            // 求当前位置的和及进位
            int tmp = add;
            tmp = l1 != null ? tmp + l1.val : tmp;
            tmp = l2 != null ? tmp + l2.val : tmp;
            add = tmp / 10;
            tmp = tmp % 10;

            // 更新求和后的链表
            if (sumTmp == null) {
                sum = new ListNode(tmp);
                sumTmp = sum;
            } else {
                sumTmp.next = new ListNode(tmp);
                sumTmp = sumTmp.next;
            }

            // 更新两个链表至最新节点
            l1 = l1 != null ? l1.next : l1;
            l2 = l2 != null ? l2.next : l2;
        }
        return sum;
    }

}
