package com.pisien.edu.pro.pro07IOPackage02.example06;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamEx {

	public static void main(String[] args) throws Exception {

		File file = new File("D:\\java작업_아이티고\\Practice_Chap26(IO입출력-Part_2)\\src\\example06\\불멸의이순신80회.mp4");
		//File file = new File("D:\\java작업_아이티고\\Practice_Chap26(IO입출력-Part_2)\\src\\example06\\젝스키스(세단어).mp3");
		System.out.println("파일의 크기 : " + ((file.length())/1024)/1024 + "Mbyte" );

		//주스트림
		FileInputStream fInputStream = null;
		FileOutputStream fOutputStream = null;
		//보조스트림
		BufferedInputStream bInputStream = null;
		BufferedOutputStream bOutputStream = null;

		int dataCount = 0;
		long start = 0;
		long end = 0;
		byte[] bArr = new byte[10000];
		//주스트림에 보조스트림을 연결함.(입력)
		fInputStream = new FileInputStream(file);
		bInputStream = new BufferedInputStream(fInputStream);
		//주스트림에 보조스트림을 연결함.(출력)
		fOutputStream = new FileOutputStream("C:/Temp/불멸의 이순신80회.mp4");
		//fOutputStream = new FileOutputStream("C:/Temp/젝스키스(세단어)_버퍼.mp3");
		bOutputStream = new BufferedOutputStream(fOutputStream);

		start = System.currentTimeMillis();  //읽고 저장하기 전 시간을 저장

		//1바이트씩 읽고 1바이트씩 저장하는 경우(35.8초)
		while( (dataCount = bInputStream.read(bArr) ) != -1) {
			fOutputStream.write(bArr, 0, dataCount);
		}

		fOutputStream.flush();
		end = System.currentTimeMillis();   //읽고 저장한 후 시간을 저장

		System.out.println("BufferedOutputStream을 사용하지 않았을 때 : " + (end-start) + "ms");


		//BufferedOutputStream사용했을 때...
		start = System.currentTimeMillis();  //읽고 저장하기 전 시간을 저장

		//1바이트씩 읽고 1바이트씩 저장하는 경우(0.3초)
		while( (dataCount = bInputStream.read(bArr) ) != -1) {
			bOutputStream.write(bArr, 0, dataCount);
		}

		bOutputStream.flush();
		end = System.currentTimeMillis();   //읽고 저장한 후 시간을 저장

		System.out.println("BufferedOutputStream을 사용하지 했을 때 : " + (end-start) + "ms");

		//자원 해제
		bOutputStream.close();
		bInputStream.close();
		fOutputStream.close();
		fInputStream.close();

//		결론 : 배열을 사용해서 적절하게 저장공간을 주고, BufferedInputStream과 BufferedOutputStream을
//		보조스트림을 연결하여 사용하면, 상당한 성능을 발휘하는 사실을 알게 되었다.
	}
}
