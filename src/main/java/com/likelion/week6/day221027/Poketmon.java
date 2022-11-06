package com.likelion.week6.day221027;

import java.util.HashSet;
import java.util.Set;

public class Poketmon {

    // 중복 제거를 할 수 있는지?
    // N을 구하는 식을 짤 수 있는지?

    public int solution(int[] nums) {

        // set으로 만든 이유: 중복을 없애기 위해 [3,2,1,2,] --> [3,2,1]
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int N = nums.length / 2; // ex)5 int or float 2 vs 2.5

        // set의 개수와 N중에서 하나를 return한다.
        // length가 6개라서 N이 3이 나왔다. [333222]
        if (set.size() < N) {
            return set.size();
        } else {
            return N;
        }
    }
}
