package com.jeikei.scoreapp;

public class Main {
	
	public static void main(String[] args)
	{
		Student me = new Student("������",
				new String[]{"�ڹ�", "���̽�", 
						"��ü����", "�ڷᱸ��"});
		Student other = new Student("�ٸ� ���",
				new String[]{"�ڹ�", "���̽�", 
						"��ü����", "�ڷᱸ��"});
		
		me.setScore("�ڹ�", 60);
		me.setScore("���̽�", 80);
		me.setScore("��ü����", 70);
		me.setScore("�ڷᱸ��", 30);
		
		me.printAllSubjectScores();
		
		System.out.println(me.studentName + "�� ����� " +
						me.getAverageScore() + "�Դϴ�");
		
	}
}
