package com.niit.yochatbackend.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.yochatbackend.dao.JobDAO;
import com.niit.yochatbackend.dto.Job;

public class JobTestCase {

	@Autowired
	private static AnnotationConfigApplicationContext context;
	
	@Autowired
	private static Job job;
	
	@Autowired
	private static JobDAO jobDAO;
	
	@BeforeClass
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("");
		context.refresh();
		
		job = (Job)context.getBean("job");
		jobDAO = (JobDAO)context.getBean("jobDAO");
	}
	
}














