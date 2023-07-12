package com.pisien.edu.medium.medi13;

import java.util.Arrays;
import java.util.Collections;


/**
 *   <배열 정렬하기>
 *      1. Arrays.sort
 * */
public class Exam06ArraysSort {

    public static void main(String[] args) {

        int[] arr1 = new int[] {10, -20, 30, -40, 50, 60, -70, 80, -90};

        Arrays.sort(arr1);
        System.out.println("=====================================================");
        System.out.println(" 기본형 Type Sort 결과 = " + Arrays.toString(arr1));
        System.out.println();

        String[] names = new String[]{"padme", "anakin", "obiwan","yoda","duke"};
        Arrays.sort(names);
        System.out.println("=====================================================");
        System.out.println(" 기본형 Type Sort 결과 = " + Arrays.toString(names));
        System.out.println();


        // Comparable 을 구현해서 sort 하는 방법
        Person person1 = new Person("padme", 33);
        Person person2 = new Person("obiwan", 53);
        Person person3 = new Person("anakin", 23);
        Person person4 = new Person("yoda", 223);
        Person person5 = new Person("duke", 63);

        Person[] persons = {person1,person2,person3,person4,person5};

        // 오름차순
        //Arrays.sort(persons);
        // 내림차순
        Arrays.sort(persons, Collections.reverseOrder());
        System.out.println("=====================================================");
        for (Person person : persons) {
            System.out.println("person = " + person.age + ", " + person.name);
        }
        System.out.println();

        // 배열 검색은 반드시 sort 를 수행 후 검색해야 한다.
        Person findPerson = new Person("obiwan", 53);
        int index = Arrays.binarySearch(persons,  findPerson);
        System.out.println("=====================================================");
        System.out.println(persons[index].name);
        System.out.println();

    }

    // 사용자 정의 클래스는 정렬을 하기 위해서 Comparable 인터페이스를 구현해야 함
    public static class Person implements Comparable<Person> {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int compareTo(Person o) {
            // 이름으로 오름차순으로 자동 정렬하기
            return this.name.compareTo(o.name);
            // 이름으로 오름차순으로 자동 정렬하기
    //        return this.age - o.age;
        }

    }
}
