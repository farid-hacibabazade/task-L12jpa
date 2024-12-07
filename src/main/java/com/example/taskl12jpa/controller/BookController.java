package com.example.taskl12jpa.controller;

import com.example.taskl12jpa.model.request.CreateBooksRequest;
import com.example.taskl12jpa.service.BooksService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/books")
@RequiredArgsConstructor
public class BookController {
    private final BooksService booksService;

    @PostMapping
    public void bookSave(@RequestBody CreateBooksRequest book){
        booksService.saveBook(book);
    }
}
