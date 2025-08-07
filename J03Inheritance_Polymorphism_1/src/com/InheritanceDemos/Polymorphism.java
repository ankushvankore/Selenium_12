package com.InheritanceDemos;

public class Polymorphism {

	public static void main(String[] args) {
		/*Employee e1 = new Employee(123, "Sharvari", "Female", 50000);
		e1.displayData();
		System.out.println("Net Salary   : " + e1.calculateSalary());
		System.out.println("============================");
		Manager m1 = new Manager(456, "Aarti", "Female", 50000, 50, 500);
		m1.displayData();
		System.out.println("Net Salary   : " + m1.calculateSalary());*/
		
		Employee emp;	//Reference of base class
		
		Employee e1 = new Employee(123, "Sharvari", "Female", 50000);
		Manager m1 = new Manager(456, "Aarti", "Female", 50000, 50, 500);
		
		emp = e1;
		emp.displayData();
		System.out.println("Net Salary   : " + emp.calculateSalary());
		
		System.out.println("========================");
		
		emp = m1;
		emp.displayData();
		System.out.println("Net Salary   : " + emp.calculateSalary());
		
		final double pi = 3.142;
		//pi = 45.6;
	}

}
