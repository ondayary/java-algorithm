package com.likelion.week10.day221124;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static int fib(int n) {
        // n이 1이나 2가 들어오면 재귀를 안타고 return을 한다.
        if(n == 1 || n == 2) return 1; // 1일때 1, 2일때 2
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int result = fib(8);
        System.out.println(result);
    }
}
