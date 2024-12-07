package com.example.taskl12jpa.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDetailResponse {
    private String author;
    private String bookName;
    private String genre;
    private Integer pageCount;
}
