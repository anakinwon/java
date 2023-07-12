package com.pisien.edu.medium.medi04;


/**
 *   <변수의 초기화>
 *       - boolean   = false
 *       - char      = '|u0000'
 *       - byte      = 0
 *       - short     = 0
 *       - int       = 0
 *       - Long      = 0L
 *       - float     = 0.0f
 *       - double    = 0.0
 *       - String    = null
 *       - 참조형 변수 = null
 *
 *    <초기화블록> - initialization Block
 *       - 인스턴스 초기화 블럭 : {}         -> 매번 실행된다. 생성자보다 먼저 호출된다.
 *          class A {
 *          }
 *       - 쿨래스 초기화 블록   : static {}  -> 단 한번만 실행된다.
 *          static class B {
 *          }
 *
 *
 *    <초기화 순서>
 *       1. 클래스변수 초기화 순서
 *          - 기본값 -> 명시적 초기화 -> 클래스 초기화 블럭
 *
 *       2. 인스턴스변수 초기화 순서
 *          - 기본값 -> 명시적 초기화 -> 인스턴스 초기화 블럭 -> 생성자
 *
 *  */
public class Exam05InitialVariable {

    // 변수의 초기화
    boolean  varBoolean = false;
    char     varChar    = '\u0000';
    byte     varByte    = 0;
    short    varShort   = 0;
    int      varInt     = 0;
    Long     varLong    = 0L;
    float    varFloat   = 0.0f;
    double   varDouble  = 0.0;
    String   varString  = null;


    public static void main(String[] args) {

        Exam03Constructor.Student student = new Exam03Constructor.Student(54,"Anakin Skywalker");

        System.out.println("student.나이 = " + student.getAge());
        System.out.println("student.이름 = " + student.getName());

        // 초기화 블록은 생성자보다 먼저 호출된다.
        // 초기화 블록으로 인해서, i가 자동 증가됨을 확인 할 수 있다.
        // 단, 정적 static 블록 (j)은 단 한번만 호출된다.
        Exam03Constructor.Student student1 = new Exam03Constructor.Student();
        System.out.println("student1   = " + student1.i + ", j = "+ student1.j );
        Exam03Constructor.Student student2 = new Exam03Constructor.Student();
        System.out.println("student2   = " + student2.i + ", j = "+ student2.j );
        Exam03Constructor.Student student3 = new Exam03Constructor.Student();
        System.out.println("student3   = " + student3.i + ", j = "+ student3.j );

        System.out.println();

        /**
         * 초기화 순서 테스트
         * */
        InitTest initTest = new InitTest();
    }

    static class InitTest {
        /**
         * 초기화 순서 테스트
         *    - 정적 초기화 블럭  ->  인스턴스 초기화 블럭  -> 생성자 테스트
         * */
        // 1. 인스턴스 초기화 블럭
        {
            System.out.println("1. 인스턴스 초기화 블럭");
        }

        // 2. 정적 초기화 블럭
        static {
            System.out.println("2. 정적 초기화 블럭");
        }

        // 3. 생성자 테스트
        public InitTest() {
            System.out.println("3. 생성자 테스트");
        }


    }
}

