package com.jeikei.scoreapp;

public class Student {
	Subject[] subjects;
	String studentName;
	
	public Student(String studentName, String[] subjectNames)
	{
		this.studentName = studentName;
		
		subjects = new Subject[subjectNames.length];
		
		for(int i=0; i<subjectNames.length; i++)
		{
			subjects[i] = new Subject(subjectNames[i]);
		}
	}
	
	public void setScore(int index, int score)
	{
		subjects[index].score = score;
	}
	
	private Subject getMatchedSubject(String subjectName)
	{
		for(int i=0; i<subjects.length; i++)
		{
			if(subjects[i].getName().compareTo(subjectName) == 0)
			{
				return subjects[i];
			}
		}
		
		return null;
	}
	
	public void setScore(String subjectName, int score)
	{
		Subject matchedSubject = getMatchedSubject(subjectName);
		
		if(matchedSubject != null)
			matchedSubject.score = score;
	}
	
	public int getScore(int index)
	{
		return subjects[index].score;
	}
	
	public int getScore(String subjectName)
	{
		Subject matchedSubject = getMatchedSubject(subjectName);
		if(matchedSubject != null)
			return matchedSubject.score;
		else
			return -1;
	}
	
	public void printAllSubjectNames()
	{
		System.out.println(":: 수강 과목 목록 ::");
		for(int i=0; i<subjects.length; i++)
		{
			System.out.println( (i+1) + ". " + subjects[i].getName() );
		}
	}
	
	public void printAllSubjectScores()
	{
		System.out.println(":: 수강 과목 점수 ::");
		for(int i=0; i<subjects.length; i++)
		{
			System.out.println( (i+1) + ". " + 
								subjects[i].getName() + " : " +
								subjects[i].score +"점");
		}
	}
	
	public double getAverageScore()
	{
		double result = 0;
		
		for(Subject subject : subjects)
		{
			result += subject.score;
		}
		
		return result / subjects.length;
	}
}
