package com.likelion.week9.day221114;

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
        System.out.printf("%d %d\n", 0, arr[0]); // 0번 index 2
        System.out.printf("%d %d\n", arr.length - 1, arr[arr.length - 1]); // 48번 index 50

        // 2를 제외한 2의 배수 0으로 만들기
        int i = 0;
        // 2부터 시작하면 0번:2 1번:3 2번:4
        arr[2] = 0;
        arr[4] = 0;
        arr[6] = 0;

    }
}
