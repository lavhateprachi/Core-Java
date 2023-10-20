package utils;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;

import com.core.Customer;
import com.core.ServicePlan;

import custom_exce.CustomerValidationException;

public class CustomerValidationRule {

	//Check for Duplicates
	public static void checkDup(String email,List<Customer> customerList) 
			throws CustomerValidationException
	{
		Customer newCust = new Customer(email);
		if(customerList.contains(newCust))
		{
			throw new CustomerValidationException("Duplicates Are NOT Allowed...");
		}
		System.out.println("No Duplicates...");
	}
	
	//In Case of Invalid service plan
	public static ServicePlan validatePlan(String plan) throws IllegalArgumentException
	{
		return ServicePlan.valueOf(plan.toUpperCase());
	}
	
	
	//Registration amount must match with service plan
	public static boolean validRegAmount(ServicePlan plan,double amount)
	{
		
		return amount==plan.getPrice();	
	}
	
	
	//parse Date of Birth
	public static LocalDate parseDOB(String date)
	{
		LocalDate dob = LocalDate.parse(date);
		return dob;
	}
	
	
	//add customer in existing customer list
	public static Customer validateAllInput(String fname,String lname,String email,String pass,
			double amount,String dob,String plan, List<Customer> customerList) 
					throws CustomerValidationException,IllegalArgumentException, DateTimeParseException
	{
		checkDup(email, customerList);
		ServicePlan splan = validatePlan(plan);
		validRegAmount(validatePlan(plan), amount);
		LocalDate dateOfBirth = parseDOB(dob);
		return new Customer(fname,lname,email,pass,amount,dateOfBirth,splan);
		
	}
	
	//for signIn 
	public static Customer checkSignIn(String email,String password,List<Customer> custList) throws CustomerValidationException
	{
		Customer customerEmail = new Customer(email);
		int index = custList.indexOf(customerEmail);
		
		if(index < 0)
		{
			throw new CustomerValidationException("Invalid Email");
		}
		
		//for valid email
		Customer cust = custList.get(index);
	     if(!cust.getPassword().equals(password))
	     {
	    	 throw new CustomerValidationException("Invalid Password...");
	     }
	     return cust;
	}
	
	//change password
	public static void changePass(String email,String oldPass,String newPass,List<Customer> custList) 
	throws CustomerValidationException
	{
		System.out.println("Change Password Method....");
		Customer c = new Customer(email);
		int index = custList.indexOf(c);
		Customer valid = custList.get(index);
		valid.setPassword(newPass);
		
	}
	//unsubscribe customer
	
	public static void unsubscribe(String email,String pass,List<Customer> custList)
	{
		Customer c = new Customer(email);
		int index = custList.indexOf(c);
		
		custList.remove(index);
	}
}
