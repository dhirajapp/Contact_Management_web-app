package com.dhirajapp.contactmanagement.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import com.dhirajapp.contactmanagement.service.ContactService;
import com.dhirajapp.contactmanagement.model.Contact;


public class ContactController {

	ContactService contactService;  
	//creating a get mapping that retrieves all the books detail from the database   
	@GetMapping("/contact")  
	private List<Contact> getAllContact()   
	{  
	    return ContactService.getAllContact();  
	}  
	 
	
}
