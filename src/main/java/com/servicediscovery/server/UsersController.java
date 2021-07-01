package com.servicediscovery.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {

	@GetMapping
	public String getUsers() {
		return "User 1, User 2, User 3, User 4";
	}
}
