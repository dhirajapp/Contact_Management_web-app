package com.dhirajapp.contactmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dhirajapp.contactmanagement.service.ContactService;
import com.dhirajapp.contactmanagement.model.Contact;

@RestController
public class ContactController {
    @Autowired
	private ContactService contactService;

	@GetMapping("/contacts")
	public List<Contact> getAllContact() {
		return contactService.getAllContact();
	}

	@GetMapping("/contact/{contactid}")
	public Contact getBooks(@PathVariable("contactid") int contactid) {
		return contactService.getContactById(contactid);
	}

	@DeleteMapping("/contact/{contactid}")
	public void deleteContactById(@PathVariable("contactid") int contactid) {
		contactService.deleteContactById(contactid);
	}

	@PostMapping("/contact")
	public String saveContact(@RequestBody Contact contacts) {
		String status = contactService.saveContact(contacts);
		return status;
	}

	@PutMapping("/contacts")
	public String update(@RequestBody Contact contacts) {
		return contactService.updateContact(contacts);

	}

}
