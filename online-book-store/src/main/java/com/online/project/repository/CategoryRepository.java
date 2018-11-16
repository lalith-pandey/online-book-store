package com.online.project.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.online.project.model.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {

	List<Category> findByParent(Integer parent);

}
