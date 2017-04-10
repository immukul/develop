package com.test.series.pojo;

import java.util.List;

public class Questions {
	private SubjectEnum subjectEnum;
	private List<Question> questions;

	public SubjectEnum getSubjectEnum() {
		return subjectEnum;
	}

	public void setSubjectEnum(SubjectEnum subjectEnum) {
		this.subjectEnum = subjectEnum;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

}
