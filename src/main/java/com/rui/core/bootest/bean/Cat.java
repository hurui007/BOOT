package com.rui.core.bootest.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cat {

	@Value("${catName}")
	private String catName;
	
	@Value("#{11*2}")
	private String catAge;

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public String getCatAge() {
		return catAge;
	}

	public void setCatAge(String catAge) {
		this.catAge = catAge;
	}

	@Override
	public String toString() {
		return "Cat [catName=" + catName + ", catAge=" + catAge + "]";
	}
	
}
