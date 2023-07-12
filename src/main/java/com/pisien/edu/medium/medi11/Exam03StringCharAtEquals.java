package com.pisien.edu.medium.medi11;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 *  java.lang.string
 *     - charAt (int index)
 *     - equals
 *     - getBytes
 *     - indexOf
 *
 * */

public class Exam03StringCharAtEquals {

    public static void main(String[] args)  {

        String ssn1 = "980123-2234567";

        // 특정위치의 문자를 추출하고자 할때.
        char gender = ssn1.charAt(7);

        if ( gender=='1'||gender=='3' ) {
            System.out.println("남자입니다.");
        }
        else if ( gender=='2'||gender=='4' ) {
            System.out.println("여자입니다.");
        }
        else {
            System.out.println("외계인입니다.");
        }

        System.out.println();

       //[equals] ===========================================================
        String str1 = new String("홍길동"); // 번지 대입.
        String str2 = ("홍길동");                  // 리터럴 타입의 대입
        String str3 = ("홍길동");                  // 리터럴 타입의 대입

        // 주소 비교
        if (str1==str2) {
            System.out.println("1과 2는 주소가 같습니다.");
        }
        else {
            System.out.println("1과 2는 주소가 다릅니다.");
            System.out.println("\t주소는 다르지만 값은 같은가요? " + str1.equals(str2));
        }
        if (str1==str3) {
            System.out.println("1과 3은 주소가 같습니다.");
        }
        else {
            System.out.println("1과 3은 주소가 다릅니다.");
            System.out.println("\t주소는 다르지만 값은 같은가요? " + str1.equals(str3));
        }
        if (str2==str3) {
            System.out.println("2과 3은 주소가 같습니다.");
            System.out.println("\t주소는 다르지만 값은 같은가요? " + str2.equals(str3));
        }
        else {
            System.out.println("2과 3은 주소가 다릅니다.");
        }
        System.out.println();


        //[getBytes] ===========================================================
        String str = "안녕하세요";
        try {
            System.out.println("[인코딩] ========================");
            // 컴퓨터가 가독할 수 있게 인코딩
            byte[] bytes1 = str.getBytes("EUC-KR");
            System.out.println("bytes1(EUC-KR)의 길이 = " + bytes1.length);  // 5자 * 2byte

            byte[] bytes2 = str.getBytes("UTF-8");
            System.out.println("bytes2(UTF-8)의 길이 = " + bytes2.length);   // 5자 * 3byte

            System.out.println("[디코딩] ========================");
            // 인간이 알아보기 쉽게 변환하는 과정
            String str11 = new String(bytes1, "EUC-KR");
            System.out.println("EUC-KR로 디코딩한 문자열 = " + str11);

            String str22 = new String(bytes2, "UTF-8");
            System.out.println("UTF-8로 디코딩한 문자열 = " + str22);

        }
        catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println();


        //[indexOf] ===========================================================
        String iStr = "오늘은 자바 공부 합시다.";
        int index = iStr.indexOf("공부");

        System.out.println("'공부'가 시작되는 인덱스 = " + index);

        // 찾기 : 공부라는 문자열이 포함되어 있으면...
        if (iStr.indexOf("공부") != -1) {
            System.out.println("공부가 문장에 포함되어 있습니다.");
        }
        else {
            System.out.println("공부가 문장에 포함되어 있지 않습니다.");
        }
    }

}
