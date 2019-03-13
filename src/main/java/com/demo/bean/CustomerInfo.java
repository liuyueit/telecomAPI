package com.demo.bean;

import java.util.List;

public class CustomerInfo {
	private String custId;
	private List<PhoneInfo> phoneList;
	
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public List<PhoneInfo> getPhoneList() {
		return phoneList;
	}
	public void setPhoneList(List<PhoneInfo> phoneList) {
		this.phoneList = phoneList;
	}
	
	
}
