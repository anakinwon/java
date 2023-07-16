package com.pisien.edu.pro.pro02MultiThread.example02;

import java.awt.*;

/**
 *   멀티 쓰레드 예제...
 *
 * */

public class BeepPrintEx {
	//main()는 JVM이 실행한다.
	public static void main(String[] args) {

		/**
		 * 멀티 쓰레드 방법 1
		 *     - 방법 1 --> 구현객체 대입
		 *     - 직접 생성하는 멀티스레드 방법 3가지
		 *
		 * */
		Runnable runnable = new Beep();  //구현객체 대입
		Thread thread = new Thread(runnable);
		thread.setName("any-Thread01");
		thread.setPriority(Thread.MAX_PRIORITY);
		thread.start();

//		Runnable runnable2 = new Beep();  //구현객체 대입
//		Thread thread2 = new Thread(runnable2);
//		thread2.setName("any-Thread02");
//		thread2.setPriority(Thread.NORM_PRIORITY);
//		thread2.start();
//
//		Runnable runnable3 = new Beep();  //구현객체 대입
//		Thread thread3 = new Thread(runnable3);
//		thread3.setPriority(Thread.MIN_PRIORITY);
//		thread3.setName("any-Thread03");
//		thread3.start();

		/**
		 * 멀티 쓰레드 방법 1
		 *     - 방법2 --> 익명구현객체
		 * */
		Thread thread4 = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					System.out.println("비프음 실행하는 스레드명 : " + Thread.currentThread().getName());
					toolkit.beep();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {}
				}
			}
		});
		thread4.setName("any-Thread04");
		thread.setPriority(Thread.MIN_PRIORITY);
		thread4.start();

		/**
		 * 멀티 쓰레드 방법 1
		 *     - 방법3 --> 람다식(함수적 인터페이스) JDK1.8 코드 절약, 가독성
		 * */
		Thread thread5 = new Thread( ()-> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i=0; i<5; i++) {
				System.out.println("비프음 실행하는 스레드명 : " + Thread.currentThread().getName());
				toolkit.beep();

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {}
			}
		});
		thread5.setName("any-Thread05");
		thread5.setPriority(Thread.NORM_PRIORITY);
		thread5.start();

		for(int i=0; i<5; i++) {
			System.out.println("for문을 실행하는 스레드1 이름 : " + Thread.currentThread().getName());
			System.out.println("삐웅~");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
		//스레드는 한번 start()를 다 실행하고 나면, 재실행이 안된다.
		//재실행을 하고자 한다면 아래와 같이 인스턴스를 한개 더 만들어야 한다.(중요)
//		thread = new Thread(runnable);
//		thread.start();
	}
}
