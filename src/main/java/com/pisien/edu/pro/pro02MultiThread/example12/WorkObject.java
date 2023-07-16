package com.pisien.edu.pro.pro02MultiThread.example12;

/**
 *  0.5초씩 토글되면서 번갈아가면서 실행됨.
 * */
public class WorkObject {

	public synchronized void methodA() {
		System.out.println("ThreadA의 methodA()실행");

		//wait()에 의해 BLOCKED된 스레드를 실행대기 상태로 깨운다.
		notify();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}

		try {
			//영원히 잔다.다른스레드에서 notify(),notifyAll()호출하면 깨어남
			wait();
		} catch (InterruptedException e) {}
	}

	public synchronized void methodB() {
		System.out.println("ThreadB의 methodB()실행");

		//wait()에 의해 BLOCKED된 스레드를 실행대기 상태로 깨운다.
		notify();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}

		try {
			//영원히 잔다.다른스레드에서 notify(),notifyAll()호출하면 깨어남
			wait();
		} catch (InterruptedException e) {}
	}
}
