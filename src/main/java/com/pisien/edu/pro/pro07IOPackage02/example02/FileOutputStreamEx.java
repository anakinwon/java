package com.pisien.edu.pro.pro07IOPackage02.example02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamEx {

	public static void main(String[] args) throws Exception {

		//파일을 복사를 하기 위해 경로를 설정
		//String oriFileName = "D:\\java_작업\\Practice_Chap26(IO입출력-Part_2)\\src\\example02\\김연아.jpg";
		//String tarFileName = "C:/Temp/김연아.jpg";
		//String oriFileName = "D:\\java_작업\\Practice_Chap26(IO입출력-Part_2)\\src\\example02\\불멸의이순신80회.mp4";
		//String tarFileName = "C:/Temp/불멸의이순신80회.mp4";
		String oriFileName = "C:\\intelliJ-Project\\GitHub\\edu\\src\\main\\java\\com\\pisien\\edu\\pro\\pro07IOPackage02\\example02\\학점종합.xls";
		String tarFileName = "C:/Temp/학점종합.xls";

		File file = new File(oriFileName);
		FileInputStream fis = new FileInputStream(file);   //파일로부터 데이터를 복사
		FileOutputStream fos = new FileOutputStream(tarFileName); //복사한 파일 출력

		int readByteCount;
		int i = 0;

		//바이트 배열을 크게 잡을수록 복사시간이 빨라진다.
		byte[] bArr = new byte[100]; //약 11초
		//byte[] bArr = new byte[1000]; //약 2.4초
		//byte[] bArr = new byte[10000]; //약 0.5초
		//byte[] bArr = new byte[100000]; //약 0.2초

		long startTime = System.currentTimeMillis(); //현재 시점을 저장한다.

		while((readByteCount = fis.read(bArr)) != -1) {
			//fos.write(bArr);
			fos.write(bArr, 0, readByteCount);  //읽은 바이트 수만큼 출력스트림으로 보내는 것이다.
			i++;
		}
		fos.flush();
		long endTime = System.currentTimeMillis(); //복사의 종료 시점
		System.out.println("총 루핑수 : " + i);
		System.out.println("복사 시간 : " + (endTime - startTime) + "ms");
		System.out.println("복사한 파일의 크기 : " + (file.length()/1024) + "Kbyte");

		fos.close();
		fis.close();
		System.out.println(file.getName() + "파일의 복사가 완료되었습니다.");
	}
}
