package com.example.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void testbasicfuncion () {
        int x = 5;
        int y = 10;
        assertEquals (5, x);
        assertEquals (10, y);

    }
}
