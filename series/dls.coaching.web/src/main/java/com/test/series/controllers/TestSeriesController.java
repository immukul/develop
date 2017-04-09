package com.test.series.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.series.pojo.Questions;
import com.test.series.pojo.SubjectEnum;

@Controller
@Path(value="/test")
public class TestSeriesController {

	@Path(value = "/testQuestions")
	@GET
	public Questions testQuestions(@RequestParam SubjectEnum subject){
		return null;
		
	}
	
	
	
}
