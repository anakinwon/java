package com.pisien.edu.medium.medi09;


import com.pisien.edu.medium.medi09.exception.CommonException;

/**
 *   일반예외 : try ~ catch
 *   실행예외 : unchecked exception
 *
 *   <ClassNotFoundException>
 *       - 클래스 찾기 에러
 *       - ClassNotFoundException
 *
 * */
public class Exam06ExceptionTryCatch {

    public static void main(String[] args) {

        try {
            // 클래스명으로 클래스 찾기.
            Class class1 = Class.forName("java.lang.ArrayIndexOutOfBoundsException");
            System.out.println("class1 name       = " + class1);
            System.out.println("class1 getName    = " + class1.getName());
            System.out.println("class1 simpleName = " + class1.getSimpleName());

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

            System.out.println(e.getMessage() + " - ArithmeticException");
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

}
