package com.project.calculator;

public class Calculator {
	public static void add(int a, int b)
	{
		int c=a+b;
		System.out.println("Addition of "+a+" and "+b+ " is :"+c);
	}
	
	public static void sub(int a, int b)
	{
		if(a>b)
		{
		int c=a-b;
		System.out.println("Substraction of "+b+" from "+a+ " is :"+c);
		}
		
	}
	
	public static void mul(int a, int b)
	{
		int c=a*b;
		System.out.println("Multiplication of "+a+" and "+b+ " is :"+c);
	}
	
	public static void div(int a, int b)
	{
		if(b>0)
		{
		int c=a/b;
		System.out.println("Division of "+a+" by "+b+ " is :"+c);
		}
		else
		{
			System.out.println("Can't divide by zero");
		}
	}

	public static void main(String[] args) 
	{
		add(10, 20);
		sub(10, 20);
		sub(100, 20);
		mul(10, 20);
	    div(10, 20);
	    div(100,20);	    
	    div(10, 0);


	}

}
