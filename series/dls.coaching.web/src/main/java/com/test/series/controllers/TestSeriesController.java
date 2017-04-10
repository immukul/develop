package com.test.series.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.test.series.pojo.Questions;
import com.test.series.pojo.SubjectEnum;


@RestController
@RequestMapping(value = "/test")
public class TestSeriesController {

	@RequestMapping(value = "/questions", method = RequestMethod.GET)
	public Questions testQuestions(@RequestParam SubjectEnum subject) {

		return null;

	}

	@RequestMapping(value = "/uploadQuestions", headers = ("content-type=multipart/*"), method = RequestMethod.POST)
	public Questions uploadQuestions(@RequestParam("file") MultipartFile inputFile) {

		return null;

	}

	@RequestMapping(value = "/result", method = RequestMethod.GET)
	public Questions testResult() {

		return null;

	}
}
