package com.tyss.app.services;

import java.util.List;

import com.tyss.app.bean.CustomerBean;

public interface CustomerSerivces {
	
	public List <CustomerBean> getAllCustomer();
	public boolean InsertCustomer(CustomerBean customer);
	boolean deleteCustomer(int customerId);
	 boolean  upadteCustomer(int customerId , String email);
	
	

}
