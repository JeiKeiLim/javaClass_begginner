package com.jeikei.file;

public class Main {
	
	public static void main(String[] args)
	{
		EasyFileReader fSourceReader = new EasyFileReader("aaa.txt");
		EasyFileWriter fSourceWriter = new EasyFileWriter("aaa.txt");
		EasyFileReader fTargetReader = new EasyFileReader("bbb.txt");
		EasyFileWriter fTargetWriter = new EasyFileWriter("bbb.txt");
		
		fSourceWriter.writeFile("Hello Java from easy class!");
		System.out.println(fSourceReader.getFileName() + "의 내용은 " + fSourceReader.readFile() + "입니다");
		
		fTargetWriter.writeFile(fSourceReader.readFile());
		System.out.println(fTargetReader.getFileName() + "의 내용은 " + fTargetReader.readFile() + "입니다");
	
		fSourceReader.close();
		fSourceWriter.close();
		fTargetReader.close();
		fTargetWriter.close();
		
	}
	
}
