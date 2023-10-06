
import java.lang.Math;
class Pointer2D
{
	private int x;
	private int y;
	
	
	Pointer2D()
	{
		x=0;
		y=0;
	}
	Pointer2D(int a,int b)
	{
		x=a;
		y=b;
	}
	void setData(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	public String show()
	{
		return "x and y Co-ordinates are : "+this.x+" "+this.y;
	}
	boolean isEqual(Pointer2D p)
	{
		if(this.x==p.x && this.y==p.y)
			return true;
		else
			return false;
	}
	
	double calculateDistance(Pointer2D p1)
	{
		
		double distance;
		
		distance=((p1.x-this.x)*(p1.x-this.x))-((p1.y-this.y)*(p1.y-this.y));
		return Math.sqrt(distance);
		
		
	}

}