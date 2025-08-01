package com.ArrayDemo;

import java.util.Arrays;

public class D03SortingArray {

	public static void main(String[] args) {
		//int[] arr = new int[] {54, 24, 65, 87, 34, 66, 78, 23};
		int[] arr = {54, 24, 65, 87, 34, 66, 78, 23};
		
		System.out.println("Before Sorting");
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		
		Arrays.sort(arr);
		
		System.out.println("\nAfter Sorting");
		for(int n : arr)
			System.out.print(n + " ");
		
		/*
		 * Points to be noted about enhanced for loop / for each loop
		 * 1. It is forward only loop
		 * 2. It is read only loop
		 * 3. This loop is used only for collections like Array, List, Set etc
		 */
	}

}
