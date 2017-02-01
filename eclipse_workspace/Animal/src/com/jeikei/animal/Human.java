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
		System.out.println("사람 입니다.");
		makeSound();
		System.out.println("다리는 " + leg_number + "개 입니다.");
		System.out.println("크기는 " + size + "입니다.");
		System.out.println("나이는 " + age + "살 입니다.");
	}

	@Override
	void makeSound() {
		System.out.println("제 이름은 " + name + "입니다.");
	}
	
}
