package com.pisien.edu.medium.medi09;


import com.pisien.edu.medium.medi09.exception.CommonException;

/**
 *   일반예외 : try ~ catch
 *   실행예외 : unchecked exception
 *
 *   <throws>
 *       - 예외사항 던지기
 *       - throws
 *
 * */
public class Exam07ExceptionThrows {

    public static void main(String[] args) {

        try {
//            Class class1 = Class.forName("java.lang.123");
//            System.out.println("class1       name = " + class1);
//            System.out.println("class1    getName = " + class1.getName());
//            System.out.println("class1 simpleName = " + class1.getSimpleName());

            method1();

        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage() + " - ArrayIndexOutOfBoundsException");
            return;
        }
        catch (NullPointerException e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage() + " - NullPointerException");
            return;
        }
        catch (NumberFormatException e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage() + " - NumberFormatException");
            return;
        }
        catch (ArithmeticException e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage() + " - ArithmeticException");
            return;
        }
        catch (ClassCastException e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage() + " - ClassCastException");
            return;
        }
        catch (ClassNotFoundException e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage() + " - ClassNotFoundException");
            return;
        }
        catch (CommonException e) {
            // 개발시에만 사용
            // 디버깅할 때 유용하다.
            // 운영 배포시 반드시 제거한다.
            e.printStackTrace();
            System.out.println(e.getMessage() + " - CommonException");
            return;
        }
        catch (Exception e) {
            System.out.println(e.getMessage() + " - Exception");
            return;
        }
        finally {
            System.out.println("프로그램이 종료됩니다.");
        }
    }

    /**
     *  throws 는 매서드 선언부 끝에 작성을 하며
     *  호출한 곳으로 예외를 되던지며
     *  호출한 곳에서 예외를 반드시 처리해야 한다.
     * */
    public static void method1() throws Exception {
        // method2()에서 발생한 예외를 main() 으로 던진다.
        method2();
    }

    /**
     * 예외를 강제로 던진다.
     * */
    public static void method2() throws Exception {
        // / by zero - ArithmeticException 를 method1() 으로 던진다
        //System.out.println(10/0);
        throw new CommonException("고의로 에러를 발생시킴");
    }

}
