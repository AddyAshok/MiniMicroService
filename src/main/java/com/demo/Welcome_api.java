package com.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="WELCOME-API")
public interface Welcome_api
{
   @GetMapping("/welcome")
	public String invokeWelcomeApi();
	
}
