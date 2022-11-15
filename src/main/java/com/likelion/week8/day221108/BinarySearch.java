package com.likelion.week8.day221108;

public class BinarySearch {
    public static void main(String[] args) {

        int targetNumber = 7;

        int[] nums = new int[]{1,2,3,4,5,6,7,8,9,10,11};

        // 중간값 찾기
        int startIndex = 0;
        int endIndex = nums.length - 1;
        int targetIdx = -1;

//        int midIndex = nums.length / 2;
//        int midValue = nums[midIndex];
//        System.out.println(midValue); // 6

       /* while (startIdx <= endIdx) {
            int midIdx = (startIdx + endIdx) / 2;
            int midValue = nums[midIdx];
            // 인덱스(시작점, 끝점) 옮기기
            if (midValue > targetNum) { //  1 -(3)- 6 --- 11
                endIdx = midIdx - 1;
            } else if (midValue < targetNum) { //  1 --- 6 --(8)- 11
                startIdx = midIdx + 1;
            } else {
                // 같은경우 = 답
                // 같은지 비교하기
                System.out.println(midIdx);
                targetIdx = midIdx;
                break;
            }
        }
        System.out.println(targetIdx);
    }


    // 인덱스(시작점, 끝점) 옮기기
        if(midValue > midIndex) { // 7이 6보다 큰가? 작은 것은 버린다.
            startIndex = midIndex + 1;
        } else if (midValue < targetNumber) { // 6 이상을 모두 버린다.
            endIndex = midIndex - 1;
        } else {
            // 같은 경우 = 답
            // 같은지 비교하기
            System.out.println(midIndex);
        }*/
    }
}
