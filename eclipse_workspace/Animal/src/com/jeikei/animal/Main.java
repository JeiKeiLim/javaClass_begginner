package com.jeikei.animal;

public class Main {
	public static void main(String[] args)
	{
		Dog myDog = new Dog(10, 2);
		Cat myCat = new Cat(5, 1);
		Human myHuman = new Human("������", 100, 20);
		Human newHuman = null;
		
		if(newHuman == null)
			System.out.println("newHuman�� ���Դϴ�");
		
//		myDog.makeSound();
		myDog.show_property();
		
//		myCat.makeSound();
		myCat.show_property();
		
		myHuman.show_property();
//		myHuman.sayName();
//		myHuman.setName("����");
//		myHuman.sayName();

//		Poodle myPoodle = new Poodle(3);
//		myPoodle.show_property();
//		myPoodle.bark();
//		myPoodle.raiseHand();
		
	}
}
