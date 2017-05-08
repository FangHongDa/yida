package com.yida.wx.count.test;

import java.util.UUID;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.yida.wx.count.bean.User;
import com.yida.wx.count.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:config/spring-mybatis.xml"})

public class TestMyBatis {
	private static Logger logger = Logger.getLogger(TestMyBatis.class);
//	private ApplicationContext ac = null;
	@Resource
	private IUserService userService = null;

//	@Before
//	public void before() {
//		ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		userService = (IUserService) ac.getBean("userService");
//	}

	@Test
	public void test1() {
		try{
			/*User user = userService.getUserById(5);
			System.out.println(user.getUserName());
			System.out.println(JSON.toJSONString(user));*/
			/*logger.info("值："+user.getUserName());
			logger.info(JSON.toJSONString(user));
			System.out.println(JSON.toJSONString(user));
			System.out.println("----------------------");
			
			userService.inserUser(new User(5, "hoda","nihao",99));*/
			for (int i = 1; i < 500; i++) {
				String age = UUID.randomUUID().toString().substring(0, 5);
				userService.inserUser(new User(i, "hoda"+ i,age,99));
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	

}
