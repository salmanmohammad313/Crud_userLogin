package com.LoginApp;

import com.LoginApp.dto.User;
import com.LoginApp.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoginAppApplication {

	@Autowired
	UserRepository repo;


	public static void main(String[] args) {
		SpringApplication.run(LoginAppApplication.class, args);

	}

}
//maven
//