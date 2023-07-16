package com.pisien.edu.pro.pro01Generic.example09;

public class StorageEx {

    public static void main(String[] args) {

        // 인터페이스 시에도 제너릭 상속이 필요조건임.
        Storable<String> storable = new Storage<>(5);

        for (int i=0; i<5; i++) {
            storable.add("마이카"+(i+1), i);
        }

        for (int i=0; i<5; i++) {
            System.out.println(storable.get(i));
        }
    }
}
