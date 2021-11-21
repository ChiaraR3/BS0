package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/user/{nombre}")
	public String getUserByName(@PathVariable String nombre) {
		return "Hola " +nombre +"!";
	}

	@PostMapping("/useradd")
	public Person getPerson(@RequestBody Person person){
		Person fields = new Person();
		fields.setName(person.getName());
		fields.setCity(person.getCity());
		fields.setAge(person.getAge()+1);
		return fields;
	}
}

