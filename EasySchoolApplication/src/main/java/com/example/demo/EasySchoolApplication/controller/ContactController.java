package com.example.demo.EasySchoolApplication.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.EasySchoolApplication.model.Contact;
import com.example.demo.EasySchoolApplication.service.ContactService;

@Controller
public class ContactController {

	private static Logger logger=LoggerFactory.getLogger(ContactController.class);
	
	private ContactService contactService;
	
	@Autowired
	public ContactController(ContactService contactService) {
		this.contactService=contactService;
	}
	@RequestMapping("/contact")
	public String displayContactPage() {
		return "contact.html";
	}

	/*
	 * @RequestMapping(value = "/saveMsg", method = RequestMethod.POST) public
	 * ModelAndView saveMessage(@RequestParam String name, @RequestParam String
	 * mobileNum,
	 * 
	 * @RequestParam String email, @RequestParam String subject, @RequestParam
	 * String message) {
	 * 
	 * logger.info("Name :" + name); logger.info("Mobile Number :" + mobileNum);
	 * logger.info("Email :" + email); logger.info("Subject :" + subject);
	 * logger.info("Message :" + message); return new
	 * ModelAndView("redirect:/contact"); }
	 */
	
	@RequestMapping(value = "/saveMsg", method = RequestMethod.POST)
	public ModelAndView saveMessage(Contact contact) {
		contactService.saveMessageDetails(contact);
		return new ModelAndView("redirect:/contact");
	}
}
