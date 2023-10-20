package com.compare;

import java.util.Comparator;

import com.core.Customer;

public class CustomerCompare implements Comparator<Customer> {

	@Override
	public int compare(Customer c1, Customer c2) {
		System.out.println("In compare");
		int value= c1.getdob().compareTo(c2.getdob());
		int name=c1.lastname().compareTo(c2.lastname());
		if(value<0)
			return -1;
		if(value>0)
			return 1;
	
		return 0;
	}

}
