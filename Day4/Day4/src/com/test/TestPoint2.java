package com.test;

import java.util.Scanner;

import com.cdac.tester.Point2D;
import com.core.PlotPoint;

public class TestPoint2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean flag=false;
		
		System.out.println("Enter size:");
		PlotPoint[] p = new PlotPoint[sc.nextInt()];
		
				
		while(!flag)
		{
			System.out.println("Enter the choice"+"1. Plot a point"+"2.Display the coordinate:"+"3.Accept two indices "+"0.Exit");
				
				switch (sc.nextInt())
				{
				    case 1:
				    	System.out.println("Enter index: ");
				    	int i=sc.nextInt();
				    	
				    	if(i>=0 && i<p.length)
				    	{
					    	if(p[i]==null)
							{
					    		System.out.println("Enter x and y co-ordinates: ");
								int x=sc.nextInt();
								int y=sc.nextInt();	
								
								p[i]=new PlotPoint(x,y);
							}
					    	else 
					    	{
					    		System.out.println("Points Already Present....");
					    	}
									
				    	}
				    	
				    	break;
					
			
					case 2:
						for(PlotPoint point:p)
						{
							System.out.println("Points Are: "+point.show());
						}
						break;
					case 3:
						System.out.println("Enter Two indices: ");
						int a=sc.nextInt();
						int b= sc.nextInt();
						
						if(a<p.length && b<p.length)
						{
							System.out.println("Check for equality:");
							if(p[a].isEqual(p[b]))
							{
								System.out.println("Calculate Distance: ");
								double distance=p[a].calculateDistance(p[b]);
								System.out.println("Distance:"+distance);
							}
							else {
								System.out.println("Points are not equal..");
							}
						}
						else
						{
							System.out.println("Invalid Indices...");
						}
						break;
					case 0:
						flag = true;
						break;
				}
		}
	}

}
