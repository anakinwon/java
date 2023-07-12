package com.pisien.edu.medium.medi07;

public class Exam08InterfaceAnonymous {

    public static void main(String[] args) {

        // 익명구현객체 (이름 없음) - IU 이벤트 처리나 스레드 객체 간편 생성
        Soundable soundable = new Soundable() {  // 타입 (근본)이 인터페이스

            // 내부적으로 클래스니까 멤버들을 선언할수 있다.
            // 하지만, 외부에서 접근 블가 (근본이 뭔가?)
            int a = 10;
            public void method() {
                System.out.println("익명구현객체 메소드");
            }

            @Override
            public void sound() {
                String str = "냄비";
                System.out.println("냄비 익명구현객체 = " + str);
                System.out.println(str + "에 물을 담습니다." );
                System.out.println(str + "에 숟가락을 탕탕합니다." );
                this.method();
                System.out.println(this.a);
            }
        };
        soundable.sound();

        System.out.println();

        // 익명구현객체 (이름 없음) - IU 이벤트 처리나 스레드 객체 간편 생성
        Soundable soundable2 = new Soundable() {  // 타입 (근본)이 인터페이스

            // 내부적으로 클래스니까 멤버들을 선언할수 있다.
            // 하지만, 외부에서 접근 블가 (근본이 뭔가?)
            int a = 20;
            public void method() {
                System.out.println("익명구현객체 메소드");
            }

            @Override
            public void sound() {
                String str = "밥그릇";
                System.out.println("밥그릇 익명구현객체 = " + str);
                System.out.println(str + "에 물을 담습니다." );
                System.out.println(str + "에 숟가락을 탕탕합니다." );
                this.method();
                System.out.println(this.a);
            }
        };
        soundable2.sound();
        
        
    }

    public static interface Soundable {

        public void sound();

    }
}
