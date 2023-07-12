package com.pisien.edu.medium.medi03;


/**
 * 새로운 메소드를 만드는 일 : new
 *    - 유사하지만 다른 메소드를 만든다.
 *    - 사용불가
 *       : 리턴 타입만 다르면 사용 불가
 *       : 매개변수명이 달라도 사용 불가
 *
 *    - 사용가능
 *       : 매개변수 명만 다르면 사용 불가
 *       : 매개변수 갯수가 다르면 사용 가능
 *       : 매개변수 타입이 다를때 위치가 달라도 사용 가능
 *
 * */
public class Exam02Overloading {

    public static void main(String[] args) {
        int x = 100;
        int y = 200;
        int v = 300;
        int[] arr = new int[] {x,y,v};

        // long 타입은 접미사('L')를 반드시 쓰자
        long w = 100L;
        long z = 200L;

        double l = 30.32;
        double m = 10.13;
        double n = 20.24;
        double[] dArr = new double[] {l,m,n};

        System.out.println("Overload Test 1 = " + add(x,y));           // 기본 메소드
        System.out.println("Overload Test 2 = " + add(w,z));           // 타입이 다른 오버로드
        System.out.println("Overload Test 4 = " + add(m,n));           // 타입이 다른 오버로드
        System.out.println("Overload Test 3 = " + add(arr));           // 배열 오버로드
        System.out.println("Overload Test 5 = " + add(dArr));          // 타입이 다른 배열 오버로딩
        System.out.println("Overload Test 6 = " + add(new AClass()));  // 객체 오버로딩
    }

    public static int add(int x, int y) {
        return x + y;
    }
//    public static int add(int a, int b) {   // 매개변수명만 다르면 오버로딩 사용 불가
//        return a + b;
//    }
//    public static long add(int a, int b) {  // 리턴 타입만 다르면 오버로딩 사용 불가
//        return a + b;
//    }

    public static long add(long a, long b) {  // 타입이 다르면 오버로딩 사용 가능
        return a + b;
    }
    public static long add(int x, long y) {  // 타입이 다르면 오버로딩 사용 가능
        return (long)x + y;
    }
    public static long add(long x, int y) {  // 위치가 다르면 오버로딩 사용 가능
        return x + (long)y;
    }
    public static double add(double x, double y) {  // 위치가 다르면 오버로딩 사용 가능
        return x + y;
    }

    /**
     *   배열 오버로딩
     *      - 배열의 주소를 받아와서 그 값의 총 합을 구하여 반환한다.
     * */
    public static int add(int[] arr) {    // 타입이 다르면 오버로딩 사용 가능
        int result = 0;
        for(int i : arr) {
            result += i;
        }
        return  result;
    }
    public static long add(long[] arr) {  // 타입이 다르면 오버로딩 사용 가능
        int result = 0;
        for(long i : arr) {
            result += i;
        }
        return  result;
    }
    public static double add(double[] arr) {  // 타입이 다르면 오버로딩 사용 가능
        int result = 0;
        for(double i : arr) {
            result += i;
        }
        return  result;
    }

    /**
     *   객체 오버로딩
     *      - 클래스를 만들어서 오버로딩할 수 있다.
     * */
    public static int add(AClass aClass) {
        return aClass.data1 + aClass.data2;
    }

    static class AClass {
        int data1 = 100;
        int data2 = 200;
    }
}

