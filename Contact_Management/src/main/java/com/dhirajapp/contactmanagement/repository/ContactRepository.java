package com.dhirajapp.contactmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhirajapp.contactmanagement.model.Contact;

public interface ContactRepository extends JpaRepository<Contact , Integer>
{

}
