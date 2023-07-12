package com.pisien.edu.begin.begin01;

public class Begin01Shift {

    public static void main(String[] args) {

        int a = 100;
        int b = 5;

        System.out.println("[shift연산] ====================================");
        System.out.println("a << b = " + (a << b));
        System.out.println("a >> b = " + (a >> b));
        System.out.println();

        int score = 80;

        System.out.println("[3항 연산] ====================================");

        String result = (score>=90) ? "A" : ((score>=80) ? "B" : ((score>=70) ? "C" : ((score>=60) ? "D" : "F"))) ;

        System.out.println("your Grade for score="+ score+" is "+result);
        System.out.println();

        // 같은 리터릴은 번지를 공유하여 주소가 같다.
        String str1 = "자바";
        String str2 = "자바";
        boolean result1 = (str1==str2);
        System.out.println("result1 = " + result1);

        // new를 사용하면, 값이 같다고 해도, 새로 번지를 할당한다.
        String str3 = new String("JAVA");
        String str4 = new String("JAVA");
        boolean result2 = (str3==str4);
        System.out.println("result2 = " + result2);
    }
}
