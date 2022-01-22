package com.mplanit.thymeleaf.service.impl;

import org.springframework.stereotype.Service;

import com.mplanit.thymeleaf.domain.TestDto;
import com.mplanit.thymeleaf.mapper.TestMapper;
import com.mplanit.thymeleaf.service.TestService;

@Service
public class TestServiceImpl implements TestService {

	private TestMapper userMapper;

	public TestServiceImpl(TestMapper userMapper) {
		this.userMapper = userMapper;
	}

	public TestDto select(TestDto testDto) throws Exception {
		return userMapper.select(testDto);
	}

}
