package com.mashibing.circularDependencies;
//循环依赖模拟
public class TestB {
	private TestC testC;

	public TestB(TestC testC) {
		this.testC = testC;
	}

	public TestB() {
	}

	public TestC getTestC() {
		return testC;
	}

	public void setTestC(TestC testC) {
		this.testC = testC;
	}

	public void b(){
		testC.c();
	}
}
