package com.mccoy.servicess;
class TooYoungException extends RuntimeException
{
	TooYoungException(String s)
	{
		super(s);
		
	}
}
class TooOldException extends RuntimeException
{
	TooOldException(String s)
	{
		super(s);
	}
}

public class CustomisedException1 {
/*	private static String[] arg;*/

	public static void main(String[] args) {
		int p=30;
		/*int b=Integer.parseInt(null, 30);*/
		if(p<=30)
		{
		throw new TooYoungException("You will get mached soon");
		}
		if(p>30)
		{
			throw new TooOldException("age is already crossed");
		}
		else
		{
			System.out.println("not eligible age");
		}
	}
	

}
