package com.jeikei.singletonexample;

public class Dummy {

	public Dummy()
	{
		SingletonClass singleton = SingletonClass.getInstance();
		
		singleton.count();
		singleton.count();
		singleton.count();
	}
}
