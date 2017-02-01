package com.jeikei.animal;

public abstract class Animal{
	protected int leg_number;
	protected int size;
	protected int age;
	protected int id;
	
	public Animal(int leg_number, int size, int age)
	{
		this.leg_number = leg_number;
		this.size = size;
		this.age = age;
	}
	
	abstract void makeSound();
	
	public void setId(int _id)
	{
		id = _id;
	}
	public void setId(String _id)
	{
		id = Integer.parseInt(_id);
	}
	public void setId(float _id)
	{
		id = (int)_id;
	}
	public void setId(double _id)
	{
		id = (int)_id;
	}
}
