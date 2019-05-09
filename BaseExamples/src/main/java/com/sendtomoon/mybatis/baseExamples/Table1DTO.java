package com.sendtomoon.mybatis.baseExamples;

import java.io.Serializable;
import java.sql.Date;

public class Table1DTO implements Serializable {

	private static final long serialVersionUID = -3356317635685476402L;

	private String id;
	private String name;
	private Double price;
	private Date createdDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

}
