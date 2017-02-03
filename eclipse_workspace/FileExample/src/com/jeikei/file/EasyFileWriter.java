package com.jeikei.file;

import java.io.FileWriter;
import java.io.IOException;

public class EasyFileWriter extends EasyFileOpener{
	
	FileWriter fWriter;

	public EasyFileWriter(String fileName) {
		super(fileName);
		
		try {
			fWriter = new FileWriter(super.getFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void writeFile(String msg)
	{
		try {
			fWriter.write(msg);
			fWriter.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void close()
	{
		try {
			fWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
