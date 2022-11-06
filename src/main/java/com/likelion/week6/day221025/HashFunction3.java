package com.likelion.week6.day221025;

import java.util.ArrayList;
import java.util.List;

public class HashFunction3 {
    // 이 방법 말고도 다른 방법이 있습니다.

    // Object 내부 함수
    class Node {
        private String key;
        private Integer value;

        public Node(String key, Integer value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }
        public Integer getValue() {
            return value;
        }
    }

    int size = 10000;

    List<Node>[] table = new ArrayList[10000];

    // 아무것도 안할때는 defalut
    public HashFunction3() {
    }

    public HashFunction3(int size, List<Node>[] table) {
        this.size = size;
        this.table = new ArrayList[size];
    }

    // 입력받은 key를 한 글자씩 ascii code로 바꿔서 합친다.
    public int hash(String key) {
        for(int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            int asciiCode = c;
            System.out.printf("%s %d\n", c, asciiCode);
        }
        return 0;
    }

    // Node를 사용 하도록 .insert 변경
    public void insert(String key, int value) {
        // List
        int hashIndex = hash(key);
        if(this.table[hashIndex] == null) { // null일 때 생성
            this.table[hashIndex] = new ArrayList<>();
        }

        // Map, Object 두가지 방법이 있다.
        this.table[hashIndex].add(new Node(key, value));
    }

    // .get() 튜닝 과정 - List<Node>를 받아온다.
    public Integer get(String key) {
        List<Node> nodes = this.table[hash(key)];
        for(Node node : nodes) {
            if(key.equals(node.getKey())) {
                return node.value;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashFunction3 hf = new HashFunction3();
//        hf.hash("daon");
        hf.insert("Yoonseo", 1);
        hf.insert("Seoyoon", 2);

        int result = hf.get("Yoonseo");
        if (result == 1) {
            System.out.println("테스트 성공");
        } else {
            System.out.printf("테스트 실패 value:%d", result);
        }

        result = hf.get("Seoyoon");
        if (result == 2) {
            System.out.println("테스트 성공");
        } else {
            System.out.printf("테스트 실패 value:%d", result);
        }
    }
}

/*
출력 결과
d 100
a 97
o 111
n 110
 */