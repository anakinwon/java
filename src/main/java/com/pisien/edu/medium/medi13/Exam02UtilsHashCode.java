package com.pisien.edu.medium.medi13;

import java.util.Arrays;
import java.util.Objects;

public class Exam02UtilsHashCode {

    public static void main(String[] args) {

        Person person1 = new Person(10,"anakin", new int[] {174, 80});
        Person person2 = new Person(10,"anakin", new int[] {174, 80});

        // 동일한 해시코드를 가져오는지 해시코드로 확인하기.
        System.out.println("person1.hashCode = " + person1.hashCode());
        System.out.println("person2.hashCode = " + person2.hashCode());


        // 배열의 해시코드가 다른 이유는???
        // new 라는 연산자가 새로운 번지를 생성하므로
        int[] arr1 = new int[] {174, 80};
        int[] arr2 = new int[] {174, 80};

        System.out.println("arr1.hashCode = " + arr1.hashCode());
        System.out.println("arr2.hashCode = " + arr2.hashCode());
    }

    public static class Person {
        int age;
        String name;
        int[] arr;

        public Person(int age, String name, int[] arr) {
            super();
            this.age = age;
            this.name = name;
            this.arr = arr;
        }

        @Override
        public int hashCode() {
    //        int result = Objects.hash(age, name);
    //            result = 31 * result + Arrays.hashCode(arr);

            // (구버전 해시코드) 하위 호환을 위해서 아래와 같이 써줘야 한다.
            // array 는 같읕 값을 가지고 있어도, 해시코드가 다르다.
    //        return this.age                  // 값이 같으면 해시코드 같음
    //                + this.name.hashCode()   // 값이 같으면 해시코드 같음
    //                //+ this.arr.hashCode();   // 값이 같아도 해시코드 다름
    //                + Arrays.toString(this.arr).hashCode();   // 값이 같아도 해시코드 다름

            // (1.8버전 이상 최신버전 해시코드)
            return Objects.hash(this.age, this.name.hashCode(), Arrays.toString(this.arr));

        }
    }
}
