package com.sendtomoon.mybatis.baseExamples;

import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
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
			SqlSession sqlSession = sqlSessionFactory.openSession(true);
			BaseDAO dao = sqlSession.getMapper(BaseDAO.class);
			Table1DTO dto = new Table1DTO();
			dto.setId(UUID.randomUUID().toString());
			dto.setName("Test11111");
			dto.setPrice(6543.21);
			dao.add(dto);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
