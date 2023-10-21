package com.tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

import com.acts.core.Course;
import com.acts.core.Student;

public class PopulateData {

	public static ArrayList<Student> populateData()
	{
		ArrayList<Student> stdList= new ArrayList<Student>();
		
		stdList.add(new Student("1901","Richa","Singhal",95,Course.DAC,LocalDate.parse("2021-12-05")));
		stdList.add(new Student("1902","Neha","Sharma",80,Course.DAI,LocalDate.parse("2001-11-16")));
		stdList.add(new Student("1903","Aditi","Gupta",75,Course.DBDA,LocalDate.parse("2002-05-25")));
		stdList.add(new Student("1904","Nisha","Gupta",90,Course.DITISS,LocalDate.parse("2011-07-12")));
		stdList.add(new Student("1905","Isha","Mishra",65,Course.DAC,LocalDate.parse("2005-10-12")));
		
		return stdList;
		
	}
	
	public static HashMap<String,Student> populateMap(ArrayList<Student> stdList)
	{
		HashMap<String,Student> stdMap = new HashMap<String, Student>();
		for(Student s:stdList)
		{
			System.out.println(stdMap.put(s.getPrn(), s));
		}
		return stdMap;
	}
}
