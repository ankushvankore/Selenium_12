package com.FunctionDemos;

public class D05MethodOverloading {

	public static void calculateSum(int n1, int n2)
	{
		int sum = n1 + n2;
		System.out.println("Sum: " + sum);
	}
	public static void calculateSum(int n1, int n2, int n3)
	{
		int sum = n1 + n2 + n3;
		System.out.println("Sum: " + sum);
	}
	public static void calculateSum(double n1, double n2)
	{
		double sum = n1 + n2;
		System.out.println("Sum: " + sum);
	}
	public static void calculateSum(double n1, int n2)
	{
		double sum = n1 + n2;
		System.out.println("Sum: " + sum);
	}
	public static void calculateSum(int n1, double n2)
	{
		double sum = n1 + n2;
		System.out.println("Sum: " + sum);
	}
	public static void main(String[] args) {
		calculateSum(10, 20);
		calculateSum(5.5, 6.6);
		calculateSum(10, 20, 30);
	}

}
