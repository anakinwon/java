package com.pisien.edu.medium.medi13;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *   <Format 클래스>
 *      1. Decimal - 숫자 포멧
 *      2. Date 포멧
 *      3.
 * */
public class Exam09NumberDateFormat {

    public static void main(String[] args) {
        /**
         *  <숫자 포멧>
         *   - 234698234.835 ->  234,698,234.8350
         * */
        double num = 234698234.835;

        System.out.println("===============================================");
        DecimalFormat dformat1 = new DecimalFormat("0,000.0000");
        DecimalFormat dformat2 = new DecimalFormat("#,###.####");
        DecimalFormat dformat3 = new DecimalFormat("#,###.0000");

        System.out.println("dformat1 = " + dformat1.format(num));
        System.out.println("dformat2 = " + dformat2.format(num));
        System.out.println("dformat3 = " + dformat3.format(num));
        System.out.println();

        /**
         *  <날짜 포멧>
         *    :  Sun Jul 09 13:52:49 KST 2023  ->
         * */
        System.out.println("===============================================");
        Date date = new Date();
        SimpleDateFormat fullDateFormat1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        SimpleDateFormat fullDateFormat2 = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
        SimpleDateFormat fullDateFormat3 = new SimpleDateFormat("yyyy-MM-dd E요일 a hh:mm:ss");
        SimpleDateFormat fullDateFormat4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSXXX");
        SimpleDateFormat fullDateFormat5 = new SimpleDateFormat("yyyyMMddHHmmssZ");
        SimpleDateFormat dateFormat1     = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat dateFormat2     = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat dateFormat3     = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat yyyyMm1          = new SimpleDateFormat("yyyy-MM");
        SimpleDateFormat yyyyMm2          = new SimpleDateFormat("yyyy/MM");
        SimpleDateFormat yyyyMm3          = new SimpleDateFormat("yyyyMM");
        SimpleDateFormat yyMm             = new SimpleDateFormat("yyMM");

        System.out.println("date = " + date);
        System.out.println("fullDateFormat1  = " + fullDateFormat1.format(date));
        System.out.println("fullDateFormat2  = " + fullDateFormat2.format(date));
        System.out.println("fullDateFormat3  = " + fullDateFormat3.format(date));
        System.out.println("fullDateFormat4  = " + fullDateFormat4.format(date));
        System.out.println("fullDateFormat5  = " + fullDateFormat5.format(date));
        System.out.println("dateFormat1      = " + dateFormat1.format(date));
        System.out.println("dateFormat2      = " + dateFormat2.format(date));
        System.out.println("dateFormat3      = " + dateFormat3.format(date));
        System.out.println("yyyyMm1          = " + yyyyMm1.format(date));
        System.out.println("yyyyMm2          = " + yyyyMm2.format(date));
        System.out.println("yyyyMm3          = " + yyyyMm3.format(date));
        System.out.println("yyMm             = " + yyMm.format(date));
        System.out.println();

        // 년도 기준
        fullDateFormat3 = new SimpleDateFormat("오늘은 올해의 D번째 일입니다.");
        System.out.println("fullDateFormat3 = " + fullDateFormat3.format(date));
        System.out.println();

        // 월 기준
        fullDateFormat3 = new SimpleDateFormat("오늘은 이달의 d번째 일입니다.");
        System.out.println("fullDateFormat3 = " + fullDateFormat3.format(date));
        System.out.println();

        // 년기준 주
        fullDateFormat3 = new SimpleDateFormat("이번 주는 올해의 w번째 주입니다.");
        System.out.println("fullDateFormat3 = " + fullDateFormat3.format(date));
        System.out.println();

        // 월기준 주
        fullDateFormat3 = new SimpleDateFormat("이번 주는 이달의 W번째 주입니다.");
        System.out.println("fullDateFormat3 = " + fullDateFormat3.format(date));
        System.out.println();

        // 해당 월
        fullDateFormat3 = new SimpleDateFormat("이번 달은 M월 입니다.");
        System.out.println("fullDateFormat3 = " + fullDateFormat3.format(date));
        System.out.println();

        // 요일
        fullDateFormat3 = new SimpleDateFormat("오늘은 E요일 입니다.");
        System.out.println("fullDateFormat3 = " + fullDateFormat3.format(date));
        System.out.println();

        // 기준시
        fullDateFormat3 = new SimpleDateFormat("z는 기준시 보다 X시간 빠릅니다.");
        System.out.println("fullDateFormat3 = " + fullDateFormat3.format(date));
        System.out.println();

    }

}
