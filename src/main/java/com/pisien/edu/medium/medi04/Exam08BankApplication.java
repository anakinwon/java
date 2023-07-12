package com.pisien.edu.medium.medi04;


import java.util.Scanner;

/**
 *   <Singleton - 싱글톤>
 *       - 하나의 어플리케이션에서 오로지 단, 하나만 생생되는 객체(인스턴스)
 *
 * */
public class Exam08BankApplication {
    private static Account[] accountsArray = new Account[100]; // 계좌 관련 객체 생성 배열 100개 생성
    private static Scanner scanner = new Scanner(System.in);   //scanner

    public static void main(String[] args) {
        // 종료 구분
        boolean run = true;

        // 5. 종료하기 입력 전까지 실행됨.
        while (run) {
            System.out.println("----------------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3. 입금하기 | 4. 출금하기 | 5. 종료하기 ");
            System.out.println("----------------------------------------------------------");
            System.out.print(" 선택 > ");

            int choice = scanner.nextInt();

            if (choice == 1) {
                // 신규 계좌 생성하기
                CreateAccount();
            } else if (choice == 2) {
                // 계좌 목록 보기
                AccountList();
            } else if (choice == 3) {
                DepositBalance();
            } else if (choice == 4) {
                widthdrawBalance();
            } else if (choice == 5) {
                System.out.println("5. 프로그램을 종료합니다.");
                run = false;
            } else {
                System.out.println("입력 오류");
            }

        }
    }

    public static void widthdrawBalance() {
        System.out.println("4. 출금하기를 진행합니다.");

        System.out.print("출금할 계좌번호 입력 : ");
        String ano = scanner.next();
        System.out.print("출금할 출금액 : ");
        int newBalance = scanner.nextInt();

        Account account = findAccount(ano);

        if (account== null) {
            System.out.println("계좌가 존재하지 않습니다.");
            return;
        }
        account.setBalance(account.getBalance() - newBalance);
        System.out.println(account+"계좌에서 정상 출금이 되었습니다.");
    }


    /**  1. 신규계좌 생성하기. */
    public static void CreateAccount() {
        System.out.println("1.계좌생성을 진행합니다.");
        System.out.print("신규계좌번호 입력 : ");
        String ano = scanner.next();
        System.out.print("예금주 입력 : ");
        String name = scanner.next();
        System.out.print("최초 입금액 : ");
        int balance = scanner.nextInt();

        Account account1 = new Account(ano, name, balance);

        for (int i=0; i<accountsArray.length; i++) {
            if(accountsArray[i]==null) {
                // Attatch 하는 작업
                accountsArray[i] = account1;
//                System.out.println("결과 : 계좌 생성이 완료되었습니다.");
//                System.out.println("\t계좌번호 : " + account1.getAno());
//                System.out.println("\t예금주   : " + account1.getOwner());
//                System.out.println("\t입금액   : " + account1.getBalance());
                break;
            }
        }
    }

    /** 2. 계좌목록 확인하기  */
    public static void AccountList() {
        System.out.println("2.계좌목록 화면에 표시합니다.");

        System.out.println("================================");
        System.out.println(" 계좌번호 |   예금주   |   입금액");
        System.out.println("--------------------------------");
        for (int i=0; i< accountsArray.length; i++) {
            Account account = accountsArray[i];
            if (account!= null) {
                System.out.println("\t" + account.getAno() +"\t"+ account.getOwner()+"\t\t"+ account.getBalance());
            }
        }
        System.out.println("================================");
    }


    /** 3. 입금하기  */
    public static void DepositBalance() {
        System.out.println("3.입금하기를 진행합니다.");

        System.out.print("입금할 계좌번호 입력 : ");
        String ano = scanner.next();
        System.out.print("예금액 입금액 : ");
        int newBalance = scanner.nextInt();

        Account account = findAccount(ano);

        if (account== null) {
            System.out.println("계좌가 존재하지 않습니다.");
            return;
        }

        account.setBalance(account.getBalance() + newBalance);
        System.out.println(account+"계좌에 입금이 되었습니다.");
    }

    /** 4. 출금하기  */
    public static Account findAccount(String ano) {
        Account account = null;
        for (int i=0; i<accountsArray.length;i++) {
            if (accountsArray[i] != null) {
                if (accountsArray[i].getAno().equals(ano)) {
                    account = accountsArray[i];
                    break;
                }
            }
        }
        return account;
    }

    /**
     * 계좌번호 Entity
     */
    static class Account {
        private String ano;    // 계좌번호
        private String owner;  // 예금주
        private int balance;   // 잔액

        // 생성자
        public Account(String ano, String owner, int balance) {
            this.ano = ano;
            this.owner = owner;
            this.balance = balance;
        }

        public String getAno() {
            return ano;
        }

        public void setAno(String ano) {
            this.ano = ano;
        }

        public String getOwner() {
            return owner;
        }

        public void setOwner(String owner) {
            this.owner = owner;
        }

        public int getBalance() {
            return balance;
        }

        public void setBalance(int balance) {
            this.balance = balance;
        }
    }
}


