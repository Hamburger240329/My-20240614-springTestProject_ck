package com.ham1142.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping(value = "/home")
	
	public String hello() {
		return "hello";
	}
}

