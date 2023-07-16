package com.pisien.edu.pro.pro03MultiThread2.example01;

/**
 *  - 데몬 쓰레드 (Daemon Thread)
 *     : 메인 쓰레드 밑에 데몬 쓰레드를 실행시킬 수 있는데,
 *       메인이 종료되면, 데몬도 종료된다.
 * */
public class DaemonEx {

	public static void main(String[] args) {

		AutoSaveThread autoSaveThread = new AutoSaveThread();

		// Daemon 설정(필히, start()호출 전에 설정을 해야한다.)
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		// autoSaveThread.setDaemon(true);

		// 메인쓰레드가 5초 동안 정지하면, Daemon 스레드인 autoSaveThread 가 실행되고,
		// 메인스레드가 종료되면 더 이상 autoSaveThread 실행이 안된다는 것을 알 수가 있다.
		// (종속적 관계)
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {}

		System.out.println("메인쓰레드가 종료됨");
	}
}
