package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habilidade")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "Atenção aos detalhes e persistência";
	}

}
