package com.pisien.edu.medium.medi12;

import java.util.Properties;
import java.util.Set;

/**
 *  java.lang.string
 *     - System()
 *         :
 *
 * */

public class Exam03SystemInOutGcExit {

    public static void main(String[] args)  {

        /**
         *   <System> 는
         *      - System.currentTimeMillis()  = 1/1,000     초
         *      - System.nanoTime()           = 1/1,000,000 초
         *      - System.getProperty()
         *      - LPAD, RPAD
         *      - System.exit() = 시스템 강제 종료시키기.
         *
         * */

        // 시간 체크하기
        Long sum = 0L;
        Long startTime = System.currentTimeMillis();
        Long startNanoTime = System.nanoTime();
        for(long i=0; i<10000000; i++) {
            sum += i;
        }
        Long endTime = System.currentTimeMillis();
        Long endNanoTime = System.nanoTime();

        Long durationTime = endTime - startTime;
        Long durationNanoTime = endNanoTime - startNanoTime;

        System.out.println("================================================");
        System.out.println("계산 소요시간 밀리초 = " + durationTime+"ms");
        System.out.println("계산 소요시간 나노초 = " + durationNanoTime+"ns");
        System.out.println();


        // 시스템 사양체크
        System.out.println("================================================");
        String myOs = System.getProperty("os.name");
        String myUser = System.getProperty("user.name");
        System.out.println("운영체제   = " + myOs);
        System.out.println("사용자계정 = " + myUser);
        System.out.println();

        Properties properties = System.getProperties();
        Set set = properties.keySet();
        System.out.println("===================================================================================");
        System.out.println("Key                              value");
        System.out.println("===================================================================================");
        for (Object o : set) {
            String key = (String) o;
            String value = System.getProperty(key);

            // 왼쪽 공백을 30자리에 맞춤
            String lkey = setRPad( key, 30, " " );
            System.out.println(lkey +" : "+value);
        }

        // exit(0) = 시스템 종료
        System.out.println("================================================");
        for (int i=0; i< 10; i++) {
            System.out.println("i = " + i);
        }
        System.out.println();
        for (int i=0; i< 10; i++) {
            // i 가 2가 되면, 시스템 강제 종료시키기.
            if (i==2)
                System.exit(0);
            System.out.println("i = " + i);
        }
        System.out.println();

    }

    // 왼쪽 공백을 30자리에 맞춤
    private static String setLPad( String strContext, int iLen, String strChar ) {
        String strResult = "";
        StringBuilder sbAddChar = new StringBuilder();
        for( int i = strContext.length(); i < iLen; i++ ) {  // iLen길이 만큼 strChar문자로 채운다.

            sbAddChar.append( strChar );
        }
        strResult = sbAddChar + strContext;  // LPAD이므로, 채울문자열 + 원래문자열로 Concate한다.
        return strResult;
    }

    // 오른쪽 공백을 30자리에 맞춤
    private static String setRPad( String strContext, int iLen, String strChar ) {
        String strResult = "";
        StringBuilder sbAddChar = new StringBuilder();
        for( int i = strContext.length(); i < iLen; i++ ) {  // iLen길이 만큼 strChar문자로 채운다.
            sbAddChar.append( strChar );
        }
        strResult = strContext + sbAddChar;  // RPAD이므로, 채울문자열 + 원래문자열로 Concate한다.
        return strResult;
    }

}
