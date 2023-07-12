package com.pisien.edu.medium.medi06;

public class Exam02Polymorphism {

    public static void main(String[] args) {

        /**
         *  기본 선수 만들기
         *     - 다형성 미적용 코드
         * */
        Player player = new Player("손흥민", 30, 7, 30);

        /**
         *  필드의 다형성 : 스트라이커 만들기
         *     - 다형성이 적용된 코드 (필드의 다형성)
         *     - 하지만 근본은 벗어나지 못한다.
         *     - Striker 클래스에 있는 getShoot()에서는 Player2 참조변수가 접근이 안된다.
         * */
        Player player1 = new Striker("이강인", 22, 13, 25, 30);

        /**
         *  필드의 다형성 : 미드필더 만들기
         *     - 다형성이 적용된 코드 (필드의 다형성)
         *     - 메소드에서 상속관계에 있다면, 자손클래스 오버라이딩을 하게 되면,
         *     - 현재 참조하고 있는 인스턴스의 메소드를 호출한다.
         * */
        Player player2 = new Midfielder("황의조", 28, 12, 28, 15);
        // 필드의 다형성 : 수비수 만들기 - 다형성이 적용된 코드 (필드의 다형성)
        Player player3 = new Defender("김민재", 25, 23, 26, 20);

        System.out.println();
        player.info();
        System.out.println();
        player1.info();
        System.out.println();
        player2.info();
        System.out.println();
        player3.info();
        System.out.println();
    }

    // 부모 클래스  ==========================================================================
    public static class Player {

        private String name;
        private int age;
        private int backNumber;
        private int speed;

        public Player(String name, int age, int backNumber, int speed) {
            this.name = name;
            this.age = age;
            this.backNumber = backNumber;
            this.speed = speed;
        }

        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }
        public int getBackNumber() {
            return backNumber;
        }
        public int getSpeed() {
            return speed;
        }

        /**
         *  공통적인 부분은 다형성 시 유용하게 사용된다.
         *
         * */
        public void info() {
            System.out.println("선수 이름  = " + this.getName());
            System.out.println("선수 나이  = " + this.getAge());
            System.out.println("선수 번호  = " + this.getBackNumber());
            System.out.println("선수 능력치 = " + this.getSpeed());
        }

    }
    // 부모 클래스  ==========================================================================

    // 자식 클래스  ==========================================================================
    public static class Midfielder extends Player {
        private int pass;

        public Midfielder(String name, int age, int backNumber, int speed, int pass) {
            super(name, age, backNumber, speed);
            this.pass = pass;
        }

        public int getPass() {
            return pass;
        }

        @Override
        public void info() {
            super.info();    // player 의 정보를 호출
            System.out.println("패스 성공 = " + this.getPass());
        }
    }

    // 자식 클래스 - 스트라이커
    public static class Striker extends Player {
        private int shoot;

        public Striker(String name, int age, int backNumber, int speed, int shoot) {
            super(name, age, backNumber, speed);
            this.shoot = shoot;
        }

        public int getShoot() {
            return shoot;
        }

        @Override
        public void info() {
            super.info();    // player 의 정보를 호출
            System.out.println("유효 슈팅 = " + this.getShoot());
        }
    }

    // 자식 클래스 - 수비수
    public static class Defender extends Player {
        private int def;

        public Defender(String name, int age, int backNumber, int speed, int def) {
            super(name, age, backNumber, speed);
            this.def = def;
        }

        public int getDef() {
            return def;
        }

        @Override
        public void info() {
            super.info();    // player 의 정보를 호출
            System.out.println("수비 성공 = " + this.getDef());
        }
    }
    // 자식 클래스  ==========================================================================

}
