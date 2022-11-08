package com.likelion.week8.day221107;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NumberArray {

    // 프로그래머스 - 나누어 떨어지는 숫자 배열
    // array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열 반환
    // divisor로 나누어 떨어지는 element 없을시 -1 반환

    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) { // 0 으로 나누어 떨어지면 배열 반환
                arrayList.add(arr[i]);
            }
        }

        // 만약에 떨어지는 원소가 없을 때 -1 반환
        if(arrayList.isEmpty()) {
            arrayList.add(-1);
        }

        // 오름차순 정렬
        Collections.sort(arrayList);

        return answer;
    }
}
