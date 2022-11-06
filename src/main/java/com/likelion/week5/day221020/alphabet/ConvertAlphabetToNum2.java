package com.likelion.week5.day221020.alphabet;

import java.util.Scanner;

public class ConvertAlphabetToNum2 {

    // 알파벳 1글자를 받아서 A는 1 B는 2 .... Z는 26을 반환하는 메소드를 만들어 보세요

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("알파벳 입력:");
        String str = sc.next();

        char[] ch = str.toCharArray();

        for(int i = 0; i < str.length(); i++) {
            System.out.print((ch[i]-'A') + 1 + " ");
        }
    }



}
