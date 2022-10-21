package com.ssafy.person.model.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.ssafy.person.dto.Person;
import com.ssafy.person.model.repo.PersonDAO;

@Service
public class PersonServiceImpl implements PersonService {

	
	PersonDAO dao;
	
	public PersonServiceImpl(PersonDAO dao) {	
		this.dao = dao;
	}


	@Override
	public int add(Person person) throws Exception {
		// TODO Auto-generated method stub
		return dao.insert(person);
	}

//	@Override
//	public int modify(Person person) throws Exception {
//		return dao.update(person);
//	}
	
//
//	@Override
//	public int remove(int no) throws Exception {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public Person find(int no) throws Exception {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
	
	@Override
	public List<Person> findAll() throws Exception {
		return dao.selectAll();
	}
	
	
	

}
