package com.bitemii.service.bookdemo;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.bitemii.service.bookdemo.Book;
public interface ReadingListRepository extends JpaRepository<Book, Long> {
List<Book> findByReader(String reader);
}

