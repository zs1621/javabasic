package com.xz.algorithms;


import java.util.Iterator;
import java.lang.IndexOutOfBoundsException;
/**
 * 下压栈 链表实现
 *
 * @author zs
 * @param <Item>
 */
public class StackLink<Item> implements Iterable<Item> {
    private Node first;
    private int countStack = 0;

    private class Node {
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return countStack == 0;
    }

    public int size() {
        return countStack;
    }

    public void push(Item item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        countStack++;

    }

    public Item pop() {

        if (countStack != 0) {
            countStack --;
        } else {
            throw new IndexOutOfBoundsException("new");
        }
        Item item = first.item;
        first = first.next;
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ReverseStackIterator();
    }

    private class ReverseStackIterator implements Iterator<Item> {
        // 支持
        private Node current = first;
        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item temp = current.item;
            current = current.next;
            return temp;
        }

        @Override
        public void remove() {}

    }
}
