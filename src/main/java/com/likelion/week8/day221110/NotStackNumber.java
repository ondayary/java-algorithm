package com.likelion.week8.day221110;

import java.util.ArrayList;

public class NotStackNumber {

    // 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다.
    // 단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. 예를 들면,
    // arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
    // arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.

    // point1. 중복되지 않는 값을 넣는 것
    // point2. 변수 num을 for문 밖에서 선언하는 것

    public int[] solution(int[] arr) {
        int[] answer = {};

        // 남은 수 배열의 길이는 몇인지 모르니까 가변리스트로 정한다.
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        // 앞의 원소와 비교하기 위한 변수 preNum 선언
        int preNum = -1; // 원소가 0~9까지 이므로 영향 안받는 아무 숫자.

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != preNum) {
                // 처음에는 num과 중복되는 숫자가 없으므로 무조건 삽입
                arrList.add(arr[i]);
                // 숫자가 다른 경우에만 가변리스트에 삽입
                preNum = arr[i];
            }
        }

        // 일반 배열을 리턴해야하므로 가변 리스트를 일반 배열로 바꾸는 작업
        answer = new int[arrList.size()]; // answer 리스트 크기 선언.
        for(int i = 0; i < answer.length; i++) {
            answer[i] = arrList.get(i);
        }
        return answer;
    }
}
