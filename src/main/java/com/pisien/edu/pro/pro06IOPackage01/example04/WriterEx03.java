package com.pisien.edu.pro.pro06IOPackage01.example04;

import java.io.FileWriter;
import java.io.Writer;

public class WriterEx03 {

	public static void main(String[] args) throws Exception	{

		Writer writer = new FileWriter("C:/test.txt");
		//문자열 -> 문자배열로 리턴함.
		char[] str = "신은혁이다".toCharArray();

		writer.write(str, 1, 4);
		writer.flush();
		System.out.println("파일이 생성되었습니다.");
		writer.close();
	}
}
