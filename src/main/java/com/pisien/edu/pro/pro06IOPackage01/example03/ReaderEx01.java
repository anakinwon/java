package com.pisien.edu.pro.pro06IOPackage01.example03;

import java.io.FileReader;
import java.io.Reader;

public class ReaderEx01 {

	public static void main(String[] args) throws Exception {
		//Reader클래스는 문자특화 클래스로써 하위클래스인 FileReader를 생성해서 대입.
		Reader reader = new FileReader("C:/test.txt");
		int readData;

		//readData는 int값으로 끝 2바이트(문자 2바이트이니깐)에 저장된다.
		while((readData = reader.read()) != -1) {
			//문자출력(바이트정보를 강제 캐스팅)
			System.out.println("읽은 문자 : " + (char)readData);
			//영문자는 아스키코드가 출력이 되고, 한글은 유니코드가 출력.
			System.out.println("읽은 문자 : " + readData);
		}

//		while(true) {
//			readData = reader.read();
//			if(readData == -1)
//				break;
//			//문자출력(바이트정보를 강제 캐스팅)
//			System.out.println("읽은 문자 : " + (char)readData);
//			//영문자는 아스키코드가 출력이 되고, 한글은 유니코드가 출력.
//			System.out.println("읽은 문자 : " + readData);
//		}	
		reader.close();
	}
}
