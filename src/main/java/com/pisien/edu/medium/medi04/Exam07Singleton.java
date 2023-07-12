package com.pisien.edu.medium.medi04;


/**
 *   <Singleton - 싱글톤>
 *       - 하나의 어플리케이션에서 오로지 단, 하나만 생생되는 객체(인스턴스)
 *
 * */
public class Exam07Singleton {

    public static void main(String[] args) {

        /**
         *  싱글톤은 new 사용 불가.
         *  싱글톤은 주로 getInstance() 사용
         *    예시), Calendar cal = Calendar.getInstance();
         *          Date date    = cal.getTime();
         *  싱글톤으로 만들어서 접근 불가능
         *
         * */
        //User user1 = new User();
        //User user2 = new User();

        User user3 = User.getInstance();
        System.out.println("user3 = " + user3);

        User user4 = User.getInstance();
        System.out.println("user4 = " + user4);

    }

    /**
     *   <Singleton - 싱글톤>
     *       - 하나의 어플리케이션에서 오로지 단 하나만 생생되는 객체(인스턴스)
     *       - 사용자 환경설정
     *       - 커넥션 풀 / 스레드 풀
     *       - OS의 시간이나 날짜 (Calendar) 등
     *
     *
     * */

    public static class User {

        // 외부에서 접근하지 못하도록 private singleton 으로 생성
        // 해당 클래스 자신의 타입으로 정적 멤버 선언과 동시에 생성한다.
        private static User singleton = new User();

        // 외부에서 new 로 접근하지 못하도록 private 로 생성
        private User() {
        }

        // 외부에서 접근할 수 있도록 singleton으로 개방
        // 자기 자신의 정적 멤버 getter 메소드 제공
        public static User getInstance() {
            return User.singleton;
        }

    }
}

