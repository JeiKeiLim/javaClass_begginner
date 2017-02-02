package com.jeikei.data;

import java.util.ArrayList;

/**
 * ���� ���� ���� �Է� �޾� ����� ���ִ� Ŭ�����̴�.<br />
 * <B>ArrayList</B>�� ��� ������ ���Ѵ��� �� �Է��� �����ϴ�.
 * 
 * @author JeiKei
 * @version 1.0
 *
 */
public class MakeAverage {
	/**
	 * ���� �����ϴ� ����
	 */
	private ArrayList<Integer> value = new ArrayList<>();
	
	public MakeAverage()
	{
	}
	
	/**
	 * ���� �߰��ϴ� �޼ҵ�
	 * 
	 * @param v - int���� �����ͷ� ����Ѵ�.
	 */
	public void addValue(int v)
	{
		value.add(v);
	}
	
	/**
	 * 
	 * @return - ���� �Էµ� ������ ��ȯ�Ѵ�.
	 */
	public int getSize()
	{
		return value.size();
	}
	
	/**
	 * �Էµ� ���� �ʱ�ȭ �Ѵ�.
	 */
	public void reset()
	{
		value.clear();
	}
	
	/**
	 * 
	 * @return - �Էµ� ������ ����� ��ȯ�Ѵ�.
	 */
	public double getAverage()
	{
		double result = 0;
		
		for(int v : value)
		{
			result += v;
		}
		
		result /= value.size();
		
		return result;
	}
	
	/**
	 * ������ ���Ѵ�.
	 * 
	 * @return ���� ��
	 */
	public double getVariance()
	{
		double avg = getAverage();
		double result = 0;
		
		for(int v : value)
		{
			result += Math.pow(avg-v, 2);
		}
		
		return result;
	}
	
	public double getStandardVariance()
	{
		double var = getVariance();
		
		return Math.sqrt(var);
	}
	
}
