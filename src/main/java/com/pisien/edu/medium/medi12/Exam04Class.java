package com.pisien.edu.medium.medi12;

/**
 *  java.lang
 *     - Class()
 *         :
 *
 * */

public class Exam04Class {

    public static void main(String[] args)  {

        /**
         *   <Class>
         *      - getClass
         *
         * */
        Person person = new Person();
        Class class1 = person.getClass();

        System.out.println("================================================================");
        System.out.println("패키지명 포함 class name = " + class1.getName());
        System.out.println("패키지명 제외 class name = " + class1.getSimpleName());
        System.out.println();

        // 문자열로부터 객체의 정보를 얻는 방법
        //   : Class.forName();
        try {
            Class class2 = Class.forName("com.pisien.edu.medium.medi12.Exam04Class$Person");
            System.out.println(class2.getName());
            System.out.println(class2.getSimpleName());
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("================================================================");
        System.out.println("패키지명 포함 class name = " + class1.getName());
        System.out.println("패키지명 제외 class name = " + class1.getSimpleName());
        System.out.println();


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
