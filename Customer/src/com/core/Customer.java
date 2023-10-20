package com.core;

import java.time.LocalDate;

public class Customer implements Comparable<Customer>{

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

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	public String lastname() {
		return lastname;
	}
	public LocalDate getdob() {
		return dob;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 * @return 
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		
		return this.email.compareTo(o.email);
	}
	
	
}