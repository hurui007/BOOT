package com.rui.core.bootest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	
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
	
	@Test
	public void testLog() {
		logger.trace("---logger -- trace---");
		logger.debug("---logger--- debug ---");
		logger.info("---logger --- info ---");
		logger.warn("---logger --- warn --- ");
		logger.error("---logger --- error --- ");
	}
	
}
