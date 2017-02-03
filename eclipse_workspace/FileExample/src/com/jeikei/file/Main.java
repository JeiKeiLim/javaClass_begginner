package com.jeikei.file;

import java.util.ArrayList;

public class Main {
	
	
	public static void main(String[] args)
	{
		int temp = 55;
		ArrayList<Double> list = new ArrayList<>();
		
		for(int i=0; i<100; i++)
			list.add((double)i/3);
		
		
		VarWriter varWriter = new VarWriter("var.txt");
		VarReader varReader = new VarReader("var.txt");
		
		varWriter.writeVar(list);
		
		ArrayList<Double> readList = varReader.readArrayListVar();
		
		for(double v : readList)
		{
			System.out.println(v +"");
		}
	}
	
	
	
	
	public static void main_easyclass(String[] args)
	{
		EasyFileReader fSourceReader = new EasyFileReader("aaa.txt");
		EasyFileWriter fSourceWriter = new EasyFileWriter("aaa.txt");
		EasyFileReader fTargetReader = new EasyFileReader("bbb.txt");
		EasyFileWriter fTargetWriter = new EasyFileWriter("bbb.txt");
		
		fSourceWriter.writeFile("Hello Java from easy class!");
		
		String sourceText = fSourceReader.readFile();
		
		System.out.println(fSourceReader.getFileName() + "�� ������ " + sourceText + "�Դϴ�");
		
		fTargetWriter.writeFile(sourceText);
		System.out.println(fTargetReader.getFileName() + "�� ������ " + fTargetReader.readFile() + "�Դϴ�");
	
		fSourceReader.close();
		fSourceWriter.close();
		fTargetReader.close();
		fTargetWriter.close();
		
	}
}
