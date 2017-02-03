package com.jeikei.singletonexample;

public class SingletonClass {
	private static SingletonClass instance = new SingletonClass();
	
	private int count;

	private SingletonClass()
	{
	}
	
	public static SingletonClass getInstance()
	{
		return instance;
	}
	
	public void reset()
	{
		count = 0;
	}
	
	public void count()
	{
		count++;
	}
	
	public int getCount()
	{
		return count;
	}
	
}
