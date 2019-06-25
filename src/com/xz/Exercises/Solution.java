package com.xz.Exercises;

/**
 *
 * @author zs
 *
 * LeetCode 刷题
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        int indexCury = 0;
        ListNode l1temp = l1;
        ListNode l2temp = l2;
        int value1;
        int value2;
        int size = 0;

        ListNode last = new ListNode(0);

        while (l1temp != null || l2temp != null || indexCury > 0) {
            value1 = 0;
            value2 = 0;
            if (l1temp != null) {
                value1 = l1temp.val;
            }
            if (l2temp != null) {
                value2 = l2temp.val;
            }
            int res = value1 + value2 + indexCury - 10;
            if (res >= 0) {
                indexCury = 1;
            } else {
                res = value1 + value2 + indexCury;
                indexCury = 0;
            }
            if (l1temp != null) {
                l1temp = l1temp.next;
            }
            if (l2temp != null) {
                l2temp = l2temp.next;
            }
            ListNode temp = new ListNode(res);
            if (size == 0) {
                l3 = temp;
                last = temp;
                size += 1;
                l3.val = res;
                continue;
            }
            last.next = temp;
            last = temp;
            if (size == 1) {
                l3.next = temp;
            }
            size++;
        }
        return l3;
    }
}
