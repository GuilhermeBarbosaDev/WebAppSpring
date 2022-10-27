package com.web.resume.repository;

import org.springframework.data.repository.CrudRepository;

import com.web.resume.models.Book;

public interface BookRepository extends CrudRepository<Book,Long>{

}
