package com.likelion.week8;

public class HashadNumber {

    // step1. 자릿수의 합 구하기
    // step2. 나누어 떨어지는지 체크하기

    public boolean solution(int x) {
        boolean answer = true;

        int sum = 0; // 자릿수의 합 구할 변수
        int num = x;

        while(x != 0) {
            sum = sum + (x % 10);
            x = x / 10;
        }

        if(num % sum == 0) {
            answer = true;
        } else {
            answer = false;
        }

        return answer;
    }
}
