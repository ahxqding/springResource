package com.mashibing.circularDependencies;
//循环依赖模拟
public class TestC {
	private TestA testA;

	public TestC(TestA testA) {
		this.testA = testA;
	}

	public TestC() {
	}

	public TestA getTestA() {
		return testA;
	}

	public void setTestA(TestA testA) {
		this.testA = testA;
	}

	public void c(){
		testA.a();
	}
}
