package com.example;

import com.example.freemarker.DemoMethodModel;
import freemarker.template.Configuration;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@SpringBootApplication
@Controller
public class DemoApplication implements CommandLineRunner{

	@Resource
	Configuration freeMarkerConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@RequestMapping("/index")
	public String index(){
		System.out.println("index");
		return "index";
	}

	@Override
	public void run(String... args) throws Exception {
		freeMarkerConfiguration.setSharedVariable("clist",new DemoMethodModel());
	}
}
