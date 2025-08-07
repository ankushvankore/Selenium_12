package com.InheritanceDemos;

public class Manager extends Employee 
{
	protected double hours;
	protected double rate;
	
	public Manager()
	{
		super();		//Calls plain constructor of base class
		hours = 0;
		rate = 0;
	}

	public Manager(int id, String nm, String gn, double bs, double hours, double rate) {
		super(id, nm, gn, bs);	//Calls parameterized constructor of base class
		this.hours = hours;
		this.rate = rate;
	}
	
	public void displayData()
	{
		super.displayData();	//Calls the function of base class
		System.out.println("No of Hours  : " + hours);
		System.out.println("Rate per Hr  : " + rate);
	}
	public double calculateInsentive()
	{
		System.out.println(basicSalary);
		double ins = hours * rate;
		return ins;
	}
	public double calculateSalary()
	{
		double net = super.calculateSalary() + calculateInsentive();
		return net;
	}
	
}
