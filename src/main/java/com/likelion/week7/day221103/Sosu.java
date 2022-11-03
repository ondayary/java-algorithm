package com.likelion.week7.day221103;

import java.util.Arrays;

public class Sosu {

    // "소수가 되는 수의 배수를 지우면 남은 건 소수가 된다" 라는 알고리즘
    // 소수가 무엇인지 찾을 필요가 없으며 2부터 자기 자신을 제외한 배수가 되는 것을 지우면 된다.

    /*
    2의 배수 지울때 2, 4, 6 ..
    3의 배수 지울 때 4, 7, 10 ..
    4의 배수 지울 때 6, 10, 14 .. ----> 연습할 때 4의 배수를 꼭 지우세요
    5의 배수 지울 때 8, 13, 18 ..

    false로 check할 checks배열의 index는 2, 4, 6, 8
    배수는 2, 3, 4, 5, 6, 7, 8
     */

    /*
    2부터 주어진 수만큼의 크기의 배열checks을 복사하고,
    복사한 배열에 소수의 위치 check[i]를 false라고 변경 해놓고,
    2부터 주어진 수까지 반복하면서 자기자신을 제외한 자신의 배수를 nums에 포함하는 요소의 인덱스를 출력하라.
     */

    public static void main(String[] args) {

        // 초기 세팅
        int N = 50;
        int[] nums = new int[N-1]; // N-1개만큼 2~50까지 총 49개
        boolean[] checks = new boolean[nums.length]; // nums만큼 checks생성

        Arrays.fill(checks, true); // checks를 true로 초기화 cuz 기본값 false
        for(int i = 0; i < nums.length; i++) nums[i] = i + 2; // 2~50까지 nums에 채우기
        }
    }

}
