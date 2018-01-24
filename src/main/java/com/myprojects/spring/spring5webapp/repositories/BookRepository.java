package com.myprojects.spring.spring5webapp.repositories;

import com.myprojects.spring.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
