package com.ssafy.person.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssafy.person.controller.PersonController;
import com.ssafy.person.dto.Person;
import com.ssafy.person.model.service.PersonService;

//context-root : http://localhost:8080/
//requestMapping : + /person


@Controller
@RequestMapping("/person")		
public class PersonController {
	
//	private final Logger logger = LoggerFactory.getLogger(PersonController.class);


	PersonService service;
	
	
	public PersonController(PersonService service) {
		this.service = service;
	}


	@GetMapping({"/", "/form"})
	public String form() {
		return "/form";
	}

	
	@PostMapping("/form")
	public String regist(Person person) {
		
		//Person 데이터를 잘 받아오는지 확인하는 방법 2가지
		//1. System.out.println();
		//2. logger 사용 
		
		System.out.println("입력확인>>>" + person);
		
		try {
			service.add(person);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "form";	//뷰정보리턴
	}

	
	
	@GetMapping("/list")
	public String showList(Model model) throws Exception{		
		List<Person> personList = service.findAll();
		model.addAttribute("personList", personList);
		return "list";
	}

	
	@GetMapping("/showUpForm")
	public void showUpdateForm() {
		// TODO Auto-generated method stub

	}
	
	
	@GetMapping("/upform")
	public void doUpdateForm() {
		// TODO Auto-generated method stub

	}
	
	
	@PostMapping("/delete")
	public void deleteInfo() {
		
	}
	
	
	/**
	 * '/error/404' 요청이 get 방식으로 들어왔을때 보여줄 페이지 매핑된 주소를 처리하는 메서드가 존재하지 않을시 표시할 에러
	 * 페이지이다.
	 */
	@GetMapping("/error/404")
	public void showError404() {
		// 404 Not Found 처리
	}
}
