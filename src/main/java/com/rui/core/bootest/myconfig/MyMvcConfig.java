package com.rui.core.bootest.myconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
/**
 * 可以用来扩展mvc的功能
 * @author ruihu
 *
 */
//@EnableWebMvc //全面接管springmvc，有了这个注解的话，spring的自动配置都会失效
@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter {
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		//浏览器发送hellotest请求的时候，返回后面的页面
		registry.addViewController("/hellotest").setViewName("/boot/hellotest");
	}
	
	@Bean
	public WebMvcConfigurerAdapter webMvcConfigurerAdapter() {
		WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter() {
			@Override
			public void addViewControllers(ViewControllerRegistry registry) {
				//所有的WebMvcConfigurerAdapter组件都会生效
				registry.addViewController("/").setViewName("/boot/index");
				registry.addViewController("/index.html").setViewName("/boot/index");
			}
		};
		return adapter;
	}

}
