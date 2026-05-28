package com.assistprocrm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AssistProCrmApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssistProCrmApplication.class, args);
	pong();
	}
	static void pong(){
	System.out.println("pong");
}
}
