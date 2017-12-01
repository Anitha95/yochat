package com.niit.yochatbackend.test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.yochatbackend.dao.EventJoinedDAO;
import com.niit.yochatbackend.dto.EventJoined;

public class EventJoinedTestCase {

	@Autowired
	private static AnnotationConfigApplicationContext context;
	
	@Autowired
	private static EventJoined eventJoined;
	
	@Autowired 
	private static EventJoinedDAO eventJoinedDAO;
	
	@BeforeClass
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.yochatbackend");
		context.refresh();
		
		eventJoined = (EventJoined) context.getBean("eventJoined");
		eventJoinedDAO = (EventJoinedDAO) context.getBean("eventJoinedDAO");
	}
	
}














