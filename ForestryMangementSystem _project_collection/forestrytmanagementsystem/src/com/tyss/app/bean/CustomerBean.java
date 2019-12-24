package com.tyss.app.bean;

import java.io.Serializable;

public class CustomerBean implements Serializable {

	private int customerId;
	private String customerName;
	private String StreetAddress1;
	private String StreetAddress2;
	private String town;
	private int postalcode;
	private String email;
	private int telephoneno;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getStreetAddress1() {
		return StreetAddress1;
	}

	public void setStreetAddress1(String streetAddress1) {
		StreetAddress1 = streetAddress1;
	}

	public String getStreetAddress2() {
		return StreetAddress2;
	}

	public void setStreetAddress2(String streetAddress2) {
		StreetAddress2 = streetAddress2;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public int getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(int postalcode) {
		this.postalcode = postalcode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelephoneno() {
		return telephoneno;
	}

	public void setTelephoneno(int telephoneno) {
		this.telephoneno = telephoneno;
	}

	

	@Override
	public String toString() {
		return "CustomerBean [customerId=" + customerId + ", customerName=" + customerName + ", StreetAddress1="
				+ StreetAddress1 + ", StreetAddress2=" + StreetAddress2 + ", town=" + town + ", postalcode="
				+ postalcode + ", email=" + email + ", telephoneno=" + telephoneno + "]";
	}

	
}
