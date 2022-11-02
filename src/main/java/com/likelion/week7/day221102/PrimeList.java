package com.likelion.week7.day221102;

import java.util.ArrayList;
import java.util.List;

public class PrimeList {
    public int solution(int N) {
        List<Integer> nums = new ArrayList<>();

        for (int i = 2; i <= N ; i++) nums.add(i);

        for(int j = 2; j * j <= N; j++) {
            for(int i = 0; i < nums.size(); i++) {
                if(nums.get(i) % j == 0 && nums.get(i) > j)
                    nums.remove(i);
            }
        }
        return nums.size();
    }
}
