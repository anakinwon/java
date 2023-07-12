package com.pisien.edu.medium.medi09;


import com.pisien.edu.medium.medi09.exception.CommonException;

/**
 *   일반예외 : try ~ catch
 *   실행예외 : unchecked exception
 *
 *   <ArrayIndexOutOfBoundsException>
 *       - 인덱스 참조 에러
 *       - IIndex 5 out of bounds for length 5 - ArrayIndexOutOfBoundsException
 *
 * */
public class Exam01ExceptionRunTimeOutOfBounds {

    public static void main(String[] args) {
        int[] arr = new int[5];

        // 방이 5개인데, 10번까지 요구하면 오류가 남!!!
        for(int i=0; i<10; i++) {

            try {
                arr[i] = i*10;
                // 인덱스가 5 이상 초과되어,
                // 없는 인덱스를 참고할 때 발생하는 에러
                System.out.println("array[" +i+ "] = "+ arr[i]);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getClass());
                System.out.println(e.getMessage() + " - ArrayIndexOutOfBoundsException");
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
        }
    }

}
