package com.ssafy.person.model.repo;

import java.util.List;

import com.ssafy.person.dto.Person;

public interface PersonDAO {

	public int insert(Person person) throws Exception;
//	public int update(Person person) throws Exception;
//	public int delete(Person person) throws Exception;
//	
//	public Person select() throws Exception;
	public List<Person> selectAll() throws Exception;
	
	
}
