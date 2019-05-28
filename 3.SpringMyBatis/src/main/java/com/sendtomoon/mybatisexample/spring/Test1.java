package com.sendtomoon.mybatisexample.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Test1 {
	@Autowired
	TimeMapper tm;

	public void test1() {
		String str = tm.getTime();
		System.err.println(str);
	}
}
