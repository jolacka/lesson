package com.example.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void testbasicfuncion () {
        int x = 2;
        int y = 4;
        assertEquals (2, x);
        assertEquals (4, y);

    }
}
