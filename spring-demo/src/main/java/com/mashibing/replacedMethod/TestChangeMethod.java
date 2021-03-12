package com.mashibing.replacedMethod;

import java.util.Map;

public class TestChangeMethod {

	private String name;

	private Map<String,String> map;

	public TestChangeMethod(String name, Map<String, String> map) {
		this.name = name;
		this.map = map;
	}


	public void changeMe(){
		System.out.println("changeMe...");
	}
}
