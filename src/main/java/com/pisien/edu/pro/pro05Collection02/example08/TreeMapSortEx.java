package com.pisien.edu.pro.pro05Collection02.example08;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapSortEx {

	public static void main(String[] args) {

		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();

		scores.put(87, "홍길동");
		scores.put(98, "신은혁");
		scores.put(75, "김연아");
		scores.put(95, "손연재");
		scores.put(80, "김삼순");

		//정렬하기(키의 값으로 정렬이 되는 것을 주목하자.)
		//내림차순
		NavigableMap<Integer, String> decendingMap = scores.descendingMap();
		//내림차순이 된 decendingMap을 entrySet()통해서 Set으로 대입하고 있다.
		Set<Map.Entry<Integer, String>> decendingEntrySet = decendingMap.entrySet();
		//출력하기
		for(Map.Entry<Integer, String> entry : decendingEntrySet) {
			int value = entry.getKey();
			String str = entry.getValue();
			System.out.println("키 : " + value + " -  값 : " + str);
		}
		System.out.println("=============================================");
		//다시 오름차순 정렬하기
		NavigableMap<Integer, String> ascendingEntryMap = decendingMap.descendingMap();
		Set<Map.Entry<Integer, String>> ascendingEntrySet = ascendingEntryMap.entrySet();

		for(Map.Entry<Integer, String> entry : ascendingEntrySet) {
			int value = entry.getKey();
			String str = entry.getValue();
			System.out.println("키 : " + value + " -  값 : " + str);
		}

		System.out.println("=============================================");
		//키만 가져와서 반복자로 출력을 해본다.
		NavigableSet<Integer> keySet = scores.descendingKeySet();
		Iterator<Integer> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			int value = iterator.next();
			String str = scores.get(value);
			System.out.println("키 : " + value + " -  값 : " + str);
		}
	}
}