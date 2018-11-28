package com.online.project.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.online.project.model.Book;
import com.online.project.model.Category;
import com.online.project.services.CategoryService;

@Controller
public class HomeController {

	@Autowired
	private CategoryService categoryService;

	@GetMapping("/")
	public String getHome(Model model, HttpServletRequest request) {
		Map<Category,List<Book>> allBooks = getAllBooksByCategory();
		Map<String, List<Category>> categoryMap = getCategoryMap();
		request.getSession().setAttribute("categoryMap", categoryMap);
		model.addAttribute("categoryMap", categoryMap);
		model.addAttribute("allBooks", allBooks);
		return "index";
	}

	@SuppressWarnings("unchecked")
	@GetMapping("/books")
	public String getListOfBooks(@RequestParam(name = "parent") String parent, Model model,
			HttpServletRequest request) {
		List<Book> books = categoryService.getBooksById(Integer.parseInt(parent));

		Map<String, List<Category>> categoryMap = request.getSession().getAttribute("categoryMap") != null
				? (Map<String, List<Category>>) request.getSession().getAttribute("categoryMap")
				: getCategoryMap();

		model.addAttribute("categoryMap", categoryMap);
		model.addAttribute("booksList", books);
		return "index";
	}

	private Map<String, List<Category>> getCategoryMap() {
		Map<String, List<Category>> categoryMap = categoryService.getCategories();
		return categoryMap;
	}
	
	private Map<Category,List<Book>> getAllBooksByCategory(){
		Map<Category, List<Book>> getAllBooksByCategory = categoryService.getAllBooksByCategory();
		return getAllBooksByCategory;
	}
	
}
