package com.pisien.edu.pro.pro01Generic.example06;

public class CompareEx {

	public static void main(String[] args) {

		int result = Compare.compare(100, 200);
		System.out.println("앞이 작으면 마이너스 반환 = " + result);

		result = Compare.compare(200.00, 200.0);
		System.out.println("두 값이 같으면 0 반환 = " + result);

		//String클래스는 Number클래스하고는 아무런 관계가 없다.
		//Compare.compare("홍길동", "김길동");

		//Number클래스는 Object클래스의 자손이기 때문에 매개변수 타입으로 적합하지 않다.
		//Compare.compare(new Object(), new Object());

		result = Compare.compare(new Integer(100), new Double(75.11));
		System.out.println("앞이 크면 플러스 반환 = " + result);

		//Number는 추상클래스이므로 인스턴스를 생성하지 못한다.
		//result = Compare.compare(new Number(), new Number());

	}

}
