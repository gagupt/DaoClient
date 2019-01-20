package com.example.dao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.dao.repository")
@EntityScan("com.example.dao.entity")
public class DaoClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaoClientApplication.class, args);
	}
}
