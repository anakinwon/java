package com.pisien.edu.pro.pro05Collection02.example04;

import java.util.Objects;

public class Student {

	private int sno;   //학번
	private String name;  //이름

	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	public int getSno() {
		return sno;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.sno, this.name);
	}
//	하위 호환성을 위주로 한다면 이 방법을 선택하자.
//	public int hashCode() {
//		return this.sno + this.name.hashCode();
//	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			return this.sno == student.sno && this.name.equals(student.name);
		}
		return false;
	}
}