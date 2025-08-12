package com.CollectionDemos;

import java.util.ArrayList;
import java.util.List;

public class D01ListDemo {

	public static void main(String[] args) {
		List<String>students = new ArrayList<String>();
		students.add("Sheetal");
		students.add("Sharwari");
		students.add("Aarti");
		students.add("Rahul");
		students.add("Rahul");
		
		System.out.println("Total no of Students: " + students.size());
		
		String s1 = students.get(1);
		System.out.println(s1);
		
		System.out.println(students.get(0));
		
		System.out.println(students.indexOf("Rahul"));
		
		System.out.println(students);
		
		//for(int i = 0; i < students.size(); i++)
			//System.out.println(students.get(i));
		
		for(String s : students)
			System.out.println(s);
	}

}
