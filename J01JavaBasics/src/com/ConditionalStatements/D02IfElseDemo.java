package com.ConditionalStatements;

import java.util.Scanner;

public class D02IfElseDemo {

	public static void main(String[] args) {
		int amt;
		double dis, net;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter Amount: ");
		amt = scn.nextInt();
		
		if(amt >= 1000)
		{
			dis = amt * 0.10;
		}
		else
		{
			dis = amt * 0.05;
		}
		net = amt - dis;
		
		System.out.println("Discount  : " + dis);
		System.out.println("Net Amount: " + net);
		//Accept a bank balance from user and display a message as sufficient balance if
		//amount is grater that or equal to 2000 else display a message as insufficient balance
	}

}
