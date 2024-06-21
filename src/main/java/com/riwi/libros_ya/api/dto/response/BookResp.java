package com.riwi.libros_ya.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class BookResp {
    private long id;
    private String title;
    private String author;
    private Integer publicationYear;
    private String genre;
    private String isbn;
}
