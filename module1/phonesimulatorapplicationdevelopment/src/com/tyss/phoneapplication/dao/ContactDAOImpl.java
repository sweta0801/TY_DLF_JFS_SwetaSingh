package com.tyss.phoneapplication.dao;

import java.util.ArrayList;
import java.util.List;

import com.tyss.phoneapplication.bean.ContactBean;

public class ContactDAOImpl implements ContactDAO {
	
	

	private List<ContactBean> contractList = new ArrayList<ContactBean>();

	@Override
	public List<ContactBean> getAllContact() {

		return contractList;
	}

	@Override
	public boolean insertContact(ContactBean contact) {
		for (ContactBean contactBean : contractList) {

			if (contact.getcont_no() == contactBean.getcont_no()) {
				return false;

			}
		}
		contractList.add(contact);
		return true;

	}

	@Override
	public boolean deleteContact(int cont_no) {
		for (ContactBean contactBean : contractList) {
			if (contactBean.getcont_no() == cont_no) {
				contractList.remove(contactBean);
				return true;
			}
		}

		return false;
	}

	@Override
	public boolean upadteContact(int cont_no, String newCont_email) {

		for (ContactBean contactBean : contractList) {

			if (contactBean.getcont_no() == cont_no) {
				contactBean.setCont_email(newCont_email);
				return true;
			}
		}

		return false;
	}

}
