package com.jeikei.bicycle;

public class Main {
	
	public static void main_cycle(String[] args)
	{
		Bicycle myBicycle = new Bicycle();
		CycleBicycle myCycleBicycle = new CycleBicycle();
		
		myBicycle.name = "�Ϲ� ������";
		myCycleBicycle.name = "����Ŭ ������";
		
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
			bicycles[i].name = "�����ŵ�" + i;
			bicycles[i].move(i, -i);
		}
		
		Bicycle.temp = 10;
		System.out.println("�ӽ� ������ " + Bicycle.temp + "�Դϴ�.");
		
		Bicycle.temp = 22;
		
		System.out.println("�ӽ� ������ " + Bicycle.temp + "�Դϴ�.");
		
		bicycles[0].showCurrentLocation();
		
		bicycle.name = "������1";
		
		bicycle.move(5, -2);
		bicycle.showCurrentLocation();
	}
}
