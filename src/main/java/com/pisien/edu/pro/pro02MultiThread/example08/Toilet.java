package com.pisien.edu.pro.pro02MultiThread.example08;

//공유 객체
public class Toilet {

	//플래그 변수
	//private boolean seat;

	// synchronized 사용 시 메서드 잠금이 일어난다.
	public synchronized void use() throws Exception {
	//public void use() throws Exception {

		String name = Thread.currentThread().getName();
		//누군가가 화장실에 들어왔을때
		//if(this.seat == false) {
		//this.seat = true;
		System.out.println(name + " 화장실에 입장하였습니다.");
		Thread.sleep(5000);
		System.out.println(name + " 말 : 아 시원하다~~!");

		//this.seat = false;
		System.out.println(name + " 화장실 사용을 마쳤습니다.");
		System.out.println();
		Thread.sleep(1000);
//		}
//		else {
//			System.out.println(name + "가/이 화장실 사용중입니다. 기다리세요!");
//		}
	}
	//비동기화 메서드
	public void noke() {
		System.out.println(Thread.currentThread().getName() + " 똑똑!");
	}
}
