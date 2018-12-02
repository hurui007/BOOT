package com.rui.core.bootest.bean;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
/**
 * @title @ConfigurationProperties 将配置文件中的每一个值，映射到这个组件中，
 * prefix="person" 这个是指定具体的属性值
 * @author ruihu  
 * 同时只有这个组件是容器中的组件，才能使用容器提供的@ConfigurationProperties功能，
 * 所以还要加上component配置
 */
@Component
@ConfigurationProperties(prefix="person")
public class Person {
	
	private String name;
	
	private Integer age;
	
	private Map<String, String> maps;
	
	private List<String> list;
	
	private Dog dog;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Map<String, String> getMaps() {
		return maps;
	}

	public void setMaps(Map<String, String> maps) {
		this.maps = maps;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", maps=" + maps + ", list=" + list + ", dog=" + dog + "]";
	}
	
}
