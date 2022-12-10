package com.dhirajapp.contactmanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Data
@Entity
@Table(name = "CONTACT_DTLS")
public class Contact {
    
	@Id
	@GeneratedValue
	private Integer contactId;
	private String contactName;
	private String contactEmail;
	private Long contactNum;
	
}
