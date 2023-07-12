package com.pisien.edu.medium.medi06;

public class Exam05PolymorphismVectorParam {

    public static void main(String[] args) {

        Buyer buyer = new Buyer();

        System.out.println("구매전 잔고   = " + buyer.money);
        System.out.println("구매전 포인트 = " + buyer.bonusPoint);
        System.out.println();

        buyer.buy(new Tv());
        buyer.buy(new Audio());
        buyer.buy(new Computer());
        //buyer.buy(new Apple());   //Apple()은 상속관계가 아니므로 다형성을 사용할 수 없다.
        System.out.println();

        System.out.println("계정 잔고    = " + buyer.money);
        System.out.println("누적 포인트   = " + buyer.bonusPoint);

    }


    // 조상 클래스 =========================================================
    public static class Product {

        int price;      // 제품의 가격
        int bonusPoint; // 제품 구매시 제공되는 보너스 점수

        public Product(int price) {
            this.price = price;
            this.bonusPoint = (int)(price/10.0f);
        }
    }
    // 조상 클래스 =========================================================


    // 자손 클래스 =========================================================
    public static class Tv extends Product {

        // 조상클래스의 매개변수가 있는 생성자 Product(int price) {} 를 호출
        public Tv() {        super(1500000);    }

        @Override
        public String toString() {        return "Tv";    }
    }

    public static class Audio extends Product {

        // 조상클래스의 매개변수가 있는 생성자 Product(int price) {} 를 호출
        public Audio() {
            super(3600000);
        }

        @Override
        public String toString() {
            return "Audio";
        }
    }
    public static class Computer extends Product {
        // 조상클래스의 매개변수가 있는 생성자 Product(int price) {} 를 호출
        public Computer() {
            super(2500000);
        }

        @Override
        public String toString() {
            return "Computer";
        }
    }
    // 자손 클래스 =========================================================

    // 독립 클래스 =========================================================
    public static class Apple {
    }
    // 독립 클래스 =========================================================

    /**
     *   여기서 매개변수 Product 타입이 왔다는것은
     *   Product 이거나 그의 자손들이 다형성을 사용할 수 있다는 의미
     *      - 매개변수의 다형성
     *
     * */
    // 독립 클래스
    public static class Buyer {
        int money = 35000000;
        int bonusPoint = 0;

        // 아래와 같이 코딩을 하게되면, 제품이 늘어날때마나 추가해야 한다.
        // 따라서 다형성을 사용하자.
    //    public void buy(Tv tv) {
    //        if (this.money<tv.price) {
    //            System.out.println("잔액이 부족하여, TV를 구매할 수 없습니다.");
    //            return;
    //        }
    //        this.money -= tv.price;
    //        this.bonusPoint += tv.bonusPoint;
    //        System.out.println(tv.price+"원, "+ tv + "를 성공적으로 구매했습니다.");
    //    }
    //    public void buy(Audio audio) {
    //        if (this.money<audio.price) {
    //            System.out.println("잔액이 부족하여, TV를 구매할 수 없습니다.");
    //            return;
    //        }
    //        this.money -= audio.price;
    //        this.bonusPoint += audio.bonusPoint;
    //        System.out.println(audio.price+"원, "+ audio + "를 성공적으로 구매했습니다.");
    //    }
    //
    //    public void buy(Computer computer) {
    //        if (this.money<computer.price) {
    //            System.out.println("잔액이 부족하여, TV를 구매할 수 없습니다.");
    //            return;
    //        }
    //        this.money -= computer.price;
    //        this.bonusPoint += computer.bonusPoint;
    //        System.out.println(computer.price+"원, "+ computer + "를 성공적으로 구매했습니다.");
    //    }

        public void buy(Product product) {
            if (this.money<product.price) {
                System.out.println("잔액이 부족하여, "+ product +"을(를) 구매할 수 없습니다.");
                return;
            }
            this.money -= product.price;
            this.bonusPoint += product.bonusPoint;
            System.out.println(product.price+"원, "+ product + "를 성공적으로 구매했습니다.");
        }

    }
}
