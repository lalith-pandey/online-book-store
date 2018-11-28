package com.online.project.services.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.project.model.Book;
import com.online.project.model.Category;
import com.online.project.repository.BookRepository;
import com.online.project.repository.CategoryRepository;
import com.online.project.services.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private BookRepository bookRepository;

	@Override
	public Map<String, List<Category>> getCategories() {
		Map<String, List<Category>> categoryMap = new HashMap<String, List<Category>>();
		List<Category> categoryList = (List<Category>) categoryRepository.findAll();

		Map<Integer, String> catMap = new HashMap<Integer, String>();

		catMap = categoryList.stream().filter(category -> null == category.getParent())
				.collect(Collectors.toMap(Category::getCatId, Category::getName));

		for (Entry<Integer, String> entry : catMap.entrySet()) {
			List<Category> subCategoryList = getCategoryByParent(entry.getKey());
			categoryMap.put(entry.getValue(),
					subCategoryList.stream().map(n -> n).collect(Collectors.toList()));
		}
		return categoryMap;
	}

	@Override
	public List<Category> getCategoryByParent(Integer parent) {
		return categoryRepository.findByParent(parent);
	}

	@Override
	public List<Book> getBooksById(int parent) {
		
		return bookRepository.getBooksById(parent);
	}
	
	@Override
	public Map<Category, List<Book>> getAllBooksByCategory() {
		Map<Category, List<Book>> getAllBooksByCategory = new HashMap<Category, List<Book>>();
		
		return getAllBooksByCategory;
	}

}
