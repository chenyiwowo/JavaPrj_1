package com.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;

public class SimpleBean implements InitializingBean, BeanFactoryAware,BeanNameAware {
	private String beanName;
	private int age;
	private String name;
	
	public SimpleBean() {
		System.out.println("默认构造方法---Spring实例化bean");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "SimpleBean [age=" + age + ", name=" + name + "]";
	}

	@Override
	public void setBeanName(String beanName) {
		// TODO Auto-generated method stub
		this.beanName = beanName;
		System.out.println("回调setBeanName方法："+beanName);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(beanName+"初始化，调用afterPropertiesSet()");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("获得容器"+beanFactory);
	}

}
