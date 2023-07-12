package com.pisien.edu.medium.medi13;

import java.util.regex.Pattern;

/**
 *   <정규표현식 & Pattern>
 *       1. 전화번호 표현
 *       2. 이메일 표현
 *       3. 비밀번호 표현
 *       4. Pattern.matches()
 *
 * */
public class Exam07RegularPattern {

    public static void main(String[] args) {

        // 전화번호 정규표현식 테스트
        String pattern = "(010|02|031)-\\d{3,4}-\\d{4}";
        String number1  = "010-2345-5678";
        String number2  = "031-345-5678";

        boolean result = Pattern.matches(pattern, number1);
        System.out.println("====================================");
        if(result) {
            System.out.println("정상적인 전화번호입니다.");
        }
        else {
            System.out.println("전화번호 오류입니다.");
        }
        System.out.println();

        boolean result2 = Pattern.matches(pattern, number2);
        System.out.println("====================================");
        if(result2) {
            System.out.println("정상적인 전화번호입니다.");
        }
        else {
            System.out.println("휴대번호나 서울,경기번호가 아니군요!");
        }
        System.out.println();


        /**  
         *   <이메일 양식검증 조건>
         *
         * */
//        String email = "\\w{3,}+@\\w+\\.\\w+(\\.\\w+)*";
        String email = "^[a-zA-Z0-9+-\\_.]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$";

        String sampleEmail1  = "7even@naver.com";
        String sampleEmail2  = "a@naver.com";
        String sampleEmail3  = "abc@naver.co.kr";
        String sampleEmail4  = "abc$naver.co.kr";
        String sampleEmail5  = "abc#naver.co.kr";
        String sampleEmail6  = "abc@naver,com";
        String sampleEmail7  = "abc@naver.com";
        String sampleEmail8  = "abc@naver.co";

        boolean eResult1 = Pattern.matches(email,sampleEmail1);
        boolean eResult2 = Pattern.matches(email,sampleEmail2);
        boolean eResult3 = Pattern.matches(email,sampleEmail3);
        boolean eResult4 = Pattern.matches(email,sampleEmail4);
        boolean eResult5 = Pattern.matches(email,sampleEmail5);
        boolean eResult6 = Pattern.matches(email,sampleEmail6);
        boolean eResult7 = Pattern.matches(email,sampleEmail7);
        boolean eResult8 = Pattern.matches(email,sampleEmail8);

        System.out.println("====================================");
        if(eResult1) System.out.println("1. 정상적인 이메일입니다");
        if(eResult2) System.out.println("2. 정상적인 이메일입니다");
        if(eResult3) System.out.println("3. 정상적인 이메일입니다");
        if(eResult4) System.out.println("4. 정상적인 이메일입니다");
        if(eResult5) System.out.println("5. 정상적인 이메일입니다");
        if(eResult6) System.out.println("6. 정상적인 이메일입니다");
        if(eResult7) System.out.println("7. 정상적인 이메일입니다");
        if(eResult8) System.out.println("8. 정상적인 이메일입니다");
        System.out.println();


        /**
         *   <비밀번호 양식검증 조건>
         *     - 조건 : 최소 8자,
         *             최소 하나의 이상의 문자 포함
         *             최소 하나의 이상의 숫자 포함
         *             최소 하나의 이상의 특수 문자 포함
         * */
        // 비밀번호 검증 ========================================================================

        String password = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@!%*#?&])[A-Za-z\\d@!%*#?&]{8,}$";

        String pass01 = "1234567890";    // 숫자만 불가
        String pass02 = "asdfghj";       // 8자 미만 불가
        String pass03 = "1234567";       // 8자 미만 불가
        String pass04 = "asdf123";       // 숫자+문자만 불가
        String pass05 = "1231231!";      // 숫자+특수문자만 불가
        String pass06 = "asdfghj!";      // 문자+특수문자만 불가,
        String pass07 = "asdfgh1@";      // 비밀번호 가능

        boolean pwResult1 = Pattern.matches(password,pass01);        // 숫자만 불가
        boolean pwResult2 = Pattern.matches(password,pass02);        // 8자 미만 불가
        boolean pwResult3 = Pattern.matches(password,pass03);        // 8자 미만 불가
        boolean pwResult4 = Pattern.matches(password,pass04);        // 숫자+문자만 불가
        boolean pwResult5 = Pattern.matches(password,pass05);        // 숫자+특수문자만 불가
        boolean pwResult6 = Pattern.matches(password,pass06);        // 문자+특수문자만 불가, 
        boolean pwResult7 = Pattern.matches(password,pass07);        // 비밀번호 가능

        System.out.println("====================================");
        if(pwResult1) System.out.println("1. 사용가능한 비밀번호입니다.");
        if(pwResult2) System.out.println("2. 사용가능한 비밀번호입니다.");
        if(pwResult3) System.out.println("3. 사용가능한 비밀번호입니다.");
        if(pwResult4) System.out.println("4. 사용가능한 비밀번호입니다.");
        if(pwResult5) System.out.println("5. 사용가능한 비밀번호입니다.");
        if(pwResult6) System.out.println("6. 사용가능한 비밀번호입니다.");
        if(pwResult7) System.out.println("7. 사용가능한 비밀번호입니다.");
        System.out.println();

    }

}
