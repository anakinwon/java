package com.pisien.edu.pro.pro05Collection02.example10;

import java.util.Comparator;

public class AsecndingComparator implements Comparator<Fruit> {
	@Override
	public int compare(Fruit o1, Fruit o2) {
//		if(o1.getPrice() < o2.getPrice())
//			return -1;
//		else if(o1.getPrice() == o2.getPrice())
//			return 0;
//		else
//			return 1;
		
		return o1.getPrice() - o2.getPrice();
	}
}
