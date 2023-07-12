package com.pisien.edu.medium.medi06;

public class Exam03PolymorphismCar {

    public static void main(String[] args) {

        Car car = null;
        SportsCar sportsCar = new SportsCar();
        SportsCar sportsCar2 = null;
        PoliceCar policeCar = new PoliceCar();
        PoliceCar policeCar2 = null;

        sportsCar.speedUp();

        /**
         *   <업캐스팅>
         *       - 자손이 부모에게 형변환
         *       - 명시적, 묵시적 형변환 모두 가능
         * */
        car = sportsCar;
        car = (SportsCar)sportsCar;
        car = policeCar;
        car = (PoliceCar)policeCar;
        // car는 speedUp() 메소드가 없으므로 사용 불가.
        //car.speedUp();

        /**
         *  <다운캐스팅>
         *      - 부모가 자손에게 형변환
         *      - 반드시 명시적 형변환 필요
         *      - 명시적 형변환 시 데이터 손실이 있을 수 있음.
         * */
        //sportsCar = car;
        sportsCar = (SportsCar) car;
        policeCar = (PoliceCar) car;

        // 상속관계가 없는 경우 형변환 불가 (형제지간)
        //sportsCar2 = (SportsCar)policeCar2;
        //policeCar2 = (PoliceCar) sportsCar2

    }

    // 부모 클래스  ================================
    public static class Car {

        String color;
        int door;

        public void drive() {
            System.out.println("차가 달립니다.");
        }
        public void stop() {
            System.out.println("차가 멈춥니다.");
        }
    }
    // 부모 클래스  ================================


    // 자식 클래스  ================================
    public static class SportsCar extends Car {

        public void speedUp() {
            System.out.println("속도를 올립니다.");
        }
    }

    // 자식 클래스
    public static class PoliceCar extends Car {

        public void siren() {
            System.out.println("사이렌을 울립니다.");
        }
    }
    // 자식 클래스  ================================

}
