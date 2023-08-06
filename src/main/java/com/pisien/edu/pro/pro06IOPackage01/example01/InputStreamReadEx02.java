package com.pisien.edu.pro.pro06IOPackage01.example01;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamReadEx02 {

	public static void main(String[] args) throws Exception {

		InputStream iStream = new FileInputStream("C:/test.txt");
		int readByteNo;
		byte[] b = new byte[2];

		while( (readByteNo = iStream.read(b) ) != -1) {
			System.out.println("읽은 바이트의 수 : " + readByteNo);
			//String클래스로 반드시 디코딩해야 한글이 출력된다.
			String str = new String(b);
			System.out.println("읽은 문자열 : " + str); //문자열 출력
		}

		iStream.close();


//		String dataLine = "ABC가나다라";
//		System.out.println(new String(dataLine.getBytes("EUC-KR"), "UTF-8"));
//	    System.out.println(new String(dataLine.getBytes("UTF-8"), "UTF-8"));
//	    System.out.println(new String(dataLine.getBytes(), "UTF-8"));
//	    System.out.println(new String(dataLine.getBytes(), "EUC-KR"));
//	    System.out.println(new String(dataLine.getBytes(), "ISO-8859-1"));
//	    System.out.println(new String(dataLine.getBytes(), "KSC5601"));
//	    System.out.println(new String(dataLine.getBytes(), "US-ASCII"));
//	    System.out.println(new String(dataLine.getBytes("EUC-KR"), "EUC-KR"));
//	    System.out.println(new String(dataLine.getBytes("UTF-8"), "EUC-KR"));
//	    System.out.println(new String(dataLine.getBytes("ISO-8859-1"), "EUC-KR"));
//	    System.out.println(new String(dataLine.getBytes("ISO-8859-1"), "UTF-8"));
//	    System.out.println(new String(dataLine.getBytes("ISO-8859-1"), "ISO-8859-1"));
//	    System.out.println(new String(dataLine.getBytes("KSC5601")));
//	    System.out.println(new String(dataLine.getBytes("EUC-KR")));
//	    System.out.println(new String(dataLine.getBytes("UTF-8")));		
	}
}