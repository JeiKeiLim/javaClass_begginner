package com.jeikei.bicycle;

public class Main {
	
	public static void main_cycle(String[] args)
	{
		Bicycle myBicycle = new Bicycle();
		CycleBicycle myCycleBicycle = new CycleBicycle();
		
		myBicycle.name = "일반 자전거";
		myCycleBicycle.name = "싸이클 자전거";
		
		myBicycle.showCurrentLocation();
		myCycleBicycle.showCurrentLocation();
		
		myBicycle.move(1, -1);
		myCycleBicycle.move(1, -1);
		
		myBicycle.showCurrentLocation();
		myCycleBicycle.showCurrentLocation();
	}
	
	

	public static void main(String[] args)
	{
		Bicycle bicycle = new Bicycle();
		
		Bicycle[] bicycles = new Bicycle[100];
		
		for(int i=0; i<bicycles.length; i++)
		{
			bicycles[i] = new Bicycle();
			bicycles[i].name = "자전거들" + i;
			bicycles[i].move(i, -i);
		}
		
		Bicycle.temp = 10;
		System.out.println("임시 변수는 " + Bicycle.temp + "입니다.");
		
		Bicycle.temp = 22;
		
		System.out.println("임시 변수는 " + Bicycle.temp + "입니다.");
		
		bicycles[0].showCurrentLocation();
		
		bicycle.name = "자전거1";
		
		bicycle.move(5, -2);
		bicycle.showCurrentLocation();
	}
}
