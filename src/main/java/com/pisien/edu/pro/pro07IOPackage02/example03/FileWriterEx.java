package com.pisien.edu.pro.pro07IOPackage02.example03;

import java.io.File;
import java.io.FileWriter;

public class FileWriterEx {

	public static void main(String[] args) throws Exception {

		File file = new File("C:/Temp/abc.txt");
		//FileWriter fWriter = new FileWriter(file);      //내용이 계속 덮어써진다.
		//생성자에 true라는 매개변수가 붙어있기 때문에, 기존 파일에 append가 된다.
		FileWriter fWriter = new FileWriter(file, true);  //내용이 계속 이어진다.

		fWriter.write("FileWriter클래스로 보낸 내용입니다." + "\r\n");
		fWriter.write("FileWriter 다시 보낸 내용입니다." + "\r\n");

		System.out.println(file.getName() + "이 생성되었습니다.");
		fWriter.flush();
		fWriter.close();
	}
}
