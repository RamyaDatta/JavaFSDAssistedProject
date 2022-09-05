package com.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Admin;
import com.entity.Questions;
import com.entity.Quiz;
import com.entity.Result;
import com.entity.Statistics;
import com.entity.Test;
import com.entity.User;
import com.service.AdminService;
import com.service.UserService;

@RestController
@RequestMapping("mcq")


public class QuestionCotroller {
	

	@Autowired
	UserService us;
	@Autowired
	AdminService as;
	
	//http://localhost:8080/mcq/userLogin
	@PostMapping(value="userLogin", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String userLogin(@RequestBody User u)
	{
			return us.userLogin(u.getEmailid(), u.getPassword());
	}
	
	//http://localhost:8080/mcq/userRegister
	@PostMapping(value="userRegister", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String userRegiter(@RequestBody User u)
	{
		return us.userRegister(u);
	}
	
	//http://localhost:8080/mcq/adminLogin
	@PostMapping(value="adminLogin", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String adminLogin(@RequestBody Admin u)
	{
			return as.adminLogin(u);
	}
	
	//http://localhost:8080/mcq/adminupdate
		@PostMapping(value="adminupdate", consumes = MediaType.APPLICATION_JSON_VALUE)
		public String adminUpdate(@RequestBody Admin u)
		{
				return as.adminupdate(u);
		}
	
	
	
	
	//http://localhost:8080/mcq/addQuestions
	@PostMapping(value="addQuestions", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String addQuestion(@RequestBody Questions q)
	{
			return as.addQuestion(q);
	}
	
	//http://localhost:8080/mcq/addQuiz
	@PostMapping(value="addQuiz", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String addQuiz(@RequestBody Quiz q)
	{
			return as.addQuiz(q);
	}
	
	//http://localhost:8080/mcq/viewAllQuiz
		@GetMapping(value="viewAllQuiz", produces= MediaType.APPLICATION_JSON_VALUE)
		public List<Quiz> viewAllQuiz()
		{
				return as.viewAllQuiz();
		}
		
		//http://localhost:8080/mcq/quizinfo
		@GetMapping(value="quizinfo", produces= MediaType.APPLICATION_JSON_VALUE)
		public Statistics quizinfo()
		{
				return as.quizInfo();
		}
		
		//http://localhost:8080/mcq/viewQuiz
				@GetMapping(value="viewQuiz", produces= MediaType.APPLICATION_JSON_VALUE)
				public List<Object> viewQuiz()
				{
						return us.viewAllQuiz();
				}


				//http://localhost:8080/mcq/takeTest
				@PostMapping(value="takeTest", consumes = MediaType.APPLICATION_JSON_VALUE)
				public String takeTest(@RequestBody Test t)
				{
						return us.takeTest(t);
				}
				
				//http://localhost:8080/mcq/getAllTest
				@GetMapping(value="getAllTest", produces= MediaType.APPLICATION_JSON_VALUE)
				public List<Test> getAllTest()
				{
						return us.getTestList();
				}
				
				//http://localhost:8080/mcq/getresult
				@GetMapping(value="getresult", produces= MediaType.APPLICATION_JSON_VALUE)
				public List<Result> getresult()
				{
						return us.result();
				}
				
				//http://localhost:8080/mcq/getAdminResult
				@GetMapping(value="getAdminResult", produces= MediaType.APPLICATION_JSON_VALUE)
				public List<Result> getAdminResult()
				{
						return us.result();
				}
				


}