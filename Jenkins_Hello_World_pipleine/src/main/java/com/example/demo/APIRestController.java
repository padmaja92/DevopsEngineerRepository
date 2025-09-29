package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/PadmajaPractice")
public class APIRestController {

	@GetMapping("/GetWelcomePage")
	public String welcomepage() {
		return  "Welcome page for Micro service Project with Ci/CD " ;
	}

}
