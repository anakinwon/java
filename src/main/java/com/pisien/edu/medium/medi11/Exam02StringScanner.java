package com.pisien.edu.medium.medi11;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

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

public class Exam02StringScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("입력 : ");
        String str = scanner.nextLine();
        System.out.println("str = " + str);

        // 이것보다는
        //byte[] b1 = str.getBytes();
        //System.out.println("Arrays.toString(b1) = " + Arrays.toString(b1));
        char[] ch = str.toCharArray();
        System.out.println("ch = " + ch.length);
        for (char c : ch) {
            System.out.println("c = " + c);
        }


        scanner.close();

    }




}
