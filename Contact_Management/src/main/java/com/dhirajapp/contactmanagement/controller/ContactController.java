package com.dhirajapp.contactmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.dhirajapp.contactmanagement.service.ContactServiceImpe;
import com.dhirajapp.contactmanagement.model.Contact;


public class ContactController {

	@Autowired
	ContactServiceImpe contactServiceimpe;  
	 
	@GetMapping("/contact")  
	private List<Contact> getAllContact()   
	{  
	    return contactServiceimpe.getAllContact();  
	}  
	
	@GetMapping("/contact/{contactid}")  
	private Contact getBooks(@PathVariable("contactid") int contactid)   
	{  
	return contactServiceimpe.getContactById(contactid);  
	}  
	
	@DeleteMapping("/contact/{contactid}")  
	private void deleteContactById(@PathVariable("contactid") int contactid)   
	{  
		contactServiceimpe.deleteContactById(contactid);  
	}  
	 
	@PostMapping("/contacts")  
	private String saveContact(@RequestBody Contact contacts)   
	{  
		contactServiceimpe.saveContact(contacts);  
	return contacts.getContactName();  
	}  

	@PutMapping("/contacts")  
	private Contact update(@RequestBody Contact contacts)   
	{  
	contactServiceimpe.saveContact(contacts);  
	return contacts;  
	}  
}

