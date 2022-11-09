package com.likelion.week8.day221109;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        int num;

        // 첫번째 for문에서는 기준이 되는 수를 정해준다.
        for(int i = 0; i < arr.length - 1; i++) {

            // 두번째 for문에서는 비교하여 가장 작은수의 인덱스와 교체한다.
            for(int j = i + 1; j < arr.length; j++) { // 0번 인덱스가 최소값이기 때문에 두번째는 i + 1
                if(arr[i] > arr[j]) {

                    // swap
                    num = arr[j];
                    arr[j] = arr[i];
                    arr[i] = num;
                }
            }
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
