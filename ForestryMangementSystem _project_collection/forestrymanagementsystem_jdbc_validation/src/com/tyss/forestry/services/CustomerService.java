package com.tyss.forestry.services;

import java.util.List;

import com.tyss.forestry.bean.CustomerBean;

public interface CustomerService {
	
	List<CustomerBean> getAllCustomer();

	boolean insertCustomer(CustomerBean customer);

	boolean deleteCustomer(int customerId);

	boolean upadteCustomer(int customerId, String email);	

}
