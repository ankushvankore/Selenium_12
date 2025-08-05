package com.ClassDemos;

public class ClientClass {

	public static void main(String[] args) {
		MyDate d1 = new MyDate();
		d1.setDay(5);
		d1.displayDate();
		
		System.out.println("Day: " + d1.getDay());
		
		MyDate d2 = new MyDate();
		//d2.setDate();
		d2.displayDate();
		
		MyDate d3 = new MyDate(20, "March", 1995);
		d3.displayDate();
		
		MyDate d4 = new MyDate(18, "October");
		d4.displayDate();
	}

}
