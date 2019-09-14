package org.springframework.tests.sample.beans;

public class TestBeanFactory {
	public TestBean getTestBean(String name, int age) {
		return new TestBean(name, age);
	}
}
