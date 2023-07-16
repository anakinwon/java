package com.pisien.edu.pro.pro02MultiThread.example12;

/**
 *   <스레드의 상태제어> - wait()   : notify() 가 호출되기 전까지 무제한 잠을 자고 있음. Toggle 개념.
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
public class WaitNotifyEx {

	public static void main(String[] args) {

		WorkObject workObject = new WorkObject();

		// 실행코드에 가서 notify()와 wait()를 호출하는데, 동기화 메서드로 되어 있어서
		// 메서드 잠금이 일어나면서 서로 번갈아면서 실행되는 것을 알수가 있다.
		// 토글(Toggle) 기능처럼
		ThreadA threadA = new ThreadA(workObject);
		ThreadB threadB = new ThreadB(workObject);

		threadA.start();
		threadB.start();

		// 스레드간의 협업 Object 클래스의 메서드인 notify(),
		// wait()를 이용하면 된다.
		// 동기화 처리가 된 곳에서 호출하는 것이 바람직하다.

	}

}

