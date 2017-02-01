package com.jeikei.bicycle;

public class Bicycle {
	private int id;
	private int x, y;
	protected int speed;
	public String name;

	public static int temp; 
	
	public Bicycle()
	{
		id = (int)(Math.random() * 10000);
		
		x = 0;
		y = 0;
		
		speed = 1;
	}
	
	public int getId()
	{
		return id;
	}
	
	private int doPeddle(int current, int direction)
	{
		return current + (direction * speed);
	}
	
	public void move(int xDir, int yDir)
	{
		x = doPeddle(x, xDir);
		y = doPeddle(y, yDir);
	}
	
	public void showCurrentLocation()
	{
		System.out.println(name + 
				"("+id+")의 현재 위치는 (" + x + ","+y+
				")입니다.");
	}
}
