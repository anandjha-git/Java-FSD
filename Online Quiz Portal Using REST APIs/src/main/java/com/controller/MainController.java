package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Admin;
import com.bean.Question;
import com.bean.Quiz;
import com.bean.Result;
import com.bean.Statistics;
import com.bean.Test;
import com.bean.User;
import com.service.AdminSer;
import com.service.UserSer;

@RestController
@RequestMapping("QuizPortal")
public class MainController {
	@Autowired
	UserSer us;
	@Autowired
	AdminSer as;
	
	//user login
	@PostMapping(value="userLogin", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String userLogin(@RequestBody User u)
	{
			return us.userLogin(u.getEmailid(), u.getPassword());
	}
	
	//user registration
	@PostMapping(value="userRegister", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String userRegiter(@RequestBody User u)
	{
		return us.userRegister(u);
	}
	
	//admin login
	@PostMapping(value="adminLogin", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String adminLogin(@RequestBody Admin u)
	{
			return as.adminLogin(u);
	}
	
	//update info of admin
		@PostMapping(value="adminupdate", consumes = MediaType.APPLICATION_JSON_VALUE)
		public String adminUpdate(@RequestBody Admin u)
		{
				return as.adminupdate(u);
		}
	
	
	
	
	//admin add the Questions
	@PostMapping(value="addQuestions", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String addQuestion(@RequestBody Question q)
	{
			return as.addQuestion(q);
	}
	
	//admin add the Quiz
	@PostMapping(value="addQuiz", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String addQuiz(@RequestBody Quiz q)
	{
			return as.addQuiz(q);
	}
	
		//view all quizzes
		@GetMapping(value="viewAllQuiz", produces= MediaType.APPLICATION_JSON_VALUE)
		public List<Quiz> viewAllQuiz()
		{
				return as.viewAllQuiz();
		}
		
		//quiz details
		@GetMapping(value="quizinfo", produces= MediaType.APPLICATION_JSON_VALUE)
		public Statistics quizinfo()
		{
				return as.quizInfo();
		}
		
				//view quiz
				@GetMapping(value="viewQuiz", produces= MediaType.APPLICATION_JSON_VALUE)
				public List<Object> viewQuiz()
				{
						return us.viewAllQuiz();
				}


				//take the test
				@PostMapping(value="takeTest", consumes = MediaType.APPLICATION_JSON_VALUE)
				public String takeTest(@RequestBody Test t)
				{
						return us.takeTest(t);
				}
				
				//view all the test
				@GetMapping(value="getAllTest", produces= MediaType.APPLICATION_JSON_VALUE)
				public List<Test> getAllTest()
				{
						return us.getTestList();
				}
				
				//view result
				@GetMapping(value="getresult", produces= MediaType.APPLICATION_JSON_VALUE)
				public List<Result> getresult()
				{
						return us.result();
				}
				
				//admin view result
				@GetMapping(value="getAdminResult", produces= MediaType.APPLICATION_JSON_VALUE)
				public List<Result> getAdminResult()
				{
						return us.result();
				}
				
}
