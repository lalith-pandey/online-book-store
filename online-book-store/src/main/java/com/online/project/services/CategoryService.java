package com.online.project.services;

import java.util.List;
import java.util.Map;

import com.online.project.model.Category;

public interface CategoryService {

	public Map<String,List<String>> getCategories();

	List<Category> getCategoryByParent(Integer parent);

}
