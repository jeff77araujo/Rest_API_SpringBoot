package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/semana")
public class HelloController2 {
	
	@GetMapping
	public String hello() {
		return "trabalho em equipe e atenção aos detalhes";
	}

}
