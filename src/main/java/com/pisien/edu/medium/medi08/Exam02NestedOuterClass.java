package com.pisien.edu.medium.medi08;
/**
 *   <중첩클래스>
 *       - 정적 멤버와 인스턴스 멤버 사용.
 *
 * */
public class Exam02NestedOuterClass {

    public static void main(String[] args) {
        A a = new A();
        System.out.println("==================================");
        System.out.println("==================================");
        A.B b = a.new B();
        b.method1();
        System.out.println("==================================");
        System.out.println("==================================");

        // 정적 메소드 직접 호출
        A.C.method2();
        A.C c = new A.C();
        System.out.println(c.a);
        c.method1();
        System.out.println("==================================");
        System.out.println("==================================");

        // A클래스내의 메소드 직접 호출 가능
        a.localMethod();
        System.out.println("==================================");
        System.out.println("==================================");


    }


    public static class A {

        // 접근 가능
        B b    = new B();
        B b2 = new B();
        C c    = new C();
        C c1 = new C();
        // 접근 불가
        //D d = new D();

        public A() {
            System.out.println("외부클래스 A의 생성자 호출됨");
            System.out.println("===============================================");
            B b = new B();
            System.out.println(b.a);
            b.method1();
            System.out.println("===============================================");
            C c = new C();
            System.out.println(c.a);
            c.method1();   // 인스턴트 메소드 호출
            C.method2();   // 정적 메소드 호출
            System.out.println("===============================================");

            // 접근 불가
            //D d = new D();
            // 메소드로 직접 접근하기
            this.localMethod();
            System.out.println("===============================================");

        }

        class B {
            int a = 20;
            public B() {
                System.out.println("중첩클래스 B의 생성자 호출됨");
            }
            public void method1() {
                System.out.println("B클래스의 멤버메소드 호출됨");
            }

            // 정적 메소드 생성 불가
            //public static void method2() {
            //    System.out.println("B클래스의 멤버메소드 호출됨");
            //}

        }

        // 정적
        static class C {
            int a = 10;
            static int c = 30;

            public C() {
                System.out.println("정적멤버클래스 C의 생성자 호츨됨");
            }

            // 인스턴스 메소드 생성
            public void method1() {
                System.out.println("B클래스의 멤버메소드1 호출됨");
            }
            // 정적 메소드 생성
            public static void method2() {
                System.out.println("B클래스의 정적메소드2 호출됨");
            }
        }

        // 로컬클래스 생성
        public void localMethod() {
            // 로컬클래스 내에는 절대로 static 생성을 할 수 없다.
            class D {
                int a= 40;
                public D() {
                    System.out.println("로컬클래스 D의 생성자 호출");
                }
                public void localMethod () {
                    System.out.println(this.a);  //this는 "class D"
                    System.out.println("로컬클래스 D의 로컬메소드는 로컬에서만 사용가능하다.");
                }
            }
            // 로컬클래스는 내부에서만 생성 및 사용 가능하다.
            D d = new D();
            System.out.println(d.a);
            d.localMethod();

        }



    }
}
