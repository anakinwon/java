package com.pisien.edu.pro.pro06IOPackage01.example04;

import java.io.FileWriter;
import java.io.Writer;

public class WriterEx02 {

	public static void main(String[] args) throws Exception {

		Writer writer = new FileWriter("C:/test.txt");
		char[] str = "신은혁".toCharArray();

		//write()의 매개변수 타입이 문자배열이다.이전에 학습했던 write(int b)보다
		//훨씬 효율적이다.
		writer.write(str);
		writer.flush();
		System.out.println("파일이 생성되었습니다.");
		writer.close();
	}
}
