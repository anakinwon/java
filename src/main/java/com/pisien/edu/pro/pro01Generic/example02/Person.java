package com.pisien.edu.pro.pro01Generic.example02;

/**
 *  <제너릭 코드의 예제>
 *    - Person이라는 클래스를 제네릭 타입으로 설계함.
 * */
public class Person<T> {

	/**
	 *  T라는 타입이 아직 정해지지 않았다.
	 *    - T는 개발코드에서 정해진다.
	 *    - 따라서, static 은 선언할 수가 없다.
	 * */
	// private static T t;
	private T t;

	public Person() {
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

}
