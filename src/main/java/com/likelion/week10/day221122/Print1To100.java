package com.likelion.week10.day221122;

public class Print1To100 {
    public static void printTo100(int n) {
        // 탈출 조건
        if(n > 100) {
            return;
        }
        System.out.println(n);
        printTo100(n + 1);
    }

    public static void main(String[] args) {
        printTo100(1);
    }
}
