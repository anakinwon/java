package com.pisien.edu.medium.medi04;


/**
 *   <final vs static final>
 *       - 상수 개념
 *       - 처음 한 번 정의 되면, 변경 할 수 없다.
 *       - 상수 명명은 대문자로 작성한다.
 *       - final은 Heap 메모리 영역에 생성됨
 *       - static final은 class 메모리 영역에 생성됨
 *
 * */
public class Exam03Constructor {

    public static void main(String[] args) {
        Student student = new Student(23, "anakin");

        student.setAge(10);
        student.setName("파드메");

        System.out.println("학생나이 = " + student.getAge());
        System.out.println("학생이름 = " + student.getName());

        //====================================================

        // A 클래스는 생성자가 없으므로
        // 컴파일러가 내부적으로 기본생성자를 생성해 준다.
        AClass aclass  = new AClass();
        aclass.value = 10;

        // B 클래스는 기본생성자가 없으므로
        // 기본생성자로 호출할 수 없다.
        //BClass bClass = new BClass();
        BClass bClass = new BClass(20);
    }

    /**
     * 하나의 파일에 클래스를 여러 개 만들 수 있지만,
     * public 은 단 1개만 만들 수 있다.
     */
    static class AClass {
        int value;
    }

    static class BClass {
        int value;

        public BClass(int value) {
            this.value = value;
        }
    }

    /**
     *   <생성자>
     *       - 생성자 명은 class 명과 똑같이 만든다.
     *       - 생성자를 하나도 만들지 않으면 컴파일러가 기본 생성자가 자동으로 만들어 준다.
     *       - 생성자는 return type 을 쓰지 않는다.
     *
     * */
    public static class Student {

        /**
         *  <인스턴스 멤버 변수>
         *     - private 으로 선언하면 멤버변수를 직접 접근할 수 없게 선언된다.
         * */
        private int age;
        private String name;
        static int i = 0;
        static int j = 0;

        static {
            j += ++i;
            System.out.println("정적 초기화는 단 한번만 호출된다. j = "+ j);
        }

        // 인스턴스 초기화 블럭
        // 생성자가 호출되기 전에 먼저 호출된다.
        {
            i++;
            this.age = i;
        }

        /**
         *  <기본생성자>
         *     - 생성자를 하나도 만들지 않으면 컴파일러가 기본 생성자가 자동으로 만들어 준다.
         * */
        //public Student() {
        //}

        // this() 생성자에서 다른 생성자 호출
        public Student() {
            this(235, "Yoda");
        }

        // 생성자를 이용한 인스턴스 복제
        public Student(Student student) {
            this(184, "Obiwan");
        }

        /**
         *  <매개변수가 있는 생성자>
         *     - 값을 전달해서 초기화 하면서 생성자를 만들어 준다.
         *     - 생성자는 많으면 많을수록 좋다.
         * */
        public Student(int age) {
            this.age = age;
        }
        public Student(String name) {
            this.name = name;
        }

        public Student(int age, String name) {
            this.age = age;
            this.name = name;
        }
        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // 매개변수 접근자
        public int getAge() {
            return age;
        }
        public String getName() {
            return name;
        }

        // 매개변수 수정자
        public void setAge(int age) {
            this.age = age;
        }
        public void setName(String name) {
            this.name = name;
        }

    }
}

