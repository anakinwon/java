package com.pisien.edu.medium.medi05;

/**
 *   <InheritanceShape - 상속예제>
 *       - 오버로딩 Overloading : 새로운 메소드를 만드는 것. (new 의 개념)
 *       - 오버라이딩 Overriding : 선언부가 같고 구현부만 다른 것. (modify, change 의 개념)
 *
 * */
public class Exam04OverridingCar {
    
   

    public static void main(String[] args) {
        Car car = new Car(80);

        car.speedUp();
        car.speedDown();
        car.carStop();

        System.out.println();

        SportsCar sportsCar = new SportsCar(240);
        sportsCar.speedUp(10);   // 상속만 되고 오버라이드가 되지 않았다. 조상 클래스의 값을 호출한다.
        sportsCar.speedDown(); // 상속만 되고 오버라이드가 되지 않았다. 조상 클래스의 값을 호출한다.
        sportsCar.carStop();

    }


    // 조상 클래스
    public static class Car extends Object {
        int speed;
        
        public Car(){}
        public Car(int speed) {
            this.speed = speed;
        }

        // final은 자식 메소드에서 오버라이딩을 할 수 없다.
        // final은 항상 마지막으로 더 이상 상속해 주지 않는다.
        public final void speedUp() {
            this.speed += 10;
            System.out.println("자동차가 " + this.speed + "km/h의 속도로 달립니다.");
        }
        public void speedDown() {
            this.speed -= 10;
            System.out.println("자동차가 " + this.speed + "km/h의 속도로 달립니다.");
        }
        public void carStop() {
            this.speed = 0;
            System.out.println("자동차가 멈춥니다.");
        }
        
        
    }

    public static class SportsCar extends Car {
        int speed;

        public SportsCar(){}
        public SportsCar(int speed) {
            this.speed = speed;
        }

        // final은 자식 메소드에서 오버라이딩을 할 수 없다.
        public void speedUp(int speed) {
            this.speed += speed;
            System.out.println("스포츠카가 " + this.speed + "km/h의 속도로 달립니다.");
        }
        public void speedDown() {
            this.speed -= 10;
            System.out.println("스포츠카가 " + this.speed + "km/h의 속도로 달립니다.");
        }

        @Override
        public void carStop() {
            this.speed = 0;
            System.out.println("스포츠카가 멈춥니다.");
        }

    }




}
