package com.pisien.edu.pro.pro07IOPackage02.example08;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamEx {

	public static void main(String[] args) throws Exception {

		File file = new File("C:/Temp/printStream.txt");
		FileOutputStream fOutputStream = new FileOutputStream(file);
		//보조스트림 중에서 개행이 빈번하게 일어날 경우 사용을 하면 좋다.
		PrintStream pStream = new PrintStream(fOutputStream);

		//파일에 출력을 한다. 출력스트림이라 System.out(콘솔)해서 사용해도 된다.
		pStream.println("[프린트 스트림 사용]");
		pStream.println("나는");
		pStream.println("자바 프로그램으로 ");
		pStream.println("프린터가 출력하는 것처럼 ");
		pStream.println("프로그램을 만들어서 데이터를 출력합니다.");

		System.out.println("파일 저장 완료");
		//형식 지정자와 매개변수의 개수를 반드시 동일하게 설정을 해야한다.
		System.out.printf("%.2f, %d, %s", 10.123, 20, "자바");

		pStream.flush();
		pStream.close();
		fOutputStream.close();
	}
}