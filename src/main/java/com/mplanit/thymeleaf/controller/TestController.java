package com.mplanit.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mplanit.thymeleaf.domain.TestDto;
import com.mplanit.thymeleaf.service.impl.TestServiceImpl;

@Controller
public class TestController {

	private TestServiceImpl service;

	public TestController(TestServiceImpl service) {
		this.service = service;
	}

	@GetMapping("/")
	public String select(TestDto testDto, Model model) throws Exception {

		testDto.setFirst_column(1);
		testDto = service.select(testDto);
		model.addAttribute("test", testDto);
		return "test";
	}

}