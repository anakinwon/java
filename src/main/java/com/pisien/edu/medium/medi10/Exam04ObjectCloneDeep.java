package com.pisien.edu.medium.medi10;

import java.util.Arrays;

/**
 *   <Clone>
 *       - Deep Clone
 *       - 객체를 복제한다.
 *
 * */
public class Exam04ObjectCloneDeep {

    public static void main(String[] args) {
        Product origin = new Product("1000", "TV", 3000000  // 얕은 복제대상
                                    , new int[] {10,20,30}           // 깊은 복제대상
                                    , new Apple(20000)          // 깊은 복제대상
                                    );

        // 얕은 복제를 통한 Clone
        Product cloned = origin.getProduct();

        int[] arr1 = origin.getArr();
        int[] arr2 = cloned.getArr();
        Apple apple = cloned.getApple();

        System.out.println("원본 = " + arr1);
        System.out.println("복제 = " + arr2);
        arr1[0] = 777;
        apple.price = 30000;

        System.out.println("origin" + origin);
        System.out.println();
        System.out.println("cloned" + cloned);

    }

    // 클레스의 복제가 가능하려면
    // java.lang.cloneable 인터페이스를 구현해야 한다.
    public static class Product implements Cloneable {

        private String id;
        private String name;
        private int price;
        private int[] arr;
        private Apple apple;

        public Product(String id, String name, int price, int[] arr, Apple apple) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.arr = arr;
            this.apple = apple;
        }

        public String getId() {
            return id;
        }
        public String getName() {
            return name;
        }
        public int getPrice() {
            return price;
        }

        public int[] getArr() {
            return arr;
        }

        public Apple getApple() {
            return apple;
        }

        @Override
        public String toString() {
            return  " Product { " + "\n" +
                    "         , 아이디 = " + this.getId() + "\n" +
                    "         , 상품   = " + this.getName() + "\n" +
                    "         , 가격   = " + this.getPrice() + "\n" +
                    "         , 배열   = " + Arrays.toString(this.arr) + "\n" +
                    "         , 사과   = " + this.apple.price + "\n" +
                    "         } ";
        }

        public Product getProduct() {
            Product cloned = null;
            try {
                // 얕은 복제가 일어난다. (참조변수의 값들은 번지 공유)
                cloned = (Product) this.clone();
            }
            catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            return cloned;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            //얕은 복제 대상 복제
            Product cloned = (Product) super.clone();

            // 깊은 복제 대상 직접 코딩해야 함.(기본형 타입)
            // 참조타입들을 복제하는 코드
            cloned.arr = Arrays.copyOf(this.arr, this.arr.length);
            cloned.apple = new Apple(this.apple.price);

            return cloned;
        }
    }

    public static class Apple {
        int price;

        public Apple(int price) {
            this.price = price;
        }

    }
}
