package com.pisien.edu.medium.medi07;

public class Exam04InterfaceRemoteControl {


    public static void main(String[] args) {
        // <필드의 다형성>
        // 인터페이스도 조상의 일종이다.
        // 인터페이스도 필드의 다형성이 가능하다.
        RemoteControl remoteControl = new Television();
        remoteControl.turnOn();
        remoteControl.setVolume(15);
        remoteControl.setVolume(-100);
        remoteControl.turnOff();

        System.out.println();

        RemoteControl remoteControl2 = new Audio();
        remoteControl2.turnOn();
        remoteControl2.setVolume(8);
        remoteControl2.setVolume(2);
        remoteControl2.turnOff();

    }

    // 인터페이스 ===============================================================
    public static interface RemoteControl {
        // static final 은 생략가능
        // 목적 : 메타 데이터 제공
        static final int MAX_VOLUME = 10;
        static final int MIN_VOLUME =  0;

        // 추상메소드 3개 선언
        // 목적 : 표준 메소드 제공
        // public abstract 생략 가능
        public abstract void turnOn();
        public abstract void turnOff();
        public abstract void setVolume(int volume);
    }
    // 인터페이스 ===============================================================

    // [텔레비전 객체] ==========================================================
    public static class Television implements RemoteControl {
        private int volume;
        @Override
        public void turnOn() {
            System.out.println("텔레비전을 켭니다.");
        }
        @Override
        public void turnOff() {
            System.out.println("텔레비전을 끕니다.");
        }
        @Override
        public void setVolume(int volume) {
            int maxVol = RemoteControl.MAX_VOLUME;
            int minVol = RemoteControl.MIN_VOLUME;

            if (volume > maxVol) {
                System.out.println("텔레비전 최대 볼륨은 10입니다.");
                this.volume = maxVol;
            }
            else if (volume < minVol){
                System.out.println("텔레비전 최소 볼륨은 0입니다.");
                this.volume = maxVol;
            }
            else {
                this.volume = volume;
            }

            System.out.println("텔레비전 현재 볼륨 =  " + this.volume);
        }
    }

    // [오디오 객체] ============================================================
    public static class Audio implements RemoteControl {
        private int volume;

        @Override
        public void turnOn() {
            System.out.println("오디오를 켭니다.");
        }
        @Override
        public void turnOff() {
            System.out.println("오디오를 끕니다.");
        }
        @Override
        public void setVolume(int volume) {
            int maxVol = RemoteControl.MAX_VOLUME;
            int minVol = RemoteControl.MIN_VOLUME;

            if (volume > maxVol) {
                System.out.println("오디오 최대 볼륨은 10입니다.");
                this.volume = maxVol;
            }
            else if (volume < minVol){
                System.out.println("오디오 최소 볼륨은 0입니다.");
                this.volume = maxVol;
            }
            else {
                this.volume = volume;
            }

            System.out.println("오디오 현재 볼륨 =  " + this.volume);
        }
    }
    // ========================================================================

}
