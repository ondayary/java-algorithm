package com.likelion.week7;

import javax.swing.plaf.nimbus.State;

interface StatementStrategy {
    boolean compare(int a, int b);
}

public class TemplateCallbackPrime {

    // Template, Callback → 함수를 매개변수(parameter)로 받고 싶을 때
    // → 특정 부분만 바뀌기 때문
    // i < num, i < num / 2, i * i <= num

//    boolean someOperation(int a, int b) {
//        return a < b;
//    }

    boolean isPrime(int num, StatementStrategy stmt) {
        // i < num
        // i < num / 2
        // i * i < num
        // sqrt

        for (int i = 2; stmt.compare(i, num); i++) {
            System.out.println(i);
            if(num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        TemplateCallbackPrime tcp = new TemplateCallbackPrime();
        System.out.println(tcp.isPrime(13, (a, b)-> a < b));
        System.out.println(tcp.isPrime(17, (a, b)-> a < b / 2));
        System.out.println(tcp.isPrime(19, (a, b)-> a * a < b));
    }
}
