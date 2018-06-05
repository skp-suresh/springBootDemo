package com.uaeex.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class SpringBootDemoApplication {

	@RequestMapping("/")
	@ResponseBody
	String sample() {
		return "Hello World!";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
}
