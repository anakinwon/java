package com.pisien.edu.medium.medi08;

/**
 *   <중첩클래스 접근제어>
 *       - 정적 멤버와 인스턴스 멤버 접근제어
 *
 *   <결론>
 *       - 중첩클래스에서의 인스턴스 필드나 메소드는 언제든지 생성 가능하지만
 *       - 정적 필드나 정적 메소드는 정적클래스에서만 생성이 가능하다.
 * */
public class Exam03NestedPivatePublic {

    public static void main(String[] args) {
        A a = new A();
        System.out.println("==========================");
        A.B b = a.new B();
        System.out.println("==========================");
        a.method1();
        System.out.println("==========================");
        A.method2();
        System.out.println("==========================");
    }

    public static class A {

        class B {
            public B() {
                System.out.println("B인스턴스 멤버클래스 생성자 생성");
            }
        }

        static class C {
            public C() {
                System.out.println("C정적 멤버클래스 생성");
            }
        }

        B b = new B();
        C c = new C();

        // <인스턴스 멤버 메소드>
        //    - method1()을 사용할 때 이미 외부클래스 A의 인스턴스가 만들어진 상태
        public void method1() {
            System.out.println("method1() 내부");
            B b = new B();
            C c = new C();
        }

        // <정적 멤버 메소드>
        // B는 인스턴스 이므로 정적으로 생성 불가.
        //static B b1 = new B();
        //static A.B b2 = new B();
        // B는 정적메소드 이므로 정적으로 생성 가능.
        static C c1 = new C();

        public static void method2() {
            System.out.println("method2() 내부");
            // 인스턴스는 정적내부에서 사용불가
            //B b = new B();
            // 정적메소드는 정적내부에서 사용 가능
            C c = new C();
        }

    }
}
