package com.tyss.app.dao;

import java.util.List;

import com.tyss.app.bean.CustomerBean;

public interface CustomerDAO {
	
List <CustomerBean> getAllCustomer();
 
 boolean insertCustomer(CustomerBean customer);
boolean deleteCustomer(int customerId);
 boolean  upadteCustomer(int customerId , String email );

 
	
 
	
	
}

