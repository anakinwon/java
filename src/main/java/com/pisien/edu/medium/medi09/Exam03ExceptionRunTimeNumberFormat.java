package com.pisien.edu.medium.medi09;


import com.pisien.edu.medium.medi09.exception.CommonException;

/**
 *   일반예외 : try ~ catch
 *   실행예외 : unchecked exception
 *
 *   <NumberFormatException>
 *       - 숫자 변환 에러
 *       - For input string: "100원" - NumberFormatException
 *
 * */
public class Exam03ExceptionRunTimeNumberFormat {

    public static void main(String[] args) {
        
        String str1 = "100";
        String str2 = "100원";
        try {
            System.out.println(str1+", "+str2);

            int num1 = Integer.parseInt(str1);
            // 문자를 숫자로 변환할 수 없는 에러발생
            int num2 = Integer.parseInt(str2);
            int sum = num1 + num2;
            System.out.println("sum = " + sum);
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
            System.out.println(e.getClass());
            System.out.println(e.getMessage() + " - NumberFormatException");
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
