package org.example

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.*

@SpringBootApplication
@RestController
class DemoApplication {

	static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args)
	}

	static class Person {
		public String firstName
		public String lastName
	}

	@RequestMapping(value = "/person", produces = "application/json")
	Person index() {
		return createDefaultPerson()
	}

	private Person createDefaultPerson() {
		Person p = new Person()
		p.firstName = "Jane"
		p.lastName = "Doe"
		return p
	}
}
