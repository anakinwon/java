package com.pisien.edu.medium.medi03;


/**
 *   <final vs static final>
 *       - 상수 개념
 *       - 처음 한 번 정의 되면, 변경 할 수 없다.
 *       - 상수 명명은 대문자로 작성한다.
 *       - final은 Heap 메모리 영역에 생성됨
 *       - static final은 class 메모리 영역에 생성됨
 *
 * */
public class Exam03FinalOrStaticFinal {

    public static void main(String[] args) {

        Person person = new Person(25);

        // final 변수는 초기화 이후 변경 할 수 없다.
        //person.nation = "USA";
        //person.age = 32;

        System.out.println("국적   = " + person.nation);
        System.out.println("나이   = " + person.age);
        System.out.println("최대치 = " + person.MAX_NUMBER);

    }

    public static class Person {

        /**
         *  불변의 정적 상수 - static final
         *    - 선언과 동시에 반드시 초기화가 되어야 한다.
         *    - 전역변수로 사용되는 공용 메모리
         *
         * */
        static final int MAX_NUMBER = 1000;

        /**
         *  final 초기화 방법
         *    - 선언과 동시에 초기화
         * */
        final String nation = "KOREA";

        /**
         *    - 생성자에서 단 한 번 초기화
         * */
        final int age;
        public Person(int age) {
            this.age = age;
        }

    }
}

