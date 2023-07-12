package com.pisien.edu.medium.medi13;

import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *   <정규표현식 & Pattern>
 *      1. Pattern.matches()
 *      2. Pattern.compile()
 * */
public class Exam08PatternSearch {

    public static void main(String[] args) {

        String[] data = new String[] {
                  "ant", "anti", "and"
                , "bat", "batch", "bath"
                , "center", "call", "calendar"
                , "do", "day", "dog"
        };

        // 소문자 c로 시작하는 영어단어나 문자를 패턴으로 정의
        Pattern pattern = Pattern.compile("c[a-z]*");

        Vector<String> vStrings = new Vector<String>();

        for (String str : data) {
            Matcher matcher = pattern.matcher(str);

            // 정의한 패턴과 일치하는가?
            if (matcher.matches()) {
                System.out.println("matcher = " + str);
                vStrings.add(str);
            }
        }

    }

}
