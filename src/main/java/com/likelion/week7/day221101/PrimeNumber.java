package com.likelion.week7.day221101;

public class PrimeNumber {

    /*
    종이 조각에 적힌 숫자가 적힌 문자열 : numbers
    numbers : 길이 1 이상 7 이하, 0~9
    종이 조각으로 만들 수 있는 소수가 몇 개인지 return
     */

    public boolean isPrime(int num) {
        // num = 13이니까 12까지 나눠 보자
        for (int i = 2; i < num; i++) {
            // 2부터 13미만까지만 나눈다.
            System.out.printf("%d remainder:%d\n", i, num % i);

            if(num % i == 0) return false;
        }
        // 루프가 다 false일 때 isPrime이 true여야 하므로 기본 리턴을 true로 설정
        return true;
    }
}
