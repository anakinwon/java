package com.pisien.edu.medium.medi13;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 *   <Calendar 클래스>
 *      1. Date
 *      2. TimeStamp
 *
 * */
public class Exam11Calendar {

    public static void main(String[] args) {
        /**
         *  <Calendar>
         *   - Date / TimeStamp
         *   - Calendar
         *
         * */

        // Date 클래스는 TimeStamp 기능으로 많이 사용됨.
        Date today = new Date();

        System.out.println("세계 표준 협정시(UTC) 기준 시간 형태 = " + today);

        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat();
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat simpleDateFormat5 = new SimpleDateFormat("yyyy년 MM월 dd일");
        SimpleDateFormat simpleDateFormat6 = new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm:ss");
        SimpleDateFormat simpleDateFormat7 = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
        SimpleDateFormat simpleDateFormat8 = new SimpleDateFormat("yyyy년 MM월 dd일 a hh:mm:ss");
        SimpleDateFormat simpleDateFormat9 = new SimpleDateFormat("yyyy년 MM월 dd일 a HH:mm:ss");

        System.out.println("=========================================");
        System.out.println("simpleDateFormat1 = " + simpleDateFormat1.format(today));
        System.out.println("simpleDateFormat2 = " + simpleDateFormat2.format(today));
        System.out.println("simpleDateFormat3 = " + simpleDateFormat3.format(today));
        System.out.println("simpleDateFormat4 = " + simpleDateFormat4.format(today));
        System.out.println("simpleDateFormat5 = " + simpleDateFormat5.format(today));
        System.out.println("simpleDateFormat6 = " + simpleDateFormat6.format(today));
        System.out.println("simpleDateFormat7 = " + simpleDateFormat7.format(today));
        System.out.println("simpleDateFormat8 = " + simpleDateFormat8.format(today));
        System.out.println("simpleDateFormat9 = " + simpleDateFormat9.format(today));
        System.out.println();


        /**
         *  <Calendar>
         *      - 날짜와 시간 표시하기.
         * */

        // 현재 날짜와 시간으로 설정된 싱글톤 패턴
        Calendar calendar = Calendar.getInstance();

        System.out.println("=========================================");
        System.out.println("년도         = " + calendar.get(Calendar.YEAR));
        System.out.println("월(0~11)     = " + (calendar.get(Calendar.MONTH)+1));
        System.out.println("올해의 주     = " + calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println("이달의 주     = " + calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println("달(0~11)     = " + (calendar.get(Calendar.MONTH)+1));
        System.out.println("일           = " + calendar.get(Calendar.DATE));
        System.out.println("올해의 몇일    = " + calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println("이달의 몇일    = " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("요일(1:일요일) = " + calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("시간(0~23)    = " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("이달의 마지막날 = " + calendar.getActualMaximum(Calendar.DATE));
        System.out.println("오늘의 요일은   = " + getStrWeek(calendar));
        System.out.println();


        /**        
         *  <Calendar>
         *      - 시간 차이 구하기
         *      - 예) 9.11 테러 이후 지나간 시간
         * */
        // 시간 - 시간
        Calendar fromDate = Calendar.getInstance();
        Calendar toDate   = Calendar.getInstance();

        fromDate.set(2001,9,11);

        // 9.11 테러 이후 지나간 시간
        float terror     = (toDate.getTimeInMillis() - fromDate.getTimeInMillis())/1000;
        float pastDate = terror/(24*60*60);
        float pastYear = terror/(365*24*60*60);
        System.out.println("=========================================");
        System.out.println("9.11 테러 이후 지나간 일 수 = " + pastDate);
        System.out.println("9.11 테러 이후 지나간 년 수 = " + pastYear);



        /**
         *  <Calendar>
         *      - TimeZone 구하기
         * */
        String[] timezone = TimeZone.getAvailableIDs();
        for (String zoneId : timezone) {
            System.out.println("존 영역 = " + zoneId);
        }

        // Asia/Seoul
        TimeZone tz = TimeZone.getTimeZone("Asia/Manila");
        Calendar localTime = Calendar.getInstance(tz);
        System.out.println("localTime = " + localTime.getTimeInMillis());

        // 현재 서울의 Time Zone
        System.out.println(toString(localTime));

    }

    /**
     *   Local TimeZone 시간 구하기
     *
     * */
    private static String toString(Calendar date) {
        int i= date.get(Calendar.AM_PM);
        String str= "";
        if(i==0)
            str = "AM";
        else
            str = "PM";

        return date.get(Calendar.YEAR)+"년 "
                + (date.get(Calendar.MONTH)+1)+"월 "
                + date.get(Calendar.DAY_OF_MONTH)+"일 " +str + " "
                + date.get(Calendar.HOUR_OF_DAY)+"시 "
                + date.get(Calendar.MINUTE)+"분 "
                + date.get(Calendar.SECOND)+"분 ";
    }

    /**
     *  한글로 요일 구하기.
     *
     * */

    private static String getStrWeek(Calendar calendar) {
        int week  = calendar.get(Calendar.DAY_OF_WEEK);

        String strWeek = null;

        switch (week) {
            case Calendar.MONDAY:
                strWeek ="월요일"; break;
            case Calendar.TUESDAY:
                strWeek ="화요일"; break;
            case Calendar.WEDNESDAY:
                strWeek ="수요일"; break;
            case Calendar.THURSDAY:
                strWeek ="목요일"; break;
            case Calendar.FRIDAY:
                strWeek ="금요일"; break;
            case Calendar.SATURDAY:
                strWeek ="토요일"; break;
            case Calendar.SUNDAY:
                strWeek ="일요일"; break;
            default:
                break;
        }
        return strWeek;
    }
    
}


