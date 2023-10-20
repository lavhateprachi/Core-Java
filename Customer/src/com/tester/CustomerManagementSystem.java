package com.tester;
import utils.CustomerValidationRule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.compare.CustomerCompare;
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
				System.out.println("Options: \n1.Add Customer \n2.DisplayAll "
						+ "\n3.Sign In \n4.Update Password \n5.Unsubscribe Customer \n6.Sort Customer \n0.Exit");
				System.out.println("\nEnter Choice: ");
				switch(sc.nextInt())
				{
					case 1:
						System.out.println("Enter Customer Details: FistName,LastName,Email,"
								+ "Password,regAmount,dateOfBirth,servicePlan");
						
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
					case 3:
							System.out.println("Enter Email and Password: ");
							
							String mail=sc.next();
							String pass=sc.next();
							
						    CustomerValidationRule.checkSignIn(mail, pass, custList);
							System.out.println("Login Successfull....");
							
						break;
					case 4:
						System.out.println("Enter email,old password,new Password: ");
						String email = sc.next();
						String oldPass = sc.next();
						CustomerValidationRule.checkSignIn(email,oldPass,custList);
						System.out.println("Enter new password: ");
						String newPass=sc.next();
						CustomerValidationRule.changePass(email, oldPass, newPass, custList);
						System.out.println("Password updated successfully.....");
						break;
						
					case 5:
						System.out.println("Enter email and password");
						email=sc.next();
						pass=sc.next();
						
						CustomerValidationRule.checkSignIn(email, pass, custList);
						CustomerValidationRule.unsubscribe(email,pass,custList);
						System.out.println("Customer unsubscribed successfully.....");
						
						break;
					case 6:
						Collections.sort(custList);
						System.out.println("Data after sorted...");
						for(Customer c: custList)
							System.out.println(c);
						break;
					case 7:
						Collections.sort(custList,new CustomerCompare());
						System.out.println("Data After Sort");
						for(Customer c: custList)
							System.out.println(c);
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
