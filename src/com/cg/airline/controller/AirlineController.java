package com.cg.airline.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.airline.bean.userDetails;
import com.cg.airline.service.IAirlineService;

@Controller
public class AirlineController {

	@Autowired
	IAirlineService airlineService;
	
	@RequestMapping("/showHomePage")
	public String showHomePage(/*@ModelAttribute("userDetail") userDetails userDetail*/) {
		return "index";
		
	}
	
	@RequestMapping("/login")
	public String userLogin(@ModelAttribute("userDetail") userDetails userDetail) {
		return "loginPage";
	}
	
	@RequestMapping("/createUser")
	public String createUser(@ModelAttribute("userDetail") userDetails userDetail) {
		return "addUser";
	}
	
	@RequestMapping("/addUser")
	public ModelAndView addUser(@Valid @ModelAttribute("userDetail") userDetails userDetail, BindingResult result) {
		ModelAndView mv = null;
		if (!result.hasErrors()) {
			userDetail = airlineService.addUser(userDetail);
			mv = new ModelAndView("success");
			mv.addObject("user",userDetail);
		}
		else {
			mv = new ModelAndView("addUser","userDetail",userDetail);
		}
		return mv;
		}
		
		
	@RequestMapping(value = "/userLogin")
	public ModelAndView showUser(@Valid @ModelAttribute("userDetail") userDetails userDetail) {
		
		System.out.println("POST method");
		ModelAndView mv = new ModelAndView();
		userDetails user = new userDetails();
		user = airlineService.userLogin(userDetail.getUserName());
		System.out.println(user);
		if(user!=null) {
			mv.setViewName("viewUser");
			mv.addObject("user",user);
			System.out.println("The name is "+ user.getUserName());
		}
		else {
			String msg = "Enter a Valid UserName!!";
			mv.setViewName("myError");
			mv.addObject("msg", msg);
			System.out.println("Inside else");
		}
		return mv;
	}
}
