package com.core;

import static java.lang.Math.sqrt;

public class PlotPoint {

		
			private int x;
			private int y;
			
			
			public PlotPoint()
			{
				x=0;
				y=0;
			}
			public PlotPoint(int a,int b)
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
			public boolean isEqual(PlotPoint p)
			{
				if(this.x==p.x && this.y==p.y)
					return true;
				else
					return false;
			}
			
			public int getX() {
				return x;
			}
			public void setX(int x) {
				this.x = x;
			}
			public int getY() {
				return y;
			}
			public void setY(int y) {
				this.y = y;
			}
			public double calculateDistance(PlotPoint p1)
			{
				
				double distance;
				
				distance=((p1.x-this.x)*(p1.x-this.x))-((p1.y-this.y)*(p1.y-this.y));
				return sqrt(distance);
				
				
			}

}


