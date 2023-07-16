package com.pisien.edu.pro.pro01Generic.example04;

public class PersonEx {

	public static void main(String[] args) {
		//정상적인 코드
		//Person<Integer> p1 = Util.<Integer>changing(new Integer(100));
		Person<Integer> p1 = Util.changing(new Integer(100));
		int value = p1.getT();
		System.out.println("Person 객체가 가지고 있는 값 : " + value);

		Person<String> p2 = Util.<String>changing(new String("홍길동"));
		String str = p2.getT();
		System.out.println("Person 객체가 가지고 있는 값 : " + str);
	}
}
