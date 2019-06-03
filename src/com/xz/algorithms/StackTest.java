package com.xz.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    @Test
    void size() {
        Stack<String> s;
        s = new Stack<String>(1000);
        s.push("11111");
        s.push("22222");
        assertEquals(s.size(), 2);
    }

}