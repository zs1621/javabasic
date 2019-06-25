package com.xz.Exercises;


import java.util.Scanner;

/**
 *
 * @author zs
 */

public class TwoNumPlus {
    /**
    ListNode link define;
     */

    private static String ENTER_PATTERN = "\\r";
    public static class ListNode {
        ListNode first;
        ListNode last;
        ListNode next;

        int value;
        int size = 0;
        public ListNode(int x) {value = x;}
        public ListNode() {};
        public boolean hasNext() {
            return !(next == null);
        }

        public int toInt() {
            int i = 0;
            int index = 0;
            ListNode temp = first;
            while (temp != null) {
                if (index == 0) {
                    i = i+temp.value;
                } else {
                    i = (int) (i + temp.value * Math.pow(10, index));
                }
                index ++;
                temp = temp.next;
            }
            return i;
        }

        public void push(int x) {
            ListNode temp = new ListNode(x);
            if (size == 0) {
                first = temp;
                last = temp;
                size += 1;
                value = x;
                return;
            }
            last.next = temp;
            last = temp;
            if (size == 1) {
                next = temp;
                first.next = temp;
            }
            size ++;
        }

        public int getSize() {
            return size;
        }

    }

    /**
     * 数组转Link
     * @param data
     * @return
     */
    public static ListNode StringArrayToListNode(String[] data) {
        ListNode result = new ListNode(Integer.parseInt(data[0]));
        for (int i = 0, j = data.length - 1; i < data.length; i++, j--) {
            result.push(Integer.parseInt(data[i]));
        }
        return result;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        int indexCury = 0;
        ListNode l1temp = l1;
        ListNode l2temp = l2;
        int value1;
        int value2;

        while (l1temp != null || l2temp != null || indexCury > 0) {
            value1 = 0;
            value2 = 0;
            if (l1temp != null) {
                value1 = l1temp.value;

            }
            if (l2temp != null) {
                value2 = l2temp.value;

            }

            int res = value1 + value2 + indexCury- 10;
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
            l3.push(res);
        }
        return l3;
    }

    public static void  main(String[] strings) {
        System.out.printf("输入：");
        // A pattern for java whitespace(
        Scanner dataIn = new Scanner(System.in);
        String value = dataIn.nextLine();

        value = value.replace("(", "").replace(")", "");
        value = value.replace(" ", "").replace(" ", "");
        String[] datas = value.split("\\+", -1);
        String[] dataFirst = datas[0].split("->", -1);
        String[] dataSecond = datas[1].split("->", -1);
        String[] dataThird = new String[Math.max(dataSecond.length, dataFirst.length) + 1];

        ListNode l1 = StringArrayToListNode(dataFirst);
        ListNode l2 = StringArrayToListNode(dataSecond);
        ListNode l3 = new ListNode();
        l3 = new TwoNumPlus().addTwoNumbers(l1, l2);

        System.out.printf("输出：");
        ListNode l3temp = l3;
        while (l3temp != null) {
            if (l3temp.hasNext()) {
                if (l3temp.next == l3.last && l3.last.value ==0 ) {
                    System.out.printf("%s", l3temp.value);
                } else {
                    System.out.printf("%s -> ", l3temp.value);
                }
            } else {
                if (l3temp.value != 0) {
                    System.out.printf("%s\n", l3temp.value);
                } else {
                    System.out.printf("\n");
                }
            }
            l3temp = l3temp.next;
        }
        assert l1.toInt() + l2.toInt() == l3.toInt();

        System.out.printf("原因：%d + %d = %d", l1.toInt(), l2.toInt(), l3.toInt());
    }
}
