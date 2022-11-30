package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
	
@RequestMapping("/")
	   public String hello() {
	        return "Hello World, Spring Boot!";
	    }

@RequestMapping("/welcome")
public String welcome() {
     return "Welcome user in spring boot world!";
 }



}
