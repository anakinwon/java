package com.pisien.edu.medium.medi11;

import java.io.IOException;

/**
 *  java.lang.string
 *     - String()                                // 기본 생성자
 *     - String(byte[] bytes)                    // 바이트 배열로 String 객체 생성하는 생성자
 *     - String(byte[] bytes, CharSet charset)   // 바이트 배열을 정한 문자셋으로 디코딩하는 생성자
 *     - String(byte[] bytes, int offset, int length, Charset charset)  // 바이트 배열의 길이를 지정하고, 문자셋으로 디코딩하는 생성자
 *
 *    <한글표현>
 *        - EUC-KR : 2bytes
 *        - UTF-8  : 3bytes
 *
 * */

public class Exam01StringFromKeyBoard {

    public static void main(String[] args) {

        byte[] bytes = new byte[100];
//        System.out.println(bytes[99]);

        System.out.print("입력 : ");

        try {
            // 키보드로부터 입력받는 표준입력
            // 입력받은 바이트 수를 반환해 줌.
            int read = System.in.read(bytes);
            System.out.println("read = " + read);

            //문자셋 EUC-KR로 디코딩한다.
            String strEuc = new String(bytes, 0, read-1, "EUC-KR");
            String strUtf = new String(bytes, 0, read-1, "UTF-8");
            System.out.println("strEuc = " + strEuc);
            System.out.println("strUtf = " + strUtf);

            byte[] euckr = "안녕하세요".getBytes("EUC-KR");
            String euckr2 = new String(euckr, 0, euckr.length, "UTF-8");
            System.out.println("euckr길이 = " + euckr.length);
            System.out.println("euckr한글 = " + euckr2);

            byte[] utf8  = "안녕하세요".getBytes("UTF-8");
            String utf82 = new String(utf8, 0, utf8.length, "UTF-8");
            System.out.println("utf8길이 = " + utf8.length);
            System.out.println("utf8한글 = " + utf82);

        }
        catch (IOException e) {

        }




    }




}
