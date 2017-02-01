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
			
			System.out.println("첫번째 숫자를 입력해주세요");
			left = Double.parseDouble(in.readLine());
			System.out.println("두번째 숫자를 입력해주세요");
			right = Double.parseDouble(in.readLine());
			
			System.out.println("어떤 연산을 하시겠습니까?(+,-,*,/)");
			op = in.readLine().charAt(0);
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("숫자를 입력해야합니다!");
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
				System.out.println("잘못된 연산자 입니다.");
				System.exit(0);
		}

		System.out.printf("%f %c %f = %f\n", left, op, right, retValue);
		
	}
}
