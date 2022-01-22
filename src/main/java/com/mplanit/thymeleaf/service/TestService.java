package com.mplanit.thymeleaf.service;

import com.mplanit.thymeleaf.domain.TestDto;

public interface TestService {

	public TestDto select(TestDto testDto) throws Exception;
}
