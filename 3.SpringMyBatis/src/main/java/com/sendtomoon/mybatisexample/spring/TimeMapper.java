package com.sendtomoon.mybatisexample.spring;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeMapper {
	@Select("select current_timestamp() from dual")
	String getTime();
}
