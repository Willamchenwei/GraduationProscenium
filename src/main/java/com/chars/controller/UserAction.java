package com.chars.controller;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chars.model.House;
import com.chars.model.User;
import com.chars.service.IHouseService;
import com.chars.service.IUserService;
@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration({"classpath:dubbo-consumer.xml"})
public class UserAction {
	@Resource
	private IUserService userService;
	@Resource
	private IHouseService houseService;
	@Test
	public void t () {
		/*HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("userName", "cw");
		hashMap.put("password", "1234");
		User user = userService.getUser(hashMap);
		System.out.println(user);*/
		List<House> houseList = houseService.selectHouses();
		System.out.println(houseList.get(0));
	}
}
