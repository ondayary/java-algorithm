package com.likelion;

public class Stack01 {
    private int[] arr = new int[10000]; // 10000개에 초기화
    // Stack01 Class의 member 변수로 arr의 위치를 이동했다.
    // new int[10000]개가 회색빛이기때문에 오버로딩하자
    private int pointer = 0; // -1이면 비어있는 상태
                              // 0으로 출발하면 arr[0]부터 쓸 수 있다.
    public Stack01() { // 오버로딩
    }

    public Stack01(int size) {
        this.arr = new int[size];
    }

    public void push(int value) {
        /*
        arr[0] = value; // 0번에 value를 넣었다.
        return arr;
         */
        this.arr[this.pointer] = value;
        this.pointer ++;
        /*
        push()는 value를 받아서 arr에 넣는 기능을 합니다.
        arr에 1개씩 pointer를 늘리면서 넣기 위해 pointer++연산을 추가 합니다.
        시작을 -1에서 출발 했으면 this.arr[idx] = value보다 pointer++를 먼저 씁니다.

        포인터(인덱스)가 가리키고 있는 배열자리에 value를 넣고
        포인터를 ++해서 배열의 다음자리를 가리키는..
        그래서 다음에 값을 넣으면 빈칸에 또 값이 들어가고 포인터는 한칸더 나가고

        바로 직전에 코드 수행해서 만들어진 결과가 인덱스의 어디에 위치해있는지?
         */
    }

    public int pop() {
        // push 10 push 20 point 2

        // int value = this.arr[this.pointer];
        int value = this.arr[this.pointer-1];
        this.pointer--;
        return value;
    }
    /*
    위 코드(.pop())의 문제점
    push를 할 때 this.pointer++를 하기 때문에 2개가 들어있으면 pointer는 2가 됩니다
    하지만 실제 배열에는 아래와 같이 0번, 1번에만 들어 있기 때문에 this.arr[this.pointer]로 접근 한다면 0이 나옵니다. 0이 나오는 이유는 int[]는 초기값을 0으로 잡기 때문입니다.
    */

    public int[] getArr() {
        return arr; // 내부에 구현체가 없기 때무에 arr를 리턴
    }
}
