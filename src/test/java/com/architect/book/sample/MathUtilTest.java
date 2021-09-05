package com.architect.book.sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilTest {

    @Test
    void testAdd() {
        int c = MathUtil.add(1,5);
        assertEquals(6, c);
    }
}