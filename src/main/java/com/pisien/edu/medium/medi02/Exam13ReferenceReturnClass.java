package com.pisien.edu.medium.medi02;

public class Exam13ReferenceReturnClass {

    public static void main(String[] args) {
        Data origin = new Data();
        origin.num = 100;

        System.out.println("Copy 메소드 호출 전 origin 값   = " + origin.num);
        Data cloned = new Data();
        cloned = copy(origin);
        System.out.println("Copy 메소드 호출 후 cloned 값   = " + cloned.num);
    }

    public static Data copy(Data data) {
        Data cloned = new Data();
        cloned.num = data.num;

        return cloned;
    }

    /**
     * <참조변수 반환 테스트>
     * - 참조변수 반환 테스트.
     */


    static class Data {
        int num;
    }
}

