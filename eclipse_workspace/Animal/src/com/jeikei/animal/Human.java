package com.jeikei.animal;

public class Human extends Animal implements IAnimal{
	private String name;

	public Human(String _name, int _size, int _age)
	{
		super(2, _size, _age);
		
		name = _name;
	}
	
	public void setName(String newName)
	{
		name = newName;
	}
	
	@Override
	public void show_property() {
		System.out.println("��� �Դϴ�.");
		makeSound();
		System.out.println("�ٸ��� " + leg_number + "�� �Դϴ�.");
		System.out.println("ũ��� " + size + "�Դϴ�.");
		System.out.println("���̴� " + age + "�� �Դϴ�.");
	}

	@Override
	void makeSound() {
		System.out.println("�� �̸��� " + name + "�Դϴ�.");
	}
	
}
