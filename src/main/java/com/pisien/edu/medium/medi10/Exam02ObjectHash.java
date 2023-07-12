package com.pisien.edu.medium.medi10;


import java.util.HashSet;
import java.util.Objects;

/**
 *   <Object>
 *       - Hash
 *       - 중복저장을 막기 위한 메커니즘
 *       - 사용자 정의 클래스에서는 hash 시리즈들은 반드시 hashcode()와 equals()오버라이딩을 해야 한다.
 *
 * */
public class Exam02ObjectHash {

    public static void main(String[] args) {

        HashSet hashSet = new HashSet();

        String str1 = new String("가");
        String str2 = new String("가");
        Person person1 = new Person("아나킨", 30);
        Person person2 = new Person("아나킨", 30);

        hashSet.add(str1);
        hashSet.add(str2);
        System.out.println(str1.equals(str2));

        hashSet.add(person1);
        hashSet.add(person2);
        System.out.println(person1.equals(person2));

        System.out.println("str1 = " + str1.hashCode());
        System.out.println("str2 = " + str2.hashCode());
        System.out.println("person1 = " + person1.hashCode());
        System.out.println("person2 = " + person2.hashCode());
        System.out.println("hashSet.size() = " + hashSet.size());

    }

    public static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }

        // hashCode() 오버라이딩
        // 1차적으로 hash 시리즈들은 동등객체 판단하기 위해서 hashCode()를 호출한다.
        @Override
        public int hashCode() {
            System.out.println("1차적으로 hash 시리즈들은 동등객체 판단하기 위해서 hashCode()를 호출한다.");
            System.out.println("name = " + name);

            //return this.name.hashCode() + this.age;         // 이전 버전
            return Objects.hash(this.name, this.age);  // 신규 버전
        }

        // equals() 오버라이딩
        // 2차적으로 값이 또 같은 equals() 호출됨
        // equals를 오버라이드 해서 사용자정의로 표현할 수 있다.
        @Override
        public boolean equals(Object obj) {
            System.out.println("2차적으로 값이 또 같은 equals() 호출됨");
            if (this == obj) return true;
            if (!(obj instanceof Person)) return false;
            Person person = (Person) obj;
            return Objects.equals(name, person.name);
        }

        // toString() 오버라이딩
        // 객체의 주소보다 좀 더 의미있는 데이터를 출력라고자 오버라이딩을 재선언함.
        @Override
        public String toString() {
            return "Person { " +
                    "        name = '" + name + "\n" +
                    "      , age  =  " + age  + "\n" +
                    "      } ";
        }
    }
}
