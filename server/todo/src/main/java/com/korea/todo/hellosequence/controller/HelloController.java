package com.korea.todo.hellosequence.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.korea.todo.hellosequence.service.HelloService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class HelloController {
	
	private final HelloService helloService;
	
	@GetMapping("/hello")
	public String hello(@RequestParam("name")String name) {
		return helloService.getHelloMessage(name);
	}
}
