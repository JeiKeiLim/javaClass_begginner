import java.util.Scanner;

import com.jeikei.data.MakeAverage;

public class Main {
	public static void main(String[] args)
	{
		MakeAverage mAverage = new MakeAverage();
		Scanner scan= new Scanner(System.in);
		
		while(true)
		{
			String currentTxt = scan.nextLine();
			
			if(currentTxt.compareTo("q!") == 0)
				break;
			else
			{
				try{
					int currentValue = Integer.parseInt(currentTxt);
					mAverage.addValue(currentValue);
					
					System.out.println("현재 평균은 " + mAverage.getAverage() + "입니다");
				} catch(NumberFormatException e) {
					System.out.println("잘못 입력 하셨습니다. 다시 입력 해주세요");
				}
			}
		}
		
		System.out.println("\ntemp의 평균은 " + mAverage.getAverage() +
							"입니다.\n" +
				"temp의 편차는 " + mAverage.getVariance() + "입니다.\n" + 
				"temp의 크기는 " + mAverage.getSize() + "입니다");
	}
}
