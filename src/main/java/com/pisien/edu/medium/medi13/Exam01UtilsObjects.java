package com.pisien.edu.medium.medi13;

import java.util.Comparator;
import java.util.Objects;

public class Exam01UtilsObjects {

    // 문제 1. final 은 반드시 변수초기화를 해야 한다. ====================================
    private final String str = "반드시 변수초기화";

    // 문제 2
    static {
        System.out.println("스테틱이 클래스 메모리에 구현되기 때문에 제일 먼저 호출된다.");
    }
    private void printHi() {
        System.out.println("Hi, there~!");
    }

    // 문제 3: toString()
    private Integer num;
    private String name;

    // 문제 4: 아래의 생성자를 만들었을 경우
    // 기본생성자를 반드시 만들어야 상속이 가능하다.
    public Exam01UtilsObjects() {
    }

    public Exam01UtilsObjects(Integer num, String name) {
        this.num = num;
        this.name = name;
    }

    public Integer getNum() {        return num;    }
    public String getName() {        return name;    }
    public void setNum(Integer num) {        this.num = num;    }
    public void setName(String name) {        this.name = name;    }
    @Override
    public String toString() {
        return "Exam01UtilsObjects{ "  + "\n" +
               "                    num  = " + num  + "\n" +
               "                  , name = " + name + "\n" +
               "                  } ";
    }

    // 문제 5. 자동설정 : @애노테이션 (Annotation) ========================================


    public static void main(String[] args) {

        //기본생성자가 없으면 오류가 남.
        Exam01UtilsObjects foo = new Exam01UtilsObjects();
        foo.printHi();

        foo.setNum(2023);
        foo.setName("아나킨");
        // 3. toString() 활용법
        System.out.println(foo.getNum().toString());

        Student s1 = new Student(1, "anakin");
        Student s2 = new Student(1, "padme");
        Student s3 = new Student(3, "obiwan");

        // 비교자를 만든다.
        System.out.println("학번 크기 비교============================");
        int result = Objects.compare(s1, s3, new StudentNoComparator());
        if (result==1)
            System.out.println("1번 학생번호가 더 큽니다.");
        else if (result==0)
            System.out.println("1번과 2번 학생번호가 같습니다.");
        else
            System.out.println("2번 학생번호가 더 큽니다.");

        System.out.println();

        int compare = Objects.compare(s1, s3, new StudentNameComparator());
        System.out.println("이름 크기 비교============================");
        if (compare>0)
            System.out.println("1번 학생이름이 더 큽니다.");
        else if (compare==0)
            System.out.println("1번과 2번 학생이름이 같습니다.");
        else
            System.out.println("2번 학생이름이 더 큽니다.");
    }

    // 중첩클래스 생성, - 학생 클래스
    static class Student {
        int sno;
        String name;

        public Student(int sno, String name) {
            this.sno = sno;
            this.name = name;
        }
    }

    // 중첩클래스 - integer 비교하기
    static class StudentNoComparator implements Comparator<Student> {
        //기본 로직은 아래와 같으나,
//                if (o1.sno < o2.sno) {
//                    return -1;
//                } else if (o1.sno == o2.sno) {
//                    return 0;
//                } else {
//                    return 1;
//                }
        // A-B해도 비교연산 결과가 나오며, Sort 로 활용할 수 있다.
        @Override
        public int compare(Student o1, Student o2) {
            return o1.sno - o2.sno;
        }
    }

    // 중첩클래스 - name 을 가지고 String 비교하기
    static class StudentNameComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            if (o1.name.compareTo(o2.name) < 0) {
                return -1;
            } else if (o1.name.compareTo(o2.name)==0) {
                return 0;
            } else {
                return 1;
            }
        }
    }


}
