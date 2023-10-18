package utils;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;

import com.core.Customer;
import com.core.ServicePlan;

import custome_exec.CustomerValidationException;

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
		return ServicePlan.valueOf(plan);
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
//	public static void (String email,String pass,List<Customer> custList)
//	{
//		Customer cust = new Customer(email,pass);
//		return custList.contains(cust);
//	}
}
