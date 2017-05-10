package com.test.series.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.test.series.pojo.Questions;
import com.test.series.service.TestSeriesService;

@RestController
@RequestMapping(value = "/test")
public class TestSeriesController {

	@Autowired
	private TestSeriesService testQuestionService;

	@RequestMapping(value = "/questions/{subject}", method = RequestMethod.GET )
	public @ResponseBody String testQuestions(@PathVariable String subject) {
		System.out.println("working----" + subject);
		Questions question = testQuestionService.getTestQuestions(subject);
		return new Gson().toJson(question);
	}

	@RequestMapping(value = "/uploadQuestions", headers = ("content-type=multipart/*"), method = RequestMethod.POST)
	public String uploadQuestions(@RequestParam("file") MultipartFile inputFile) {
		return testQuestionService.uploadQuestions(inputFile);
	}

	@RequestMapping(value = "/result", method = RequestMethod.GET)
	public Questions testResult() {
		System.out.println("working");
		return null;

	}
}
