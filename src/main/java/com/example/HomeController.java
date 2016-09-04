package com.example;

import com.example.freemarker.DemoMethodModel;
import freemarker.core.Environment;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.stream.Stream;

@Controller
public class HomeController {

	@Resource
	ApplicationContext applicationContext;

	@RequestMapping("/home.html")
	public String home(Model model){
		model.addAttribute("message","home.html");
		model.addAttribute("name","freemarker");
		//Environment.getCurrentEnvironment().setVariable("clist",new DemoMethodModel());
		//model.addAttribute("clist",new DemoMethodModel());

		//Stream.of(applicationContext.getBeanDefinitionNames()).filter(s -> s.contains("freeMarker")).forEach(System.out::println);

		//System.out.println(applicationContext.getBean("freeMarkerConfiguration").getClass());

		return "home";
	}

	@RequestMapping("default.html")
	public String view(){
		return "layouts/default";
	}
}
