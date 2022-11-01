package com.likelion.week7;

public class TemplateCallbackPrime {

    // Template, Callback → 함수를 매개변수(parameter)로 받고 싶을 때
    // → 특정 부분만 바뀌기 때문
    // i < num, i < num / 2, i * i <= num

    boolean someOperation(int a, int b) {
        return a < b;
    }

    boolean isPrime(int num) {
        // i < num
        // i < num / 2
        // i * i < num
        // sqrt

        for (int i = 2; someOperation(i, num); i++) {
            if(num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        TemplateCallbackPrime tcp = new TemplateCallbackPrime();
        boolean r = tcp.isPrime(17);
        System.out.println(r);
    }
}
