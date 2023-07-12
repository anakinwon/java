package com.pisien.edu.medium.medi01;

public class Exam08Member {

    public static void main(String[] args) {

        System.out.println("===========================================");
        /**
         *  아래는 Static 맴버변수로, 인스턴스 생성없이 접근 가능하다.
         * */
        Member.staticMethod();
        Member.cv = 500;
        Member.staticMethod();

        System.out.println("===========================================");
        /**
         *  아래는 Static 맴버변수로, 인스턴스 생성없이 접근 가능하다.
         * */

        Member member = new Member();
        member.instanceMethod();
        member.iv = 999;
        member.instanceMethod();

        Exam08Member.study();
    }

    public static void study() {
        System.out.println("java 공부를 열심히 합시다!!!");
    }


    /**
     *    <Static 맴버변수와 인스턴스 맴버 변수와의 차이 알아보기>
     *        - static 은 static 만 호출 가능하다.
     *        - 인스턴스는 모두 호출 가능하다.
     *
     * */
    public static class Member {
        static int cv = 200;    // static  맴버 변수
        int iv = 100;           // 인스턴스 맴버 변수

        public void instanceMethod() {
            //System.out.println("iv = " + iv);       // 된다.
            //System.out.println("cv = " + cv);       // 된다.
            System.out.println("iv = " + this.iv);    // 된다.
            System.out.println("cv = " + Member.cv);  // 된다.
        }

        public static void staticMethod() {
            System.out.println("cv = " + cv);         // 된다.
            //System.out.println("iv = " + iv);       // 안된다.
            System.out.println("cv = " + Member.cv);  // 된다.
            //System.out.println("iv = " + this.iv);  // 안된다.

        }

    }
}

