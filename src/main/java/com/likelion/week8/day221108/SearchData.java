package com.likelion.week8.day221108;

import java.util.Scanner;

public class SearchData {

    // CodeUp 3001 - 데이터 탐색
    // step1. n개의 데이터가 있을 때, 특정 데이터가 어떤 위치에 있는지 찾기
    // step2. 찾지 못했으면 -1을 반환

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 첫번째 줄에는 나열할 숫자들의 갯수를 입력한다.
        int number = sc.nextInt();

        // 두번째 줄에는 첫번째 줄에서 입력한 갯수만큼 숫자들을 입력한다.
        int[] arr = new int[number];

        for (int i = 0; i < number; i++) {
            arr[i] = sc.nextInt();
        }

        int result = -1;
    }
}
