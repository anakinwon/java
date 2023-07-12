package com.pisien.edu.medium.medi07;

public class Exam07InterfaceDefault {

    public static void main(String[] args) {

        MyInterface myInterface = new Person();

        myInterface.defaultMethod();
        myInterface.method();

        // 인터페이스의 정적메소드도 호출하는 방법이 "인터페이스명.정적메소드명" 으로 호출함.
        MyInterface.staticMethod();

    }

    public static interface MyInterface {
        int MAX_NUM = 100;     // 정적 멤버
        public void method();  // 추상 메소드

        // JDK 1.8 부터 추가된 멤버
        default void defaultMethod() {
            System.out.println("MyInterface의 디폴트 메소드 호출됨");
        };
        static void staticMethod() {
            System.out.println("MyInterface의 정적메소드 호출됨");
        };

    }

    public static class Person implements MyInterface {

        @Override
        public void method() {
            System.out.println(MyInterface.MAX_NUM);
            System.out.println("MyInterface 를 구현한 Person 클래스의 메소드 호출");
        }

        // 구현 클래스들에게 전혀 영향을 미치지 않고,
        // 디폴트메소드에 필요한 구현 클래스에서만 오버라이딩을 해서 사용하면 된다.
        @Override
        public void defaultMethod() {
            MyInterface.super.defaultMethod();
            System.out.println("MyInterface 를 오버라이딩 한 메소드 호출");
        }
    }
}
