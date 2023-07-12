package com.pisien.edu.medium.medi09;


import com.pisien.edu.medium.medi09.exception.CommonException;

/**
 *   일반예외 : try ~ catch
 *   실행예외 : unchecked exception
 *
 *   <ArithmeticException>
 *       - 산술계산 에러
 *       - / by zero - ArithmeticException
 *
 * */
public class Exam04ExceptionArithmetic {

    public static void main(String[] args) {
        
        try {
            int num1 = 10;
            int num2 = 0;
            // 산술적예외 발생에러 : 모든 수는 0으로 나눌수 없는 에러
            int div = num1 / num2;

            // 모든 수는 0으로 나눌 수 없습니다.
            System.out.println("div = " + div);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage() + " - ArrayIndexOutOfBoundsException");
            return;
        }
        catch (NullPointerException e) {
            System.out.println(e.getMessage() + " - NullPointerException");
            return;
        }
        catch (NumberFormatException e) {
            System.out.println(e.getMessage() + " - NumberFormatException");
            return;
        }
        catch (ArithmeticException e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage() + " - ArithmeticException");
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

}
