package com.test.series.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/app")
public class TestAppHomePageController {

	@RequestMapping(value = "/application", method = RequestMethod.GET )
	public String testApplication() {
		System.out.println(" app controller working----" );
		ModelAndView mav = new ModelAndView();
		mav.setViewName("NewFile");
		return "NewFile";
	}
	
}
