package com.niit.yochatbackend.test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.yochatbackend.dao.JobAppliedDAO;
import com.niit.yochatbackend.dto.JobApplied;

public class JobAppliedTestCase {

	@Autowired
	private static AnnotationConfigApplicationContext context;
	
	@Autowired
	private static JobApplied jobApplied;
	
	@Autowired
	private static JobAppliedDAO jobAppliedDAO;
	
	@BeforeClass
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.sbkchat.collaboration");
		context.refresh();
		
		jobApplied = (JobApplied) context.getBean("jobApplied");
		jobAppliedDAO = (JobAppliedDAO) context.getBean("jobAppliedDAO");
	}
	
}













