/**
 * 
 */
package com.demo.telecomService.inf;

import java.util.List;

import com.demo.bean.CustomerInfo;

/**
 * @author Yoko
 *
 */
public interface TelecomService {
	// get all phone numbers
	public List<String> getAllPhoneNumbers();
	// get all phone numbers of a single customer
	public CustomerInfo getAllPhoneNumbersById(String custId);
	// activate a phone number
	public boolean activatePhoneNumber(String custId, String phoneNumToActivate);
}
