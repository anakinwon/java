package com.pisien.edu.medium.medi12;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 *  java.lang
 *     - 동적객체
 * */

interface  I {
    public void method();
}
class A implements I {
    @Override
    public void method() {
        System.out.println("A 메소드 호출");
    }
}
class B implements I {
    @Override
    public void method() {
        System.out.println("B 메소드 호출");
    }
}


public class Exam06DynamicObject {

    public static void main(String[] args) throws Exception  {

        /**
         *   <동적객체>
         *      - 다형성을 이용한 동적 Class 객체 생성
         * */
        // 동적으로 A.Class 를 생성
        Class class1 = Class.forName("com.pisien.edu.medium.medi12.A");
        I if1 = (I)class1.newInstance();
        if1.method();

        // 동적으로 B.Class 를 생성
        Class class2 = Class.forName("com.pisien.edu.medium.medi12.B");
        I if2 = (I)class2.newInstance();
        if2.method();

    }

}
