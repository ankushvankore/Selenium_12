package com.FunctionDemos;

public class D01SimpleFunction {

	//public static <return type> funName(<arguments>){}
	public static void sayHello()	//Called function
	{
		System.out.println("Hello from function");
	}
	
	public static void main(String[] args)	//Calling function 
	{
		sayHello();
		sayHello();
	}

}
