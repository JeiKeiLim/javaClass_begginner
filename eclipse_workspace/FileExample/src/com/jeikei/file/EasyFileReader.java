package com.jeikei.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EasyFileReader extends EasyFileOpener{
	private char[] buffer = new char[2048];
	private FileReader fReader;

	public EasyFileReader(String fileName) {
		super(fileName);
		
		try {
			fReader = new FileReader(super.getFile());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일을 찾을 수 없습니다.");
			fReader = null;
		}
	}
	
	public String readFile()
	{
		if(fReader == null)
			return "";
		
		String result = "";
		
		try {
			int readSize = fReader.read(buffer);
			result = new String(buffer, 0, readSize);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public void close()
	{
		try {
			fReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
