package com.pisien.edu.medium.medi05;

/**
 *   <InheritanceShape - 상속예제>
 *       - 오버로딩 Overloading : 새로운 메소드를 만드는 것. (new 의 개념)
 *       - 오버라이딩 Overriding : 선언부가 같고 구현부만 다른 것. (modify, change 의 개념)
 *
 * */
public class Exam06PlayCardGame {

    public static void main(String[] args) {

        Deck deck = new Deck();
        Card card = deck.pick(0);
        System.out.print("카드 섞기전에 맨 위의 카드 : ");
        System.out.println(card.toString());

        Card lastCard = deck.pick(51);
        System.out.print("카드 섞기전에 맨 마지막 카드 : ");
        System.out.println(lastCard.toString());

        // 카드 무작위로 섞기...
        deck.shuffle();

        // 맨 밑에 있는 카드 추출해 보기.
        Card afterCard = deck.pick(13);
        System.out.print("섞은 후 맨 밑에 있는 카드 추출 : ");
        System.out.println(afterCard.toString());

    }

    public static class Card {

        static final int KIND_MAX = 4;  // 무늬별 카드 수
        static final int NUM_MAX = 13;  // 총 카드 수

        // 무늬를 상수로 지정
        static final int SPADE   = 4;  // 스페이드
        static final int DIAMOND = 4;  // 다이아몬드
        static final int HEART   = 4;  // 하트
        static final int CLOVER  = 4;  // 클로버

        int kind;
        int number;

        public Card(int kind, int number) {
            super();
            this.kind = kind;
            this.number = number;
        }

        @Override
        public String toString() {

            String kind   = "";
            String number = "";

            switch(this.kind) {
                case 1 :
                    kind = "1.클로버";
                    break;
                case 2 :
                    kind = "2.하트";
                    break;
                case 3 :
                    kind = "3.다이아몬드";
                    break;
                case 4 :
                    kind = "4.스페이드";
                    break;
            }

            switch(this.number) {
                case 13 :
                    number = "K";
                    break;
                case 12 :
                    number = "Q";
                    break;
                case 11 :
                    number = "J";
                    break;
                default:
                    number = this.number + "";
            }
            return "Card { kind = " + kind + ", number = " + number +" }";
        }
    }

    public static class Deck {
        final int CARD_NUM = 52;   // 카드의 총 개수

        // 카드 52장의 객체 배열 생성.
        Card[] card = new Card[CARD_NUM];

        int i = 0;

        // 기본 생성자.
        public Deck() {
            super(); // 써도 되고 안써도 됨.
            System.out.println("Deck 의 기본생성자가 호출됨.");
        }

        // 인스턴스 초기화 블럭
        {
            // 52번 돌면서 카드를 초기화
            for (int k = Card.KIND_MAX; k>0; k--) {
                for (int n = 1; n< Card.NUM_MAX+1; n++) {
                    card[i++] = new Card(k,n);
                }
            }
            // 제대로 초기화가 이루어졌는지 내용을 직접 출력해 봄
            for(int j=0; j< card.length; j++) {
                System.out.printf("Card[%d]의 무늬 : %d, Card[%d]의 숫자 : %d"
                                 , j, card[j].kind
                                 , j, card[j].number);
                System.out.println();
            }
        }

        // 지정한 위치 (index)에 있는 카드 하나를 선택
        public Card pick(int index) {
            if (0 <= index && index < CARD_NUM) {
                return card[index];
            }
            else {
                return pick();
            }
        }

        // Deck 에서 카드 하나를 임의로 선택
        public Card pick() {
            int index = (int)(Math.random()*CARD_NUM);
            System.out.println("임의로 뽑은 카드");
            System.out.printf("%d ", index);

            return pick(index);
        }

        // 카드를 섞는 메소드
        public void shuffle() {
            for(int n=0; n<1000;n++) {
                int i = (int)(Math.random()*CARD_NUM);
                Card temp = card[0];
                card[0] = card[i];
                card[i] = temp;
            }

            System.out.println();
            System.out.println("카드를 섞은 후 결과");

            for(int j=0; j< card.length;j++) {
                System.out.printf("Card[%d]의 무늬 : %d, Card[%d]의 숫자 : %d"
                        , j, card[j].kind
                        , j, card[j].number);
                System.out.println();
            }

        }

    }
}

