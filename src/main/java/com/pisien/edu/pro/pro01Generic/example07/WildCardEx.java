package com.pisien.edu.pro.pro01Generic.example07;

import java.util.Arrays;

public class WildCardEx {
	//?는 어떠한 객체도 다 받겠다.
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " 수강생 : " +
				Arrays.toString(course.getStudents()));
	}
	//Student이거나 Student를 상속받는 클래스(상위타입제한)
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " 수강생 : " +
				Arrays.toString(course.getStudents()));
	}
	//Worker클래스이거나 상위클래스들만 들어올수 있다.(하위타입제한)
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " 수강생 : " +
				Arrays.toString(course.getStudents()));
	}

	public static void main(String[] args) {

		//registerCourse(new Course<Person>("일반인 과정", 5));
		//registerCourse(new Course<Student>("학생 과정", 10));
		//registerCourse(new Course<Worker>("직장인 과정", 8));
		//registerCourse(new Course<HighStudent>("고등학생 과정", 7));

		//registerCourseStudent(new Course<Person>("일반인 과정", 5));
		//registerCourseStudent(new Course<Student>("학생 과정", 10));
		//registerCourseStudent(new Course<Worker>("직장인 과정", 8));
		//registerCourseStudent(new Course<HighStudent>("고등학생 과정", 7));

		//registerCourseWorker(new Course<Person>("일반인 과정", 5));
		//registerCourseWorker(new Course<Student>("학생 과정", 10));
		//registerCourseWorker(new Course<Worker>("직장인 과정", 8));
		//registerCourseWorker(new Course<HighStudent>("고등학생 과정", 7));

		//직접 Course생성을 해서 확인하는 과정
		Course<Person> perCourse = new Course<Person>("일반인 과정", 3);
		perCourse.add(new Person("일반인1"));
		perCourse.add(new Person("일반인2"));
		perCourse.add(new Person("일반인3"));
		//perCourse.add(new Person("고등학생"));

		registerCourse(perCourse);
		//registerCourseStudent(perCourse);  //조상타입
		registerCourseWorker(perCourse);
		System.out.println();

		Course<Worker> wCourse = new Course<>("직장인 과정", 3);
		wCourse.add(new Worker("김대리"));
		wCourse.add(new Worker("박과장"));
		wCourse.add(new Worker("김차장"));

		registerCourse(wCourse);
		//registerCourseStudent(wCourse);  //아무런 관계가 없는 클래스
		registerCourseWorker(wCourse);
		System.out.println();


		Course<Student> sCourse = new Course<>("학생 과정", 3);
		sCourse.add(new Student("홍길동"));
		sCourse.add(new Student("김연아"));
		sCourse.add(new Student("최창식"));

		registerCourse(sCourse);
		registerCourseStudent(sCourse);
		//registerCourseWorker(sCourse); //아무런 관계가 없는 클래스
		System.out.println();
	}
}
