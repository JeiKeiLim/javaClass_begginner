package com.jeikei.file;

import java.util.ArrayList;

public class VarReader extends EasyFileReader{

	public VarReader(String fileName) {
		super(fileName);
	}
	
	public int readIntVar()
	{
		return Integer.parseInt(super.readFile());
	}
	
	public ArrayList<Double> readArrayListVar()
	{
		ArrayList<Double> result = new ArrayList<>();
		
		String readStr = super.readFile();
		String[] eachStr = readStr.split(",");
		
		for(String str : eachStr)
		{
			result.add(Double.parseDouble(str));
		}
		
		return result;
	}
	

}
