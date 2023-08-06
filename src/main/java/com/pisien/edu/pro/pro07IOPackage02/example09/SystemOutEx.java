package com.pisien.edu.pro.pro07IOPackage02.example09;

import java.io.OutputStream;

public class SystemOutEx {

	public static void main(String[] args) throws Exception {

		//PrintStream(System.out)은 OutputStream의 자손 클래스이므로
		//얼마든 대입이 가능하다.(다형성)
		OutputStream oStream = System.out;
		//아스키 코드표 출력
		for(byte b=48; b<58; b++) {
			System.out.print("아스키 코드 write()후 출력된 문자값 : ");
			System.out.print(b + "\t");
			oStream.write(b);
			System.out.println();
		}
		oStream.write(13);  //줄바꿈

		for(byte b=97; b<127; b++) {
			System.out.print("아스키 코드 write()후 출력된 문자값 : ");
			System.out.print(b + "\t");
			oStream.write(b);
			System.out.println();
		}
		oStream.write(13);  //줄바꿈

		String str = "저는 자바공부를 열심히 하는 사람입니다.";
		byte[] bArr = str.getBytes();
		//for(int i=0; i<bArr.length; i++)
		//	System.out.print((char)bArr[i]);
		oStream.write(bArr);  //한번에 문자열을 출력함.
		oStream.flush();
		oStream.close();
	}
}