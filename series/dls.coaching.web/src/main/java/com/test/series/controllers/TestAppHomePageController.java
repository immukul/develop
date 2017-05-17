package com.test.series.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/app")
public class TestAppHomePageController {
	@RequestMapping(value = "/home", method = RequestMethod.GET )
	public ModelAndView homeApp() {
		System.out.println(" app controller working----" );
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/html/home.html");
		return mav;
	}
}
