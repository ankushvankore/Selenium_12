package com.BasicDemos;

import java.util.Scanner;

public class D04CalculateAddition {

	public static void main(String[] args) {
		int no1, no2, sum;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter No1: ");
		no1 = scn.nextInt();
		System.out.println("Enter No2: ");
		no2 = scn.nextInt();
		
		sum = no1 + no2;
		
		System.out.println("Addition: " + sum);
	}

}
