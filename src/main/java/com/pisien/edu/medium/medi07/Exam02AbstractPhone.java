package com.pisien.edu.medium.medi07;

public class Exam02AbstractPhone {

    public static void main(String[] args) throws InterruptedException {

        // 추상클래스는 인스턴스를 생성할 수 없다.
        //Phone phone = new Phone();
        SmartPhone smartPhone = new SmartPhone(100, "삼성", "아나킨");

        smartPhone.turnOn();
        System.out.println();
        smartPhone.showInfo();
        Thread.sleep(2000);
        System.out.println();
        smartPhone.turnOff();
        smartPhone.internetSearch();

        System.out.println();
        System.out.println("=====================================");
        System.out.println();

        FolderblePhone folderblePhone = new FolderblePhone(200,"애플","파드메");
        folderblePhone.foldOn();
        folderblePhone.turnOn();
        System.out.println();
        folderblePhone.showInfo();
        Thread.sleep(2000);
        System.out.println();
        folderblePhone.turnOff();
        folderblePhone.foldOff();

        Phone[] phone =new Phone[10];

        phone[0] = smartPhone;
        phone[1] = folderblePhone;

        for (Phone phone1 : phone) {
            if (phone1 != null)
                System.out.println("phone1 = " + phone1.getOwner());
        }


    }

    // 부모 추상클래스 만들기  =====================================================
    public abstract static class Phone {

        private int serialNo;
        private String company;
        private String owner;

        public Phone(int serialNo, String company, String owner) {
            super();
            this.serialNo = serialNo;
            this.company = company;
            this.owner = owner;
        }
        public int getSerialNo() {
            return serialNo;
        }
        public String getCompany() {
            return company;
        }
        public String getOwner() {
            return owner;
        }

        // 추상메소드 선언
        // 추상메소드가 1개 이상 존재 시 클래스도 추상클래스로 생성해야 한다.
        public abstract void turnOn();
        public abstract void turnOff();

        public void showInfo() {
            System.out.println(
             "Phone { serialNo=  " + serialNo + "\n" +
             "      , company = '" + company  + "\n" +
             "      , owner   = '" + owner    + "\n" +
             "      }");
        }
    }
    // 부모 추상클래스 만들기  =====================================================



    // 자식 일반 클래스  =========================================================
    public static class SmartPhone extends Phone {
        public SmartPhone(int serialNo, String company, String owner) {
            super(serialNo, company, owner);
        }
        @Override
        public void turnOn() {
            System.out.println("스마트폰이 켜졌습니다.");
        }
        @Override
        public void turnOff() {
            System.out.println("스마트폰이 꺼졌습니다.");
        }
        // 일반 메소드 추가
        public void internetSearch() {
            System.out.println("네이버 검색을 합니다.");
        }
    }
    // 자식 일반 클래스
    public static class FolderblePhone extends Phone {

        public FolderblePhone(int serialNo, String company, String owner) {
            super(serialNo, company, owner);
        }
        @Override
        public void turnOn() {
            System.out.println("폴더블폰이 켜졌습니다.");
        }
        @Override
        public void turnOff() {
            System.out.println("폴더블폰이 꺼졌습니다.");
        }
        // 일반 자체 메소드 추가
        public void foldOn() {
            System.out.println("폴드 기능이 사용됩니다.");
        }
        // 일반 자체 메소드 추가
        public void foldOff() {
            System.out.println("폴드 기능이 꺼졌습니다.");
        }
    }
    // 자식 일반 클래스  =========================================================

}
