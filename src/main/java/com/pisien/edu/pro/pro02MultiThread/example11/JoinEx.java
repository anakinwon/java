package com.pisien.edu.pro.pro02MultiThread.example11;

/**
 *   <스레드의 상태제어> - join()      : 다른 쓰레드의 종료를 기다림.
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
public class JoinEx {

	public static void main(String[] args) {

		double avg = 0.0;
		long total = 0L;
		SumThread sumThread = new SumThread();
		sumThread.start();

		try {
			//메인 스레드는 SumThread 가 끝날때까지 기다린다.
			sumThread.join();
		} catch (InterruptedException e) {
		}

		total = sumThread.getSum();
		avg = total / 10000.0;

		System.out.println("1~10000까지의 합 : " + total);
		System.out.println("1~10000까지의 합의 평균 : " + avg);
	}
}
