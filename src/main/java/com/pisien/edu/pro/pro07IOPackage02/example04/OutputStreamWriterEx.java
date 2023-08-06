package com.pisien.edu.pro.pro07IOPackage02.example04;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterEx {

	public static void main(String[] args) throws Exception {
		//주 스트림을 생성함.
		FileOutputStream fStream = new FileOutputStream("C:/Test/writer.txt");

		//보조스트림 연결함.
		Writer writer = new OutputStreamWriter(fStream);

		//저장할 데이터
		String data = "문자데이터를 보조출력스트림으로 보내어 바이트 기반으로 변환되어 저장됨";
		writer.write(data);  //보조스트림 즉, 문자기반스트림인 OutputStreamWriter로 data를
		//보내어 바이트 기반으로 변환 시켜주는 역할을 함.
		writer.flush();
		fStream.close();
		System.out.println("파일이 저장되었습니다.");
	}
}
