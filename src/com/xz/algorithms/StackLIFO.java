package com.xz.algorithms;

import java.util.Iterator;

/**
 *
 * 下压栈数组实现
 * @author zs
 * @param <Item>
 */
public class StackLIFO<Item> implements Iterable<Item>{
    private Item[] a = (Item[]) new Object[1];

    private int countStack = 0;
    public boolean isEmpty() {return  countStack == 0;}
    public int size() {return countStack; }

    private void resize(int max) {
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < countStack; i++) {
            temp[i] = a[i];
        }
        a = temp;
    }

    public void push(Item item) {
        // 将元素添加到栈顶
        if (countStack == a.length) {
            resize(2 * a.length);
        }
        a[countStack++] = item;
    }

    public Item pop() {
        Item item = a[--countStack];
        a[countStack] = null;
        if (countStack > 0 && countStack == a.length / 4) {
            resize(a.length/2);
        }
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<Item>
    {
        private int i = countStack;
        @Override
        public boolean hasNext() {return i > 0;}
        @Override
        public Item next() {return a[--i];}
        @Override
        public void remove() {

        }
    }

}
