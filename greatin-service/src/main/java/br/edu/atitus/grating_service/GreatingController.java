package br.edu.atitus.grating_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("greatin-service")
public class GreatingController {
	
	@GetMapping
	public String getGreatin() {
		return  ("Hello World!");
	}

}
