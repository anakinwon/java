package com.pisien.edu.pro.pro02MultiThread.example04;

import javax.swing.JOptionPane;

public class TimerEx {

	public static void main(String[] args) throws Exception {

		Thread thread = new TimerThread();
		thread.setName("Timer-Thread01");
		thread.setPriority(Thread.MAX_PRIORITY);
		thread.start();

		// 메시지 박스 호출하기
		String input = JOptionPane.showInputDialog("10초 안에 값을 입력하시오.");

		if (input != null) {
			System.out.println("입력 값 : " + input);
			System.exit(0);
		}
		else if (input == null) {
			System.out.println("입력 값 : " + null);
			System.exit(0);
		}
		else {
//			Thread.sleep(1000); //1초를 대기한다.
			System.out.println("입력하지 못했습니다. 평~!");
			System.exit(0);
		}
	}
}