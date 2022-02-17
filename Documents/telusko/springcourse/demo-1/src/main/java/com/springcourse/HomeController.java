package com.springcourse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springcourse.model.Alien;

@Controller
public class HomeController 
{

	@ModelAttribute
	public void addModelAttribute(Model m)
	{
		m.addAttribute("name","Aliens");
	}
	
	@RequestMapping("/")
	public String home() 
	{
		return "index";
	}
	
	@RequestMapping("add")
	public String add(@RequestParam("num1") int num1,@RequestParam("num2") int num2,Model m)
	{
		
		int num3 = num1 + num2;
		m.addAttribute("num3",num3);
		return "result";
	}
	
	@RequestMapping("addAlien")
	public String addAlien(@ModelAttribute("a1") Alien a) 
	{								
		return "result";
	}
}
