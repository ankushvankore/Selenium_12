package com.CollectionDemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class D03ListDemo2 {

	public static void main(String[] args) {
		List<Integer>nos = new ArrayList<>();
		nos.add(43);
		nos.add(44);
		nos.add(12);
		nos.add(34);
		nos.add(98);
		nos.add(76);
		
		Collections.sort(nos);
		
		for(int n : nos)
			System.out.println(n);

	}

}
