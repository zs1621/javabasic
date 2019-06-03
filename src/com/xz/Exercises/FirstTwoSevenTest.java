package com.xz.Exercises;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;


class FirstTwoSevenTest {
    @Test
    public void timeFormat() throws Exception {
        assertEquals(FirstTwoSeven.mysetry("abcd"), "dcba");
    }

}