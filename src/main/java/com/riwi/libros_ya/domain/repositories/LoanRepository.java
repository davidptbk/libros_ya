package com.riwi.libros_ya.domain.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riwi.libros_ya.domain.entities.LoanEntity;

@Repository
public interface LoanRepository extends JpaRepository<LoanEntity, Long> {
    Page<LoanEntity> finByUserEntity(Long id, PageRequest pagination);
}
