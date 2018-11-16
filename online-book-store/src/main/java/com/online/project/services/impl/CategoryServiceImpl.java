package com.online.project.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.project.model.Category;
import com.online.project.repository.CategoryRepository;
import com.online.project.services.CategoryService;


@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public List<Category> getCategories() {
		categoryRepository.findAll();
		return (List<Category>) categoryRepository.findAll();
	}

}
