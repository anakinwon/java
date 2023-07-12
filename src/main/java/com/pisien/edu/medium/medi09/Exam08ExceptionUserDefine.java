package com.pisien.edu.medium.medi09;


import com.pisien.edu.medium.medi09.exception.BalanceException;
import com.pisien.edu.medium.medi09.exception.CommonException;

/**
 *   일반예외 : try ~ catch
 *   실행예외 : unchecked exception
 *
 *   <User Define>
 *       - 사용자 정의 예외처리
 *       -
 *
 * */
public class Exam08ExceptionUserDefine {

    public static void main(String[] args) {

        Account account = new Account();
        account.deposit(50000);
        System.out.println("현재 잔액 = " + account.getBalance());

        try {
//            Class class1 = Class.forName("java.lang.123");
//            System.out.println("class1       name = " + class1);
//            System.out.println("class1    getName = " + class1.getName());
//            System.out.println("class1 simpleName = " + class1.getSimpleName());

            account.withdraw(60000);
            System.out.println("현재 잔액 = " + account.getBalance());
//            method1();

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
//        catch (ClassNotFoundException e) {
//            System.out.println(e.getClass());
//            System.out.println(e.getMessage() + " - ClassNotFoundException");
//            return;
//        }
        catch (CommonException e) {
            // 개발시에만 사용
            // 디버깅할 때 유용하다.
            // 운영 배포시 반드시 제거한다.
            e.printStackTrace();
            System.out.println(e.getMessage() + " - CommonException");
            return;
        }
        catch (BalanceException e) {  // 사용자 정의 예외처리.
            System.out.println(e.getMessage() + " - BalanceException(잔액부족)");
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

    public static class Account {
        private long balance;

        public Account() {
        }

        // 잔고조회
        public long getBalance() {
            return this.balance = balance;
        }

        // 입금하기
        public void deposit(int money) {
            this.balance += money;
        }

        // 출금하기
        public void withdraw(int money) throws BalanceException {
            if(this.balance<money) {
                throw new BalanceException("출금을 위한 잔고 부족");
            }
            else {
                this.balance -= money;
            }
        }

    }
}
