package com.hassanb.jaxrs.service;

import com.hassanb.jaxrs.model.Person;
import com.hassanb.jaxrs.model.Response;

public interface PersonService {

	public Response addPerson(Person p);
	
	public Response deletePerson(int id);
	
	public Person getPerson(int id);
	
	public Person[] getAllPersons();

}