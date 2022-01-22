package com.mplanit.thymeleaf.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.mplanit.thymeleaf.domain.TestDto;

@Mapper
@Repository
public interface TestMapper {

	public TestDto select(TestDto testDto);
}
