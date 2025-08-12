package com.CollectionDemos;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class D05MapDemo {

	public static void main(String[] args) {
		Map<Integer, String>students = new HashMap<>();
		students.put(1, "Sharwari");
		students.put(2, "Sheetal");
		students.put(3, "Rahul");
		students.put(4, "Aarti");
		students.put(3, "Ankush");
		students.put(5, "Sheetal");
		
		System.out.println(students);
		
		for(Entry<Integer, String> s : students.entrySet())
		{
			System.out.println(s);
		}
		
		System.out.println(students.get(3));
	}

}
