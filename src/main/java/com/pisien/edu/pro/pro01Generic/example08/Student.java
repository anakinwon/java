package com.pisien.edu.pro.pro01Generic.example08;
//조상이 제네릭이면 자손도 제네릭타입이어야 한다.
public class Student<T,M,C> extends Person<T,M>{
	
	private C c;

	public C getC() {
		return c;
	}

	public void setC(C c) {
		this.c = c;
	}
}
