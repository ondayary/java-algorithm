package com.likelion;

import com.likelion.week5.day221019.Stack01;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Stack01Test {
    @Test
    void pushTest() {
        Stack01 stack01 = new Stack01();
        stack01.push(10);
        stack01.push(20);

        int[] arr = stack01.getArr();
        // 10, 20
        assertEquals(10, arr[0]);
        assertEquals(20, arr[1]);
    }

    @Test
    @DisplayName("push or pop?")
    void pushAndPop() {
        Stack01 stack01 = new Stack01();
        stack01.push(10);
        stack01.push(20);

        assertEquals(20, stack01.pop());
        assertEquals(10, stack01.pop());

        stack01.push(30);
        assertEquals(30, stack01.pop());
    }
}