package com.ConditionalStatements;

import java.util.Scanner;

public class D04NestedIf {

	public static void main(String[] args) {
		int amt;
		double dis, net;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter Amount: ");
		amt = scn.nextInt();
		
		/*if(amt < 1000)
		{
			dis = amt * 0.02;
		}
		else
		{
			if(amt < 3000)
			{
				dis = amt * 0.05;
			}
			else
			{
				if(amt < 5000)
				{
					dis = amt * 0.10;
				}
				else
				{
					dis = amt * 0.15;
				}
			}
		}*/
		
		if(amt < 1000)
		{
			dis = amt * 0.02;
		}
		else if(amt >= 1000 && amt < 3000)
		{
			dis = amt * 0.05;
		}
		else if(amt < 5000)
		{
			dis = amt * 0.10;
		}
		else
		{
			dis = amt * 0.15;
		}
		
		net = amt - dis;
		
		System.out.println("Discount  : " + dis);
		System.out.println("Net Amount: " + net);
	}

}
