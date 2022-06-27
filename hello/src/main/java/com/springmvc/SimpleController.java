package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SimpleController {
	@RequestMapping("/hello")
	public String hello() {
		
		return "index";
		
	}
	
	@RequestMapping("/greeting")
	public ModelAndView greet() {
		
		
	    ModelAndView mav = new ModelAndView("greet"); 
	    mav.addObject("greeting", "Hi this me");
			
			
		return mav;	
		}
		
	}
	
	
	
	


