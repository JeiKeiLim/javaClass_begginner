package com.jeikei.file;

import java.io.File;
import java.io.IOException;

public class EasyFileOpener {
	private File file;
	
	public EasyFileOpener(String fileName)
	{
		file = new File(fileName);
		checkFileExist();
	}
	
	private void checkFileExist()
	{
		if(!file.exists())
		{
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("������ ������ �� �����ϴ�.");
				System.exit(0);
			}
		}
	}
	
	public String getFileName()
	{
		return file.getName();
	}
	
	public File getFile()
	{
		return file;
	}
}
