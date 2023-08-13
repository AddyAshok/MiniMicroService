package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Welcome_api;

@RestController
public class GreetApi
{ 
	@Autowired
	private Welcome_api wlcapi;
	
	@GetMapping("/greet")
	public String greetApi()
	{
		
	 String m=wlcapi.invokeWelcomeApi();
	 
	 String re="   I am fine and u?";
			 
			 return m+re;
		
	}

}
