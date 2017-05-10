package com.test.series.pojo;

import java.util.List;

public class Questions {
	private SubjectEnum subjectEnum;
	private List<Question> questions;
	private String errorMsg;
	private String code;

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

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

	@Override
	public String toString() {
		return "Questions [subjectEnum=" + subjectEnum + ", questions=" + questions + ", errorMsg=" + errorMsg
				+ ", code=" + code + "]";
	}

}
