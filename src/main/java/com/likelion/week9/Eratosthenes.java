package com.likelion.week9;

public class Eratosthenes {
    public static void main(String[] args) {
        int N = 50;

        // n + 1 크기 만큼 생성 1부터 n까지의 인덱스로 접근
        int[] arr = new int[N - 1];
        System.out.println(arr.length);

        // 2번 인덱스부터
        for (int i = 2; i < arr.legnth; i++) {
            if(arr[i] == 0) {
                for (int j = 2; j < arr.length; j = j + i) {
                    // 2의 배수일경우 0으로 변경
                    if(arr[j] % 2 == 0) {
                        arr[i] == 0;
                    }
                }
            }
        }
    }
}
