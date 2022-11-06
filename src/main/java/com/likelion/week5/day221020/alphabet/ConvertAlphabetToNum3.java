package com.likelion.week5.day221020.alphabet;

public class ConvertAlphabetToNum3 {

    // 알파벳 1글자를 받아서 A는 1 B는 2 .... Z는 26을 반환하는 메소드를 만들어 보세요

    public int AlphabetToNumber(char alpha) {
        return  (int)(alpha);
    }

    public static void main(String[] args) {

        ConvertAlphabetToNum3 atn = new ConvertAlphabetToNum3();
        System.out.println(atn.AlphabetToNumber('A'));
    }

    /*
    정답
    public int alphabetToNumber(char alpha) {
        return  (int)(alpha) - 64;
    }
    */
    /*
    public int convertAlphabetToNum(char c) {
        int num = (int) c;
        int result = num % 64;
        return result;
    }
     */
}



