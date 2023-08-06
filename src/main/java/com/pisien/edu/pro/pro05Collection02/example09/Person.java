package com.pisien.edu.pro.pro05Collection02.example09;

public class Person implements Comparable<Person> {

	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	//age값을 기준으로 정렬기준 제시
//	@Override
//	public int compareTo(Person o) {
//		if(this.age < o.age)
//			return -1;
//		else if(this.age == o.age)
//			return 0;
//		else
//			return 1;
//		return this.age - o.age;
//	}
	//name값으로 정렬기준 제시
	@Override
	public int compareTo(Person o) {
//		if(this.name.compareTo(o.name) < 1)
//			return -1;
//		else if(this.name.compareTo(o.name) == 0) 
//			return 0;
//		else
//			return 1;		
		return this.name.compareTo(o.name) - o.name.compareTo(this.name);
	}
}
