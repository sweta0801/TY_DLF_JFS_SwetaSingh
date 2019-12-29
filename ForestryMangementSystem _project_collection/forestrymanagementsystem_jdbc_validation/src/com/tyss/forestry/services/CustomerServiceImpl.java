package com.tyss.forestry.services;

import java.util.List;


import com.tyss.forestry.bean.CustomerBean;
import com.tyss.forestry.dao.CustomerDAO;
import com.tyss.forestry.factory.CustomerFactory;

public class CustomerServiceImpl  implements CustomerService {
	
	CustomerDAO dao = CustomerFactory.instanceOfCustomerDAOImpl();

	@Override
	public List<CustomerBean> getAllCustomer() {
		
		return dao.getAllCustomer();
	}

	@Override
	public boolean insertCustomer(CustomerBean customer) {
		
		return dao.insertCustomer(customer);
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
