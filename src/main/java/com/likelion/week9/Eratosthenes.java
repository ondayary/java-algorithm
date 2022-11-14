package com.likelion.week9;

public class Eratosthenes {
    public static void main(String[] args) {
        int N = 50;

        // n + 1 크기 만큼 생성 1부터 n까지의 인덱스로 접근
        int[] arr = new int[N - 1];
        System.out.println(arr.length);

        // 2 ~ 50까지 값 채우기
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 2;
        }
        System.out.printf("%d %d\n", 0, arr[0]);
        System.out.printf("%d %d\n", arr.length - 1, arr[arr.length - 1]);

    }
}
