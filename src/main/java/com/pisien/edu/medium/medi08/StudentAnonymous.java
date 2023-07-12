package com.pisien.edu.medium.medi08;

public class StudentAnonymous {

    // 필드의 초기값
    // 익명메소드 테스트
    Student student = new Student("아나킨") {
        public void goSchool() {
            System.out.println("\t\t" + this.name + "이 등교합니다.");
        }
        @Override
        public void wakeup() {
            System.out.println("======================================");
            System.out.println(" 필드의 초기값 형태로 만들어진 익명자손 객체 ");
            System.out.println("\t" + this.name + "학생이 기상합니다.");
            this.goSchool();
        }
    };

    // 매개변수의 로컬변수 매개값으로 생성
    public void method1() {
        // 익명메소드 테스트
        Student student1 = new Student("파드메") {
            public void goSkate() {
                System.out.println("\t\t" + this.name + "선수가 연습합니다.");
            }
            @Override
            public void wakeup() {
                System.out.println("======================================");
                System.out.println(" 필드의 초기값 형태로 만들어진 익명자손 객체 ");
                System.out.println("\t" + this.name + "선수가 기상합니다.");
                this.goSkate();
            }
        };
        student1.wakeup();
    }

    // 메소드의 매개변수 값
    public void method2(Student student) {
        student.wakeup();
    }


}
