package com.app.tester;
import java.util.Scanner;

import com.app.fruits.*;

public class tester {

	public static void main(String[] args) {
//		
//		Fruit fruit= new Fruit("Yellow",5.0,"Banana",true);
//		Fruit apple =new Apple("Red",1.00,"Apple",true);
//		
//		Fruit mango = new Mango("Green",3.0,"Mango",true);
//		Fruit orange = new Orange("Orange",3.0,"Orange",true);
//		//System.out.println(fruit);
//		//System.out.println(apple);
//		//System.out.println(mango);
//		System.out.println(orange);
//		System.out.println(orange.taste());
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the size of array:");
		
		Fruit[] f=new Fruit [sc.nextInt()];
		
		boolean exit=false;
		int count=0;
		while(!exit)
		{
			System.out.println("enter the choice:"+"1.Add Mango"
		                       +"\n2.Add Apple"+"\n3.Add Orange"+"\n4.Display All Fruits Name"+
					           "\n5.Display All Fruits"+"\n6.Mark Fruit"+"\n7.Mark All sour"+
		                       "\n8.Invoke Fruit specific"+"\n9.Exit");
			
			System.out.println("enter the choice");
			switch(sc.nextInt())
			{
			    case 1:
			    	if(count<f.length)
			    	{
			    		System.out.println("Enter color,weight,name,state");
			    		f[count] =new Mango(sc.next(),sc.nextDouble(),sc.next(),sc.nextBoolean());
			    		count++;
			    		System.out.println("Mango Details Enter..");
			    	}else
			    	{
			    		System.out.println("Basket is full");
			    	}
			    	break;
			    case 2:
			    	if(count<f.length)
			    	{
			    		System.out.println("Enter color,weight,name,state");
			    		f[count] =new Apple(sc.next(),sc.nextDouble(),sc.next(),sc.nextBoolean());
			    		count++;
			    		System.out.println("Apple Details Enter..");
			    	}else
			    	{
			    		System.out.println("Basket is full");
			    	}
			    	break;
			    case 3:
			    	if(count<f.length)
			    	{
			    		System.out.println("Enter color,weight,name,state");
			    		f[count] =new Orange(sc.next(),sc.nextDouble(),sc.next(),sc.nextBoolean());
			    		count++;
			    		System.out.println("Orange Details Enter..");
			    	}else
			    	{
			    		System.out.println("Basket is full");
			    	}
			    	break;
			    case 4:
			    		for(Fruit fruit:f)
			    		{
			    			System.out.println("Name of fruit: "+fruit.nameOfFruit());
			    		}
			    	break;
			    case 5:
			    	System.out.println("Display Name,color,weight and taste: ");
			    	for(Fruit fr: f)
			    	{
			    		System.out.println(fr.toString());
			    		System.out.println("Taste: "+fr.taste());
			    		System.out.println("\n");
			    	}
			    case 6:
			    	System.out.println("Enter index: ");
			    	int index=sc.nextInt();
			    	if(index<f.length)
			    	{
				    		if(f[index].getFresh()==false)
				    		{
				    			System.out.println("State of fruit"+f[index].getName()+"is not fresh");	
				    		}
				    		else
				    		{
				    			System.out.println("State of fruit"+f[index].getName()+"is fresh");	
				    		}
			    	}
			    	else
			    	{
			    		System.out.println("Invalid Index...");
			    	}
			    	break;
			    
			    case 7:
			    	System.out.println("Enter index: ");
			        index=sc.nextInt();
			    	if(index<f.length)
			    	{
				    		if(f[index].taste().equals("sour") )
				    		{
				    			f[index].getFresh();
				    		}
				    		else
				    		{
				    			System.out.println("State of fruit "+f[index].getName()+" is fresh");	
				    		}
			    	}
			    	else
			    	{
			    		System.out.println("Invalid Index...");
			    	}
			    case 9:
			    	
			    	exit=true;
			    	break;
			}
			
			
		}
		
		
	}
	

}
