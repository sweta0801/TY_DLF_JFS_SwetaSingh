package com.tyss.phoneapplication.bean;

import java.io.Serializable;

public class ContactBean implements Serializable{
	
	
	private  String Name;
	private int cont_no;
	private String  Cont_email;
	
	

	public String getCont_email() {
		return Cont_email;
	}

	public void setCont_email(String cont_email) {
		Cont_email = cont_email;
	}

	public int getcont_no() {
		return cont_no;
	}

	public void setcont_no(int cont_no) {
		this.cont_no = cont_no;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	@Override
	public String toString() {
		return "ContactBean [Name=" + Name + ", cont_no=" + cont_no + ", Cont_email=" + Cont_email + "]";
	}

	
	

}
