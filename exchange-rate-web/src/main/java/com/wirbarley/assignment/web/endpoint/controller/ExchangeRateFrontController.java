package com.wirbarley.assignment.web.endpoint.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExchangeRateFrontController {

	@GetMapping("/")
	public String home() {

		return "index";
	}
}
