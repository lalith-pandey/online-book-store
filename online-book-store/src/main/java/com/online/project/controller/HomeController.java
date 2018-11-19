package com.online.project.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.online.project.services.CategoryService;

@Controller
public class HomeController {

	@Autowired
	private CategoryService categoryService;

	@GetMapping("/categories")
	public String getCategories(Model model) {
		Map<String, List<String>> categoryMap = categoryService.getCategories();
		model.addAttribute("categoryMap", categoryMap);
		return "index";
	}
}
