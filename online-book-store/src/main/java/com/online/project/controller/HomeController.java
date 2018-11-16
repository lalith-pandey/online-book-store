package com.online.project.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.online.project.services.CategoryService;

@RestController
public class HomeController {

	@Autowired
	private CategoryService categoryService;

	@GetMapping("/")
	public String getHome() {
		return "Welcome to Online Book Store!!";
	}

	@GetMapping("/categories")
	public Map<String, List<String>> getCategories() {
		return categoryService.getCategories();
	}

}
