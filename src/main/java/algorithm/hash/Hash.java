package algorithm.hash;

public class Hash {

    // Hash의 구현
    public int hash(String str) {
        int asciiCode = 0;
        for(int i = 0; i < str.length(); i++) {
            asciiCode += str.charAt(i);
        }
        return asciiCode % 1000; // 1000개
    }

    // Hash함수 완성
    public int hashLast(String key) {
        int asciiSum = 0;
        for(int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }
        return asciiSum % 90;
    }



}
