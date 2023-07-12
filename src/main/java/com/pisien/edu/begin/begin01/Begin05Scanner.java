package com.pisien.edu.begin.begin01;

import java.util.Scanner;

public class Begin05Scanner {

    public static void main(String[] args) {
        //Ctrl + Shift + O 자동임포트
        //Scanner클래스는 입력을 받기 위한 클래스이고, 입력스트림
        //자원(Resource)은 사용하고 나서 반드시 닫아줘야 된다.
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 한자리를 입력 : ");
        int num = sc.nextInt();
        System.out.println("사용자로부터 입력받은 숫자 : " + num);

        System.out.print("실수 한자리를 입력 : ");
        double dnum = sc.nextDouble();
        System.out.println("사용자로부터 입력받은 숫자 : " + dnum);

        System.out.print("문자열을 입력 : ");
        //next()는 공백을 기준으로 해서 문자를 입력--단어를 입력
        //String str = sc.next();
        //nextLine()는 엔터키를 입력할때까지 문자열를 입력--문장을 입력
        String str1 = sc.nextLine();
        System.out.println("사용자로부터 입력받은 문자열 : " + str1);

        int result = 100;
        String str2 = sc.nextLine();
        //Integer.parseInt()역할 문자열로 입력받은 숫자들을 문자열이 아니라
        //숫자로 바꿔주는 역할을 하는 메서드
        int temp = Integer.parseInt(str2);
        int total = result + temp;
        System.out.println("연산결과 : " + total);
        sc.close();
    }

}


