package com.example.taskl12jpa.service;

import com.example.taskl12jpa.dao.entity.BooksEntity;
import com.example.taskl12jpa.dao.repository.BooksRepository;
import com.example.taskl12jpa.model.request.CreateBooksRequest;
import com.example.taskl12jpa.model.response.BookDetailResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BooksService {
    private final BooksRepository booksRepository;

    public void saveBook(CreateBooksRequest book){
       booksRepository.save(
               BooksEntity.builder()
                       .author(book.getAuthor())
                       .bookName(book.getBookName())
                       .genre(book.getGenre())
                       .pageCount(book.getPageCount())
                       .build()
       );
    }


}
