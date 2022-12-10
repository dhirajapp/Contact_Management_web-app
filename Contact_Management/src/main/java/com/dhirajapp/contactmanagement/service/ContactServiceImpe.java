package com.dhirajapp.contactmanagement.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.dhirajapp.contactmanagement.model.Contact;
import com.dhirajapp.contactmanagement.repository.ContactRepository;

public class ContactServiceImpe implements ContactService {
    @Autowired
	private ContactRepository repo;
	
	@Override
	public String saveContact(Contact contact) {
		contact = repo.save(contact);
		if(contact.getContactId()!=null) {
			 return "contact saved";
		}
		else {
			return "contact  failed to saved";
		}
	}

	@Override
	public List<Contact> getAllContact() {
		
		return repo.findAll();
	}

	@Override
	public Contact getContactById(Integer contactId) {
		Optional<Contact> findById = repo.findById(contactId);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public String updateContact(Contact contact) {
		if(repo.existsById(contact.getContactId())) {
			repo.save(contact);
			return "update success";
		}
		else {
			return "no record found";
		}
	}

	@Override
	public String deleteContactById(Integer contactId) {
		if(repo.existsById(contactId)) {
			repo.deleteById(contactId);
			return "record deleted " ;
		}
		else {
			return "record not found ";
		}
	}


}
