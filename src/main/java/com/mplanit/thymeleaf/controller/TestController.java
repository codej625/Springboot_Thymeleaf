package com.mplanit.thymeleaf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mplanit.thymeleaf.domain.TestDto;
import com.mplanit.thymeleaf.service.impl.TestServiceImpl;

@RestController
public class TestController {

	private TestServiceImpl service;

	public TestController(TestServiceImpl service) {
		this.service = service;
	}

	@GetMapping("/")
	public TestDto select(TestDto testDto) throws Exception {
		testDto.set부모(1);

		testDto = service.select(testDto);
		return testDto;
	}

}