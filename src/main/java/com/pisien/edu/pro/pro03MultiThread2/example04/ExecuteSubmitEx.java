package com.pisien.edu.pro.pro03MultiThread2.example04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 *    스레드 풀 (Thread Pool)
 *         - 작업 처리에 사용되는 스레드들 "제한된 개수" 만큼 미리 생성
 *           "작업 큐"에 들어오는 순서대로 하나씩 "쓰레드가 처리"한다.
 *         - ExecutorService : 쓰레드 풀 생성하기
 *
 * */
public class ExecuteSubmitEx {

	public static void main(String[] args) {
		//최대 2개의 스레드를 가지는 스레드풀 생성
		ExecutorService excutorService = Executors.newFixedThreadPool(2);

		for(int i=0; i<20; i++) {
			//20개의 작업객체 생성
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					//newFixedThreadPool과 newCachedThreadPool은 내부적으로 ThreadPoolExecutor로
					//만들어 졌기 때문에 타입변환으로 ThreadPoolExecutor객체를 얻을수 있다.
					ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor)excutorService;

					//현재 스레드풀에 있는 스레드 개수를 리턴하여 얻을수 있다.
					int poolSize = threadPoolExecutor.getPoolSize();

					//작업실행하는 스레드명을 얻는다.
					String threadName = Thread.currentThread().getName();
					System.out.println("[총 스레드개수: " + poolSize + "] 작업스레드 이름 : " + threadName);

					//일부러 예외를 발생시켜서 execute()와 submit()의 차이를 보자.
					Integer.parseInt("삼");
				}
			};

			//작업큐에 runnable객체를 넣는 행위, execute()는 작업처리 도중에 예외가 발생하면,
			//해당 스레드를 스레드풀에서 제거하고 새로운 스레드 생성된다.submit()는 예외가 발생하더라도,
			//해당 스레드를 스레드풀에서 제거하지 않고 재사용을 함을 알 수 있다.하여, submit()를 사용하
			//는 것이 좋다.
			//excutorService.execute(runnable);
			excutorService.submit(runnable);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {}
		}
		excutorService.shutdown();
	}
}

