package com.pisien.edu.pro.pro01Generic.example02;


public class Tv<E> {
	private E e;

	// 기본 생성자
	public Tv() {
	}

	// Getter
	public E getE() {
		return e;
	}

	// Setter
	public void setE(E e) {
		this.e = e;
	}
}
