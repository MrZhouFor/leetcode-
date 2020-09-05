package app.all.easy.e206;

import app.common.ListNode;

/**
 * 反转一个单链表。
 *
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 *
 * @author zhouze
 * @date 2020/8/11
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null){
            return head;
        }
        ListNode cur = head;
        ListNode prev = null;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}
