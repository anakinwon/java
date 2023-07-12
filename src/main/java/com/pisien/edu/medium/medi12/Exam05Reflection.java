package com.pisien.edu.medium.medi12;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 *  java.lang
 *     - Reflection()
 *         : 생성자 정보 알아보기
 *         : 필드 정보 알아보기
 *         : 메소드 정보 알아보기
 *
 * */

public class Exam05Reflection {

    public static void main(String[] args) throws Exception  {

        /**
         *   <Reflection>
         *      - Constructor
         *
         * */

        // 생성자 정보 알아보기
        Class class1 = Class.forName("com.pisien.edu.medium.medi12.Exam05Reflection$Person");
        System.out.println("[생성자정보]");
        Constructor[] constructors = class1.getDeclaredConstructors();

        for (Constructor constructor : constructors) {
            System.out.print(constructor.getName() +"(");
            Class[] param = constructor.getParameterTypes();

            for (int i=0; i<param.length; i++) {
                System.out.print(param[i].getSimpleName());
                if (i<(param.length-1)) {
                    System.out.print(", ");
                }
            }
            System.out.println(")");
        }
        System.out.println();

        // 필드 정보 알아보기
        Field[] fields = class1.getDeclaredFields();
        System.out.println("[필드정보]");
        for (Field field : fields) {
            System.out.println(field.getType().getSimpleName() + " " + field.getName());
        }
        System.out.println();


        // 메소드 정보 알아보기
        Method[] methods = class1.getDeclaredMethods();
        System.out.println("[메소드 정보]");
        for (Method method : methods) {
            System.out.print(method.getReturnType().getSimpleName() + " ");
            System.out.print(method.getName() + "(");

            Class[] class2 = method.getParameterTypes();
            for (int i=0; i<class2.length; i++) {
                System.out.print(class2[i].getSimpleName());
                if (i< (class2.length-1)) {
                    System.out.print(", ");
                }
            }
            System.out.println(")");
        }

    }


    public static class Person {
        private int age;
        private String name;

        public Person() {
        }

        public Person(int age, String name) {
            super();
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }
    }

}
