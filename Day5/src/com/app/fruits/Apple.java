package com.app.fruits;

public class Apple extends Fruit {

	public Apple(String c,double w,String name,boolean f)
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
		return "sweet n sour";
	}
	public void jam()
	{
		System.out.println("Name:"+super.getName()+"color:"+super.getColor()+"making jam");
	}

@Override
public String nameOfFruit()
{
	return "Name of fruit: "+super.getName();
}

}

