package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView goHome(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		List<String> resultList = new ArrayList<String>();
		resultList.add("AAA");
		resultList.add("BBB");
		resultList.add("CCC");
		resultList.add("DDD");
		resultList.add("EEE");
		resultList.add("FFF");
		mav.addObject("resultList", resultList);
		mav.setViewName("content/home");
		return mav;

	}
}
