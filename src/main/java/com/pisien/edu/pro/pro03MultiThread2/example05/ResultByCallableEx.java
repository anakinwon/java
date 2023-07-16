package com.pisien.edu.pro.pro03MultiThread2.example05;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByCallableEx {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors()
		);

		//Callable익명 구현 객체를 생성(작업객체)  --> 리턴값이 <T>타입으로 존재하므로 리턴타입도 역시 T타입이여야 한다.
		System.out.println("[작업처리요청]");
		Callable<Integer> callable = new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {

				int sum = 0;
				for(int i=1; i<=100000; i++) {
					sum += i;
				}

				return sum;
			}
		};
		//작업큐에 작업객체를 넣는다.
		//Future제네릭 값도 역시 T타입으로 통일 해줘야 한다.
		System.out.println("블로킹 시작 : " + System.currentTimeMillis());
		Future<Integer> future = executorService.submit(callable);
		try {
			int value = future.get();
			System.out.println("블로킹 끝 : " + System.currentTimeMillis());
			System.out.println("[작업처리 결과] : " + value);
			System.out.println("[작업처리 완료]");

		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		executorService.shutdown();
	}
}
