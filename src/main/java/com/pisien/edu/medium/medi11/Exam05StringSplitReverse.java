package com.pisien.edu.medium.medi11;

public class Exam05StringSplitReverse {

    public static void main(String[] args) {

        /**
         *   <문자열 분할 함수>
         *       - split()
         * */
        String str = "나는,너의,아버지다,이름은,다스,베이다";

        String[] strArr = str.split(",");
        System.out.println("===========================================");
        for (String s : strArr) {
            System.out.println("splite 으로 잘라낸 단어 들 = " + s);
        }
        System.out.println();

        String str2 = "나는,너의/아버지다&이름은@다스&베이다";

        String[] strArr2 = str2.split(",|/|&|@");
        System.out.println("===========================================");
        for (String s : strArr2) {
            System.out.println("토큰으로 잘라낸 단어 들 = " + s);
        }
        System.out.println();



        /**
         *   <문자열 역순 함수>
         *       - reverse()
         * */
        String reverseStr = "";
        String forwardStr = "안녕하세요";
        int size = forwardStr.length();

        /** 
         *   <방법 1>   - 기본 알고리즘 이해
         *      - For 문장을 활용한 문자열 역순 찍기.
         *      - 힙메모리 사용: 메모리 낭비 
         * */
        for (int i=size; i>0; i--) {
            reverseStr += forwardStr.charAt(i - 1);
        }
        System.out.println("===========================================");
        System.out.println(" reverseStr = " + reverseStr);
        System.out.println();

        /**
         *   <방법 2>  - 추천 방법
         *      - String Builder reverse() 함수를 활용한 문자열 역순 찍기.
         *      - 버퍼 메모리 사용 : 메모리를 절약하면서 쓰는 유용한 함수 
         * */
        String reverseString = new StringBuilder(forwardStr).reverse().toString();
        System.out.println(" reverseString = " + reverseString);
        System.out.println();

    }
}
