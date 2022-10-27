package com.web.resume.repository;

import org.springframework.data.repository.CrudRepository;

import com.web.resume.models.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{

}
