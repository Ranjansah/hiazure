package com.spring.azure;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@RequestMapping("/hi")
	public String hi()
	{

		return "Hey This is Azure Demo Program";
	}

}
