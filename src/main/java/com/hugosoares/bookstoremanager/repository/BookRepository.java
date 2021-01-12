package com.hugosoares.bookstoremanager.repository;

import com.hugosoares.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
