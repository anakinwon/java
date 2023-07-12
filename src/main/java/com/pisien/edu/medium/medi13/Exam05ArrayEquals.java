package com.pisien.edu.medium.medi13;

import java.util.Arrays;
import java.util.Objects;

/**
 *   <배열 복사방식>
 *      1. Arrays.copyOf
 *      2. Arrays.copyOfRange
 *      3. System.arraycopy (제일 빠름)
 * */
public class Exam05ArrayEquals {

    public static void main(String[] args) {

        int[] origin = new int[] {10,20,30,40,50,60,70,80,90,100};
        int[] cloned = Arrays.copyOf(origin, origin.length);

        // 인스턴스 - 얕은 비교 
        System.out.println("origin = " + Arrays.toString(origin));
        System.out.println("cloned = " + Arrays.toString(cloned));
        System.out.println(Arrays.equals(origin,cloned));
        System.out.println(Objects.equals(origin,cloned));
        System.out.println("==========================================");

        // 클래스 - 얕은 비교
        Car[] car1 = new Car[2];
        car1[0] = new Car("그렌져");
        car1[1] = new Car("제니시스");

        Car[] car2 = Arrays.copyOf(car1, car1.length);
        System.out.println("car1 = " + Arrays.toString(car1));
        System.out.println("car2 = " + Arrays.toString(car2));
        System.out.println(Arrays.equals(car1,car2));
        System.out.println(Objects.equals(car1,car2));
        System.out.println("==========================================");

        // 2차원 배열 생성
        int[][] origin2 = new int[][] {
                {10, 20}
               ,{30, 40}
        };
        int [][] cloned2 = Arrays.copyOf(origin2, origin2.length);
        System.out.println("origin2 = " + Arrays.toString(origin2[0]));
        System.out.println("cloned2 = " + Arrays.toString(cloned2[0]));
        System.out.println(Arrays.equals(origin2,cloned2));
        System.out.println(Arrays.deepEquals(origin2,cloned2));
        System.out.println("==========================================");

        // 복제된 값을 변경하면 원본도 바뀐다????
        cloned2[0][0] = 100;
        System.out.println("복제된 값을 바꾸면 원본도 바뀐다???");
        System.out.println("origin2 = " + Arrays.toString(origin2[0]));
        System.out.println("cloned2 = " + Arrays.toString(cloned2[0]));
        System.out.println(Arrays.equals(origin2,cloned2));
        System.out.println(Arrays.deepEquals(origin2,cloned2));
        System.out.println("==========================================");


        System.out.println();
        // 2차원 배열 생성
        int[][] origin3 = new int[][] {
                {10, 20}
                ,{30, 40}
        };
        int [][] cloned3 = Arrays.copyOf(origin3, origin3.length);
        // 이렇게 복제해야 클론이 바뀌어도 원본은 바뀌지 않는다.
        cloned3[0] = Arrays.copyOf(origin3[0], origin3[0].length);
        cloned3[1] = Arrays.copyOf(origin3[1], origin3[1].length);

        cloned3[0][0] = 200;

        System.out.println("origin3 = " + Arrays.toString(origin3[0]));
        System.out.println("cloned3 = " + Arrays.toString(cloned3[0]));
        System.out.println(Arrays.equals(origin3,cloned3));
        System.out.println(Arrays.deepEquals(origin3,cloned3));
        System.out.println("==========================================");



    }

    static class Car {
        String model;

        public Car(String model) {
            this.model = model;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "model='" + model + '\'' +
                    '}';
        }
    }

}
