package com.mccoy.servicess;

public class ExceptionDefault1 {
	public static void dostuff()
	{
		domorestuff();
		System.out.println("hi");
	}

	public static void domorestuff()
	{
		System.out.println("hello");
		try
		{
			
		
		System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		dostuff();

	}

}
