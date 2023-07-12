package com.pisien.edu.medium.medi05;

/**
 *   <InheritanceShape - 상속예제>
 *       - 오버로딩 Overloading : 새로운 메소드를 만드는 것. (new 의 개념)
 *       - 오버라이딩 Overriding : 선언부가 같고 구현부만 다른 것. (modify, change 의 개념)
 *
 * */
public class Exam05ParentChild {

    public static void main(String[] args) {

        // 자손 클래스의 인스턴스를 생성하면, 조상클래스의 인스턴스가 제일 먼저 생성된다.
        // 조상과 자손의 클래스가 합쳐져서 할당된다.
        Child child = new Child();

        child.show();

        Parent parent = new Parent(2000);
        parent.show();

    }


    public static class Child extends Parent {
        int x = 200;

        public Child() {
            // super(); 조상클래스를 호출해 주는데,
            // 생략해도 컴파일러가 자동으로 호출해 줌.
            //super();

            // 조상클래스에  기본생성자 없이 매개변수포함한 생성자가 있다면,
            // 부모클래스는 상속 불가하여 무조건 super() 호출해야 함.
            super(300);

            System.out.println("자식 클래스 나중 생성");
        }

        @Override
        public void show() {
            System.out.println("부모 인스턴스의 super.x = " + super.x);
            System.out.println("자식 인스턴스의  this.x = " +  this.x);
            System.out.println("현재 인스턴스의 x       = " +       x);

            // 조상 클래스의 super() 호출
            super.show();
        }
    }

    public static class Parent {
        int x = 100;

    //    public Parent() {
    //        System.out.println("조상 클래스 먼저 생성");
    //    }

        public Parent(int x) {
            this.x = x;
        }

        public void show() {
            System.out.println("조상클래스의 show(" + this.x + ") 호출");
        }

    }
}

