package com.doge.doge_search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DogeSearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(DogeSearchApplication.class, args);
	}

	@GetMapping("/")
	public String index(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("This is %s!", name);
	}

	@GetMapping("/qwq")
	public String test(@RequestParam(value = "name", defaultValue = "csacshcoha") String name) {
		return String.format("here is a test ???%s", name);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}
}
