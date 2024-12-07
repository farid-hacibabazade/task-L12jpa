package com.example.taskl12jpa.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateBooksRequest {
    private String author;
    private String bookName;
    private String genre;
    private Integer pageCount;
}
