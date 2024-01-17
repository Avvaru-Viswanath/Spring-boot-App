package com.springapp.com.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping

public class Application {

	@GetMapping("/test")
    public String hello(){
        return "welcome to springboot application";
    }

	public static void main(String[] args) {		
		SpringApplication.run(Application.class, args);		 
	}

}
