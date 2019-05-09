package com.sendtomoon.mybatis.baseExamples;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * Start MyBatis from XML.
 * 
 * @author lbt42
 *
 */
public class Ex1 {

	public static void main(String[] args) {
		Ex1 ex1 = new Ex1();
		ex1.StartWitXML();
	}

	public void StartWitXML() {
		String resource = "mybatis-config.xml";
		try {
			InputStream inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			System.err.println(sqlSessionFactory.toString());

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
