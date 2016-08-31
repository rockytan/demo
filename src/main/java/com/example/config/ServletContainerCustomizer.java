package com.example.config;

import javax.servlet.Filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServletContainerCustomizer{

	@Bean
	public FilterRegistrationBean sitemeshFilter(){
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new SiteMeshFilter());		
		filterRegistrationBean.addUrlPatterns("*.html");		
		return filterRegistrationBean;
	}
}
