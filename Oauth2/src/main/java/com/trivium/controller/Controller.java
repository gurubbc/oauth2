package com.trivium.controller;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trivium.Employees;

@RestController
public class Controller {

	ArrayList<Employees> allEmps=new ArrayList<>();
	
	public Controller() {
		Employees e1=new Employees(1, "Sreenath", 5678678.3);
		Employees e2=new Employees(1, "Sreenath", 5678678.3);
		Employees e3=new Employees(1, "Sreenath", 5678678.3);
		allEmps.add(e1);
		allEmps.add(e2);
		allEmps.add(e3);
		
	}
	
	
	@GetMapping("/")
	public String pub() {
		return "Welcome to Home";
	}
	
	@GetMapping("/employees")
	public ArrayList<Employees> hello() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

		OAuth2User oauth2User = (OAuth2User) authentication.getPrincipal();

		Map<String, Object> userAttributes = oauth2User.getAttributes();

		System.out.println(userAttributes);		


		return allEmps;
	}

	
	
	@GetMapping("/user-info")
	public Map<String, Object> getUserInfo() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

		if (authentication.getPrincipal() instanceof OAuth2User) {
			OAuth2User oauth2User = (OAuth2User) authentication.getPrincipal();

			Map<String, Object> userAttributes = oauth2User.getAttributes();

			return userAttributes;
		}

		return Map.of("message", "User not authenticated with OAuth2");
	}

}
