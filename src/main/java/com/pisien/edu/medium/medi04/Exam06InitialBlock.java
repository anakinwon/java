package com.pisien.edu.medium.medi04;


import java.util.Arrays;

/**
 *   <Initial Block>
 *       - Initial Block Test
 *
 * */
public class Exam06InitialBlock {

    public static void main(String[] args) {

        Product product1 = new Product();
        System.out.println("product1.number  = " + product1.number + ", product1.CountNo = " + product1.countNo);
        System.out.println("Arrays1 = " + Arrays.toString(product1.arr));

        System.out.println();
        Product product2 = new Product();
        System.out.println("product1.number  = " + product1.number + ", product1.CountNo = " + product1.countNo);
        System.out.println("product2.number  = " + product2.number + ", product2.CountNo = " + product2.countNo);
        System.out.println("Arrays1 = " + Arrays.toString(product1.arr));
        System.out.println("Arrays2 = " + Arrays.toString(product2.arr));

        System.out.println();
        Product product3 = new Product();
        System.out.println("product1.number  = " + product1.number + ", product1.CountNo = " + product1.countNo);
        System.out.println("product2.number  = " + product2.number + ", product2.CountNo = " + product2.countNo);
        System.out.println("product3.number  = " + product3.number + ", product3.CountNo = " + product3.countNo);

        System.out.println("Arrays1 = " + Arrays.toString(product1.arr));
        System.out.println("Arrays2 = " + Arrays.toString(product2.arr));
        System.out.println("Arrays3 = " + Arrays.toString(product3.arr));


    }

    public static class Product {
        static int number = 0;
        int countNo;

        static int number2 = 0;
        int countNo2;
        int[] arr = new int[10];

        // 정적 초기화 블럭
        static {
            System.out.println("정적 초기화 블럭은 단 한 번만 호출 됨.");
        }

        // 인스턴스 초기화 블럭
        // (정적멤버 사용할 수 있음)
        {
            ++number;
            this.countNo = Product.number;
        }
        // 복잡한 인스턴스 초기화 블럭
        {
            ++number2;
            this.countNo2 = Product.number2;
            for (int i=0; i<arr.length; i++) {
                this.arr[i] = (int)(Math.random()*10)+1;
            }
        }

        public Product() {
            System.out.println("기본 생성자 호출됨");
        }
    }
}

