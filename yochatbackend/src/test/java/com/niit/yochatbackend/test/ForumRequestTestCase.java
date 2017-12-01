package com.niit.yochatbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.yochatbackend.dao.ForumDAO;
import com.niit.yochatbackend.dao.ForumRequestDAO;
import com.niit.yochatbackend.dto.Forum;
import com.niit.yochatbackend.dto.ForumRequest;

public class ForumRequestTestCase {

	@Autowired
	private static AnnotationConfigApplicationContext context;
	
	@Autowired
	private static ForumRequest forumRequest;
	
	@Autowired
	private static ForumRequestDAO forumRequestDAO;
	
	@Autowired
	private static ForumDAO forumDAO;
	
	@Autowired
	private static Forum forum;
	
	@BeforeClass
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.yochatbackend");
		context.refresh();
		
		forumRequest = (ForumRequest)context.getBean("forumRequest");
		forumRequestDAO = (ForumRequestDAO)context.getBean("forumRequestDAO");
		forum = (Forum) context.getBean("forum");
		forumDAO = (ForumDAO) context.getBean("forumDAO");
	}
	

}
