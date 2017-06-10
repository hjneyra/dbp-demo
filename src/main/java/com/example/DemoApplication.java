package com.example;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@Controller
public class DemoApplication {

	@RequestMapping("/hello")
	@ResponseBody
	List<Person> hello() {
		return Arrays.asList(new Person(1, "Juan Perez"), new Person(2, "Carlos Castro"));
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}

class Person {
	public Integer id;
	public String name;

	public Person() {
	}

	public Person(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
}