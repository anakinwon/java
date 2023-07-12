package com.pisien.edu.medium.medi07;

public class Exam05InterfaceVehicle {

    public static void main(String[] args) {
        Driver driver = new Driver();
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        // 버스 운전하기.
        bus.setSpeed(-1);
        bus.setSpeed(90);
        bus.setSpeed(80);
        driver.drive(bus);
        driver.stop(bus);
        driver.drive(new Bus());

        System.out.println();

        // 택시 운전하기.
        taxi.setSpeed(-20);
        taxi.setSpeed(120);
        taxi.setSpeed(70);
        driver.drive(taxi);
        driver.stop(taxi);
        driver.drive(new Taxi());

        System.out.println();

        // <인터페이스의 리턴타입 테스트>
        // 매개변수타입이 전부 Vehiclable 인터페이스 타입으로 실행됨
        // 리턴 타입도 구현클래스가 와야 하며,
        // 매개변수 타입도 역시 구현클래흐가 와야 함.
        Vehiclable taxi2 = (Taxi) driver.newCarMethod(new Taxi());
        taxi2.run();
        taxi2.stop();

        System.out.println();

        Vehiclable bus2 = (Bus) driver.newCarMethod(new Bus());
        bus2.run();
        bus2.stop();

    }


    // 인터페이스 [표준 사양서] ======================================================
    public static interface Vehiclable {

        public void run();
        public void stop();
        public void setSpeed(int speed);
    }
    // 인터페이스 ==================================================================

    // [택시객체] ==================================================================
    public static class Taxi implements Vehiclable {
        private int speed;
        @Override
        public void run() {
            System.out.println("택시가 "+ this.speed + "km/h 속도로 달립니다.");
        }
        @Override
        public void stop() {
            System.out.println("택시가 멈췄습니다.");
        }
        @Override
        public void setSpeed(int speed) {
            if(speed<0) {
                System.out.println("속도가 잘못 입력되었네요! " + speed);
                return;
            }
            this.speed = speed;
        }
    }
    // [택시객체] ==================================================================


    // [버스객체] ==================================================================
    public static class Bus implements Vehiclable {
        private int speed;
        @Override
        public void run() {
            System.out.println("버스가 "+ this.speed + "km/h 속도로 달립니다.");
        }
        @Override
        public void stop() {
            System.out.println("버스가 멈췄습니다.");
        }
        @Override
        public void setSpeed(int speed) {
            if(speed<0) {
                System.out.println("속도가 잘못 입력되었네요! " + speed);
                return;
            }
            else if(speed>80) {
                System.out.println("80km/h 이하로 과속하지 마세요! 제발. " + speed);
                return;
            }
            this.speed = speed;
        }
    }
    // [버스객체] ==================================================================

    public static class Driver {

        // Taxi이거나, Bus만 운전할 수 있다.
        // 매개변수로 Vehiclable 를 사용했기 때문이다.
        public void drive(Vehiclable vehiclable) {
            vehiclable.run();
        }
        public void stop(Vehiclable vehiclable) {
            vehiclable.stop();
        }


        // 인터페이스를 반환하는 예제   ============================
        public Vehiclable newCarMethod (Vehiclable vehiclable) {
            if (vehiclable instanceof Taxi) {
                Taxi taxi = (Taxi) vehiclable;
                return taxi;
            }
            else if (vehiclable instanceof Bus) {
                Bus bus = (Bus) vehiclable;
                return bus;
            }
            else
                return  null;
        }
        // 인터페이스를 반환하는 예제   ============================

    }
}
