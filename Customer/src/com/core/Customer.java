package com.core;

import java.time.LocalDate;

public class Customer {

	static int counter;
	private int cust_id;
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private double regAmount;
	//LocalDate dob;
	private LocalDate dob;
	ServicePlan plan;
	
	
	static 
	{
		counter=1;
	}


	public Customer(String firstname, String lastname, String email, String password, double regAmount,
			LocalDate dob, ServicePlan plan) {
		super();
		this.cust_id = counter++;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.regAmount = regAmount;
		this.dob = dob;
		this.plan = plan;
	}
	
	public Customer(String email)
	{
		super();
		this.email=email;
	}
	public Customer(String email,String pass)
	{
		super();
		this.email=email;
		this.password=pass;
	}

	@Override
	public String toString() {
		return "Customer [cust_id=" + cust_id + ", firstname=" + firstname + ","
				+ " lastname=" + lastname + ", email="
				+ email + ", password=" + password + ", "
				+ "regAmount=" + regAmount + ", dob=" + dob + ", ServicePlan: " + plan
				+ "]";
		
	}
	public boolean equals(Object o)
	{
		System.out.println("In Equals Method...");
		if(o instanceof Customer)
		{
			Customer anotherCust=(Customer)o;
			return this.email.equals(anotherCust.email);
		}
		return false;
		
	}
	
	
}
