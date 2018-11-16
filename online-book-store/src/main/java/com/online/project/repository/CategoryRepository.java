package com.online.project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.online.project.model.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {

}
