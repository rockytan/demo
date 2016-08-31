package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home.html")
	public String home(){
		return "home";
	}

	@RequestMapping("default.html")
	public String view(){
		return "layouts/default";
	}
}
