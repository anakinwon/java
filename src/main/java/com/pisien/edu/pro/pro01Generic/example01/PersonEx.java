package com.pisien.edu.pro.pro01Generic.example01;

public class PersonEx {

	public static void main(String[] args) {

		Person person = new Person();

		//업캐스팅 ( String -> Object )
		person.setObject("홍길동");

		//다운 캐스팅( Object -> String )
		String str = (String)person.getObject();

		System.out.println(str);
	}
}
