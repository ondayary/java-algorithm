package com.likelion.week8.day221110;

import java.util.Stack;

public class StackNumber {

    public int[] solution(int []arr) {

        int[] answer = {};

        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < arr.length; i++){
            if(st.empty()) {
                st.push(arr[i]);
            } else {
                if(st.peek() != arr[i]) st.push(arr[i]);
            }
        }
        answer = new int[st.size()] ;

        for(int i=answer.length - 1;i >= 0; i--){
            answer[i] = st.peek();
            st.pop();
        }
        return answer;
    }
}
