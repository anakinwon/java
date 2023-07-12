package com.pisien.edu.medium.medi12;

/**
 *  java.lang.string
 *     - StringBuffer
 *     - StringBuilder
 *         : sf.append()
 *         : sf.insert()
 *         : sf.delete()
 *         : sf.reverse()
 *         : sf.setCharAt()
 *
 * */

public class Exam01StringBufferBuilder {

    public static void main(String[] args)  {

        /**
         *   <StringBuffer 와 StringBuilder> 는
         *      - String + 연산 시, 새로운 주소를 계속 생성하므로,
         *      - StringBuilder, StringBuffer 클래스는
         *      - 버퍼(임시저장메모리)를 이용하기 때문에
         *      - 메모리 낭비의 문제점을 해결하기 위해서 나온 기술
         *
         *      - 새로운 인스턴스가 생성되는 것이 아니라,
         *      - 하나의 인스턴스를 가지고 문자열을 조작할 수 있다.
         *
         *      - 편집을 해도, HashCode가 계속 같다.
         *      - 메모리를 하나만 쓰기 때문에, 성능에 아주 유리하다.
         *
         * */
        StringBuilder stringBuilder = new StringBuilder("JAVA");             // toString()이 오버라이드 된다.
        System.out.println("1. 저장번지 확인 = " + stringBuilder.hashCode());
        System.out.println("2. 저장내용 확인 = " + stringBuilder);

        // append()
        stringBuilder.append(" Program");                                    // 문자열을 합친다.
        System.out.println("\t2. append 번지 확인 = " + stringBuilder.hashCode());
        System.out.println("\t2. append 내용 확인 = " + stringBuilder);

        // insert()
        stringBuilder.insert(1, "나");                              // 1번째 인덱스에 값은 넣는다.
        System.out.println("\t\t3. insert 번지 확인 = " + stringBuilder.hashCode());
        System.out.println("\t\t3. insert 내용 확인 = " + stringBuilder);

        // setCharAt()
        stringBuilder.setCharAt(0, 'G');                              // 1번째 인덱스에 값은 넣는다.
        System.out.println("\t\t3. setCharAt 번지 확인 = " + stringBuilder.hashCode());
        System.out.println("\t\t3. setCharAt 내용 확인 = " + stringBuilder);

        // delete()
        stringBuilder.delete(1,2);                                            // 1번째 인덱스에 값은 넣는다.
        System.out.println("\t\t\t4. delete 번지 확인 = " + stringBuilder.hashCode());
        System.out.println("\t\t\t4. delete 내용 확인 = " + stringBuilder);

        // reverse()
        stringBuilder.reverse();                              // 1번째 인덱스에 값은 넣는다.
        System.out.println("\t\t\t\t5. reverse 번지 확인 = " + stringBuilder.hashCode());
        System.out.println("\t\t\t\t5. reverse 내용 확인 = " + stringBuilder);

        // length()
        int length = stringBuilder.length();// 1번째 인덱스에 값은 넣는다.
        System.out.println("\t\t\t\t6. length 길이 확인 = " + length);

    }

}
