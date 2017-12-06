package com.niit.yochatbackend.test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.yochatbackend.dao.UserDAO;
import com.niit.yochatbackend.dto.User;

public class UserTestCase {

	private static AnnotationConfigApplicationContext context;
	
	private static UserDAO userDAO;
	
	private static User user;
	
	@BeforeClass
	public static void init()
	{
		context =  new AnnotationConfigApplicationContext();
		context.scan("com.niit.yochatbackend");
		context.refresh();
		
		userDAO = (UserDAO) context.getBean("userDAO");
		user = (User) context.getBean("user");
	}

	@Test
	public void addUserTestCase()
	{
		User user = new User();
		
		user.setFirstName("anitha");
		user.setLastName("thirumalai");
		user.setUsername("anitha");
		user.setPassword("anitha95");
		user.setEmailId("anitha22695@gmail.com");
		user.setBirthDate(LocalDate.parse("1993-01-11")); //yyyy-mm-dd
		user.setGender('F');
		user.setPhone("9665224303");
		user.setRole("User");
		user.setStatus("APPROVED");
		user.setEnabled(true);
		user.setOnline(true);
		user.setProfile("noDp.jpg");
		
		assertEquals("You have Successfully saved a user along with authorities inside the database!",true,userDAO.addUser(user));
	}
	
}














	



















