import java.util.Scanner;
class Calculation{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 2 Numbers: ");
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		System.out.println("1.Add");
		System.out.println("2.Sub");
		System.out.println("3.Multiply");
		System.out.println("4.Divide");
		int choice;
		
		boolean exit = true;
		
		while(exit)
		{
			System.out.println("Enter Choice: ");
		    choice=sc.nextInt();
			
			switch(choice)
			{
				case 1:
					System.out.println("Addition of " +num1+"+"+num2+"="+(num1+num2));
					break;
				
				case 2:
					System.out.println("Subtraction of " +num1+"-"+num2+"="+(num1-num2));
					break;
					
				case 3:
					System.out.println("Multiplication of " +num1+"*"+num2+"="+(num1*num2));
					break;
					
				case 4:
					System.out.println("Division of " +num1+"/"+num2+"="+(num1/num2));
					break;
					
				case 5:
					exit = false;
					break;
				default:
					System.out.println("Invalid Choice....");
					break;
			}
		}
		
	}
}