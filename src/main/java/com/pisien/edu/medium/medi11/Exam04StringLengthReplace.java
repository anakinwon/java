package com.pisien.edu.medium.medi11;

public class Exam04StringLengthReplace {

    public static void main(String[] args) {

        /**
         *   <문자열 길이 함수>
         *       - length()
         * */
        String phoneNumber = "01012345678";
        System.out.println("문자열의 길이 = " + phoneNumber.length());

        int length = phoneNumber.length();

        if (length == 11){
            System.out.println("휴대폰 자리수가 정확합니다.");
        }
        else {
            System.out.println("휴대폰 자리수가 틀립니다.");
        }
        System.out.println();

        /**
         *   <문자열 대체 함수>
         *       - replace()
         * */
        System.out.println("===========================================");
        String oldStr = "자바는 객체지향 언어입니다.";
        String newStr = oldStr.replace("자바", "JAVA");
        System.out.println("oldStr = " + oldStr);
        System.out.println("newStr = " + newStr);
        System.out.println("oldStr.hashCode = " + oldStr.hashCode());
        System.out.println("newStr.hashCode = " + newStr.hashCode());
        System.out.println();


        /**
         *   <문자열 절삭 함수>
         *       - substring()
         * */
        String phoneNum = "01012345678";

        System.out.println("===========================================");
        // 앞에서 3자리 잘라서 버린다.
        String str1 = phoneNum.substring(3);

        // 0번부터 3번 인덱스 전까지 잘라서 취한다.
        // 마지막 인덱스는 미포함.
        String str2 = phoneNum.substring(0,3);
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("phoneNum.hashCode = " + phoneNum.hashCode());
        System.out.println("str1.hashCode     = " + str1.hashCode());
        System.out.println("str2.hashCode     = " + str2.hashCode());
        System.out.println();


        /**
         *   <문자열 대소문자 함수>
         *       - toUpperCase()
         *       - toLowerCase()
         *       - equalsIgnoreCase()
         * */
        String starWars = "I am your Father";

        // 대소문자 변환
        String upperStr = starWars.toUpperCase();
        String lowerStr = starWars.toLowerCase();

        System.out.println("===========================================");
        System.out.println("upperStr = " + upperStr);
        System.out.println("lowerStr = " + lowerStr);
        System.out.println("starWars.hashCode = " + starWars.hashCode());
        System.out.println("upperStr.hashCode = " + upperStr.hashCode());
        System.out.println("lowerStr.hashCode = " + lowerStr.hashCode());
        System.out.println();
        // 데소문자 구분하지 않고 비교하는 함수
        boolean ignoreLetter = upperStr.equalsIgnoreCase(lowerStr);
        System.out.println("upperStr == lowerStr ? " + ignoreLetter);
        System.out.println();


        /**
         *   <문자열 공백제거 함수>
         *       - trim()
         *       - 좌우 공백만 제거 가능함.
         * */
        String telNum1 = "  010  ";
        String telNum2 = "  -1234  ";
        String telNum3 = " -5678  ";

        System.out.println("===========================================");
        System.out.println("앞뒤 공백만 제거 함. = " + telNum1.trim()+telNum2.trim()+telNum3.trim());
        System.out.println();

        String telNum4 = "  0  1  0 -1 234   -56  78    ";
        System.out.println("전체 공백 제거 함. = " + telNum4.replace(" ",""));
        System.out.println();


        /**
         *   <문자열 valueOf 함수>
         *       - valueOf()
         * */
        // boolean 형태를 String 형태로 반환한다.
        String value = String.valueOf(true);
        System.out.println("===========================================");
        System.out.println("value = " + value);
        System.out.println();

    }
}
