package com.cdac.tester;

public class TestBox {
	private double width;
	private double depth;
	private double height;
	
	public TestBox(double w, double d, double height) {
		width = w;
		depth = d;
		this.height = height;
	}

	public String getBoxDetails() {

		//System.out.println("this from instance method " + this);
		return "Box dims are " + this.width + " " + this.depth + " " + this.height;
	}

	public double getBoxVolume() {
		return width * depth * height;
	}
	public double getWidth()
	{
		return this.width*2;
	}

}
