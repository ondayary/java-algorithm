package com.likelion.week6.day221027;

import java.util.HashSet;
import java.util.Set;

public class Poketmon2 {

    // 같은 종류의 폰켓몬은 같은 번호를 가지고 있다.
    // 같은 종류의 폰켓몬이 2마리 이기때문에 종류 수의 최댓값은 2
    // nums : N마리 폰켓몬의 종류가 담긴 배열의 매개변수
    // nums/2 : 폰켓몬의 최대값

    public int solution(int[] nums) {

        int answer = 0;
        // 최대값 구하기
        int max = nums.length / 2;

        // 중복 제거하기
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) {
            set.add(num);
        }

        // 중복을 제거한 set의 크기가 max보다 크면 max를, 작으면 size를 return
        if(set.size() > max) {
            return max;
        } else {
            return set.size();
        }
    }
}
