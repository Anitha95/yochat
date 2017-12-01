package com.niit.yochatbackend.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.yochatbackend.dao.ForumPostDAO;
import com.niit.yochatbackend.dto.ForumPost;

public class ForumPostTestCase {

	@Autowired
	private static AnnotationConfigApplicationContext context;
	
	@Autowired
	private static ForumPost forumPost;
	
	@Autowired
	private static ForumPostDAO forumPostDAO;
	
	@BeforeClass
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.yochatbackend");
		context.refresh();
		
		forumPost = (ForumPost)context.getBean("forumPost");
		forumPostDAO = (ForumPostDAO)context.getBean("forumPostDAO");
	}
	
}







