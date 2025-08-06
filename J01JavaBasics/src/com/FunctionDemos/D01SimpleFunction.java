package com.FunctionDemos;

public class D01SimpleFunction {

	//public static <return type> funName(<arguments>){}
	public static void sayHello()	//Called function
	{
		System.out.println("Hello from function");
	}
	public void greetings()
	{
		System.out.println("Good Morning");
	}
	public static void main(String[] args)	//Calling function 
	{
		sayHello();
		sayHello();

		D01SimpleFunction d1 = new D01SimpleFunction();
		d1.greetings();
	}

}
