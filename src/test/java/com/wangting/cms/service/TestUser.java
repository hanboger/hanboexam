package com.wangting.cms.service;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hanbo.cms.entity.User;
import com.hanbo.cms.service.UserService;

public class TestUser  extends BaseTest{
	
	@Autowired
	UserService userServie;
	
	@Test
	public void testRegister() {
		
		User user = new User("zhangsan222","password",1);
		int register = userServie.register(user);
		assertTrue(register>0);
		
		
	}

}
