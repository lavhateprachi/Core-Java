class Test{
	
	public static void main(String[] args)
	{
		Pointer2D p1 = new Pointer2D(6,5);
		System.out.println("p1 Value: "+p1.show());
		
		Pointer2D p2 = new Pointer2D(2,5);
		System.out.println("p2 Value: "+p2.show());
		
		//System.out.println("compare both object : "+p1.isEqual(p2));
		
		if(p1.isEqual(p2)==true)
		{
			System.out.println("SAME Object");
		}
		else
		{
			System.out.println("DIFFERENT Object");
			
		}
		System.out.println("Distance Between Two Co-ordinates : "+p1.calculateDistance(p2));
	}
}