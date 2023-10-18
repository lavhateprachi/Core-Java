package com.core;

public enum ServicePlan {

	SILVER(1000),GOLD(2000),DIAMOND(5000),PLATINUM(10000);

	private int price;
	
	ServicePlan(int price) {
		// TODO Auto-generated constructor stub
		this.price=price;
		
	}
	public int getPrice()
	{
		return price;
	
	}
	public String toString()
	{
		return "Name: "+name()+"  Price: "+getPrice();
	}
	
	
}
