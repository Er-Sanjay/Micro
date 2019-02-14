package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@Value("${spring.message}")
	private String message;
	@RequestMapping(value="/hi",method=RequestMethod.GET)
	public String getName() {
		
	return "Hey Sanjay!"+message;
	}

}
