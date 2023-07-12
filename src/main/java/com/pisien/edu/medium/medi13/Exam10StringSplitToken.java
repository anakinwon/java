package com.pisien.edu.medium.medi13;

import java.util.StringTokenizer;

/**
 *   <Format 클래스>
 *      1. Decimal - 숫자 포멧
 *      2. Date 포멧
 *      3.
 * */
public class Exam10StringSplitToken {

    public static void main(String[] args) {
        /**
         *  <문자자르기>
         *   - split
         *   - tokenizer
         *
         * */

        String fullData = " Disable automatic box update checking. If you disable this, then Disable automatic box update checking. If you disable this, then Disable automatic box update checking. If you disable this, then Disable automatic box update checking. If you disable this, then Disable automatic box update checking. If you disable this, then Disable automatic box update checking. If you disable this, then Disable automatic box update checking. If you disable this, then Disable automatic box update checking. If you disable this, then Disable automatic box update checking. If you disable this, then Disable automatic box update checking. If you disable this, then Disable automatic box update checking. If you disable this, then Disable automatic box update checking. If you disable this, then Disable automatic box update checking. If you disable this, then Disable automatic box update checking. If you disable this, then Disable automatic box update checking. If you disable this, then Disable automatic box update checking. If you disable this, then Disable automatic box update checking. If you disable this, then Disable automatic box update checking. If you disable this, then Disable automatic box update checking. If you disable this, then Disable automatic box update checking. If you disable this, then Disable automatic box update checking. If you disable this, then Disable automatic box update checking. If you disable this, then Disable automatic box update checking. If you disable this, then Disable automatic box update checking. If you disable this, then Disable automatic box update checking. If you disable this, then Disable automatic box update checking. If you disable this, then Disable automatic box update checking. If you disable this, then Disable automatic box update checking. If you disable this, then Disable automatic box update checking. If you disable this, then Disable automatic box update checking. If you disable this, then Disable automatic box update checking. If you disable this, then Disable automatic box update checking. If you disable this, then";

        // split 은 공백 하나 하나 잘라낸다.
        String[] result = fullData.split(" ");
        Long startTm = System.nanoTime();
        for (String s : result) {
            System.out.println("s = " + s);
        }
        Long endTm = System.nanoTime();
        Long durationTime = endTm - startTm;
        System.out.println("split durationTime = " + durationTime);

        // 의미없는 공백은 문자로 취급하지 않는다.
        StringTokenizer stringTokenizer = new StringTokenizer(fullData, " ");
        startTm = System.nanoTime();
        while(stringTokenizer.hasMoreTokens()) {
            System.out.println("남은 토큰 수 = " + stringTokenizer.countTokens());
            String str = stringTokenizer.nextToken();
            System.out.println("str = " + str);
        }
        endTm = System.nanoTime();
        durationTime = endTm - startTm;
        System.out.println("StringTokenizer durationTime = " + durationTime);


    }

}
