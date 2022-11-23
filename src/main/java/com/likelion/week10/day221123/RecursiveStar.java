package com.likelion.week10.day221123;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RecursiveStar {

    // 반복할 메서드 만들기
    public static void printNum(int num) {
        if(num == 0) return;
        System.out.print("*");
        num--;
        printNum(num);
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printNum(num);
    }
}
