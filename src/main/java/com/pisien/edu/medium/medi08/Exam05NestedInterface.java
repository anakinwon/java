package com.pisien.edu.medium.medi08;

/**
 *   <중첩클래스 interface>
 *       - 중첩 인터페이스
 *
 * */
public class Exam05NestedInterface {

    public static void main(String[] args) {

        // 기계식 온도계 사용하기
        System.out.println("===============================");
        Thermometer thermometer = new Thermometer();
        thermometer.setChangeable(new AnalogThermometer());
        thermometer.viewTemperature();

        // 디지털 온도계 사용하기.
        System.out.println("===============================");
        thermometer = new Thermometer();
        thermometer.setChangeable(new DigitalThermometer());
        thermometer.viewTemperature();
        System.out.println("===============================");

        // 중첩 인터페이스이므로 익명구현 객체를 얻는 것은 불가함.
        // cannot be cast to class
//        Thermometer.ThermometerChangeable thermometer2 = new Thermometer.ThermometerChangeable() {
//            @Override
//            public void OnChange() {
//                System.out.println("중첩일 경우 익명구현객체로 만들 수 없다.");
//            }
//        };
//        Thermometer t = (Thermometer)thermometer2;
//        t.viewTemperature();
//
//        System.out.println("===============================");

    }

    public static class Thermometer {

        // 내부 인터페이스 생성
        interface ThermometerChangeable {
            // 추상메소드
            public void OnChange();
        }
        // 중첩인터페이스의 멤버선언
        ThermometerChangeable changeable;

        // 생성자 구현
        // 매개변수 타입이 인터페이스 타입에 들어왔다. 이것이 의미하는가?
        // ThermometerChangeable 인터페이스를 구현한 클래스만 들어올 수 있다.
        // 인터페이스 매개변수의 다형성이다.
        public void setChangeable(ThermometerChangeable changeable) {
            this.changeable = changeable;
        }

        public void viewTemperature() {

            this.changeable.OnChange();
        }

    }

    public static class DigitalThermometer  implements Thermometer.ThermometerChangeable {

        double temperature = 28.3;

        @Override
        public void OnChange() {
            System.out.println("전자 온도계입니다.");
            System.out.println(this.temperature + "도 입니다.");
        }
    }

    public static class AnalogThermometer implements Thermometer.ThermometerChangeable {

        double temperature = 28.0;

        @Override
        public void OnChange() {
            System.out.println("기계식 온도계입니다.");
            System.out.println(this.temperature + "도 입니다.");
        }
    }
}
