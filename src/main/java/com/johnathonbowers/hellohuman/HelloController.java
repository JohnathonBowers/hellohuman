package com.johnathonbowers.hellohuman;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping
public class HelloController {

	@GetMapping("/")
	public String firstName(@RequestParam(value="q", required=false) String searchQuery) {
		if (searchQuery == null) {
			return "Hello human";
		} else {
			return String.format("Hello %s", searchQuery);
		}
	
	}
	
}
