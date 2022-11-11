package com.likelion.week8.day221111;

public class SecretMap {

    // 입력 : 지도 한변의 크기 n과 2개의 정수 배열인 arr1과 arr2가 들어온다.
    // 출력 : #과 공백으로 구성된 문자열을 배열로 출력한다.

    // 두 지도 중 하나라도 벽(#)이 있을 경우 해당 공간은 벽이다.
    // 10101 : # # #
    // 두 값 중 하나라도 1(#)일 경우 해당 공간은 1(#)이므로, OR 연산을 이용한다.

    // 10진수로 입력받은 arr1과 arr2를 2진수로 변환하고,
    // 앞 공백을 채워서 1은 #으로 0은 공백으로 변환하면 된다.

    class Solution {

        // step1. 10진수를 2진수로 변환
        // step2. 비트연산

        String getBinaryString(int decimalNum) {
            String answer = "";
            while (decimalNum > 0) {
                answer += decimalNum % 2;
                decimalNum /= 2;
            }
            return answer;
        }
    }
}
