package com.jeikei.data;

import java.util.ArrayList;

public class ArrayQueue {
	ArrayList<Integer> value = new ArrayList<>();
	
	public ArrayQueue()
	{
	}
	
	public void addValue(int v)
	{
		value.add(v);
	}
	
	public int getFirstQueue() throws IndexOutOfBoundsException
	{
		int result = value.get(0);
		value.remove(0);
		
		return result;
	}

}
