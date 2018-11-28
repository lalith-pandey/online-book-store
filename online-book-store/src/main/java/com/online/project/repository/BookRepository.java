package com.online.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.online.project.model.Book;
import org.springframework.data.repository.query.Param;

public interface BookRepository extends CrudRepository<Book, Integer>{
	
	@Query("SELECT b FROM Book b WHERE b.cat_id= :parentId")
	List<Book> getBooksById(@Param(value = "parentId") int parent);
}
