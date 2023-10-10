package com.app.fruits;

public class Mango extends Fruit{
	
	public Mango(String c,double w,String name,boolean f)
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
		return "sweet";
	}
	public void pulp()
	{
		System.out.println("Name:"+super.getName()+"color:"+super.getColor()+"creating pulp");
	}

//@Override
//public String nameOfFruit()
//{
//	return "Name of fruit: "+super.getName();
//}

}
