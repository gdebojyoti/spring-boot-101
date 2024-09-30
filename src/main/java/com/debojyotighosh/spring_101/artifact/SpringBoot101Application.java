package com.debojyotighosh.spring_101.artifact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot101Application implements CommandLineRunner {

	@Autowired
	DB db;

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot101Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.print(db.getData());
	}

}
