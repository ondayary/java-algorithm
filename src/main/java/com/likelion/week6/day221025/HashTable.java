package com.likelion.week6.day221025;

public class HashTable {
    // 데이터를 저장하는 함수
    //.insert(key, value) key와 value를 받도록 설계
    // 생성자, 맴버변수(size, table)

    private int size = 10000;
    private int[] table = new int[size];

    // 매개변수 없는 기본 생성자
    public HashTable() { }

    // 매개변수 있는 생성자
    public HashTable(int size) {
        this.size = size;
        this.table = new int[size];
    }

    // .search()
    // .search(key) 형태로 값을 받아 옵니다.
    // this.table[hash(key)] key를 다시 hash로 만들어서 array에서 값을 뽑아 옵니다.
    public int search(String key) {
        return this.table[hash(key)];
    }

    // .insert(k, v)
    public void insert(String key, Integer value) {
        int hashCode = hash(key);
        this.table[hashCode] = value;
        System.out.println(key + " " + hashCode + "방에 저장이 완료되었습니다.");
    }
    public int hash(String key) {
        int asciiSum = 0;
        for(int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }
        return asciiSum % size;
    }

    public static void main(String[] args) {
        String[] names = new String[]{"DongyeonKang", "SubinKang", "KwanwunKo", "HyunseokKo", "KyoungdukKoo", "YeonjiGu", "SoyeonKown", "OhsukKwon", "GunwooKim", "KiheonKim", "NayeongKim", "DohyeonKim", "MinkyoungKim", "MinjiKim", "SanghoKim", "SolbaeKim",
                                      "YejinKim", "EungjunKim", "JaegeunKim", "JeonghyeonKim", "JunhoKim", "JisuKim", "kimjinah", "HaneulKim", "HeejungKim", "KimoonPark", "EunbinPark", "JeongHoonPark", "JeminPark", "TaegeunPark", "JiwonBae",
                                      "SeunggeunBaek", "JihwanByeon", "HeungseopByeon", "JeongHeeSeo", "TaegeonSeo", "SeeYunSeok", "SuyeonSeong", "SeyoelSon", "MinjiSong", "JinwooSong", "hyunboSim", "SominAhn", "JiyoungAhn", "ChangbumAn", "SoonminEom",
                                      "HyeongsangOh", "SuinWoo", "JuwanWoo", "InkyuYoon", "GahyunLee", "DaonLee", "DohyunLee", "SanghunLee", "SujinLee", "AjinLee", "YeonJae", "HyeonjuLee", "HakjunYim", "SeoyunJang", "SeohyeonJang", "JinseonJang", "SujinJeon",
                                      "SeunghwanJeon", "DaehwanJung", "JaeHyunJeung", "HeejunJeong", "GukhyeonCho", "MunjuJo", "YejiJo", "ChanminJu", "MinjunChoi", "SujeongChoi", "SeunghoChoi", "AyeongChoi", "GeonjooHan", "JinhyuckHeo", "MinwooHwang", "SieunHwang", "JunhaHwang"};

        // 이름으로 Hash 생성하기
        HashTable ht = new HashTable(200);
        for (int i = 0; i < names.length; i++) {
           ht.insert(names[i], ht.hash(names[i]));
        }
        System.out.println(ht.search(("DaonLee")));
    }

}
