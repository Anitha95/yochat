package com.niit.yochatbackend.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.yochatbackend.dao.EventDAO;
import com.niit.yochatbackend.dto.Events;

public class EventTestCase {

	@Autowired
	private static AnnotationConfigApplicationContext context;
	
	@Autowired
	private static Events event;
	
	@Autowired
	private static EventDAO eventDAO;
	
	@BeforeClass
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.yochatbackend");
		context.refresh();
		
		event  = (Events) context.getBean("events");
		eventDAO = (EventDAO) context.getBean("eventDAO");
	}
	
}
