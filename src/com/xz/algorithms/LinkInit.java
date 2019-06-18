package com.xz.algorithms;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.NumberFormatException;


class LinkInit {
    public static class LinkNode {
        LinkNode first;
        LinkNode last;
        int value;
        LinkNode next;
        int size = 0;
        public boolean hasNext() {
            if (next == null) {
                return false;
            } else {
                return true;
            }
        }

        public void push(int value) {
            LinkNode temp = new LinkNode();
            temp.value = value;
            if (size == 0) {
                first = temp;
                last = temp;
                size += 1;
                return;
            }
            last.next = temp;
            if (size == 1) {
                first.next = temp;
                next = last;
            }
            last = temp;
            size += 1;
        }
    }
    public static void main(String[] strings) throws Exception {

        System.out.println("输入:");
        char closeCurly = ')';

        String[] subjects = new String[2];
        subjects[0] = "(";
        subjects[1] = "->";

        Scanner input = new Scanner(System.in);
        LinkNode l1;
        l1 = new LinkNode();
        LinkNode l1last;
        l1last = new LinkNode();
        String valueLast = "";
        int valueInt = 0;
        String value = input.next();
        int valueIntIndex = 0;
        while (!(String.valueOf(closeCurly).equals(value))) {
            System.out.println(value);
            // check 可以转化为数字
            if (Arrays.asList(subjects).contains(value)) {
                valueLast = value;
                value = input.next();
                continue;
            }
            // check 非数字
            try {
                valueInt = Integer.parseInt(value);
            } catch (NumberFormatException e) {
                throw new Exception("需要输入数字且输入的数字范围只能是个位数");
            }
            if (valueInt > 9 || valueInt <= 0) {
                throw new Exception("输入的数字不合法");
            }

            l1.push(valueInt);

            value = input.next();
         }

        LinkNode l1temp = l1;
        while (l1temp.hasNext()) {
            l1temp = l1temp.next;
            System.out.println(l1temp.value);
        }
    }


}
