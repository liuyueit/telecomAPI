package com.demo.telecomService.impl;

import java.util.ArrayList;
import java.util.List;

import com.demo.bean.CustomerInfo;
import com.demo.bean.PhoneInfo;
import com.demo.telecom.dao.TelecomDao;
import com.demo.telecomService.inf.TelecomService;

public class TelecomServiceImpl implements TelecomService {
	
	@Override
	public List<String> getAllPhoneNumbers() {
		List<CustomerInfo> custList = TelecomDao.custList;
		List<String> allPhone = new ArrayList<>();
		for (CustomerInfo cust : custList) {
			for (PhoneInfo phone : cust.getPhoneList()) {
				allPhone.add(phone.getPhoneNumber());
			}
		}
		return allPhone;
	}

	@Override
	public CustomerInfo getAllPhoneNumbersById(String custId) {
		List<CustomerInfo> custList = TelecomDao.custList;		
		for (CustomerInfo cust : custList) {
			if (cust.getCustId().equals(custId)) {
				return cust;
			}
		}
		return null;
	}

	@Override
	public boolean activatePhoneNumber(String custId, String phoneNumToActivate) {
		List<CustomerInfo> custList = TelecomDao.custList;		
		for (CustomerInfo cust : custList) {
			if (cust.getCustId().equals(custId)) {
				for (PhoneInfo phone : cust.getPhoneList()) {
					if (phone.getPhoneNumber().equals(phoneNumToActivate)) {
						phone.setActivated(true);
					}
				}
			}
		}
		return false;
	}

	@Override
	public boolean changePhoneNumberById(String custId, String previousPhoneNum, 
			String newPhoneNum ) {	
		List<CustomerInfo> custList = TelecomDao.custList;
		for (CustomerInfo cust : custList) {
			if(cust.getCustId().equals(custId)) {
				for(PhoneInfo phone : cust.getPhoneList()) {
					if(phone.getPhoneNumber().equals(previousPhoneNum)){
						phone.setActivated(false);
					}
					else if (phone.getPhoneNumber().equals(newPhoneNum)) {
						phone.setActivated(true);
					}
				}
			}
			
		}
		return false;
	}
}
