package com.pisien.edu.pro.pro02MultiThread.example13;

/**
 *   <스레드의 상태제어> - notify() : wait() 하고 있는 쓰레드를 깨워서 일을 시킴.
 *
 *       - 실행중에 있는 쓰레드의 상태를 변경할 수 있다.
 *     * - sleep()     : 주어진 시간 동안 일시 정지  (단위 : 밀리세컨드, 1/1,000초)
 *       - yield()     : 다른 쓰레드에게 실행 양보.
 *       - join()      : 다른 쓰레드의 종료를 기다림.
 *       <쓰레드 간의 협업 - 동기화 쓰레드에서만 사용 가능>
 *        * - wait()   : notify() 가 호출되기 전까지 무제한 잠을 자고 있음. Toggle 개념.
 *          - notify() : wait() 하고 있는 쓰레드를 깨워서 일을 시킴.
 *          - notifyAll()
 *     * - interrupt() : 일시정지 상태를 만나면, InterruptException 에러를 발생시킴.
 *       - Deprecated 됨 : resume() / suspend() / - stop()
 *
 * */
public class WatiNotifyEx {

	public static void main(String[] args) {
		
		DataBox dataBox = new DataBox();
		
		ProducerThread producerThread = new ProducerThread(dataBox);
		ConsumerThread consumerThread = new ConsumerThread(dataBox);
		
		producerThread.start();
		consumerThread.start();
	}
}
