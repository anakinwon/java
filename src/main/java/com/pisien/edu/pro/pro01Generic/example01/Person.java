package com.pisien.edu.pro.pro01Generic.example01;


/**
 *  <비 제너릭 코드의 예제>
 *
 * */
public class Person {

	private Object object;

	public Person() {
	}
	// 리턴타입이 Object 이고, 매개변수가 Object 이다.
	// 모든 클래스를 다 매개변수, 리턴타입으로 하겠다. => (다형성)
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
}

