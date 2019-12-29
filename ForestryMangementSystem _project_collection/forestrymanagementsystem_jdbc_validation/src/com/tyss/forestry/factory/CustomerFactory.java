package com.tyss.forestry.factory;

import com.tyss.forestry.dao.CustomerDAO;
import com.tyss.forestry.dao.CustomerDAOImpl;
import com.tyss.forestry.services.CustomerService;
import com.tyss.forestry.services.CustomerServiceImpl;

public class CustomerFactory {

	private CustomerFactory() {
		
	}

	public static CustomerDAO instanceOfCustomerDAOImpl() {
		
		CustomerDAO dao = new CustomerDAOImpl();
		return dao;
		
	}
	public static CustomerService instanceOfCustomerService(){
		CustomerService service = new CustomerServiceImpl();
		return service;
		
	}
}
