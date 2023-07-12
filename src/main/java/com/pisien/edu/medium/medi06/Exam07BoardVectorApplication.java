package com.pisien.edu.medium.medi06;

import java.util.Vector;


/**
 *  <Vector>
 *      - Vector 는 배열처럼 사용되지만,
 *      - 배열은 사이즈가 제한적으로 사용되지만,
 *      - Vector 는 기본 사이즈 10부터 시작해서,
 *      - 자동 증가되고, 자동 감소되는 장점을 가지고 있다.
 *
 * */
public class Exam07BoardVectorApplication {

    public static void main(String[] args) {
        
        Vector vector = new Vector();
        System.out.println("<저장 전 Vector 확인>");
        System.out.println("저장 용량  = " + vector.capacity());  // 벡터 용량
        System.out.println("저장된 크기 = " + vector.size());      // 저장된 객체 수

        for (int i=0; i<20; i++) {
            vector.add(new Board("제목"+i, "내용"+i, "작성자"+i));
        }

        System.out.println("<저장 후 Vector 확인>");
        System.out.println();
        System.out.println("저장 용량  = " + vector.capacity());  // 벡터 용량
        System.out.println("저장된 크기 = " + vector.size());      // 저장된 객체 수

        vector.remove(1);
        vector.remove(3);
        vector.remove(6);
        System.out.println("<저장 후 Vector 확인>");
        System.out.println();
        System.out.println("저장 용량  = " + vector.capacity());  // 벡터 용량
        System.out.println("저장된 크기 = " + vector.size());      // 저장된 객체 수

        for(int j=0; j< vector.size(); j++) {
            if(vector.get(j) instanceof Board) {
                Board board = (Board) vector.get(j);
                board.show();
                System.out.println();
            }
        }
    }

    public static class Board {

        private String subject;
        private String content;
        private String writer;

        public Board(String subject, String content, String writer) {
            super();
            this.subject = subject;
            this.content = content;
            this.writer = writer;
        }

        public String getSubject() {
            return subject;
        }

        public String getContent() {
            return content;
        }

        public String getWriter() {
            return writer;
        }

        public void show() {
            System.out.println("제목  = " + this.subject);
            System.out.println("내용  = " + this.content);
            System.out.println("작성자 = " + this.writer);
        }

    }
}
