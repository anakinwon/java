package com.pisien.edu.medium.medi07;

public class Exam06InterfaceInterClass {

    public static void main(String[] args) {
        Aclass aclass = new Aclass();
//        InterClass interClass = new InterClass();
        aclass.method(new Bclass());
    }

    public static interface InterClass {
        public void methodB();
    }

    public static class Aclass {
        // Bclass가 없으면 컴파일에러가 난다.
    //    public void method(Bclass bclass) {
    //        System.out.println("A 클래스 호출됨.");
    //        bclass.method();
    //    }

        public void method(InterClass interClass) {
            interClass.methodB();
        }
    }

    public static class Bclass implements InterClass {
        // Bclass가 없으면 컴파일에러가 난다.
    //    public void method() {
    //        System.out.println("B 클래스 호출됨");
    //    }
        @Override
        public void methodB() {
            System.out.println("B 클래스 호출됨");
        }
    }
}
