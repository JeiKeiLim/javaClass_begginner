package com.jk.helloworld.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfExample {
	public static void main_for(String[] args)
	{
		for(int i=0; i<100; i++)
		{
			System.out.println("i = " + i);
		}
	}
	
	public static void main_if(String[] args)
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int iVar = 0;
		int iRet = 0;
		
		System.out.println("정수를 입력하세요");
		try {
			iVar = Integer.parseInt(in.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
        iRet = iVar % 10;
        System.out.println("10으로 나눈 나머지 : " + iRet);

        if (iRet == 5) {             
            iVar = 0;                 
            System.out.println(iVar); 
            System.exit(0);
        }

        iVar++;
        System.out.println(iVar);

	}
}
