package com.xz.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackLIFOTest {
    @Test
    void sizex() {
        StackLIFO<String> s;
        s = new StackLIFO<String>();
        s.push("11111");
        s.push("22222");
        assertEquals(s.size(), 2);
        s.pop();
        assertEquals(s.size(), 1);
        assertFalse(s.isEmpty());
    }
}