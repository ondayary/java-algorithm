package com.likelion.week10.day221125;

public class GcdNum {
    public static int solution(int a, int b) {
        if(a == b) {
            return a;
        } else if (a > b) {
            return solution(a - b, b);
        }
        return 1;
    }
}
