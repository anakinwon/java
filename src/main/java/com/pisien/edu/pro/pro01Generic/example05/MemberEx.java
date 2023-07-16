package com.pisien.edu.pro.pro01Generic.example05;

public class MemberEx {

	// 제네릭 클래스인 Member 를 리턴함.
	// 인스턴스 메서드 MemberEx 클래스
	public <T> Member<T> boxing(T t) {
		Member<T> member = new Member<T>();
		member.setT(t);
		return member;
	}

	// 정적 메서드 - MemberEx 클래스
	public static<T> Member<T> wrapping(T t) {
		Member<T> member = new Member<T>();
		member.setT(t);
		return member;
	}

	public static void main(String[] args) {

		MemberEx memberEx = new MemberEx();
		Member<Integer> member = memberEx.<Integer>boxing(new Integer(100));
		System.out.println("boxing Member클래스의 값 : " + member.getT());

		//Member<String> member2 = MemberEx.<String>wrapping("홍길동");
		Member<String> member2 = wrapping("홍길동");
		System.out.println("wrapping Member클래스의 값 : " + member2.getT());
	}
}