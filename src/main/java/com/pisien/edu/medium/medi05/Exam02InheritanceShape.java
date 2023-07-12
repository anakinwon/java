package com.pisien.edu.medium.medi05;

/**
 *   <InheritanceShape - 상속예제>
 *       - 하나의 어플리케이션에서 오로지 단, 하나만 생생되는 객체(인스턴스)
 *       - 상속관계 : is a  ~은 ~이다.          ->  Circle is a Point(미 성립)
 *       - 포함관계 : has a ~은 ~을 가지고 있다. ->  Circle has a Point(성립)
 *
 * */
public class Exam02InheritanceShape {

    public static void main(String[] args) {

        Object obj = new Object();


        Circle c1 = new Circle();
        c1.draw();
        System.out.println();

        Circle c2 = new Circle(new Point(150,150), 500);
        c2.draw();
        System.out.println();

        Triangle t1 = new Triangle();
        t1.draw();
        System.out.println();

        Point[] p = new Point[] { new Point(10,10),new Point(80,100),
                new Point(20,120) };

        Triangle t2 = new Triangle(p);
        t2.draw();
    }

    // 독립클래스
    public static class Point {
        int x;
        int y;

        // 기본 생성자
        public Point() {
            this(0, 0);  // 또 다른 생성자 호출
        }

        // 매개변수가 있는 생성자
        public Point(int x, int y) {
            System.out.println("Point 클래스의 매개변수가 있는 생성자 호출");
            this.x = x;
            this.y = y;
        }

    }

    // 조상클래스
    public static class Shape {

        String color = "black";

        public void draw() {
            System.out.println("draw()");
        }

    }

    public static class Triangle extends Shape {

        Point[] p;  //객체 배열

        public Triangle() {
            this(new Point(0,0), new Point(50,50), new Point(100,100));
        }

        public Triangle(Point p1, Point p2, Point p3) {
            System.out.println("Triangle 의 매개변수 3개 호출됨");
            this.p = new Point[] { p1, p2, p3 };
        }

        public Triangle(Point[] p) {
            System.out.println("Triangle 의 매개변수 p 호출됨 ");
            this.p = p;
        }

        @Override
        public void draw() {
            System.out.println("[p1] : " + this.p[0].x + ", " + this.p[0].y);
            System.out.println("[p2] : " + this.p[1].x + ", " + this.p[1].y);
            System.out.println("[p3] : " + this.p[2].x + ", " + this.p[2].y);
        }


    }

    public static class Circle extends Shape {

        Point center;  // 원점
        int radius;    // 반지름

        public Circle() {
            this(new Point(0,0), 100);
        }

        public Circle(Point center, int radius) {
            System.out.println("Circle 클래스에 매개변수가 있는 생성자 호출");
            this.center = center;
            this.radius  = radius;
        }
        @Override
        public void draw() {
            System.out.println(" 색깔 : " + this.color);
            System.out.println(" 원점 : ( x : " + this.center.x + ", y : " +
                               this.center.y + ") , 반지름 : " + this.radius);
        }
    }
}
