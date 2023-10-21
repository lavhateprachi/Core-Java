package com.tester;
import com.acts.core.*;

import utils.ComparePRN;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

import static com.tester.PopulateData.*;
public class StudentManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Student> stdMap= populateMap(populateData());
		try(Scanner sc = new Scanner(System.in))
		{
			boolean exit=false;
			while(!exit)
			{
				System.out.println("Option: \n1.Display Data \n2.Sorted Data \n3.Exit");
				
				switch(sc.nextInt())
				{
					case 1:
						stdMap.values().forEach(s -> System.out.println(s));
						break;
					case 2:
//						stdMap.values()
//						.stream()
//						.sorted((s1,s2)->((Integer)s1.getMarks()).compareTo(s2.getMarks()))
//						.forEach(s -> System.out.println(s));
						
						ArrayList<Student> list = new ArrayList<Student>(stdMap.values());
						Collections.sort(list, new ComparePRN());
						for(Student s:list)
							System.out.println(s);
						break;
						
					case 3:
						
						
						break;
					case 4:
						exit=true;
						break;
				}
			}

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}

}
