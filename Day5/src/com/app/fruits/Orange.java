package com.app.fruits;

public class Orange extends Fruit {
	public Orange(String c,double w,String name,boolean f)
{
	super(c,w,name,f);
}
	
@Override
public String toString()
{
	return "Name: "+super.getName()+" \nColor: "+super.getColor()+"\n Weight: "+super.getweight();
}
public String taste()
{
	return "sour";
}
public void juice()
{
	System.out.println("Name:"+super.getName()+"color:"+super.getColor()+"Extracting juice:");
}

//@Override
//public String nameOfFruit()
//{
//	return "Name of fruit: "+super.getName();
//}

}
