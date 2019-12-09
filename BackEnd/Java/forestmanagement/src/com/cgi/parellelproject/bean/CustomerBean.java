package com.cgi.parellelproject.bean;

import java.util.regex.Pattern;

import com.cgi.parellelproject.validation.EmailValidator;

public class CustomerBean 
{
	private int customerId;
	private String customerName;
	private String streetAddress1;
	private String streetAddess2;
	private String town;
	private int postalCode;
	private String email;
	private String tel;
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
		return streetAddress1;
	}
	public void setStreetAddress1(String streetAddress1) {
		this.streetAddress1 = streetAddress1;
	}
	public String getStreetAddess2() {
		return streetAddess2;
	}
	public void setStreetAddess2(String streetAddess2) {
		this.streetAddess2 = streetAddess2;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
		
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "CustomerBean [customerId=" + customerId + ", customerName=" + customerName + ", streetAddress1="
				+ streetAddress1 + ", streetAddess2=" + streetAddess2 + ", town=" + town + ", postalCode=" + postalCode
				+ ", email=" + email + ", tel=" + tel + "]";
	}
}
