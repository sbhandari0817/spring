package com.sb.springboot.demo.springapp;

import com.sb.springboot.demo.springapp.dao.StudentDAO;
import com.sb.springboot.demo.springapp.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class SpringappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringappApplication.class, args);
	}

}
