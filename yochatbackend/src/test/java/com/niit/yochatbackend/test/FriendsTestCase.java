package com.niit.yochatbackend.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.yochatbackend.dao.FriendsDAO;
import com.niit.yochatbackend.dto.Friends;
import com.niit.yochatbackend.dto.User;

public class FriendsTestCase {

	@Autowired
	private static AnnotationConfigApplicationContext context;
	
	@Autowired
	private static Friends friends;
	
	@Autowired 
	private static FriendsDAO friendsDAO;
	
	@BeforeClass
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.yochatbackend");
		context.refresh();
		
		friends = (Friends) context.getBean("friends");
		friendsDAO = (FriendsDAO) context.getBean("friendsDAO");
	}
	
	
}




















