package com.pisien.edu.medium.medi13;

import java.util.Arrays;
import java.util.Objects;

public class Exam03EqualsDeepEquals {

    public static void main(String[] args) {
        Integer integer1 = new Integer(1000);
        Integer integer2 = new Integer(1000);

        // 모든 포장클래스에서는 Object 클래스의 equals()오버라이딩이 되어 있다.
        System.out.print(".equals() 값 비교 : ");
        System.out.println(integer1.equals(integer2));  // true
        System.out.println();

        // Object 의 equals()는 기준이 되는 객체, 비교가 되어지는 객체 따로 분리가 되어 있는 형태
        // Objects 의 equals() 비교하는 2대상만 매개변수로 주면 된다. -- 유지보수 혹은 개발 유리
        System.out.print("Objects.equals() 값 비교 : ");
        System.out.println(Objects.equals(integer1, integer2));  // true
        System.out.println();

        Integer[] arr1 = new Integer[] {new Integer(10), new Integer(50)};
        Integer[] arr2 = new Integer[] {new Integer(10), new Integer(50)};

        System.out.print("배열의 얕은 비교 시 Objects.equals() 주소 비교 : ");  // false
        System.out.println(Objects.equals(arr1, arr2));
        System.out.println();

        System.out.print("배열의 깊은 비교 시 Objects.deepEquals() 주소 비교 : ");  // true
        System.out.println(Objects.deepEquals(arr1, arr2));
        System.out.println();
        System.out.print("배열의 깊은 비교 시 Objects.deepEquals() 배열 비교 : ");  // true
        System.out.println(Arrays.deepEquals(arr1, arr2));

    }

}
