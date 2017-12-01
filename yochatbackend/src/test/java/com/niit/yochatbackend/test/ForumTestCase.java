package com.niit.yochatbackend.test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.yochatbackend.dao.ForumDAO;
import com.niit.yochatbackend.dto.Forum;

public class ForumTestCase {
	
	@Autowired
	private static AnnotationConfigApplicationContext context;
	
	@Autowired
	private static Forum forum;
	
	@Autowired 
	private static ForumDAO forumDAO;
	
	@BeforeClass
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.sbkchat.collaboration");
		context.refresh();
		
		forum = (Forum)context.getBean("forum");
		forumDAO = (ForumDAO)context.getBean("forumDAO");
	}
	
}










