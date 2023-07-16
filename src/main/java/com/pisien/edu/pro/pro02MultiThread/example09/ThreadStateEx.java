package com.pisien.edu.pro.pro02MultiThread.example09;

/**
 *  <스레드의 라이프사이클을 알아보는 샘플>
 *     - 쓰레드 상태 확인하기.
 * */
public class ThreadStateEx {

	public static void main(String[] args) {
		//스레드의 라이프사이클을 알아보는 내용
		Thread thread = new StatePrinteThread(new TargetThread());
		thread.start();
	}
}
