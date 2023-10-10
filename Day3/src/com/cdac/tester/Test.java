package com.cdac.tester;
import com.cdac.core.Pointer2D;
import java.util.Scanner;

class Test{
	
	public static void main(String[] args)
	{
		
		int x1,y1;
		int x2,y2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x1 and y1 Co-ordinates:");
		x1=sc.nextInt();
		y1=sc.nextInt();
		
		
		Pointer2D p1 = new Pointer2D();
		p1.setData(x1,y1);
		System.out.println("p1 Value: "+p1.show());
		
		System.out.println("Enter x2 and y2 Co-ordinates:");
		x2=sc.nextInt();
		y2=sc.nextInt();
		
		Pointer2D p2 = new Pointer2D();
		p2.setData(x2,y2);
		System.out.println("p2 Value: "+p2.show());
		
		//System.out.println("compare both object : "+p1.isEqual(p2));
		
		if(p1.isEqual(p2))
		{
			System.out.println("SAME Object");
		}
		else
		{
			System.out.println("DIFFERENT Object");
			
		}
		System.out.println("Distance Between Two Co-ordinates : "+p1.calculateDistance(p2));
	}
}