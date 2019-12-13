package com.tyss.phoneapplication.services;

import java.util.List;

import com.tyss.phoneapplication.bean.ContactBean;

public interface ContactServices {
	
List <ContactBean> getAllContact();
	
	boolean insertContact(ContactBean contact);
	boolean deleteContact(int cont_no);
	boolean  upadteContact( int cont_no , String  Cont_email);

}
