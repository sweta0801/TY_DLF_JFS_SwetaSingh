package com.tyss.app.factory;

import com.tyss.app.bean.CustomerBean;
import com.tyss.app.dao.CustomerDAO;
import com.tyss.app.dao.CustomerDAOImpl;
import com.tyss.app.services.CustomerSerivces;
import com.tyss.app.services.CustomerServicesImpl;

public class Customerfactory {

	private  Customerfactory() {
		
	}
	
	public static CustomerDAO instanceOfCustomerDAOImpl() {
		
		CustomerDAO dao = new CustomerDAOImpl();
		return dao;
		
	}
	public static CustomerSerivces instanceofCustomerSerivces() {
		CustomerSerivces services = new CustomerServicesImpl();
		return services;
		
	}		
}
