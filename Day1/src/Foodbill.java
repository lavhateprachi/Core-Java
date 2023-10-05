import java.util.Scanner;
class Foodbill
{
	public static void main(String[]args)
	{
       Scanner sc = new Scanner(System.in);
        //System.out.println("Menu \t\t Price");
        System.out.println("1.Dosa");
		System.out.println("2.Samosa");
		System.out.println("3.Idli");
		System.out.println("4.Poha");
		System.out.println("5.Uttapam");
		System.out.println("6.Sevai Upma");
		System.out.println("7.Vada PAV");
		System.out.println("8.Missal Pav");
        System.out.println("9.Pav Bhaji");
		System.out.println("10.Generate Bill");
		System.out.println("11.Exit");
		int choice;
        int qty;
		int sum=0;
		boolean m = true;
		while(m)
		{    
			System.out.println("select menu");
			choice = sc.nextInt();
			 
			  switch(choice)
			  { 
				case 1:
					System.out.println("Price for Dosa: Rs.50");
					System.out.println("Enter quantity: ");
					qty=sc.nextInt();
					sum=sum+qty*50;
					break;
				case 2:
					System.out.println("Price for Samosa: Rs.20");
					System.out.println("Enter quantity: ");
					qty=sc.nextInt();
					sum=sum+qty*20;
					break;
				case 3:
					System.out.println("Price for Idli: Rs.25");
					System.out.println("Enter quantity: ");
					qty=sc.nextInt();
					sum=sum+qty*25;
					break;
					
				case 4:
					System.out.println("Price for Poha: Rs.20");
					System.out.println("Enter quantity: ");
					qty=sc.nextInt();
					sum=sum+qty*20;
					break;
				case 5:
					System.out.println("Price for Utppam: Rs.20");
					System.out.println("Enter quantity: ");
					qty=sc.nextInt();
					sum=sum+qty*20;
					break;
				case 6:
					System.out.println("Price for Sevai Upma: Rs.25");
					System.out.println("Enter quantity: ");
					qty=sc.nextInt();
					sum=sum+qty*25;
					break;
					
					
				case 7:
					System.out.println("Price for Vada Pav: Rs.10");
					System.out.println("Enter quantity: ");
					qty=sc.nextInt();
					sum=sum+qty*10;
					break;
				case 8:
					System.out.println("Price for Missal Pav: Rs.20");
					System.out.println("Enter quantity: ");
					qty=sc.nextInt();
					sum=sum+qty*20;
					break;
				case 9:
					System.out.println("Price for Pav Bhaji: Rs.50");
					System.out.println("Enter quantity: ");
					qty=sc.nextInt();
					sum=sum+qty*50;
				case 10:
					System.out.println(" Your Bill is:"+sum); 
					System.out.println("Come Again....");
					break;
				case 11:
					m=false;
					break;
				default:
					System.out.println("Invalid Choice....");
					break;
			  
			  

		      }
		}
	}
}