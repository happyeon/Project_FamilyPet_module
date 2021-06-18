package com.sms;

import java.io.UnsupportedEncodingException;

public class smsTest {

	public static void main(String[] args) {
		String phone = "01064244977";
		String content = "message";
		try {
			SMS.sendSMS(phone, content);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
	
}
