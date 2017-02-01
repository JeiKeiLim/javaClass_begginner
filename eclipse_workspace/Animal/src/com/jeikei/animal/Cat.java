package com.jeikei.animal;

public class Cat extends Animal implements IAnimal{

	public Cat(int _size, int _age)
	{
		super(4, _size, _age);
	}
	
	@Override
	void makeSound() {
		System.out.println("야옹");
	}

	@Override
	public void show_property() {
		System.out.println("고양이 입니다.");
		System.out.println("다리는 " + leg_number + "개 입니다.");
		System.out.println("크기는 " + size + "입니다.");
		System.out.println("나이는 " + age + "살 입니다.");
	}
}
