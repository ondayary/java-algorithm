package com.likelion.week8.day221109;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {

        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        int i = 0;

        // arr[0] 번째에 들어갈 값 찾기
        // 그 값이 들어있는 Index 찾기

        int minIdx = 0;

        for (int j = 0; j < arr.length; j++) {
            if (arr [minIdx] > arr [j]) minIdx = j;
        }

        int temp = arr [0];
        arr[0] = arr [minIdx];
        arr [minIdx] = temp;

        System.out.println(Arrays.toString(arr));


/*        i = 1;

        // arr[1] 번째에 들어갈 값 찾기
        // 그 값이 들어있는 Index 찾기 -- 8
        // 0번은 정렬이 끝났기 때문에 7, 4, 9, 10, 223, 111, 23, 3, 39 만 생각

        minIdx= 1;
        for (int j = 1; j < arr. length; j++) {
            if (arr [minIdx] > arr[i]) minIdx = j;

            int temp2 = arr [0];
            arr[0] = arr [minIdx];
            arr [minIdx] = temp2;

            System.out.println(Arrays.toString(arr));
    }*/
}
}