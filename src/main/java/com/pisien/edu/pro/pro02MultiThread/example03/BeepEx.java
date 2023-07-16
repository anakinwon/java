package com.pisien.edu.pro.pro02MultiThread.example03;

public class BeepEx {

	public static void main(String[] args) {
		/**
		 *  필드의 다형성
		 * */
		Thread thread = new Beep();
		thread.setName("PolyMorphism-Thread01");
		thread.setPriority(Thread.MAX_PRIORITY);
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}		
	}
}
