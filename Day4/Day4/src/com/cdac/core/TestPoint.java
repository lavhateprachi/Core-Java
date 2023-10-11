package com.cdac.core;
import java.util.Scanner;

import com.cdac.tester.Point2D;
public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size: ");
		Point2D[] point = new Point2D[sc.nextInt()];
		
		for(int i=0;i<point.length;i++)
		{
			System.out.println("Enter x and y co-ordinates: ");
			point[i]=new Point2D(sc.nextInt(),sc.nextInt());
				
		}
		for(Point2D p:point)
		{
			System.out.println("Points Are: "+p.show());
		}
		System.out.println("Take Input From User :");
		for(int i=0;i<point.length;i++)
		{
			if(sc.nextInt()==point[i].getX() && sc.nextInt()==point[i].getY())
			{
				System.out.println("Co-ordinates already present");
			}
		}
		
		sc.close();
	}

}
