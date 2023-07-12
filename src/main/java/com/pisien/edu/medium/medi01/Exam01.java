package com.pisien.edu.medium.medi01;

import java.util.Arrays;

public class Exam01 {

    public static void main(String[] args) {

        // 붕어빵 찍기.
        // 설계도를 가지고 제품을 생산한다.
        // fi는 리모콘 같은 개념  (fi. 찍으면, 맴버변수들 보여준다.)
        FieldInit fi = new FieldInit();
        byte byteField = fi.byteField;
        System.out.println("byteField = " + fi.byteField);
        System.out.println("booleanFiled = " + fi.booleanFiled);
        System.out.println("floatFiled = " + fi.floatFiled);
        System.out.println("arrField = " + fi.arrField);

        System.out.println("fi = " + fi);
        System.out.println("fi.toString() = " + fi.toString());

    }

    /**
     *    <설계도, 붕어빵 틀>
     *
     *
     * */
    public static class FieldInit {

        // 기본형
        // 초기화를 하지 않아도 new 이용 시 자동 초기화 됨
        byte byteField;     // 1 Byte
        short shortFiled;   // 2 Byte
        int intFiled;       // 4 Byte
        long longFiled;     // 8 Byte

        boolean booleanFiled;  // 1 Byte
        char charFiled;     // 2 Byte

        float floatFiled;   // 4 Byte
        double doubleFiled; // 8 Byte

        // 참조형 변수
        int[] arrField;     // 4 Byte
        String strField;    // 4 Byte

        @Override
        public String toString() {
            return "FieldInit{" +
                    "byteField=" + byteField +
                    ", shortFiled=" + shortFiled +
                    ", intFiled=" + intFiled +
                    ", longFiled=" + longFiled +
                    ", booleanFiled=" + booleanFiled +
                    ", charFiled=" + charFiled +
                    ", floatFiled=" + floatFiled +
                    ", doubleFiled=" + doubleFiled +
                    ", arrField=" + Arrays.toString(arrField) +
                    ", strField='" + strField + '\'' +
                    '}';
        }
    }
}
