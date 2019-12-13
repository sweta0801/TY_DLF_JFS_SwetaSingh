package com.tyss.phoneapplication.services;

import java.util.List;

import com.tyss.phoneapplication.bean.ContactBean;
import com.tyss.phoneapplication.dao.ContactDAO;
import com.tyss.phoneapplication.factory.ContactFactory;

public class ContactServicesImpl  implements ContactServices{
	
	ContactDAO dao = ContactFactory.instanceOfContactDAOImpl();
	

	@Override
	public List<ContactBean> getAllContact() {
		// TODO Auto-generated method stub
		return dao.getAllContact();
	}

	@Override
	public boolean insertContact(ContactBean contact) {
		// TODO Auto-generated method stub
		return dao.insertContact(contact);
	}

	@Override
	public boolean deleteContact(int cont_no) {
		// TODO Auto-generated method stub
		return dao.deleteContact(cont_no);
	}

	@Override
	public boolean upadteContact(int cont_no, String Cont_email) {
		// TODO Auto-generated method stub
		return dao.upadteContact(cont_no, Cont_email);
	}
	
	

}
