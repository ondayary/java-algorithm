package algorithm.hash;

public class HashFunction2 {

    // 입력받은 key를 한 글자씩 ascii code로 바꿔서 합친다.
    public int hash(String key) {
        for(int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            int asciiCode = c;
            System.out.printf("%s %d\n", c, asciiCode);
        }
        return 0;
    }

    // asciiCode들을 모두 합친다.
    public int hashSum(String key) {
        int asciiSum = 0;
        for(int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            int asciiCode = c;

            System.out.printf("%s %d\n", c, asciiCode);
            asciiSum += asciiCode;
        }
        System.out.println("asciiSum:" + asciiSum);
        return 0;
    }

    public static void main(String[] args) {
        HashFunction2 hf = new HashFunction2();
        hf.hash("daon");
    }
}

/*
출력 결과
d 100
a 97
o 111
n 110
 */