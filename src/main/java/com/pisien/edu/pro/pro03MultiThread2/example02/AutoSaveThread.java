package com.pisien.edu.pro.pro03MultiThread2.example02;

public class AutoSaveThread extends Thread {
	private int i = 0;

	public void save() {
		i++;
		System.out.println(i + ". 작업 내용을 저장함");
	}
	@Override
	public void run() {
		//1초 단위로 save()메서드 호출함.
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}

			this.save();
		}
	}
}