package com.likelion.week6.day221024;

import java.util.Arrays;

public class kthNumSlice {
    // prograammers
    public int[] solution(int[] arr, int[][] commands) {
        int[] answer = new int[commands.length];
        int index = 0;
        for(int[] command : commands) {
            // array를 slice한다.
            int[] slicedArr = Arrays.copyOfRange(arr, command[0]-1, command[1]);
            Arrays.sort(slicedArr); // array를 정렬한다.
            answer[index++] = slicedArr[command[2]-1]; // 정렬한 array의 index번째를 뽑는다.
        }
        return answer;
    }

    public static void main(String[] args) {
        kthNumSlice kns = new kthNumSlice();
    }
}
