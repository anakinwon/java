package com.pisien.edu.pro.pro02MultiThread.example13;

/**  <공유객체>
 *  0.5초씩 토글되면서 번갈아가면서 실행됨.
 * */
public class DataBox {

	private String data;

	public synchronized String getData() {
		// 읽어올 데이터가 없다면...
		if(this.data == null) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}

		String returnValue = this.data;
		System.out.println("ConsumerThread 가 읽은 데이터 : " + this.data);
		this.data = null;
		notify();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		return returnValue;
	}

	public synchronized void setData(String data) {
		// Consumer 스레드가 데이터를 소비하지 않았다면...
		if(this.data != null) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}

		this.data = data;
		System.out.println("ProducerThread 가 생성한 데이터 : " + this.data);
		notify();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
}
