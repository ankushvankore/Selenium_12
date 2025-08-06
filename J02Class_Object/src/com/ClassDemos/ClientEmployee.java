package com.ClassDemos;

public class ClientEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee.setCompany("Relience");
		e1.displayData();
		double sal = e1.calculateSalary();
		System.out.println("Net Salary   : " + sal);
		System.out.println("=======================================");
		Employee e2 = new Employee(123, "Sharvari", "Female", 60000);
		e2.displayData();
		System.out.println("Net Salary   : " + e2.calculateSalary());
		System.out.println("=======================================");
		Employee.setCompany("JIO");
		Employee e3 = new Employee(456, "Sheetal", "Female", 67000);
		e3.displayData();
		System.out.println("Net Salary   : " + e3.calculateSalary());
		
		//e1.displayData();
		//e2.displayData();
	}

}
