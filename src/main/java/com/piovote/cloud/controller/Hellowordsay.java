package com.piovote.cloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellowordsay {
	
	@RequestMapping("/test")
	public String welcome() {
		
		return "welcome to first application";
	}

}
