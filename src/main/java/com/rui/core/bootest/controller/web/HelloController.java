package com.rui.core.bootest.controller.web;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@ResponseBody
	@RequestMapping("/hello")
	public String hello() {
		return "hello word";
	}
	
	@RequestMapping("/success")
	public String thymeleafTest(Map<String,String> map) {
		map.put("myvalue", "hurui");
		
		return "/boot/testa";
	}

}
