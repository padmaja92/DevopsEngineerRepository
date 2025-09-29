package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@SpringBootApplication
public class JenkinsHelloWorldPipleineApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsHelloWorldPipleineApplication.class, args);
	}

	@GetMapping("/GetWelcomePage")
	public String welcomepage() {
		return  "Welcome page with run multi agent and multi staged Jenkins project" ;
	}

}
