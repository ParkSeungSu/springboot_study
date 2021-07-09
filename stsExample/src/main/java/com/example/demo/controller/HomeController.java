package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.SalaryModel;
import com.example.demo.service.SalaryService;

@Controller
public class HomeController {
	
	@Autowired
	SalaryService salaryService;
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView goHome(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		//salary object list
		List<SalaryModel> salaryList = salaryService.getSalary();
		
		mav.addObject("salaryList",salaryList);
		mav.setViewName("content/home.html");
		
		return mav;

	}
}