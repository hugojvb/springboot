package com.hugojvb.repository;

import com.hugojvb.model.Books;

import org.springframework.data.repository.CrudRepository;

public interface BooksRepository extends CrudRepository<Books,Integer> {
    
}