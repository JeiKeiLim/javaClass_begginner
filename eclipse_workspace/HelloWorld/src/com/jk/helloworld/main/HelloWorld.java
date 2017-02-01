package com.jk.helloworld.main;

public class HelloWorld {
	
	public static void main_older(String args[])
	{
		int a = 10;
		double b = 3.4;
		boolean bool_v;
		
		b = (double)a/3;
		
		bool_v = (b == 3.4) ? true : false;
		
		if(b == 3.4)
		{
			bool_v = true;
		}	
		else
		{
			bool_v = false;
		}
		
		System.out.println("a = " + a + 
							" , b = " + b + 
							", bool_v = " + bool_v);
		
		System.out.println("a = " + (a++));
		System.out.println("a = " + (a));
		System.out.println("a = " + (++a));
		
		a = (int) Math.pow(2, 31);
		
		System.out.println("a = " + (a));
		System.out.println("a = " + (a+1));
	}
}
