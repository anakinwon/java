package com.pisien.edu.medium.medi09;


import com.pisien.edu.medium.medi09.exception.CommonException;

/**
 *   일반예외 : try ~ catch
 *   실행예외 : unchecked exception
 *
 *   <NullPointerException>
 *       - null 참조 에러
 *       - null - NullPointerException
 *
 * */
public class Exam02ExceptionRunTimeNullPoint {

    public static void main(String[] args) {
        
        String str = null;
        try {
            // 읽기를 시도하다 오류가 발생되면, Catch 문으로 간다.
            // null 을 변환 또는 대입할 수 없는 에러
            System.out.println(str.toString());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage() + " - ArrayIndexOutOfBoundsException");
            return;
        }
        catch (NullPointerException e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage() + " - NullPointerException");
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
