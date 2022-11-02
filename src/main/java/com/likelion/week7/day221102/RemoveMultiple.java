package com.likelion.week7.day221102;

public class RemoveMultiple {

    public int solution(int n) {
        int answer = 0;

        // 만든 리스트에서 2를 제외한 모든 2의 배수 지우기
        for (int i = 2; i <= n; i++) {
            boolean sosu = true;

            for (int j = 2; j * j < i; j++) {
                if(i % j == 0) {
                    sosu = false;
                    break;
                }
            }
            if(sosu) answer++;
        }
        return answer;
    }
}
