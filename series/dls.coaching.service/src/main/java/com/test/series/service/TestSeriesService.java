package com.test.series.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.test.series.pojo.Options;
import com.test.series.pojo.Question;
import com.test.series.pojo.Questions;
import com.test.series.service.inter.ITestSeriesService;

@Component
public class TestSeriesService implements ITestSeriesService {

	@Autowired
	private ServletContext context;

	public Questions getTestQuestions(String subject) {
		Questions questions = new Questions();
		if (subject == null) {
			questions.setErrorMsg("No subject given for test");
			return questions;
		}
		List<Question> questionList = new ArrayList<Question>();
		Question question = new Question ();
		Options options = new Options(); 
		Question question1 = new Question ();
		Options options1 = new Options(); 
		options.setOption1("Programming Language");
		options.setOption1("Car");
		options.setOption1("Coffee");
		options.setOption1("Country");
		question.setQuestionText("What is Java?");
		question.setOptions(options);
		
		options1.setOption1("Programming Language");
		options1.setOption1("Car");
		options1.setOption1("Coffee");
		options1.setOption1("Country");
		question.setQuestionText("What is Java?");
		question1.setOptions(options1);
		questionList.add(question);
		questionList.add(question1);
		questions.setQuestions(questionList);
		return questions;
	}

	public String uploadQuestions(MultipartFile inputFile) {
		HttpHeaders headers = new HttpHeaders();
		if (!inputFile.isEmpty()) {
			try {
				String originalFilename = inputFile.getOriginalFilename();
				File destinationFile = new File(
						context.getRealPath("/src/main/resources/questionExcel") + File.separator + originalFilename);
				inputFile.transferTo(destinationFile);
				headers.add("File Uploaded Successfully - ", originalFilename);
				return "File Uploaded Successfully - ";
			} catch (Exception exception) {
				exception.printStackTrace();
			}
		}
		return "Error";
	}

}
