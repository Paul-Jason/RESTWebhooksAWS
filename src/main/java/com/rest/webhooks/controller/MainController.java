package com.rest.webhooks.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello world!!";
	}
	
	@PostMapping(value = "/github/webhooks")
	public String postWebhook(@RequestBody String json) {
		return json;
	}
}
