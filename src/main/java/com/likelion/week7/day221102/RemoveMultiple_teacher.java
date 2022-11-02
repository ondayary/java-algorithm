package com.likelion.week7.day221102;

import java.util.ArrayList;
import java.util.List;

public class RemoveMultiple_teacher {

    public static void main(String[] args) {
        int N = 50; // 50미만의 모든 소수를 구한다.

        List<Integer> nums = new ArrayList<>();

        // 2 ~ 50 채우기
        for(int i = 2; i <= N; i++) nums.add(i);

        // 2의 배수 지우기 2제외
        // nums.removeIf(num -> num % 2 == 0 && num != 2);
        for(int i = 0; i < nums.size(); i++) {
            if(nums.get(i) % 2 == 0 && nums.get(i) > 2) nums.remove(i);
        }

        System.out.println(nums);
        System.out.println(nums.size());

        // 3의 배수 지우기 3제외
        for(int i = 0; i < nums.size(); i++) {
            if(nums.get(i) % 3 == 0 && nums.get(i) > 3) nums.remove(i);
        }

        System.out.println(nums);
        System.out.println(nums.size());

        // 4의 배수 지우기 4제외
        for(int i = 0; i < nums.size(); i++) {
            if(nums.get(i) % 4 == 0 && nums.get(i) > 4) nums.remove(i);
        }

        System.out.println(nums);
        System.out.println(nums.size());
    }
}
