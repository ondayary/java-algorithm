package com.likelion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class Stack02Test {

    /*
    @BeforeEach 각 테스트가 실행되기 전에 실행되는 구간
    각 테스트는 독립적으로 실행되어야 한다.

    그래서
    ex) db에서 데이터 지우는 코드
    ex) db에 데이터를 넣는 코드
    등을 넣습니다.
     */
    Stack02 st = new Stack02();
    @BeforeEach
    void setUp() {
        st.push(10);
        st.push(20);
    }

    @Test
    @DisplayName("push가 잘 되는지")
    void push() {
//        Stack02 st = new Stack02();
//        st.push(10);
//        거
        assertEquals(10, st.pop());
        // st.pop() 비어있을때 stack에서 pop을 하면 무슨일이 일어날까요?
        st.pop();
    }

    @Test
    void isEmpty() {
        Stack02 st = new Stack02();
        assertTrue(st.isEmpty()); // 비었을때 True
        st.push(10);
        assertFalse(st.isEmpty()); // 값이 들어 있을 때 False
        st.pop();
        assertTrue(st.isEmpty()); // 값을 뺐을 때 True
    }
    @Test
    void peek() {
        Stack02 st = new Stack02();
        // stack이 비었는데 peek() 할 때
        assertThrows(EmptyStackException.class,()->{
           st.peek();
        });
        st.push(10);
        int peeked = st.peek();
        assertEquals(10, peeked);
    }

    @Test
    void realStack() {
        Stack<Integer> st = new Stack<>(); // 실제 util에 있는 stack
        // st.pop(); // java.util.EmptyStackException 발생. 당연함. 아무 것도 없는데 뭘 pop해

        // pop 예외처리
        assertThrows(EmptyStackException.class, () -> {
            st.pop();
        });

        // peek 예외처리
        assertThrows(EmptyStackException.class, () -> {
            st.peek();
        });
    }
}