package com.pisien.edu.medium.medi01;

import com.pisien.edu.medium.medi02.entity.SamsungPhone;

public class Exam05SamsungPhone {

    public static void main(String[] args) {

        SamsungPhone phone = new SamsungPhone();

        phone.setCompany("삼성");
        phone.setModel("갤럭시10");
        phone.setRelease(2022);
        phone.setColor("Dark Blue");

        // static 변수는 클래스명.변수명으로 직접 접근이 가능하다.
        SamsungPhone.country = "KOREA";

        System.out.println("휴대폰 스팩 = " + phone.toString());


    }

}

