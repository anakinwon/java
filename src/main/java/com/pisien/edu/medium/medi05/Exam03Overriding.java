package com.pisien.edu.medium.medi05;

/**
 *   <InheritanceShape - 상속예제>
 *       - 오버로딩 Overloading : 새로운 메소드를 만드는 것. (new 의 개념)
 *       - 오버라이딩 Overriding : 선언부가 같고 구현부만 다른 것. (modify, change 의 개념)
 *
 * */
public class Exam03Overriding {
    
    public class Car {
        public void run() {
            System.out.println("차가 달린다.");
        }        
    }

    public class SportsCar extends Car {
        
        // 오버로딩의 예
        public void run(int i) {
            System.out.println(i + "의 속도로  스포츠카가 달린다.");
        }

        @Override  // 오버라이딩의 예
        public void run() {
            System.out.println("스포츠카가 달린다.");
        }

    }
    
    public static void main(String[] args) {

        HddDisk hddDisk = new HddDisk(500, 7200);
        UsbMemory usbMemory = new UsbMemory(32,960);

        System.out.println("hddDisk.상세   = " + hddDisk.status());
        System.out.println("usbMemory.상세 = " + usbMemory.status());
        
    }


    // 조상 클래스
    public static class HddDisk extends Object {
        int capacity;
        int rpm;

        // 기본 생성자
        public HddDisk() { }
        // 매개변수가 있는 생성자
        public HddDisk(int capacity, int rpm) {
            this.capacity = capacity;
            this.rpm = rpm;
        }

        public String status() {
            String str = "용량 : " + this.capacity + "\n" +
                         "속도 : "  + this.rpm + "rpm" ;
            return str;
        }
    }

    public static class UsbMemory extends HddDisk {
        int capacity;
        int rpm;

        // 기본 생성자
        public UsbMemory() {
        }
        // 매개변수가 있는 생성자
        public UsbMemory(int capacity, int rpm) {
            this.capacity = capacity;
            this.rpm = rpm;
        }
        public UsbMemory(int capacity, int rpm, int capacity1, int rpm1) {
            this.capacity = capacity1;
            this.rpm = rpm1;
        }

        // 이 메소드는 오버 로딩이다.
        public String status(int cap, int rpm) {
            String str = "용량 : " + cap + "\n" +
                    "속도 : "  + rpm + "rpm" ;
            return str;
        }

        @Override   // 조상 클래스에 있는 status()를 오버라이드 해 온다.
        public String status() {
            String str = "용량 : " + this.capacity + "\n" +
                    "속도 : "  + this.rpm + "rpm" ;
            return str;
        }
    }

}
