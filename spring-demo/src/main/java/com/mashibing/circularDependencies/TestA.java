package com.mashibing.circularDependencies;
//循环依赖模拟
public class TestA {
	private TestB testB;

	public TestA(TestB testB) {
		this.testB = testB;
	}

	public TestA() {
	}

	public TestB getTestB() {
		return testB;
	}

	public void setTestB(TestB testB) {
		this.testB = testB;
	}

	public void a(){
		testB.b();
	}
}
