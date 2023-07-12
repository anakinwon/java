package com.pisien.edu.medium.medi08;


/**
 *   <중첩클래스>
 *       -
 *
 * */
public class Exam01NestedClass {

    // 인스턴스 멤버 클래스
    class A {
        int iv = 100;
        // static이 아니면 사용 불가
        // static int cv = 200;
        public A() {
            System.out.println("A 생성자 호출");
        }
        public void method1() {
            System.out.println("A클래스의 method1 호출");
        }
        // 정적 메소드 생성 불가.
        //public static void method2() {
        //    System.out.println("A클래스의 method2 호출");
        //}
    }

    // 정적 멤버 클래스
    static class B {
        int iv = 100;
        // static 사용 가능
        static int cv = 200;
        public B ()                  {
            System.out.println("A 생성자 호출");
        }
        public void method1()        {
            System.out.println("A클래스의 method1 호출");
        }
        // 정적 메소드 생성 가능.
        public static void method2() {
            System.out.println("A클래스의 method2 호출");
        }
    }

    // 메소드 내 로컬 클래스 선언  (메소드 내에서 임시 사용)
    public void method1() {
        class C {
            int iv = 10;
            // 정적 멤버변수 사용 불가
            //static int cv = 20;
            public C() {
                System.out.println("로컬 클래스C 호출됨");
            }
            public void localDMethod() {
                System.out.println("C로컬클래스 내 메소드 호출");
            }
        }
        C c = new C();
        System.out.println(c.iv);
        c.localDMethod();
    }

    public void method2() {
        class D {
            int iv = 10;
            // 정적 멤버변수 사용 불가
            //static int cv = 20;
            public D() {
                System.out.println("로컬 클래스D 호출됨");
            }
            public void localDMethod() {
                System.out.println("D로컬클래스 내 메소드 호출");
            }
        }
        D d = new D();
        System.out.println(d.iv);
        d.localDMethod();

        class E {
            int iv = 10;
            // 정적 멤버변수 사용 불가
            //static int cv = 20;
            public E() {
                System.out.println("로컬 클래스E 호출됨");
            }
            public void localEMethod() {
                System.out.println("E로컬클래스 내 메소드 호출");
            }
        }
        // 로컬클래스는 해당 메소드 내에서만 사용이 가능하다.
        E e = new E();
        System.out.println(e.iv);
        e.localEMethod();
    }


    public static void main(String[] args) {
        // 외부 클래스 인스턴스 먼저 생성
        Exam01NestedClass ne = new Exam01NestedClass();

        // 인스턴스 멤버 클래스는 외부클래스의 인스턴스가 반드시 있어야 생성가능하다.
        // 내부 클래스 인스턴스 나중 생성
        Exam01NestedClass.A a = ne.new A();

        System.out.println(a.iv);
        a.method1();

        System.out.println("==============================================");

        // 외부 클래스 정적 멤버 사용 (new 생성 없이 직접 호출 가능)
        System.out.println(Exam01NestedClass.B.cv);
        Exam01NestedClass.B.method2();

        System.out.println("==============================================");
        // 정적 멤버 내의 인스턴스를 생성해서 사용하고 싶을 때
        Exam01NestedClass.B b = new B();
        System.out.println(b.iv);
        b.method1();

        System.out.println("==============================================");
        ne.method1();
        System.out.println("==============================================");
        ne.method2();

        // 멤버클래스와 로컬클래스를 구분짓는 기준은???
        // 로컬클래스에는 1,2,3 등의 순번이 붙는다.
    }


}
