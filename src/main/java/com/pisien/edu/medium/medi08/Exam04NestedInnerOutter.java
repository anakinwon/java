package com.pisien.edu.medium.medi08;

/**
 *   <중첩클래스 접근제어>
 *       - 정적 멤버와 인스턴스 멤버 접근제어
 *
 *   <결론>
 *       - 중첩클래스에서의 인스턴스 필드나 메소드는 언제든지 생성 가능하지만
 *       - 정적 필드나 정적 메소드는 정적클래스에서만 생성이 가능하다.
 * */
public class Exam04NestedInnerOutter {

    public static void main(String[] args) {
        Outside outside = new Outside();
        System.out.println("=================================");

        Outside.Inner inner = outside.new Inner();
        // inner.method();
        inner.showInfo();
        System.out.println("=================================");

        // 내부에서 외부를 접근하고자 할 때
        outside.show();
        System.out.println("=================================");

        // 외부에서 내부를 접근하려고 할 때
        outside.showInner();
        System.out.println("=================================");

    }

    public static class Outside {

        String str = "Outside-field";

        // 멤버메소드
        public void method() {
            System.out.println("Outside-method()호출");
        }

        class Inner {
            // 필드 선언
            String str = "Inside-field";

            // 멤버 메소드
            public void method() {
                System.out.println("Inner-method() 호출됨");
            }

            // 멤버 메소드
            public void showInfo() {
                // 여기서의 this 는 Inner 클래스이다.
                System.out.println(this.str);
                this.method();

                // 외부클래스의 접근하는 방법
                // Outside.this 는 Outside 클래스이다.
                // 외부클래스명.this.외부클래스멤버이름
                System.out.println(Outside.this.str);
                Outside.this.method();
            }
        }

        public void show() {
            System.out.println(this.str);
            this.method();
        }

        // 외부에서 내부를 접근하고 싶을때???
        // 내부객체를 인스턴스로 만들면 접근할 수 있다.
        public void showInner() {

            Inner inner = new Inner();

            System.out.println(inner.str);
            inner.method();
        }

    }
}
