package com.pisien.edu.medium.medi10;


import java.util.Arrays;

/**
 *   <Object>
 *       - 논리적 동등 처리 (Equals)
 *       - 주소는 달라도, 값이 같으면 참으로 반환하고 싶을때,,,
 *
 * */
public class Exam01ObjectEquals {

    public static void main(String[] args) {

        // 아래의 주소는 서로 다르다.
        // object1.equals(object2) : 비교연산으로 사용됨
        Object object1 = new Object();
        Object object2 = new Object();

        boolean result = object1.equals(object2);

        System.out.println("object1 = " + object1);
        System.out.println("object2 = " + object2);
        System.out.println("result = " + result);

        Student student1 = new Student(10,"아나킨", new int[] {90, 100});
        Student student2 = new Student(10,"아나킨", new int[] {90, 100});

        // 주소가 다르면 false 일텐데
        // Override 해서 나이와 이름이 같으면 참으로 반환하게 바꿔보자.
        System.out.println();
        System.out.print("나이와 이름이 같은 사람인가? ");
        System.out.println(student1.equals(student2));

    }

    public static class Student {
        int age;
        String name;
        int[] subject;

        public Student(int age, String name, int[] subject) {
            this.age = age;
            this.name = name;
            this.subject = subject;
        }

        // 오버라이딩해서 형변환을 거치면
        // 값이 같으면 주소가 다르더라도 참으로 반환된다.
        @Override
        public boolean equals(Object obj) {

            Student student = (Student) obj;

            // 이름과 나이가 모두 같으면 참으로 반환된다.
            boolean result = Arrays.equals(this.subject, student.subject);
            if (obj instanceof Student) {
                if ( (this.age==student.age) && (this.name.equals(student.name)) && result ) {
                    return true;
                }
            }
            return false;
        }
    }
}
