package com.pisien.edu.medium.medi12;

/**
 *  java.lang.string
 *     - Math()
 *         : Math.abs() = 절대값
 *         : Math.ceil(), Math.floor() = 무조건 올림, 내림
 *         : Math.min(), Math.max() = 최소, 최대값
 *         : random() = 랜덤
 *         : round()  = 소숫점 1자리에서 반올림
 *         : rint()   = 정수에 가까운 쪽으로 실수값 반환
 *
 * */

public class Exam02Math {

    public static void main(String[] args)  {

        //절대값
        int num1 = Math.abs(5);
        int num2 = Math.abs(-5);
        double num3 = Math.abs(7.89);
        double num4 = Math.abs(-7.89);

        System.out.println("[절대값] ===============================");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println();

        // 무조건 올림값
        double num5 = Math.ceil(5.1);
        double num6 = Math.ceil(5.9);
        double num7 = Math.ceil(-5.1);
        double num8 = Math.ceil(-5.9);
        System.out.println("[무조건 올림값] ===============================");
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);
        System.out.println("num7 = " + num7);
        System.out.println("num8 = " + num8);
        System.out.println();

        //무조건 내림
        double num9  = Math.floor(5.1);
        double num10 = Math.floor(5.9);
        double num11  = Math.floor(-5.1);
        double num12 = Math.floor(-5.9);
        System.out.println("[무조건 내림] ===============================");
        System.out.println("num9  = " + num9);
        System.out.println("num10 = " + num10);
        System.out.println("num11 = " + num11);
        System.out.println("num12 = " + num12);
        System.out.println();


        // 최소값, 최대값
        int num13 = Math.min(48, 92);
        int num14 = Math.max(48, 92);
        System.out.println("[최소값, 최대값] ===============================");
        System.out.println("Math.min(48, 92) = " + num13);
        System.out.println("Math.max(48, 92) = " + num14);
        System.out.println();

        // 랜덤 & 반올림 : 랜덤하게 2자리 정수 만들기.
        // 반올림은 소숫점 1자리에서만 반올림 됨.
        // 소숫점 3째자리에서부터 반올림을 하고자 한다면.
        // round(num16*100)/100
        double num15 = Math.random();
        Long   num16 = Math.round(num15*100);
        System.out.println("[랜덤 & 반올림] ===============================");
        System.out.println("Math.random()         = " + num15);
        System.out.println("Math.round(num15*100) = " + num16);
        System.out.println();

        // 가까운 정수의 실수값 반환.
        double num17 = Math.rint(5.5);
        double num18 = Math.rint(9.4);
        System.out.println("[가까운 정수의 실수값 반환] ===============================");
        System.out.println("Math.rint(5.5) = " + num17);
        System.out.println("Math.rint(9.4) = " + num18);
        System.out.println();

    }

}
