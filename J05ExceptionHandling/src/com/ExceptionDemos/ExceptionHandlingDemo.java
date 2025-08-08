package com.ExceptionDemos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Index: ");
		int i = scn.nextInt();

		try {
			System.out.println(arr[i]);
		}
		catch(InputMismatchException ex)
		{
			System.out.println(ex);
		}
		catch(NullPointerException ex)
		{
			System.out.println(ex);
		}
		catch(ArithmeticException ex)
		{
			System.out.println(ex);
		}
		catch(Exception ex )
		{
			System.out.println(ex);
		}

		System.out.println("Program ends");
	}

}
