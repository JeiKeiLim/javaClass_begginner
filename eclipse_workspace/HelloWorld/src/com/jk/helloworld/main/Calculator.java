package com.jk.helloworld.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

	public static void main(String[] args)
	{
        BufferedReader in = new BufferedReader
                (new InputStreamReader(System.in));

		double left=0, right=0;
		double retValue = 0;
		char op=0;
		
		try {
			
			System.out.println("ù��° ���ڸ� �Է����ּ���");
			left = Double.parseDouble(in.readLine());
			System.out.println("�ι�° ���ڸ� �Է����ּ���");
			right = Double.parseDouble(in.readLine());
			
			System.out.println("� ������ �Ͻðڽ��ϱ�?(+,-,*,/)");
			op = in.readLine().charAt(0);
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("���ڸ� �Է��ؾ��մϴ�!");
			System.exit(0);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		switch(op)
		{
			case '+':
				retValue = left + right;
				break;
			case '-':
				retValue = left - right;
				break;
			case '*':
				retValue = left * right;
				break;
			case '/':
				retValue = left / right;
				break;
				
			default:
				System.out.println("�߸��� ������ �Դϴ�.");
				System.exit(0);
		}

		System.out.printf("%f %c %f = %f\n", left, op, right, retValue);
		
	}
}
