package com.niit.yochatbackend.test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.yochatbackend.dao.BlogDAO;
import com.niit.yochatbackend.dto.Blog;

public class BlogTestCase {

	private static AnnotationConfigApplicationContext context;
	
	private static BlogDAO blogDAO;
	
	private static Blog blog;
	
	@BeforeClass
	public static void init()
	{
		context  = new AnnotationConfigApplicationContext();
		context.scan("com.niit.yochatbackend");
		context.refresh();
		
		blogDAO = (BlogDAO) context.getBean("blogDAO");
		blog = (Blog) context.getBean("blog");
	}
	
	
}




