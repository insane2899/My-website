package com.soumik.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping(value= {"/","/home","/about"})
	public String index() {
		return "index.html";
	}

}