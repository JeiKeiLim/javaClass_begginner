import java.util.Scanner;

import com.jeikei.data.MakeAverage;

public class MainAverage {
	public static void main_average(String[] args)
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
					
					System.out.println("���� ����� " + mAverage.getAverage() + "�Դϴ�");
				} catch(NumberFormatException e) {
					System.out.println("�߸� �Է� �ϼ̽��ϴ�. �ٽ� �Է� ���ּ���");
				}
			}
		}
		
		System.out.println("\ntemp�� ����� " + mAverage.getAverage() +
							"�Դϴ�.\n" +
				"temp�� ������ " + mAverage.getVariance() + "�Դϴ�.\n" +
				"temp�� ǥ�������� " + mAverage.getStandardVariance() + "�Դϴ�.\n" +
				"temp�� ũ��� " + mAverage.getSize() + "�Դϴ�");
	}
}