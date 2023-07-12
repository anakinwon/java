package com.pisien.edu.medium.medi09;


import com.pisien.edu.medium.medi09.exception.CommonException;

public class Exam05ExceptionClassCast {

    public static void main(String[] args) {
        
        try {

            // 상속 테스트
            A a = new B();
            B b = (B) a;
            System.out.println("실행 오류 없이 완료됨");

//            A a1 = new B();
//            C c1 = (C) a1;
//            System.out.println("상속 Class Cast 오류남!!");

            // 인터페이스 테스트
            I i = new D();
            D d = (D)i;
            System.out.println("실행 오류 없이 완료됨");

            I i2 = new D();
            E e = (E)i2;
            System.out.println("Interface Class Cast 오류남!!");
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
        catch (CommonException e) {
            // 개발시에만 사용
            // 디버깅할 때 유용하다.
            // 운영 배포시 반드시 제거한다.
            e.printStackTrace();

            System.out.println("\t\t\t CommonException =" + e);
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
     *   일반예외 : try ~ catch
     *   실행예외 : unchecked exception
     *
     *   <ClassCastException>
     *       - Class Cast 오류
     *       - cannot be cast to class - ClassCastException
     *
     * */

    static class A {}

    static class B extends A {}

    static class C extends B {}

    static interface I {}

    static class D implements I {}

    static class E implements I {}
}
