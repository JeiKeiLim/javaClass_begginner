package com.jk.helloworld.main;

public class FindMaxValue {
	public static void main_maxValue(String[] args)
	{
		int[] values = {5,1,56,67,2,2,1,3,6,34,7,14};
		
		
		int maxValue = 0;
		
		for(int v : values)
		{
			if(maxValue < v)
				maxValue = v;
		}
		
//		for(int i=0; i<values.length; i++)
//		{	
//			if(maxValue < values[i])
//			{
//				maxValue = values[i];
//			}
//		}
		
		System.out.println("가장 큰 값은 : " + maxValue);
		
		int[] temp = makeArray(50);
		for(int v : temp)
		{
			System.out.println(v +"");
		}
	}
	
	public static int[] makeArray(int n)
	{
		int[] ret = new int[n];
		
		for(int i=0; i<n; i++)
		{
			ret[i] = i;
		}
		
		return ret;
	}
}
