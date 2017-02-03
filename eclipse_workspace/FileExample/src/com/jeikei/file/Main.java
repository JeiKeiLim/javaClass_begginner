package com.jeikei.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args)
	{
		char[] strStore = new char[16];
		
		File fSource = new File("aaa.txt");
		File fTarget = new File("bbb.txt");
		
		if(!fSource.exists())
		{
			System.out.println(fSource.getName() + " 파일이 존재하지 않아 새로 생성합니다.");
			try {
				fSource.createNewFile();
			} catch (IOException e) {
				System.out.println(fSource.getName() + "파일을 생성하는데 실패했습니다.");
				System.exit(0);
			}
		}
		
		if(!fTarget.exists())
		{
			System.out.println(fTarget.getName() + " 파일이 존재하지 않아 새로 생성합니다.");
			try {
				fTarget.createNewFile();
			} catch (IOException e) {
				System.out.println(fTarget.getName() + "파일을 생성하는데 실패했습니다.");
				System.exit(0);
			}
		}
		
		FileReader fSourceReader;
		FileWriter fSourceWriter;
		FileReader fTargetReader;
		FileWriter fTargetWriter;
		
		try {
			fSourceReader = new FileReader(fSource);
			fSourceWriter = new FileWriter(fSource);
			fTargetReader = new FileReader(fTarget);
			fTargetWriter = new FileWriter(fTarget);
			
			fSourceWriter.write("Hello Java!");
			fSourceWriter.flush();
			fSourceReader.read(strStore);
			System.out.println(fSource.getName() + "파일의 내용은 " + String.valueOf(strStore) + "입니다.");
			
			fTargetWriter.write(strStore);
			fTargetWriter.flush();
			fTargetReader.read(strStore);
			System.out.println(fTarget.getName() + "파일의 내용은 " + String.valueOf(strStore) + "입니다.");
			
			fSourceReader.close();
			fSourceWriter.close();
			fTargetReader.close();
			fTargetWriter.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일 접근에 실패 했습니다.");
			System.exit(0);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("파일 접근에 실패 했습니다.");
			System.exit(0);
		}
		
		
	}
	
}
