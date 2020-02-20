package org.springframework.tests.sample.beans;

import org.springframework.beans.factory.FactoryBean;

public class TestFactoryBean implements FactoryBean<TestBean> {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public TestBean getObject() throws Exception {
		return new TestBean(name, age);
	}

	@Override
	public Class<?> getObjectType() {
		return TestBean.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
