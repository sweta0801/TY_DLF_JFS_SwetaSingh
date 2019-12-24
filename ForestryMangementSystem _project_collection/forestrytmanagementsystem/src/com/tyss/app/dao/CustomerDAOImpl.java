package com.tyss.app.dao;

import java.util.ArrayList;
import java.util.List;

import com.tyss.app.bean.CustomerBean;

public class CustomerDAOImpl implements CustomerDAO {

	private List<CustomerBean> customerbean = new ArrayList<CustomerBean>();

	@Override
	public List<CustomerBean> getAllCustomer() {
		
		return customerbean;
	}

	@Override
	public boolean insertCustomer(CustomerBean customer) {

		for (CustomerBean customerBean2 : customerbean) {

			if (customer.getCustomerId() == customerBean2.getCustomerId()) {
				return false;
			}
		}
		customerbean.add(customer);
		return true;

	}

	@Override
	public boolean deleteCustomer(int customerId) {
		
		for (CustomerBean customerBean2 : customerbean) {
			if(customerBean2.getCustomerId() == customerId) 
			{
				customerbean.remove(customerBean2);
				return true;
			}
		}
		return false;	
	}

	@Override
	public boolean upadteCustomer(int customerId, String newEmail)
	{
		for (CustomerBean customerBean2 : customerbean) 
		{
			if(customerBean2.getCustomerId() == customerId) 
			{
				customerBean2.setEmail(newEmail);
				return true;
			}
		}

		return false;
	}
	}



