package com.FunctionDemos;

import java.util.Scanner;

public class D04ReturningValueWithoutPassing {

	public static int calculateSqure()
	{
		int no, sq;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter No: ");
		no = scn.nextInt();
		
		sq = no * no;
		
		return sq;
	}
	
	public static void main(String[] args) {
		int ans = calculateSqure();
		System.out.println("Squre: " + ans);

	}

}
