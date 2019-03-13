package com.demo.telecom.dao;

import java.util.ArrayList;
import java.util.List;

import com.demo.bean.CustomerInfo;
import com.demo.bean.PhoneInfo;

public class TelecomDao {
	public static List<CustomerInfo> custList = new ArrayList<CustomerInfo>();
	
	// generateTestData
	TelecomDao() {
		CustomerInfo cust1 = new CustomerInfo();
		cust1.setCustId("CSUT1000");
		PhoneInfo ph1 = new PhoneInfo();
		ph1.setPhoneNumber("07510046243");
		ph1.setActivated(true);
		PhoneInfo ph2 = new PhoneInfo();
		ph2.setPhoneNumber("07442011008");
		ph2.setActivated(false);
		List<PhoneInfo> phList1 = new ArrayList<PhoneInfo>();
		phList1.add(ph1);
		phList1.add(ph2);
		cust1.setPhoneList(phList1);
		
		CustomerInfo cust2 = new CustomerInfo();
		cust2.setCustId("CSUT2000");
		PhoneInfo ph3 = new PhoneInfo();
		ph3.setPhoneNumber("07110046123");
		ph3.setActivated(true);
		List<PhoneInfo> phList2 = new ArrayList<PhoneInfo>();
		phList2.add(ph3);
		cust2.setPhoneList(phList2);
		
		custList.add(cust1);
		custList.add(cust2);
	}
	
}
