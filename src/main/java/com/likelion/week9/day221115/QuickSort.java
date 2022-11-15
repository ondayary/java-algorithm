package com.likelion.week9.day221115;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {

    // step1. 기준값 뽑기
    // step2. 기준값 기준으로 좌, 우로 나누기

    public static void main(String[] args) {
        int[] arr = {20, 18, 5, 19, 5, 25, 40, 50};

        int pivot = arr[arr.length / 2];
        System.out.println(pivot);

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(pivot > arr[i]) left.add(arr[i]);
            else if (pivot < arr[i]) right.add(arr[i]);
        }
        System.out.println(left);
        System.out.println(right);
    }
}
