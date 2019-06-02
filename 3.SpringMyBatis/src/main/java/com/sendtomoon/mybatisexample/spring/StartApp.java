package com.sendtomoon.mybatisexample.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartApp {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Test1 t1 = context.getBean(Test1.class);
		t1.test1();
		TimeMapper tm = context.getBean(TimeMapper.class);
		String str = tm.getTime();
		System.err.println(str);
		context.close();
	}

}
