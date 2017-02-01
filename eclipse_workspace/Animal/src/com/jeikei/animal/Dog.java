package com.jeikei.animal;

public class Dog extends Animal implements IAnimal{

	public Dog(int _size, int _age)
	{
		super(4, _size, _age);
	}
	
	@Override
	void makeSound() {
		System.out.println("�۸�");
	}

	@Override
	public void show_property() {
		System.out.println("�� �Դϴ�");
		System.out.println("�ٸ��� " + leg_number + "�� �Դϴ�.");
		System.out.println("ũ��� " + size + "�Դϴ�.");
		System.out.println("���̴� " + age + "�� �Դϴ�.");
	}
}
