package com.likelion.week9.day221118;

public class CaesarCode {

    // 입력값은 String, 한자리씩마다 n씩 움직인다.

    /*
        ascii code
        공백: 32 / A-Z: 65 ~ 90 / a-z: 97 ~ 122

        String to Char
        str.charAt(index)

        대소문자확인
        Character.isLowerCase() / Character.isUpperCase()
     */

    public String solution(String s, int n) {
        String answer = "";

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); // str을 char타입으로 변환

            int num = ch + n; // n만큼 더해서 반환
            if (ch >= 'A' && ch <= 'Z') {
                if (num > 'Z') {
                    answer += (char)(64 + num % 90);
                } else {
                    answer += (char)(num);
                }
            } else if (ch >= 'a' && ch <= 'z') {
                if (num > 'z') {
                    answer += (char)(96 + num % 122);
                } else {
                    answer += (char)(num);
                }
            } else {
                answer += ch;
            }
        }
        return answer;
    }
}
