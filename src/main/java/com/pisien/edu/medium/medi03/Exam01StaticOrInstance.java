package com.pisien.edu.medium.medi03;

public class Exam01StaticOrInstance {
    int iv;         // 인스턴스(instance) 멤버 변수
    static int cv;  // 정적(static) 멤버 변수


    public static void main(String[] args) {

        // Exam01.iv = 100;                     // static 에서는 인스턴스 접근 불가능
        Exam01StaticOrInstance.cv = 200;        // static 에서는 static 만 접근 가능

        //Exam01.instanceMethod();              // static 에서는 인스턴스 메소드 호출 불가.
        Exam01StaticOrInstance.staticMethod();  // static 에서는 static 메소드 호출 가능.
        staticMethod();                         // 동일한 class 내에서는  클래스명 생략 가능.

    }

    /**
     * 인스턴스(instance) 멤버 메소드
     *    - 인스턴스 메소드가 호출될 시점에는 이미 인스턴스가 생성되어 있음.
     * */
    public void instanceMethod() {
        iv = 100;                               // 직접 접근 가능
        this.iv = 100;                          // this.iv로 접근 가능
        System.out.println("iv = " + iv);
        System.out.println("iv = " + this.iv);
        System.out.println("cv = " + cv);
        System.out.println("cv = " + this.cv);

        return ;
    }

    /**
     * 정적(static) 멤버 메소드
     *
     * */
    public static void staticMethod() {
        //System.out.println("iv = " + iv);       // static 에서는 인스턴스 접근 불가능
        //System.out.println("iv = " + this.iv);  // static 에서는 인스턴스 접근 불가능
        System.out.println("cv = " + cv);         // static 에서는 static 만 접근 가능
        //System.out.println("cv = " + this.cv);  // static 에서는 this 사용 불가
    }

}
