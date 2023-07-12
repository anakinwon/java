package com.pisien.edu.medium.medi09.exception;

/**  
 *  공통 예외클래스
 *     - 관례적으로 ~Exception 을 붙여준다
 *     - runtime 예외는 사용자정으로 만들지 않는다.
 *     - 일반예외로 만든다.
 *     - 기본생성자를 반드시 선언하자.
 *     - 조상생성자를 반드시 호출하자. (발생 이유와 함께...)
 *
 * */
//public class CommonException extends Exception {
public class CommonException extends RuntimeException {

    public CommonException() {
        super();
    }

    public CommonException(String message) {
        super(message);
    }

    public CommonException(String message, Throwable cause) {
        super(message, cause);
    }

    public CommonException(Throwable cause) {
        super(cause);
    }

    public CommonException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
