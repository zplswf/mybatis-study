package com.example.demo;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;

import com.zplswf.MybatisPlusApplication;
import com.zplswf.bean.User;
import com.zplswf.mapper.UserMapper;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MybatisPlusApplication.class)
public class MybatisPlusApplicationTests {

	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void testSelect() {
		try {
			List<User> userList = userMapper.selectList(null);
			Assert.assertEquals(5, userList.size());
			userList.forEach(System.out::println);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
