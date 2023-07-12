package com.pisien.edu.medium.medi04;


/**
 *   <this()>
 *       - 생성자에서 다른 생성자 호출
 *       - this() Constructor : 생성자 호출,
 *       - 같은 클래스 내에서 다른 생성자를 호출할때 사용
 *       - 다른 생성자 호출은 생성자의 첫 문장에서 사용해야 함.
 *       - this 와는 개념이 다르다.
 *       - this : 참조변수와 같은 역할을 한다.
 *              : 인스턴스 변수와 지역변수를 구분하기 위해 사용
 *
 * */
public class Exam04ThisConstructor {

    public static void main(String[] args) {

        Exam03Constructor.Student student = new Exam03Constructor.Student(54,"Anakin Skywalker");

        System.out.println("student.나이 = " + student.getAge());
        System.out.println("student.이름 = " + student.getName());


    }
}

