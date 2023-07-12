package com.pisien.edu.medium.medi10;


import java.util.Arrays;

/**
 *   <Clone>
 *       - Thin Clone
 *       - 객체를 복제한다.
 *       - java.lang.cloneable
 *
 * */
public class Exam03ObjectCloneThin {

    public static void main(String[] args) {
        Product origin = new Product("1000", "TV", 3000000, new int[] {10,20,30});

        // 얕은 복제를 통한 Clone
        Product cloned = origin.getProduct();

        int[] arr1 = origin.getArr();
        int[] arr2 = cloned.getArr();

        System.out.println("원본 = " + arr1);
        System.out.println("복제 = " + arr2);
        arr1[0] = 777;

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

        public Product(String id, String name, int price, int[] arr) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.arr = arr;
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

        @Override
        public String toString() {
            return  " Product{ 아이디 = " + this.getId() + "\n" +
                    "        , 상품   = " + this.getName() + "\n" +
                    "        , 가격   = " + this.getPrice() + "\n" +
                    "        , 배열   = " + Arrays.toString(this.arr) + "\n" +
                    "        }";
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

    }
}
