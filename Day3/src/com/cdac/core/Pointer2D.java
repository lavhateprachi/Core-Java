package com.cdac.core;
import java.lang.Math;
public class Pointer2D
{
	private int x;
	private int y;
	
	
	public Pointer2D()
	{
		x=0;
		y=0;
	}
	public Pointer2D(int a,int b)
	{
		x=a;
		y=b;
	}
	public void setData(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	public String show()
	{
		return "x and y Co-ordinates are : "+this.x+" "+this.y;
	}
	public boolean isEqual(Pointer2D p)
	{
		if(this.x==p.x && this.y==p.y)
			return true;
		else
			return false;
	}
	
	public double calculateDistance(Pointer2D p1)
	{
		
		double distance;
		
		distance=((p1.x-this.x)*(p1.x-this.x))-((p1.y-this.y)*(p1.y-this.y));
		return Math.sqrt(distance);
		
		
	}

}