package com.jeikei.bicycle;

public class CycleBicycle extends Bicycle{

	public CycleBicycle()
	{
		super();
		super.speed = 3;
	}
	
	public void sprint()
	{
		super.speed = 5;
	}
	
}
