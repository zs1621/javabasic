package com.xz.Exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void addTwoNumbersT() {
        ListNode l1 = new ListNode(2);
        ListNode x1 = new ListNode(4);
        ListNode x2 = new ListNode(3);
        l1.next = x1;
        x1.next = x2;
        ListNode l2 = new ListNode( 5);
        ListNode y1= new ListNode(6);
        ListNode y2= new ListNode(7);
        l2.next = y1;
        y1.next = y2;
        ListNode l3 = new Solution().addTwoNumbers(l1, l2);

        assertEquals(l3.val, 7);
        assertEquals(l3.next.val, 0);

    }

    @Test
    void lengthLonestStr() {
        String x = "dvdf";
        int y = new Solution().lengthOfLongestSubstring(x);
        assertEquals(3, y);

        x = "dvddf";
        y = new Solution().lengthOfLongestSubstring(x);
        assertEquals(2, y);

        x = "aaaa";
        y = new Solution().lengthOfLongestSubstring(x);
        assertEquals(1, y);

        x = "abcabc";
        y = new Solution().lengthOfLongestSubstring(x);
        assertEquals(3, y);

        x = "pwwkew";
        y = new Solution().lengthOfLongestSubstring(x);
        assertEquals(3, y);

//        String x = "ohomm";
        x = "mmoho";
        y = new Solution().lengthOfLongestSubstring(x);
        assertEquals(3, y);


        x = "asjrgapa";
        y = new Solution().lengthOfLongestSubstring(x);
        assertEquals(6, y);

        x = "abba";
        y = new Solution().lengthOfLongestSubstring(x);
        assertEquals(2, y);


    }
}