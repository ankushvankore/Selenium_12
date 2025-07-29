package com.BasicDemos;

import java.util.Scanner;

public class D04CalculateDiscount {

	public static void main(String[] args) {
		// Amount, discount, net
		int amt;
		double dis, net;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter Amount: ");
		amt = scn.nextInt();
		
		dis = amt * 0.10;
		net = amt - dis;
		
		System.out.println("Discount  : " + dis);
		System.out.println("Net Amount: " + net);
	}

}
