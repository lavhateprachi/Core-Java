package com.cdac.core;
import com.cdac.tester.TestBox;
import java.util.Scanner;

public class Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double width=0.0;
		System.out.println("Enter Size of Array: ");
		TestBox[] boxes=new TestBox[sc.nextInt()];
		
		for(int i=0;i<boxes.length;i++)
		{
			System.out.println("Enter Dimension Of Box w d h: ");
			boxes[i]=new TestBox(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		}
		for (TestBox d: boxes)
		{
			System.out.println(d.getBoxDetails());
			System.out.println("Volume: "+d.getBoxVolume());
			if(d.getBoxVolume()>100)
			{
				width=d.getWidth();
			}
			System.out.println("Updated Width: "+width);
			
		}
		for(int i=0;i<boxes.length;i++)
		{
			System.out.println("Box Dimensions: "+boxes[i].getBoxDetails());
		}
				
		sc.close();
	    
	}

}
