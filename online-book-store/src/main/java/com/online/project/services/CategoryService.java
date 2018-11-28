package com.online.project.services;

import java.util.List;
import java.util.Map;

import com.online.project.model.Book;
import com.online.project.model.Category;

public interface CategoryService {

	public Map<String, List<Category>> getCategories();

	List<Category> getCategoryByParent(Integer parent);
	
	//GET LIST OF BOOKS BY PARENTID
	public List<Book> getBooksById(int parent);
	public Map<Category,List<Book>> getAllBooksByCategory();
}
