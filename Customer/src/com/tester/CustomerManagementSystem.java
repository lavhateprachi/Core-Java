package com.tester;
import utils.CustomerValidationRule;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.core.Customer;

public class CustomerManagementSystem {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in))
		{
			//
			List<Customer> custList = new ArrayList<>();
			
			boolean exit = false;
			while(!exit)
			{
				System.out.println("1.Add Customer \n 2.DisplayAll \n 0.Exit");
				switch(sc.nextInt())
				{
				case 1:
					System.out.println("Enter Customer Details: FistName,LastName,Email,Password,"
							+ "regAmount,dateOfBirth,servicePlan");
					
					Customer valid =CustomerValidationRule.validateAllInput(sc.next(),sc.next(),
							sc.next(),sc.next(),
							sc.nextDouble(),
							sc.next(),
							sc.next(),custList);
					
					custList.add(valid);
					break;
				case 2:
					System.out.println("Customer Details: ");
					for(Customer c: custList)
					{
						System.out.println(c);
					}
					break;
				case 0:
					exit=true;
					break;
				}
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
