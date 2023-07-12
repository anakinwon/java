package com.pisien.edu.medium.medi06;

import java.util.Scanner;

public class Exam06ProductArrayApplication {

    // 클래스영역 변수
    static int productID = 0;
    static int numberOfProduct = 0;
    static Product[] product = new Product[10];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choice = 0;

        while (choice!=3) {
            int type = 0;
            System.out.println("<상품조회 프로젝트>");
            System.out.print("(1).상품추가, (2). 상품조회, (3).끝내기 : ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 :
                    if (numberOfProduct >= product.length) {
                        System.out.println("더 이상 상품추가 불가");
                        break;
                    }
                    System.out.print("\t (1).책, (2). 음악, (3).번역서 : ");
                    type = scanner.nextInt();
                    if(type<1 || type>3) {
                        System.out.println("잘못 입력함.");
                        break;                                
                    }
                    addProduct(type);
                case 2 :
                    for(int i=0; i<numberOfProduct; i++) {
                        product[i].showInfo();
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    break;
            }
        }
        scanner.close();
    }

    private static void addProduct(int type) {
        scanner.nextLine();
        System.out.print("\t\t회사명 : ");
        String maker = scanner.nextLine();
        System.out.print("\t\t상품설명 : ");
        String desc = scanner.nextLine();
        System.out.print("\t\t가격 : ");
        int price = scanner.nextInt();
        scanner.nextLine();

        switch (type) {
            case 1:
                // Book 상속
                System.out.print("\t\t\tISBN 입력 : ");
                int ISBN = scanner.nextInt();
                scanner.nextLine();
                System.out.print("\t\t\t제목 입력 : ");
                String title = scanner.nextLine();
                System.out.print("\t\t\t저자명 입력 : ");
                String author = scanner.nextLine();

                product[numberOfProduct] = new Book( productID++, desc, maker, price
                                                   , ISBN, title, author);
                break;

            case 2:
                System.out.print("\t\t\t앨범제목 입력 : ");
                String albumTitle = scanner.nextLine();
                System.out.print("\t\t\t가수이름 입력 : ");
                String artist = scanner.nextLine();

                product[numberOfProduct] = new Album( productID++, desc, maker, price
                                                    , albumTitle, artist);
                break;

            case 3:
                // Product 상속
                System.out.print("\t\t\tISBN 입력 : ");
                int ISBN2 = scanner.nextInt();
                scanner.nextLine();
                System.out.print("\t\t\t제목 입력 : ");
                String title2 = scanner.nextLine();
                System.out.print("\t\t\t저자명 입력 : ");
                String author2 = scanner.nextLine();

                // Book 상속
                System.out.print("\t\t\t\t번역어 입력 : ");
                String language = scanner.nextLine();

                product[numberOfProduct] = new ConversationBook( productID++, desc, maker, price
                                                    , ISBN2, title2, author2
                                                    , language);
                break;

        }
        numberOfProduct++;

    }

    // 조상 클래스  =====================================================================
    public static class Product {

        private int productID;
        private String description;
        private String maker;
        private int price;

        public Product(int productID, String description, String maker, int price) {
            super();
            this.productID = productID;
            this.description = description;
            this.maker = maker;
            this.price = price;
        }

        public int getProductID() {
            return productID;
        }

        public String getDescription() {
            return description;
        }

        public String getMaker() {
            return maker;
        }

        public int getPrice() {
            return price;
        }

        public void showInfo() {
            System.out.println("상품ID  = " + (this.getProductID())+1);
            System.out.println("상품설명 = " + this.getDescription());
            System.out.println("생산자   = " + this.getMaker());
            System.out.println("제품가격 = " + this.getPrice());
        }
    }
    // 조상 클래스  =====================================================================

    // 자손 클래스  =====================================================================
    public static class Book extends Product {

        private int ISBN;
        private String title;
        private String author;

        public Book(int productID, String description, String maker, int price, int ISBN, String title, String author) {
            super(productID, description, maker, price);
            this.ISBN = ISBN;
            this.title = title;
            this.author = author;
        }

        public int getISBN() {
            return ISBN;
        }
        public String getTitle() {
            return title;
        }
        public String getAuthor() {
            return author;
        }

        @Override
        public void showInfo() {
            super.showInfo();
            System.out.println("ISBN = " + this.getISBN());
            System.out.println("제목  = " + this.getTitle());
            System.out.println("저자  = " + this.getAuthor());
        }
    }

    public static class Album extends Product {

        private String albumTitle;
        private String artist;

        public Album(int productID, String description, String maker, int price, String albumTitle, String artist) {
            super(productID, description, maker, price);
            this.albumTitle = albumTitle;
            this.artist = artist;
        }

        public String getAlbumTitle() {
            return albumTitle;
        }
        public String getArtist() {
            return artist;
        }

        @Override
        public void showInfo() {
            super.showInfo();
            System.out.println("엘범제목 = " + this.getAlbumTitle());
            System.out.println("가수     = " + this.getArtist());
        }
    }
    // 자손 클래스  =====================================================================

    // 증자손 클래스  =====================================================================
    public static class ConversationBook extends Book {

        private String language;

        public ConversationBook(int productID, String description, String maker, int price, int ISBN, String title, String author, String language) {
            super(productID, description, maker, price, ISBN, title, author);
            this.language = language;
        }

        public String getLanguage() {
            return language;
        }

        @Override
        public void showInfo() {
            super.showInfo();
            System.out.println("language = " + language);
        }
    }
}
