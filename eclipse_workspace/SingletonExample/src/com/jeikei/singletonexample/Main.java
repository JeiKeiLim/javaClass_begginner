package com.jeikei.singletonexample;

public class Main {
	
	public static void main(String[] args)
	{
		Dummy dummy = new Dummy();
		
		SingletonClass singleton = SingletonClass.getInstance();
		
		singleton.count();
		
		System.out.println("count : " + singleton.getCount());
	}
}
