package com.pisien.edu.medium.medi08;

/**
 *   <중첩클래스 interface>
 *       - 중첩 인터페이스
 *
 * */
public class Exam06NestedAnonymous {

    public static void main(String[] args) {

        StudentAnonymous anonymous = new StudentAnonymous();
        anonymous.student.wakeup();

        StudentAnonymous anonymous2 = new StudentAnonymous();
        anonymous.method1();

        // 매개변수의 매개값으로 익명자손객체를 직접 생성해서 넘기는 형태
        anonymous.method2(new Student("손흥민"){
            public void training() {
                System.out.println("\t\t" + this.name + "선수가 A매치 경기를 합니다.");
            }

            @Override
            public void wakeup() {
                System.out.println("======================================");
                System.out.println(" 매개변수의 초기값 형태로 만들어진 익명자손 객체 ");
                System.out.println("\t" + this.name + "선수가 연습경기를 합니다.");
                this.training();
            }
        });

    }


}
