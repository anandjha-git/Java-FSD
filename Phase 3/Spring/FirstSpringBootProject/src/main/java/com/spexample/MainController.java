package com.spexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	//@RequestMapping(value="Hello", method="get")
	@GetMapping("/hello")
	public String message() {
		return "Hello World";
	}
}
