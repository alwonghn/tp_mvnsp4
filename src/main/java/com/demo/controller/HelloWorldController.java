package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

// @RequestMapping("/")
@Controller
public class HelloWorldController {
 
    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String sayHello(ModelMap model) {
    	System.out.println("INTO SAYHELLO");
        model.addAttribute("greeting", "Hello World from Spring 4 MVC");
        return "welcome";
    }
//	@RequestMapping(value="/hello", method = RequestMethod.GET)
//    public ModelAndView sayHello() {
//		System.out.println("INTO SAYHELLO");
//    	String greeting="Hello World from Spring 4 MVC";
//    	return new ModelAndView("welcome", "greeting",greeting);
//    }
 
//    @RequestMapping(value="/helloagain", method = RequestMethod.GET)
//    public String sayHelloAgain(ModelMap model) {
//        model.addAttribute("greeting", "Hello World Again, from Spring 4 MVC");
//        return "welcome";
//    }
 
}