package com.riwi.libros_ya.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riwi.libros_ya.domain.entities.BookEntity;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long>{
    
}
