package com.lmy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmy.config.PropertyConfig;
import com.lmy.entity.Person;

@RestController
public class HelloController {
	
	@Autowired
	private Person person;

	@Autowired
	private PropertyConfig propertyConfig;
	
	@GetMapping("xml")
	public Object xml() {
		
		return person;
	}

	@GetMapping("property")
	public Object property() {
		
		return propertyConfig.toString();
	}
}
