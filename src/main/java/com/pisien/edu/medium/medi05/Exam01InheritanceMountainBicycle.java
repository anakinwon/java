package com.pisien.edu.medium.medi05;
/**
 *  자손 클래스 (서브 클래스)
 *
 * */
public class Exam01InheritanceMountainBicycle extends Bicycle{
    /**
     *   MountainBicycle 에서 선언한 멤버변수는 3개 밖에 없으나
     *   부모클래스(Bicycle) 로부터 상속 받은 멤버변수 2개 포함해서,
     *   총 5개의 멤버변수가 존재한다.
     *
     * */
    //int id;        // id와 brand는 부모 클래스에서 상속받아와 선언을 안해도 내꺼 처럼 쓴다.
    //String brand;  // id와 brand는 부모 클래스에서 상속받아와 선언을 안해도 내꺼 처럼 쓴다.
    String frame ;
    int gear;
    int price;

    public static void main(String[] args) {
        Exam01InheritanceMountainBicycle mountainBicycle = new Exam01InheritanceMountainBicycle();

        mountainBicycle.id    = 1111;
        mountainBicycle.brand = "삼천리";
        mountainBicycle.owner = "아나킨";
        mountainBicycle.frame = "알루미늄";
        mountainBicycle.gear  = 33;
        mountainBicycle.price = 300000;

        mountainBicycle.print();
    }

    public void print() {
        System.out.println("id    = " + this.id);     // 부모클래스로부터 상속받은 멤버 변수
        System.out.println("brand = " + this.brand);  // 부모클래스로부터 상속받은 멤버 변수
        System.out.println("owner = " + this.owner);  // 부모클래스로부터 상속받은 멤버 변수
        System.out.println("frame = " + this.frame);
        System.out.println("gear  = " + this.gear);
        System.out.println("price = " + this.price);
    }
}


