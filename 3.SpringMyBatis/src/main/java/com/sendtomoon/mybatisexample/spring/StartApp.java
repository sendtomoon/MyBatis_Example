package com.sendtomoon.mybatisexample.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartApp {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		TimeMapper tm = context.getBean(TimeMapper.class);
		String str = tm.getTime();
		System.err.println(str);
	}

	private void test1() {

	}
}
