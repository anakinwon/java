package com.pisien.edu.pro.pro02MultiThread.example08;

public class ToileEx {

	public static void main(String[] args) {

		Toilet toilet = new Toilet();

		Thread thread1 = new UsingThread(toilet, "1. 아버지가");
		Thread thread2 = new UsingThread(toilet, "2. 어머니가");
		Thread thread3 = new UsingThread(toilet, "3. 아들이");
		Thread thread4 = new UsingThread(toilet, "4. 딸이");

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}
}