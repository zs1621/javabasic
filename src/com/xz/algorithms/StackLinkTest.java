package com.xz.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackLinkTest {
    @Test
    void pop() {
        StackLink<String> stacklink = new StackLink<String>();
        assertThrows(IndexOutOfBoundsException.class, () -> {
            stacklink.pop();
        });

    }
}