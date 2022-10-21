package com.ssafy.person.model.service;

import java.util.List;

import com.ssafy.person.dto.Person;

public interface PersonService {

	public int add(Person person) throws Exception;
//	public int modify(Person person) throws Exception;
//	public int remove(int no) throws Exception;
//	
//	public Person find(int no) throws Exception;
	public List<Person> findAll() throws Exception;
	
}
