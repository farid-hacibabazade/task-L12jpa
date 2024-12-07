package com.example.taskl12jpa.dao.repository;

import com.example.taskl12jpa.dao.entity.BooksEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<BooksEntity, Long> {
}
