package com.ssafy.person.model.repo;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssafy.person.dto.Person;

@Repository
public class PersonDAOImpl implements PersonDAO {
	
	SqlSession sqlSession;
	
	@Autowired
	public PersonDAOImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	
//	private static final String Namespace = "com.ssafy.mappers.person";

	@Override
	public int insert(Person person) throws Exception {
		return sqlSession.insert("person.insert", person);	//insert("아이디", 전달데이터);
	}

//	@Override
//	public int update(Person person) throws Exception {
//		return sqlSession.update("person.update", person);
//	}
//
//	@Override
//	public int delete(Person person) throws Exception {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public Person select() throws Exception {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
	
	@Override
	public List<Person> selectAll() throws Exception {
		return sqlSession.selectList("selectAll");
	}


}
