package com.tyss.forestry.bean;

import java.io.Serializable;

public class CustomerBean implements Serializable {
	
	private int customerId;
	private String customerName;
	private String StreetAddress1;
	private String StreetAddress2;
	private String town;
	private String postalCode;
	private String email;
	private String TelephoneNo;

	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getTelephoneNo() {
		return telephoneNo;
	}
	public void setTelephoneNo(String telephoneNo) {
		this.telephoneNo = telephoneNo;
	}
	private String Email;
	private String telephoneNo;
	
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
	@Override
	public String toString() {
		return "CustomerBean [customerId=" + customerId + ", customerName=" + customerName + ", StreetAddress1="
				+ StreetAddress1 + ", StreetAddress2=" + StreetAddress2 + ", town=" + town + ", postalCode="
				+ postalCode + ", email=" + email + ", TelephoneNo=" + TelephoneNo + ", Email=" + Email
				+ ", telephoneNo=" + telephoneNo + "]";
	}
	
	
	

}
