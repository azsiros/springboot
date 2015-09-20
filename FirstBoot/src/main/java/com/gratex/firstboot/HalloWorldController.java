package com.gratex.firstboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class HalloWorldController {
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello World!";
	}
	
	@RequestMapping("/menu")
	@ResponseBody
	String menu() {
		return "Dnesne menu!";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(HalloWorldController.class, args);
	}
}
