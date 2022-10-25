package algorithm;

import java.util.Stack;

public class SolveBracket {
    public boolean solution2(String s) {
        while(s.indexOf("()") >= 0) {
            s = s.replace("()", "");
        }
        return s.length() == 0;
    }

    // split, join으로 하는 방법
    public boolean solution3(String s) {
        while(s.indexOf("()") >= 0) {
             String[] splitted = s.split("\\(\\)");
             s = String.join("", splitted);
        }
        return s.length() == 0;
    }

    // Stack으로 풀기
     public boolean solution(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if('(' == s.charAt(i)) {
                st.push(s.charAt(i));
            } else if(')' == s.charAt(i)) {
                if(st.empty()) return false;
                // st.empty()일때 닫는 괄호가 들어오면
                // 짝이 안맞는 경우이기 때문에 return false를 해줍니다.
                st.pop();
            }
        }
        return st.empty();
    }
}
