package com.example.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitApplication.class, args);


		System.out.println("written in branch master");
		System.out.println("sop statement in master");


		System.out.println("written in branch surya");
		System.out.println("another line in surya updated");

	}

}
