package com.likelion.week6;

import java.util.HashMap;

public class Marathon {
    // 참여한 선수의 배열 : participant
    // 완주한 선수의 배열 : completion
    // 완주하지 못한 선수의 이름은 return
    // completion = participant - 1

    /*
        1. HashMap person에 Paricipant를 모두 넣었을 때 1로 초기화한다.
        2. completion에 들어있는 이름을 key로 HashMap에 검색합니다. 있으면 0으로 초기화한다.
        3. person을 한바퀴 돌면서 1인 값을 찾는다. (완주하지 못한 선수)
        4. Participant에 1명이 남으면 return한다.
     */

    public String solution(String[] participant, String[] completion) {

        String answer = "";
        HashMap<String, Integer> person = new HashMap<>();

        // 동명이인이 있을 수 있음
        for (int i = 0; i < participant.length; i++) {
            String key = participant[i];
            person.put(key, 1); // 1로 초기화
        }

        for (int i = 0; i < completion.length; i++) {
            String key = completion[i]; // 값을 찾는다.
            person.put(key, 0); // 0으로
        }

        for(String key : person.keySet()) { // keySet: 키값만 가져오는 함수
            if(person.get(key) == 1) { // 완주하지 못한 선수
                return key;
            }
        }

        return answer;
    }
}
