package com.app.fruits;

abstract public class Fruit {
private String color;
private double weight;
private String name;
private boolean fresh;

public Fruit(String color,double weight,String name,boolean fresh)
{
	this.color=color;
	this.weight=weight;
	this.name=name;
	this.fresh=fresh;
}

public boolean getFresh()
{
	fresh=false;
	return fresh;
}
public String getColor()
{
	return color;
}
public String getName()
{
	return name;
}
public double getweight()
{
	return weight;
}
@Override
public String toString()
{
	//return "Name: "+this.name+" \nColor: "+this.color+"\n Weight: "+this.weight;
	return "Name: "+this.name+" \nColor: "+this.color+"\nWeight: "+this.weight;
	
}
abstract public String taste();

public String nameOfFruit()
{
	return "Name of fruit: "+name;
}

}
