package com.pisien.edu.pro.pro06IOPackage01.example04;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class FileCopy_ReaderWriter {

	public static void main(String[] args) throws Exception {

		Reader reader = new FileReader("C:/source.txt");
		Writer writer = new FileWriter("C:/source_복사본.txt");

		String str = "";
		int readBytes;
		char[] cArr = new char[2];
		int i = 0;
		while( (readBytes = reader.read(cArr)) != -1) {
			i++;
			//readBytes =reader.read(cArr);
			String str1 = new String(cArr);
			str += str1;
			System.out.println("루핑수 : " + i);
			System.out.println("읽은 바이트 수 : " + readBytes);
		}
		writer.write(str);
		writer.flush();
		System.out.println("C드라이브에 source_복사본.txt파일이 생성되었습니다.");

		writer.close();
		reader.close();
	}
}