package com.jeikei.data;

import java.util.ArrayList;

/**
 * 여러 개의 값을 입력 받아 평균을 내주는 클래스이다.<br />
 * <B>ArrayList</B>를 썼기 때문에 무한대의 값 입력이 가능하다.
 * 
 * @author JeiKei
 * @version 1.0
 *
 */
public class MakeAverage {
	/**
	 * 값을 저장하는 변수
	 */
	private ArrayList<Integer> value = new ArrayList<>();
	
	public MakeAverage()
	{
	}
	
	/**
	 * 값을 추가하는 메소드
	 * 
	 * @param v - int형의 데이터로 사용한다.
	 */
	public void addValue(int v)
	{
		value.add(v);
	}
	
	/**
	 * 
	 * @return - 현재 입력된 갯수를 반환한다.
	 */
	public int getSize()
	{
		return value.size();
	}
	
	/**
	 * 입력된 값을 초기화 한다.
	 */
	public void reset()
	{
		value.clear();
	}
	
	/**
	 * 
	 * @return - 입력된 값들의 평균을 반환한다.
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
	 * 편차를 구한다.
	 * 
	 * @return 편차 값
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
