package com.jeikei.scoreapp;

public class Main {
	
	public static void main(String[] args)
	{
		Student me = new Student("임종국",
				new String[]{"자바", "파이썬", 
						"객체지향", "자료구조"});
		Student other = new Student("다른 사람",
				new String[]{"자바", "파이썬", 
						"객체지향", "자료구조"});
		
		me.setScore("자바", 60);
		me.setScore("파이썬", 80);
		me.setScore("객체지향", 70);
		me.setScore("자료구조", 30);
		
		me.printAllSubjectScores();
		
		System.out.println(me.studentName + "의 평균은 " +
						me.getAverageScore() + "입니다");
		
	}
}
