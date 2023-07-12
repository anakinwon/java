package com.pisien.edu.medium.medi06;

public class Exam01ModifierPhone {

    public static void main(String[] args) {
        Phone phone = new Phone("갤럭시노트20","다크블루","삼성", 1200000);
        System.out.println("phone = " + phone.toString());

        //String model = phone.model;  // private 는 절대 접근 금지
        String color = phone.color;
        String company = phone.company;
        int    price = phone.price;
    }

    public static class Phone {
        // private 으로 생성되어. 외부에서 직접 접근 불가
        private   String model;
                  String color;
        protected String company;
        public    int    price;

        // 매개변수가 있는 생성자
        public Phone(String model, String color, String company, int price) {
            this.model = model;
            this.color = color;
            this.company = company;
            this.price = price;
        }

        //Getter 제공
        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

        public String getCompany() {
            return company;
        }

        public int getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return  "Phone {" + "\n" +
                    "        모델  = '" + model   + "\n" +
                    "      , 컬러  = '" + color   + "\n" +
                    "      , 회사  = '" + company + "\n" +
                    "      , 가격  = '" + price   + "\n" +
                    "      }";
        }
    }
}
