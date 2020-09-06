package app.offer.easy.e6;

import app.common.ListNode;

import java.util.Stack;
import java.util.Vector;

/**
 * 剑指 Offer 06. 从尾到头打印链表
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * <p>
 * 示例 1：
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 * <p>
 * 限制：
 * 0 <= 链表长度 <= 10000
 *
 * @author zhouz
 * @date 2020/9/6
 * @see [相关类/方法]
 * @since [版本号]
 */
public class Solution {

    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        for (; head != null; ) {
            stack.push(head.val);
            head = head.next;
        }
        int[] ints = new int[stack.size()];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = stack.pop();
        }
        return ints;
    }
}
