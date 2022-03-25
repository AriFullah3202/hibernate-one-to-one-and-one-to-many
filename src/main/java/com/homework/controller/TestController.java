package com.homework.controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.homework.entity.Answer;
import com.homework.entity.Question;

@Controller
public class TestController {
    @Autowired
	SessionFactory sessionFactory;
   
    
    @RequestMapping("/insert")
    public void insert() {
    	Session session = sessionFactory.openSession();
    	session.beginTransaction();
    	Answer answer1 = new Answer();
    	//answer1.setAnswer_id(0);
    	answer1.setAnswer("hello");
    	Answer answer2 = new Answer();
    	answer2.setAnswer("hello1");
    	//answer2.setAnswer_id(1);
    	Question question = new Question();
    	//question.setQuestion_id(1);
    	question.setQuestion("hello?");
    	List<Answer> answer = new ArrayList<Answer>();
    	answer.add(answer1);
    	answer.add(answer2);
    	
    	question.setAnswer(answer);
    	session.save(question);
    	
    	
    	
    	session.getTransaction().commit();
    	session.close();
    }
}
