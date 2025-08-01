package com.LoopsDemos;

import java.util.Scanner;

public class D04CalAddition {

	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++)
		{
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

}
