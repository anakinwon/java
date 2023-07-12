package com.pisien.edu.medium.medi07;


/**
 *   <추상클래스>
 *       - 추상메소드를 하나 이상 가지고 있는 클래스
 *       - 추상메소드 : 선언부만 존재하고, 구현부가 없는 클래스
 *       - 추상클래스는 인스턴스를절대로 생성할 수가 없다.
 *
 * */
public class Exam01AbstractSender {

    public static void main(String[] args) {
        // 추상클래스이니 절대 인스턴스를 생성할 수 없다.
        //ContentSender contentSender = new ContentSender();

        // 필드의 다형성으로 만들어야 함, 단, 근본은 벗어나지 못함
        ContentSender contentSender1 = new KakaoSender("카카오","아나킨","카카오 메시지 전송 테스트");
        contentSender1.sendMessage("파드메");

        System.out.println();

        // 필드의 다형성으로 만들어야 함, 단, 근본은 벗어나지 못함
        ContentSender contentSender2 = new SmsSender("SMS전송테스트","파드메","SMS로 메시지 전송합니다.");
        contentSender2.sendMessage("아나킨");
    }


    /** 조상 클래스 **********************************************  */
    public abstract static class ContentSender {
        private String title;
        private String name;

        public ContentSender(String title, String name) {
            super();
            this.title = title;
            this.name = name;
        }

        public String getTitle() {
            return title;
        }
        public String getName() {
            return name;
        }

        // 추상메소드는 반드시 접근제어자를 public 으로 생성해야 한다.
        // 추상메소드가 1개 이상 존재하면 해당 클래스도 반드시 추상클래스로 만들어 줘야 한다.
        public abstract void sendMessage(String content);
    }
    /** 조상 클래스 **********************************************  */


    /** 자손 클래스 **********************************************  */
    public static class KakaoSender extends ContentSender {
        private String content;

        public KakaoSender(String title, String name, String content) {
            super(title, name);
            this.content = content;
        }
        public String getContent() {
            return this.content;
        }
        @Override
        public void sendMessage(String recipient) {
            System.out.println("제목 = " + this.getTitle());
            System.out.println("내용 = " + this.getContent());
            System.out.println("송신인 = " + this.getName());
            System.out.println("수신인 = " + recipient);
        }

    }
    public static class SmsSender extends ContentSender {
        private String content;

        public SmsSender(String title, String name, String content) {
            super(title, name);
            this.content = content;
        }
        public String getContent() {
            return content;
        }
        @Override
        public void sendMessage(String recipient) {
            System.out.println("제목 = " + this.getTitle());
            System.out.println("내용 = " + this.getContent());
            System.out.println("송신인 = " + this.getName());
            System.out.println("수신인 = " + recipient);
        }
    }
    /** 자손 클래스 **********************************************  */

}
