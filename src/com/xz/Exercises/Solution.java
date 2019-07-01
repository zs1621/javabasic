package com.xz.Exercises;

import java.util.HashSet;
import java.util.HashMap;

/**
 *
 * @author zs
 *
 * LeetCode 刷题
 */
public class Solution {

    /**
     * https://leetcode-cn.com/problems/add-two-numbers/
     * @param l1
     * @param l2
     * @return
     */
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


    /**
     * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
     * @param s string
     * @return int
     *
     * cpu: 22 ms
     * memory: 36.8 MB
     */

    public int lengthOfLongestSubstring(String s) {
        char[] stringarray = s.toCharArray();
        int t = stringarray.length;
        int longeStartIndex = 0;
        int longest = 0;
        int index_old = 0;
        HashMap<Character, Integer>  mapChar = new HashMap();
        for (int i=0; i < t; i++) {
            if (mapChar.containsKey(stringarray[i])) {
                index_old = mapChar.get(stringarray[i]);
                if (i - longeStartIndex > longest) {
                    longest =  i - longeStartIndex;
                }
                if (index_old + 1 > longeStartIndex) {
                    longeStartIndex = index_old + 1;
                }
            }
            mapChar.put(stringarray[i], i);
        }

        if (t - longeStartIndex > longest) {
            longest = t - longeStartIndex;
        }

        return longest;
    }


    /**
     *
     * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
     * @param s string
     * @return int
     * cpu: 308 ms
     * memory: 	98.1 MB
     */

//    public int lengthOfLongestSubstring(String s) {
//        LinkedHashSet<String> longestSet= new LinkedHashSet();
//
//        LinkedHashSet<String> currentSet= new LinkedHashSet();
//        char[] stringarray = s.toCharArray();
//        int t = stringarray.length;
//        for (int i=0; i < t; i++) {
//            String temp = String.valueOf(stringarray[i]);
//            if (currentSet.contains(temp)) {
//                if (currentSet.size() > longestSet.size()) {
//                    longestSet = (LinkedHashSet<String>) currentSet.clone();
//                }
//                LinkedHashSet<String> tempSet = (LinkedHashSet<String>) currentSet.clone();
//                currentSet.clear();
//                boolean flag = false;
//                int j = 0;
//                for (String tempString : tempSet) {
//                    if (tempString.equals(temp)) {
//                        j ++;
//                    }
//                    if (flag) {
//                        currentSet.add(tempString);
//                    }
//                    if (j > 0) {
//                        flag = true;
//                    }
//                }
//                currentSet.add(temp);
//            } else {
//                currentSet.add(temp);
//            }
//        }
//
//        if (currentSet.size() > longestSet.size()) {
//            return currentSet.size();
//        }
//
//        return longestSet.size();
//
//    }
}
