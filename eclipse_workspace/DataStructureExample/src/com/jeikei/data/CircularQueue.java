package com.jeikei.data;

public class CircularQueue {
	private int[] value;
	
	private int idx_front;
	private int idx_rear;
	
	public CircularQueue(int size)
	{
		value = new int[size];
		idx_front = 0;
		idx_rear = 0;
	}
	
	private int getNextIndex(int idx)
	{
		return (idx+1) % value.length;
	}
	
	public void putData(int v)
	{
		value[idx_front] = v;
		
		idx_front = getNextIndex(idx_front);
		
		if(idx_rear == idx_front)
			idx_rear = getNextIndex(idx_rear);
	}
	
	public int getData()
	{
		int result = value[idx_rear];
		
		if(idx_front != idx_rear)
			idx_rear = getNextIndex(idx_rear);	
		
		return result;
	}

}
