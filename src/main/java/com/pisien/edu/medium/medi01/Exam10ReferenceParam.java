package com.pisien.edu.medium.medi01;

/**
 *  <참조형 매개변수 테스트>
 *    - Call Stack(후입선출, LIFO) 예제
 *    - Call By Reference(주소 참조) : 값의 주소를 바꿈으로써, 참조된 값을 모두 읽고, 바꿀 수 있다.
 *  (출력 예)
 *  1. Class : 100
 * 		2.firstMethod In : 1000
 * 			3.secondMethod In : 10000
 * 				4.thirdMethod In : 100000
 * 				4.thirdMethod Out: 100000
 * 			3.secondMethod Out: 100000
 * 		2.firstMethod Out: 100000
 * 	1. Class : 100000
 * */
public class Exam10ReferenceParam {

    public static void main(String[] args) {
        Exam09PrimitiveParam.Class01 num = new Exam09PrimitiveParam.Class01();
        num.data = 100;
        System.out.println("\t1. Class : " + num.data);
        firstMethod(num);
        System.out.println("\t1. Class : " + num.data);
    }

    public static void firstMethod(Exam09PrimitiveParam.Class01 test) {
        test.data = 1000;
        System.out.println("\t\t2.firstMethod In : "+ test.data);
        secondMethod(test);
        System.out.println("\t\t2.firstMethod Out: "+ test.data);
    }
    public static void secondMethod(Exam09PrimitiveParam.Class01 test) {
        test.data = 10000;
        System.out.println("\t\t\t3.secondMethod In : "+ test.data);
        thirdMethod(test);
        System.out.println("\t\t\t3.secondMethod Out: "+ test.data);
    }
    public static void thirdMethod(Exam09PrimitiveParam.Class01 test) {
        test.data = 100000;
        System.out.println("\t\t\t\t4.thirdMethod In : "+ test.data);
        System.out.println("\t\t\t\t4.thirdMethod Out: "+ test.data);
    }
}

