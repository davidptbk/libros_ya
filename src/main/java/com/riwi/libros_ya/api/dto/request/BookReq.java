package com.riwi.libros_ya.api.dto.request;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookReq {
    @NotBlank(message = "The title of book is required")
    @Size(max = 100, message = "The title length is 100")
    private String title;
    @NotBlank(message = "The author of book is required")
    @Size(max = 100, message = "The author length is 100")
    private String author;
    @NotNull(message = "The year of publication is required")
    @Max(value = 11, message = "The year publication length is 11")
    private Integer publicationYear;
    @NotBlank(message = "The genre of book is required")
    @Size(max = 50, message = "The genre length is 50")
    private String genre;
    @NotBlank(message = "The isbn of book is required")
    @Size(max = 20, message = "The isbn length is 20")
    private String isbn;

}
