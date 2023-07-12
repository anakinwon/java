package com.pisien.edu.medium.medi07;

public class Exam09InterfaceFamily {

    public static void main(String[] args) {

        // 익명구현객체 (이름 없음) - IU 이벤트 처리나 스레드 객체 간편 생성
        Parent parent = new Parent() {  // 근본이 클래스이므로

            int b=  10;
            public void method1() {
                System.out.println("익명자손객체 메소드");
            }
            @Override
            public void method() {
                int a = 10;
                System.out.println("a = " + a);
                System.out.println("this.b = " + this.b);
                this.method1();
            }
        };

        parent.method();
        
    }

    public static class Parent {

        public Parent() {
            System.out.println("조상 생성자가 호출됨.");
        }

        public void method() {
            System.out.println("Parent 메소드 호출~~!");
        }
    }
}
