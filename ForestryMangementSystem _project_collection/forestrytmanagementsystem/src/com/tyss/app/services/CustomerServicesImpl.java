package com.tyss.app.services;

import java.util.List;


import com.tyss.app.bean.CustomerBean;
import com.tyss.app.dao.CustomerDAO;
import com.tyss.app.factory.Customerfactory;

public class CustomerServicesImpl implements CustomerSerivces {
	
	CustomerDAO dao = Customerfactory.instanceOfCustomerDAOImpl();

	@Override
	public List<CustomerBean> getAllCustomer() 
	{
		return dao.getAllCustomer();
	}

	@Override
	public boolean InsertCustomer(CustomerBean customer) {
		return  dao.insertCustomer(customer);
	
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		return dao.deleteCustomer(customerId);
		
	}

	@Override
	public boolean upadteCustomer(int customerId, String email) {
	
		return dao.upadteCustomer(customerId, email);
	}

}
