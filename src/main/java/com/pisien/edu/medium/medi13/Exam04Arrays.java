package com.pisien.edu.medium.medi13;

import java.util.Arrays;

/**
 *   <배열 복사방식>
 *      1. Arrays.copyOf
 *      2. Arrays.copyOfRange
 *      3. System.arraycopy (제일 빠름)
 * */
public class Exam04Arrays {

    public static void main(String[] args) {

        int[] arr1 = new int[] {10, 20, 30, 40, 50, 60, 70, 80, 90};

        // 1. 배열 복사 방법 : Arrays.copyOf
        int[] arr2 = Arrays.copyOf(arr1, arr1.length);

        System.out.println("arr1 = " + Arrays.toString(arr1));
        System.out.println("arr2 = " + Arrays.toString(arr2));
        System.out.println();

        // 2. Arrays.copyOfRange
        int[] cloned = Arrays.copyOfRange(arr1, 2, 8);// 마지막 인덱스는 포함되지 않는다.
        System.out.println("cloned = " + Arrays.toString(cloned));
        System.out.println();

        // 3. System.arrayCopy
        // arr1 원하는 인덱스에서 원하는 길이만큼 clone 으로 복사하기
        // 속도가 제일 빠름
        System.arraycopy(arr1, 5, cloned, 0, 3);
        System.out.println("arr1 = " + Arrays.toString(arr1));
        System.out.println("cloned = " + Arrays.toString(cloned));



    }

}
