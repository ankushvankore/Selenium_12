package com.InheritanceDemos;

public class Employee {
	private int empId;
	private String empName;
	private String gender;
	private double basicSalary;
	
	public Employee()
	{
		empId = 70659774;
		empName = "Rahul";
		gender = "Male";
		basicSalary = 50000;
		System.out.println("Employee --> Plain");
	}
	public Employee(int empId, String empName, String gender, double basicSalary)
	{
		this.empId = empId;
		this.empName = empName;
		this.gender = gender;
		this.basicSalary = basicSalary;
		System.out.println("Employee --> Parameterized");
	}
	public void displayData()
	{
		System.out.println("Employee Id  : " + this.empId);
		System.out.println("Employee Name: " + empName);
		System.out.println("Gender       : " + gender);
		System.out.println("Basic Salary : " + basicSalary);
	}
	public double calculateSalary()
	{
		double da, hra, pf, net;
		
		da = this.basicSalary * 0.50;
		hra = basicSalary * 0.20;
		pf = basicSalary * 0.05;
		net = basicSalary + da + hra - pf;
		
		return net;
	}
}
