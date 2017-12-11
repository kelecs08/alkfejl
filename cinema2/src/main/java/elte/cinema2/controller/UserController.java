package elte.cinema2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //controller + responsebody(treats the output as data, not as a view)
public class UserController {

	@RequestMapping("/") //routing
	public String helloUser() {
		return "Hello";
	}
}
