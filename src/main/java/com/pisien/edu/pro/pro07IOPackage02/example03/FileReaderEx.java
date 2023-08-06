package com.pisien.edu.pro.pro07IOPackage02.example03;

import java.io.File;
import java.io.FileReader;

public class FileReaderEx {

	public static void main(String[] args) throws Exception {

		File filePath = new File("D:\\java_작업\\Practice_Chap26(IO입출력-Part_2)\\src\\example03\\files\\여성가족부 담화문.txt");
		//XXXReader, XXXWriter붙는 클래스들은 문자특화기반 클래스이다.
		//동영상, 사진, 오디오 등 이진파일을 읽을 수 없음을 기억하자.
		FileReader fiReader = new FileReader(filePath);
		//System.out.println("파일크기 : " + filePath.length());

		int readCharNO;
		//char[]의 사이즈가 크면 클수록 역시 많은 데이터 한번에 읽기 때문에
		//속도가 향상된다.
		char[] cArr = new char[100];  //200바이트 할당
		int i = 0;

		while((readCharNO = fiReader.read(cArr)) != -1) {

			String str = new String(cArr, 0, readCharNO);
			System.out.print(str);
			i++;
		}
		//System.out.println();
		System.out.write(13);;
		System.out.println("루핑 수 : " + i);

		fiReader.close();
	}
}
