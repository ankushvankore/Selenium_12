package com.BasicDemos;

import java.util.Scanner;

public class D03AcceptData {
	public static void main(String[] args) {
		int no1;		//Decl
		double avg;
		String name;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		no1 = scn.nextInt();
		System.out.println("Enter Average: ");
		avg = scn.nextDouble();
		System.out.println("Enter Name: ");
		name = scn.next();
		
		System.out.println("Number: " + no1);
		System.out.println("Average: " + avg);
		System.out.println("Name: " + name);
	}
}
