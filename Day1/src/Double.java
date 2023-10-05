import java.util.Scanner;
class Double
{
public static void main(String[]args)
{
		Scanner sc = new Scanner(System.in);
		double avg=0;
		double d1,d2;
		boolean val1,val2;
		System.out.println("Enter two double nos:");
		
		val1=sc.hasNextDouble();
	    if(val1==true)
		{
			d1=sc.nextDouble();
			val2=sc.hasNextDouble();
			if(val2==true)
			{
			   d2=sc.nextDouble();
			   avg=(d1+d2)/2;
		    }
		}
		System.out.println("Average: "+avg);
      
 }
}
