package com.jeikei.file;

import java.util.ArrayList;

public class VarWriter extends EasyFileWriter{

	public VarWriter(String fileName) {
		super(fileName);
	}
	
	public void writeVar(int value)
	{
		super.writeFile(String.valueOf(value));
	}
	
	public void writeVar(ArrayList<Double> values)
	{
		super.writeFile(String.valueOf(values.get(0)));
		
		for(int i=1; i<values.size(); i++)
		{
			super.writeFile("," + String.valueOf(values.get(i)));
		}
	}

}
