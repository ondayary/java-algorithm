package com.likelion.week8;

public class HashadNumber {

    // step1. 자릿수의 합 구하기
    // step2. 나누어 떨어지는지 체크하기

    public boolean solution(int x) {
        boolean answer = true;

        int sum = 0; // 자릿수의 합 구할 변수
        int num = x;

        while(num != 0) {
            sum = sum + (num % 10); // x를 몫으로 교체, 나머지는 sum에 누적
            num = num / 10;
        }

        if(x % sum == 0) { // 나머지가 0이면 하샤드 수 true
            answer = true;
        } else {
            answer = false;
        }

        return answer;
    }
}
