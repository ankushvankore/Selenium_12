package com.CollectionDemos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class D04SetDemo {
	public static void main(String[] args) {
		Set<String>students = new HashSet<>();
		students.add("Sheetal");
		students.add("Sharwari");
		students.add("Aarti");
		students.add("Rahul");
		students.add("Rahul");
		
		System.out.println(students);

		Iterator<String>itr = students.iterator();
		//This interface is used to iterate / read the elements form Set<>
		
		/*String s = itr.next();
		System.out.println(s);
		s = itr.next();
		System.out.println(s);*/
		
		String s;
		while(itr.hasNext())
		{
			s = itr.next();
			System.out.println(s);
		}
	}
}
