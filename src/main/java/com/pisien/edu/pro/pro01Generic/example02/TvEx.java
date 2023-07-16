package com.pisien.edu.pro.pro01Generic.example02;

public class TvEx {

	public static void main(String[] args) {

		Tv<String> tv1 = new Tv<String>();
		tv1.setE("LG OLED TV");
		String tvName = tv1.getE();

		Tv<Integer> tvp = new Tv<>();
		tvp.setE(1200000);

		int price = tvp.getE();

		System.out.println("나의 TV는 " + price +"원 짜리, " + tvName + "TV 입니다.");
	}
}
