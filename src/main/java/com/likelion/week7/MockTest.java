package com.likelion.week7;

import java.util.ArrayList;
import java.util.List;

public class MockTest {
    /*
       1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
       2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
       3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
     */

    //
    public int[] solution(int[] answers) {

        // 수포자 세명의 찍는 방식이 각 5개, 8개, 10개씩 반복이 된다.
        int[] first = {1,2,3,4,5};
        int[] second = {2,1,2,3,2,4,2,5};
        int[] third = {3,3,1,1,2,2,4,4,5,5};

        int firstAnswer = 0;
        int secondAnswer = 0;
        int thirdAnswer = 0;

        // 정답을 맞출시 증가시켜준다.
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == first[i % 5]) { // == first[i % first.length]
                firstAnswer++;
            }
            if(answers[i] == second[i % 8]) {
                secondAnswer++;
            }
            if(answers[i] == third[i % 10]) {
                thirdAnswer++;
            }
        }

        // 가장 많은 문제를 맞힌 사람은 누구?
        int max = Math.max(Math.max(firstAnswer, secondAnswer), thirdAnswer);

        // 몇개가 나올지 몰라 리스트 만들기
        List<Integer> list = new ArrayList<>();

        if(max == firstAnswer) {
            list.add(1);
        }
        if(max == secondAnswer) {
            list.add(2);
        }
        if(max == thirdAnswer) {
            list.add(3);
        }

        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        // 1번 answer --> 5
        // 2번 answer --> 0

        MockTest mockTest = new MockTest();
//        mockTest.solution();
    }
}
