package com.xz.algorithms;

/**
 * 时间格式化
 *
 * @author zs
 * @date 2019/6/3
 */

public class Stack<Item> {
    /**
     stack entries  a
      **/
    private Item[] a;
    /**
     size
      **/
    private int numSizer;

    public Stack(int cap) {
        a = (Item[]) new Object[cap];
    }

    public boolean isEmpty() {
        return numSizer == 0;
    }

    public int size() {
        return numSizer;
    }

    public void push(Item item) {
        a[numSizer++] = item;
    }

    public Item pop() {
        return a[--numSizer];
    }

}
