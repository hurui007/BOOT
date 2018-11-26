package com.rui.core.bootest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.rui.core.bootest.bean.Cat;
import com.rui.core.bootest.bean.Person;

/**
 * @RunWith(SpringRunner.class) 用spring的驱动器运行，而不是用junit
 * @SpringBootTest 声明式一个测试类
 * 可以方便的注入容器资源
 * @author ruihu
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloAppTests {
	
	@Autowired
	private Person person;
	
	@Autowired
	private Cat cat;
	
	@Test
	public void contextLoads() {
		System.out.println(person);
	}

	@Test
	public void contextCat() {
		System.out.println(cat);
	}
	
}
