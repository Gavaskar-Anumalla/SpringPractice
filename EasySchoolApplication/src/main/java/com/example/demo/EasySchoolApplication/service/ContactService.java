package com.example.demo.EasySchoolApplication.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.demo.EasySchoolApplication.model.Contact;

@Service
public class ContactService {
	
	private Logger logger=LoggerFactory.getLogger(ContactService.class);

	public boolean saveMessageDetails(Contact contact) {
		boolean isSaved=false;
		logger.info("Contact details :"+contact );
		return true;
		
	}
}
