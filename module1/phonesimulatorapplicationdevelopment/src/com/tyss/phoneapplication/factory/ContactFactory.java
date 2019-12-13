package com.tyss.phoneapplication.factory;

import com.tyss.phoneapplication.dao.ContactDAO;
import com.tyss.phoneapplication.dao.ContactDAOImpl;
import com.tyss.phoneapplication.services.ContactServices;
import com.tyss.phoneapplication.services.ContactServicesImpl;

public class ContactFactory {

	private ContactFactory() {

	}

	public static ContactDAO instanceOfContactDAOImpl() {
		ContactDAO dao = new ContactDAOImpl();
		return dao;

	}

	public static ContactServices instanceOfContactServices() {
		// TODO Auto-generated method stub
		ContactServices services = new ContactServicesImpl();

		return services;
	}

}
