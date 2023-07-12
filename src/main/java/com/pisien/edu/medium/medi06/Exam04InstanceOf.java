package com.pisien.edu.medium.medi06;

/**
 *  instanceof 연산자를 통해서
 *  형변환이 가능한지 여부를 확인할 수 있다.
 *
 * */

public class Exam04InstanceOf {

    public static void main(String[] args) {

        Exam03PolymorphismCar.SportsCar sportsCar = new Exam03PolymorphismCar.SportsCar();
        Exam03PolymorphismCar.PoliceCar policeCar = new Exam03PolymorphismCar.PoliceCar();

        if (sportsCar instanceof Exam03PolymorphismCar.SportsCar) {
            System.out.println("SportsCar 로 타입 변환이 가능하다.");
        }
        if (sportsCar instanceof Exam03PolymorphismCar.Car) {
            System.out.println("Car 로 타입 변환이 가능하다.");
        }
        if (sportsCar instanceof Object) {
            System.out.println("Object 로 타입 변환이 가능하다.");
        }

        //if (sportsCar instanceof policeCar) {
        //    System.out.println("policeCar 로 타입 변환이 불가하다.");
        //}

    }

}
