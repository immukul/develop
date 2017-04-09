package com.test.series.pojo;

public enum SubjectEnum {

	MATH("math"), REASONING("reasoning"), ENGLISH("english"), JAVA("java");

	String value;

	SubjectEnum(String value) {
		this.value = value;
	}

	public String getText() {
		return value;
	}

}
