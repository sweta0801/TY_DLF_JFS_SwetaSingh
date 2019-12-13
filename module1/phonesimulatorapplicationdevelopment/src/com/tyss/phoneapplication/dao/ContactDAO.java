package com.tyss.phoneapplication.dao;

import java.util.List;

import com.tyss.phoneapplication.bean.ContactBean;

public interface ContactDAO {
	
	List <ContactBean> getAllContact();      
	 
	 boolean insertContact(ContactBean contact);
	boolean deleteContact(int cont_no);
	 boolean  upadteContact( int cont_no , String  Cont_email);
	
	
	
	
	

}
