package com.JenkinsAutomation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsAutomationApplication {
	@GetMapping
	public String message() {
		return "welcome to jenkins";
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinsAutomationApplication.class, args);
	}

}
