package com.ClassDemos;

public class MyDate {
	private int day;
	private String month;
	private int year;
	
	public MyDate()							//Plain / Default / no parameter constructor
	{
		System.out.println("Plain Constructor Called");
		day = 1;
		month = "Jan";
		year = 2025;
	}
	public MyDate(int d, String m, int y)	//Parameterized Constructor
	{
		System.out.println("Parameterized Constructor Called");
		day = d;
		month = m;
		year = y;
	}
	public MyDate(int d, String m)
	{
		System.out.println("Second Parameterized Constructor Called");
		day = d;
		month = m;
		year = 2000;
	}
	
	public void setDay(int d)		//Mutator function / Setter Function
	{
		day = d;
	}
	public int getDay()				//Accessor function / Getter function
	{
		return day;
	}
	
	public void displayDate()		//Facilitator function
	{
		System.out.println("Date: " + day + "-" + month + "-" + year);
	}

}
