package com.likelion;

import java.util.EmptyStackException;

public class Stack02 {
    private Integer[] arr;
    private int top;

    public Stack02() {
        this.arr = new Integer[10000];
    }

    public Stack02(int size) {
        this.arr = new Integer[10000];
    }

    public void push(int value) { // push에 놓고 alt+Enter
        // 10을 넣으면 arr[0] = 10
        this.arr[top++] = value;
        // this.arr[this.top++] = value; // 한줄로 줄이기
    }

    // 여기까지 Stack 초기화
    // Method는 test Code에서만 만들자

    public Integer[] getArr() {
        return arr;
    }

    public int pop() { // 제일 최근에 들어간 값을 제거한다.
        if(this.isEmpty()) {
            // throw new RuntimeException("스택이 비었습니다.");
            throw new EmptyStackException();
        } // 빈 pop()을 실행 하는 경우 exception 처리한다.

        return this.arr[--this.top];
    }
    /*
    증감 연산자 위치에 따른 변화
    this.top++는 현재 값을 쓰고 쓴 후에 값을 넣는다.
    –this.top는 현재 값에서 먼저 빼고 쓴다.

    i++ → 1이 올라가는가보다
     */

    public boolean isEmpty() {
        boolean isEmpty = this.top == 0;
        return isEmpty();
    }

    public int peek() {
        if(isEmpty()) throw new EmptyStackException();
        return this.arr[this.top -1];
    }
}