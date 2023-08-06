package com.pisien.edu.pro.pro07IOPackage02.example01;

import java.io.File;
import java.io.FileInputStream;

public class FileInputStreamEx {

	public static void main(String[] args) throws Exception {

		//'\'는 이스케이프 문자이기 때문에 아래와 같이 '\\'주든지
		//아니면 '/' 하나로 표식을 해도 무방하다.
		File file = new File("C:\\intelliJ-Project\\GitHub\\edu\\src\\main\\java\\com\\pisien\\edu\\pro\\pro07IOPackage02\\example01\\FileInputStreamEx.java");
		System.out.println("파일의 경로 : " + file.getPath());  //파일의 경로를 얻기
		System.out.println("부모 디렉토리 : " + file.getParent());
		System.out.println("실행 가능한가 : " + file.canExecute());
		System.out.println("읽기 가능한가 : " + file.canRead());
		System.out.println("숨김 파일인가 : " + file.isHidden());
		System.out.println("쓰기나 수정이 가능한가 : " + file.canWrite());
		System.out.println("파일 이름 : " + file.getName());
		System.out.println("파일 크기 : " + file.length());
		System.out.println("URI출력 형태 : " + file.toURI());
		//toURL()는 사용금지 되었다.
		//System.out.println("URL출력 형태 : " + file.toURL());

		//생성자의 매개변수로 File객체를 받고 있다.
		FileInputStream fis = new FileInputStream(file);
		//FileInputStream fis = new FileInputStream("D:\\java_작업\\Practice_Chap26(IO입출력-Part_2)\\src\\example01\\FileInputStreamEx.java");

		int data;
		int i = 0;
		//한 바이트씩 읽기
		while( (data = fis.read()) != -1) {
			//아래를 실행하면 한글이 깨진다.
			//System.out.print((char)data);

			//콘솔 출력(원래 System.out.println()을 사용해도 무방하나,
			//1바이트씩 읽다 보니 한글이 깨지기 때문에 write()써도 괜찮다.
			//write()도 역시 출력스트림이기 때문에 가능한 것이다.
			System.out.write(data);
			i++;
		}
		System.out.println("루핑 수 : " + i);
		fis.close();
	}
}