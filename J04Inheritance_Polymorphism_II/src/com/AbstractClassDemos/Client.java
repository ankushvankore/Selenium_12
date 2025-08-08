package com.AbstractClassDemos;

public class Client{
	public static void main(String[] args) {
		Shape s1 = new Circle(5);
		s1.calculateArea();
		
		Triangle t1 = new Triangle(5, 7);
		t1.calculateArea();
		t1.print();
		
		s1.demo();
		t1.demo();
		
		Printable p1 = new Circle(5);
		p1.print();
	}
}
