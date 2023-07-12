package com.pisien.edu.medium.medi07;

/**
 *  <인터페이스 - Interface>
 *      - ** 객체 사용 설명서
 *      - ** 추상 메소드가 인터페이스의 본질이다.
 *          : 정적 메소드
 *          : 디폴트 메소드
 *      - ** 생성자가 없다.
 *      - ** 인스턴스를 만들 수 없다.
 *      - ** 표준을 제시하여 규칙에 맞게 구현하도록 한다.
 *      - 일종의 추상클래스
 *      - 구현된건 아무것도 없다
 *      - 클래스가 아니다.
 *      - 클래스 작성에 도움을 준다.
 *      - ~able(~할 수 있는) 으로 해석된다.
 *
 *      public insterface aInterface() {
 *          // int a = 10;     // 아래와 같은 의미지만 "static final" 생략 가능
 *          static final int a = 0;
 *
 *          // void method();  // 아래와 같은 의미지만 "abstract" 생략 가능
 *          abstract void method();
 *      }
 *
 * */
public class Exam03Interface {

    public static void main(String[] args) {

        Member member = new Member();
        member.method();   // 인터페이스 A를 구현한 Member 의 method() 호출됨.
        member.method1();  // 클래스에 있는 메소드 method1() 호출됨.
        System.out.println();

        // 상수 접근시 "클래스명(인터페이스명).상수" 로 접근해야 한다.
        System.out.println("클래스명(인터페이스명).상수 = " + A.MAX);

        System.out.println();
        // 인터페이스도 일종의 조상이다. 따라서 다형성 개념이 적용된다.
        A a = new Member();
        a.method();
        // A 인터페이스에 없는. 근본을 벗어나지 못하기 때문에, method1() 호출 불가.
        //a.method1();

        //=================================================================
        Person person = new Person();
        person.method();   // 인터페이스 A를 구현한 Person 의 method() 호출됨.
        person.method1();  // 클래스에 있는 메소드 method1() 호출됨.

        // 인터페이스도 일종의 조상이다. 따라서 다형성 개념이 적용된다.
        a = new Person();
        a.method();
        // A 인터페이스에 없는. 근본을 벗어나지 못하기 때문에, method1() 호출 불가.
        //a.method1();


    }

    /**     - ** 추상 메소드가 인터페이스의 본질이다.
     *      - ** 객체 사용 설명서
     *          : 정적 메소드
     *          : 디폴트 메소드
     *      - ** 생성자가 없다.
     *  */
    public static interface A {

        // static final 이 누락되어 있는 형태.
        // 인터페이스에서는 맴버변수가 내부적으로 상수(static final)로 인식함.
        int MAX = 100;

        // abstract 가 누락되어 있는 형태
        void method();

    }

    public static class Member implements A {

        // 인터페이스의 추상메소드를 가져다가 재정의해서 사용한다.
        @Override
        public void method() {
            System.out.println("인터페이스 A를 구현한 Member 의 method() 호출됨.");
        }

        public void method1() {
            System.out.println("Member 에 있는 맴버메소드 method1() 호출됨.");
        }

    }

    public static class Person implements A {

        // 인터페이스의 추상메소드를 가져다가 재정의해서 사용한다.
        @Override
        public void method() {
            System.out.println("인터페이스 A를 구현한 Person 의 method() 호출됨.");
        }

        public void method1() {
            System.out.println("Person 에 있는 맴버메소드 method1() 호출됨.");
        }
    }
}

